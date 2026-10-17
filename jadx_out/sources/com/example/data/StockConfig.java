package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MarketSimulationHelper.kt */
@StabilityInferred(parameters = 1)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J;\u0010\u0017\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/example/data/StockConfig;", "", "anchorPrice", "", "sector", "", "beta", "basePE", "health", "<init>", "(DLjava/lang/String;DDLjava/lang/String;)V", "getAnchorPrice", "()D", "getSector", "()Ljava/lang/String;", "getBeta", "getBasePE", "getHealth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: StockConfig.class */
public final class StockConfig {
    private final double anchorPrice;
    @NotNull
    private final String sector;
    private final double beta;
    private final double basePE;
    @NotNull
    private final String health;
    public static final int $stable = 0;

    public final double component1() {
        return this.anchorPrice;
    }

    @NotNull
    public final String component2() {
        return this.sector;
    }

    public final double component3() {
        return this.beta;
    }

    public final double component4() {
        return this.basePE;
    }

    @NotNull
    public final String component5() {
        return this.health;
    }

    @NotNull
    public final StockConfig copy(double anchorPrice, @NotNull String sector, double beta, double basePE, @NotNull String health) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(health, "health");
        return new StockConfig(anchorPrice, sector, beta, basePE, health);
    }

    public static /* synthetic */ StockConfig copy$default(StockConfig stockConfig, double d, String str, double d2, double d3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = stockConfig.anchorPrice;
        }
        if ((i & 2) != 0) {
            str = stockConfig.sector;
        }
        if ((i & 4) != 0) {
            d2 = stockConfig.beta;
        }
        if ((i & 8) != 0) {
            d3 = stockConfig.basePE;
        }
        if ((i & 16) != 0) {
            str2 = stockConfig.health;
        }
        return stockConfig.copy(d, str, d2, d3, str2);
    }

    @NotNull
    public String toString() {
        double d = this.anchorPrice;
        String str = this.sector;
        double d2 = this.beta;
        double d3 = this.basePE;
        String str2 = this.health;
        return "StockConfig(anchorPrice=" + d + ", sector=" + d + ", beta=" + str + ", basePE=" + d2 + ", health=" + d + ")";
    }

    public int hashCode() {
        int result = Double.hashCode(this.anchorPrice);
        return (((((((result * 31) + this.sector.hashCode()) * 31) + Double.hashCode(this.beta)) * 31) + Double.hashCode(this.basePE)) * 31) + this.health.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof StockConfig) {
            StockConfig stockConfig = (StockConfig) other;
            return Double.compare(this.anchorPrice, stockConfig.anchorPrice) == 0 && Intrinsics.areEqual(this.sector, stockConfig.sector) && Double.compare(this.beta, stockConfig.beta) == 0 && Double.compare(this.basePE, stockConfig.basePE) == 0 && Intrinsics.areEqual(this.health, stockConfig.health);
        }
        return false;
    }

    public StockConfig(double anchorPrice, @NotNull String sector, double beta, double basePE, @NotNull String health) {
        Intrinsics.checkNotNullParameter(sector, "sector");
        Intrinsics.checkNotNullParameter(health, "health");
        this.anchorPrice = anchorPrice;
        this.sector = sector;
        this.beta = beta;
        this.basePE = basePE;
        this.health = health;
    }

    public final double getAnchorPrice() {
        return this.anchorPrice;
    }

    @NotNull
    public final String getSector() {
        return this.sector;
    }

    public final double getBeta() {
        return this.beta;
    }

    public final double getBasePE() {
        return this.basePE;
    }

    @NotNull
    public final String getHealth() {
        return this.health;
    }
}
