package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/example/data/StockOrder;", "", "id", "", "stockId", "type", "targetPrice", "", "quantity", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V", "getId", "()Ljava/lang/String;", "getStockId", "getType", "getTargetPrice", "()D", "getQuantity", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: StockOrder.class */
public final class StockOrder {
    @NotNull
    private final String id;
    @NotNull
    private final String stockId;
    @NotNull
    private final String type;
    private final double targetPrice;
    private final int quantity;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.stockId;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    public final double component4() {
        return this.targetPrice;
    }

    public final int component5() {
        return this.quantity;
    }

    @NotNull
    public final StockOrder copy(@NotNull String id, @NotNull String stockId, @NotNull String type, double targetPrice, int quantity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new StockOrder(id, stockId, type, targetPrice, quantity);
    }

    public static /* synthetic */ StockOrder copy$default(StockOrder stockOrder, String str, String str2, String str3, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = stockOrder.id;
        }
        if ((i2 & 2) != 0) {
            str2 = stockOrder.stockId;
        }
        if ((i2 & 4) != 0) {
            str3 = stockOrder.type;
        }
        if ((i2 & 8) != 0) {
            d = stockOrder.targetPrice;
        }
        if ((i2 & 16) != 0) {
            i = stockOrder.quantity;
        }
        return stockOrder.copy(str, str2, str3, d, i);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.stockId;
        String str3 = this.type;
        double d = this.targetPrice;
        int i = this.quantity;
        return "StockOrder(id=" + str + ", stockId=" + str2 + ", type=" + str3 + ", targetPrice=" + d + ", quantity=" + str + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((result * 31) + this.stockId.hashCode()) * 31) + this.type.hashCode()) * 31) + Double.hashCode(this.targetPrice)) * 31) + Integer.hashCode(this.quantity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof StockOrder) {
            StockOrder stockOrder = (StockOrder) other;
            return Intrinsics.areEqual(this.id, stockOrder.id) && Intrinsics.areEqual(this.stockId, stockOrder.stockId) && Intrinsics.areEqual(this.type, stockOrder.type) && Double.compare(this.targetPrice, stockOrder.targetPrice) == 0 && this.quantity == stockOrder.quantity;
        }
        return false;
    }

    public StockOrder(@NotNull String id, @NotNull String stockId, @NotNull String type, double targetPrice, int quantity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(stockId, "stockId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.stockId = stockId;
        this.type = type;
        this.targetPrice = targetPrice;
        this.quantity = quantity;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getStockId() {
        return this.stockId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final double getTargetPrice() {
        return this.targetPrice;
    }

    public final int getQuantity() {
        return this.quantity;
    }
}
