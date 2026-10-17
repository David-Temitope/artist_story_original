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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b3\b\u0087\b\u0018��2\u00020\u0001B»\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u00101\u001a\u00020\u0006J\u0006\u00102\u001a\u00020\u0003J\u0006\u00103\u001a\u00020\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\u0006HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0006HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u0006HÆ\u0003J\t\u0010@\u001a\u00020\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0015HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0018HÆ\u0003JÃ\u0001\u0010F\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0018HÆ\u0001J\u0013\u0010G\u001a\u00020\u00182\b\u0010H\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010I\u001a\u00020\u0015HÖ\u0001J\t\u0010J\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u001cR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t¢\u0006\b\n��\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b#\u0010\u001fR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b$\u0010\u001fR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b%\u0010\u001fR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b&\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b)\u0010\u001fR\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b*\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b+\u0010\u001fR\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n��\u001a\u0004\b-\u0010.R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b/\u0010\u001cR\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n��\u001a\u0004\b\u0017\u00100¨\u0006K"}, d2 = {"Lcom/example/data/Crypto;", "", "id", "", "name", "currentPrice", "", "quantity", "history", "", "marketCap", "volume24h", "supportLevel", "resistanceLevel", "developerActivity", "averagePurchasePrice", "initialPrice", "allTimeHigh", "cycleFloor", "analystPrediction", "predictionConfidence", "", "predictionReason", "isCheapOpportunity", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDLjava/util/List;DDDDLjava/lang/String;DDDDLjava/lang/String;ILjava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "getName", "getCurrentPrice", "()D", "getQuantity", "getHistory", "()Ljava/util/List;", "getMarketCap", "getVolume24h", "getSupportLevel", "getResistanceLevel", "getDeveloperActivity", "getAveragePurchasePrice", "getInitialPrice", "getAllTimeHigh", "getCycleFloor", "getAnalystPrediction", "getPredictionConfidence", "()I", "getPredictionReason", "()Z", "recentChangePercent", "technicalZone", "volatilityCategory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: Crypto.class */
public final class Crypto {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    private final double currentPrice;
    private final double quantity;
    @NotNull
    private final List<Double> history;
    private final double marketCap;
    private final double volume24h;
    private final double supportLevel;
    private final double resistanceLevel;
    @NotNull
    private final String developerActivity;
    private final double averagePurchasePrice;
    private final double initialPrice;
    private final double allTimeHigh;
    private final double cycleFloor;
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

    public final double component4() {
        return this.quantity;
    }

    @NotNull
    public final List<Double> component5() {
        return this.history;
    }

    public final double component6() {
        return this.marketCap;
    }

    public final double component7() {
        return this.volume24h;
    }

    public final double component8() {
        return this.supportLevel;
    }

    public final double component9() {
        return this.resistanceLevel;
    }

    @NotNull
    public final String component10() {
        return this.developerActivity;
    }

    public final double component11() {
        return this.averagePurchasePrice;
    }

    public final double component12() {
        return this.initialPrice;
    }

    public final double component13() {
        return this.allTimeHigh;
    }

    public final double component14() {
        return this.cycleFloor;
    }

    @NotNull
    public final String component15() {
        return this.analystPrediction;
    }

    public final int component16() {
        return this.predictionConfidence;
    }

    @NotNull
    public final String component17() {
        return this.predictionReason;
    }

    public final boolean component18() {
        return this.isCheapOpportunity;
    }

