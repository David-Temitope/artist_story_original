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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b<\b\u0087\b\u0018��2\u00020\u0001Bÿ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e¢\u0006\u0004\b\u001f\u0010 J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0005HÆ\u0003J\t\u0010@\u001a\u00020\u0005HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u000bHÆ\u0003J\t\u0010D\u001a\u00020\rHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u000bHÆ\u0003J\t\u0010S\u001a\u00020\u000bHÆ\u0003J\u000f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eHÆ\u0003J\u0081\u0002\u0010U\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eHÆ\u0001J\u0013\u0010V\u001a\u00020\u00032\b\u0010W\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010X\u001a\u00020\u0005HÖ\u0001J\t\u0010Y\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b%\u0010$R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b&\u0010$R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b'\u0010\"R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\t\u0010\"R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b(\u0010)R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b*\u0010+R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b,\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n��\u001a\u0004\b-\u0010)R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b.\u0010$R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b/\u0010$R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b0\u0010\"R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b1\u0010\"R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b2\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b3\u0010$R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b4\u0010)R\u0011\u0010\u0017\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b5\u0010$R\u0011\u0010\u0018\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b6\u0010$R\u0011\u0010\u0019\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b7\u0010$R\u0011\u0010\u001a\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b8\u0010$R\u0011\u0010\u001b\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b9\u0010)R\u0011\u0010\u001c\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b:\u0010)R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e¢\u0006\b\n��\u001a\u0004\b;\u0010<¨\u0006Z"}, d2 = {"Lcom/example/data/WebHubState;", "", "wgtApplied", "", "wgtAuditionWeek", "", "wgtAuditionYear", "wgtCompletedCount", "wgtWon", "isSccWanted", "sccCrimeReason", "", "sccFineAmount", "", "blackHatPurchasesCount", "electionVotedCandidateId", "electionVotedWeek", "electionVotedYear", "grandAwardNominated", "grandAwardWon", "grandAwardVipAccess", "lastDemoSubmissionWeek", "labelContractObligations", "wgtSeason", "wgtSeasonYear", "wgtSemiFinalsWeek", "wgtGrandFinaleWeek", "wgtRegistrationStatus", "wgtLastWinner", "wgtContestants", "", "<init>", "(ZIIIZZLjava/lang/String;DILjava/lang/String;IIZZZILjava/lang/String;IIIILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getWgtApplied", "()Z", "getWgtAuditionWeek", "()I", "getWgtAuditionYear", "getWgtCompletedCount", "getWgtWon", "getSccCrimeReason", "()Ljava/lang/String;", "getSccFineAmount", "()D", "getBlackHatPurchasesCount", "getElectionVotedCandidateId", "getElectionVotedWeek", "getElectionVotedYear", "getGrandAwardNominated", "getGrandAwardWon", "getGrandAwardVipAccess", "getLastDemoSubmissionWeek", "getLabelContractObligations", "getWgtSeason", "getWgtSeasonYear", "getWgtSemiFinalsWeek", "getWgtGrandFinaleWeek", "getWgtRegistrationStatus", "getWgtLastWinner", "getWgtContestants", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: WebHubState.class */
public final class WebHubState {
    private final boolean wgtApplied;
    private final int wgtAuditionWeek;
    private final int wgtAuditionYear;
    private final int wgtCompletedCount;
    private final boolean wgtWon;
    private final boolean isSccWanted;
    @NotNull
    private final String sccCrimeReason;
    private final double sccFineAmount;
    private final int blackHatPurchasesCount;
    @Nullable
    private final String electionVotedCandidateId;
    private final int electionVotedWeek;
    private final int electionVotedYear;
    private final boolean grandAwardNominated;
    private final boolean grandAwardWon;
    private final boolean grandAwardVipAccess;
    private final int lastDemoSubmissionWeek;
    @NotNull
    private final String labelContractObligations;
    private final int wgtSeason;
    private final int wgtSeasonYear;
    private final int wgtSemiFinalsWeek;
    private final int wgtGrandFinaleWeek;
    @NotNull
    private final String wgtRegistrationStatus;
    @NotNull
    private final String wgtLastWinner;
    @NotNull
    private final List<String> wgtContestants;
    public static final int $stable = 8;

    public final boolean component1() {
        return this.wgtApplied;
    }

    public final int component2() {
        return this.wgtAuditionWeek;
    }

    public final int component3() {
        return this.wgtAuditionYear;
    }

    public final int component4() {
        return this.wgtCompletedCount;
    }

    public final boolean component5() {
        return this.wgtWon;
    }

    public final boolean component6() {
        return this.isSccWanted;
    }

