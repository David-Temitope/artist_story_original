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
/* compiled from: WealthEngineStateJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010 \n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n��¨\u0006 "}, d2 = {"Lcom/example/data/WealthEngineStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/WealthEngineState;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "doubleAdapter", "", "floatAdapter", "", "listOfStringAdapter", "", "", "intAdapter", "", "stringAdapter", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nWealthEngineStateJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WealthEngineStateJsonAdapter.kt\ncom/example/data/WealthEngineStateJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,224:1\n1#2:225\n*E\n"})
/* loaded from: WealthEngineStateJsonAdapter.class */
public final class WealthEngineStateJsonAdapter extends JsonAdapter<WealthEngineState> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<WealthEngineState> constructorRef;
    public static final int $stable = 8;

    public WealthEngineStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"emergencyFundBalance", "payrollReserve", "businessReserve", "bondsBalance", "bondsInterestRate", "financialReviewLog", "lastReviewWeek", "lastReviewYear", "financialHistoryCashFlow", "smmPostCategory", "smmAutoPost"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<Double> adapter = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "emergencyFundBalance");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.doubleAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "bondsInterestRate");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
        JsonAdapter<List<String>> adapter3 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "financialReviewLog");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.listOfStringAdapter = adapter3;
        JsonAdapter<Integer> adapter4 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "lastReviewWeek");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.intAdapter = adapter4;
        JsonAdapter<String> adapter5 = moshi.adapter(String.class, SetsKt.emptySet(), "smmPostCategory");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.stringAdapter = adapter5;
        JsonAdapter<Boolean> adapter6 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "smmAutoPost");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.booleanAdapter = adapter6;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(").append("WealthEngineState").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public WealthEngineState m180fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Double emergencyFundBalance = Double.valueOf(0.0d);
        Double payrollReserve = Double.valueOf(0.0d);
        Double businessReserve = Double.valueOf(0.0d);
        Double bondsBalance = Double.valueOf(0.0d);
        Float bondsInterestRate = Float.valueOf(0.0f);
        List financialReviewLog = null;
        Integer lastReviewWeek = 0;
        Integer lastReviewYear = 0;
        List financialHistoryCashFlow = null;
        String smmPostCategory = null;
        Boolean smmAutoPost = false;
        int mask0 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        emergencyFundBalance = d;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("emergencyFundBalance", "emergencyFundBalance", reader);
                    }
                case 1:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        payrollReserve = d2;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("payrollReserve", "payrollReserve", reader);
                    }
                case 2:
                    Double d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 != null) {
                        businessReserve = d3;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("businessReserve", "businessReserve", reader);
                    }
                case 3:
                    Double d4 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d4 != null) {
                        bondsBalance = d4;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("bondsBalance", "bondsBalance", reader);
                    }
                case 4:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        bondsInterestRate = f;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("bondsInterestRate", "bondsInterestRate", reader);
                    }
                case 5:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        financialReviewLog = list;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("financialReviewLog", "financialReviewLog", reader);
                    }
                case 6:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        lastReviewWeek = num;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("lastReviewWeek", "lastReviewWeek", reader);
                    }
                case 7:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        lastReviewYear = num2;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("lastReviewYear", "lastReviewYear", reader);
                    }
                case 8:
                    List list2 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list2 != null) {
                        financialHistoryCashFlow = list2;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("financialHistoryCashFlow", "financialHistoryCashFlow", reader);
                    }
                case 9:
                    String str = (String) this.stringAdapter.fromJson(reader);
                    if (str != null) {
                        smmPostCategory = str;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("smmPostCategory", "smmPostCategory", reader);
                    }
                case 10:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        smmAutoPost = bool;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("smmAutoPost", "smmAutoPost", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 != -2048) {
            Constructor constructor = this.constructorRef;
            if (constructor == null) {
                Constructor declaredConstructor = WealthEngineState.class.getDeclaredConstructor(Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, List.class, Integer.TYPE, Integer.TYPE, List.class, String.class, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                this.constructorRef = declaredConstructor;
                constructor = declaredConstructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            Constructor localConstructor = constructor;
            WealthEngineState newInstance = localConstructor.newInstance(emergencyFundBalance, payrollReserve, businessReserve, bondsBalance, bondsInterestRate, financialReviewLog, lastReviewWeek, lastReviewYear, financialHistoryCashFlow, smmPostCategory, smmAutoPost, Integer.valueOf(mask0), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        double doubleValue = emergencyFundBalance.doubleValue();
        double doubleValue2 = payrollReserve.doubleValue();
        double doubleValue3 = businessReserve.doubleValue();
        double doubleValue4 = bondsBalance.doubleValue();
        float floatValue = bondsInterestRate.floatValue();
        List list3 = financialReviewLog;
        Intrinsics.checkNotNull(list3, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        int intValue = lastReviewWeek.intValue();
        int intValue2 = lastReviewYear.intValue();
        List list4 = financialHistoryCashFlow;
        Intrinsics.checkNotNull(list4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        String str2 = smmPostCategory;
        Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
        return new WealthEngineState(doubleValue, doubleValue2, doubleValue3, doubleValue4, floatValue, list3, intValue, intValue2, list4, str2, smmAutoPost.booleanValue());
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable WealthEngineState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("emergencyFundBalance");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getEmergencyFundBalance()));
        writer.name("payrollReserve");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getPayrollReserve()));
        writer.name("businessReserve");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getBusinessReserve()));
        writer.name("bondsBalance");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getBondsBalance()));
        writer.name("bondsInterestRate");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getBondsInterestRate()));
        writer.name("financialReviewLog");
        this.listOfStringAdapter.toJson(writer, value_.getFinancialReviewLog());
        writer.name("lastReviewWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLastReviewWeek()));
        writer.name("lastReviewYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLastReviewYear()));
        writer.name("financialHistoryCashFlow");
        this.listOfStringAdapter.toJson(writer, value_.getFinancialHistoryCashFlow());
        writer.name("smmPostCategory");
        this.stringAdapter.toJson(writer, value_.getSmmPostCategory());
        writer.name("smmAutoPost");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSmmAutoPost()));
        writer.endObject();
    }
}
