package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MarketSimulationHelper.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��B\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0006\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0087\b\u0018��2\u00020\u0001BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003J\t\u0010\u001d\u001a\u00020\fHÆ\u0003J]\u0010\u001e\u001a\u00020��2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0016¨\u0006&"}, d2 = {"Lcom/example/data/MarketSimulationResult;", "", "updatedStocks", "", "Lcom/example/data/Stock;", "updatedCryptos", "Lcom/example/data/Crypto;", "remainingStockOrders", "Lcom/example/data/StockOrder;", "remainingCryptoOrders", "Lcom/example/data/CryptoOrder;", "addedCash", "", "addedSalary", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DD)V", "getUpdatedStocks", "()Ljava/util/List;", "getUpdatedCryptos", "getRemainingStockOrders", "getRemainingCryptoOrders", "getAddedCash", "()D", "getAddedSalary", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"})
/* loaded from: MarketSimulationResult.class */
public final class MarketSimulationResult {
    @NotNull
    private final List<Stock> updatedStocks;
    @NotNull
    private final List<Crypto> updatedCryptos;
    @NotNull
    private final List<StockOrder> remainingStockOrders;
    @NotNull
    private final List<CryptoOrder> remainingCryptoOrders;
    private final double addedCash;
    private final double addedSalary;
    public static final int $stable = 8;

    @NotNull
    public final List<Stock> component1() {
        return this.updatedStocks;
    }

    @NotNull
    public final List<Crypto> component2() {
        return this.updatedCryptos;
    }

    @NotNull
    public final List<StockOrder> component3() {
        return this.remainingStockOrders;
    }

    @NotNull
    public final List<CryptoOrder> component4() {
        return this.remainingCryptoOrders;
    }

    public final double component5() {
        return this.addedCash;
    }

    public final double component6() {
        return this.addedSalary;
    }

    @NotNull
    public final MarketSimulationResult copy(@NotNull List<Stock> list, @NotNull List<Crypto> list2, @NotNull List<StockOrder> list3, @NotNull List<CryptoOrder> list4, double addedCash, double addedSalary) {
        Intrinsics.checkNotNullParameter(list, "updatedStocks");
        Intrinsics.checkNotNullParameter(list2, "updatedCryptos");
        Intrinsics.checkNotNullParameter(list3, "remainingStockOrders");
        Intrinsics.checkNotNullParameter(list4, "remainingCryptoOrders");
        return new MarketSimulationResult(list, list2, list3, list4, addedCash, addedSalary);
    }

    public static /* synthetic */ MarketSimulationResult copy$default(MarketSimulationResult marketSimulationResult, List list, List list2, List list3, List list4, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = marketSimulationResult.updatedStocks;
        }
        if ((i & 2) != 0) {
            list2 = marketSimulationResult.updatedCryptos;
        }
        if ((i & 4) != 0) {
            list3 = marketSimulationResult.remainingStockOrders;
        }
        if ((i & 8) != 0) {
            list4 = marketSimulationResult.remainingCryptoOrders;
        }
        if ((i & 16) != 0) {
            d = marketSimulationResult.addedCash;
        }
        if ((i & 32) != 0) {
            d2 = marketSimulationResult.addedSalary;
        }
        return marketSimulationResult.copy(list, list2, list3, list4, d, d2);
    }

    @NotNull
    public String toString() {
        List<Stock> list = this.updatedStocks;
        List<Crypto> list2 = this.updatedCryptos;
        List<StockOrder> list3 = this.remainingStockOrders;
        List<CryptoOrder> list4 = this.remainingCryptoOrders;
        double d = this.addedCash;
        double d2 = this.addedSalary;
        return "MarketSimulationResult(updatedStocks=" + list + ", updatedCryptos=" + list2 + ", remainingStockOrders=" + list3 + ", remainingCryptoOrders=" + list4 + ", addedCash=" + d + ", addedSalary=" + list + ")";
    }

    public int hashCode() {
        int result = this.updatedStocks.hashCode();
        return (((((((((result * 31) + this.updatedCryptos.hashCode()) * 31) + this.remainingStockOrders.hashCode()) * 31) + this.remainingCryptoOrders.hashCode()) * 31) + Double.hashCode(this.addedCash)) * 31) + Double.hashCode(this.addedSalary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MarketSimulationResult) {
            MarketSimulationResult marketSimulationResult = (MarketSimulationResult) other;
            return Intrinsics.areEqual(this.updatedStocks, marketSimulationResult.updatedStocks) && Intrinsics.areEqual(this.updatedCryptos, marketSimulationResult.updatedCryptos) && Intrinsics.areEqual(this.remainingStockOrders, marketSimulationResult.remainingStockOrders) && Intrinsics.areEqual(this.remainingCryptoOrders, marketSimulationResult.remainingCryptoOrders) && Double.compare(this.addedCash, marketSimulationResult.addedCash) == 0 && Double.compare(this.addedSalary, marketSimulationResult.addedSalary) == 0;
        }
        return false;
    }

    public MarketSimulationResult(@NotNull List<Stock> list, @NotNull List<Crypto> list2, @NotNull List<StockOrder> list3, @NotNull List<CryptoOrder> list4, double addedCash, double addedSalary) {
        Intrinsics.checkNotNullParameter(list, "updatedStocks");
        Intrinsics.checkNotNullParameter(list2, "updatedCryptos");
        Intrinsics.checkNotNullParameter(list3, "remainingStockOrders");
        Intrinsics.checkNotNullParameter(list4, "remainingCryptoOrders");
        this.updatedStocks = list;
        this.updatedCryptos = list2;
        this.remainingStockOrders = list3;
        this.remainingCryptoOrders = list4;
        this.addedCash = addedCash;
        this.addedSalary = addedSalary;
    }

    @NotNull
    public final List<Stock> getUpdatedStocks() {
        return this.updatedStocks;
    }

    @NotNull
    public final List<Crypto> getUpdatedCryptos() {
        return this.updatedCryptos;
    }

    @NotNull
    public final List<StockOrder> getRemainingStockOrders() {
        return this.remainingStockOrders;
    }

    @NotNull
    public final List<CryptoOrder> getRemainingCryptoOrders() {
        return this.remainingCryptoOrders;
    }

    public final double getAddedCash() {
        return this.addedCash;
    }

    public final double getAddedSalary() {
        return this.addedSalary;
    }
}
