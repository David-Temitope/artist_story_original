import re

with open("app/src/main/java/com/example/data/GameStateEntity.kt", "r") as f:
    code = f.read()

target = """    @Embedded val banking: BankingState = BankingState(),
    @Embedded val sentiment: SocialSentimentState = SocialSentimentState()
) {"""

replacement = """    @Embedded val banking: BankingState = BankingState(),
    @Embedded val sentiment: SocialSentimentState = SocialSentimentState(),
    val capitalClubMembers: List<CapitalClubMember> = emptyList(),
    val isPhoneLocked: Boolean = false,
    val phonePin: String? = null
) {"""

if target in code:
    code = code.replace(target, replacement)
    
target_converters = """    @TypeConverter
    fun fromWorldHistoryEntryList(value: List<WorldHistoryEntry>?): String = try {"""

replacement_converters = """    @TypeConverter
    fun fromCapitalClubMemberList(value: List<CapitalClubMember>?): String = try {
        moshi.adapter<List<CapitalClubMember>>(Types.newParameterizedType(List::class.java, CapitalClubMember::class.java)).toJson(value ?: emptyList())
    } catch (e: Throwable) { "[]" }

    @TypeConverter
    fun toCapitalClubMemberList(value: String?): List<CapitalClubMember> = try {
        if (value.isNullOrBlank() || value == "null") emptyList()
        else moshi.adapter<List<CapitalClubMember>>(Types.newParameterizedType(List::class.java, CapitalClubMember::class.java)).fromJson(value) ?: emptyList()
    } catch (e: Throwable) { emptyList() }

    @TypeConverter
    fun fromWorldHistoryEntryList(value: List<WorldHistoryEntry>?): String = try {"""

if target_converters in code:
    code = code.replace(target_converters, replacement_converters)

with open("app/src/main/java/com/example/data/GameStateEntity.kt", "w") as f:
    f.write(code)
print("Patched GameStateEntity.kt")
