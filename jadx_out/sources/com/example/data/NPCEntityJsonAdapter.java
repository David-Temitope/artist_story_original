package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: NPCEntityJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\t\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00170\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n��¨\u0006%"}, d2 = {"Lcom/example/data/NPCEntityJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/NPCEntity;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "floatAdapter", "", "longAdapter", "", "booleanAdapter", "", "doubleAdapter", "", "intAdapter", "", "nullableStringAdapter", "listOfNPCMemoryAdapter", "", "Lcom/example/data/NPCMemory;", "listOfStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nNPCEntityJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NPCEntityJsonAdapter.kt\ncom/example/data/NPCEntityJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,915:1\n1#2:916\n*E\n"})
/* loaded from: NPCEntityJsonAdapter.class */
public final class NPCEntityJsonAdapter extends JsonAdapter<NPCEntity> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @NotNull
    private final JsonAdapter<List<NPCMemory>> listOfNPCMemoryAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @Nullable
    private volatile Constructor<NPCEntity> constructorRef;
    public static final int $stable = 8;

    public NPCEntityJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "popularity", "influence", "fans", "isOnTour", "weeklySales", "bestSongTitle", "bestSongRating", "bestSongStreams", "age", "personality", "confidence", "creativity", "businessIntel", "genrePreference", "wealth", "stress", "mentalHealth", "happiness", "relationshipWithPlayer", "isRetired", "currentRecordLabel", "managerName", "careerGoal", "integrity", "generosity", "pride", "humility", "loyalty", "trust", "jealousy", "greed", "ego", "patience", "emotionalIntel", "discipline", "curiosity", "leadership", "wisdom", "compassion", "forgiveness", "gratitude", "courage", "stressTolerance", "riskTolerance", "workEthic", "adaptability", "selfAwareness", "strength", "weakness", "coreFear", "coreDream", "emotionalState", "communicationStyle", "decisionStyle", "memories", "professionalRespect", "personalTrust", "creativeRespect", "leadershipRespect", "competenceOpinion", "businessTrust", "financialTrust", "leadershipTrust", "confidentiality", "reliability", "publicReputation", "networks", "lifeEvents", "latestSelfReflection", "isFollowedByPlayer"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "popularity");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
        JsonAdapter<Long> adapter3 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "fans");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.longAdapter = adapter3;
        JsonAdapter<Boolean> adapter4 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isOnTour");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.booleanAdapter = adapter4;
        JsonAdapter<Double> adapter5 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "weeklySales");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.doubleAdapter = adapter5;
        JsonAdapter<Integer> adapter6 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "age");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.intAdapter = adapter6;
        JsonAdapter<String> adapter7 = moshi.adapter(String.class, SetsKt.emptySet(), "currentRecordLabel");
        Intrinsics.checkNotNullExpressionValue(adapter7, "adapter(...)");
        this.nullableStringAdapter = adapter7;
        JsonAdapter<List<NPCMemory>> adapter8 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{NPCMemory.class}), SetsKt.emptySet(), "memories");
        Intrinsics.checkNotNullExpressionValue(adapter8, "adapter(...)");
        this.listOfNPCMemoryAdapter = adapter8;
        JsonAdapter<List<String>> adapter9 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "networks");
        Intrinsics.checkNotNullExpressionValue(adapter9, "adapter(...)");
        this.listOfStringAdapter = adapter9;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(").append("NPCEntity").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public NPCEntity m123fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        Float popularity = null;
        Float influence = null;
        Long fans = null;
        Boolean isOnTour = false;
        Double weeklySales = Double.valueOf(0.0d);
        String bestSongTitle = null;
        Float bestSongRating = Float.valueOf(0.0f);
        Long bestSongStreams = 0L;
        Integer age = 0;
        String personality = null;
        Float confidence = Float.valueOf(0.0f);
        Float creativity = Float.valueOf(0.0f);
        Float businessIntel = Float.valueOf(0.0f);
        String genrePreference = null;
        Double wealth = Double.valueOf(0.0d);
        Float stress = Float.valueOf(0.0f);
        Float mentalHealth = Float.valueOf(0.0f);
        Float happiness = Float.valueOf(0.0f);
        Float relationshipWithPlayer = Float.valueOf(0.0f);
        Boolean isRetired = false;
        String currentRecordLabel = null;
        String managerName = null;
        String careerGoal = null;
        Float integrity = Float.valueOf(0.0f);
        Float generosity = Float.valueOf(0.0f);
        Float pride = Float.valueOf(0.0f);
        Float humility = Float.valueOf(0.0f);
        Float loyalty = Float.valueOf(0.0f);
        Float trust = Float.valueOf(0.0f);
        Float jealousy = Float.valueOf(0.0f);
        Float greed = Float.valueOf(0.0f);
        Float ego = Float.valueOf(0.0f);
        Float patience = Float.valueOf(0.0f);
        Float emotionalIntel = Float.valueOf(0.0f);
        Float discipline = Float.valueOf(0.0f);
        Float curiosity = Float.valueOf(0.0f);
        Float leadership = Float.valueOf(0.0f);
        Float wisdom = Float.valueOf(0.0f);
        Float compassion = Float.valueOf(0.0f);
        Float forgiveness = Float.valueOf(0.0f);
        Float gratitude = Float.valueOf(0.0f);
        Float courage = Float.valueOf(0.0f);
        Float stressTolerance = Float.valueOf(0.0f);
        Float riskTolerance = Float.valueOf(0.0f);
        Float workEthic = Float.valueOf(0.0f);
        Float adaptability = Float.valueOf(0.0f);
        Float selfAwareness = Float.valueOf(0.0f);
        String strength = null;
        String weakness = null;
        String coreFear = null;
        String coreDream = null;
        String emotionalState = null;
        String communicationStyle = null;
        String decisionStyle = null;
        List memories = null;
        Float professionalRespect = Float.valueOf(0.0f);
        Float personalTrust = Float.valueOf(0.0f);
        Float creativeRespect = Float.valueOf(0.0f);
        Float leadershipRespect = Float.valueOf(0.0f);
        Float competenceOpinion = Float.valueOf(0.0f);
        Float businessTrust = Float.valueOf(0.0f);
        Float financialTrust = Float.valueOf(0.0f);
        Float leadershipTrust = Float.valueOf(0.0f);
        Float confidentiality = Float.valueOf(0.0f);
        Float reliability = Float.valueOf(0.0f);
        Float publicReputation = Float.valueOf(0.0f);
        List networks = null;
        List lifeEvents = null;
        String latestSelfReflection = null;
        Boolean isFollowedByPlayer = false;
        int mask0 = -1;
        int mask1 = -1;
        int mask2 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    String str = (String) this.stringAdapter.fromJson(reader);
                    if (str != null) {
                        id = str;
                        break;
                    } else {
                        throw Util.unexpectedNull("id", "id", reader);
                    }
                case 1:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        name = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("name", "name", reader);
                    }
                case 2:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        popularity = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("popularity", "popularity", reader);
                    }
                case 3:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        influence = f2;
                        break;
                    } else {
                        throw Util.unexpectedNull("influence", "influence", reader);
                    }
                case 4:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        fans = l;
                        break;
                    } else {
                        throw Util.unexpectedNull("fans", "fans", reader);
                    }
                case 5:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isOnTour = bool;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("isOnTour", "isOnTour", reader);
                    }
                case 6:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        weeklySales = d;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklySales", "weeklySales", reader);
                    }
                case 7:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        bestSongTitle = str3;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("bestSongTitle", "bestSongTitle", reader);
                    }
                case 8:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 != null) {
                        bestSongRating = f3;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("bestSongRating", "bestSongRating", reader);
                    }
                case 9:
                    Long l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 != null) {
                        bestSongStreams = l2;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("bestSongStreams", "bestSongStreams", reader);
                    }
                case 10:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        age = num;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("age", "age", reader);
                    }
                case 11:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        personality = str4;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("personality", "personality", reader);
                    }
                case 12:
                    Float f4 = (Float) this.floatAdapter.fromJson(reader);
                    if (f4 != null) {
                        confidence = f4;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("confidence", "confidence", reader);
                    }
                case 13:
                    Float f5 = (Float) this.floatAdapter.fromJson(reader);
                    if (f5 != null) {
                        creativity = f5;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("creativity", "creativity", reader);
                    }
                case 14:
                    Float f6 = (Float) this.floatAdapter.fromJson(reader);
                    if (f6 != null) {
                        businessIntel = f6;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("businessIntel", "businessIntel", reader);
                    }
                case 15:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        genrePreference = str5;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("genrePreference", "genrePreference", reader);
                    }
                case 16:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        wealth = d2;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("wealth", "wealth", reader);
                    }
                case 17:
                    Float f7 = (Float) this.floatAdapter.fromJson(reader);
                    if (f7 != null) {
                        stress = f7;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("stress", "stress", reader);
                    }
                case 18:
                    Float f8 = (Float) this.floatAdapter.fromJson(reader);
                    if (f8 != null) {
                        mentalHealth = f8;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("mentalHealth", "mentalHealth", reader);
                    }
                case 19:
                    Float f9 = (Float) this.floatAdapter.fromJson(reader);
                    if (f9 != null) {
                        happiness = f9;
                        mask0 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("happiness", "happiness", reader);
                    }
                case 20:
                    Float f10 = (Float) this.floatAdapter.fromJson(reader);
                    if (f10 != null) {
                        relationshipWithPlayer = f10;
                        mask0 &= -1048577;
                        break;
                    } else {
                        throw Util.unexpectedNull("relationshipWithPlayer", "relationshipWithPlayer", reader);
                    }
                case 21:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        isRetired = bool2;
                        mask0 &= -2097153;
                        break;
                    } else {
                        throw Util.unexpectedNull("isRetired", "isRetired", reader);
                    }
                case 22:
                    currentRecordLabel = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -4194305;
                    break;
                case 23:
                    managerName = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -8388609;
                    break;
                case 24:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        careerGoal = str6;
                        mask0 &= -16777217;
                        break;
                    } else {
                        throw Util.unexpectedNull("careerGoal", "careerGoal", reader);
                    }
                case 25:
                    Float f11 = (Float) this.floatAdapter.fromJson(reader);
                    if (f11 != null) {
                        integrity = f11;
                        mask0 &= -33554433;
                        break;
                    } else {
                        throw Util.unexpectedNull("integrity", "integrity", reader);
                    }
                case 26:
                    Float f12 = (Float) this.floatAdapter.fromJson(reader);
                    if (f12 != null) {
                        generosity = f12;
                        mask0 &= -67108865;
                        break;
                    } else {
                        throw Util.unexpectedNull("generosity", "generosity", reader);
                    }
                case 27:
                    Float f13 = (Float) this.floatAdapter.fromJson(reader);
                    if (f13 != null) {
                        pride = f13;
                        mask0 &= -134217729;
                        break;
                    } else {
                        throw Util.unexpectedNull("pride", "pride", reader);
                    }
                case 28:
                    Float f14 = (Float) this.floatAdapter.fromJson(reader);
                    if (f14 != null) {
                        humility = f14;
                        mask0 &= -268435457;
                        break;
                    } else {
                        throw Util.unexpectedNull("humility", "humility", reader);
                    }
                case 29:
                    Float f15 = (Float) this.floatAdapter.fromJson(reader);
                    if (f15 != null) {
                        loyalty = f15;
                        mask0 &= -536870913;
                        break;
                    } else {
                        throw Util.unexpectedNull("loyalty", "loyalty", reader);
                    }
                case 30:
                    Float f16 = (Float) this.floatAdapter.fromJson(reader);
                    if (f16 != null) {
                        trust = f16;
                        mask0 &= -1073741825;
                        break;
                    } else {
                        throw Util.unexpectedNull("trust", "trust", reader);
                    }
                case 31:
                    Float f17 = (Float) this.floatAdapter.fromJson(reader);
                    if (f17 != null) {
                        jealousy = f17;
                        mask0 &= Integer.MAX_VALUE;
                        break;
                    } else {
                        throw Util.unexpectedNull("jealousy", "jealousy", reader);
                    }
                case 32:
                    Float f18 = (Float) this.floatAdapter.fromJson(reader);
                    if (f18 != null) {
                        greed = f18;
                        mask1 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("greed", "greed", reader);
                    }
                case 33:
                    Float f19 = (Float) this.floatAdapter.fromJson(reader);
                    if (f19 != null) {
                        ego = f19;
                        mask1 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("ego", "ego", reader);
                    }
                case 34:
                    Float f20 = (Float) this.floatAdapter.fromJson(reader);
                    if (f20 != null) {
                        patience = f20;
                        mask1 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("patience", "patience", reader);
                    }
                case 35:
                    Float f21 = (Float) this.floatAdapter.fromJson(reader);
                    if (f21 != null) {
                        emotionalIntel = f21;
                        mask1 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("emotionalIntel", "emotionalIntel", reader);
                    }
                case 36:
                    Float f22 = (Float) this.floatAdapter.fromJson(reader);
                    if (f22 != null) {
                        discipline = f22;
                        mask1 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("discipline", "discipline", reader);
                    }
                case 37:
                    Float f23 = (Float) this.floatAdapter.fromJson(reader);
                    if (f23 != null) {
                        curiosity = f23;
                        mask1 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("curiosity", "curiosity", reader);
                    }
                case 38:
                    Float f24 = (Float) this.floatAdapter.fromJson(reader);
                    if (f24 != null) {
                        leadership = f24;
                        mask1 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("leadership", "leadership", reader);
                    }
                case 39:
                    Float f25 = (Float) this.floatAdapter.fromJson(reader);
                    if (f25 != null) {
                        wisdom = f25;
                        mask1 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("wisdom", "wisdom", reader);
                    }
                case 40:
                    Float f26 = (Float) this.floatAdapter.fromJson(reader);
                    if (f26 != null) {
                        compassion = f26;
                        mask1 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("compassion", "compassion", reader);
                    }
                case 41:
                    Float f27 = (Float) this.floatAdapter.fromJson(reader);
                    if (f27 != null) {
                        forgiveness = f27;
                        mask1 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("forgiveness", "forgiveness", reader);
                    }
                case 42:
                    Float f28 = (Float) this.floatAdapter.fromJson(reader);
                    if (f28 != null) {
                        gratitude = f28;
                        mask1 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("gratitude", "gratitude", reader);
                    }
                case 43:
                    Float f29 = (Float) this.floatAdapter.fromJson(reader);
                    if (f29 != null) {
                        courage = f29;
                        mask1 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("courage", "courage", reader);
                    }
                case 44:
                    Float f30 = (Float) this.floatAdapter.fromJson(reader);
                    if (f30 != null) {
                        stressTolerance = f30;
                        mask1 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("stressTolerance", "stressTolerance", reader);
                    }
                case 45:
                    Float f31 = (Float) this.floatAdapter.fromJson(reader);
                    if (f31 != null) {
                        riskTolerance = f31;
                        mask1 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("riskTolerance", "riskTolerance", reader);
                    }
                case 46:
                    Float f32 = (Float) this.floatAdapter.fromJson(reader);
                    if (f32 != null) {
                        workEthic = f32;
                        mask1 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("workEthic", "workEthic", reader);
                    }
                case 47:
                    Float f33 = (Float) this.floatAdapter.fromJson(reader);
                    if (f33 != null) {
                        adaptability = f33;
                        mask1 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("adaptability", "adaptability", reader);
                    }
                case 48:
                    Float f34 = (Float) this.floatAdapter.fromJson(reader);
                    if (f34 != null) {
                        selfAwareness = f34;
                        mask1 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("selfAwareness", "selfAwareness", reader);
                    }
                case 49:
                    String str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 != null) {
                        strength = str7;
                        mask1 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("strength", "strength", reader);
                    }
                case 50:
                    String str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 != null) {
                        weakness = str8;
                        mask1 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("weakness", "weakness", reader);
                    }
                case 51:
                    String str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 != null) {
                        coreFear = str9;
                        mask1 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("coreFear", "coreFear", reader);
                    }
                case 52:
                    String str10 = (String) this.stringAdapter.fromJson(reader);
                    if (str10 != null) {
                        coreDream = str10;
                        mask1 &= -1048577;
                        break;
                    } else {
                        throw Util.unexpectedNull("coreDream", "coreDream", reader);
                    }
                case 53:
                    String str11 = (String) this.stringAdapter.fromJson(reader);
                    if (str11 != null) {
                        emotionalState = str11;
                        mask1 &= -2097153;
                        break;
                    } else {
                        throw Util.unexpectedNull("emotionalState", "emotionalState", reader);
                    }
                case 54:
                    String str12 = (String) this.stringAdapter.fromJson(reader);
                    if (str12 != null) {
                        communicationStyle = str12;
                        mask1 &= -4194305;
                        break;
                    } else {
                        throw Util.unexpectedNull("communicationStyle", "communicationStyle", reader);
                    }
                case 55:
                    String str13 = (String) this.stringAdapter.fromJson(reader);
                    if (str13 != null) {
                        decisionStyle = str13;
                        mask1 &= -8388609;
                        break;
                    } else {
                        throw Util.unexpectedNull("decisionStyle", "decisionStyle", reader);
                    }
                case 56:
                    List list = (List) this.listOfNPCMemoryAdapter.fromJson(reader);
                    if (list != null) {
                        memories = list;
                        mask1 &= -16777217;
                        break;
                    } else {
                        throw Util.unexpectedNull("memories", "memories", reader);
                    }
                case 57:
                    Float f35 = (Float) this.floatAdapter.fromJson(reader);
                    if (f35 != null) {
                        professionalRespect = f35;
                        mask1 &= -33554433;
                        break;
                    } else {
                        throw Util.unexpectedNull("professionalRespect", "professionalRespect", reader);
                    }
                case 58:
                    Float f36 = (Float) this.floatAdapter.fromJson(reader);
                    if (f36 != null) {
                        personalTrust = f36;
                        mask1 &= -67108865;
                        break;
                    } else {
                        throw Util.unexpectedNull("personalTrust", "personalTrust", reader);
                    }
                case 59:
                    Float f37 = (Float) this.floatAdapter.fromJson(reader);
                    if (f37 != null) {
                        creativeRespect = f37;
                        mask1 &= -134217729;
                        break;
                    } else {
                        throw Util.unexpectedNull("creativeRespect", "creativeRespect", reader);
                    }
                case 60:
                    Float f38 = (Float) this.floatAdapter.fromJson(reader);
                    if (f38 != null) {
                        leadershipRespect = f38;
                        mask1 &= -268435457;
                        break;
                    } else {
                        throw Util.unexpectedNull("leadershipRespect", "leadershipRespect", reader);
                    }
                case 61:
                    Float f39 = (Float) this.floatAdapter.fromJson(reader);
                    if (f39 != null) {
                        competenceOpinion = f39;
                        mask1 &= -536870913;
                        break;
                    } else {
                        throw Util.unexpectedNull("competenceOpinion", "competenceOpinion", reader);
                    }
                case 62:
                    Float f40 = (Float) this.floatAdapter.fromJson(reader);
                    if (f40 != null) {
                        businessTrust = f40;
                        mask1 &= -1073741825;
                        break;
                    } else {
                        throw Util.unexpectedNull("businessTrust", "businessTrust", reader);
                    }
                case 63:
                    Float f41 = (Float) this.floatAdapter.fromJson(reader);
                    if (f41 != null) {
                        financialTrust = f41;
                        mask1 &= Integer.MAX_VALUE;
                        break;
                    } else {
                        throw Util.unexpectedNull("financialTrust", "financialTrust", reader);
                    }
                case 64:
                    Float f42 = (Float) this.floatAdapter.fromJson(reader);
                    if (f42 != null) {
                        leadershipTrust = f42;
                        mask2 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("leadershipTrust", "leadershipTrust", reader);
                    }
                case 65:
                    Float f43 = (Float) this.floatAdapter.fromJson(reader);
                    if (f43 != null) {
                        confidentiality = f43;
                        mask2 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("confidentiality", "confidentiality", reader);
                    }
                case 66:
                    Float f44 = (Float) this.floatAdapter.fromJson(reader);
                    if (f44 != null) {
                        reliability = f44;
                        mask2 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("reliability", "reliability", reader);
                    }
                case 67:
                    Float f45 = (Float) this.floatAdapter.fromJson(reader);
                    if (f45 != null) {
                        publicReputation = f45;
                        mask2 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("publicReputation", "publicReputation", reader);
                    }
                case 68:
                    List list2 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list2 != null) {
                        networks = list2;
                        mask2 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("networks", "networks", reader);
                    }
                case 69:
                    List list3 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list3 != null) {
                        lifeEvents = list3;
                        mask2 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("lifeEvents", "lifeEvents", reader);
                    }
                case 70:
                    String str14 = (String) this.stringAdapter.fromJson(reader);
                    if (str14 != null) {
                        latestSelfReflection = str14;
                        mask2 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("latestSelfReflection", "latestSelfReflection", reader);
                    }
                case 71:
                    Boolean bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 != null) {
                        isFollowedByPlayer = bool3;
                        mask2 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("isFollowedByPlayer", "isFollowedByPlayer", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == 31 && mask1 == 0 && mask2 == -256) {
            String str15 = id;
            if (str15 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str16 = name;
            if (str16 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            Float f46 = popularity;
            if (f46 != null) {
                float floatValue = f46.floatValue();
                Float f47 = influence;
                if (f47 != null) {
                    float floatValue2 = f47.floatValue();
                    Long l3 = fans;
                    if (l3 != null) {
                        long longValue = l3.longValue();
                        boolean booleanValue = isOnTour.booleanValue();
                        double doubleValue = weeklySales.doubleValue();
                        String str17 = bestSongTitle;
                        Intrinsics.checkNotNull(str17, "null cannot be cast to non-null type kotlin.String");
                        float floatValue3 = bestSongRating.floatValue();
                        long longValue2 = bestSongStreams.longValue();
                        int intValue = age.intValue();
                        String str18 = personality;
                        Intrinsics.checkNotNull(str18, "null cannot be cast to non-null type kotlin.String");
                        float floatValue4 = confidence.floatValue();
                        float floatValue5 = creativity.floatValue();
                        float floatValue6 = businessIntel.floatValue();
                        String str19 = genrePreference;
                        Intrinsics.checkNotNull(str19, "null cannot be cast to non-null type kotlin.String");
                        String str20 = careerGoal;
                        Intrinsics.checkNotNull(str20, "null cannot be cast to non-null type kotlin.String");
                        float floatValue7 = integrity.floatValue();
                        float floatValue8 = generosity.floatValue();
                        float floatValue9 = pride.floatValue();
                        float floatValue10 = humility.floatValue();
                        float floatValue11 = loyalty.floatValue();
                        float floatValue12 = trust.floatValue();
                        float floatValue13 = jealousy.floatValue();
                        float floatValue14 = greed.floatValue();
                        float floatValue15 = ego.floatValue();
                        float floatValue16 = patience.floatValue();
                        float floatValue17 = emotionalIntel.floatValue();
                        float floatValue18 = discipline.floatValue();
                        float floatValue19 = curiosity.floatValue();
                        float floatValue20 = leadership.floatValue();
                        float floatValue21 = wisdom.floatValue();
                        float floatValue22 = compassion.floatValue();
                        float floatValue23 = forgiveness.floatValue();
                        float floatValue24 = gratitude.floatValue();
                        float floatValue25 = courage.floatValue();
                        float floatValue26 = stressTolerance.floatValue();
                        float floatValue27 = riskTolerance.floatValue();
                        float floatValue28 = workEthic.floatValue();
                        float floatValue29 = adaptability.floatValue();
                        float floatValue30 = selfAwareness.floatValue();
                        String str21 = strength;
                        Intrinsics.checkNotNull(str21, "null cannot be cast to non-null type kotlin.String");
                        String str22 = weakness;
                        Intrinsics.checkNotNull(str22, "null cannot be cast to non-null type kotlin.String");
                        String str23 = coreFear;
                        Intrinsics.checkNotNull(str23, "null cannot be cast to non-null type kotlin.String");
                        String str24 = coreDream;
                        Intrinsics.checkNotNull(str24, "null cannot be cast to non-null type kotlin.String");
                        String str25 = emotionalState;
                        Intrinsics.checkNotNull(str25, "null cannot be cast to non-null type kotlin.String");
                        String str26 = communicationStyle;
                        Intrinsics.checkNotNull(str26, "null cannot be cast to non-null type kotlin.String");
                        String str27 = decisionStyle;
                        Intrinsics.checkNotNull(str27, "null cannot be cast to non-null type kotlin.String");
                        List list4 = memories;
                        Intrinsics.checkNotNull(list4, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.NPCMemory>");
                        float floatValue31 = professionalRespect.floatValue();
                        float floatValue32 = personalTrust.floatValue();
                        float floatValue33 = creativeRespect.floatValue();
                        float floatValue34 = leadershipRespect.floatValue();
                        float floatValue35 = competenceOpinion.floatValue();
                        float floatValue36 = businessTrust.floatValue();
                        float floatValue37 = financialTrust.floatValue();
                        float floatValue38 = leadershipTrust.floatValue();
                        float floatValue39 = confidentiality.floatValue();
                        float floatValue40 = reliability.floatValue();
                        float floatValue41 = publicReputation.floatValue();
                        List list5 = networks;
                        Intrinsics.checkNotNull(list5, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        List list6 = lifeEvents;
                        Intrinsics.checkNotNull(list6, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        String str28 = latestSelfReflection;
                        Intrinsics.checkNotNull(str28, "null cannot be cast to non-null type kotlin.String");
                        return new NPCEntity(str15, str16, floatValue, floatValue2, longValue, booleanValue, doubleValue, str17, floatValue3, longValue2, intValue, str18, floatValue4, floatValue5, floatValue6, str19, wealth.doubleValue(), stress.floatValue(), mentalHealth.floatValue(), happiness.floatValue(), relationshipWithPlayer.floatValue(), isRetired.booleanValue(), currentRecordLabel, managerName, str20, floatValue7, floatValue8, floatValue9, floatValue10, floatValue11, floatValue12, floatValue13, floatValue14, floatValue15, floatValue16, floatValue17, floatValue18, floatValue19, floatValue20, floatValue21, floatValue22, floatValue23, floatValue24, floatValue25, floatValue26, floatValue27, floatValue28, floatValue29, floatValue30, str21, str22, str23, str24, str25, str26, str27, list4, floatValue31, floatValue32, floatValue33, floatValue34, floatValue35, floatValue36, floatValue37, floatValue38, floatValue39, floatValue40, floatValue41, list5, list6, str28, isFollowedByPlayer.booleanValue());
                    }
                    throw Util.missingProperty("fans", "fans", reader);
                }
                throw Util.missingProperty("influence", "influence", reader);
            }
            throw Util.missingProperty("popularity", "popularity", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = NPCEntity.class.getDeclaredConstructor(String.class, String.class, Float.TYPE, Float.TYPE, Long.TYPE, Boolean.TYPE, Double.TYPE, String.class, Float.TYPE, Long.TYPE, Integer.TYPE, String.class, Float.TYPE, Float.TYPE, Float.TYPE, String.class, Double.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE, String.class, String.class, String.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, List.class, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, List.class, List.class, String.class, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(declaredConstructor, "also(...)");
            constructor = declaredConstructor;
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[76];
        String str29 = id;
        if (str29 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str29;
        String str30 = name;
        if (str30 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[1] = str30;
        Float f48 = popularity;
        if (f48 != null) {
            objArr[2] = Float.valueOf(f48.floatValue());
            Float f49 = influence;
            if (f49 != null) {
                objArr[3] = Float.valueOf(f49.floatValue());
                Long l4 = fans;
                if (l4 != null) {
                    objArr[4] = Long.valueOf(l4.longValue());
                    objArr[5] = isOnTour;
                    objArr[6] = weeklySales;
                    objArr[7] = bestSongTitle;
                    objArr[8] = bestSongRating;
                    objArr[9] = bestSongStreams;
                    objArr[10] = age;
                    objArr[11] = personality;
                    objArr[12] = confidence;
                    objArr[13] = creativity;
                    objArr[14] = businessIntel;
                    objArr[15] = genrePreference;
                    objArr[16] = wealth;
                    objArr[17] = stress;
                    objArr[18] = mentalHealth;
                    objArr[19] = happiness;
                    objArr[20] = relationshipWithPlayer;
                    objArr[21] = isRetired;
                    objArr[22] = currentRecordLabel;
                    objArr[23] = managerName;
                    objArr[24] = careerGoal;
                    objArr[25] = integrity;
                    objArr[26] = generosity;
                    objArr[27] = pride;
                    objArr[28] = humility;
                    objArr[29] = loyalty;
                    objArr[30] = trust;
                    objArr[31] = jealousy;
                    objArr[32] = greed;
                    objArr[33] = ego;
                    objArr[34] = patience;
                    objArr[35] = emotionalIntel;
                    objArr[36] = discipline;
                    objArr[37] = curiosity;
                    objArr[38] = leadership;
                    objArr[39] = wisdom;
                    objArr[40] = compassion;
                    objArr[41] = forgiveness;
                    objArr[42] = gratitude;
                    objArr[43] = courage;
                    objArr[44] = stressTolerance;
                    objArr[45] = riskTolerance;
                    objArr[46] = workEthic;
                    objArr[47] = adaptability;
                    objArr[48] = selfAwareness;
                    objArr[49] = strength;
                    objArr[50] = weakness;
                    objArr[51] = coreFear;
                    objArr[52] = coreDream;
                    objArr[53] = emotionalState;
                    objArr[54] = communicationStyle;
                    objArr[55] = decisionStyle;
                    objArr[56] = memories;
                    objArr[57] = professionalRespect;
                    objArr[58] = personalTrust;
                    objArr[59] = creativeRespect;
                    objArr[60] = leadershipRespect;
                    objArr[61] = competenceOpinion;
                    objArr[62] = businessTrust;
                    objArr[63] = financialTrust;
                    objArr[64] = leadershipTrust;
                    objArr[65] = confidentiality;
                    objArr[66] = reliability;
                    objArr[67] = publicReputation;
                    objArr[68] = networks;
                    objArr[69] = lifeEvents;
                    objArr[70] = latestSelfReflection;
                    objArr[71] = isFollowedByPlayer;
                    objArr[72] = Integer.valueOf(mask0);
                    objArr[73] = Integer.valueOf(mask1);
                    objArr[74] = Integer.valueOf(mask2);
                    objArr[75] = null;
                    NPCEntity newInstance = localConstructor.newInstance(objArr);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                    return newInstance;
                }
                throw Util.missingProperty("fans", "fans", reader);
            }
            throw Util.missingProperty("influence", "influence", reader);
        }
        throw Util.missingProperty("popularity", "popularity", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable NPCEntity value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("popularity");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPopularity()));
        writer.name("influence");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getInfluence()));
        writer.name("fans");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFans()));
        writer.name("isOnTour");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isOnTour()));
        writer.name("weeklySales");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWeeklySales()));
        writer.name("bestSongTitle");
        this.stringAdapter.toJson(writer, value_.getBestSongTitle());
        writer.name("bestSongRating");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getBestSongRating()));
        writer.name("bestSongStreams");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getBestSongStreams()));
        writer.name("age");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getAge()));
        writer.name("personality");
        this.stringAdapter.toJson(writer, value_.getPersonality());
        writer.name("confidence");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getConfidence()));
        writer.name("creativity");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCreativity()));
        writer.name("businessIntel");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getBusinessIntel()));
        writer.name("genrePreference");
        this.stringAdapter.toJson(writer, value_.getGenrePreference());
        writer.name("wealth");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWealth()));
        writer.name("stress");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getStress()));
        writer.name("mentalHealth");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getMentalHealth()));
        writer.name("happiness");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getHappiness()));
        writer.name("relationshipWithPlayer");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRelationshipWithPlayer()));
        writer.name("isRetired");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isRetired()));
        writer.name("currentRecordLabel");
        this.nullableStringAdapter.toJson(writer, value_.getCurrentRecordLabel());
        writer.name("managerName");
        this.nullableStringAdapter.toJson(writer, value_.getManagerName());
        writer.name("careerGoal");
        this.stringAdapter.toJson(writer, value_.getCareerGoal());
        writer.name("integrity");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getIntegrity()));
        writer.name("generosity");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getGenerosity()));
        writer.name("pride");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPride()));
        writer.name("humility");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getHumility()));
        writer.name("loyalty");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLoyalty()));
        writer.name("trust");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getTrust()));
        writer.name("jealousy");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getJealousy()));
        writer.name("greed");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getGreed()));
        writer.name("ego");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getEgo()));
        writer.name("patience");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPatience()));
        writer.name("emotionalIntel");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getEmotionalIntel()));
        writer.name("discipline");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getDiscipline()));
        writer.name("curiosity");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCuriosity()));
        writer.name("leadership");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLeadership()));
        writer.name("wisdom");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getWisdom()));
        writer.name("compassion");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCompassion()));
        writer.name("forgiveness");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getForgiveness()));
        writer.name("gratitude");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getGratitude()));
        writer.name("courage");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCourage()));
        writer.name("stressTolerance");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getStressTolerance()));
        writer.name("riskTolerance");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRiskTolerance()));
        writer.name("workEthic");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getWorkEthic()));
        writer.name("adaptability");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getAdaptability()));
        writer.name("selfAwareness");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getSelfAwareness()));
        writer.name("strength");
        this.stringAdapter.toJson(writer, value_.getStrength());
        writer.name("weakness");
        this.stringAdapter.toJson(writer, value_.getWeakness());
        writer.name("coreFear");
        this.stringAdapter.toJson(writer, value_.getCoreFear());
        writer.name("coreDream");
        this.stringAdapter.toJson(writer, value_.getCoreDream());
        writer.name("emotionalState");
        this.stringAdapter.toJson(writer, value_.getEmotionalState());
        writer.name("communicationStyle");
        this.stringAdapter.toJson(writer, value_.getCommunicationStyle());
        writer.name("decisionStyle");
        this.stringAdapter.toJson(writer, value_.getDecisionStyle());
        writer.name("memories");
        this.listOfNPCMemoryAdapter.toJson(writer, value_.getMemories());
        writer.name("professionalRespect");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getProfessionalRespect()));
        writer.name("personalTrust");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPersonalTrust()));
        writer.name("creativeRespect");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCreativeRespect()));
        writer.name("leadershipRespect");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLeadershipRespect()));
        writer.name("competenceOpinion");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCompetenceOpinion()));
        writer.name("businessTrust");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getBusinessTrust()));
        writer.name("financialTrust");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getFinancialTrust()));
        writer.name("leadershipTrust");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLeadershipTrust()));
        writer.name("confidentiality");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getConfidentiality()));
        writer.name("reliability");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getReliability()));
        writer.name("publicReputation");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPublicReputation()));
        writer.name("networks");
        this.listOfStringAdapter.toJson(writer, value_.getNetworks());
        writer.name("lifeEvents");
        this.listOfStringAdapter.toJson(writer, value_.getLifeEvents());
        writer.name("latestSelfReflection");
        this.stringAdapter.toJson(writer, value_.getLatestSelfReflection());
        writer.name("isFollowedByPlayer");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isFollowedByPlayer()));
        writer.endObject();
    }
}
