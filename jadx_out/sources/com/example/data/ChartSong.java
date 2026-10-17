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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n��\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b*\b\u0087\b\u0018��2\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\tHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000eHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u0012HÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\u000eHÆ\u0003J\u0095\u0001\u00107\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000eHÆ\u0001J\u0013\u00108\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020\u000eHÖ\u0001J\t\u0010;\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u001f\u0010 R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b!\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b$\u0010#R\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b%\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n��\u001a\u0004\b\u0011\u0010&R\u0011\u0010\u0013\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b'\u0010#R\u0011\u0010\u0014\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b(\u0010#¨\u0006<"}, d2 = {"Lcom/example/data/ChartSong;", "", "id", "", "title", "artistName", "artistId", "genreName", "rating", "", "weeklyStreams", "", "totalStreams", "weeksOnChart", "", "peakRank", "currentRank", "isPlayer", "", "releasedWeek", "releasedYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FJJIIIZII)V", "getId", "()Ljava/lang/String;", "getTitle", "getArtistName", "getArtistId", "getGenreName", "getRating", "()F", "getWeeklyStreams", "()J", "getTotalStreams", "getWeeksOnChart", "()I", "getPeakRank", "getCurrentRank", "()Z", "getReleasedWeek", "getReleasedYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: ChartSong.class */
public final class ChartSong {
    @NotNull
    private final String id;
    @NotNull
    private final String title;
    @NotNull
    private final String artistName;
    @NotNull
    private final String artistId;
    @NotNull
    private final String genreName;
    private final float rating;
    private final long weeklyStreams;
    private final long totalStreams;
    private final int weeksOnChart;
    private final int peakRank;
    private final int currentRank;
    private final boolean isPlayer;
    private final int releasedWeek;
    private final int releasedYear;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.artistName;
    }

    @NotNull
    public final String component4() {
        return this.artistId;
    }

    @NotNull
    public final String component5() {
        return this.genreName;
    }

    public final float component6() {
        return this.rating;
    }

    public final long component7() {
        return this.weeklyStreams;
    }

    public final long component8() {
        return this.totalStreams;
    }

    public final int component9() {
        return this.weeksOnChart;
    }

    public final int component10() {
        return this.peakRank;
    }

    public final int component11() {
        return this.currentRank;
    }

    public final boolean component12() {
        return this.isPlayer;
    }

    public final int component13() {
        return this.releasedWeek;
    }

    public final int component14() {
        return this.releasedYear;
    }

    @NotNull
    public final ChartSong copy(@NotNull String id, @NotNull String title, @NotNull String artistName, @NotNull String artistId, @NotNull String genreName, float rating, long weeklyStreams, long totalStreams, int weeksOnChart, int peakRank, int currentRank, boolean isPlayer, int releasedWeek, int releasedYear) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(artistName, "artistName");
        Intrinsics.checkNotNullParameter(artistId, "artistId");
        Intrinsics.checkNotNullParameter(genreName, "genreName");
        return new ChartSong(id, title, artistName, artistId, genreName, rating, weeklyStreams, totalStreams, weeksOnChart, peakRank, currentRank, isPlayer, releasedWeek, releasedYear);
    }

    public static /* synthetic */ ChartSong copy$default(ChartSong chartSong, String str, String str2, String str3, String str4, String str5, float f, long j, long j2, int i, int i2, int i3, boolean z, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            str = chartSong.id;
        }
        if ((i6 & 2) != 0) {
            str2 = chartSong.title;
        }
        if ((i6 & 4) != 0) {
            str3 = chartSong.artistName;
        }
        if ((i6 & 8) != 0) {
            str4 = chartSong.artistId;
        }
        if ((i6 & 16) != 0) {
            str5 = chartSong.genreName;
        }
        if ((i6 & 32) != 0) {
            f = chartSong.rating;
        }
        if ((i6 & 64) != 0) {
            j = chartSong.weeklyStreams;
        }
        if ((i6 & 128) != 0) {
            j2 = chartSong.totalStreams;
        }
        if ((i6 & 256) != 0) {
            i = chartSong.weeksOnChart;
        }
        if ((i6 & 512) != 0) {
            i2 = chartSong.peakRank;
        }
        if ((i6 & 1024) != 0) {
            i3 = chartSong.currentRank;
        }
        if ((i6 & 2048) != 0) {
            z = chartSong.isPlayer;
        }
        if ((i6 & 4096) != 0) {
            i4 = chartSong.releasedWeek;
        }
        if ((i6 & 8192) != 0) {
            i5 = chartSong.releasedYear;
        }
        return chartSong.copy(str, str2, str3, str4, str5, f, j, j2, i, i2, i3, z, i4, i5);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.artistName;
        String str4 = this.artistId;
        String str5 = this.genreName;
        float f = this.rating;
        long j = this.weeklyStreams;
        long j2 = this.totalStreams;
        int i = this.weeksOnChart;
        int i2 = this.peakRank;
        int i3 = this.currentRank;
        boolean z = this.isPlayer;
        int i4 = this.releasedWeek;
        int i5 = this.releasedYear;
        return "ChartSong(id=" + str + ", title=" + str2 + ", artistName=" + str3 + ", artistId=" + str4 + ", genreName=" + str5 + ", rating=" + f + ", weeklyStreams=" + j + ", totalStreams=" + str + ", weeksOnChart=" + j2 + ", peakRank=" + str + ", currentRank=" + i + ", isPlayer=" + i2 + ", releasedWeek=" + i3 + ", releasedYear=" + z + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((result * 31) + this.title.hashCode()) * 31) + this.artistName.hashCode()) * 31) + this.artistId.hashCode()) * 31) + this.genreName.hashCode()) * 31) + Float.hashCode(this.rating)) * 31) + Long.hashCode(this.weeklyStreams)) * 31) + Long.hashCode(this.totalStreams)) * 31) + Integer.hashCode(this.weeksOnChart)) * 31) + Integer.hashCode(this.peakRank)) * 31) + Integer.hashCode(this.currentRank)) * 31) + Boolean.hashCode(this.isPlayer)) * 31) + Integer.hashCode(this.releasedWeek)) * 31) + Integer.hashCode(this.releasedYear);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ChartSong) {
            ChartSong chartSong = (ChartSong) other;
            return Intrinsics.areEqual(this.id, chartSong.id) && Intrinsics.areEqual(this.title, chartSong.title) && Intrinsics.areEqual(this.artistName, chartSong.artistName) && Intrinsics.areEqual(this.artistId, chartSong.artistId) && Intrinsics.areEqual(this.genreName, chartSong.genreName) && Float.compare(this.rating, chartSong.rating) == 0 && this.weeklyStreams == chartSong.weeklyStreams && this.totalStreams == chartSong.totalStreams && this.weeksOnChart == chartSong.weeksOnChart && this.peakRank == chartSong.peakRank && this.currentRank == chartSong.currentRank && this.isPlayer == chartSong.isPlayer && this.releasedWeek == chartSong.releasedWeek && this.releasedYear == chartSong.releasedYear;
        }
        return false;
    }

    public ChartSong(@NotNull String id, @NotNull String title, @NotNull String artistName, @NotNull String artistId, @NotNull String genreName, float rating, long weeklyStreams, long totalStreams, int weeksOnChart, int peakRank, int currentRank, boolean isPlayer, int releasedWeek, int releasedYear) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(artistName, "artistName");
        Intrinsics.checkNotNullParameter(artistId, "artistId");
        Intrinsics.checkNotNullParameter(genreName, "genreName");
        this.id = id;
        this.title = title;
        this.artistName = artistName;
        this.artistId = artistId;
        this.genreName = genreName;
        this.rating = rating;
        this.weeklyStreams = weeklyStreams;
        this.totalStreams = totalStreams;
        this.weeksOnChart = weeksOnChart;
        this.peakRank = peakRank;
        this.currentRank = currentRank;
        this.isPlayer = isPlayer;
        this.releasedWeek = releasedWeek;
        this.releasedYear = releasedYear;
    }

    public /* synthetic */ ChartSong(String str, String str2, String str3, String str4, String str5, float f, long j, long j2, int i, int i2, int i3, boolean z, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, f, j, j2, i, i2, (i6 & 1024) != 0 ? 0 : i3, (i6 & 2048) != 0 ? false : z, i4, i5);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getArtistName() {
        return this.artistName;
    }

    @NotNull
    public final String getArtistId() {
        return this.artistId;
    }

    @NotNull
    public final String getGenreName() {
        return this.genreName;
    }

    public final float getRating() {
        return this.rating;
    }

    public final long getWeeklyStreams() {
        return this.weeklyStreams;
    }

    public final long getTotalStreams() {
        return this.totalStreams;
    }

    public final int getWeeksOnChart() {
        return this.weeksOnChart;
    }

    public final int getPeakRank() {
        return this.peakRank;
    }

    public final int getCurrentRank() {
        return this.currentRank;
    }

    public final boolean isPlayer() {
        return this.isPlayer;
    }

    public final int getReleasedWeek() {
        return this.releasedWeek;
    }

    public final int getReleasedYear() {
        return this.releasedYear;
    }
}
