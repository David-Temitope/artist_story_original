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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/example/data/InvestorOffer;", "", "id", "", "investorName", "investorType", "cashOffer", "", "equityRequested", "", "minimumValuation", "durationWeeksExpires", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DFDI)V", "getId", "()Ljava/lang/String;", "getInvestorName", "getInvestorType", "getCashOffer", "()D", "getEquityRequested", "()F", "getMinimumValuation", "getDurationWeeksExpires", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: InvestorOffer.class */
public final class InvestorOffer {
    @NotNull
    private final String id;
    @NotNull
    private final String investorName;
    @NotNull
    private final String investorType;
    private final double cashOffer;
    private final float equityRequested;
    private final double minimumValuation;
    private final int durationWeeksExpires;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.investorName;
    }

    @NotNull
    public final String component3() {
        return this.investorType;
    }

    public final double component4() {
        return this.cashOffer;
    }

    public final float component5() {
        return this.equityRequested;
    }

    public final double component6() {
        return this.minimumValuation;
    }

    public final int component7() {
        return this.durationWeeksExpires;
    }

    @NotNull
    public final InvestorOffer copy(@NotNull String id, @NotNull String investorName, @NotNull String investorType, double cashOffer, float equityRequested, double minimumValuation, int durationWeeksExpires) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(investorName, "investorName");
        Intrinsics.checkNotNullParameter(investorType, "investorType");
        return new InvestorOffer(id, investorName, investorType, cashOffer, equityRequested, minimumValuation, durationWeeksExpires);
    }

    public static /* synthetic */ InvestorOffer copy$default(InvestorOffer investorOffer, String str, String str2, String str3, double d, float f, double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = investorOffer.id;
        }
        if ((i2 & 2) != 0) {
            str2 = investorOffer.investorName;
        }
        if ((i2 & 4) != 0) {
            str3 = investorOffer.investorType;
        }
        if ((i2 & 8) != 0) {
            d = investorOffer.cashOffer;
        }
        if ((i2 & 16) != 0) {
            f = investorOffer.equityRequested;
        }
        if ((i2 & 32) != 0) {
            d2 = investorOffer.minimumValuation;
        }
        if ((i2 & 64) != 0) {
            i = investorOffer.durationWeeksExpires;
        }
        return investorOffer.copy(str, str2, str3, d, f, d2, i);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.investorName;
        String str3 = this.investorType;
        double d = this.cashOffer;
        float f = this.equityRequested;
        double d2 = this.minimumValuation;
        int i = this.durationWeeksExpires;
        return "InvestorOffer(id=" + str + ", investorName=" + str2 + ", investorType=" + str3 + ", cashOffer=" + d + ", equityRequested=" + str + ", minimumValuation=" + f + ", durationWeeksExpires=" + d2 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((result * 31) + this.investorName.hashCode()) * 31) + this.investorType.hashCode()) * 31) + Double.hashCode(this.cashOffer)) * 31) + Float.hashCode(this.equityRequested)) * 31) + Double.hashCode(this.minimumValuation)) * 31) + Integer.hashCode(this.durationWeeksExpires);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof InvestorOffer) {
            InvestorOffer investorOffer = (InvestorOffer) other;
            return Intrinsics.areEqual(this.id, investorOffer.id) && Intrinsics.areEqual(this.investorName, investorOffer.investorName) && Intrinsics.areEqual(this.investorType, investorOffer.investorType) && Double.compare(this.cashOffer, investorOffer.cashOffer) == 0 && Float.compare(this.equityRequested, investorOffer.equityRequested) == 0 && Double.compare(this.minimumValuation, investorOffer.minimumValuation) == 0 && this.durationWeeksExpires == investorOffer.durationWeeksExpires;
        }
        return false;
    }

    public InvestorOffer(@NotNull String id, @NotNull String investorName, @NotNull String investorType, double cashOffer, float equityRequested, double minimumValuation, int durationWeeksExpires) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(investorName, "investorName");
        Intrinsics.checkNotNullParameter(investorType, "investorType");
        this.id = id;
        this.investorName = investorName;
        this.investorType = investorType;
        this.cashOffer = cashOffer;
        this.equityRequested = equityRequested;
        this.minimumValuation = minimumValuation;
        this.durationWeeksExpires = durationWeeksExpires;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getInvestorName() {
        return this.investorName;
    }

    @NotNull
    public final String getInvestorType() {
        return this.investorType;
    }

    public final double getCashOffer() {
        return this.cashOffer;
    }

    public final float getEquityRequested() {
        return this.equityRequested;
    }

    public final double getMinimumValuation() {
        return this.minimumValuation;
    }

    public final int getDurationWeeksExpires() {
        return this.durationWeeksExpires;
    }
}
