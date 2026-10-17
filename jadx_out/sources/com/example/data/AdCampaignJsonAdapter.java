package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AdCampaignJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u001a"}, d2 = {"Lcom/example/data/AdCampaignJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/AdCampaign;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "intAdapter", "", "longAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: AdCampaignJsonAdapter.class */
public final class AdCampaignJsonAdapter extends JsonAdapter<AdCampaign> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    public static final int $stable = 8;

    public AdCampaignJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "agencyId", "agencyName", "targetType", "targetId", "weeklyBudget", "durationWeeks", "weeksRemaining", "objective", "estimatedReachPerWeek"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "weeklyBudget");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "durationWeeks");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
        JsonAdapter<Long> adapter4 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "estimatedReachPerWeek");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.longAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(").append("AdCampaign").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public AdCampaign m8fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String agencyId = null;
        String agencyName = null;
        String targetType = null;
        String targetId = null;
        Double weeklyBudget = null;
        Integer durationWeeks = null;
        Integer weeksRemaining = null;
        String objective = null;
        Long estimatedReachPerWeek = null;
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
                        agencyId = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("agencyId", "agencyId", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        agencyName = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("agencyName", "agencyName", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        targetType = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("targetType", "targetType", reader);
                    }
                case 4:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        targetId = str5;
                        break;
                    } else {
                        throw Util.unexpectedNull("targetId", "targetId", reader);
                    }
                case 5:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        weeklyBudget = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyBudget", "weeklyBudget", reader);
                    }
                case 6:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        durationWeeks = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("durationWeeks", "durationWeeks", reader);
                    }
                case 7:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        weeksRemaining = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeksRemaining", "weeksRemaining", reader);
                    }
                case 8:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        objective = str6;
                        break;
                    } else {
                        throw Util.unexpectedNull("objective", "objective", reader);
                    }
                case 9:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        estimatedReachPerWeek = l;
                        break;
                    } else {
                        throw Util.unexpectedNull("estimatedReachPerWeek", "estimatedReachPerWeek", reader);
                    }
            }
        }
        reader.endObject();
        String str7 = id;
        if (str7 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        String str8 = agencyId;
        if (str8 == null) {
            throw Util.missingProperty("agencyId", "agencyId", reader);
        }
        String str9 = agencyName;
        if (str9 == null) {
            throw Util.missingProperty("agencyName", "agencyName", reader);
        }
        String str10 = targetType;
        if (str10 == null) {
            throw Util.missingProperty("targetType", "targetType", reader);
        }
        String str11 = targetId;
        if (str11 == null) {
            throw Util.missingProperty("targetId", "targetId", reader);
        }
        Double d2 = weeklyBudget;
        if (d2 == null) {
            throw Util.missingProperty("weeklyBudget", "weeklyBudget", reader);
        }
        double doubleValue = d2.doubleValue();
        Integer num3 = durationWeeks;
        if (num3 == null) {
            throw Util.missingProperty("durationWeeks", "durationWeeks", reader);
        }
        int intValue = num3.intValue();
        Integer num4 = weeksRemaining;
        if (num4 == null) {
            throw Util.missingProperty("weeksRemaining", "weeksRemaining", reader);
        }
        int intValue2 = num4.intValue();
        String str12 = objective;
        if (str12 == null) {
            throw Util.missingProperty("objective", "objective", reader);
        }
        Long l2 = estimatedReachPerWeek;
        if (l2 != null) {
            return new AdCampaign(str7, str8, str9, str10, str11, doubleValue, intValue, intValue2, str12, l2.longValue());
        }
        throw Util.missingProperty("estimatedReachPerWeek", "estimatedReachPerWeek", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable AdCampaign value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("agencyId");
        this.stringAdapter.toJson(writer, value_.getAgencyId());
        writer.name("agencyName");
        this.stringAdapter.toJson(writer, value_.getAgencyName());
        writer.name("targetType");
        this.stringAdapter.toJson(writer, value_.getTargetType());
        writer.name("targetId");
        this.stringAdapter.toJson(writer, value_.getTargetId());
        writer.name("weeklyBudget");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWeeklyBudget()));
        writer.name("durationWeeks");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getDurationWeeks()));
        writer.name("weeksRemaining");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeeksRemaining()));
        writer.name("objective");
        this.stringAdapter.toJson(writer, value_.getObjective());
        writer.name("estimatedReachPerWeek");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getEstimatedReachPerWeek()));
        writer.endObject();
    }
}
