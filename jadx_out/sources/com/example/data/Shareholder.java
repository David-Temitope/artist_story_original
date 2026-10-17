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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J;\u0010\u0019\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/example/data/Shareholder;", "", "name", "", "equityShare", "", "type", "boardSeat", "", "satisfaction", "<init>", "(Ljava/lang/String;FLjava/lang/String;ZF)V", "getName", "()Ljava/lang/String;", "getEquityShare", "()F", "getType", "getBoardSeat", "()Z", "getSatisfaction", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app"})
/* loaded from: Shareholder.class */
public final class Shareholder {
    @NotNull
    private final String name;
    private final float equityShare;
    @NotNull
    private final String type;
    private final boolean boardSeat;
    private final float satisfaction;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final float component2() {
        return this.equityShare;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    public final boolean component4() {
        return this.boardSeat;
    }

    public final float component5() {
        return this.satisfaction;
    }

    @NotNull
    public final Shareholder copy(@NotNull String name, float equityShare, @NotNull String type, boolean boardSeat, float satisfaction) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new Shareholder(name, equityShare, type, boardSeat, satisfaction);
    }

    public static /* synthetic */ Shareholder copy$default(Shareholder shareholder, String str, float f, String str2, boolean z, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareholder.name;
        }
        if ((i & 2) != 0) {
            f = shareholder.equityShare;
        }
        if ((i & 4) != 0) {
            str2 = shareholder.type;
        }
        if ((i & 8) != 0) {
            z = shareholder.boardSeat;
        }
        if ((i & 16) != 0) {
            f2 = shareholder.satisfaction;
        }
        return shareholder.copy(str, f, str2, z, f2);
    }

    @NotNull
    public String toString() {
        return "Shareholder(name=" + this.name + ", equityShare=" + this.equityShare + ", type=" + this.type + ", boardSeat=" + this.boardSeat + ", satisfaction=" + this.satisfaction + ")";
    }

    public int hashCode() {
        int result = this.name.hashCode();
        return (((((((result * 31) + Float.hashCode(this.equityShare)) * 31) + this.type.hashCode()) * 31) + Boolean.hashCode(this.boardSeat)) * 31) + Float.hashCode(this.satisfaction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Shareholder) {
            Shareholder shareholder = (Shareholder) other;
            return Intrinsics.areEqual(this.name, shareholder.name) && Float.compare(this.equityShare, shareholder.equityShare) == 0 && Intrinsics.areEqual(this.type, shareholder.type) && this.boardSeat == shareholder.boardSeat && Float.compare(this.satisfaction, shareholder.satisfaction) == 0;
        }
        return false;
    }

    public Shareholder(@NotNull String name, float equityShare, @NotNull String type, boolean boardSeat, float satisfaction) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.name = name;
        this.equityShare = equityShare;
        this.type = type;
        this.boardSeat = boardSeat;
        this.satisfaction = satisfaction;
    }

    public /* synthetic */ Shareholder(String str, float f, String str2, boolean z, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, f, str2, (i & 8) != 0 ? false : z, (i & 16) != 0 ? 75.0f : f2);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final float getEquityShare() {
        return this.equityShare;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final boolean getBoardSeat() {
        return this.boardSeat;
    }

    public final float getSatisfaction() {
        return this.satisfaction;
    }
}
