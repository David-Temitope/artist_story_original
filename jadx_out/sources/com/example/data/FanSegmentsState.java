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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��&\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\t\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0087\b\u0018��2\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010-\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u000202HÖ\u0001J\t\u00103\u001a\u000204HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001f\u0010\u0013¨\u00065"}, d2 = {"Lcom/example/data/FanSegmentsState;", "", "casualFans", "", "hardcoreFans", "collectors", "concertGoers", "internationalFans", "onlineCommunity", "fansPersonalityLovers", "fansLyricsLovers", "fansVoicePurists", "fansFashionistas", "fansControversySeekers", "fansBusinessAdmirers", "fansCharityBelievers", "<init>", "(JJJJJJJJJJJJJ)V", "getCasualFans", "()J", "getHardcoreFans", "getCollectors", "getConcertGoers", "getInternationalFans", "getOnlineCommunity", "getFansPersonalityLovers", "getFansLyricsLovers", "getFansVoicePurists", "getFansFashionistas", "getFansControversySeekers", "getFansBusinessAdmirers", "getFansCharityBelievers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"})
/* loaded from: FanSegmentsState.class */
public final class FanSegmentsState {
    private final long casualFans;
    private final long hardcoreFans;
    private final long collectors;
    private final long concertGoers;
    private final long internationalFans;
    private final long onlineCommunity;
    private final long fansPersonalityLovers;
    private final long fansLyricsLovers;
    private final long fansVoicePurists;
    private final long fansFashionistas;
    private final long fansControversySeekers;
    private final long fansBusinessAdmirers;
    private final long fansCharityBelievers;
    public static final int $stable = 0;

    public final long component1() {
        return this.casualFans;
    }

    public final long component2() {
        return this.hardcoreFans;
    }

    public final long component3() {
        return this.collectors;
    }

    public final long component4() {
        return this.concertGoers;
    }

    public final long component5() {
        return this.internationalFans;
    }

    public final long component6() {
        return this.onlineCommunity;
    }

    public final long component7() {
        return this.fansPersonalityLovers;
    }

    public final long component8() {
        return this.fansLyricsLovers;
    }

    public final long component9() {
        return this.fansVoicePurists;
    }

    public final long component10() {
        return this.fansFashionistas;
    }

    public final long component11() {
        return this.fansControversySeekers;
    }

    public final long component12() {
        return this.fansBusinessAdmirers;
    }

    public final long component13() {
        return this.fansCharityBelievers;
    }

    @NotNull
    public final FanSegmentsState copy(long casualFans, long hardcoreFans, long collectors, long concertGoers, long internationalFans, long onlineCommunity, long fansPersonalityLovers, long fansLyricsLovers, long fansVoicePurists, long fansFashionistas, long fansControversySeekers, long fansBusinessAdmirers, long fansCharityBelievers) {
        return new FanSegmentsState(casualFans, hardcoreFans, collectors, concertGoers, internationalFans, onlineCommunity, fansPersonalityLovers, fansLyricsLovers, fansVoicePurists, fansFashionistas, fansControversySeekers, fansBusinessAdmirers, fansCharityBelievers);
    }

