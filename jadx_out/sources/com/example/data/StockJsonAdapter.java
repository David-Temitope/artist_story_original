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
/* compiled from: StockJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00130\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n��¨\u0006!"}, d2 = {"Lcom/example/data/StockJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/Stock;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "intAdapter", "", "floatAdapter", "", "nullableStringAdapter", "listOfDoubleAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nStockJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StockJsonAdapter.kt\ncom/example/data/StockJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,313:1\n1#2:314\n*E\n"})
/* loaded from: StockJsonAdapter.class */
public final class StockJsonAdapter extends JsonAdapter<Stock> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @NotNull
    private final JsonAdapter<List<Double>> listOfDoubleAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<Stock> constructorRef;
    public static final int $stable = 8;

    public StockJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "currentPrice", "quantity", "weeklyDividendPercent", "connectedTo", "history", "sector", "quarterlyEarnings", "PE_Ratio", "dividendYieldPercent", "marketCap", "financialHealth", "averagePurchasePrice", "initialPrice", "allTimeHigh", "analystPrediction", "predictionConfidence", "predictionReason", "isCheapOpportunity"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "currentPrice");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "quantity");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
        JsonAdapter<Float> adapter4 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "weeklyDividendPercent");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.floatAdapter = adapter4;
        JsonAdapter<String> adapter5 = moshi.adapter(String.class, SetsKt.emptySet(), "connectedTo");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.nullableStringAdapter = adapter5;
        JsonAdapter<List<Double>> adapter6 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Double.class}), SetsKt.emptySet(), "history");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.listOfDoubleAdapter = adapter6;
        JsonAdapter<Boolean> adapter7 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isCheapOpportunity");
        Intrinsics.checkNotNullExpressionValue(adapter7, "adapter(...)");
        this.booleanAdapter = adapter7;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(").append("Stock").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public Stock m168fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        Double currentPrice = null;
        Integer quantity = 0;
        Float weeklyDividendPercent = null;
        String connectedTo = null;
        List history = null;
        String sector = null;
        Double quarterlyEarnings = Double.valueOf(0.0d);
        Double PE_Ratio = Double.valueOf(0.0d);
        Float dividendYieldPercent = Float.valueOf(0.0f);
        Double marketCap = Double.valueOf(0.0d);
        String financialHealth = null;
        Double averagePurchasePrice = Double.valueOf(0.0d);
        Double initialPrice = Double.valueOf(0.0d);
        Double allTimeHigh = Double.valueOf(0.0d);
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
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        quantity = num;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("quantity", "quantity", reader);
                    }
                case 4:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        weeklyDividendPercent = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyDividendPercent", "weeklyDividendPercent", reader);
                    }
                case 5:
                    connectedTo = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -33;
                    break;
                case 6:
                    List list = (List) this.listOfDoubleAdapter.fromJson(reader);
                    if (list != null) {
                        history = list;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("history", "history", reader);
                    }
                case 7:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        sector = str3;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("sector", "sector", reader);
                    }
                case 8:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        quarterlyEarnings = d2;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("quarterlyEarnings", "quarterlyEarnings", reader);
                    }
                case 9:
                    Double d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 != null) {
                        PE_Ratio = d3;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("PE_Ratio", "PE_Ratio", reader);
                    }
                case 10:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        dividendYieldPercent = f2;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("dividendYieldPercent", "dividendYieldPercent", reader);
                    }
                case 11:
                    Double d4 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d4 != null) {
                        marketCap = d4;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("marketCap", "marketCap", reader);
                    }
                case 12:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        financialHealth = str4;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("financialHealth", "financialHealth", reader);
                    }
                case 13:
                    Double d5 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d5 != null) {
                        averagePurchasePrice = d5;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("averagePurchasePrice", "averagePurchasePrice", reader);
                    }
                case 14:
                    Double d6 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d6 != null) {
                        initialPrice = d6;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("initialPrice", "initialPrice", reader);
                    }
                case 15:
                    Double d7 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d7 != null) {
                        allTimeHigh = d7;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("allTimeHigh", "allTimeHigh", reader);
                    }
                case 16:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        analystPrediction = str5;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("analystPrediction", "analystPrediction", reader);
                    }
                case 17:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        predictionConfidence = num2;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("predictionConfidence", "predictionConfidence", reader);
                    }
                case 18:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        predictionReason = str6;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("predictionReason", "predictionReason", reader);
                    }
                case 19:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isCheapOpportunity = bool;
                        mask0 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("isCheapOpportunity", "isCheapOpportunity", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -1048553) {
            String str7 = id;
            if (str7 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str8 = name;
            if (str8 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            Double d8 = currentPrice;
            if (d8 != null) {
                double doubleValue = d8.doubleValue();
                int intValue = quantity.intValue();
                Float f3 = weeklyDividendPercent;
                if (f3 != null) {
                    float floatValue = f3.floatValue();
                    List list2 = history;
                    Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Double>");
                    String str9 = sector;
                    Intrinsics.checkNotNull(str9, "null cannot be cast to non-null type kotlin.String");
                    double doubleValue2 = quarterlyEarnings.doubleValue();
                    double doubleValue3 = PE_Ratio.doubleValue();
                    float floatValue2 = dividendYieldPercent.floatValue();
                    double doubleValue4 = marketCap.doubleValue();
                    String str10 = financialHealth;
                    Intrinsics.checkNotNull(str10, "null cannot be cast to non-null type kotlin.String");
                    double doubleValue5 = averagePurchasePrice.doubleValue();
                    double doubleValue6 = initialPrice.doubleValue();
                    double doubleValue7 = allTimeHigh.doubleValue();
                    String str11 = analystPrediction;
                    Intrinsics.checkNotNull(str11, "null cannot be cast to non-null type kotlin.String");
                    int intValue2 = predictionConfidence.intValue();
                    String str12 = predictionReason;
                    Intrinsics.checkNotNull(str12, "null cannot be cast to non-null type kotlin.String");
                    return new Stock(str7, str8, doubleValue, intValue, floatValue, connectedTo, list2, str9, doubleValue2, doubleValue3, floatValue2, doubleValue4, str10, doubleValue5, doubleValue6, doubleValue7, str11, intValue2, str12, isCheapOpportunity.booleanValue());
                }
                throw Util.missingProperty("weeklyDividendPercent", "weeklyDividendPercent", reader);
            }
            throw Util.missingProperty("currentPrice", "currentPrice", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = Stock.class.getDeclaredConstructor(String.class, String.class, Double.TYPE, Integer.TYPE, Float.TYPE, String.class, List.class, String.class, Double.TYPE, Double.TYPE, Float.TYPE, Double.TYPE, String.class, Double.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE, String.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[22];
        String str13 = id;
        if (str13 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str13;
        String str14 = name;
        if (str14 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[1] = str14;
        Double d9 = currentPrice;
        if (d9 != null) {
            objArr[2] = Double.valueOf(d9.doubleValue());
            objArr[3] = quantity;
            Float f4 = weeklyDividendPercent;
            if (f4 != null) {
                objArr[4] = Float.valueOf(f4.floatValue());
                objArr[5] = connectedTo;
                objArr[6] = history;
                objArr[7] = sector;
                objArr[8] = quarterlyEarnings;
                objArr[9] = PE_Ratio;
                objArr[10] = dividendYieldPercent;
                objArr[11] = marketCap;
                objArr[12] = financialHealth;
                objArr[13] = averagePurchasePrice;
                objArr[14] = initialPrice;
                objArr[15] = allTimeHigh;
                objArr[16] = analystPrediction;
                objArr[17] = predictionConfidence;
                objArr[18] = predictionReason;
                objArr[19] = isCheapOpportunity;
                objArr[20] = Integer.valueOf(mask0);
                objArr[21] = null;
                Stock newInstance = localConstructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw Util.missingProperty("weeklyDividendPercent", "weeklyDividendPercent", reader);
        }
        throw Util.missingProperty("currentPrice", "currentPrice", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable Stock value_) {
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
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getQuantity()));
        writer.name("weeklyDividendPercent");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getWeeklyDividendPercent()));
        writer.name("connectedTo");
        this.nullableStringAdapter.toJson(writer, value_.getConnectedTo());
        writer.name("history");
        this.listOfDoubleAdapter.toJson(writer, value_.getHistory());
        writer.name("sector");
        this.stringAdapter.toJson(writer, value_.getSector());
        writer.name("quarterlyEarnings");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getQuarterlyEarnings()));
        writer.name("PE_Ratio");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getPE_Ratio()));
        writer.name("dividendYieldPercent");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getDividendYieldPercent()));
        writer.name("marketCap");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getMarketCap()));
        writer.name("financialHealth");
        this.stringAdapter.toJson(writer, value_.getFinancialHealth());
        writer.name("averagePurchasePrice");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getAveragePurchasePrice()));
        writer.name("initialPrice");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getInitialPrice()));
        writer.name("allTimeHigh");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getAllTimeHigh()));
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
