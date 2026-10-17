package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010 \n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b9\b\u0087\b\u0018��2\u00020\u0001BÏ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\r\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010;\u001a\u00020\nHÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\u0010HÆ\u0003J\t\u0010@\u001a\u00020\u0010HÆ\u0003J\t\u0010A\u001a\u00020\u0013HÆ\u0003J\t\u0010B\u001a\u00020\u0006HÆ\u0003J\u0015\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0016HÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J\t\u0010E\u001a\u00020\nHÆ\u0003J\t\u0010F\u001a\u00020\u0013HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003Já\u0001\u0010J\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00062\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00162\b\b\u0002\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010K\u001a\u00020\u00062\b\u0010L\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010M\u001a\u00020\nHÖ\u0001J\t\u0010N\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b!\u0010 R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\"R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n��\u001a\u0004\b#\u0010$R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b'\u0010&R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b(\u0010)R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b*\u0010)R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\b+\u0010,R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\b-\u0010,R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n��\u001a\u0004\b.\u0010/R\u0011\u0010\u0014\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\"R\u001d\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0016¢\u0006\b\n��\u001a\u0004\b\u0015\u00100R\u0011\u0010\u0017\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b1\u0010)R\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b2\u0010&R\u0011\u0010\u0019\u001a\u00020\u0013¢\u0006\b\n��\u001a\u0004\b3\u0010/R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b4\u0010 R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b5\u0010 R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\b\n��\u001a\u0004\b6\u0010$¨\u0006O"}, d2 = {"Lcom/example/data/Album;", "", "id", "", "title", "isEP", "", "songIds", "", "weekCreated", "", "yearCreated", "rating", "", "criticalAcclaim", "totalStreams", "", "sales", "price", "", "isReleased", "isUploadedMap", "", "hype", "weeksSinceRelease", "albumCutEarned", "marketingTier", "coverArt", "reviews", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;IIFFJJDZLjava/util/Map;FIDLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "()Z", "getSongIds", "()Ljava/util/List;", "getWeekCreated", "()I", "getYearCreated", "getRating", "()F", "getCriticalAcclaim", "getTotalStreams", "()J", "getSales", "getPrice", "()D", "()Ljava/util/Map;", "getHype", "getWeeksSinceRelease", "getAlbumCutEarned", "getMarketingTier", "getCoverArt", "getReviews", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: Album.class */
public final class Album {
    @NotNull
    private final String id;
    @NotNull
    private final String title;
    private final boolean isEP;
    @NotNull
    private final List<String> songIds;
    private final int weekCreated;
    private final int yearCreated;
    private final float rating;
    private final float criticalAcclaim;
    private final long totalStreams;
    private final long sales;
    private final double price;
    private final boolean isReleased;
    @NotNull
    private final Map<String, Long> isUploadedMap;
    private final float hype;
    private final int weeksSinceRelease;
    private final double albumCutEarned;
    @NotNull
    private final String marketingTier;
    @Nullable
    private final String coverArt;
    @NotNull
    private final List<String> reviews;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    public final boolean component3() {
        return this.isEP;
    }

    @NotNull
    public final List<String> component4() {
        return this.songIds;
    }

    public final int component5() {
        return this.weekCreated;
    }

    public final int component6() {
        return this.yearCreated;
    }

    public final float component7() {
        return this.rating;
    }

    public final float component8() {
        return this.criticalAcclaim;
    }

    public final long component9() {
        return this.totalStreams;
    }

    public final long component10() {
        return this.sales;
    }

    public final double component11() {
        return this.price;
    }

    public final boolean component12() {
        return this.isReleased;
    }

    @NotNull
    public final Map<String, Long> component13() {
        return this.isUploadedMap;
    }

    public final float component14() {
        return this.hype;
    }

    public final int component15() {
        return this.weeksSinceRelease;
    }

    public final double component16() {
        return this.albumCutEarned;
    }

    @NotNull
    public final String component17() {
        return this.marketingTier;
    }

    @Nullable
    public final String component18() {
        return this.coverArt;
    }

    @NotNull
    public final List<String> component19() {
        return this.reviews;
    }

    @NotNull
    public final Album copy(@NotNull String id, @NotNull String title, boolean isEP, @NotNull List<String> list, int weekCreated, int yearCreated, float rating, float criticalAcclaim, long totalStreams, long sales, double price, boolean isReleased, @NotNull Map<String, Long> map, float hype, int weeksSinceRelease, double albumCutEarned, @NotNull String marketingTier, @Nullable String coverArt, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(list, "songIds");
        Intrinsics.checkNotNullParameter(map, "isUploadedMap");
        Intrinsics.checkNotNullParameter(marketingTier, "marketingTier");
        Intrinsics.checkNotNullParameter(list2, "reviews");
        return new Album(id, title, isEP, list, weekCreated, yearCreated, rating, criticalAcclaim, totalStreams, sales, price, isReleased, map, hype, weeksSinceRelease, albumCutEarned, marketingTier, coverArt, list2);
    }

    public static /* synthetic */ Album copy$default(Album album, String str, String str2, boolean z, List list, int i, int i2, float f, float f2, long j, long j2, double d, boolean z2, Map map, float f3, int i3, double d2, String str3, String str4, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = album.id;
        }
        if ((i4 & 2) != 0) {
            str2 = album.title;
        }
        if ((i4 & 4) != 0) {
            z = album.isEP;
        }
        if ((i4 & 8) != 0) {
            list = album.songIds;
        }
        if ((i4 & 16) != 0) {
            i = album.weekCreated;
        }
        if ((i4 & 32) != 0) {
            i2 = album.yearCreated;
        }
        if ((i4 & 64) != 0) {
            f = album.rating;
        }
        if ((i4 & 128) != 0) {
            f2 = album.criticalAcclaim;
        }
        if ((i4 & 256) != 0) {
            j = album.totalStreams;
        }
        if ((i4 & 512) != 0) {
            j2 = album.sales;
        }
        if ((i4 & 1024) != 0) {
            d = album.price;
        }
        if ((i4 & 2048) != 0) {
            z2 = album.isReleased;
        }
        if ((i4 & 4096) != 0) {
            map = album.isUploadedMap;
        }
        if ((i4 & 8192) != 0) {
            f3 = album.hype;
        }
        if ((i4 & 16384) != 0) {
            i3 = album.weeksSinceRelease;
        }
        if ((i4 & 32768) != 0) {
            d2 = album.albumCutEarned;
        }
        if ((i4 & 65536) != 0) {
            str3 = album.marketingTier;
        }
        if ((i4 & 131072) != 0) {
            str4 = album.coverArt;
        }
        if ((i4 & 262144) != 0) {
            list2 = album.reviews;
        }
        return album.copy(str, str2, z, list, i, i2, f, f2, j, j2, d, z2, map, f3, i3, d2, str3, str4, list2);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        boolean z = this.isEP;
        List<String> list = this.songIds;
        int i = this.weekCreated;
        int i2 = this.yearCreated;
        float f = this.rating;
        float f2 = this.criticalAcclaim;
        long j = this.totalStreams;
        long j2 = this.sales;
        double d = this.price;
        boolean z2 = this.isReleased;
        Map<String, Long> map = this.isUploadedMap;
        float f3 = this.hype;
        int i3 = this.weeksSinceRelease;
        double d2 = this.albumCutEarned;
        String str3 = this.marketingTier;
        String str4 = this.coverArt;
        List<String> list2 = this.reviews;
        return "Album(id=" + str + ", title=" + str2 + ", isEP=" + z + ", songIds=" + list + ", weekCreated=" + i + ", yearCreated=" + i2 + ", rating=" + f + ", criticalAcclaim=" + f2 + ", totalStreams=" + j + ", sales=" + str + ", price=" + j2 + ", isReleased=" + str + ", isUploadedMap=" + d + ", hype=" + str + ", weeksSinceRelease=" + z2 + ", albumCutEarned=" + map + ", marketingTier=" + f3 + ", coverArt=" + i3 + ", reviews=" + d2 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((((((((((((result * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isEP)) * 31) + this.songIds.hashCode()) * 31) + Integer.hashCode(this.weekCreated)) * 31) + Integer.hashCode(this.yearCreated)) * 31) + Float.hashCode(this.rating)) * 31) + Float.hashCode(this.criticalAcclaim)) * 31) + Long.hashCode(this.totalStreams)) * 31) + Long.hashCode(this.sales)) * 31) + Double.hashCode(this.price)) * 31) + Boolean.hashCode(this.isReleased)) * 31) + this.isUploadedMap.hashCode()) * 31) + Float.hashCode(this.hype)) * 31) + Integer.hashCode(this.weeksSinceRelease)) * 31) + Double.hashCode(this.albumCutEarned)) * 31) + this.marketingTier.hashCode()) * 31) + (this.coverArt == null ? 0 : this.coverArt.hashCode())) * 31) + this.reviews.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Album) {
            Album album = (Album) other;
            return Intrinsics.areEqual(this.id, album.id) && Intrinsics.areEqual(this.title, album.title) && this.isEP == album.isEP && Intrinsics.areEqual(this.songIds, album.songIds) && this.weekCreated == album.weekCreated && this.yearCreated == album.yearCreated && Float.compare(this.rating, album.rating) == 0 && Float.compare(this.criticalAcclaim, album.criticalAcclaim) == 0 && this.totalStreams == album.totalStreams && this.sales == album.sales && Double.compare(this.price, album.price) == 0 && this.isReleased == album.isReleased && Intrinsics.areEqual(this.isUploadedMap, album.isUploadedMap) && Float.compare(this.hype, album.hype) == 0 && this.weeksSinceRelease == album.weeksSinceRelease && Double.compare(this.albumCutEarned, album.albumCutEarned) == 0 && Intrinsics.areEqual(this.marketingTier, album.marketingTier) && Intrinsics.areEqual(this.coverArt, album.coverArt) && Intrinsics.areEqual(this.reviews, album.reviews);
        }
        return false;
    }

    public Album(@NotNull String id, @NotNull String title, boolean isEP, @NotNull List<String> list, int weekCreated, int yearCreated, float rating, float criticalAcclaim, long totalStreams, long sales, double price, boolean isReleased, @NotNull Map<String, Long> map, float hype, int weeksSinceRelease, double albumCutEarned, @NotNull String marketingTier, @Nullable String coverArt, @NotNull List<String> list2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(list, "songIds");
        Intrinsics.checkNotNullParameter(map, "isUploadedMap");
        Intrinsics.checkNotNullParameter(marketingTier, "marketingTier");
        Intrinsics.checkNotNullParameter(list2, "reviews");
        this.id = id;
        this.title = title;
        this.isEP = isEP;
        this.songIds = list;
        this.weekCreated = weekCreated;
        this.yearCreated = yearCreated;
        this.rating = rating;
        this.criticalAcclaim = criticalAcclaim;
        this.totalStreams = totalStreams;
        this.sales = sales;
        this.price = price;
        this.isReleased = isReleased;
        this.isUploadedMap = map;
        this.hype = hype;
        this.weeksSinceRelease = weeksSinceRelease;
        this.albumCutEarned = albumCutEarned;
        this.marketingTier = marketingTier;
        this.coverArt = coverArt;
        this.reviews = list2;
    }

    public /* synthetic */ Album(String str, String str2, boolean z, List list, int i, int i2, float f, float f2, long j, long j2, double d, boolean z2, Map map, float f3, int i3, double d2, String str3, String str4, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, list, i, i2, f, f2, (i4 & 256) != 0 ? 0L : j, (i4 & 512) != 0 ? 0L : j2, (i4 & 1024) != 0 ? 9.99d : d, (i4 & 2048) != 0 ? false : z2, (i4 & 4096) != 0 ? MapsKt.emptyMap() : map, (i4 & 8192) != 0 ? 10.0f : f3, (i4 & 16384) != 0 ? 0 : i3, (i4 & 32768) != 0 ? 0.0d : d2, (i4 & 65536) != 0 ? "None" : str3, (i4 & 131072) != 0 ? null : str4, (i4 & 262144) != 0 ? CollectionsKt.emptyList() : list2);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final boolean isEP() {
        return this.isEP;
    }

    @NotNull
    public final List<String> getSongIds() {
        return this.songIds;
    }

    public final int getWeekCreated() {
        return this.weekCreated;
    }

    public final int getYearCreated() {
        return this.yearCreated;
    }

    public final float getRating() {
        return this.rating;
    }

    public final float getCriticalAcclaim() {
        return this.criticalAcclaim;
    }

    public final long getTotalStreams() {
        return this.totalStreams;
    }

    public final long getSales() {
        return this.sales;
    }

    public final double getPrice() {
        return this.price;
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    @NotNull
    public final Map<String, Long> isUploadedMap() {
        return this.isUploadedMap;
    }

    public final float getHype() {
        return this.hype;
    }

    public final int getWeeksSinceRelease() {
        return this.weeksSinceRelease;
    }

    public final double getAlbumCutEarned() {
        return this.albumCutEarned;
    }

    @NotNull
    public final String getMarketingTier() {
        return this.marketingTier;
    }

    @Nullable
    public final String getCoverArt() {
        return this.coverArt;
    }

    @NotNull
    public final List<String> getReviews() {
        return this.reviews;
    }
}
