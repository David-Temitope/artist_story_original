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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CryptoJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010 \n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001e"}, d2 = {"Lcom/example/data/CryptoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/Crypto;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "listOfDoubleAdapter", "", "intAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: CryptoJsonAdapter.class */
public final class CryptoJsonAdapter extends JsonAdapter<Crypto> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<List<Double>> listOfDoubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<Crypto> constructorRef;
    public static final int $stable = 8;

    public CryptoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "currentPrice", "quantity", "history", "marketCap", "volume24h", "supportLevel", "resistanceLevel", "developerActivity", "averagePurchasePrice", "initialPrice", "allTimeHigh", "cycleFloor", "analystPrediction", "predictionConfidence", "predictionReason", "isCheapOpportunity"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "currentPrice");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<List<Double>> adapter3 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Double.class}), SetsKt.emptySet(), "history");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.listOfDoubleAdapter = adapter3;
        JsonAdapter<Integer> adapter4 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "predictionConfidence");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.intAdapter = adapter4;
        JsonAdapter<Boolean> adapter5 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isCheapOpportunity");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.booleanAdapter = adapter5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(").append("Crypto").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public Crypto m62fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        Double currentPrice = null;
        Double quantity = Double.valueOf(0.0d);
        List history = null;
        Double marketCap = Double.valueOf(0.0d);
        Double volume24h = Double.valueOf(0.0d);
        Double supportLevel = Double.valueOf(0.0d);
        Double resistanceLevel = Double.valueOf(0.0d);
        String developerActivity = null;
        Double averagePurchasePrice = Double.valueOf(0.0d);
        Double initialPrice = Double.valueOf(0.0d);
        Double allTimeHigh = Double.valueOf(0.0d);
        Double cycleFloor = Double.valueOf(0.0d);
        String analystPrediction = null;
        Integer predictionConfidence = 0;
        String predictionReason = null;
        Boolean isCheapOpportunity = false;
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
                        name = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("name", "name", reader);
                    }
                case 2:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        currentPrice = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("currentPrice", "currentPrice", reader);
                    }
                case 3:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        quantity = d2;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("quantity", "quantity", reader);
                    }
                case 4:
                    List list = (List) this.listOfDoubleAdapter.fromJson(reader);
                    if (list != null) {
                        history = list;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("history", "history", reader);
                    }
                case 5:
                    Double d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 != null) {
                        marketCap = d3;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("marketCap", "marketCap", reader);
                    }
                case 6:
                    Double d4 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d4 != null) {
                        volume24h = d4;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("volume24h", "volume24h", reader);
                    }
                case 7:
                    Double d5 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d5 != null) {
                        supportLevel = d5;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("supportLevel", "supportLevel", reader);
                    }
                case 8:
                    Double d6 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d6 != null) {
                        resistanceLevel = d6;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("resistanceLevel", "resistanceLevel", reader);
                    }
                case 9:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        developerActivity = str3;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("developerActivity", "developerActivity", reader);
                    }
                case 10:
                    Double d7 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d7 != null) {
                        averagePurchasePrice = d7;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("averagePurchasePrice", "averagePurchasePrice", reader);
                    }
                case 11:
                    Double d8 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d8 != null) {
                        initialPrice = d8;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("initialPrice", "initialPrice", reader);
                    }
                case 12:
                    Double d9 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d9 != null) {
                        allTimeHigh = d9;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("allTimeHigh", "allTimeHigh", reader);
                    }
                case 13:
                    Double d10 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d10 != null) {
                        cycleFloor = d10;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("cycleFloor", "cycleFloor", reader);
                    }
                case 14:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        analystPrediction = str4;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("analystPrediction", "analystPrediction", reader);
                    }
                case 15:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        predictionConfidence = num;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("predictionConfidence", "predictionConfidence", reader);
                    }
                case 16:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        predictionReason = str5;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("predictionReason", "predictionReason", reader);
                    }
                case 17:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isCheapOpportunity = bool;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("isCheapOpportunity", "isCheapOpportunity", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -262137) {
            String str6 = id;
            if (str6 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str7 = name;
            if (str7 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            Double d11 = currentPrice;
            if (d11 != null) {
                double doubleValue = d11.doubleValue();
                double doubleValue2 = quantity.doubleValue();
                List list2 = history;
                Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
                double doubleValue3 = marketCap.doubleValue();
                double doubleValue4 = volume24h.doubleValue();
                double doubleValue5 = supportLevel.doubleValue();
                double doubleValue6 = resistanceLevel.doubleValue();
                String str8 = developerActivity;
                Intrinsics.checkNotNull(str8, "null cannot be cast to non-null type kotlin.String");
                double doubleValue7 = averagePurchasePrice.doubleValue();
                double doubleValue8 = initialPrice.doubleValue();
                double doubleValue9 = allTimeHigh.doubleValue();
                double doubleValue10 = cycleFloor.doubleValue();
                String str9 = analystPrediction;
                Intrinsics.checkNotNull(str9, "null cannot be cast to non-null type kotlin.String");
                int intValue = predictionConfidence.intValue();
                String str10 = predictionReason;
                Intrinsics.checkNotNull(str10, "null cannot be cast to non-null type kotlin.String");
                return new Crypto(str6, str7, doubleValue, doubleValue2, list2, doubleValue3, doubleValue4, doubleValue5, doubleValue6, str8, doubleValue7, doubleValue8, doubleValue9, doubleValue10, str9, intValue, str10, isCheapOpportunity.booleanValue());
            }
            throw Util.missingProperty("currentPrice", "currentPrice", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = Crypto.class.getDeclaredConstructor(String.class, String.class, Double.TYPE, Double.TYPE, List.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, String.class, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE, String.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[20];
        String str11 = id;
        if (str11 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str11;
        String str12 = name;
        if (str12 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[1] = str12;
        Double d12 = currentPrice;
        if (d12 != null) {
            objArr[2] = Double.valueOf(d12.doubleValue());
            objArr[3] = quantity;
            objArr[4] = history;
            objArr[5] = marketCap;
            objArr[6] = volume24h;
            objArr[7] = supportLevel;
            objArr[8] = resistanceLevel;
            objArr[9] = developerActivity;
            objArr[10] = averagePurchasePrice;
            objArr[11] = initialPrice;
            objArr[12] = allTimeHigh;
            objArr[13] = cycleFloor;
            objArr[14] = analystPrediction;
            objArr[15] = predictionConfidence;
            objArr[16] = predictionReason;
            objArr[17] = isCheapOpportunity;
            objArr[18] = Integer.valueOf(mask0);
            objArr[19] = null;
            Crypto newInstance = localConstructor.newInstance(objArr);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        throw Util.missingProperty("currentPrice", "currentPrice", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable Crypto value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("currentPrice");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCurrentPrice()));
        writer.name("quantity");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getQuantity()));
        writer.name("history");
        this.listOfDoubleAdapter.toJson(writer, value_.getHistory());
        writer.name("marketCap");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getMarketCap()));
        writer.name("volume24h");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getVolume24h()));
        writer.name("supportLevel");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getSupportLevel()));
        writer.name("resistanceLevel");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getResistanceLevel()));
        writer.name("developerActivity");
        this.stringAdapter.toJson(writer, value_.getDeveloperActivity());
        writer.name("averagePurchasePrice");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getAveragePurchasePrice()));
        writer.name("initialPrice");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getInitialPrice()));
        writer.name("allTimeHigh");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getAllTimeHigh()));
        writer.name("cycleFloor");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCycleFloor()));
        writer.name("analystPrediction");
        this.stringAdapter.toJson(writer, value_.getAnalystPrediction());
        writer.name("predictionConfidence");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getPredictionConfidence()));
        writer.name("predictionReason");
        this.stringAdapter.toJson(writer, value_.getPredictionReason());
        writer.name("isCheapOpportunity");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isCheapOpportunity()));
        writer.endObject();
    }
}
