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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\bK\b\u0087\b\u0018��2\u00020\u0001BÏ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\r\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\u0018\u0012\b\b\u0002\u0010'\u001a\u00020\u0018\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)¢\u0006\u0004\b*\u0010+J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010T\u001a\u00020\nHÆ\u0003J\u0015\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010V\u001a\u00020\rHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010X\u001a\u00020\u0011HÆ\u0003J\t\u0010Y\u001a\u00020\u0011HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0011HÆ\u0003J\t\u0010\\\u001a\u00020\nHÆ\u0003J\t\u0010]\u001a\u00020\u0011HÆ\u0003J\t\u0010^\u001a\u00020\u0018HÆ\u0003J\t\u0010_\u001a\u00020\u0011HÆ\u0003J\t\u0010`\u001a\u00020\rHÆ\u0003J\t\u0010a\u001a\u00020\u0018HÆ\u0003J\t\u0010b\u001a\u00020\u0018HÆ\u0003J\t\u0010c\u001a\u00020\nHÆ\u0003J\t\u0010d\u001a\u00020\u0011HÆ\u0003J\t\u0010e\u001a\u00020\u0011HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020\u0003HÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0018HÆ\u0003J\t\u0010m\u001a\u00020\u0018HÆ\u0003J\u000f\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00030)HÆ\u0003Já\u0002\u0010o\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020\u00182\b\b\u0002\u0010'\u001a\u00020\u00182\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)HÆ\u0001J\u0013\u0010p\u001a\u00020\u00182\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020\u0011HÖ\u0001J\t\u0010s\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b,\u0010-R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b.\u0010-R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b/\u0010-R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b0\u00101R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b2\u0010-R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b3\u00104R\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n��\u001a\u0004\b\u000b\u00105R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b6\u00107R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b8\u0010-R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n��\u001a\u0004\b9\u0010:R\u0011\u0010\u0012\u001a\u00020\u0011¢\u0006\b\n��\u001a\u0004\b;\u0010:R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b<\u0010-R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n��\u001a\u0004\b=\u0010:R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b>\u00104R\u0011\u0010\u0016\u001a\u00020\u0011¢\u0006\b\n��\u001a\u0004\b?\u0010:R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b\n��\u001a\u0004\b\u0017\u0010@R\u0011\u0010\u0019\u001a\u00020\u0011¢\u0006\b\n��\u001a\u0004\bA\u0010:R\u0011\u0010\u001a\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\bB\u00107R\u0011\u0010\u001b\u001a\u00020\u0018¢\u0006\b\n��\u001a\u0004\b\u001b\u0010@R\u0011\u0010\u001c\u001a\u00020\u0018¢\u0006\b\n��\u001a\u0004\b\u001c\u0010@R\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\bC\u00104R\u0011\u0010\u001e\u001a\u00020\u0011¢\u0006\b\n��\u001a\u0004\bD\u0010:R\u0011\u0010\u001f\u001a\u00020\u0011¢\u0006\b\n��\u001a\u0004\bE\u0010:R\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bF\u0010-R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bG\u0010-R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bH\u0010-R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bI\u0010-R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bJ\u0010-R\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\bK\u0010-R\u0011\u0010&\u001a\u00020\u0018¢\u0006\b\n��\u001a\u0004\b&\u0010@R\u0011\u0010'\u001a\u00020\u0018¢\u0006\b\n��\u001a\u0004\bL\u0010@R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)¢\u0006\b\n��\u001a\u0004\bM\u0010N¨\u0006t"}, d2 = {"Lcom/example/data/Song;", "", "id", "", "title", "genreId", "budget", "", "producerId", "rating", "", "isUploadedMap", "", "", "totalStreams", "videoTier", "weekCreated", "", "yearCreated", "licenseType", "promoWeeksLeft", "promoWeeklyBoost", "playlistsCount", "isGlobal", "", "weeksSinceRelease", "peakStreams", "isViral", "isReleased", "hype", "weeksUntilRelease", "initialHypeWeeksSet", "soundEngineerQuality", "mixingStyle", "backingVocalists", "studioDecor", "producerTier", "coverArt", "isCopyrightRegistered", "hasSampleClearance", "audienceFeedback", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;FLjava/util/Map;JLjava/lang/String;IILjava/lang/String;IFIZIJZZFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)V", "getId", "()Ljava/lang/String;", "getTitle", "getGenreId", "getBudget", "()D", "getProducerId", "getRating", "()F", "()Ljava/util/Map;", "getTotalStreams", "()J", "getVideoTier", "getWeekCreated", "()I", "getYearCreated", "getLicenseType", "getPromoWeeksLeft", "getPromoWeeklyBoost", "getPlaylistsCount", "()Z", "getWeeksSinceRelease", "getPeakStreams", "getHype", "getWeeksUntilRelease", "getInitialHypeWeeksSet", "getSoundEngineerQuality", "getMixingStyle", "getBackingVocalists", "getStudioDecor", "getProducerTier", "getCoverArt", "getHasSampleClearance", "getAudienceFeedback", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: Song.class */
public final class Song {
    @NotNull
    private final String id;
    @NotNull
    private final String title;
    @NotNull
    private final String genreId;
    private final double budget;
    @Nullable
    private final String producerId;
    private final float rating;
    @NotNull
    private final Map<String, Long> isUploadedMap;
    private final long totalStreams;
    @Nullable
    private final String videoTier;
    private final int weekCreated;
    private final int yearCreated;
    @NotNull
    private final String licenseType;
    private final int promoWeeksLeft;
    private final float promoWeeklyBoost;
    private final int playlistsCount;
    private final boolean isGlobal;
    private final int weeksSinceRelease;
    private final long peakStreams;
    private final boolean isViral;
    private final boolean isReleased;
    private final float hype;
    private final int weeksUntilRelease;
    private final int initialHypeWeeksSet;
    @NotNull
    private final String soundEngineerQuality;
    @NotNull
    private final String mixingStyle;
    @NotNull
    private final String backingVocalists;
    @NotNull
    private final String studioDecor;
    @NotNull
    private final String producerTier;
    @Nullable
    private final String coverArt;
    private final boolean isCopyrightRegistered;
    private final boolean hasSampleClearance;
    @NotNull
    private final List<String> audienceFeedback;
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
        return this.genreId;
    }

    public final double component4() {
        return this.budget;
    }

    @Nullable
    public final String component5() {
        return this.producerId;
    }

    public final float component6() {
        return this.rating;
    }

    @NotNull
    public final Map<String, Long> component7() {
        return this.isUploadedMap;
    }

    public final long component8() {
        return this.totalStreams;
    }

    @Nullable
    public final String component9() {
        return this.videoTier;
    }

    public final int component10() {
        return this.weekCreated;
    }

    public final int component11() {
        return this.yearCreated;
    }

    @NotNull
    public final String component12() {
        return this.licenseType;
    }

    public final int component13() {
        return this.promoWeeksLeft;
    }

    public final float component14() {
        return this.promoWeeklyBoost;
    }

    public final int component15() {
        return this.playlistsCount;
    }

    public final boolean component16() {
        return this.isGlobal;
    }

    public final int component17() {
        return this.weeksSinceRelease;
    }

    public final long component18() {
        return this.peakStreams;
    }

    public final boolean component19() {
        return this.isViral;
    }

    public final boolean component20() {
        return this.isReleased;
    }

    public final float component21() {
        return this.hype;
    }

    public final int component22() {
        return this.weeksUntilRelease;
    }

    public final int component23() {
        return this.initialHypeWeeksSet;
    }

    @NotNull
    public final String component24() {
        return this.soundEngineerQuality;
    }

    @NotNull
    public final String component25() {
        return this.mixingStyle;
    }

    @NotNull
    public final String component26() {
        return this.backingVocalists;
    }

    @NotNull
    public final String component27() {
        return this.studioDecor;
    }

    @NotNull
    public final String component28() {
        return this.producerTier;
    }

    @Nullable
    public final String component29() {
        return this.coverArt;
    }

    public final boolean component30() {
        return this.isCopyrightRegistered;
    }

    public final boolean component31() {
        return this.hasSampleClearance;
    }

    @NotNull
    public final List<String> component32() {
        return this.audienceFeedback;
    }

    @NotNull
    public final Song copy(@NotNull String id, @NotNull String title, @NotNull String genreId, double budget, @Nullable String producerId, float rating, @NotNull Map<String, Long> map, long totalStreams, @Nullable String videoTier, int weekCreated, int yearCreated, @NotNull String licenseType, int promoWeeksLeft, float promoWeeklyBoost, int playlistsCount, boolean isGlobal, int weeksSinceRelease, long peakStreams, boolean isViral, boolean isReleased, float hype, int weeksUntilRelease, int initialHypeWeeksSet, @NotNull String soundEngineerQuality, @NotNull String mixingStyle, @NotNull String backingVocalists, @NotNull String studioDecor, @NotNull String producerTier, @Nullable String coverArt, boolean isCopyrightRegistered, boolean hasSampleClearance, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(genreId, "genreId");
        Intrinsics.checkNotNullParameter(map, "isUploadedMap");
        Intrinsics.checkNotNullParameter(licenseType, "licenseType");
        Intrinsics.checkNotNullParameter(soundEngineerQuality, "soundEngineerQuality");
        Intrinsics.checkNotNullParameter(mixingStyle, "mixingStyle");
        Intrinsics.checkNotNullParameter(backingVocalists, "backingVocalists");
        Intrinsics.checkNotNullParameter(studioDecor, "studioDecor");
        Intrinsics.checkNotNullParameter(producerTier, "producerTier");
        Intrinsics.checkNotNullParameter(list, "audienceFeedback");
        return new Song(id, title, genreId, budget, producerId, rating, map, totalStreams, videoTier, weekCreated, yearCreated, licenseType, promoWeeksLeft, promoWeeklyBoost, playlistsCount, isGlobal, weeksSinceRelease, peakStreams, isViral, isReleased, hype, weeksUntilRelease, initialHypeWeeksSet, soundEngineerQuality, mixingStyle, backingVocalists, studioDecor, producerTier, coverArt, isCopyrightRegistered, hasSampleClearance, list);
    }

    public static /* synthetic */ Song copy$default(Song song, String str, String str2, String str3, double d, String str4, float f, Map map, long j, String str5, int i, int i2, String str6, int i3, float f2, int i4, boolean z, int i5, long j2, boolean z2, boolean z3, float f3, int i6, int i7, String str7, String str8, String str9, String str10, String str11, String str12, boolean z4, boolean z5, List list, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = song.id;
        }
        if ((i8 & 2) != 0) {
            str2 = song.title;
        }
        if ((i8 & 4) != 0) {
            str3 = song.genreId;
        }
        if ((i8 & 8) != 0) {
            d = song.budget;
        }
        if ((i8 & 16) != 0) {
            str4 = song.producerId;
        }
        if ((i8 & 32) != 0) {
            f = song.rating;
        }
        if ((i8 & 64) != 0) {
            map = song.isUploadedMap;
        }
        if ((i8 & 128) != 0) {
            j = song.totalStreams;
        }
        if ((i8 & 256) != 0) {
            str5 = song.videoTier;
        }
        if ((i8 & 512) != 0) {
            i = song.weekCreated;
        }
        if ((i8 & 1024) != 0) {
            i2 = song.yearCreated;
        }
        if ((i8 & 2048) != 0) {
            str6 = song.licenseType;
        }
        if ((i8 & 4096) != 0) {
            i3 = song.promoWeeksLeft;
        }
        if ((i8 & 8192) != 0) {
            f2 = song.promoWeeklyBoost;
        }
        if ((i8 & 16384) != 0) {
            i4 = song.playlistsCount;
        }
        if ((i8 & 32768) != 0) {
            z = song.isGlobal;
        }
        if ((i8 & 65536) != 0) {
            i5 = song.weeksSinceRelease;
        }
        if ((i8 & 131072) != 0) {
            j2 = song.peakStreams;
        }
        if ((i8 & 262144) != 0) {
            z2 = song.isViral;
        }
        if ((i8 & 524288) != 0) {
            z3 = song.isReleased;
        }
        if ((i8 & 1048576) != 0) {
            f3 = song.hype;
        }
        if ((i8 & 2097152) != 0) {
            i6 = song.weeksUntilRelease;
        }
        if ((i8 & 4194304) != 0) {
            i7 = song.initialHypeWeeksSet;
        }
        if ((i8 & 8388608) != 0) {
            str7 = song.soundEngineerQuality;
        }
        if ((i8 & 16777216) != 0) {
            str8 = song.mixingStyle;
        }
        if ((i8 & 33554432) != 0) {
            str9 = song.backingVocalists;
        }
        if ((i8 & 67108864) != 0) {
            str10 = song.studioDecor;
        }
        if ((i8 & 134217728) != 0) {
            str11 = song.producerTier;
        }
        if ((i8 & 268435456) != 0) {
            str12 = song.coverArt;
        }
        if ((i8 & 536870912) != 0) {
            z4 = song.isCopyrightRegistered;
        }
        if ((i8 & 1073741824) != 0) {
            z5 = song.hasSampleClearance;
        }
        if ((i8 & Integer.MIN_VALUE) != 0) {
            list = song.audienceFeedback;
        }
        return song.copy(str, str2, str3, d, str4, f, map, j, str5, i, i2, str6, i3, f2, i4, z, i5, j2, z2, z3, f3, i6, i7, str7, str8, str9, str10, str11, str12, z4, z5, list);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.genreId;
        double d = this.budget;
        String str4 = this.producerId;
        float f = this.rating;
        Map<String, Long> map = this.isUploadedMap;
        long j = this.totalStreams;
        String str5 = this.videoTier;
        int i = this.weekCreated;
        int i2 = this.yearCreated;
        String str6 = this.licenseType;
        int i3 = this.promoWeeksLeft;
        float f2 = this.promoWeeklyBoost;
        int i4 = this.playlistsCount;
        boolean z = this.isGlobal;
        int i5 = this.weeksSinceRelease;
        long j2 = this.peakStreams;
        boolean z2 = this.isViral;
        boolean z3 = this.isReleased;
        float f3 = this.hype;
        int i6 = this.weeksUntilRelease;
        int i7 = this.initialHypeWeeksSet;
        String str7 = this.soundEngineerQuality;
        String str8 = this.mixingStyle;
        String str9 = this.backingVocalists;
        String str10 = this.studioDecor;
        String str11 = this.producerTier;
        String str12 = this.coverArt;
        boolean z4 = this.isCopyrightRegistered;
        boolean z5 = this.hasSampleClearance;
        List<String> list = this.audienceFeedback;
        return "Song(id=" + str + ", title=" + str2 + ", genreId=" + str3 + ", budget=" + d + ", producerId=" + str + ", rating=" + str4 + ", isUploadedMap=" + f + ", totalStreams=" + map + ", videoTier=" + j + ", weekCreated=" + str + ", yearCreated=" + str5 + ", licenseType=" + i + ", promoWeeksLeft=" + i2 + ", promoWeeklyBoost=" + str6 + ", playlistsCount=" + i3 + ", isGlobal=" + f2 + ", weeksSinceRelease=" + i4 + ", peakStreams=" + z + ", isViral=" + i5 + ", isReleased=" + j2 + ", hype=" + str + ", weeksUntilRelease=" + z2 + ", initialHypeWeeksSet=" + z3 + ", soundEngineerQuality=" + f3 + ", mixingStyle=" + i6 + ", backingVocalists=" + i7 + ", studioDecor=" + str7 + ", producerTier=" + str8 + ", coverArt=" + str9 + ", isCopyrightRegistered=" + str10 + ", hasSampleClearance=" + str11 + ", audienceFeedback=" + str12 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((result * 31) + this.title.hashCode()) * 31) + this.genreId.hashCode()) * 31) + Double.hashCode(this.budget)) * 31) + (this.producerId == null ? 0 : this.producerId.hashCode())) * 31) + Float.hashCode(this.rating)) * 31) + this.isUploadedMap.hashCode()) * 31) + Long.hashCode(this.totalStreams)) * 31) + (this.videoTier == null ? 0 : this.videoTier.hashCode())) * 31) + Integer.hashCode(this.weekCreated)) * 31) + Integer.hashCode(this.yearCreated)) * 31) + this.licenseType.hashCode()) * 31) + Integer.hashCode(this.promoWeeksLeft)) * 31) + Float.hashCode(this.promoWeeklyBoost)) * 31) + Integer.hashCode(this.playlistsCount)) * 31) + Boolean.hashCode(this.isGlobal)) * 31) + Integer.hashCode(this.weeksSinceRelease)) * 31) + Long.hashCode(this.peakStreams)) * 31) + Boolean.hashCode(this.isViral)) * 31) + Boolean.hashCode(this.isReleased)) * 31) + Float.hashCode(this.hype)) * 31) + Integer.hashCode(this.weeksUntilRelease)) * 31) + Integer.hashCode(this.initialHypeWeeksSet)) * 31) + this.soundEngineerQuality.hashCode()) * 31) + this.mixingStyle.hashCode()) * 31) + this.backingVocalists.hashCode()) * 31) + this.studioDecor.hashCode()) * 31) + this.producerTier.hashCode()) * 31) + (this.coverArt == null ? 0 : this.coverArt.hashCode())) * 31) + Boolean.hashCode(this.isCopyrightRegistered)) * 31) + Boolean.hashCode(this.hasSampleClearance)) * 31) + this.audienceFeedback.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Song) {
            Song song = (Song) other;
            return Intrinsics.areEqual(this.id, song.id) && Intrinsics.areEqual(this.title, song.title) && Intrinsics.areEqual(this.genreId, song.genreId) && Double.compare(this.budget, song.budget) == 0 && Intrinsics.areEqual(this.producerId, song.producerId) && Float.compare(this.rating, song.rating) == 0 && Intrinsics.areEqual(this.isUploadedMap, song.isUploadedMap) && this.totalStreams == song.totalStreams && Intrinsics.areEqual(this.videoTier, song.videoTier) && this.weekCreated == song.weekCreated && this.yearCreated == song.yearCreated && Intrinsics.areEqual(this.licenseType, song.licenseType) && this.promoWeeksLeft == song.promoWeeksLeft && Float.compare(this.promoWeeklyBoost, song.promoWeeklyBoost) == 0 && this.playlistsCount == song.playlistsCount && this.isGlobal == song.isGlobal && this.weeksSinceRelease == song.weeksSinceRelease && this.peakStreams == song.peakStreams && this.isViral == song.isViral && this.isReleased == song.isReleased && Float.compare(this.hype, song.hype) == 0 && this.weeksUntilRelease == song.weeksUntilRelease && this.initialHypeWeeksSet == song.initialHypeWeeksSet && Intrinsics.areEqual(this.soundEngineerQuality, song.soundEngineerQuality) && Intrinsics.areEqual(this.mixingStyle, song.mixingStyle) && Intrinsics.areEqual(this.backingVocalists, song.backingVocalists) && Intrinsics.areEqual(this.studioDecor, song.studioDecor) && Intrinsics.areEqual(this.producerTier, song.producerTier) && Intrinsics.areEqual(this.coverArt, song.coverArt) && this.isCopyrightRegistered == song.isCopyrightRegistered && this.hasSampleClearance == song.hasSampleClearance && Intrinsics.areEqual(this.audienceFeedback, song.audienceFeedback);
        }
        return false;
    }

    public Song(@NotNull String id, @NotNull String title, @NotNull String genreId, double budget, @Nullable String producerId, float rating, @NotNull Map<String, Long> map, long totalStreams, @Nullable String videoTier, int weekCreated, int yearCreated, @NotNull String licenseType, int promoWeeksLeft, float promoWeeklyBoost, int playlistsCount, boolean isGlobal, int weeksSinceRelease, long peakStreams, boolean isViral, boolean isReleased, float hype, int weeksUntilRelease, int initialHypeWeeksSet, @NotNull String soundEngineerQuality, @NotNull String mixingStyle, @NotNull String backingVocalists, @NotNull String studioDecor, @NotNull String producerTier, @Nullable String coverArt, boolean isCopyrightRegistered, boolean hasSampleClearance, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(genreId, "genreId");
        Intrinsics.checkNotNullParameter(map, "isUploadedMap");
        Intrinsics.checkNotNullParameter(licenseType, "licenseType");
        Intrinsics.checkNotNullParameter(soundEngineerQuality, "soundEngineerQuality");
        Intrinsics.checkNotNullParameter(mixingStyle, "mixingStyle");
        Intrinsics.checkNotNullParameter(backingVocalists, "backingVocalists");
        Intrinsics.checkNotNullParameter(studioDecor, "studioDecor");
        Intrinsics.checkNotNullParameter(producerTier, "producerTier");
        Intrinsics.checkNotNullParameter(list, "audienceFeedback");
        this.id = id;
        this.title = title;
        this.genreId = genreId;
        this.budget = budget;
        this.producerId = producerId;
        this.rating = rating;
        this.isUploadedMap = map;
        this.totalStreams = totalStreams;
        this.videoTier = videoTier;
        this.weekCreated = weekCreated;
        this.yearCreated = yearCreated;
        this.licenseType = licenseType;
        this.promoWeeksLeft = promoWeeksLeft;
        this.promoWeeklyBoost = promoWeeklyBoost;
        this.playlistsCount = playlistsCount;
        this.isGlobal = isGlobal;
        this.weeksSinceRelease = weeksSinceRelease;
        this.peakStreams = peakStreams;
        this.isViral = isViral;
        this.isReleased = isReleased;
        this.hype = hype;
        this.weeksUntilRelease = weeksUntilRelease;
        this.initialHypeWeeksSet = initialHypeWeeksSet;
        this.soundEngineerQuality = soundEngineerQuality;
        this.mixingStyle = mixingStyle;
        this.backingVocalists = backingVocalists;
        this.studioDecor = studioDecor;
        this.producerTier = producerTier;
        this.coverArt = coverArt;
        this.isCopyrightRegistered = isCopyrightRegistered;
        this.hasSampleClearance = hasSampleClearance;
        this.audienceFeedback = list;
    }

    public /* synthetic */ Song(String str, String str2, String str3, double d, String str4, float f, Map map, long j, String str5, int i, int i2, String str6, int i3, float f2, int i4, boolean z, int i5, long j2, boolean z2, boolean z3, float f3, int i6, int i7, String str7, String str8, String str9, String str10, String str11, String str12, boolean z4, boolean z5, List list, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, str4, f, (i8 & 64) != 0 ? MapsKt.emptyMap() : map, (i8 & 128) != 0 ? 0L : j, (i8 & 256) != 0 ? null : str5, i, i2, (i8 & 2048) != 0 ? "Full" : str6, (i8 & 4096) != 0 ? 0 : i3, (i8 & 8192) != 0 ? 0.0f : f2, (i8 & 16384) != 0 ? 0 : i4, (i8 & 32768) != 0 ? false : z, (i8 & 65536) != 0 ? 0 : i5, (i8 & 131072) != 0 ? 0L : j2, (i8 & 262144) != 0 ? false : z2, (i8 & 524288) != 0 ? true : z3, (i8 & 1048576) != 0 ? 1.0f : f3, (i8 & 2097152) != 0 ? 0 : i6, (i8 & 4194304) != 0 ? 0 : i7, (i8 & 8388608) != 0 ? "Amateur" : str7, (i8 & 16777216) != 0 ? "Standard" : str8, (i8 & 33554432) != 0 ? "None" : str9, (i8 & 67108864) != 0 ? "Basement" : str10, (i8 & 134217728) != 0 ? "None" : str11, (i8 & 268435456) != 0 ? null : str12, (i8 & 536870912) != 0 ? false : z4, (i8 & 1073741824) != 0 ? true : z5, (i8 & Integer.MIN_VALUE) != 0 ? CollectionsKt.emptyList() : list);
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
    public final String getGenreId() {
        return this.genreId;
    }

    public final double getBudget() {
        return this.budget;
    }

    @Nullable
    public final String getProducerId() {
        return this.producerId;
    }

    public final float getRating() {
        return this.rating;
    }

    @NotNull
    public final Map<String, Long> isUploadedMap() {
        return this.isUploadedMap;
    }

    public final long getTotalStreams() {
        return this.totalStreams;
    }

    @Nullable
    public final String getVideoTier() {
        return this.videoTier;
    }

    public final int getWeekCreated() {
        return this.weekCreated;
    }

    public final int getYearCreated() {
        return this.yearCreated;
    }

    @NotNull
    public final String getLicenseType() {
        return this.licenseType;
    }

    public final int getPromoWeeksLeft() {
        return this.promoWeeksLeft;
    }

    public final float getPromoWeeklyBoost() {
        return this.promoWeeklyBoost;
    }

    public final int getPlaylistsCount() {
        return this.playlistsCount;
    }

    public final boolean isGlobal() {
        return this.isGlobal;
    }

    public final int getWeeksSinceRelease() {
        return this.weeksSinceRelease;
    }

    public final long getPeakStreams() {
        return this.peakStreams;
    }

    public final boolean isViral() {
        return this.isViral;
    }

    public final boolean isReleased() {
        return this.isReleased;
    }

    public final float getHype() {
        return this.hype;
    }

    public final int getWeeksUntilRelease() {
        return this.weeksUntilRelease;
    }

    public final int getInitialHypeWeeksSet() {
        return this.initialHypeWeeksSet;
    }

    @NotNull
    public final String getSoundEngineerQuality() {
        return this.soundEngineerQuality;
    }

    @NotNull
    public final String getMixingStyle() {
        return this.mixingStyle;
    }

    @NotNull
    public final String getBackingVocalists() {
        return this.backingVocalists;
    }

    @NotNull
    public final String getStudioDecor() {
        return this.studioDecor;
    }

    @NotNull
    public final String getProducerTier() {
        return this.producerTier;
    }

    @Nullable
    public final String getCoverArt() {
        return this.coverArt;
    }

    public final boolean isCopyrightRegistered() {
        return this.isCopyrightRegistered;
    }

    public final boolean getHasSampleClearance() {
        return this.hasSampleClearance;
    }

    @NotNull
    public final List<String> getAudienceFeedback() {
        return this.audienceFeedback;
    }
}
