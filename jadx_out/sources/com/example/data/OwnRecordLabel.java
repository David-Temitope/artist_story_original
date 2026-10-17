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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��h\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001B¹\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\r\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005\u0012\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0005\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0010\u0012\b\b\u0002\u0010#\u001a\u00020\r\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\b\b\u0002\u0010&\u001a\u00020\u0010\u0012\b\b\u0002\u0010'\u001a\u00020\u0010\u0012\b\b\u0002\u0010(\u001a\u00020\u0010¢\u0006\u0004\b)\u0010*J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u000f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010M\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010N\u001a\u00020\nHÆ\u0003J\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010P\u001a\u00020\rHÆ\u0003J\t\u0010Q\u001a\u00020\rHÆ\u0003J\t\u0010R\u001a\u00020\u0010HÆ\u0003J\t\u0010S\u001a\u00020\rHÆ\u0003J\t\u0010T\u001a\u00020\rHÆ\u0003J\t\u0010U\u001a\u00020\nHÆ\u0003J\t\u0010V\u001a\u00020\nHÆ\u0003J\t\u0010W\u001a\u00020\nHÆ\u0003J\t\u0010X\u001a\u00020\nHÆ\u0003J\t\u0010Y\u001a\u00020\nHÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005HÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005HÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0005HÆ\u0003J\u000f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005HÆ\u0003J\u000f\u0010^\u001a\b\u0012\u0004\u0012\u00020!0\u0005HÆ\u0003J\t\u0010_\u001a\u00020\u0010HÆ\u0003J\t\u0010`\u001a\u00020\rHÆ\u0003J\t\u0010a\u001a\u00020%HÆ\u0003J\t\u0010b\u001a\u00020\u0010HÆ\u0003J\t\u0010c\u001a\u00020\u0010HÆ\u0003J\t\u0010d\u001a\u00020\u0010HÆ\u0003J½\u0002\u0010e\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00052\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00052\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u00052\b\b\u0002\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020\r2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020\u00102\b\b\u0002\u0010'\u001a\u00020\u00102\b\b\u0002\u0010(\u001a\u00020\u0010HÆ\u0001J\u0013\u0010f\u001a\u00020g2\b\u0010h\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010i\u001a\u00020\nHÖ\u0001J\t\u0010j\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b+\u0010,R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n��\u001a\u0004\b-\u0010.R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n��\u001a\u0004\b/\u0010.R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n��\u001a\u0004\b2\u0010.R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b3\u00104R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b5\u00104R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\b6\u00107R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b8\u00104R\u0011\u0010\u0012\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b9\u00104R\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b:\u00101R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b;\u00101R\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b<\u00101R\u0011\u0010\u0016\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b=\u00101R\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b>\u00101R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005¢\u0006\b\n��\u001a\u0004\b?\u0010.R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0005¢\u0006\b\n��\u001a\u0004\b@\u0010.R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0005¢\u0006\b\n��\u001a\u0004\bA\u0010.R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0005¢\u0006\b\n��\u001a\u0004\bB\u0010.R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0005¢\u0006\b\n��\u001a\u0004\bC\u0010.R\u0011\u0010\"\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\bD\u00107R\u0011\u0010#\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\bE\u00104R\u0011\u0010$\u001a\u00020%¢\u0006\b\n��\u001a\u0004\bF\u0010GR\u0011\u0010&\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\bH\u00107R\u0011\u0010'\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\bI\u00107R\u0011\u0010(\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\bJ\u00107¨\u0006k"}, d2 = {"Lcom/example/data/OwnRecordLabel;", "", "name", "", "managers", "", "Lcom/example/data/LabelManager;", "promoTeams", "Lcom/example/data/LabelPromotionTeam;", "ownedPropertiesCount", "", "signedNPCIds", "accruedDebts", "", "companyCash", "equityHeldByPlayer", "", "valuation", "weeklyRoyaltiesEarned", "productionLevel", "marketingLevel", "touringLevel", "legalLevel", "arLevel", "coFounders", "Lcom/example/data/CoFounder;", "shareholders", "Lcom/example/data/Shareholder;", "boardMembers", "Lcom/example/data/BoardMember;", "pendingInvestorOffers", "Lcom/example/data/InvestorOffer;", "pendingSigningOffers", "Lcom/example/data/ArtistSigningOffer;", "dividendPayoutRate", "ceoSalary", "totalSharesIssued", "", "boardSatisfaction", "marketShare", "labelReputation", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ILjava/util/List;DDFDDIIIIILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;FDJFFF)V", "getName", "()Ljava/lang/String;", "getManagers", "()Ljava/util/List;", "getPromoTeams", "getOwnedPropertiesCount", "()I", "getSignedNPCIds", "getAccruedDebts", "()D", "getCompanyCash", "getEquityHeldByPlayer", "()F", "getValuation", "getWeeklyRoyaltiesEarned", "getProductionLevel", "getMarketingLevel", "getTouringLevel", "getLegalLevel", "getArLevel", "getCoFounders", "getShareholders", "getBoardMembers", "getPendingInvestorOffers", "getPendingSigningOffers", "getDividendPayoutRate", "getCeoSalary", "getTotalSharesIssued", "()J", "getBoardSatisfaction", "getMarketShare", "getLabelReputation", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: OwnRecordLabel.class */
public final class OwnRecordLabel {
    @NotNull
    private final String name;
    @NotNull
    private final List<LabelManager> managers;
    @NotNull
    private final List<LabelPromotionTeam> promoTeams;
    private final int ownedPropertiesCount;
    @NotNull
    private final List<String> signedNPCIds;
    private final double accruedDebts;
    private final double companyCash;
    private final float equityHeldByPlayer;
    private final double valuation;
    private final double weeklyRoyaltiesEarned;
    private final int productionLevel;
    private final int marketingLevel;
    private final int touringLevel;
    private final int legalLevel;
    private final int arLevel;
    @NotNull
    private final List<CoFounder> coFounders;
    @NotNull
    private final List<Shareholder> shareholders;
    @NotNull
    private final List<BoardMember> boardMembers;
    @NotNull
    private final List<InvestorOffer> pendingInvestorOffers;
    @NotNull
    private final List<ArtistSigningOffer> pendingSigningOffers;
    private final float dividendPayoutRate;
    private final double ceoSalary;
    private final long totalSharesIssued;
    private final float boardSatisfaction;
    private final float marketShare;
    private final float labelReputation;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final List<LabelManager> component2() {
        return this.managers;
    }

