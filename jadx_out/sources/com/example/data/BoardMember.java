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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/example/data/BoardMember;", "", "id", "", "name", "type", "powerWeight", "", "satisfaction", "alignment", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getType", "getPowerWeight", "()F", "getSatisfaction", "getAlignment", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: BoardMember.class */
public final class BoardMember {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String type;
    private final float powerWeight;
    private final float satisfaction;
    @NotNull
    private final String alignment;
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

    public final float component4() {
        return this.powerWeight;
    }

    public final float component5() {
        return this.satisfaction;
    }

    @NotNull
    public final String component6() {
        return this.alignment;
    }

    @NotNull
    public final BoardMember copy(@NotNull String id, @NotNull String name, @NotNull String type, float powerWeight, float satisfaction, @NotNull String alignment) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return new BoardMember(id, name, type, powerWeight, satisfaction, alignment);
    }

    public static /* synthetic */ BoardMember copy$default(BoardMember boardMember, String str, String str2, String str3, float f, float f2, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boardMember.id;
        }
        if ((i & 2) != 0) {
            str2 = boardMember.name;
        }
        if ((i & 4) != 0) {
            str3 = boardMember.type;
        }
        if ((i & 8) != 0) {
            f = boardMember.powerWeight;
        }
        if ((i & 16) != 0) {
            f2 = boardMember.satisfaction;
        }
        if ((i & 32) != 0) {
            str4 = boardMember.alignment;
        }
        return boardMember.copy(str, str2, str3, f, f2, str4);
    }

    @NotNull
    public String toString() {
        return "BoardMember(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", powerWeight=" + this.powerWeight + ", satisfaction=" + this.satisfaction + ", alignment=" + this.alignment + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((result * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + Float.hashCode(this.powerWeight)) * 31) + Float.hashCode(this.satisfaction)) * 31) + this.alignment.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BoardMember) {
            BoardMember boardMember = (BoardMember) other;
            return Intrinsics.areEqual(this.id, boardMember.id) && Intrinsics.areEqual(this.name, boardMember.name) && Intrinsics.areEqual(this.type, boardMember.type) && Float.compare(this.powerWeight, boardMember.powerWeight) == 0 && Float.compare(this.satisfaction, boardMember.satisfaction) == 0 && Intrinsics.areEqual(this.alignment, boardMember.alignment);
        }
        return false;
    }

    public BoardMember(@NotNull String id, @NotNull String name, @NotNull String type, float powerWeight, float satisfaction, @NotNull String alignment) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        this.id = id;
        this.name = name;
        this.type = type;
        this.powerWeight = powerWeight;
        this.satisfaction = satisfaction;
        this.alignment = alignment;
    }

    public /* synthetic */ BoardMember(String str, String str2, String str3, float f, float f2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, f, (i & 16) != 0 ? 75.0f : f2, (i & 32) != 0 ? "Neutral" : str4);
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

    public final float getPowerWeight() {
        return this.powerWeight;
    }

    public final float getSatisfaction() {
        return this.satisfaction;
    }

    @NotNull
    public final String getAlignment() {
        return this.alignment;
    }
}
