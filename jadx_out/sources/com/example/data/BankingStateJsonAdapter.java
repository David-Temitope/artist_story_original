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
/* compiled from: BankingStateJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"Lcom/example/data/BankingStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/BankingState;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "doubleAdapter", "", "floatAdapter", "", "intAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: BankingStateJsonAdapter.class */
public final class BankingStateJsonAdapter extends JsonAdapter<BankingState> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @Nullable
    private volatile Constructor<BankingState> constructorRef;
    public static final int $stable = 8;

    public BankingStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"savingsBalance", "loanAmount", "accumulatedLoanInterest", "taxDebt", "titheDebt", "savingsInterestRate", "loanInterestRate", "mortgageAmount", "consecutiveUnpaidTaxWeeks", "consecutiveUnpaidTitheWeeks", "taxRate"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<Double> adapter = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "savingsBalance");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.doubleAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "savingsInterestRate");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "consecutiveUnpaidTaxWeeks");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(34);
        sb.append("GeneratedJsonAdapter(").append("BankingState").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public BankingState m23fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Double savingsBalance = Double.valueOf(0.0d);
        Double loanAmount = Double.valueOf(0.0d);
        Double accumulatedLoanInterest = Double.valueOf(0.0d);
        Double taxDebt = Double.valueOf(0.0d);
        Double titheDebt = Double.valueOf(0.0d);
        Float savingsInterestRate = Float.valueOf(0.0f);
        Float loanInterestRate = Float.valueOf(0.0f);
        Double mortgageAmount = Double.valueOf(0.0d);
        Integer consecutiveUnpaidTaxWeeks = 0;
        Integer consecutiveUnpaidTitheWeeks = 0;
        Float taxRate = Float.valueOf(0.0f);
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
                        savingsBalance = d;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("savingsBalance", "savingsBalance", reader);
                    }
                case 1:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        loanAmount = d2;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("loanAmount", "loanAmount", reader);
                    }
                case 2:
                    Double d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 != null) {
                        accumulatedLoanInterest = d3;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("accumulatedLoanInterest", "accumulatedLoanInterest", reader);
                    }
                case 3:
                    Double d4 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d4 != null) {
                        taxDebt = d4;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("taxDebt", "taxDebt", reader);
                    }
                case 4:
                    Double d5 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d5 != null) {
                        titheDebt = d5;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("titheDebt", "titheDebt", reader);
                    }
                case 5:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        savingsInterestRate = f;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("savingsInterestRate", "savingsInterestRate", reader);
                    }
                case 6:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        loanInterestRate = f2;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("loanInterestRate", "loanInterestRate", reader);
                    }
                case 7:
                    Double d6 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d6 != null) {
                        mortgageAmount = d6;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("mortgageAmount", "mortgageAmount", reader);
                    }
                case 8:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        consecutiveUnpaidTaxWeeks = num;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("consecutiveUnpaidTaxWeeks", "consecutiveUnpaidTaxWeeks", reader);
                    }
                case 9:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        consecutiveUnpaidTitheWeeks = num2;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("consecutiveUnpaidTitheWeeks", "consecutiveUnpaidTitheWeeks", reader);
                    }
                case 10:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 != null) {
                        taxRate = f3;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("taxRate", "taxRate", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -2048) {
            return new BankingState(savingsBalance.doubleValue(), loanAmount.doubleValue(), accumulatedLoanInterest.doubleValue(), taxDebt.doubleValue(), titheDebt.doubleValue(), savingsInterestRate.floatValue(), loanInterestRate.floatValue(), mortgageAmount.doubleValue(), consecutiveUnpaidTaxWeeks.intValue(), consecutiveUnpaidTitheWeeks.intValue(), taxRate.floatValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = BankingState.class.getDeclaredConstructor(Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE, Double.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        BankingState newInstance = localConstructor.newInstance(savingsBalance, loanAmount, accumulatedLoanInterest, taxDebt, titheDebt, savingsInterestRate, loanInterestRate, mortgageAmount, consecutiveUnpaidTaxWeeks, consecutiveUnpaidTitheWeeks, taxRate, Integer.valueOf(mask0), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable BankingState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("savingsBalance");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getSavingsBalance()));
        writer.name("loanAmount");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getLoanAmount()));
        writer.name("accumulatedLoanInterest");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getAccumulatedLoanInterest()));
        writer.name("taxDebt");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getTaxDebt()));
        writer.name("titheDebt");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getTitheDebt()));
        writer.name("savingsInterestRate");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getSavingsInterestRate()));
        writer.name("loanInterestRate");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLoanInterestRate()));
        writer.name("mortgageAmount");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getMortgageAmount()));
        writer.name("consecutiveUnpaidTaxWeeks");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getConsecutiveUnpaidTaxWeeks()));
        writer.name("consecutiveUnpaidTitheWeeks");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getConsecutiveUnpaidTitheWeeks()));
        writer.name("taxRate");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getTaxRate()));
        writer.endObject();
    }
}
