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
/* compiled from: AdAgencyJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\t\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u001a"}, d2 = {"Lcom/example/data/AdAgencyJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/AdAgency;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "longAdapter", "", "floatAdapter", "", "doubleAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: AdAgencyJsonAdapter.class */
public final class AdAgencyJsonAdapter extends JsonAdapter<AdAgency> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    public static final int $stable = 8;

    public AdAgencyJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "specialty", "audienceReach", "conversionRate", "pricePerWeek", "credibility"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Long> adapter2 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "audienceReach");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.longAdapter = adapter2;
        JsonAdapter<Float> adapter3 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "conversionRate");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.floatAdapter = adapter3;
        JsonAdapter<Double> adapter4 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "pricePerWeek");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.doubleAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(").append("AdAgency").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public AdAgency m5fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        String specialty = null;
        Long audienceReach = null;
        Float conversionRate = null;
        Double pricePerWeek = null;
        Float credibility = null;
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
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        specialty = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("specialty", "specialty", reader);
                    }
                case 3:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        audienceReach = l;
                        break;
                    } else {
                        throw Util.unexpectedNull("audienceReach", "audienceReach", reader);
                    }
                case 4:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        conversionRate = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("conversionRate", "conversionRate", reader);
                    }
                case 5:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        pricePerWeek = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("pricePerWeek", "pricePerWeek", reader);
                    }
                case 6:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        credibility = f2;
                        break;
                    } else {
                        throw Util.unexpectedNull("credibility", "credibility", reader);
                    }
            }
        }
        reader.endObject();
        String str4 = id;
        if (str4 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        String str5 = name;
        if (str5 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        String str6 = specialty;
        if (str6 == null) {
            throw Util.missingProperty("specialty", "specialty", reader);
        }
        Long l2 = audienceReach;
        if (l2 == null) {
            throw Util.missingProperty("audienceReach", "audienceReach", reader);
        }
        long longValue = l2.longValue();
        Float f3 = conversionRate;
        if (f3 == null) {
            throw Util.missingProperty("conversionRate", "conversionRate", reader);
        }
        float floatValue = f3.floatValue();
        Double d2 = pricePerWeek;
        if (d2 == null) {
            throw Util.missingProperty("pricePerWeek", "pricePerWeek", reader);
        }
        double doubleValue = d2.doubleValue();
        Float f4 = credibility;
        if (f4 != null) {
            return new AdAgency(str4, str5, str6, longValue, floatValue, doubleValue, f4.floatValue());
        }
        throw Util.missingProperty("credibility", "credibility", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable AdAgency value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("specialty");
        this.stringAdapter.toJson(writer, value_.getSpecialty());
        writer.name("audienceReach");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getAudienceReach()));
        writer.name("conversionRate");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getConversionRate()));
        writer.name("pricePerWeek");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getPricePerWeek()));
        writer.name("credibility");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCredibility()));
        writer.endObject();
    }
}
