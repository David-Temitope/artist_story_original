package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b7\b\u0087\b\u0018��2\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0006\u00107\u001a\u00020\u0006J\u0006\u00108\u001a\u00020\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\bHÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00060\rHÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\bHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u001bHÆ\u0003JÙ\u0001\u0010M\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001bHÆ\u0001J\u0013\u0010N\u001a\u00020\u001b2\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\bHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b \u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b!\u0010\"R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b'\u0010\u001fR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r¢\u0006\b\n��\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b+\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b,\u0010\"R\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b-\u0010&R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b.\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b/\u0010\u001fR\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b0\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b1\u0010\"R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b2\u0010\"R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b3\u0010\u001fR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b4\u0010$R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b5\u0010\u001fR\u0011\u0010\u001a\u001a\u00020\u001b¢\u0006\b\n��\u001a\u0004\b\u001a\u00106¨\u0006R"}, d2 = {"Lcom/example/data/Stock;", "", "id", "", "name", "currentPrice", "", "quantity", "", "weeklyDividendPercent", "", "connectedTo", "history", "", "sector", "quarterlyEarnings", "PE_Ratio", "dividendYieldPercent", "marketCap", "financialHealth", "averagePurchasePrice", "initialPrice", "allTimeHigh", "analystPrediction", "predictionConfidence", "predictionReason", "isCheapOpportunity", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;DIFLjava/lang/String;Ljava/util/List;Ljava/lang/String;DDFDLjava/lang/String;DDDLjava/lang/String;ILjava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getCurrentPrice", "()D", "getQuantity", "()I", "getWeeklyDividendPercent", "()F", "getConnectedTo", "getHistory", "()Ljava/util/List;", "getSector", "getQuarterlyEarnings", "getPE_Ratio", "getDividendYieldPercent", "getMarketCap", "getFinancialHealth", "getAveragePurchasePrice", "getInitialPrice", "getAllTimeHigh", "getAnalystPrediction", "getPredictionConfidence", "getPredictionReason", "()Z", "recentChangePercent", "valuationStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: Stock.class */
public final class Stock {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    private final double currentPrice;
    private final int quantity;
    private final float weeklyDividendPercent;
    @Nullable
    private final String connectedTo;
    @NotNull
    private final List<Double> history;
    @NotNull
    private final String sector;
    private final double quarterlyEarnings;
    private final double PE_Ratio;
    private final float dividendYieldPercent;
    private final double marketCap;
    @NotNull
    private final String financialHealth;
    private final double averagePurchasePrice;
    private final double initialPrice;
    private final double allTimeHigh;
    @NotNull
    private final String analystPrediction;
    private final int predictionConfidence;
    @NotNull
    private final String predictionReason;
    private final boolean isCheapOpportunity;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final double component3() {
        return this.currentPrice;
    }

    public final int component4() {
        return this.quantity;
    }

    public final float component5() {
        return this.weeklyDividendPercent;
    }

    @Nullable
    public final String component6() {
        return this.connectedTo;
    }

    @NotNull
    public final List<Double> component7() {
        return this.history;
    }

    @NotNull
    public final String component8() {
        return this.sector;
    }

    public final double component9() {
        return this.quarterlyEarnings;
    }

    public final double component10() {
        return this.PE_Ratio;
    }

    public final float component11() {
        return this.dividendYieldPercent;
    }

    public final double component12() {
        return this.marketCap;
    }

    @NotNull
    public final String component13() {
        return this.financialHealth;
    }

    public final double component14() {
        return this.averagePurchasePrice;
    }

    public final double component15() {
        return this.initialPrice;
    }

    public final double component16() {
        return this.allTimeHigh;
    }

    @NotNull
    public final String component17() {
        return this.analystPrediction;
    }

    public final int component18() {
        return this.predictionConfidence;
    }

    @NotNull
    public final String component19() {
        return this.predictionReason;
    }

    public final boolean component20() {
        return this.isCheapOpportunity;
    }

    @NotNull
    public final Stock copy(@NotNull String id, @NotNull String name, double currentPrice, int quantity, float weeklyDividendPercent, @Nullable String connectedTo, @NotNull List<Double> list, @NotNull String sector, double quarterlyEarnings, double PE_Ratio, float dividendYieldPercent, double marketCap, @NotNull String financialHealth, double averagePurchasePrice, double initialPrice, double allTimeHigh, @NotNull String analystPrediction, int predictionConfidence, @NotNull String predictionReason, boolean isCheapOpportunity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "history");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(financialHealth, "financialHealth");
        Intrinsics.checkNotNullParameter(analystPrediction, "analystPrediction");
        Intrinsics.checkNotNullParameter(predictionReason, "predictionReason");
        return new Stock(id, name, currentPrice, quantity, weeklyDividendPercent, connectedTo, list, sector, quarterlyEarnings, PE_Ratio, dividendYieldPercent, marketCap, financialHealth, averagePurchasePrice, initialPrice, allTimeHigh, analystPrediction, predictionConfidence, predictionReason, isCheapOpportunity);
    }

    public static /* synthetic */ Stock copy$default(Stock stock, String str, String str2, double d, int i, float f, String str3, List list, String str4, double d2, double d3, float f2, double d4, String str5, double d5, double d6, double d7, String str6, int i2, String str7, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = stock.id;
        }
        if ((i3 & 2) != 0) {
            str2 = stock.name;
        }
        if ((i3 & 4) != 0) {
            d = stock.currentPrice;
        }
        if ((i3 & 8) != 0) {
            i = stock.quantity;
        }
        if ((i3 & 16) != 0) {
            f = stock.weeklyDividendPercent;
        }
        if ((i3 & 32) != 0) {
            str3 = stock.connectedTo;
        }
        if ((i3 & 64) != 0) {
            list = stock.history;
        }
        if ((i3 & 128) != 0) {
            str4 = stock.sector;
        }
        if ((i3 & 256) != 0) {
            d2 = stock.quarterlyEarnings;
        }
        if ((i3 & 512) != 0) {
            d3 = stock.PE_Ratio;
        }
        if ((i3 & 1024) != 0) {
            f2 = stock.dividendYieldPercent;
        }
        if ((i3 & 2048) != 0) {
            d4 = stock.marketCap;
        }
        if ((i3 & 4096) != 0) {
            str5 = stock.financialHealth;
        }
        if ((i3 & 8192) != 0) {
            d5 = stock.averagePurchasePrice;
        }
        if ((i3 & 16384) != 0) {
            d6 = stock.initialPrice;
        }
        if ((i3 & 32768) != 0) {
            d7 = stock.allTimeHigh;
        }
        if ((i3 & 65536) != 0) {
            str6 = stock.analystPrediction;
        }
        if ((i3 & 131072) != 0) {
            i2 = stock.predictionConfidence;
        }
        if ((i3 & 262144) != 0) {
            str7 = stock.predictionReason;
        }
        if ((i3 & 524288) != 0) {
            z = stock.isCheapOpportunity;
        }
        return stock.copy(str, str2, d, i, f, str3, list, str4, d2, d3, f2, d4, str5, d5, d6, d7, str6, i2, str7, z);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        double d = this.currentPrice;
        int i = this.quantity;
        float f = this.weeklyDividendPercent;
        String str3 = this.connectedTo;
        List<Double> list = this.history;
        String str4 = this.sector;
        double d2 = this.quarterlyEarnings;
        double d3 = this.PE_Ratio;
        float f2 = this.dividendYieldPercent;
        double d4 = this.marketCap;
        String str5 = this.financialHealth;
        double d5 = this.averagePurchasePrice;
        double d6 = this.initialPrice;
        double d7 = this.allTimeHigh;
        String str6 = this.analystPrediction;
        int i2 = this.predictionConfidence;
        String str7 = this.predictionReason;
        boolean z = this.isCheapOpportunity;
        return "Stock(id=" + str + ", name=" + str2 + ", currentPrice=" + d + ", quantity=" + str + ", weeklyDividendPercent=" + i + ", connectedTo=" + f + ", history=" + str3 + ", sector=" + list + ", quarterlyEarnings=" + str4 + ", PE_Ratio=" + d2 + ", dividendYieldPercent=" + str + ", marketCap=" + d3 + ", financialHealth=" + str + ", averagePurchasePrice=" + f2 + ", initialPrice=" + d4 + ", allTimeHigh=" + str + ", analystPrediction=" + str5 + ", predictionConfidence=" + d5 + ", predictionReason=" + str + ", isCheapOpportunity=" + d6 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((((((((((((((result * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.currentPrice)) * 31) + Integer.hashCode(this.quantity)) * 31) + Float.hashCode(this.weeklyDividendPercent)) * 31) + (this.connectedTo == null ? 0 : this.connectedTo.hashCode())) * 31) + this.history.hashCode()) * 31) + this.sector.hashCode()) * 31) + Double.hashCode(this.quarterlyEarnings)) * 31) + Double.hashCode(this.PE_Ratio)) * 31) + Float.hashCode(this.dividendYieldPercent)) * 31) + Double.hashCode(this.marketCap)) * 31) + this.financialHealth.hashCode()) * 31) + Double.hashCode(this.averagePurchasePrice)) * 31) + Double.hashCode(this.initialPrice)) * 31) + Double.hashCode(this.allTimeHigh)) * 31) + this.analystPrediction.hashCode()) * 31) + Integer.hashCode(this.predictionConfidence)) * 31) + this.predictionReason.hashCode()) * 31) + Boolean.hashCode(this.isCheapOpportunity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Stock) {
            Stock stock = (Stock) other;
            return Intrinsics.areEqual(this.id, stock.id) && Intrinsics.areEqual(this.name, stock.name) && Double.compare(this.currentPrice, stock.currentPrice) == 0 && this.quantity == stock.quantity && Float.compare(this.weeklyDividendPercent, stock.weeklyDividendPercent) == 0 && Intrinsics.areEqual(this.connectedTo, stock.connectedTo) && Intrinsics.areEqual(this.history, stock.history) && Intrinsics.areEqual(this.sector, stock.sector) && Double.compare(this.quarterlyEarnings, stock.quarterlyEarnings) == 0 && Double.compare(this.PE_Ratio, stock.PE_Ratio) == 0 && Float.compare(this.dividendYieldPercent, stock.dividendYieldPercent) == 0 && Double.compare(this.marketCap, stock.marketCap) == 0 && Intrinsics.areEqual(this.financialHealth, stock.financialHealth) && Double.compare(this.averagePurchasePrice, stock.averagePurchasePrice) == 0 && Double.compare(this.initialPrice, stock.initialPrice) == 0 && Double.compare(this.allTimeHigh, stock.allTimeHigh) == 0 && Intrinsics.areEqual(this.analystPrediction, stock.analystPrediction) && this.predictionConfidence == stock.predictionConfidence && Intrinsics.areEqual(this.predictionReason, stock.predictionReason) && this.isCheapOpportunity == stock.isCheapOpportunity;
        }
        return false;
    }

    public Stock(@NotNull String id, @NotNull String name, double currentPrice, int quantity, float weeklyDividendPercent, @Nullable String connectedTo, @NotNull List<Double> list, @NotNull String sector, double quarterlyEarnings, double PE_Ratio, float dividendYieldPercent, double marketCap, @NotNull String financialHealth, double averagePurchasePrice, double initialPrice, double allTimeHigh, @NotNull String analystPrediction, int predictionConfidence, @NotNull String predictionReason, boolean isCheapOpportunity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "history");
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(financialHealth, "financialHealth");
        Intrinsics.checkNotNullParameter(analystPrediction, "analystPrediction");
        Intrinsics.checkNotNullParameter(predictionReason, "predictionReason");
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.weeklyDividendPercent = weeklyDividendPercent;
        this.connectedTo = connectedTo;
        this.history = list;
        this.sector = sector;
        this.quarterlyEarnings = quarterlyEarnings;
        this.PE_Ratio = PE_Ratio;
        this.dividendYieldPercent = dividendYieldPercent;
        this.marketCap = marketCap;
        this.financialHealth = financialHealth;
        this.averagePurchasePrice = averagePurchasePrice;
        this.initialPrice = initialPrice;
        this.allTimeHigh = allTimeHigh;
        this.analystPrediction = analystPrediction;
        this.predictionConfidence = predictionConfidence;
        this.predictionReason = predictionReason;
        this.isCheapOpportunity = isCheapOpportunity;
    }

    public /* synthetic */ Stock(String str, String str2, double d, int i, float f, String str3, List list, String str4, double d2, double d3, float f2, double d4, String str5, double d5, double d6, double d7, String str6, int i2, String str7, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, (i3 & 8) != 0 ? 0 : i, f, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? CollectionsKt.emptyList() : list, (i3 & 128) != 0 ? "Technology" : str4, (i3 & 256) != 0 ? 1500000.0d : d2, (i3 & 512) != 0 ? 14.5d : d3, (i3 & 1024) != 0 ? 2.4f : f2, (i3 & 2048) != 0 ? 4.5E7d : d4, (i3 & 4096) != 0 ? "Stable" : str5, (i3 & 8192) != 0 ? 0.0d : d5, (i3 & 16384) != 0 ? 0.0d : d6, (i3 & 32768) != 0 ? 0.0d : d7, (i3 & 65536) != 0 ? "" : str6, (i3 & 131072) != 0 ? 0 : i2, (i3 & 262144) != 0 ? "" : str7, (i3 & 524288) != 0 ? false : z);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getCurrentPrice() {
        return this.currentPrice;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final float getWeeklyDividendPercent() {
        return this.weeklyDividendPercent;
    }

    @Nullable
    public final String getConnectedTo() {
        return this.connectedTo;
    }

    @NotNull
    public final List<Double> getHistory() {
        return this.history;
    }

    @NotNull
    public final String getSector() {
        return this.sector;
    }

    public final double getQuarterlyEarnings() {
        return this.quarterlyEarnings;
    }

    public final double getPE_Ratio() {
        return this.PE_Ratio;
    }

    public final float getDividendYieldPercent() {
        return this.dividendYieldPercent;
    }

    public final double getMarketCap() {
        return this.marketCap;
    }

    @NotNull
    public final String getFinancialHealth() {
        return this.financialHealth;
    }

    public final double getAveragePurchasePrice() {
        return this.averagePurchasePrice;
    }

    public final double getInitialPrice() {
        return this.initialPrice;
    }

    public final double getAllTimeHigh() {
        return this.allTimeHigh;
    }

    @NotNull
    public final String getAnalystPrediction() {
        return this.analystPrediction;
    }

    public final int getPredictionConfidence() {
        return this.predictionConfidence;
    }

    @NotNull
    public final String getPredictionReason() {
        return this.predictionReason;
    }

    public final boolean isCheapOpportunity() {
        return this.isCheapOpportunity;
    }

    public final double recentChangePercent() {
        if (this.history.size() < 2 || ((Number) CollectionsKt.first(this.history)).doubleValue() <= 0.0d) {
            return 0.0d;
        }
        return ((this.currentPrice - ((Number) CollectionsKt.first(this.history)).doubleValue()) / ((Number) CollectionsKt.first(this.history)).doubleValue()) * 100.0d;
    }

    @NotNull
    public final String valuationStatus() {
        return this.PE_Ratio <= 13.0d ? "Undervalued (Value Buy)" : this.PE_Ratio >= 28.0d ? "Premium (High Growth)" : "Fair Value";
    }
}
