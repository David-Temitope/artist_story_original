package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018��2\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JE\u0010\u001d\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\n\u0010\u0016¨\u0006\""}, d2 = {"Lcom/example/data/SideJob;", "", "id", "", "name", "weeklyPay", "", "energyCost", "", "timeCost", "isActive", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;DIIZ)V", "getId", "()Ljava/lang/String;", "getName", "getWeeklyPay", "()D", "getEnergyCost", "()I", "getTimeCost", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: SideJob.class */
public final class SideJob {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    private final double weeklyPay;
    private final int energyCost;
    private final int timeCost;
    private final boolean isActive;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    public final double component3() {
        return this.weeklyPay;
    }

    public final int component4() {
        return this.energyCost;
    }

    public final int component5() {
        return this.timeCost;
    }

    public final boolean component6() {
        return this.isActive;
    }

    @NotNull
    public final SideJob copy(@NotNull String id, @NotNull String name, double weeklyPay, int energyCost, int timeCost, boolean isActive) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        return new SideJob(id, name, weeklyPay, energyCost, timeCost, isActive);
    }

    public static /* synthetic */ SideJob copy$default(SideJob sideJob, String str, String str2, double d, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sideJob.id;
        }
        if ((i3 & 2) != 0) {
            str2 = sideJob.name;
        }
        if ((i3 & 4) != 0) {
            d = sideJob.weeklyPay;
        }
        if ((i3 & 8) != 0) {
            i = sideJob.energyCost;
        }
        if ((i3 & 16) != 0) {
            i2 = sideJob.timeCost;
        }
        if ((i3 & 32) != 0) {
            z = sideJob.isActive;
        }
        return sideJob.copy(str, str2, d, i, i2, z);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        double d = this.weeklyPay;
        int i = this.energyCost;
        int i2 = this.timeCost;
        boolean z = this.isActive;
        return "SideJob(id=" + str + ", name=" + str2 + ", weeklyPay=" + d + ", energyCost=" + str + ", timeCost=" + i + ", isActive=" + i2 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((result * 31) + this.name.hashCode()) * 31) + Double.hashCode(this.weeklyPay)) * 31) + Integer.hashCode(this.energyCost)) * 31) + Integer.hashCode(this.timeCost)) * 31) + Boolean.hashCode(this.isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SideJob) {
            SideJob sideJob = (SideJob) other;
            return Intrinsics.areEqual(this.id, sideJob.id) && Intrinsics.areEqual(this.name, sideJob.name) && Double.compare(this.weeklyPay, sideJob.weeklyPay) == 0 && this.energyCost == sideJob.energyCost && this.timeCost == sideJob.timeCost && this.isActive == sideJob.isActive;
        }
        return false;
    }

    public SideJob(@NotNull String id, @NotNull String name, double weeklyPay, int energyCost, int timeCost, boolean isActive) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.weeklyPay = weeklyPay;
        this.energyCost = energyCost;
        this.timeCost = timeCost;
        this.isActive = isActive;
    }

    public /* synthetic */ SideJob(String str, String str2, double d, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, i, i2, (i3 & 32) != 0 ? false : z);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final double getWeeklyPay() {
        return this.weeklyPay;
    }

    public final int getEnergyCost() {
        return this.energyCost;
    }

    public final int getTimeCost() {
        return this.timeCost;
    }

    public final boolean isActive() {
        return this.isActive;
    }
}
