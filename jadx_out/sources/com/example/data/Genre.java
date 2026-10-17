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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J1\u0010\u0014\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/example/data/Genre;", "", "id", "", "name", "productionCostMultiplier", "", "listenerAppeal", "<init>", "(Ljava/lang/String;Ljava/lang/String;FF)V", "getId", "()Ljava/lang/String;", "getName", "getProductionCostMultiplier", "()F", "getListenerAppeal", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: Genre.class */
public final class Genre {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    private final float productionCostMultiplier;
    private final float listenerAppeal;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final float component3() {
        return this.productionCostMultiplier;
    }

    public final float component4() {
        return this.listenerAppeal;
    }

    @NotNull
    public final Genre copy(@NotNull String id, @NotNull String name, float productionCostMultiplier, float listenerAppeal) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new Genre(id, name, productionCostMultiplier, listenerAppeal);
    }

    public static /* synthetic */ Genre copy$default(Genre genre, String str, String str2, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = genre.id;
        }
        if ((i & 2) != 0) {
            str2 = genre.name;
        }
        if ((i & 4) != 0) {
            f = genre.productionCostMultiplier;
        }
        if ((i & 8) != 0) {
            f2 = genre.listenerAppeal;
        }
        return genre.copy(str, str2, f, f2);
    }

    @NotNull
    public String toString() {
        return "Genre(id=" + this.id + ", name=" + this.name + ", productionCostMultiplier=" + this.productionCostMultiplier + ", listenerAppeal=" + this.listenerAppeal + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((result * 31) + this.name.hashCode()) * 31) + Float.hashCode(this.productionCostMultiplier)) * 31) + Float.hashCode(this.listenerAppeal);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Genre) {
            Genre genre = (Genre) other;
            return Intrinsics.areEqual(this.id, genre.id) && Intrinsics.areEqual(this.name, genre.name) && Float.compare(this.productionCostMultiplier, genre.productionCostMultiplier) == 0 && Float.compare(this.listenerAppeal, genre.listenerAppeal) == 0;
        }
        return false;
    }

    public Genre(@NotNull String id, @NotNull String name, float productionCostMultiplier, float listenerAppeal) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.productionCostMultiplier = productionCostMultiplier;
        this.listenerAppeal = listenerAppeal;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getProductionCostMultiplier() {
        return this.productionCostMultiplier;
    }

    public final float getListenerAppeal() {
        return this.listenerAppeal;
    }
}