    @NotNull
    public final String component7() {
        return this.sccCrimeReason;
    }

    public final double component8() {
        return this.sccFineAmount;
    }

    public final int component9() {
        return this.blackHatPurchasesCount;
    }

    @Nullable
    public final String component10() {
        return this.electionVotedCandidateId;
    }

    public final int component11() {
        return this.electionVotedWeek;
    }

    public final int component12() {
        return this.electionVotedYear;
    }

    public final boolean component13() {
        return this.grandAwardNominated;
    }

    public final boolean component14() {
        return this.grandAwardWon;
    }

    public final boolean component15() {
        return this.grandAwardVipAccess;
    }

    public final int component16() {
        return this.lastDemoSubmissionWeek;
    }

    @NotNull
    public final String component17() {
        return this.labelContractObligations;
    }

    public final int component18() {
        return this.wgtSeason;
    }

    public final int component19() {
        return this.wgtSeasonYear;
    }

    public final int component20() {
        return this.wgtSemiFinalsWeek;
    }

    public final int component21() {
        return this.wgtGrandFinaleWeek;
    }

    @NotNull
    public final String component22() {
        return this.wgtRegistrationStatus;
    }

    @NotNull
    public final String component23() {
        return this.wgtLastWinner;
    }

    @NotNull
    public final List<String> component24() {
        return this.wgtContestants;
    }

    @NotNull
    public final WebHubState copy(boolean wgtApplied, int wgtAuditionWeek, int wgtAuditionYear, int wgtCompletedCount, boolean wgtWon, boolean isSccWanted, @NotNull String sccCrimeReason, double sccFineAmount, int blackHatPurchasesCount, @Nullable String electionVotedCandidateId, int electionVotedWeek, int electionVotedYear, boolean grandAwardNominated, boolean grandAwardWon, boolean grandAwardVipAccess, int lastDemoSubmissionWeek, @NotNull String labelContractObligations, int wgtSeason, int wgtSeasonYear, int wgtSemiFinalsWeek, int wgtGrandFinaleWeek, @NotNull String wgtRegistrationStatus, @NotNull String wgtLastWinner, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(sccCrimeReason, "sccCrimeReason");
        Intrinsics.checkNotNullParameter(labelContractObligations, "labelContractObligations");
        Intrinsics.checkNotNullParameter(wgtRegistrationStatus, "wgtRegistrationStatus");
        Intrinsics.checkNotNullParameter(wgtLastWinner, "wgtLastWinner");
        Intrinsics.checkNotNullParameter(list, "wgtContestants");
        return new WebHubState(wgtApplied, wgtAuditionWeek, wgtAuditionYear, wgtCompletedCount, wgtWon, isSccWanted, sccCrimeReason, sccFineAmount, blackHatPurchasesCount, electionVotedCandidateId, electionVotedWeek, electionVotedYear, grandAwardNominated, grandAwardWon, grandAwardVipAccess, lastDemoSubmissionWeek, labelContractObligations, wgtSeason, wgtSeasonYear, wgtSemiFinalsWeek, wgtGrandFinaleWeek, wgtRegistrationStatus, wgtLastWinner, list);
    }