    @NotNull
    public final List<LabelPromotionTeam> component3() {
        return this.promoTeams;
    }

    public final int component4() {
        return this.ownedPropertiesCount;
    }

    @NotNull
    public final List<String> component5() {
        return this.signedNPCIds;
    }

    public final double component6() {
        return this.accruedDebts;
    }

    public final double component7() {
        return this.companyCash;
    }

    public final float component8() {
        return this.equityHeldByPlayer;
    }

    public final double component9() {
        return this.valuation;
    }

    public final double component10() {
        return this.weeklyRoyaltiesEarned;
    }

    public final int component11() {
        return this.productionLevel;
    }

    public final int component12() {
        return this.marketingLevel;
    }

    public final int component13() {
        return this.touringLevel;
    }

    public final int component14() {
        return this.legalLevel;
    }

    public final int component15() {
        return this.arLevel;
    }

    @NotNull
    public final List<CoFounder> component16() {
        return this.coFounders;
    }

    @NotNull
    public final List<Shareholder> component17() {
        return this.shareholders;
    }

    @NotNull
    public final List<BoardMember> component18() {
        return this.boardMembers;
    }

    @NotNull
    public final List<InvestorOffer> component19() {
        return this.pendingInvestorOffers;
    }

    @NotNull
    public final List<ArtistSigningOffer> component20() {
        return this.pendingSigningOffers;
    }

    public final float component21() {
        return this.dividendPayoutRate;
    }

    public final double component22() {
        return this.ceoSalary;
    }

    public final long component23() {
        return this.totalSharesIssued;
    }

    public final float component24() {
        return this.boardSatisfaction;
    }

    public final float component25() {
        return this.marketShare;
    }

    public final float component26() {
        return this.labelReputation;
    }

