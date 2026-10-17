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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/example/data/LuxuryItem;", "", "id", "", "name", "description", "cost", "", "perks", "unlockRequirement", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getDescription", "getCost", "()D", "getPerks", "getUnlockRequirement", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: LuxuryItem.class */
public final class LuxuryItem {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String description;
    private final double cost;
    @NotNull
    private final String perks;
    @NotNull
    private final String unlockRequirement;
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
        return this.description;
    }

    public final double component4() {
        return this.cost;
    }

    @NotNull
    public final String component5() {
        return this.perks;
    }

    @NotNull
    public final String component6() {
        return this.unlockRequirement;
    }

    @NotNull
    public final LuxuryItem copy(@NotNull String id, @NotNull String name, @NotNull String description, double cost, @NotNull String perks, @NotNull String unlockRequirement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(perks, "perks");
        Intrinsics.checkNotNullParameter(unlockRequirement, "unlockRequirement");
        return new LuxuryItem(id, name, description, cost, perks, unlockRequirement);
    }

    public static /* synthetic */ LuxuryItem copy$default(LuxuryItem luxuryItem, String str, String str2, String str3, double d, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = luxuryItem.id;
        }
        if ((i & 2) != 0) {
            str2 = luxuryItem.name;
        }
        if ((i & 4) != 0) {
            str3 = luxuryItem.description;
        }
        if ((i & 8) != 0) {
            d = luxuryItem.cost;
        }
        if ((i & 16) != 0) {
            str4 = luxuryItem.perks;
        }
        if ((i & 32) != 0) {
            str5 = luxuryItem.unlockRequirement;
        }
        return luxuryItem.copy(str, str2, str3, d, str4, str5);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.description;
        double d = this.cost;
        String str4 = this.perks;
        String str5 = this.unlockRequirement;
        return "LuxuryItem(id=" + str + ", name=" + str2 + ", description=" + str3 + ", cost=" + d + ", perks=" + str + ", unlockRequirement=" + str4 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((result * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + Double.hashCode(this.cost)) * 31) + this.perks.hashCode()) * 31) + this.unlockRequirement.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof LuxuryItem) {
            LuxuryItem luxuryItem = (LuxuryItem) other;
            return Intrinsics.areEqual(this.id, luxuryItem.id) && Intrinsics.areEqual(this.name, luxuryItem.name) && Intrinsics.areEqual(this.description, luxuryItem.description) && Double.compare(this.cost, luxuryItem.cost) == 0 && Intrinsics.areEqual(this.perks, luxuryItem.perks) && Intrinsics.areEqual(this.unlockRequirement, luxuryItem.unlockRequirement);
        }
        return false;
    }

    public LuxuryItem(@NotNull String id, @NotNull String name, @NotNull String description, double cost, @NotNull String perks, @NotNull String unlockRequirement) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(perks, "perks");
        Intrinsics.checkNotNullParameter(unlockRequirement, "unlockRequirement");
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.perks = perks;
        this.unlockRequirement = unlockRequirement;
    }

    public /* synthetic */ LuxuryItem(String str, String str2, String str3, double d, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, str4, (i & 32) != 0 ? "" : str5);
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
    public final String getDescription() {
        return this.description;
    }

    public final double getCost() {
        return this.cost;
    }

    @NotNull
    public final String getPerks() {
        return this.perks;
    }

    @NotNull
    public final String getUnlockRequirement() {
        return this.unlockRequirement;
    }
}
