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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/example/data/WardrobeItem;", "", "id", "", "name", "category", "cost", "", "desc", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getCategory", "getCost", "()D", "getDesc", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: WardrobeItem.class */
public final class WardrobeItem {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String category;
    private final double cost;
    @NotNull
    private final String desc;
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
        return this.category;
    }

    public final double component4() {
        return this.cost;
    }

    @NotNull
    public final String component5() {
        return this.desc;
    }

    @NotNull
    public final WardrobeItem copy(@NotNull String id, @NotNull String name, @NotNull String category, double cost, @NotNull String desc) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(desc, "desc");
        return new WardrobeItem(id, name, category, cost, desc);
    }

    public static /* synthetic */ WardrobeItem copy$default(WardrobeItem wardrobeItem, String str, String str2, String str3, double d, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = wardrobeItem.id;
        }
        if ((i & 2) != 0) {
            str2 = wardrobeItem.name;
        }
        if ((i & 4) != 0) {
            str3 = wardrobeItem.category;
        }
        if ((i & 8) != 0) {
            d = wardrobeItem.cost;
        }
        if ((i & 16) != 0) {
            str4 = wardrobeItem.desc;
        }
        return wardrobeItem.copy(str, str2, str3, d, str4);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.category;
        double d = this.cost;
        String str4 = this.desc;
        return "WardrobeItem(id=" + str + ", name=" + str2 + ", category=" + str3 + ", cost=" + d + ", desc=" + str + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((result * 31) + this.name.hashCode()) * 31) + this.category.hashCode()) * 31) + Double.hashCode(this.cost)) * 31) + this.desc.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof WardrobeItem) {
            WardrobeItem wardrobeItem = (WardrobeItem) other;
            return Intrinsics.areEqual(this.id, wardrobeItem.id) && Intrinsics.areEqual(this.name, wardrobeItem.name) && Intrinsics.areEqual(this.category, wardrobeItem.category) && Double.compare(this.cost, wardrobeItem.cost) == 0 && Intrinsics.areEqual(this.desc, wardrobeItem.desc);
        }
        return false;
    }

    public WardrobeItem(@NotNull String id, @NotNull String name, @NotNull String category, double cost, @NotNull String desc) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(desc, "desc");
        this.id = id;
        this.name = name;
        this.category = category;
        this.cost = cost;
        this.desc = desc;
    }

    public /* synthetic */ WardrobeItem(String str, String str2, String str3, double d, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, (i & 16) != 0 ? "" : str4);
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
    public final String getCategory() {
        return this.category;
    }

    public final double getCost() {
        return this.cost;
    }

    @NotNull
    public final String getDesc() {
        return this.desc;
    }
}
