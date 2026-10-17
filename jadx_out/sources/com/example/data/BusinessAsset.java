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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\nHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/example/data/BusinessAsset;", "", "id", "", "name", "type", "purchaseCost", "", "weeklyProfit", "energyBonus", "", "ratingBonus", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDIF)V", "getId", "()Ljava/lang/String;", "getName", "getType", "getPurchaseCost", "()D", "getWeeklyProfit", "getEnergyBonus", "()I", "getRatingBonus", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: BusinessAsset.class */
public final class BusinessAsset {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String type;
    private final double purchaseCost;
    private final double weeklyProfit;
    private final int energyBonus;
    private final float ratingBonus;
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
        return this.purchaseCost;
    }

    public final double component5() {
        return this.weeklyProfit;
    }

    public final int component6() {
        return this.energyBonus;
    }

    public final float component7() {
        return this.ratingBonus;
    }

    @NotNull
    public final BusinessAsset copy(@NotNull String id, @NotNull String name, @NotNull String type, double purchaseCost, double weeklyProfit, int energyBonus, float ratingBonus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new BusinessAsset(id, name, type, purchaseCost, weeklyProfit, energyBonus, ratingBonus);
    }

    public static /* synthetic */ BusinessAsset copy$default(BusinessAsset businessAsset, String str, String str2, String str3, double d, double d2, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = businessAsset.id;
        }
        if ((i2 & 2) != 0) {
            str2 = businessAsset.name;
        }
        if ((i2 & 4) != 0) {
            str3 = businessAsset.type;
        }
        if ((i2 & 8) != 0) {
            d = businessAsset.purchaseCost;
        }
        if ((i2 & 16) != 0) {
            d2 = businessAsset.weeklyProfit;
        }
        if ((i2 & 32) != 0) {
            i = businessAsset.energyBonus;
        }
        if ((i2 & 64) != 0) {
            f = businessAsset.ratingBonus;
        }
        return businessAsset.copy(str, str2, str3, d, d2, i, f);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.type;
        double d = this.purchaseCost;
        double d2 = this.weeklyProfit;
        int i = this.energyBonus;
        float f = this.ratingBonus;
        return "BusinessAsset(id=" + str + ", name=" + str2 + ", type=" + str3 + ", purchaseCost=" + d + ", weeklyProfit=" + str + ", energyBonus=" + d2 + ", ratingBonus=" + str + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((result * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Double.hashCode(this.purchaseCost)) * 31) + Double.hashCode(this.weeklyProfit)) * 31) + Integer.hashCode(this.energyBonus)) * 31) + Float.hashCode(this.ratingBonus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BusinessAsset) {
            BusinessAsset businessAsset = (BusinessAsset) other;
            return Intrinsics.areEqual(this.id, businessAsset.id) && Intrinsics.areEqual(this.name, businessAsset.name) && Intrinsics.areEqual(this.type, businessAsset.type) && Double.compare(this.purchaseCost, businessAsset.purchaseCost) == 0 && Double.compare(this.weeklyProfit, businessAsset.weeklyProfit) == 0 && this.energyBonus == businessAsset.energyBonus && Float.compare(this.ratingBonus, businessAsset.ratingBonus) == 0;
        }
        return false;
    }

    public BusinessAsset(@NotNull String id, @NotNull String name, @NotNull String type, double purchaseCost, double weeklyProfit, int energyBonus, float ratingBonus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.name = name;
        this.type = type;
        this.purchaseCost = purchaseCost;
        this.weeklyProfit = weeklyProfit;
        this.energyBonus = energyBonus;
        this.ratingBonus = ratingBonus;
    }

    public /* synthetic */ BusinessAsset(String str, String str2, String str3, double d, double d2, int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, d2, (i2 & 32) != 0 ? 0 : i, (i2 & 64) != 0 ? 0.0f : f);
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

    public final double getPurchaseCost() {
        return this.purchaseCost;
    }

    public final double getWeeklyProfit() {
        return this.weeklyProfit;
    }

    public final int getEnergyBonus() {
        return this.energyBonus;
    }

    public final float getRatingBonus() {
        return this.ratingBonus;
    }
}