    public static /* synthetic */ FanSegmentsState copy$default(FanSegmentsState fanSegmentsState, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i, Object obj) {
        if ((i & 1) != 0) {
            j = fanSegmentsState.casualFans;
        }
        if ((i & 2) != 0) {
            j2 = fanSegmentsState.hardcoreFans;
        }
        if ((i & 4) != 0) {
            j3 = fanSegmentsState.collectors;
        }
        if ((i & 8) != 0) {
            j4 = fanSegmentsState.concertGoers;
        }
        if ((i & 16) != 0) {
            j5 = fanSegmentsState.internationalFans;
        }
        if ((i & 32) != 0) {
            j6 = fanSegmentsState.onlineCommunity;
        }
        if ((i & 64) != 0) {
            j7 = fanSegmentsState.fansPersonalityLovers;
        }
        if ((i & 128) != 0) {
            j8 = fanSegmentsState.fansLyricsLovers;
        }
        if ((i & 256) != 0) {
            j9 = fanSegmentsState.fansVoicePurists;
        }
        if ((i & 512) != 0) {
            j10 = fanSegmentsState.fansFashionistas;
        }
        if ((i & 1024) != 0) {
            j11 = fanSegmentsState.fansControversySeekers;
        }
        if ((i & 2048) != 0) {
            j12 = fanSegmentsState.fansBusinessAdmirers;
        }
        if ((i & 4096) != 0) {
            j13 = fanSegmentsState.fansCharityBelievers;
        }
        return fanSegmentsState.copy(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    @NotNull
    public String toString() {
        long j = this.casualFans;
        long j2 = this.hardcoreFans;
        long j3 = this.collectors;
        long j4 = this.concertGoers;
        long j5 = this.internationalFans;
        long j6 = this.onlineCommunity;
        long j7 = this.fansPersonalityLovers;
        long j8 = this.fansLyricsLovers;
        long j9 = this.fansVoicePurists;
        long j10 = this.fansFashionistas;
        long j11 = this.fansControversySeekers;
        long j12 = this.fansBusinessAdmirers;
        long j13 = this.fansCharityBelievers;
        return "FanSegmentsState(casualFans=" + j + ", hardcoreFans=" + j + ", collectors=" + j2 + ", concertGoers=" + j + ", internationalFans=" + j3 + ", onlineCommunity=" + j + ", fansPersonalityLovers=" + j4 + ", fansLyricsLovers=" + j + ", fansVoicePurists=" + j5 + ", fansFashionistas=" + j + ", fansControversySeekers=" + j6 + ", fansBusinessAdmirers=" + j + ", fansCharityBelievers=" + j7 + ")";
    }

    public int hashCode() {
        int result = Long.hashCode(this.casualFans);
        return (((((((((((((((((((((((result * 31) + Long.hashCode(this.hardcoreFans)) * 31) + Long.hashCode(this.collectors)) * 31) + Long.hashCode(this.concertGoers)) * 31) + Long.hashCode(this.internationalFans)) * 31) + Long.hashCode(this.onlineCommunity)) * 31) + Long.hashCode(this.fansPersonalityLovers)) * 31) + Long.hashCode(this.fansLyricsLovers)) * 31) + Long.hashCode(this.fansVoicePurists)) * 31) + Long.hashCode(this.fansFashionistas)) * 31) + Long.hashCode(this.fansControversySeekers)) * 31) + Long.hashCode(this.fansBusinessAdmirers)) * 31) + Long.hashCode(this.fansCharityBelievers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof FanSegmentsState) {
            FanSegmentsState fanSegmentsState = (FanSegmentsState) other;
            return this.casualFans == fanSegmentsState.casualFans && this.hardcoreFans == fanSegmentsState.hardcoreFans && this.collectors == fanSegmentsState.collectors && this.concertGoers == fanSegmentsState.concertGoers && this.internationalFans == fanSegmentsState.internationalFans && this.onlineCommunity == fanSegmentsState.onlineCommunity && this.fansPersonalityLovers == fanSegmentsState.fansPersonalityLovers && this.fansLyricsLovers == fanSegmentsState.fansLyricsLovers && this.fansVoicePurists == fanSegmentsState.fansVoicePurists && this.fansFashionistas == fanSegmentsState.fansFashionistas && this.fansControversySeekers == fanSegmentsState.fansControversySeekers && this.fansBusinessAdmirers == fanSegmentsState.fansBusinessAdmirers && this.fansCharityBelievers == fanSegmentsState.fansCharityBelievers;
        }
        return false;
    }

    public FanSegmentsState() {
        this(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8191, null);
    }

    public FanSegmentsState(long casualFans, long hardcoreFans, long collectors, long concertGoers, long internationalFans, long onlineCommunity, long fansPersonalityLovers, long fansLyricsLovers, long fansVoicePurists, long fansFashionistas, long fansControversySeekers, long fansBusinessAdmirers, long fansCharityBelievers) {
        this.casualFans = casualFans;
        this.hardcoreFans = hardcoreFans;
        this.collectors = collectors;
        this.concertGoers = concertGoers;
        this.internationalFans = internationalFans;
        this.onlineCommunity = onlineCommunity;
        this.fansPersonalityLovers = fansPersonalityLovers;
        this.fansLyricsLovers = fansLyricsLovers;
        this.fansVoicePurists = fansVoicePurists;
        this.fansFashionistas = fansFashionistas;
        this.fansControversySeekers = fansControversySeekers;
        this.fansBusinessAdmirers = fansBusinessAdmirers;
        this.fansCharityBelievers = fansCharityBelievers;
    }

    public /* synthetic */ FanSegmentsState(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? 0L : j4, (i & 16) != 0 ? 0L : j5, (i & 32) != 0 ? 0L : j6, (i & 64) != 0 ? 100L : j7, (i & 128) != 0 ? 100L : j8, (i & 256) != 0 ? 100L : j9, (i & 512) != 0 ? 100L : j10, (i & 1024) != 0 ? 100L : j11, (i & 2048) != 0 ? 100L : j12, (i & 4096) != 0 ? 100L : j13);
    }

    public final long getCasualFans() {
        return this.casualFans;
    }

    public final long getHardcoreFans() {
        return this.hardcoreFans;
    }

    public final long getCollectors() {
        return this.collectors;
    }

    public final long getConcertGoers() {
        return this.concertGoers;
    }

    public final long getInternationalFans() {
        return this.internationalFans;
    }

    public final long getOnlineCommunity() {
        return this.onlineCommunity;
    }

    public final long getFansPersonalityLovers() {
        return this.fansPersonalityLovers;
    }

    public final long getFansLyricsLovers() {
        return this.fansLyricsLovers;
    }

    public final long getFansVoicePurists() {
        return this.fansVoicePurists;
    }

    public final long getFansFashionistas() {
        return this.fansFashionistas;
    }

    public final long getFansControversySeekers() {
        return this.fansControversySeekers;
    }

    public final long getFansBusinessAdmirers() {
        return this.fansBusinessAdmirers;
    }

    public final long getFansCharityBelievers() {
        return this.fansCharityBelievers;
    }
}