    @NotNull
    public final OwnRecordLabel copy(@NotNull String name, @NotNull List<LabelManager> list, @NotNull List<LabelPromotionTeam> list2, int ownedPropertiesCount, @NotNull List<String> list3, double accruedDebts, double companyCash, float equityHeldByPlayer, double valuation, double weeklyRoyaltiesEarned, int productionLevel, int marketingLevel, int touringLevel, int legalLevel, int arLevel, @NotNull List<CoFounder> list4, @NotNull List<Shareholder> list5, @NotNull List<BoardMember> list6, @NotNull List<InvestorOffer> list7, @NotNull List<ArtistSigningOffer> list8, float dividendPayoutRate, double ceoSalary, long totalSharesIssued, float boardSatisfaction, float marketShare, float labelReputation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "managers");
        Intrinsics.checkNotNullParameter(list2, "promoTeams");
        Intrinsics.checkNotNullParameter(list3, "signedNPCIds");
        Intrinsics.checkNotNullParameter(list4, "coFounders");
        Intrinsics.checkNotNullParameter(list5, "shareholders");
        Intrinsics.checkNotNullParameter(list6, "boardMembers");
        Intrinsics.checkNotNullParameter(list7, "pendingInvestorOffers");
        Intrinsics.checkNotNullParameter(list8, "pendingSigningOffers");
        return new OwnRecordLabel(name, list, list2, ownedPropertiesCount, list3, accruedDebts, companyCash, equityHeldByPlayer, valuation, weeklyRoyaltiesEarned, productionLevel, marketingLevel, touringLevel, legalLevel, arLevel, list4, list5, list6, list7, list8, dividendPayoutRate, ceoSalary, totalSharesIssued, boardSatisfaction, marketShare, labelReputation);
    }

    public static /* synthetic */ OwnRecordLabel copy$default(OwnRecordLabel ownRecordLabel, String str, List list, List list2, int i, List list3, double d, double d2, float f, double d3, double d4, int i2, int i3, int i4, int i5, int i6, List list4, List list5, List list6, List list7, List list8, float f2, double d5, long j, float f3, float f4, float f5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = ownRecordLabel.name;
        }
        if ((i7 & 2) != 0) {
            list = ownRecordLabel.managers;
        }
        if ((i7 & 4) != 0) {
            list2 = ownRecordLabel.promoTeams;
        }
        if ((i7 & 8) != 0) {
            i = ownRecordLabel.ownedPropertiesCount;
        }
        if ((i7 & 16) != 0) {
            list3 = ownRecordLabel.signedNPCIds;
        }
        if ((i7 & 32) != 0) {
            d = ownRecordLabel.accruedDebts;
        }
        if ((i7 & 64) != 0) {
            d2 = ownRecordLabel.companyCash;
        }
        if ((i7 & 128) != 0) {
            f = ownRecordLabel.equityHeldByPlayer;
        }
        if ((i7 & 256) != 0) {
            d3 = ownRecordLabel.valuation;
        }
        if ((i7 & 512) != 0) {
            d4 = ownRecordLabel.weeklyRoyaltiesEarned;
        }
        if ((i7 & 1024) != 0) {
            i2 = ownRecordLabel.productionLevel;
        }
        if ((i7 & 2048) != 0) {
            i3 = ownRecordLabel.marketingLevel;
        }
        if ((i7 & 4096) != 0) {
            i4 = ownRecordLabel.touringLevel;
        }
        if ((i7 & 8192) != 0) {
            i5 = ownRecordLabel.legalLevel;
        }
        if ((i7 & 16384) != 0) {
            i6 = ownRecordLabel.arLevel;
        }
        if ((i7 & 32768) != 0) {
            list4 = ownRecordLabel.coFounders;
        }
        if ((i7 & 65536) != 0) {
            list5 = ownRecordLabel.shareholders;
        }
        if ((i7 & 131072) != 0) {
            list6 = ownRecordLabel.boardMembers;
        }
        if ((i7 & 262144) != 0) {
            list7 = ownRecordLabel.pendingInvestorOffers;
        }
        if ((i7 & 524288) != 0) {
            list8 = ownRecordLabel.pendingSigningOffers;
        }
        if ((i7 & 1048576) != 0) {
            f2 = ownRecordLabel.dividendPayoutRate;
        }
        if ((i7 & 2097152) != 0) {
            d5 = ownRecordLabel.ceoSalary;
        }
        if ((i7 & 4194304) != 0) {
            j = ownRecordLabel.totalSharesIssued;
        }
        if ((i7 & 8388608) != 0) {
            f3 = ownRecordLabel.boardSatisfaction;
        }
        if ((i7 & 16777216) != 0) {
            f4 = ownRecordLabel.marketShare;
        }
        if ((i7 & 33554432) != 0) {
            f5 = ownRecordLabel.labelReputation;
        }
        return ownRecordLabel.copy(str, list, list2, i, list3, d, d2, f, d3, d4, i2, i3, i4, i5, i6, list4, list5, list6, list7, list8, f2, d5, j, f3, f4, f5);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        List<LabelManager> list = this.managers;
        List<LabelPromotionTeam> list2 = this.promoTeams;
        int i = this.ownedPropertiesCount;
        List<String> list3 = this.signedNPCIds;
        double d = this.accruedDebts;
        double d2 = this.companyCash;
        float f = this.equityHeldByPlayer;
        double d3 = this.valuation;
        double d4 = this.weeklyRoyaltiesEarned;
        int i2 = this.productionLevel;
        int i3 = this.marketingLevel;
        int i4 = this.touringLevel;
        int i5 = this.legalLevel;
        int i6 = this.arLevel;
        List<CoFounder> list4 = this.coFounders;
        List<Shareholder> list5 = this.shareholders;
        List<BoardMember> list6 = this.boardMembers;
        List<InvestorOffer> list7 = this.pendingInvestorOffers;
        List<ArtistSigningOffer> list8 = this.pendingSigningOffers;
        float f2 = this.dividendPayoutRate;
        double d5 = this.ceoSalary;
        long j = this.totalSharesIssued;
        float f3 = this.boardSatisfaction;
        float f4 = this.marketShare;
        float f5 = this.labelReputation;
        return "OwnRecordLabel(name=" + str + ", managers=" + list + ", promoTeams=" + list2 + ", ownedPropertiesCount=" + i + ", signedNPCIds=" + list3 + ", accruedDebts=" + d + ", companyCash=" + str + ", equityHeldByPlayer=" + d2 + ", valuation=" + str + ", weeklyRoyaltiesEarned=" + f + ", productionLevel=" + d3 + ", marketingLevel=" + str + ", touringLevel=" + d4 + ", legalLevel=" + str + ", arLevel=" + i2 + ", coFounders=" + i3 + ", shareholders=" + i4 + ", boardMembers=" + i5 + ", pendingInvestorOffers=" + i6 + ", pendingSigningOffers=" + list4 + ", dividendPayoutRate=" + list5 + ", ceoSalary=" + list6 + ", totalSharesIssued=" + list7 + ", boardSatisfaction=" + list8 + ", marketShare=" + f2 + ", labelReputation=" + d5 + ")";
    }

    public int hashCode() {
        int result = this.name.hashCode();
        return (((((((((((((((((((((((((((((((((((((((((((((((((result * 31) + this.managers.hashCode()) * 31) + this.promoTeams.hashCode()) * 31) + Integer.hashCode(this.ownedPropertiesCount)) * 31) + this.signedNPCIds.hashCode()) * 31) + Double.hashCode(this.accruedDebts)) * 31) + Double.hashCode(this.companyCash)) * 31) + Float.hashCode(this.equityHeldByPlayer)) * 31) + Double.hashCode(this.valuation)) * 31) + Double.hashCode(this.weeklyRoyaltiesEarned)) * 31) + Integer.hashCode(this.productionLevel)) * 31) + Integer.hashCode(this.marketingLevel)) * 31) + Integer.hashCode(this.touringLevel)) * 31) + Integer.hashCode(this.legalLevel)) * 31) + Integer.hashCode(this.arLevel)) * 31) + this.coFounders.hashCode()) * 31) + this.shareholders.hashCode()) * 31) + this.boardMembers.hashCode()) * 31) + this.pendingInvestorOffers.hashCode()) * 31) + this.pendingSigningOffers.hashCode()) * 31) + Float.hashCode(this.dividendPayoutRate)) * 31) + Double.hashCode(this.ceoSalary)) * 31) + Long.hashCode(this.totalSharesIssued)) * 31) + Float.hashCode(this.boardSatisfaction)) * 31) + Float.hashCode(this.marketShare)) * 31) + Float.hashCode(this.labelReputation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof OwnRecordLabel) {
            OwnRecordLabel ownRecordLabel = (OwnRecordLabel) other;
            return Intrinsics.areEqual(this.name, ownRecordLabel.name) && Intrinsics.areEqual(this.managers, ownRecordLabel.managers) && Intrinsics.areEqual(this.promoTeams, ownRecordLabel.promoTeams) && this.ownedPropertiesCount == ownRecordLabel.ownedPropertiesCount && Intrinsics.areEqual(this.signedNPCIds, ownRecordLabel.signedNPCIds) && Double.compare(this.accruedDebts, ownRecordLabel.accruedDebts) == 0 && Double.compare(this.companyCash, ownRecordLabel.companyCash) == 0 && Float.compare(this.equityHeldByPlayer, ownRecordLabel.equityHeldByPlayer) == 0 && Double.compare(this.valuation, ownRecordLabel.valuation) == 0 && Double.compare(this.weeklyRoyaltiesEarned, ownRecordLabel.weeklyRoyaltiesEarned) == 0 && this.productionLevel == ownRecordLabel.productionLevel && this.marketingLevel == ownRecordLabel.marketingLevel && this.touringLevel == ownRecordLabel.touringLevel && this.legalLevel == ownRecordLabel.legalLevel && this.arLevel == ownRecordLabel.arLevel && Intrinsics.areEqual(this.coFounders, ownRecordLabel.coFounders) && Intrinsics.areEqual(this.shareholders, ownRecordLabel.shareholders) && Intrinsics.areEqual(this.boardMembers, ownRecordLabel.boardMembers) && Intrinsics.areEqual(this.pendingInvestorOffers, ownRecordLabel.pendingInvestorOffers) && Intrinsics.areEqual(this.pendingSigningOffers, ownRecordLabel.pendingSigningOffers) && Float.compare(this.dividendPayoutRate, ownRecordLabel.dividendPayoutRate) == 0 && Double.compare(this.ceoSalary, ownRecordLabel.ceoSalary) == 0 && this.totalSharesIssued == ownRecordLabel.totalSharesIssued && Float.compare(this.boardSatisfaction, ownRecordLabel.boardSatisfaction) == 0 && Float.compare(this.marketShare, ownRecordLabel.marketShare) == 0 && Float.compare(this.labelReputation, ownRecordLabel.labelReputation) == 0;
        }
        return false;
    }

    public OwnRecordLabel(@NotNull String name, @NotNull List<LabelManager> list, @NotNull List<LabelPromotionTeam> list2, int ownedPropertiesCount, @NotNull List<String> list3, double accruedDebts, double companyCash, float equityHeldByPlayer, double valuation, double weeklyRoyaltiesEarned, int productionLevel, int marketingLevel, int touringLevel, int legalLevel, int arLevel, @NotNull List<CoFounder> list4, @NotNull List<Shareholder> list5, @NotNull List<BoardMember> list6, @NotNull List<InvestorOffer> list7, @NotNull List<ArtistSigningOffer> list8, float dividendPayoutRate, double ceoSalary, long totalSharesIssued, float boardSatisfaction, float marketShare, float labelReputation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(list, "managers");
        Intrinsics.checkNotNullParameter(list2, "promoTeams");
        Intrinsics.checkNotNullParameter(list3, "signedNPCIds");
        Intrinsics.checkNotNullParameter(list4, "coFounders");
        Intrinsics.checkNotNullParameter(list5, "shareholders");
        Intrinsics.checkNotNullParameter(list6, "boardMembers");
        Intrinsics.checkNotNullParameter(list7, "pendingInvestorOffers");
        Intrinsics.checkNotNullParameter(list8, "pendingSigningOffers");
        this.name = name;
        this.managers = list;
        this.promoTeams = list2;
        this.ownedPropertiesCount = ownedPropertiesCount;
        this.signedNPCIds = list3;
        this.accruedDebts = accruedDebts;
        this.companyCash = companyCash;
        this.equityHeldByPlayer = equityHeldByPlayer;
        this.valuation = valuation;
        this.weeklyRoyaltiesEarned = weeklyRoyaltiesEarned;
        this.productionLevel = productionLevel;
        this.marketingLevel = marketingLevel;
        this.touringLevel = touringLevel;
        this.legalLevel = legalLevel;
        this.arLevel = arLevel;
        this.coFounders = list4;
        this.shareholders = list5;
        this.boardMembers = list6;
        this.pendingInvestorOffers = list7;
        this.pendingSigningOffers = list8;
        this.dividendPayoutRate = dividendPayoutRate;
        this.ceoSalary = ceoSalary;
        this.totalSharesIssued = totalSharesIssued;
        this.boardSatisfaction = boardSatisfaction;
        this.marketShare = marketShare;
        this.labelReputation = labelReputation;
    }

    public /* synthetic */ OwnRecordLabel(String str, List list, List list2, int i, List list3, double d, double d2, float f, double d3, double d4, int i2, int i3, int i4, int i5, int i6, List list4, List list5, List list6, List list7, List list8, float f2, double d5, long j, float f3, float f4, float f5, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? CollectionsKt.emptyList() : list, (i7 & 4) != 0 ? CollectionsKt.emptyList() : list2, (i7 & 8) != 0 ? 0 : i, (i7 & 16) != 0 ? CollectionsKt.emptyList() : list3, (i7 & 32) != 0 ? 0.0d : d, (i7 & 64) != 0 ? 100000.0d : d2, (i7 & 128) != 0 ? 100.0f : f, (i7 & 256) != 0 ? 2500000.0d : d3, (i7 & 512) != 0 ? 0.0d : d4, (i7 & 1024) != 0 ? 1 : i2, (i7 & 2048) != 0 ? 1 : i3, (i7 & 4096) != 0 ? 1 : i4, (i7 & 8192) != 0 ? 1 : i5, (i7 & 16384) != 0 ? 1 : i6, (i7 & 32768) != 0 ? CollectionsKt.emptyList() : list4, (i7 & 65536) != 0 ? CollectionsKt.emptyList() : list5, (i7 & 131072) != 0 ? CollectionsKt.emptyList() : list6, (i7 & 262144) != 0 ? CollectionsKt.emptyList() : list7, (i7 & 524288) != 0 ? CollectionsKt.emptyList() : list8, (i7 & 1048576) != 0 ? 10.0f : f2, (i7 & 2097152) != 0 ? 1500.0d : d5, (i7 & 4194304) != 0 ? 1000000L : j, (i7 & 8388608) != 0 ? 80.0f : f3, (i7 & 16777216) != 0 ? 0.5f : f4, (i7 & 33554432) != 0 ? 70.0f : f5);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<LabelManager> getManagers() {
        return this.managers;
    }

    @NotNull
    public final List<LabelPromotionTeam> getPromoTeams() {
        return this.promoTeams;
    }

    public final int getOwnedPropertiesCount() {
        return this.ownedPropertiesCount;
    }

    @NotNull
    public final List<String> getSignedNPCIds() {
        return this.signedNPCIds;
    }

    public final double getAccruedDebts() {
        return this.accruedDebts;
    }

    public final double getCompanyCash() {
        return this.companyCash;
    }

    public final float getEquityHeldByPlayer() {
        return this.equityHeldByPlayer;
    }

    public final double getValuation() {
        return this.valuation;
    }

    public final double getWeeklyRoyaltiesEarned() {
        return this.weeklyRoyaltiesEarned;
    }

    public final int getProductionLevel() {
        return this.productionLevel;
    }

    public final int getMarketingLevel() {
        return this.marketingLevel;
    }

    public final int getTouringLevel() {
        return this.touringLevel;
    }

    public final int getLegalLevel() {
        return this.legalLevel;
    }

    public final int getArLevel() {
        return this.arLevel;
    }

    @NotNull
    public final List<CoFounder> getCoFounders() {
        return this.coFounders;
    }

    @NotNull
    public final List<Shareholder> getShareholders() {
        return this.shareholders;
    }

    @NotNull
    public final List<BoardMember> getBoardMembers() {
        return this.boardMembers;
    }

    @NotNull
    public final List<InvestorOffer> getPendingInvestorOffers() {
        return this.pendingInvestorOffers;
    }

    @NotNull
    public final List<ArtistSigningOffer> getPendingSigningOffers() {
        return this.pendingSigningOffers;
    }

    public final float getDividendPayoutRate() {
        return this.dividendPayoutRate;
    }

    public final double getCeoSalary() {
        return this.ceoSalary;
    }

    public final long getTotalSharesIssued() {
        return this.totalSharesIssued;
    }

    public final float getBoardSatisfaction() {
        return this.boardSatisfaction;
    }

    public final float getMarketShare() {
        return this.marketShare;
    }

    public final float getLabelReputation() {
        return this.labelReputation;
    }
}
