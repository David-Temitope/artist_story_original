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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JY\u0010$\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lcom/example/data/ArtistSigningOffer;", "", "id", "", "artistId", "artistName", "requestedRevenueShare", "", "requestedSigningBonus", "", "contractDurationWeeks", "", "weeklyExpenseLimit", "preferredGenre", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FDIDLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getArtistId", "getArtistName", "getRequestedRevenueShare", "()F", "getRequestedSigningBonus", "()D", "getContractDurationWeeks", "()I", "getWeeklyExpenseLimit", "getPreferredGenre", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: ArtistSigningOffer.class */
public final class ArtistSigningOffer {
    @NotNull
    private final String id;
    @NotNull
    private final String artistId;
    @NotNull
    private final String artistName;
    private final float requestedRevenueShare;
    private final double requestedSigningBonus;
    private final int contractDurationWeeks;
    private final double weeklyExpenseLimit;
    @NotNull
    private final String preferredGenre;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.artistId;
    }

    @NotNull
    public final String component3() {
        return this.artistName;
    }

    public final float component4() {
        return this.requestedRevenueShare;
    }

    public final double component5() {
        return this.requestedSigningBonus;
    }

    public final int component6() {
        return this.contractDurationWeeks;
    }

    public final double component7() {
        return this.weeklyExpenseLimit;
    }

    @NotNull
    public final String component8() {
        return this.preferredGenre;
    }

    @NotNull
    public final ArtistSigningOffer copy(@NotNull String id, @NotNull String artistId, @NotNull String artistName, float requestedRevenueShare, double requestedSigningBonus, int contractDurationWeeks, double weeklyExpenseLimit, @NotNull String preferredGenre) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(artistId, "artistId");
        Intrinsics.checkNotNullParameter(artistName, "artistName");
        Intrinsics.checkNotNullParameter(preferredGenre, "preferredGenre");
        return new ArtistSigningOffer(id, artistId, artistName, requestedRevenueShare, requestedSigningBonus, contractDurationWeeks, weeklyExpenseLimit, preferredGenre);
    }

    public static /* synthetic */ ArtistSigningOffer copy$default(ArtistSigningOffer artistSigningOffer, String str, String str2, String str3, float f, double d, int i, double d2, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = artistSigningOffer.id;
        }
        if ((i2 & 2) != 0) {
            str2 = artistSigningOffer.artistId;
        }
        if ((i2 & 4) != 0) {
            str3 = artistSigningOffer.artistName;
        }
        if ((i2 & 8) != 0) {
            f = artistSigningOffer.requestedRevenueShare;
        }
        if ((i2 & 16) != 0) {
            d = artistSigningOffer.requestedSigningBonus;
        }
        if ((i2 & 32) != 0) {
            i = artistSigningOffer.contractDurationWeeks;
        }
        if ((i2 & 64) != 0) {
            d2 = artistSigningOffer.weeklyExpenseLimit;
        }
        if ((i2 & 128) != 0) {
            str4 = artistSigningOffer.preferredGenre;
        }
        return artistSigningOffer.copy(str, str2, str3, f, d, i, d2, str4);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.artistId;
        String str3 = this.artistName;
        float f = this.requestedRevenueShare;
        double d = this.requestedSigningBonus;
        int i = this.contractDurationWeeks;
        double d2 = this.weeklyExpenseLimit;
        String str4 = this.preferredGenre;
        return "ArtistSigningOffer(id=" + str + ", artistId=" + str2 + ", artistName=" + str3 + ", requestedRevenueShare=" + f + ", requestedSigningBonus=" + d + ", contractDurationWeeks=" + str + ", weeklyExpenseLimit=" + i + ", preferredGenre=" + d2 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((result * 31) + this.artistId.hashCode()) * 31) + this.artistName.hashCode()) * 31) + Float.hashCode(this.requestedRevenueShare)) * 31) + Double.hashCode(this.requestedSigningBonus)) * 31) + Integer.hashCode(this.contractDurationWeeks)) * 31) + Double.hashCode(this.weeklyExpenseLimit)) * 31) + this.preferredGenre.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ArtistSigningOffer) {
            ArtistSigningOffer artistSigningOffer = (ArtistSigningOffer) other;
            return Intrinsics.areEqual(this.id, artistSigningOffer.id) && Intrinsics.areEqual(this.artistId, artistSigningOffer.artistId) && Intrinsics.areEqual(this.artistName, artistSigningOffer.artistName) && Float.compare(this.requestedRevenueShare, artistSigningOffer.requestedRevenueShare) == 0 && Double.compare(this.requestedSigningBonus, artistSigningOffer.requestedSigningBonus) == 0 && this.contractDurationWeeks == artistSigningOffer.contractDurationWeeks && Double.compare(this.weeklyExpenseLimit, artistSigningOffer.weeklyExpenseLimit) == 0 && Intrinsics.areEqual(this.preferredGenre, artistSigningOffer.preferredGenre);
        }
        return false;
    }

    public ArtistSigningOffer(@NotNull String id, @NotNull String artistId, @NotNull String artistName, float requestedRevenueShare, double requestedSigningBonus, int contractDurationWeeks, double weeklyExpenseLimit, @NotNull String preferredGenre) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(artistId, "artistId");
        Intrinsics.checkNotNullParameter(artistName, "artistName");
        Intrinsics.checkNotNullParameter(preferredGenre, "preferredGenre");
        this.id = id;
        this.artistId = artistId;
        this.artistName = artistName;
        this.requestedRevenueShare = requestedRevenueShare;
        this.requestedSigningBonus = requestedSigningBonus;
        this.contractDurationWeeks = contractDurationWeeks;
        this.weeklyExpenseLimit = weeklyExpenseLimit;
        this.preferredGenre = preferredGenre;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getArtistId() {
        return this.artistId;
    }

    @NotNull
    public final String getArtistName() {
        return this.artistName;
    }

    public final float getRequestedRevenueShare() {
        return this.requestedRevenueShare;
    }

    public final double getRequestedSigningBonus() {
        return this.requestedSigningBonus;
    }

    public final int getContractDurationWeeks() {
        return this.contractDurationWeeks;
    }

    public final double getWeeklyExpenseLimit() {
        return this.weeklyExpenseLimit;
    }

    @NotNull
    public final String getPreferredGenre() {
        return this.preferredGenre;
    }
}
