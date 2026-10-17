package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\nHÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003JY\u0010\"\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u0007HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0014¨\u0006("}, d2 = {"Lcom/example/data/MerchStyle;", "", "id", "", "name", "type", "unitCost", "", "sellPrice", "stockRemaining", "", "totalSold", "totalRevenue", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIID)V", "getId", "()Ljava/lang/String;", "getName", "getType", "getUnitCost", "()D", "getSellPrice", "getStockRemaining", "()I", "getTotalSold", "getTotalRevenue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: MerchStyle.class */
public final class MerchStyle {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String type;
    private final double unitCost;
    private final double sellPrice;
    private final int stockRemaining;
    private final int totalSold;
    private final double totalRevenue;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    public final double component4() {
        return this.unitCost;
    }

    public final double component5() {
        return this.sellPrice;
    }

    public final int component6() {
        return this.stockRemaining;
    }

    public final int component7() {
        return this.totalSold;
    }

    public final double component8() {
        return this.totalRevenue;
    }

    @NotNull
    public final MerchStyle copy(@NotNull String id, @NotNull String name, @NotNull String type, double unitCost, double sellPrice, int stockRemaining, int totalSold, double totalRevenue) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new MerchStyle(id, name, type, unitCost, sellPrice, stockRemaining, totalSold, totalRevenue);
    }

    public static /* synthetic */ MerchStyle copy$default(MerchStyle merchStyle, String str, String str2, String str3, double d, double d2, int i, int i2, double d3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = merchStyle.id;
        }
        if ((i3 & 2) != 0) {
            str2 = merchStyle.name;
        }
        if ((i3 & 4) != 0) {
            str3 = merchStyle.type;
        }
        if ((i3 & 8) != 0) {
            d = merchStyle.unitCost;
        }
        if ((i3 & 16) != 0) {
            d2 = merchStyle.sellPrice;
        }
        if ((i3 & 32) != 0) {
            i = merchStyle.stockRemaining;
        }
        if ((i3 & 64) != 0) {
            i2 = merchStyle.totalSold;
        }
        if ((i3 & 128) != 0) {
            d3 = merchStyle.totalRevenue;
        }
        return merchStyle.copy(str, str2, str3, d, d2, i, i2, d3);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.type;
        double d = this.unitCost;
        double d2 = this.sellPrice;
        int i = this.stockRemaining;
        int i2 = this.totalSold;
        double d3 = this.totalRevenue;
        return "MerchStyle(id=" + str + ", name=" + str2 + ", type=" + str3 + ", unitCost=" + d + ", sellPrice=" + str + ", stockRemaining=" + d2 + ", totalSold=" + str + ", totalRevenue=" + i + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((result * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Double.hashCode(this.unitCost)) * 31) + Double.hashCode(this.sellPrice)) * 31) + Integer.hashCode(this.stockRemaining)) * 31) + Integer.hashCode(this.totalSold)) * 31) + Double.hashCode(this.totalRevenue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MerchStyle) {
            MerchStyle merchStyle = (MerchStyle) other;
            return Intrinsics.areEqual(this.id, merchStyle.id) && Intrinsics.areEqual(this.name, merchStyle.name) && Intrinsics.areEqual(this.type, merchStyle.type) && Double.compare(this.unitCost, merchStyle.unitCost) == 0 && Double.compare(this.sellPrice, merchStyle.sellPrice) == 0 && this.stockRemaining == merchStyle.stockRemaining && this.totalSold == merchStyle.totalSold && Double.compare(this.totalRevenue, merchStyle.totalRevenue) == 0;
        }
        return false;
    }

    public MerchStyle(@NotNull String id, @NotNull String name, @NotNull String type, double unitCost, double sellPrice, int stockRemaining, int totalSold, double totalRevenue) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.name = name;
        this.type = type;
        this.unitCost = unitCost;
        this.sellPrice = sellPrice;
        this.stockRemaining = stockRemaining;
        this.totalSold = totalSold;
        this.totalRevenue = totalRevenue;
    }

    public /* synthetic */ MerchStyle(String str, String str2, String str3, double d, double d2, int i, int i2, double d3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, d2, i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? 0.0d : d3);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final double getUnitCost() {
        return this.unitCost;
    }

    public final double getSellPrice() {
        return this.sellPrice;
    }

    public final int getStockRemaining() {
        return this.stockRemaining;
    }

    public final int getTotalSold() {
        return this.totalSold;
    }

    public final double getTotalRevenue() {
        return this.totalRevenue;
    }
}
