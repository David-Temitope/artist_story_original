package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MeTubeAndBrandHelper.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018��2\u00020\u0001B_\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003Ju\u0010/\u001a\u00020��2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u0006HÆ\u0001J\u0013\u00100\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u000eHÖ\u0001J\t\u00103\u001a\u00020\u000bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n��\u001a\u0004\b!\u0010\"R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b#\u0010\u0018R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b$\u0010\u0018¨\u00064"}, d2 = {"Lcom/example/data/MeTubeAndBrandResult;", "", "updatedMeTubeVideos", "", "Lcom/example/data/MeTubeVideo;", "newWatchTime", "", "newSubscribers", "", "meTubeEarnings", "activeBrandDealName", "", "brandDealWeeklyPayout", "brandDealWeeksRemaining", "", "brandDealPostedThisWeek", "", "addedCash", "addedSalary", "<init>", "(Ljava/util/List;DJDLjava/lang/String;DIZDD)V", "getUpdatedMeTubeVideos", "()Ljava/util/List;", "getNewWatchTime", "()D", "getNewSubscribers", "()J", "getMeTubeEarnings", "getActiveBrandDealName", "()Ljava/lang/String;", "getBrandDealWeeklyPayout", "getBrandDealWeeksRemaining", "()I", "getBrandDealPostedThisWeek", "()Z", "getAddedCash", "getAddedSalary", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: MeTubeAndBrandResult.class */
public final class MeTubeAndBrandResult {
    @NotNull
    private final List<MeTubeVideo> updatedMeTubeVideos;
    private final double newWatchTime;
    private final long newSubscribers;
    private final double meTubeEarnings;
    @Nullable
    private final String activeBrandDealName;
    private final double brandDealWeeklyPayout;
    private final int brandDealWeeksRemaining;
    private final boolean brandDealPostedThisWeek;
    private final double addedCash;
    private final double addedSalary;
    public static final int $stable = 8;

    @NotNull
    public final List<MeTubeVideo> component1() {
        return this.updatedMeTubeVideos;
    }

    public final double component2() {
        return this.newWatchTime;
    }

    public final long component3() {
        return this.newSubscribers;
    }

    public final double component4() {
        return this.meTubeEarnings;
    }

    @Nullable
    public final String component5() {
        return this.activeBrandDealName;
    }

    public final double component6() {
        return this.brandDealWeeklyPayout;
    }

    public final int component7() {
        return this.brandDealWeeksRemaining;
    }

    public final boolean component8() {
        return this.brandDealPostedThisWeek;
    }

    public final double component9() {
        return this.addedCash;
    }

    public final double component10() {
        return this.addedSalary;
    }

    @NotNull
    public final MeTubeAndBrandResult copy(@NotNull List<MeTubeVideo> list, double newWatchTime, long newSubscribers, double meTubeEarnings, @Nullable String activeBrandDealName, double brandDealWeeklyPayout, int brandDealWeeksRemaining, boolean brandDealPostedThisWeek, double addedCash, double addedSalary) {
        Intrinsics.checkNotNullParameter(list, "updatedMeTubeVideos");
        return new MeTubeAndBrandResult(list, newWatchTime, newSubscribers, meTubeEarnings, activeBrandDealName, brandDealWeeklyPayout, brandDealWeeksRemaining, brandDealPostedThisWeek, addedCash, addedSalary);
    }

    public static /* synthetic */ MeTubeAndBrandResult copy$default(MeTubeAndBrandResult meTubeAndBrandResult, List list, double d, long j, double d2, String str, double d3, int i, boolean z, double d4, double d5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = meTubeAndBrandResult.updatedMeTubeVideos;
        }
        if ((i2 & 2) != 0) {
            d = meTubeAndBrandResult.newWatchTime;
        }
        if ((i2 & 4) != 0) {
            j = meTubeAndBrandResult.newSubscribers;
        }
        if ((i2 & 8) != 0) {
            d2 = meTubeAndBrandResult.meTubeEarnings;
        }
        if ((i2 & 16) != 0) {
            str = meTubeAndBrandResult.activeBrandDealName;
        }
        if ((i2 & 32) != 0) {
            d3 = meTubeAndBrandResult.brandDealWeeklyPayout;
        }
        if ((i2 & 64) != 0) {
            i = meTubeAndBrandResult.brandDealWeeksRemaining;
        }
        if ((i2 & 128) != 0) {
            z = meTubeAndBrandResult.brandDealPostedThisWeek;
        }
        if ((i2 & 256) != 0) {
            d4 = meTubeAndBrandResult.addedCash;
        }
        if ((i2 & 512) != 0) {
            d5 = meTubeAndBrandResult.addedSalary;
        }
        return meTubeAndBrandResult.copy(list, d, j, d2, str, d3, i, z, d4, d5);
    }

    @NotNull
    public String toString() {
        List<MeTubeVideo> list = this.updatedMeTubeVideos;
        double d = this.newWatchTime;
        long j = this.newSubscribers;
        double d2 = this.meTubeEarnings;
        String str = this.activeBrandDealName;
        double d3 = this.brandDealWeeklyPayout;
        int i = this.brandDealWeeksRemaining;
        boolean z = this.brandDealPostedThisWeek;
        double d4 = this.addedCash;
        double d5 = this.addedSalary;
        return "MeTubeAndBrandResult(updatedMeTubeVideos=" + list + ", newWatchTime=" + d + ", newSubscribers=" + list + ", meTubeEarnings=" + j + ", activeBrandDealName=" + list + ", brandDealWeeklyPayout=" + d2 + ", brandDealWeeksRemaining=" + list + ", brandDealPostedThisWeek=" + str + ", addedCash=" + d3 + ", addedSalary=" + list + ")";
    }

    public int hashCode() {
        int result = this.updatedMeTubeVideos.hashCode();
        return (((((((((((((((((result * 31) + Double.hashCode(this.newWatchTime)) * 31) + Long.hashCode(this.newSubscribers)) * 31) + Double.hashCode(this.meTubeEarnings)) * 31) + (this.activeBrandDealName == null ? 0 : this.activeBrandDealName.hashCode())) * 31) + Double.hashCode(this.brandDealWeeklyPayout)) * 31) + Integer.hashCode(this.brandDealWeeksRemaining)) * 31) + Boolean.hashCode(this.brandDealPostedThisWeek)) * 31) + Double.hashCode(this.addedCash)) * 31) + Double.hashCode(this.addedSalary);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MeTubeAndBrandResult) {
            MeTubeAndBrandResult meTubeAndBrandResult = (MeTubeAndBrandResult) other;
            return Intrinsics.areEqual(this.updatedMeTubeVideos, meTubeAndBrandResult.updatedMeTubeVideos) && Double.compare(this.newWatchTime, meTubeAndBrandResult.newWatchTime) == 0 && this.newSubscribers == meTubeAndBrandResult.newSubscribers && Double.compare(this.meTubeEarnings, meTubeAndBrandResult.meTubeEarnings) == 0 && Intrinsics.areEqual(this.activeBrandDealName, meTubeAndBrandResult.activeBrandDealName) && Double.compare(this.brandDealWeeklyPayout, meTubeAndBrandResult.brandDealWeeklyPayout) == 0 && this.brandDealWeeksRemaining == meTubeAndBrandResult.brandDealWeeksRemaining && this.brandDealPostedThisWeek == meTubeAndBrandResult.brandDealPostedThisWeek && Double.compare(this.addedCash, meTubeAndBrandResult.addedCash) == 0 && Double.compare(this.addedSalary, meTubeAndBrandResult.addedSalary) == 0;
        }
        return false;
    }

    public MeTubeAndBrandResult(@NotNull List<MeTubeVideo> list, double newWatchTime, long newSubscribers, double meTubeEarnings, @Nullable String activeBrandDealName, double brandDealWeeklyPayout, int brandDealWeeksRemaining, boolean brandDealPostedThisWeek, double addedCash, double addedSalary) {
        Intrinsics.checkNotNullParameter(list, "updatedMeTubeVideos");
        this.updatedMeTubeVideos = list;
        this.newWatchTime = newWatchTime;
        this.newSubscribers = newSubscribers;
        this.meTubeEarnings = meTubeEarnings;
        this.activeBrandDealName = activeBrandDealName;
        this.brandDealWeeklyPayout = brandDealWeeklyPayout;
        this.brandDealWeeksRemaining = brandDealWeeksRemaining;
        this.brandDealPostedThisWeek = brandDealPostedThisWeek;
        this.addedCash = addedCash;
        this.addedSalary = addedSalary;
    }

    @NotNull
    public final List<MeTubeVideo> getUpdatedMeTubeVideos() {
        return this.updatedMeTubeVideos;
    }

    public final double getNewWatchTime() {
        return this.newWatchTime;
    }

    public final long getNewSubscribers() {
        return this.newSubscribers;
    }

    public final double getMeTubeEarnings() {
        return this.meTubeEarnings;
    }

    @Nullable
    public final String getActiveBrandDealName() {
        return this.activeBrandDealName;
    }

    public final double getBrandDealWeeklyPayout() {
        return this.brandDealWeeklyPayout;
    }

    public final int getBrandDealWeeksRemaining() {
        return this.brandDealWeeksRemaining;
    }

    public final boolean getBrandDealPostedThisWeek() {
        return this.brandDealPostedThisWeek;
    }

    public final double getAddedCash() {
        return this.addedCash;
    }

    public final double getAddedSalary() {
        return this.addedSalary;
    }
}