    @NotNull
    public final Crypto copy(@NotNull String id, @NotNull String name, double currentPrice, double quantity, @NotNull List<Double> list, double marketCap, double volume24h, double supportLevel, double resistanceLevel, @NotNull String developerActivity, double averagePurchasePrice, double initialPrice, double allTimeHigh, double cycleFloor, @NotNull String analystPrediction, int predictionConfidence, @NotNull String predictionReason, boolean isCheapOpportunity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "history");
        Intrinsics.checkNotNullParameter(developerActivity, "developerActivity");
        Intrinsics.checkNotNullParameter(analystPrediction, "analystPrediction");
        Intrinsics.checkNotNullParameter(predictionReason, "predictionReason");
        return new Crypto(id, name, currentPrice, quantity, list, marketCap, volume24h, supportLevel, resistanceLevel, developerActivity, averagePurchasePrice, initialPrice, allTimeHigh, cycleFloor, analystPrediction, predictionConfidence, predictionReason, isCheapOpportunity);
    }

    public static /* synthetic */ Crypto copy$default(Crypto crypto, String str, String str2, double d, double d2, List list, double d3, double d4, double d5, double d6, String str3, double d7, double d8, double d9, double d10, String str4, int i, String str5, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = crypto.id;
        }
        if ((i2 & 2) != 0) {
            str2 = crypto.name;
        }
        if ((i2 & 4) != 0) {
            d = crypto.currentPrice;
        }
        if ((i2 & 8) != 0) {
            d2 = crypto.quantity;
        }
        if ((i2 & 16) != 0) {
            list = crypto.history;
        }
        if ((i2 & 32) != 0) {
            d3 = crypto.marketCap;
        }
        if ((i2 & 64) != 0) {
            d4 = crypto.volume24h;
        }
        if ((i2 & 128) != 0) {
            d5 = crypto.supportLevel;
        }
        if ((i2 & 256) != 0) {
            d6 = crypto.resistanceLevel;
        }
        if ((i2 & 512) != 0) {
            str3 = crypto.developerActivity;
        }
        if ((i2 & 1024) != 0) {
            d7 = crypto.averagePurchasePrice;
        }
        if ((i2 & 2048) != 0) {
            d8 = crypto.initialPrice;
        }
        if ((i2 & 4096) != 0) {
            d9 = crypto.allTimeHigh;
        }
        if ((i2 & 8192) != 0) {
            d10 = crypto.cycleFloor;
        }
        if ((i2 & 16384) != 0) {
            str4 = crypto.analystPrediction;
        }
        if ((i2 & 32768) != 0) {
            i = crypto.predictionConfidence;
        }
        if ((i2 & 65536) != 0) {
            str5 = crypto.predictionReason;
        }
        if ((i2 & 131072) != 0) {
            z = crypto.isCheapOpportunity;
        }
        return crypto.copy(str, str2, d, d2, list, d3, d4, d5, d6, str3, d7, d8, d9, d10, str4, i, str5, z);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        double d = this.currentPrice;
        double d2 = this.quantity;
        List<Double> list = this.history;
        double d3 = this.marketCap;
        double d4 = this.volume24h;
        double d5 = this.supportLevel;
        double d6 = this.resistanceLevel;
        String str3 = this.developerActivity;
        double d7 = this.averagePurchasePrice;
        double d8 = this.initialPrice;
        double d9 = this.allTimeHigh;
        double d10 = this.cycleFloor;
        String str4 = this.analystPrediction;
        int i = this.predictionConfidence;
        String str5 = this.predictionReason;
        boolean z = this.isCheapOpportunity;
        return "Crypto(id=" + str + ", name=" + str2 + ", currentPrice=" + d + ", quantity=" + str + ", history=" + d2 + ", marketCap=" + str + ", volume24h=" + list + ", supportLevel=" + d3 + ", resistanceLevel=" + str + ", developerActivity=" + d4 + ", averagePurchasePrice=" + str + ", initialPrice=" + d5 + ", allTimeHigh=" + str + ", cycleFloor=" + d6 + ", analystPrediction=" + str + ", predictionConfidence=" + str3 + ", predictionReason=" + d7 + ", isCheapOpportunity=" + str + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((((((((((result * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.currentPrice)) * 31) + Double.hashCode(this.quantity)) * 31) + this.history.hashCode()) * 31) + Double.hashCode(this.marketCap)) * 31) + Double.hashCode(this.volume24h)) * 31) + Double.hashCode(this.supportLevel)) * 31) + Double.hashCode(this.resistanceLevel)) * 31) + this.developerActivity.hashCode()) * 31) + Double.hashCode(this.averagePurchasePrice)) * 31) + Double.hashCode(this.initialPrice)) * 31) + Double.hashCode(this.allTimeHigh)) * 31) + Double.hashCode(this.cycleFloor)) * 31) + this.analystPrediction.hashCode()) * 31) + Integer.hashCode(this.predictionConfidence)) * 31) + this.predictionReason.hashCode()) * 31) + Boolean.hashCode(this.isCheapOpportunity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Crypto) {
            Crypto crypto = (Crypto) other;
            return Intrinsics.areEqual(this.id, crypto.id) && Intrinsics.areEqual(this.name, crypto.name) && Double.compare(this.currentPrice, crypto.currentPrice) == 0 && Double.compare(this.quantity, crypto.quantity) == 0 && Intrinsics.areEqual(this.history, crypto.history) && Double.compare(this.marketCap, crypto.marketCap) == 0 && Double.compare(this.volume24h, crypto.volume24h) == 0 && Double.compare(this.supportLevel, crypto.supportLevel) == 0 && Double.compare(this.resistanceLevel, crypto.resistanceLevel) == 0 && Intrinsics.areEqual(this.developerActivity, crypto.developerActivity) && Double.compare(this.averagePurchasePrice, crypto.averagePurchasePrice) == 0 && Double.compare(this.initialPrice, crypto.initialPrice) == 0 && Double.compare(this.allTimeHigh, crypto.allTimeHigh) == 0 && Double.compare(this.cycleFloor, crypto.cycleFloor) == 0 && Intrinsics.areEqual(this.analystPrediction, crypto.analystPrediction) && this.predictionConfidence == crypto.predictionConfidence && Intrinsics.areEqual(this.predictionReason, crypto.predictionReason) && this.isCheapOpportunity == crypto.isCheapOpportunity;
        }
        return false;
    }

    public Crypto(@NotNull String id, @NotNull String name, double currentPrice, double quantity, @NotNull List<Double> list, double marketCap, double volume24h, double supportLevel, double resistanceLevel, @NotNull String developerActivity, double averagePurchasePrice, double initialPrice, double allTimeHigh, double cycleFloor, @NotNull String analystPrediction, int predictionConfidence, @NotNull String predictionReason, boolean isCheapOpportunity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "history");
        Intrinsics.checkNotNullParameter(developerActivity, "developerActivity");
        Intrinsics.checkNotNullParameter(analystPrediction, "analystPrediction");
        Intrinsics.checkNotNullParameter(predictionReason, "predictionReason");
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
        this.quantity = quantity;
        this.history = list;
        this.marketCap = marketCap;
        this.volume24h = volume24h;
        this.supportLevel = supportLevel;
        this.resistanceLevel = resistanceLevel;
        this.developerActivity = developerActivity;
        this.averagePurchasePrice = averagePurchasePrice;
        this.initialPrice = initialPrice;
        this.allTimeHigh = allTimeHigh;
        this.cycleFloor = cycleFloor;
        this.analystPrediction = analystPrediction;
        this.predictionConfidence = predictionConfidence;
        this.predictionReason = predictionReason;
        this.isCheapOpportunity = isCheapOpportunity;
    }

    public /* synthetic */ Crypto(String str, String str2, double d, double d2, List list, double d3, double d4, double d5, double d6, String str3, double d7, double d8, double d9, double d10, String str4, int i, String str5, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list, (i2 & 32) != 0 ? 8500000.0d : d3, (i2 & 64) != 0 ? 250000.0d : d4, (i2 & 128) != 0 ? 0.0d : d5, (i2 & 256) != 0 ? 0.0d : d6, (i2 & 512) != 0 ? "High" : str3, (i2 & 1024) != 0 ? 0.0d : d7, (i2 & 2048) != 0 ? 0.0d : d8, (i2 & 4096) != 0 ? 0.0d : d9, (i2 & 8192) != 0 ? 0.0d : d10, (i2 & 16384) != 0 ? "" : str4, (i2 & 32768) != 0 ? 0 : i, (i2 & 65536) != 0 ? "" : str5, (i2 & 131072) != 0 ? false : z);
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

    public final double getQuantity() {
        return this.quantity;
    }

    @NotNull
    public final List<Double> getHistory() {
        return this.history;
    }

    public final double getMarketCap() {
        return this.marketCap;
    }

    public final double getVolume24h() {
        return this.volume24h;
    }

    public final double getSupportLevel() {
        return this.supportLevel;
    }

    public final double getResistanceLevel() {
        return this.resistanceLevel;
    }

    @NotNull
    public final String getDeveloperActivity() {
        return this.developerActivity;
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

    public final double getCycleFloor() {
        return this.cycleFloor;
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
    public final String technicalZone() {
        if (this.supportLevel > 0.0d && this.currentPrice <= this.supportLevel * 1.1d) {
            return "At Major Support (Accumulation Zone)";
        }
        if (this.resistanceLevel > 0.0d && this.currentPrice >= this.resistanceLevel * 0.9d) {
            return "At Resistance (Take-Profit Zone)";
        }
        return "Consolidating in Range";
    }

    @NotNull
    public final String volatilityCategory() {
        double change = Math.abs(recentChangePercent());
        return change >= 25.0d ? "Big Shift" : change >= 7.0d ? "Medium Wave" : "Little Shift";
    }
}
