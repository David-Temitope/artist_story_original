package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameStateEntity.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000e\n��\b\u0087\b\u0018��2\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jm\u0010&\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0011¨\u0006,"}, d2 = {"Lcom/example/data/LegacyMilestones;", "", "hasWikipediaPage", "", "hasHallOfFame", "hasMuseum", "hasDocumentary", "hasBiography", "hasNetflixSeries", "hasScholarships", "artistsInspiredCount", "", "receivedGovernorPitch", "receivedSenatorPitch", "<init>", "(ZZZZZZZIZZ)V", "getHasWikipediaPage", "()Z", "getHasHallOfFame", "getHasMuseum", "getHasDocumentary", "getHasBiography", "getHasNetflixSeries", "getHasScholarships", "getArtistsInspiredCount", "()I", "getReceivedGovernorPitch", "getReceivedSenatorPitch", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "", "app"})
/* loaded from: LegacyMilestones.class */
public final class LegacyMilestones {
    private final boolean hasWikipediaPage;
    private final boolean hasHallOfFame;
    private final boolean hasMuseum;
    private final boolean hasDocumentary;
    private final boolean hasBiography;
    private final boolean hasNetflixSeries;
    private final boolean hasScholarships;
    private final int artistsInspiredCount;
    private final boolean receivedGovernorPitch;
    private final boolean receivedSenatorPitch;
    public static final int $stable = 0;

    public final boolean component1() {
        return this.hasWikipediaPage;
    }

    public final boolean component2() {
        return this.hasHallOfFame;
    }

    public final boolean component3() {
        return this.hasMuseum;
    }

    public final boolean component4() {
        return this.hasDocumentary;
    }

    public final boolean component5() {
        return this.hasBiography;
    }

    public final boolean component6() {
        return this.hasNetflixSeries;
    }

    public final boolean component7() {
        return this.hasScholarships;
    }

    public final int component8() {
        return this.artistsInspiredCount;
    }

    public final boolean component9() {
        return this.receivedGovernorPitch;
    }

    public final boolean component10() {
        return this.receivedSenatorPitch;
    }

    @NotNull
    public final LegacyMilestones copy(boolean hasWikipediaPage, boolean hasHallOfFame, boolean hasMuseum, boolean hasDocumentary, boolean hasBiography, boolean hasNetflixSeries, boolean hasScholarships, int artistsInspiredCount, boolean receivedGovernorPitch, boolean receivedSenatorPitch) {
        return new LegacyMilestones(hasWikipediaPage, hasHallOfFame, hasMuseum, hasDocumentary, hasBiography, hasNetflixSeries, hasScholarships, artistsInspiredCount, receivedGovernorPitch, receivedSenatorPitch);
    }

