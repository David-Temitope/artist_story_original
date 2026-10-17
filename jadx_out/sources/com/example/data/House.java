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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/example/data/House;", "", "id", "", "name", "cost", "", "energyBonus", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;DI)V", "getId", "()Ljava/lang/String;", "getName", "getCost", "()D", "getEnergyBonus", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: House.class */
public final class House {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    private final double cost;
    private final int energyBonus;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final double component3() {
        return this.cost;
    }

    public final int component4() {
        return this.energyBonus;
    }

    @NotNull
    public final House copy(@NotNull String id, @NotNull String name, double cost, int energyBonus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new House(id, name, cost, energyBonus);
    }

    public static /* synthetic */ House copy$default(House house, String str, String str2, double d, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = house.id;
        }
        if ((i2 & 2) != 0) {
            str2 = house.name;
        }
        if ((i2 & 4) != 0) {
            d = house.cost;
        }
        if ((i2 & 8) != 0) {
            i = house.energyBonus;
        }
        return house.copy(str, str2, d, i);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        double d = this.cost;
        int i = this.energyBonus;
        return "House(id=" + str + ", name=" + str2 + ", cost=" + d + ", energyBonus=" + str + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((result * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.cost)) * 31) + Integer.hashCode(this.energyBonus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof House) {
            House house = (House) other;
            return Intrinsics.areEqual(this.id, house.id) && Intrinsics.areEqual(this.name, house.name) && Double.compare(this.cost, house.cost) == 0 && this.energyBonus == house.energyBonus;
        }
        return false;
    }

    public House(@NotNull String id, @NotNull String name, double cost, int energyBonus) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.energyBonus = energyBonus;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getCost() {
        return this.cost;
    }

    public final int getEnergyBonus() {
        return this.energyBonus;
    }
}
