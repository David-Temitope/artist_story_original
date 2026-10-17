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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n��\n\u0002\u0010 \n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018��2\u00020\u0001B\u0081\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010/\u001a\u00020\u000bHÆ\u0003J\t\u00100\u001a\u00020\u0012HÆ\u0003J\u0083\u0001\u00101\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00102\u001a\u00020\u00122\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\rHÖ\u0001J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b \u0010\u001fR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n��\u001a\u0004\b!\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\"\u0010#R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n��\u001a\u0004\b$\u0010%¨\u00066"}, d2 = {"Lcom/example/data/WealthEngineState;", "", "emergencyFundBalance", "", "payrollReserve", "businessReserve", "bondsBalance", "bondsInterestRate", "", "financialReviewLog", "", "", "lastReviewWeek", "", "lastReviewYear", "financialHistoryCashFlow", "smmPostCategory", "smmAutoPost", "", "<init>", "(DDDDFLjava/util/List;IILjava/util/List;Ljava/lang/String;Z)V", "getEmergencyFundBalance", "()D", "getPayrollReserve", "getBusinessReserve", "getBondsBalance", "getBondsInterestRate", "()F", "getFinancialReviewLog", "()Ljava/util/List;", "getLastReviewWeek", "()I", "getLastReviewYear", "getFinancialHistoryCashFlow", "getSmmPostCategory", "()Ljava/lang/String;", "getSmmAutoPost", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: WealthEngineState.class */
public final class WealthEngineState {
    private final double emergencyFundBalance;
    private final double payrollReserve;
    private final double businessReserve;
    private final double bondsBalance;
    private final float bondsInterestRate;
    @NotNull
    private final List<String> financialReviewLog;
    private final int lastReviewWeek;
    private final int lastReviewYear;
    @NotNull
    private final List<String> financialHistoryCashFlow;
    @NotNull
    private final String smmPostCategory;
    private final boolean smmAutoPost;
    public static final int $stable = 8;

    public final double component1() {
        return this.emergencyFundBalance;
    }

    public final double component2() {
        return this.payrollReserve;
    }

    public final double component3() {
        return this.businessReserve;
    }

    public final double component4() {
        return this.bondsBalance;
    }

    public final float component5() {
        return this.bondsInterestRate;
    }

    @NotNull
    public final List<String> component6() {
        return this.financialReviewLog;
    }

    public final int component7() {
        return this.lastReviewWeek;
    }

    public final int component8() {
        return this.lastReviewYear;
    }

    @NotNull
    public final List<String> component9() {
        return this.financialHistoryCashFlow;
    }

    @NotNull
    public final String component10() {
        return this.smmPostCategory;
    }

    public final boolean component11() {
        return this.smmAutoPost;
    }

    @NotNull
    public final WealthEngineState copy(double emergencyFundBalance, double payrollReserve, double businessReserve, double bondsBalance, float bondsInterestRate, @NotNull List<String> list, int lastReviewWeek, int lastReviewYear, @NotNull List<String> list2, @NotNull String smmPostCategory, boolean smmAutoPost) {
        Intrinsics.checkNotNullParameter(list, "financialReviewLog");
        Intrinsics.checkNotNullParameter(list2, "financialHistoryCashFlow");
        Intrinsics.checkNotNullParameter(smmPostCategory, "smmPostCategory");
        return new WealthEngineState(emergencyFundBalance, payrollReserve, businessReserve, bondsBalance, bondsInterestRate, list, lastReviewWeek, lastReviewYear, list2, smmPostCategory, smmAutoPost);
    }

    public static /* synthetic */ WealthEngineState copy$default(WealthEngineState wealthEngineState, double d, double d2, double d3, double d4, float f, List list, int i, int i2, List list2, String str, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            d = wealthEngineState.emergencyFundBalance;
        }
        if ((i3 & 2) != 0) {
            d2 = wealthEngineState.payrollReserve;
        }
        if ((i3 & 4) != 0) {
            d3 = wealthEngineState.businessReserve;
        }
        if ((i3 & 8) != 0) {
            d4 = wealthEngineState.bondsBalance;
        }
        if ((i3 & 16) != 0) {
            f = wealthEngineState.bondsInterestRate;
        }
        if ((i3 & 32) != 0) {
            list = wealthEngineState.financialReviewLog;
        }
        if ((i3 & 64) != 0) {
            i = wealthEngineState.lastReviewWeek;
        }
        if ((i3 & 128) != 0) {
            i2 = wealthEngineState.lastReviewYear;
        }
        if ((i3 & 256) != 0) {
            list2 = wealthEngineState.financialHistoryCashFlow;
        }
        if ((i3 & 512) != 0) {
            str = wealthEngineState.smmPostCategory;
        }
        if ((i3 & 1024) != 0) {
            z = wealthEngineState.smmAutoPost;
        }
        return wealthEngineState.copy(d, d2, d3, d4, f, list, i, i2, list2, str, z);
    }

    @NotNull
    public String toString() {
        double d = this.emergencyFundBalance;
        double d2 = this.payrollReserve;
        double d3 = this.businessReserve;
        double d4 = this.bondsBalance;
        float f = this.bondsInterestRate;
        List<String> list = this.financialReviewLog;
        int i = this.lastReviewWeek;
        int i2 = this.lastReviewYear;
        List<String> list2 = this.financialHistoryCashFlow;
        String str = this.smmPostCategory;
        boolean z = this.smmAutoPost;
        return "WealthEngineState(emergencyFundBalance=" + d + ", payrollReserve=" + d + ", businessReserve=" + d2 + ", bondsBalance=" + d + ", bondsInterestRate=" + d3 + ", financialReviewLog=" + d + ", lastReviewWeek=" + d4 + ", lastReviewYear=" + d + ", financialHistoryCashFlow=" + f + ", smmPostCategory=" + list + ", smmAutoPost=" + i + ")";
    }

    public int hashCode() {
        int result = Double.hashCode(this.emergencyFundBalance);
        return (((((((((((((((((((result * 31) + Double.hashCode(this.payrollReserve)) * 31) + Double.hashCode(this.businessReserve)) * 31) + Double.hashCode(this.bondsBalance)) * 31) + Float.hashCode(this.bondsInterestRate)) * 31) + this.financialReviewLog.hashCode()) * 31) + Integer.hashCode(this.lastReviewWeek)) * 31) + Integer.hashCode(this.lastReviewYear)) * 31) + this.financialHistoryCashFlow.hashCode()) * 31) + this.smmPostCategory.hashCode()) * 31) + Boolean.hashCode(this.smmAutoPost);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof WealthEngineState) {
            WealthEngineState wealthEngineState = (WealthEngineState) other;
            return Double.compare(this.emergencyFundBalance, wealthEngineState.emergencyFundBalance) == 0 && Double.compare(this.payrollReserve, wealthEngineState.payrollReserve) == 0 && Double.compare(this.businessReserve, wealthEngineState.businessReserve) == 0 && Double.compare(this.bondsBalance, wealthEngineState.bondsBalance) == 0 && Float.compare(this.bondsInterestRate, wealthEngineState.bondsInterestRate) == 0 && Intrinsics.areEqual(this.financialReviewLog, wealthEngineState.financialReviewLog) && this.lastReviewWeek == wealthEngineState.lastReviewWeek && this.lastReviewYear == wealthEngineState.lastReviewYear && Intrinsics.areEqual(this.financialHistoryCashFlow, wealthEngineState.financialHistoryCashFlow) && Intrinsics.areEqual(this.smmPostCategory, wealthEngineState.smmPostCategory) && this.smmAutoPost == wealthEngineState.smmAutoPost;
        }
        return false;
    }

    public WealthEngineState() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0f, null, 0, 0, null, null, false, 2047, null);
    }

    public WealthEngineState(double emergencyFundBalance, double payrollReserve, double businessReserve, double bondsBalance, float bondsInterestRate, @NotNull List<String> list, int lastReviewWeek, int lastReviewYear, @NotNull List<String> list2, @NotNull String smmPostCategory, boolean smmAutoPost) {
        Intrinsics.checkNotNullParameter(list, "financialReviewLog");
        Intrinsics.checkNotNullParameter(list2, "financialHistoryCashFlow");
        Intrinsics.checkNotNullParameter(smmPostCategory, "smmPostCategory");
        this.emergencyFundBalance = emergencyFundBalance;
        this.payrollReserve = payrollReserve;
        this.businessReserve = businessReserve;
        this.bondsBalance = bondsBalance;
        this.bondsInterestRate = bondsInterestRate;
        this.financialReviewLog = list;
        this.lastReviewWeek = lastReviewWeek;
        this.lastReviewYear = lastReviewYear;
        this.financialHistoryCashFlow = list2;
        this.smmPostCategory = smmPostCategory;
        this.smmAutoPost = smmAutoPost;
    }

    public /* synthetic */ WealthEngineState(double d, double d2, double d3, double d4, float f, List list, int i, int i2, List list2, String str, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0.0d : d, (i3 & 2) != 0 ? 0.0d : d2, (i3 & 4) != 0 ? 0.0d : d3, (i3 & 8) != 0 ? 0.0d : d4, (i3 & 16) != 0 ? 0.008f : f, (i3 & 32) != 0 ? CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? CollectionsKt.emptyList() : list2, (i3 & 512) != 0 ? "Music & Art" : str, (i3 & 1024) != 0 ? true : z);
    }

    public final double getEmergencyFundBalance() {
        return this.emergencyFundBalance;
    }

    public final double getPayrollReserve() {
        return this.payrollReserve;
    }

    public final double getBusinessReserve() {
        return this.businessReserve;
    }

    public final double getBondsBalance() {
        return this.bondsBalance;
    }

    public final float getBondsInterestRate() {
        return this.bondsInterestRate;
    }

    @NotNull
    public final List<String> getFinancialReviewLog() {
        return this.financialReviewLog;
    }

    public final int getLastReviewWeek() {
        return this.lastReviewWeek;
    }

    public final int getLastReviewYear() {
        return this.lastReviewYear;
    }

    @NotNull
    public final List<String> getFinancialHistoryCashFlow() {
        return this.financialHistoryCashFlow;
    }

    @NotNull
    public final String getSmmPostCategory() {
        return this.smmPostCategory;
    }

    public final boolean getSmmAutoPost() {
        return this.smmAutoPost;
    }
}
