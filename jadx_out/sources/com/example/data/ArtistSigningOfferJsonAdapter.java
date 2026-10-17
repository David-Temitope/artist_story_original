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
/* compiled from: ArtistSigningOfferJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u001a"}, d2 = {"Lcom/example/data/ArtistSigningOfferJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/ArtistSigningOffer;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "floatAdapter", "", "doubleAdapter", "", "intAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: ArtistSigningOfferJsonAdapter.class */
public final class ArtistSigningOfferJsonAdapter extends JsonAdapter<ArtistSigningOffer> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    public static final int $stable = 8;

    public ArtistSigningOfferJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "artistId", "artistName", "requestedRevenueShare", "requestedSigningBonus", "contractDurationWeeks", "weeklyExpenseLimit", "preferredGenre"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "requestedRevenueShare");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
        JsonAdapter<Double> adapter3 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "requestedSigningBonus");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.doubleAdapter = adapter3;
        JsonAdapter<Integer> adapter4 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "contractDurationWeeks");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.intAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(").append("ArtistSigningOffer").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public ArtistSigningOffer m17fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String artistId = null;
        String artistName = null;
        Float requestedRevenueShare = null;
        Double requestedSigningBonus = null;
        Integer contractDurationWeeks = null;
        Double weeklyExpenseLimit = null;
        String preferredGenre = null;
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
                        artistId = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("artistId", "artistId", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        artistName = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("artistName", "artistName", reader);
                    }
                case 3:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        requestedRevenueShare = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("requestedRevenueShare", "requestedRevenueShare", reader);
                    }
                case 4:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        requestedSigningBonus = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("requestedSigningBonus", "requestedSigningBonus", reader);
                    }
                case 5:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        contractDurationWeeks = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("contractDurationWeeks", "contractDurationWeeks", reader);
                    }
                case 6:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        weeklyExpenseLimit = d2;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyExpenseLimit", "weeklyExpenseLimit", reader);
                    }
                case 7:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        preferredGenre = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("preferredGenre", "preferredGenre", reader);
                    }
            }
        }
        reader.endObject();
        String str5 = id;
        if (str5 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        String str6 = artistId;
        if (str6 == null) {
            throw Util.missingProperty("artistId", "artistId", reader);
        }
        String str7 = artistName;
        if (str7 == null) {
            throw Util.missingProperty("artistName", "artistName", reader);
        }
        Float f2 = requestedRevenueShare;
        if (f2 == null) {
            throw Util.missingProperty("requestedRevenueShare", "requestedRevenueShare", reader);
        }
        float floatValue = f2.floatValue();
        Double d3 = requestedSigningBonus;
        if (d3 == null) {
            throw Util.missingProperty("requestedSigningBonus", "requestedSigningBonus", reader);
        }
        double doubleValue = d3.doubleValue();
        Integer num2 = contractDurationWeeks;
        if (num2 == null) {
            throw Util.missingProperty("contractDurationWeeks", "contractDurationWeeks", reader);
        }
        int intValue = num2.intValue();
        Double d4 = weeklyExpenseLimit;
        if (d4 == null) {
            throw Util.missingProperty("weeklyExpenseLimit", "weeklyExpenseLimit", reader);
        }
        double doubleValue2 = d4.doubleValue();
        String str8 = preferredGenre;
        if (str8 != null) {
            return new ArtistSigningOffer(str5, str6, str7, floatValue, doubleValue, intValue, doubleValue2, str8);
        }
        throw Util.missingProperty("preferredGenre", "preferredGenre", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable ArtistSigningOffer value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("artistId");
        this.stringAdapter.toJson(writer, value_.getArtistId());
        writer.name("artistName");
        this.stringAdapter.toJson(writer, value_.getArtistName());
        writer.name("requestedRevenueShare");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRequestedRevenueShare()));
        writer.name("requestedSigningBonus");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getRequestedSigningBonus()));
        writer.name("contractDurationWeeks");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getContractDurationWeeks()));
        writer.name("weeklyExpenseLimit");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWeeklyExpenseLimit()));
        writer.name("preferredGenre");
        this.stringAdapter.toJson(writer, value_.getPreferredGenre());
        writer.endObject();
    }
}
