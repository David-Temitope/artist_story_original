package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DilemmaChoiceJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\t\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n��¨\u0006!"}, d2 = {"Lcom/example/data/DilemmaChoiceJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/DilemmaChoice;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "nullableStringAdapter", "floatAdapter", "", "booleanAdapter", "", "doubleAdapter", "", "longAdapter", "", "intAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: DilemmaChoiceJsonAdapter.class */
public final class DilemmaChoiceJsonAdapter extends JsonAdapter<DilemmaChoice> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @Nullable
    private volatile Constructor<DilemmaChoice> constructorRef;
    public static final int $stable = 8;

    public DilemmaChoiceJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "actionText", "shortTitle", "teaserConsequence", "requirementText", "requiredBusinessSkill", "requiredIntegrity", "isHighlighted", "cashDelta", "reputationDelta", "fansDelta", "stressDelta", "energyDelta", "relationshipDeltaNpc", "outcomeNarrative"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<String> adapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "requirementText");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.nullableStringAdapter = adapter2;
        JsonAdapter<Float> adapter3 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "requiredBusinessSkill");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.floatAdapter = adapter3;
        JsonAdapter<Boolean> adapter4 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isHighlighted");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.booleanAdapter = adapter4;
        JsonAdapter<Double> adapter5 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "cashDelta");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.doubleAdapter = adapter5;
        JsonAdapter<Long> adapter6 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "fansDelta");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.longAdapter = adapter6;
        JsonAdapter<Integer> adapter7 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "energyDelta");
        Intrinsics.checkNotNullExpressionValue(adapter7, "adapter(...)");
        this.intAdapter = adapter7;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(").append("DilemmaChoice").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public DilemmaChoice m69fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String actionText = null;
        String shortTitle = null;
        String teaserConsequence = null;
        String requirementText = null;
        Float requiredBusinessSkill = Float.valueOf(0.0f);
        Float requiredIntegrity = Float.valueOf(0.0f);
        Boolean isHighlighted = false;
        Double cashDelta = Double.valueOf(0.0d);
        Float reputationDelta = Float.valueOf(0.0f);
        Long fansDelta = 0L;
        Float stressDelta = Float.valueOf(0.0f);
        Integer energyDelta = 0;
        String relationshipDeltaNpc = null;
        String outcomeNarrative = null;
        int mask0 = -1;
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
                        actionText = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("actionText", "actionText", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        shortTitle = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("shortTitle", "shortTitle", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        teaserConsequence = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("teaserConsequence", "teaserConsequence", reader);
                    }
                case 4:
                    requirementText = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -17;
                    break;
                case 5:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        requiredBusinessSkill = f;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("requiredBusinessSkill", "requiredBusinessSkill", reader);
                    }
                case 6:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        requiredIntegrity = f2;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("requiredIntegrity", "requiredIntegrity", reader);
                    }
                case 7:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isHighlighted = bool;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("isHighlighted", "isHighlighted", reader);
                    }
                case 8:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        cashDelta = d;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("cashDelta", "cashDelta", reader);
                    }
                case 9:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 != null) {
                        reputationDelta = f3;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("reputationDelta", "reputationDelta", reader);
                    }
                case 10:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        fansDelta = l;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("fansDelta", "fansDelta", reader);
                    }
                case 11:
                    Float f4 = (Float) this.floatAdapter.fromJson(reader);
                    if (f4 != null) {
                        stressDelta = f4;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("stressDelta", "stressDelta", reader);
                    }
                case 12:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        energyDelta = num;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("energyDelta", "energyDelta", reader);
                    }
                case 13:
                    relationshipDeltaNpc = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -8193;
                    break;
                case 14:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        outcomeNarrative = str5;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("outcomeNarrative", "outcomeNarrative", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -32753) {
            String str6 = id;
            if (str6 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str7 = actionText;
            if (str7 == null) {
                throw Util.missingProperty("actionText", "actionText", reader);
            }
            String str8 = shortTitle;
            if (str8 == null) {
                throw Util.missingProperty("shortTitle", "shortTitle", reader);
            }
            String str9 = teaserConsequence;
            if (str9 == null) {
                throw Util.missingProperty("teaserConsequence", "teaserConsequence", reader);
            }
            String str10 = outcomeNarrative;
            Intrinsics.checkNotNull(str10, "null cannot be cast to non-null type kotlin.String");
            return new DilemmaChoice(str6, str7, str8, str9, requirementText, requiredBusinessSkill.floatValue(), requiredIntegrity.floatValue(), isHighlighted.booleanValue(), cashDelta.doubleValue(), reputationDelta.floatValue(), fansDelta.longValue(), stressDelta.floatValue(), energyDelta.intValue(), relationshipDeltaNpc, str10);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = DilemmaChoice.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Float.TYPE, Float.TYPE, Boolean.TYPE, Double.TYPE, Float.TYPE, Long.TYPE, Float.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[17];
        String str11 = id;
        if (str11 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str11;
        String str12 = actionText;
        if (str12 == null) {
            throw Util.missingProperty("actionText", "actionText", reader);
        }
        objArr[1] = str12;
        String str13 = shortTitle;
        if (str13 == null) {
            throw Util.missingProperty("shortTitle", "shortTitle", reader);
        }
        objArr[2] = str13;
        String str14 = teaserConsequence;
        if (str14 == null) {
            throw Util.missingProperty("teaserConsequence", "teaserConsequence", reader);
        }
        objArr[3] = str14;
        objArr[4] = requirementText;
        objArr[5] = requiredBusinessSkill;
        objArr[6] = requiredIntegrity;
        objArr[7] = isHighlighted;
        objArr[8] = cashDelta;
        objArr[9] = reputationDelta;
        objArr[10] = fansDelta;
        objArr[11] = stressDelta;
        objArr[12] = energyDelta;
        objArr[13] = relationshipDeltaNpc;
        objArr[14] = outcomeNarrative;
        objArr[15] = Integer.valueOf(mask0);
        objArr[16] = null;
        DilemmaChoice newInstance = localConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable DilemmaChoice value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("actionText");
        this.stringAdapter.toJson(writer, value_.getActionText());
        writer.name("shortTitle");
        this.stringAdapter.toJson(writer, value_.getShortTitle());
        writer.name("teaserConsequence");
        this.stringAdapter.toJson(writer, value_.getTeaserConsequence());
        writer.name("requirementText");
        this.nullableStringAdapter.toJson(writer, value_.getRequirementText());
        writer.name("requiredBusinessSkill");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRequiredBusinessSkill()));
        writer.name("requiredIntegrity");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRequiredIntegrity()));
        writer.name("isHighlighted");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isHighlighted()));
        writer.name("cashDelta");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCashDelta()));
        writer.name("reputationDelta");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getReputationDelta()));
        writer.name("fansDelta");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFansDelta()));
        writer.name("stressDelta");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getStressDelta()));
        writer.name("energyDelta");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getEnergyDelta()));
        writer.name("relationshipDeltaNpc");
        this.nullableStringAdapter.toJson(writer, value_.getRelationshipDeltaNpc());
        writer.name("outcomeNarrative");
        this.stringAdapter.toJson(writer, value_.getOutcomeNarrative());
        writer.endObject();
    }
}