    public static /* synthetic */ LegacyMilestones copy$default(LegacyMilestones legacyMilestones, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, boolean z8, boolean z9, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = legacyMilestones.hasWikipediaPage;
        }
        if ((i2 & 2) != 0) {
            z2 = legacyMilestones.hasHallOfFame;
        }
        if ((i2 & 4) != 0) {
            z3 = legacyMilestones.hasMuseum;
        }
        if ((i2 & 8) != 0) {
            z4 = legacyMilestones.hasDocumentary;
        }
        if ((i2 & 16) != 0) {
            z5 = legacyMilestones.hasBiography;
        }
        if ((i2 & 32) != 0) {
            z6 = legacyMilestones.hasNetflixSeries;
        }
        if ((i2 & 64) != 0) {
            z7 = legacyMilestones.hasScholarships;
        }
        if ((i2 & 128) != 0) {
            i = legacyMilestones.artistsInspiredCount;
        }
        if ((i2 & 256) != 0) {
            z8 = legacyMilestones.receivedGovernorPitch;
        }
        if ((i2 & 512) != 0) {
            z9 = legacyMilestones.receivedSenatorPitch;
        }
        return legacyMilestones.copy(z, z2, z3, z4, z5, z6, z7, i, z8, z9);
    }

    @NotNull
    public String toString() {
        return "LegacyMilestones(hasWikipediaPage=" + this.hasWikipediaPage + ", hasHallOfFame=" + this.hasHallOfFame + ", hasMuseum=" + this.hasMuseum + ", hasDocumentary=" + this.hasDocumentary + ", hasBiography=" + this.hasBiography + ", hasNetflixSeries=" + this.hasNetflixSeries + ", hasScholarships=" + this.hasScholarships + ", artistsInspiredCount=" + this.artistsInspiredCount + ", receivedGovernorPitch=" + this.receivedGovernorPitch + ", receivedSenatorPitch=" + this.receivedSenatorPitch + ")";
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.hasWikipediaPage);
        return (((((((((((((((((result * 31) + Boolean.hashCode(this.hasHallOfFame)) * 31) + Boolean.hashCode(this.hasMuseum)) * 31) + Boolean.hashCode(this.hasDocumentary)) * 31) + Boolean.hashCode(this.hasBiography)) * 31) + Boolean.hashCode(this.hasNetflixSeries)) * 31) + Boolean.hashCode(this.hasScholarships)) * 31) + Integer.hashCode(this.artistsInspiredCount)) * 31) + Boolean.hashCode(this.receivedGovernorPitch)) * 31) + Boolean.hashCode(this.receivedSenatorPitch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof LegacyMilestones) {
            LegacyMilestones legacyMilestones = (LegacyMilestones) other;
            return this.hasWikipediaPage == legacyMilestones.hasWikipediaPage && this.hasHallOfFame == legacyMilestones.hasHallOfFame && this.hasMuseum == legacyMilestones.hasMuseum && this.hasDocumentary == legacyMilestones.hasDocumentary && this.hasBiography == legacyMilestones.hasBiography && this.hasNetflixSeries == legacyMilestones.hasNetflixSeries && this.hasScholarships == legacyMilestones.hasScholarships && this.artistsInspiredCount == legacyMilestones.artistsInspiredCount && this.receivedGovernorPitch == legacyMilestones.receivedGovernorPitch && this.receivedSenatorPitch == legacyMilestones.receivedSenatorPitch;
        }
        return false;
    }

    public LegacyMilestones() {
        this(false, false, false, false, false, false, false, 0, false, false, 1023, null);
    }

    public LegacyMilestones(boolean hasWikipediaPage, boolean hasHallOfFame, boolean hasMuseum, boolean hasDocumentary, boolean hasBiography, boolean hasNetflixSeries, boolean hasScholarships, int artistsInspiredCount, boolean receivedGovernorPitch, boolean receivedSenatorPitch) {
        this.hasWikipediaPage = hasWikipediaPage;
        this.hasHallOfFame = hasHallOfFame;
        this.hasMuseum = hasMuseum;
        this.hasDocumentary = hasDocumentary;
        this.hasBiography = hasBiography;
        this.hasNetflixSeries = hasNetflixSeries;
        this.hasScholarships = hasScholarships;
        this.artistsInspiredCount = artistsInspiredCount;
        this.receivedGovernorPitch = receivedGovernorPitch;
        this.receivedSenatorPitch = receivedSenatorPitch;
    }

    public /* synthetic */ LegacyMilestones(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, boolean z8, boolean z9, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? false : z3, (i2 & 8) != 0 ? false : z4, (i2 & 16) != 0 ? false : z5, (i2 & 32) != 0 ? false : z6, (i2 & 64) != 0 ? false : z7, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? false : z8, (i2 & 512) != 0 ? false : z9);
    }

    public final boolean getHasWikipediaPage() {
        return this.hasWikipediaPage;
    }

    public final boolean getHasHallOfFame() {
        return this.hasHallOfFame;
    }

    public final boolean getHasMuseum() {
        return this.hasMuseum;
    }

    public final boolean getHasDocumentary() {
        return this.hasDocumentary;
    }

    public final boolean getHasBiography() {
        return this.hasBiography;
    }

    public final boolean getHasNetflixSeries() {
        return this.hasNetflixSeries;
    }

    public final boolean getHasScholarships() {
        return this.hasScholarships;
    }

    public final int getArtistsInspiredCount() {
        return this.artistsInspiredCount;
    }

    public final boolean getReceivedGovernorPitch() {
        return this.receivedGovernorPitch;
    }

    public final boolean getReceivedSenatorPitch() {
        return this.receivedSenatorPitch;
    }
}
