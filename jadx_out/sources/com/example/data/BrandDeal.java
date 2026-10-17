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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\fHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003Ji\u0010'\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\tHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u0018¨\u0006-"}, d2 = {"Lcom/example/data/BrandDeal;", "", "id", "", "brandName", "tier", "weeklyPayment", "", "durationWeeks", "", "weeksRemaining", "conditions", "", "signedWeek", "signedYear", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIILjava/util/List;II)V", "getId", "()Ljava/lang/String;", "getBrandName", "getTier", "getWeeklyPayment", "()D", "getDurationWeeks", "()I", "getWeeksRemaining", "getConditions", "()Ljava/util/List;", "getSignedWeek", "getSignedYear", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: BrandDeal.class */
public final class BrandDeal {
    @NotNull
    private final String id;
    @NotNull
    private final String brandName;
    @NotNull
    private final String tier;
    private final double weeklyPayment;
    private final int durationWeeks;
    private final int weeksRemaining;
    @NotNull
    private final List<String> conditions;
    private final int signedWeek;
    private final int signedYear;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.brandName;
    }

    @NotNull
    public final String component3() {
        return this.tier;
    }

    public final double component4() {
        return this.weeklyPayment;
    }

    public final int component5() {
        return this.durationWeeks;
    }

    public final int component6() {
        return this.weeksRemaining;
    }

    @NotNull
    public final List<String> component7() {
        return this.conditions;
    }

    public final int component8() {
        return this.signedWeek;
    }

    public final int component9() {
        return this.signedYear;
    }

    @NotNull
    public final BrandDeal copy(@NotNull String id, @NotNull String brandName, @NotNull String tier, double weeklyPayment, int durationWeeks, int weeksRemaining, @NotNull List<String> list, int signedWeek, int signedYear) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(list, "conditions");
        return new BrandDeal(id, brandName, tier, weeklyPayment, durationWeeks, weeksRemaining, list, signedWeek, signedYear);
    }

    public static /* synthetic */ BrandDeal copy$default(BrandDeal brandDeal, String str, String str2, String str3, double d, int i, int i2, List list, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = brandDeal.id;
        }
        if ((i5 & 2) != 0) {
            str2 = brandDeal.brandName;
        }
        if ((i5 & 4) != 0) {
            str3 = brandDeal.tier;
        }
        if ((i5 & 8) != 0) {
            d = brandDeal.weeklyPayment;
        }
        if ((i5 & 16) != 0) {
            i = brandDeal.durationWeeks;
        }
        if ((i5 & 32) != 0) {
            i2 = brandDeal.weeksRemaining;
        }
        if ((i5 & 64) != 0) {
            list = brandDeal.conditions;
        }
        if ((i5 & 128) != 0) {
            i3 = brandDeal.signedWeek;
        }
        if ((i5 & 256) != 0) {
            i4 = brandDeal.signedYear;
        }
        return brandDeal.copy(str, str2, str3, d, i, i2, list, i3, i4);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.brandName;
        String str3 = this.tier;
        double d = this.weeklyPayment;
        int i = this.durationWeeks;
        int i2 = this.weeksRemaining;
        List<String> list = this.conditions;
        int i3 = this.signedWeek;
        int i4 = this.signedYear;
        return "BrandDeal(id=" + str + ", brandName=" + str2 + ", tier=" + str3 + ", weeklyPayment=" + d + ", durationWeeks=" + str + ", weeksRemaining=" + i + ", conditions=" + i2 + ", signedWeek=" + list + ", signedYear=" + i3 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((result * 31) + this.brandName.hashCode()) * 31) + this.tier.hashCode()) * 31) + Double.hashCode(this.weeklyPayment)) * 31) + Integer.hashCode(this.durationWeeks)) * 31) + Integer.hashCode(this.weeksRemaining)) * 31) + this.conditions.hashCode()) * 31) + Integer.hashCode(this.signedWeek)) * 31) + Integer.hashCode(this.signedYear);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof BrandDeal) {
            BrandDeal brandDeal = (BrandDeal) other;
            return Intrinsics.areEqual(this.id, brandDeal.id) && Intrinsics.areEqual(this.brandName, brandDeal.brandName) && Intrinsics.areEqual(this.tier, brandDeal.tier) && Double.compare(this.weeklyPayment, brandDeal.weeklyPayment) == 0 && this.durationWeeks == brandDeal.durationWeeks && this.weeksRemaining == brandDeal.weeksRemaining && Intrinsics.areEqual(this.conditions, brandDeal.conditions) && this.signedWeek == brandDeal.signedWeek && this.signedYear == brandDeal.signedYear;
        }
        return false;
    }

    public BrandDeal(@NotNull String id, @NotNull String brandName, @NotNull String tier, double weeklyPayment, int durationWeeks, int weeksRemaining, @NotNull List<String> list, int signedWeek, int signedYear) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(brandName, "brandName");
        Intrinsics.checkNotNullParameter(tier, "tier");
        Intrinsics.checkNotNullParameter(list, "conditions");
        this.id = id;
        this.brandName = brandName;
        this.tier = tier;
        this.weeklyPayment = weeklyPayment;
        this.durationWeeks = durationWeeks;
        this.weeksRemaining = weeksRemaining;
        this.conditions = list;
        this.signedWeek = signedWeek;
        this.signedYear = signedYear;
    }

    public /* synthetic */ BrandDeal(String str, String str2, String str3, double d, int i, int i2, List list, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, i, i2, (i5 & 64) != 0 ? CollectionsKt.emptyList() : list, i3, i4);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getBrandName() {
        return this.brandName;
    }

    @NotNull
    public final String getTier() {
        return this.tier;
    }

    public final double getWeeklyPayment() {
        return this.weeklyPayment;
    }

    public final int getDurationWeeks() {
        return this.durationWeeks;
    }

    public final int getWeeksRemaining() {
        return this.weeksRemaining;
    }

    @NotNull
    public final List<String> getConditions() {
        return this.conditions;
    }

    public final int getSignedWeek() {
        return this.signedWeek;
    }

    public final int getSignedYear() {
        return this.signedYear;
    }
}
