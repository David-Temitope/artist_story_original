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
/* compiled from: CryptoOrderJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0016"}, d2 = {"Lcom/example/data/CryptoOrderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/CryptoOrder;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: CryptoOrderJsonAdapter.class */
public final class CryptoOrderJsonAdapter extends JsonAdapter<CryptoOrder> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    public static final int $stable = 8;

    public CryptoOrderJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "cryptoId", "type", "targetPrice", "quantity"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "targetPrice");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("CryptoOrder").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public CryptoOrder m65fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String cryptoId = null;
        String type = null;
        Double targetPrice = null;
        Double quantity = null;
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
                        cryptoId = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("cryptoId", "cryptoId", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        type = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("type", "type", reader);
                    }
                case 3:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        targetPrice = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("targetPrice", "targetPrice", reader);
                    }
                case 4:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        quantity = d2;
                        break;
                    } else {
                        throw Util.unexpectedNull("quantity", "quantity", reader);
                    }
            }
        }
        reader.endObject();
        String str4 = id;
        if (str4 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        String str5 = cryptoId;
        if (str5 == null) {
            throw Util.missingProperty("cryptoId", "cryptoId", reader);
        }
        String str6 = type;
        if (str6 == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        Double d3 = targetPrice;
        if (d3 == null) {
            throw Util.missingProperty("targetPrice", "targetPrice", reader);
        }
        double doubleValue = d3.doubleValue();
        Double d4 = quantity;
        if (d4 != null) {
            return new CryptoOrder(str4, str5, str6, doubleValue, d4.doubleValue());
        }
        throw Util.missingProperty("quantity", "quantity", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable CryptoOrder value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("cryptoId");
        this.stringAdapter.toJson(writer, value_.getCryptoId());
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("targetPrice");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getTargetPrice()));
        writer.name("quantity");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getQuantity()));
        writer.endObject();
    }
}
