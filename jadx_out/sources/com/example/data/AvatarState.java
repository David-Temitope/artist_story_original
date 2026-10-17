package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameStateEntity.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0003JK\u0010\u001a\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\rR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/example/data/AvatarState;", "", "avatarBaseLook", "", "avatarSkinTone", "avatarHairStyleId", "avatarClothingId", "avatarJewelryId", "avatarOwnedItemIds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAvatarBaseLook", "()Ljava/lang/String;", "getAvatarSkinTone", "getAvatarHairStyleId", "getAvatarClothingId", "getAvatarJewelryId", "getAvatarOwnedItemIds", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: AvatarState.class */
public final class AvatarState {
    @NotNull
    private final String avatarBaseLook;
    @NotNull
    private final String avatarSkinTone;
    @NotNull
    private final String avatarHairStyleId;
    @NotNull
    private final String avatarClothingId;
    @NotNull
    private final String avatarJewelryId;
    @NotNull
    private final List<String> avatarOwnedItemIds;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.avatarBaseLook;
    }

    @NotNull
    public final String component2() {
        return this.avatarSkinTone;
    }

    @NotNull
    public final String component3() {
        return this.avatarHairStyleId;
    }

    @NotNull
    public final String component4() {
        return this.avatarClothingId;
    }

    @NotNull
    public final String component5() {
        return this.avatarJewelryId;
    }

    @NotNull
    public final List<String> component6() {
        return this.avatarOwnedItemIds;
    }

    @NotNull
    public final AvatarState copy(@NotNull String avatarBaseLook, @NotNull String avatarSkinTone, @NotNull String avatarHairStyleId, @NotNull String avatarClothingId, @NotNull String avatarJewelryId, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(avatarBaseLook, "avatarBaseLook");
        Intrinsics.checkNotNullParameter(avatarSkinTone, "avatarSkinTone");
        Intrinsics.checkNotNullParameter(avatarHairStyleId, "avatarHairStyleId");
        Intrinsics.checkNotNullParameter(avatarClothingId, "avatarClothingId");
        Intrinsics.checkNotNullParameter(avatarJewelryId, "avatarJewelryId");
        Intrinsics.checkNotNullParameter(list, "avatarOwnedItemIds");
        return new AvatarState(avatarBaseLook, avatarSkinTone, avatarHairStyleId, avatarClothingId, avatarJewelryId, list);
    }

    public static /* synthetic */ AvatarState copy$default(AvatarState avatarState, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = avatarState.avatarBaseLook;
        }
        if ((i & 2) != 0) {
            str2 = avatarState.avatarSkinTone;
        }
        if ((i & 4) != 0) {
            str3 = avatarState.avatarHairStyleId;
        }
        if ((i & 8) != 0) {
            str4 = avatarState.avatarClothingId;
        }
        if ((i & 16) != 0) {
            str5 = avatarState.avatarJewelryId;
        }
        if ((i & 32) != 0) {
            list = avatarState.avatarOwnedItemIds;
        }
        return avatarState.copy(str, str2, str3, str4, str5, list);
    }

    @NotNull
    public String toString() {
        return "AvatarState(avatarBaseLook=" + this.avatarBaseLook + ", avatarSkinTone=" + this.avatarSkinTone + ", avatarHairStyleId=" + this.avatarHairStyleId + ", avatarClothingId=" + this.avatarClothingId + ", avatarJewelryId=" + this.avatarJewelryId + ", avatarOwnedItemIds=" + this.avatarOwnedItemIds + ")";
    }

    public int hashCode() {
        int result = this.avatarBaseLook.hashCode();
        return (((((((((result * 31) + this.avatarSkinTone.hashCode()) * 31) + this.avatarHairStyleId.hashCode()) * 31) + this.avatarClothingId.hashCode()) * 31) + this.avatarJewelryId.hashCode()) * 31) + this.avatarOwnedItemIds.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AvatarState) {
            AvatarState avatarState = (AvatarState) other;
            return Intrinsics.areEqual(this.avatarBaseLook, avatarState.avatarBaseLook) && Intrinsics.areEqual(this.avatarSkinTone, avatarState.avatarSkinTone) && Intrinsics.areEqual(this.avatarHairStyleId, avatarState.avatarHairStyleId) && Intrinsics.areEqual(this.avatarClothingId, avatarState.avatarClothingId) && Intrinsics.areEqual(this.avatarJewelryId, avatarState.avatarJewelryId) && Intrinsics.areEqual(this.avatarOwnedItemIds, avatarState.avatarOwnedItemIds);
        }
        return false;
    }

    public AvatarState() {
        this(null, null, null, null, null, null, 63, null);
    }

    public AvatarState(@NotNull String avatarBaseLook, @NotNull String avatarSkinTone, @NotNull String avatarHairStyleId, @NotNull String avatarClothingId, @NotNull String avatarJewelryId, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(avatarBaseLook, "avatarBaseLook");
        Intrinsics.checkNotNullParameter(avatarSkinTone, "avatarSkinTone");
        Intrinsics.checkNotNullParameter(avatarHairStyleId, "avatarHairStyleId");
        Intrinsics.checkNotNullParameter(avatarClothingId, "avatarClothingId");
        Intrinsics.checkNotNullParameter(avatarJewelryId, "avatarJewelryId");
        Intrinsics.checkNotNullParameter(list, "avatarOwnedItemIds");
        this.avatarBaseLook = avatarBaseLook;
        this.avatarSkinTone = avatarSkinTone;
        this.avatarHairStyleId = avatarHairStyleId;
        this.avatarClothingId = avatarClothingId;
        this.avatarJewelryId = avatarJewelryId;
        this.avatarOwnedItemIds = list;
    }

    public /* synthetic */ AvatarState(String str, String str2, String str3, String str4, String str5, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "Androgynous" : str, (i & 2) != 0 ? "#F5C396" : str2, (i & 4) != 0 ? "hair_slick" : str3, (i & 8) != 0 ? "cloth_casual_tee" : str4, (i & 16) != 0 ? "jewel_none" : str5, (i & 32) != 0 ? CollectionsKt.listOf(new String[]{"hair_slick", "cloth_casual_tee", "jewel_none"}) : list);
    }

    @NotNull
    public final String getAvatarBaseLook() {
        return this.avatarBaseLook;
    }

    @NotNull
    public final String getAvatarSkinTone() {
        return this.avatarSkinTone;
    }

    @NotNull
    public final String getAvatarHairStyleId() {
        return this.avatarHairStyleId;
    }

    @NotNull
    public final String getAvatarClothingId() {
        return this.avatarClothingId;
    }

    @NotNull
    public final String getAvatarJewelryId() {
        return this.avatarJewelryId;
    }

    @NotNull
    public final List<String> getAvatarOwnedItemIds() {
        return this.avatarOwnedItemIds;
    }
}
