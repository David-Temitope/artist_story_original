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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b8\b\u0087\b\u0018��2\u00020\u0001B×\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0006HÆ\u0003J\t\u0010<\u001a\u00020\u0006HÆ\u0003J\t\u0010=\u001a\u00020\u0006HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\u000bHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u000fHÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\t\u0010E\u001a\u00020\u0006HÆ\u0003J\t\u0010F\u001a\u00020\u0006HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0006HÆ\u0003J\t\u0010J\u001a\u00020\u000bHÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0006HÆ\u0003J\t\u0010N\u001a\u00020\u000fHÆ\u0003J\t\u0010O\u001a\u00020\u001dHÆ\u0003Jï\u0001\u0010P\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001dHÆ\u0001J\u0013\u0010Q\u001a\u00020\u000f2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\u0006HÖ\u0001J\t\u0010T\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\"\u0010!R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b#\u0010$R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b%\u0010$R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b&\u0010$R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b'\u0010$R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b(\u0010)R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b*\u0010)R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b+\u0010)R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n��\u001a\u0004\b\u000e\u0010,R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n��\u001a\u0004\b\u0010\u0010,R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b-\u0010$R\u0011\u0010\u0012\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b.\u0010$R\u0011\u0010\u0013\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b/\u0010$R\u0011\u0010\u0014\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b0\u0010!R\u0011\u0010\u0015\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b1\u0010!R\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b2\u0010$R\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b3\u0010)R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b4\u0010!R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b5\u0010!R\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b6\u0010$R\u0011\u0010\u001b\u001a\u00020\u000f¢\u0006\b\n��\u001a\u0004\b\u001b\u0010,R\u0011\u0010\u001c\u001a\u00020\u001d¢\u0006\b\n��\u001a\u0004\b7\u00108¨\u0006U"}, d2 = {"Lcom/example/data/Tour;", "", "id", "", "level", "totalWeeks", "", "currentWeek", "weeklyEnergyCost", "weeklyTimeCost", "setupCost", "", "payPerAttendee", "promotionBudget", "isPromotedOnSocial", "", "isPromotedOnNews", "baseAttendance", "bookedWeek", "bookedYear", "status", "title", "locationsCount", "ticketPrice", "productionTier", "transportTier", "backupDancersCount", "isLaunched", "showHype", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIIIDDDZZIIILjava/lang/String;Ljava/lang/String;IDLjava/lang/String;Ljava/lang/String;IZF)V", "getId", "()Ljava/lang/String;", "getLevel", "getTotalWeeks", "()I", "getCurrentWeek", "getWeeklyEnergyCost", "getWeeklyTimeCost", "getSetupCost", "()D", "getPayPerAttendee", "getPromotionBudget", "()Z", "getBaseAttendance", "getBookedWeek", "getBookedYear", "getStatus", "getTitle", "getLocationsCount", "getTicketPrice", "getProductionTier", "getTransportTier", "getBackupDancersCount", "getShowHype", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: Tour.class */
public final class Tour {
    @NotNull
    private final String id;
    @NotNull
    private final String level;
    private final int totalWeeks;
    private final int currentWeek;
    private final int weeklyEnergyCost;
    private final int weeklyTimeCost;
    private final double setupCost;
    private final double payPerAttendee;
    private final double promotionBudget;
    private final boolean isPromotedOnSocial;
    private final boolean isPromotedOnNews;
    private final int baseAttendance;
    private final int bookedWeek;
    private final int bookedYear;
    @NotNull
    private final String status;
    @NotNull
    private final String title;
    private final int locationsCount;
    private final double ticketPrice;
    @NotNull
    private final String productionTier;
    @NotNull
    private final String transportTier;
    private final int backupDancersCount;
    private final boolean isLaunched;
    private final float showHype;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.level;
    }

    public final int component3() {
        return this.totalWeeks;
    }

    public final int component4() {
        return this.currentWeek;
    }

    public final int component5() {
        return this.weeklyEnergyCost;
    }

    public final int component6() {
        return this.weeklyTimeCost;
    }

    public final double component7() {
        return this.setupCost;
    }

    public final double component8() {
        return this.payPerAttendee;
    }

    public final double component9() {
        return this.promotionBudget;
    }

    public final boolean component10() {
        return this.isPromotedOnSocial;
    }

    public final boolean component11() {
        return this.isPromotedOnNews;
    }

    public final int component12() {
        return this.baseAttendance;
    }

    public final int component13() {
        return this.bookedWeek;
    }

    public final int component14() {
        return this.bookedYear;
    }

    @NotNull
    public final String component15() {
        return this.status;
    }

    @NotNull
    public final String component16() {
        return this.title;
    }

    public final int component17() {
        return this.locationsCount;
    }

    public final double component18() {
        return this.ticketPrice;
    }

    @NotNull
    public final String component19() {
        return this.productionTier;
    }

    @NotNull
    public final String component20() {
        return this.transportTier;
    }

    public final int component21() {
        return this.backupDancersCount;
    }

    public final boolean component22() {
        return this.isLaunched;
    }

    public final float component23() {
        return this.showHype;
    }

    @NotNull
    public final Tour copy(@NotNull String id, @NotNull String level, int totalWeeks, int currentWeek, int weeklyEnergyCost, int weeklyTimeCost, double setupCost, double payPerAttendee, double promotionBudget, boolean isPromotedOnSocial, boolean isPromotedOnNews, int baseAttendance, int bookedWeek, int bookedYear, @NotNull String status, @NotNull String title, int locationsCount, double ticketPrice, @NotNull String productionTier, @NotNull String transportTier, int backupDancersCount, boolean isLaunched, float showHype) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(productionTier, "productionTier");
        Intrinsics.checkNotNullParameter(transportTier, "transportTier");
        return new Tour(id, level, totalWeeks, currentWeek, weeklyEnergyCost, weeklyTimeCost, setupCost, payPerAttendee, promotionBudget, isPromotedOnSocial, isPromotedOnNews, baseAttendance, bookedWeek, bookedYear, status, title, locationsCount, ticketPrice, productionTier, transportTier, backupDancersCount, isLaunched, showHype);
    }

    public static /* synthetic */ Tour copy$default(Tour tour, String str, String str2, int i, int i2, int i3, int i4, double d, double d2, double d3, boolean z, boolean z2, int i5, int i6, int i7, String str3, String str4, int i8, double d4, String str5, String str6, int i9, boolean z3, float f, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tour.id;
        }
        if ((i10 & 2) != 0) {
            str2 = tour.level;
        }
        if ((i10 & 4) != 0) {
            i = tour.totalWeeks;
        }
        if ((i10 & 8) != 0) {
            i2 = tour.currentWeek;
        }
        if ((i10 & 16) != 0) {
            i3 = tour.weeklyEnergyCost;
        }
        if ((i10 & 32) != 0) {
            i4 = tour.weeklyTimeCost;
        }
        if ((i10 & 64) != 0) {
            d = tour.setupCost;
        }
        if ((i10 & 128) != 0) {
            d2 = tour.payPerAttendee;
        }
        if ((i10 & 256) != 0) {
            d3 = tour.promotionBudget;
        }
        if ((i10 & 512) != 0) {
            z = tour.isPromotedOnSocial;
        }
        if ((i10 & 1024) != 0) {
            z2 = tour.isPromotedOnNews;
        }
        if ((i10 & 2048) != 0) {
            i5 = tour.baseAttendance;
        }
        if ((i10 & 4096) != 0) {
            i6 = tour.bookedWeek;
        }
        if ((i10 & 8192) != 0) {
            i7 = tour.bookedYear;
        }
        if ((i10 & 16384) != 0) {
            str3 = tour.status;
        }
        if ((i10 & 32768) != 0) {
            str4 = tour.title;
        }
        if ((i10 & 65536) != 0) {
            i8 = tour.locationsCount;
        }
        if ((i10 & 131072) != 0) {
            d4 = tour.ticketPrice;
        }
        if ((i10 & 262144) != 0) {
            str5 = tour.productionTier;
        }
        if ((i10 & 524288) != 0) {
            str6 = tour.transportTier;
        }
        if ((i10 & 1048576) != 0) {
            i9 = tour.backupDancersCount;
        }
        if ((i10 & 2097152) != 0) {
            z3 = tour.isLaunched;
        }
        if ((i10 & 4194304) != 0) {
            f = tour.showHype;
        }
        return tour.copy(str, str2, i, i2, i3, i4, d, d2, d3, z, z2, i5, i6, i7, str3, str4, i8, d4, str5, str6, i9, z3, f);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.level;
        int i = this.totalWeeks;
        int i2 = this.currentWeek;
        int i3 = this.weeklyEnergyCost;
        int i4 = this.weeklyTimeCost;
        double d = this.setupCost;
        double d2 = this.payPerAttendee;
        double d3 = this.promotionBudget;
        boolean z = this.isPromotedOnSocial;
        boolean z2 = this.isPromotedOnNews;
        int i5 = this.baseAttendance;
        int i6 = this.bookedWeek;
        int i7 = this.bookedYear;
        String str3 = this.status;
        String str4 = this.title;
        int i8 = this.locationsCount;
        double d4 = this.ticketPrice;
        String str5 = this.productionTier;
        String str6 = this.transportTier;
        int i9 = this.backupDancersCount;
        boolean z3 = this.isLaunched;
        float f = this.showHype;
        return "Tour(id=" + str + ", level=" + str2 + ", totalWeeks=" + i + ", currentWeek=" + i2 + ", weeklyEnergyCost=" + i3 + ", weeklyTimeCost=" + i4 + ", setupCost=" + d + ", payPerAttendee=" + str + ", promotionBudget=" + d2 + ", isPromotedOnSocial=" + str + ", isPromotedOnNews=" + d3 + ", baseAttendance=" + str + ", bookedWeek=" + z + ", bookedYear=" + z2 + ", status=" + i5 + ", title=" + i6 + ", locationsCount=" + i7 + ", ticketPrice=" + str3 + ", productionTier=" + str4 + ", transportTier=" + i8 + ", backupDancersCount=" + d4 + ", isLaunched=" + str + ", showHype=" + str5 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((((((((((((((((((((result * 31) + this.level.hashCode()) * 31) + Integer.hashCode(this.totalWeeks)) * 31) + Integer.hashCode(this.currentWeek)) * 31) + Integer.hashCode(this.weeklyEnergyCost)) * 31) + Integer.hashCode(this.weeklyTimeCost)) * 31) + Double.hashCode(this.setupCost)) * 31) + Double.hashCode(this.payPerAttendee)) * 31) + Double.hashCode(this.promotionBudget)) * 31) + Boolean.hashCode(this.isPromotedOnSocial)) * 31) + Boolean.hashCode(this.isPromotedOnNews)) * 31) + Integer.hashCode(this.baseAttendance)) * 31) + Integer.hashCode(this.bookedWeek)) * 31) + Integer.hashCode(this.bookedYear)) * 31) + this.status.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.locationsCount)) * 31) + Double.hashCode(this.ticketPrice)) * 31) + this.productionTier.hashCode()) * 31) + this.transportTier.hashCode()) * 31) + Integer.hashCode(this.backupDancersCount)) * 31) + Boolean.hashCode(this.isLaunched)) * 31) + Float.hashCode(this.showHype);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Tour) {
            Tour tour = (Tour) other;
            return Intrinsics.areEqual(this.id, tour.id) && Intrinsics.areEqual(this.level, tour.level) && this.totalWeeks == tour.totalWeeks && this.currentWeek == tour.currentWeek && this.weeklyEnergyCost == tour.weeklyEnergyCost && this.weeklyTimeCost == tour.weeklyTimeCost && Double.compare(this.setupCost, tour.setupCost) == 0 && Double.compare(this.payPerAttendee, tour.payPerAttendee) == 0 && Double.compare(this.promotionBudget, tour.promotionBudget) == 0 && this.isPromotedOnSocial == tour.isPromotedOnSocial && this.isPromotedOnNews == tour.isPromotedOnNews && this.baseAttendance == tour.baseAttendance && this.bookedWeek == tour.bookedWeek && this.bookedYear == tour.bookedYear && Intrinsics.areEqual(this.status, tour.status) && Intrinsics.areEqual(this.title, tour.title) && this.locationsCount == tour.locationsCount && Double.compare(this.ticketPrice, tour.ticketPrice) == 0 && Intrinsics.areEqual(this.productionTier, tour.productionTier) && Intrinsics.areEqual(this.transportTier, tour.transportTier) && this.backupDancersCount == tour.backupDancersCount && this.isLaunched == tour.isLaunched && Float.compare(this.showHype, tour.showHype) == 0;
        }
        return false;
    }

    public Tour(@NotNull String id, @NotNull String level, int totalWeeks, int currentWeek, int weeklyEnergyCost, int weeklyTimeCost, double setupCost, double payPerAttendee, double promotionBudget, boolean isPromotedOnSocial, boolean isPromotedOnNews, int baseAttendance, int bookedWeek, int bookedYear, @NotNull String status, @NotNull String title, int locationsCount, double ticketPrice, @NotNull String productionTier, @NotNull String transportTier, int backupDancersCount, boolean isLaunched, float showHype) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(level, "level");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(productionTier, "productionTier");
        Intrinsics.checkNotNullParameter(transportTier, "transportTier");
        this.id = id;
        this.level = level;
        this.totalWeeks = totalWeeks;
        this.currentWeek = currentWeek;
        this.weeklyEnergyCost = weeklyEnergyCost;
        this.weeklyTimeCost = weeklyTimeCost;
        this.setupCost = setupCost;
        this.payPerAttendee = payPerAttendee;
        this.promotionBudget = promotionBudget;
        this.isPromotedOnSocial = isPromotedOnSocial;
        this.isPromotedOnNews = isPromotedOnNews;
        this.baseAttendance = baseAttendance;
        this.bookedWeek = bookedWeek;
        this.bookedYear = bookedYear;
        this.status = status;
        this.title = title;
        this.locationsCount = locationsCount;
        this.ticketPrice = ticketPrice;
        this.productionTier = productionTier;
        this.transportTier = transportTier;
        this.backupDancersCount = backupDancersCount;
        this.isLaunched = isLaunched;
        this.showHype = showHype;
    }

    public /* synthetic */ Tour(String str, String str2, int i, int i2, int i3, int i4, double d, double d2, double d3, boolean z, boolean z2, int i5, int i6, int i7, String str3, String str4, int i8, double d4, String str5, String str6, int i9, boolean z3, float f, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, i2, i3, i4, d, d2, (i10 & 256) != 0 ? 0.0d : d3, (i10 & 512) != 0 ? false : z, (i10 & 1024) != 0 ? false : z2, (i10 & 2048) != 0 ? 0 : i5, i6, i7, str3, (i10 & 32768) != 0 ? "Unnamed Tour" : str4, (i10 & 65536) != 0 ? 5 : i8, (i10 & 131072) != 0 ? 45.0d : d4, (i10 & 262144) != 0 ? "Basic" : str5, (i10 & 524288) != 0 ? "Sleeper Bus" : str6, (i10 & 1048576) != 0 ? 0 : i9, (i10 & 2097152) != 0 ? true : z3, (i10 & 4194304) != 0 ? 20.0f : f);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    public final int getTotalWeeks() {
        return this.totalWeeks;
    }

    public final int getCurrentWeek() {
        return this.currentWeek;
    }

    public final int getWeeklyEnergyCost() {
        return this.weeklyEnergyCost;
    }

    public final int getWeeklyTimeCost() {
        return this.weeklyTimeCost;
    }

    public final double getSetupCost() {
        return this.setupCost;
    }

    public final double getPayPerAttendee() {
        return this.payPerAttendee;
    }

    public final double getPromotionBudget() {
        return this.promotionBudget;
    }

    public final boolean isPromotedOnSocial() {
        return this.isPromotedOnSocial;
    }

    public final boolean isPromotedOnNews() {
        return this.isPromotedOnNews;
    }

    public final int getBaseAttendance() {
        return this.baseAttendance;
    }

    public final int getBookedWeek() {
        return this.bookedWeek;
    }

    public final int getBookedYear() {
        return this.bookedYear;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getLocationsCount() {
        return this.locationsCount;
    }

    public final double getTicketPrice() {
        return this.ticketPrice;
    }

    @NotNull
    public final String getProductionTier() {
        return this.productionTier;
    }

    @NotNull
    public final String getTransportTier() {
        return this.transportTier;
    }

    public final int getBackupDancersCount() {
        return this.backupDancersCount;
    }

    public final boolean isLaunched() {
        return this.isLaunched;
    }

    public final float getShowHype() {
        return this.showHype;
    }
}
