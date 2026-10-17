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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003Jm\u0010*\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u000bHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, d2 = {"Lcom/example/data/AdCampaign;", "", "id", "", "agencyId", "agencyName", "targetType", "targetId", "weeklyBudget", "", "durationWeeks", "", "weeksRemaining", "objective", "estimatedReachPerWeek", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIILjava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getAgencyId", "getAgencyName", "getTargetType", "getTargetId", "getWeeklyBudget", "()D", "getDurationWeeks", "()I", "getWeeksRemaining", "getObjective", "getEstimatedReachPerWeek", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: AdCampaign.class */
public final class AdCampaign {
    @NotNull
    private final String id;
    @NotNull
    private final String agencyId;
    @NotNull
    private final String agencyName;
    @NotNull
    private final String targetType;
    @NotNull
    private final String targetId;
    private final double weeklyBudget;
    private final int durationWeeks;
    private final int weeksRemaining;
    @NotNull
    private final String objective;
    private final long estimatedReachPerWeek;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.agencyId;
    }

    @NotNull
    public final String component3() {
        return this.agencyName;
    }

    @NotNull
    public final String component4() {
        return this.targetType;
    }

    @NotNull
    public final String component5() {
        return this.targetId;
    }

    public final double component6() {
        return this.weeklyBudget;
    }

    public final int component7() {
        return this.durationWeeks;
    }

    public final int component8() {
        return this.weeksRemaining;
    }

    @NotNull
    public final String component9() {
        return this.objective;
    }

    public final long component10() {
        return this.estimatedReachPerWeek;
    }

    @NotNull
    public final AdCampaign copy(@NotNull String id, @NotNull String agencyId, @NotNull String agencyName, @NotNull String targetType, @NotNull String targetId, double weeklyBudget, int durationWeeks, int weeksRemaining, @NotNull String objective, long estimatedReachPerWeek) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(agencyId, "agencyId");
        Intrinsics.checkNotNullParameter(agencyName, "agencyName");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(objective, "objective");
        return new AdCampaign(id, agencyId, agencyName, targetType, targetId, weeklyBudget, durationWeeks, weeksRemaining, objective, estimatedReachPerWeek);
    }

    public static /* synthetic */ AdCampaign copy$default(AdCampaign adCampaign, String str, String str2, String str3, String str4, String str5, double d, int i, int i2, String str6, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = adCampaign.id;
        }
        if ((i3 & 2) != 0) {
            str2 = adCampaign.agencyId;
        }
        if ((i3 & 4) != 0) {
            str3 = adCampaign.agencyName;
        }
        if ((i3 & 8) != 0) {
            str4 = adCampaign.targetType;
        }
        if ((i3 & 16) != 0) {
            str5 = adCampaign.targetId;
        }
        if ((i3 & 32) != 0) {
            d = adCampaign.weeklyBudget;
        }
        if ((i3 & 64) != 0) {
            i = adCampaign.durationWeeks;
        }
        if ((i3 & 128) != 0) {
            i2 = adCampaign.weeksRemaining;
        }
        if ((i3 & 256) != 0) {
            str6 = adCampaign.objective;
        }
        if ((i3 & 512) != 0) {
            j = adCampaign.estimatedReachPerWeek;
        }
        return adCampaign.copy(str, str2, str3, str4, str5, d, i, i2, str6, j);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.agencyId;
        String str3 = this.agencyName;
        String str4 = this.targetType;
        String str5 = this.targetId;
        double d = this.weeklyBudget;
        int i = this.durationWeeks;
        int i2 = this.weeksRemaining;
        String str6 = this.objective;
        long j = this.estimatedReachPerWeek;
        return "AdCampaign(id=" + str + ", agencyId=" + str2 + ", agencyName=" + str3 + ", targetType=" + str4 + ", targetId=" + str5 + ", weeklyBudget=" + d + ", durationWeeks=" + str + ", weeksRemaining=" + i + ", objective=" + i2 + ", estimatedReachPerWeek=" + str6 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((result * 31) + this.agencyId.hashCode()) * 31) + this.agencyName.hashCode()) * 31) + this.targetType.hashCode()) * 31) + this.targetId.hashCode()) * 31) + Double.hashCode(this.weeklyBudget)) * 31) + Integer.hashCode(this.durationWeeks)) * 31) + Integer.hashCode(this.weeksRemaining)) * 31) + this.objective.hashCode()) * 31) + Long.hashCode(this.estimatedReachPerWeek);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AdCampaign) {
            AdCampaign adCampaign = (AdCampaign) other;
            return Intrinsics.areEqual(this.id, adCampaign.id) && Intrinsics.areEqual(this.agencyId, adCampaign.agencyId) && Intrinsics.areEqual(this.agencyName, adCampaign.agencyName) && Intrinsics.areEqual(this.targetType, adCampaign.targetType) && Intrinsics.areEqual(this.targetId, adCampaign.targetId) && Double.compare(this.weeklyBudget, adCampaign.weeklyBudget) == 0 && this.durationWeeks == adCampaign.durationWeeks && this.weeksRemaining == adCampaign.weeksRemaining && Intrinsics.areEqual(this.objective, adCampaign.objective) && this.estimatedReachPerWeek == adCampaign.estimatedReachPerWeek;
        }
        return false;
    }

    public AdCampaign(@NotNull String id, @NotNull String agencyId, @NotNull String agencyName, @NotNull String targetType, @NotNull String targetId, double weeklyBudget, int durationWeeks, int weeksRemaining, @NotNull String objective, long estimatedReachPerWeek) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(agencyId, "agencyId");
        Intrinsics.checkNotNullParameter(agencyName, "agencyName");
        Intrinsics.checkNotNullParameter(targetType, "targetType");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(objective, "objective");
        this.id = id;
        this.agencyId = agencyId;
        this.agencyName = agencyName;
        this.targetType = targetType;
        this.targetId = targetId;
        this.weeklyBudget = weeklyBudget;
        this.durationWeeks = durationWeeks;
        this.weeksRemaining = weeksRemaining;
        this.objective = objective;
        this.estimatedReachPerWeek = estimatedReachPerWeek;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getAgencyId() {
        return this.agencyId;
    }

    @NotNull
    public final String getAgencyName() {
        return this.agencyName;
    }

    @NotNull
    public final String getTargetType() {
        return this.targetType;
    }

    @NotNull
    public final String getTargetId() {
        return this.targetId;
    }

    public final double getWeeklyBudget() {
        return this.weeklyBudget;
    }

    public final int getDurationWeeks() {
        return this.durationWeeks;
    }

    public final int getWeeksRemaining() {
        return this.weeksRemaining;
    }

    @NotNull
    public final String getObjective() {
        return this.objective;
    }

    public final long getEstimatedReachPerWeek() {
        return this.estimatedReachPerWeek;
    }
}