    public static /* synthetic */ WebHubState copy$default(WebHubState webHubState, boolean z, int i, int i2, int i3, boolean z2, boolean z3, String str, double d, int i4, String str2, int i5, int i6, boolean z4, boolean z5, boolean z6, int i7, String str3, int i8, int i9, int i10, int i11, String str4, String str5, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z = webHubState.wgtApplied;
        }
        if ((i12 & 2) != 0) {
            i = webHubState.wgtAuditionWeek;
        }
        if ((i12 & 4) != 0) {
            i2 = webHubState.wgtAuditionYear;
        }
        if ((i12 & 8) != 0) {
            i3 = webHubState.wgtCompletedCount;
        }
        if ((i12 & 16) != 0) {
            z2 = webHubState.wgtWon;
        }
        if ((i12 & 32) != 0) {
            z3 = webHubState.isSccWanted;
        }
        if ((i12 & 64) != 0) {
            str = webHubState.sccCrimeReason;
        }
        if ((i12 & 128) != 0) {
            d = webHubState.sccFineAmount;
        }
        if ((i12 & 256) != 0) {
            i4 = webHubState.blackHatPurchasesCount;
        }
        if ((i12 & 512) != 0) {
            str2 = webHubState.electionVotedCandidateId;
        }
        if ((i12 & 1024) != 0) {
            i5 = webHubState.electionVotedWeek;
        }
        if ((i12 & 2048) != 0) {
            i6 = webHubState.electionVotedYear;
        }
        if ((i12 & 4096) != 0) {
            z4 = webHubState.grandAwardNominated;
        }
        if ((i12 & 8192) != 0) {
            z5 = webHubState.grandAwardWon;
        }
        if ((i12 & 16384) != 0) {
            z6 = webHubState.grandAwardVipAccess;
        }
        if ((i12 & 32768) != 0) {
            i7 = webHubState.lastDemoSubmissionWeek;
        }
        if ((i12 & 65536) != 0) {
            str3 = webHubState.labelContractObligations;
        }
        if ((i12 & 131072) != 0) {
            i8 = webHubState.wgtSeason;
        }
        if ((i12 & 262144) != 0) {
            i9 = webHubState.wgtSeasonYear;
        }
        if ((i12 & 524288) != 0) {
            i10 = webHubState.wgtSemiFinalsWeek;
        }
        if ((i12 & 1048576) != 0) {
            i11 = webHubState.wgtGrandFinaleWeek;
        }
        if ((i12 & 2097152) != 0) {
            str4 = webHubState.wgtRegistrationStatus;
        }
        if ((i12 & 4194304) != 0) {
            str5 = webHubState.wgtLastWinner;
        }
        if ((i12 & 8388608) != 0) {
            list = webHubState.wgtContestants;
        }
        return webHubState.copy(z, i, i2, i3, z2, z3, str, d, i4, str2, i5, i6, z4, z5, z6, i7, str3, i8, i9, i10, i11, str4, str5, list);
    }

    @NotNull
    public String toString() {
        boolean z = this.wgtApplied;
        int i = this.wgtAuditionWeek;
        int i2 = this.wgtAuditionYear;
        int i3 = this.wgtCompletedCount;
        boolean z2 = this.wgtWon;
        boolean z3 = this.isSccWanted;
        String str = this.sccCrimeReason;
        double d = this.sccFineAmount;
        int i4 = this.blackHatPurchasesCount;
        String str2 = this.electionVotedCandidateId;
        int i5 = this.electionVotedWeek;
        int i6 = this.electionVotedYear;
        boolean z4 = this.grandAwardNominated;
        boolean z5 = this.grandAwardWon;
        boolean z6 = this.grandAwardVipAccess;
        int i7 = this.lastDemoSubmissionWeek;
        String str3 = this.labelContractObligations;
        int i8 = this.wgtSeason;
        int i9 = this.wgtSeasonYear;
        int i10 = this.wgtSemiFinalsWeek;
        int i11 = this.wgtGrandFinaleWeek;
        String str4 = this.wgtRegistrationStatus;
        String str5 = this.wgtLastWinner;
        List<String> list = this.wgtContestants;
        return "WebHubState(wgtApplied=" + z + ", wgtAuditionWeek=" + i + ", wgtAuditionYear=" + i2 + ", wgtCompletedCount=" + i3 + ", wgtWon=" + z2 + ", isSccWanted=" + z3 + ", sccCrimeReason=" + str + ", sccFineAmount=" + d + ", blackHatPurchasesCount=" + z + ", electionVotedCandidateId=" + i4 + ", electionVotedWeek=" + str2 + ", electionVotedYear=" + i5 + ", grandAwardNominated=" + i6 + ", grandAwardWon=" + z4 + ", grandAwardVipAccess=" + z5 + ", lastDemoSubmissionWeek=" + z6 + ", labelContractObligations=" + i7 + ", wgtSeason=" + str3 + ", wgtSeasonYear=" + i8 + ", wgtSemiFinalsWeek=" + i9 + ", wgtGrandFinaleWeek=" + i10 + ", wgtRegistrationStatus=" + i11 + ", wgtLastWinner=" + str4 + ", wgtContestants=" + str5 + ")";
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.wgtApplied);
        return (((((((((((((((((((((((((((((((((((((((((((((result * 31) + Integer.hashCode(this.wgtAuditionWeek)) * 31) + Integer.hashCode(this.wgtAuditionYear)) * 31) + Integer.hashCode(this.wgtCompletedCount)) * 31) + Boolean.hashCode(this.wgtWon)) * 31) + Boolean.hashCode(this.isSccWanted)) * 31) + this.sccCrimeReason.hashCode()) * 31) + Double.hashCode(this.sccFineAmount)) * 31) + Integer.hashCode(this.blackHatPurchasesCount)) * 31) + (this.electionVotedCandidateId == null ? 0 : this.electionVotedCandidateId.hashCode())) * 31) + Integer.hashCode(this.electionVotedWeek)) * 31) + Integer.hashCode(this.electionVotedYear)) * 31) + Boolean.hashCode(this.grandAwardNominated)) * 31) + Boolean.hashCode(this.grandAwardWon)) * 31) + Boolean.hashCode(this.grandAwardVipAccess)) * 31) + Integer.hashCode(this.lastDemoSubmissionWeek)) * 31) + this.labelContractObligations.hashCode()) * 31) + Integer.hashCode(this.wgtSeason)) * 31) + Integer.hashCode(this.wgtSeasonYear)) * 31) + Integer.hashCode(this.wgtSemiFinalsWeek)) * 31) + Integer.hashCode(this.wgtGrandFinaleWeek)) * 31) + this.wgtRegistrationStatus.hashCode()) * 31) + this.wgtLastWinner.hashCode()) * 31) + this.wgtContestants.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof WebHubState) {
            WebHubState webHubState = (WebHubState) other;
            return this.wgtApplied == webHubState.wgtApplied && this.wgtAuditionWeek == webHubState.wgtAuditionWeek && this.wgtAuditionYear == webHubState.wgtAuditionYear && this.wgtCompletedCount == webHubState.wgtCompletedCount && this.wgtWon == webHubState.wgtWon && this.isSccWanted == webHubState.isSccWanted && Intrinsics.areEqual(this.sccCrimeReason, webHubState.sccCrimeReason) && Double.compare(this.sccFineAmount, webHubState.sccFineAmount) == 0 && this.blackHatPurchasesCount == webHubState.blackHatPurchasesCount && Intrinsics.areEqual(this.electionVotedCandidateId, webHubState.electionVotedCandidateId) && this.electionVotedWeek == webHubState.electionVotedWeek && this.electionVotedYear == webHubState.electionVotedYear && this.grandAwardNominated == webHubState.grandAwardNominated && this.grandAwardWon == webHubState.grandAwardWon && this.grandAwardVipAccess == webHubState.grandAwardVipAccess && this.lastDemoSubmissionWeek == webHubState.lastDemoSubmissionWeek && Intrinsics.areEqual(this.labelContractObligations, webHubState.labelContractObligations) && this.wgtSeason == webHubState.wgtSeason && this.wgtSeasonYear == webHubState.wgtSeasonYear && this.wgtSemiFinalsWeek == webHubState.wgtSemiFinalsWeek && this.wgtGrandFinaleWeek == webHubState.wgtGrandFinaleWeek && Intrinsics.areEqual(this.wgtRegistrationStatus, webHubState.wgtRegistrationStatus) && Intrinsics.areEqual(this.wgtLastWinner, webHubState.wgtLastWinner) && Intrinsics.areEqual(this.wgtContestants, webHubState.wgtContestants);
        }
        return false;
    }

    public WebHubState() {
        this(false, 0, 0, 0, false, false, null, 0.0d, 0, null, 0, 0, false, false, false, 0, null, 0, 0, 0, 0, null, null, null, 16777215, null);
    }

    public WebHubState(boolean wgtApplied, int wgtAuditionWeek, int wgtAuditionYear, int wgtCompletedCount, boolean wgtWon, boolean isSccWanted, @NotNull String sccCrimeReason, double sccFineAmount, int blackHatPurchasesCount, @Nullable String electionVotedCandidateId, int electionVotedWeek, int electionVotedYear, boolean grandAwardNominated, boolean grandAwardWon, boolean grandAwardVipAccess, int lastDemoSubmissionWeek, @NotNull String labelContractObligations, int wgtSeason, int wgtSeasonYear, int wgtSemiFinalsWeek, int wgtGrandFinaleWeek, @NotNull String wgtRegistrationStatus, @NotNull String wgtLastWinner, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(sccCrimeReason, "sccCrimeReason");
        Intrinsics.checkNotNullParameter(labelContractObligations, "labelContractObligations");
        Intrinsics.checkNotNullParameter(wgtRegistrationStatus, "wgtRegistrationStatus");
        Intrinsics.checkNotNullParameter(wgtLastWinner, "wgtLastWinner");
        Intrinsics.checkNotNullParameter(list, "wgtContestants");
        this.wgtApplied = wgtApplied;
        this.wgtAuditionWeek = wgtAuditionWeek;
        this.wgtAuditionYear = wgtAuditionYear;
        this.wgtCompletedCount = wgtCompletedCount;
        this.wgtWon = wgtWon;
        this.isSccWanted = isSccWanted;
        this.sccCrimeReason = sccCrimeReason;
        this.sccFineAmount = sccFineAmount;
        this.blackHatPurchasesCount = blackHatPurchasesCount;
        this.electionVotedCandidateId = electionVotedCandidateId;
        this.electionVotedWeek = electionVotedWeek;
        this.electionVotedYear = electionVotedYear;
        this.grandAwardNominated = grandAwardNominated;
        this.grandAwardWon = grandAwardWon;
        this.grandAwardVipAccess = grandAwardVipAccess;
        this.lastDemoSubmissionWeek = lastDemoSubmissionWeek;
        this.labelContractObligations = labelContractObligations;
        this.wgtSeason = wgtSeason;
        this.wgtSeasonYear = wgtSeasonYear;
        this.wgtSemiFinalsWeek = wgtSemiFinalsWeek;
        this.wgtGrandFinaleWeek = wgtGrandFinaleWeek;
        this.wgtRegistrationStatus = wgtRegistrationStatus;
        this.wgtLastWinner = wgtLastWinner;
        this.wgtContestants = list;
    }

    public /* synthetic */ WebHubState(boolean z, int i, int i2, int i3, boolean z2, boolean z3, String str, double d, int i4, String str2, int i5, int i6, boolean z4, boolean z5, boolean z6, int i7, String str3, int i8, int i9, int i10, int i11, String str4, String str5, List list, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z, (i12 & 2) != 0 ? 0 : i, (i12 & 4) != 0 ? 0 : i2, (i12 & 8) != 0 ? 0 : i3, (i12 & 16) != 0 ? false : z2, (i12 & 32) != 0 ? false : z3, (i12 & 64) != 0 ? "" : str, (i12 & 128) != 0 ? 45000.0d : d, (i12 & 256) != 0 ? 0 : i4, (i12 & 512) != 0 ? null : str2, (i12 & 1024) != 0 ? 0 : i5, (i12 & 2048) != 0 ? 0 : i6, (i12 & 4096) != 0 ? false : z4, (i12 & 8192) != 0 ? false : z5, (i12 & 16384) != 0 ? false : z6, (i12 & 32768) != 0 ? 0 : i7, (i12 & 65536) != 0 ? "" : str3, (i12 & 131072) != 0 ? 1 : i8, (i12 & 262144) != 0 ? 1 : i9, (i12 & 524288) != 0 ? 14 : i10, (i12 & 1048576) != 0 ? 20 : i11, (i12 & 2097152) != 0 ? "NONE" : str4, (i12 & 4194304) != 0 ? "" : str5, (i12 & 8388608) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final boolean getWgtApplied() {
        return this.wgtApplied;
    }

    public final int getWgtAuditionWeek() {
        return this.wgtAuditionWeek;
    }

    public final int getWgtAuditionYear() {
        return this.wgtAuditionYear;
    }

    public final int getWgtCompletedCount() {
        return this.wgtCompletedCount;
    }

    public final boolean getWgtWon() {
        return this.wgtWon;
    }

    public final boolean isSccWanted() {
        return this.isSccWanted;
    }

    @NotNull
    public final String getSccCrimeReason() {
        return this.sccCrimeReason;
    }

    public final double getSccFineAmount() {
        return this.sccFineAmount;
    }

    public final int getBlackHatPurchasesCount() {
        return this.blackHatPurchasesCount;
    }

    @Nullable
    public final String getElectionVotedCandidateId() {
        return this.electionVotedCandidateId;
    }

    public final int getElectionVotedWeek() {
        return this.electionVotedWeek;
    }

    public final int getElectionVotedYear() {
        return this.electionVotedYear;
    }

    public final boolean getGrandAwardNominated() {
        return this.grandAwardNominated;
    }

    public final boolean getGrandAwardWon() {
        return this.grandAwardWon;
    }

    public final boolean getGrandAwardVipAccess() {
        return this.grandAwardVipAccess;
    }

    public final int getLastDemoSubmissionWeek() {
        return this.lastDemoSubmissionWeek;
    }

    @NotNull
    public final String getLabelContractObligations() {
        return this.labelContractObligations;
    }

    public final int getWgtSeason() {
        return this.wgtSeason;
    }

    public final int getWgtSeasonYear() {
        return this.wgtSeasonYear;
    }

    public final int getWgtSemiFinalsWeek() {
        return this.wgtSemiFinalsWeek;
    }

    public final int getWgtGrandFinaleWeek() {
        return this.wgtGrandFinaleWeek;
    }

    @NotNull
    public final String getWgtRegistrationStatus() {
        return this.wgtRegistrationStatus;
    }

    @NotNull
    public final String getWgtLastWinner() {
        return this.wgtLastWinner;
    }

    @NotNull
    public final List<String> getWgtContestants() {
        return this.wgtContestants;
    }
}
