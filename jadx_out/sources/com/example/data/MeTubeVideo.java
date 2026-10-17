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
/* compiled from: Models.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\nHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u007f\u0010/\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u000eHÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b!\u0010 R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\"\u0010\u0015R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b#\u0010\u0015¨\u00065"}, d2 = {"Lcom/example/data/MeTubeVideo;", "", "id", "", "title", "type", "views", "", "likes", "comments", "", "revenueEarned", "", "weekPublished", "", "yearPublished", "thumbnailId", "artistName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/util/List;DIILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getTitle", "getType", "getViews", "()J", "getLikes", "getComments", "()Ljava/util/List;", "getRevenueEarned", "()D", "getWeekPublished", "()I", "getYearPublished", "getThumbnailId", "getArtistName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: MeTubeVideo.class */
public final class MeTubeVideo {
    @NotNull
    private final String id;
    @NotNull
    private final String title;
    @NotNull
    private final String type;
    private final long views;
    private final long likes;
    @NotNull
    private final List<String> comments;
    private final double revenueEarned;
    private final int weekPublished;
    private final int yearPublished;
    @NotNull
    private final String thumbnailId;
    @Nullable
    private final String artistName;
    public static final int $stable = 8;

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
        return this.type;
    }

    public final long component4() {
        return this.views;
    }

    public final long component5() {
        return this.likes;
    }

    @NotNull
    public final List<String> component6() {
        return this.comments;
    }

    public final double component7() {
        return this.revenueEarned;
    }

    public final int component8() {
        return this.weekPublished;
    }

    public final int component9() {
        return this.yearPublished;
    }

    @NotNull
    public final String component10() {
        return this.thumbnailId;
    }

    @Nullable
    public final String component11() {
        return this.artistName;
    }

    @NotNull
    public final MeTubeVideo copy(@NotNull String id, @NotNull String title, @NotNull String type, long views, long likes, @NotNull List<String> list, double revenueEarned, int weekPublished, int yearPublished, @NotNull String thumbnailId, @Nullable String artistName) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(list, "comments");
        Intrinsics.checkNotNullParameter(thumbnailId, "thumbnailId");
        return new MeTubeVideo(id, title, type, views, likes, list, revenueEarned, weekPublished, yearPublished, thumbnailId, artistName);
    }

    public static /* synthetic */ MeTubeVideo copy$default(MeTubeVideo meTubeVideo, String str, String str2, String str3, long j, long j2, List list, double d, int i, int i2, String str4, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = meTubeVideo.id;
        }
        if ((i3 & 2) != 0) {
            str2 = meTubeVideo.title;
        }
        if ((i3 & 4) != 0) {
            str3 = meTubeVideo.type;
        }
        if ((i3 & 8) != 0) {
            j = meTubeVideo.views;
        }
        if ((i3 & 16) != 0) {
            j2 = meTubeVideo.likes;
        }
        if ((i3 & 32) != 0) {
            list = meTubeVideo.comments;
        }
        if ((i3 & 64) != 0) {
            d = meTubeVideo.revenueEarned;
        }
        if ((i3 & 128) != 0) {
            i = meTubeVideo.weekPublished;
        }
        if ((i3 & 256) != 0) {
            i2 = meTubeVideo.yearPublished;
        }
        if ((i3 & 512) != 0) {
            str4 = meTubeVideo.thumbnailId;
        }
        if ((i3 & 1024) != 0) {
            str5 = meTubeVideo.artistName;
        }
        return meTubeVideo.copy(str, str2, str3, j, j2, list, d, i, i2, str4, str5);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.type;
        long j = this.views;
        long j2 = this.likes;
        List<String> list = this.comments;
        double d = this.revenueEarned;
        int i = this.weekPublished;
        int i2 = this.yearPublished;
        String str4 = this.thumbnailId;
        String str5 = this.artistName;
        return "MeTubeVideo(id=" + str + ", title=" + str2 + ", type=" + str3 + ", views=" + j + ", likes=" + str + ", comments=" + j2 + ", revenueEarned=" + str + ", weekPublished=" + list + ", yearPublished=" + d + ", thumbnailId=" + str + ", artistName=" + i + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((result * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31) + Long.hashCode(this.views)) * 31) + Long.hashCode(this.likes)) * 31) + this.comments.hashCode()) * 31) + Double.hashCode(this.revenueEarned)) * 31) + Integer.hashCode(this.weekPublished)) * 31) + Integer.hashCode(this.yearPublished)) * 31) + this.thumbnailId.hashCode()) * 31) + (this.artistName == null ? 0 : this.artistName.hashCode());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MeTubeVideo) {
            MeTubeVideo meTubeVideo = (MeTubeVideo) other;
            return Intrinsics.areEqual(this.id, meTubeVideo.id) && Intrinsics.areEqual(this.title, meTubeVideo.title) && Intrinsics.areEqual(this.type, meTubeVideo.type) && this.views == meTubeVideo.views && this.likes == meTubeVideo.likes && Intrinsics.areEqual(this.comments, meTubeVideo.comments) && Double.compare(this.revenueEarned, meTubeVideo.revenueEarned) == 0 && this.weekPublished == meTubeVideo.weekPublished && this.yearPublished == meTubeVideo.yearPublished && Intrinsics.areEqual(this.thumbnailId, meTubeVideo.thumbnailId) && Intrinsics.areEqual(this.artistName, meTubeVideo.artistName);
        }
        return false;
    }

    public MeTubeVideo(@NotNull String id, @NotNull String title, @NotNull String type, long views, long likes, @NotNull List<String> list, double revenueEarned, int weekPublished, int yearPublished, @NotNull String thumbnailId, @Nullable String artistName) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(list, "comments");
        Intrinsics.checkNotNullParameter(thumbnailId, "thumbnailId");
        this.id = id;
        this.title = title;
        this.type = type;
        this.views = views;
        this.likes = likes;
        this.comments = list;
        this.revenueEarned = revenueEarned;
        this.weekPublished = weekPublished;
        this.yearPublished = yearPublished;
        this.thumbnailId = thumbnailId;
        this.artistName = artistName;
    }

    public /* synthetic */ MeTubeVideo(String str, String str2, String str3, long j, long j2, List list, double d, int i, int i2, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, j, j2, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? 0.0d : d, i, i2, (i3 & 512) != 0 ? "ic_video" : str4, (i3 & 1024) != 0 ? null : str5);
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
    public final String getType() {
        return this.type;
    }

    public final long getViews() {
        return this.views;
    }

    public final long getLikes() {
        return this.likes;
    }

    @NotNull
    public final List<String> getComments() {
        return this.comments;
    }

    public final double getRevenueEarned() {
        return this.revenueEarned;
    }

    public final int getWeekPublished() {
        return this.weekPublished;
    }

    public final int getYearPublished() {
        return this.yearPublished;
    }

    @NotNull
    public final String getThumbnailId() {
        return this.thumbnailId;
    }

    @Nullable
    public final String getArtistName() {
        return this.artistName;
    }
}
