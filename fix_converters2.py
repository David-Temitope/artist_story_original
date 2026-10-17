import re

with open('app/src/main/java/com/example/data/GameStateEntity.kt', 'r') as f:
    text = f.read()

business_converter = """
    @TypeConverter
    fun fromBusinessVentureList(value: List<BusinessVenture>?): String {
        return value?.let { moshi.adapter<List<BusinessVenture>>(Types.newParameterizedType(List::class.java, BusinessVenture::class.java)).toJson(it) } ?: "[]"
    }
    @TypeConverter
    fun toBusinessVentureList(value: String?): List<BusinessVenture> {
        return value?.let { moshi.adapter<List<BusinessVenture>>(Types.newParameterizedType(List::class.java, BusinessVenture::class.java)).fromJson(it) } ?: emptyList()
    }
"""
text = text.replace('class Converters {', 'class Converters {\n' + business_converter)

with open('app/src/main/java/com/example/data/GameStateEntity.kt', 'w') as f:
    f.write(text)

