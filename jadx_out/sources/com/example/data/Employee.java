package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��<\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n��\n\u0002\u0010$\n\u0002\bN\b\u0087\b\u0018��2\u00020\u0001B\u009d\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t\u0012\b\b\u0002\u0010\u0015\u001a\u00020\t\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 \u0012\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\"\u0012\b\b\u0002\u0010#\u001a\u00020\u000b\u0012\b\b\u0002\u0010$\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0007HÆ\u0003J\t\u0010S\u001a\u00020\tHÆ\u0003J\t\u0010T\u001a\u00020\u000bHÆ\u0003J\t\u0010U\u001a\u00020\u000bHÆ\u0003J\t\u0010V\u001a\u00020\u000bHÆ\u0003J\t\u0010W\u001a\u00020\u000bHÆ\u0003J\t\u0010X\u001a\u00020\u000bHÆ\u0003J\t\u0010Y\u001a\u00020\u000bHÆ\u0003J\t\u0010Z\u001a\u00020\u0012HÆ\u0003J\t\u0010[\u001a\u00020\u0003HÆ\u0003J\t\u0010\\\u001a\u00020\tHÆ\u0003J\t\u0010]\u001a\u00020\tHÆ\u0003J\t\u0010^\u001a\u00020\u000bHÆ\u0003J\t\u0010_\u001a\u00020\u000bHÆ\u0003J\t\u0010`\u001a\u00020\u000bHÆ\u0003J\t\u0010a\u001a\u00020\u000bHÆ\u0003J\t\u0010b\u001a\u00020\u000bHÆ\u0003J\t\u0010c\u001a\u00020\u000bHÆ\u0003J\t\u0010d\u001a\u00020\u000bHÆ\u0003J\t\u0010e\u001a\u00020\u000bHÆ\u0003J\t\u0010f\u001a\u00020\u000bHÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00030 HÆ\u0003J\u0015\u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\"HÆ\u0003J\t\u0010i\u001a\u00020\u000bHÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J³\u0002\u0010k\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 2\u0014\b\u0002\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\"2\b\b\u0002\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010$\u001a\u00020\u0003HÆ\u0001J\u0013\u0010l\u001a\u00020\u00122\b\u0010m\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010n\u001a\u00020\tHÖ\u0001J\t\u0010o\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b)\u0010(R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b*\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b+\u0010,R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b-\u0010.R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b/\u00100R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b1\u00100R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b2\u00100R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b3\u00100R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b4\u00100R\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b5\u00100R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n��\u001a\u0004\b\u0011\u00106R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b7\u0010(R\u0011\u0010\u0014\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b8\u0010.R\u0011\u0010\u0015\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b9\u0010.R\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b:\u00100R\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b;\u00100R\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b<\u00100R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b=\u00100R\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b>\u00100R\u0011\u0010\u001b\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b?\u00100R\u0011\u0010\u001c\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b@\u00100R\u0011\u0010\u001d\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\bA\u00100R\u0011\u0010\u001e\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\bB\u00100R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030 ¢\u0006\b\n��\u001a\u0004\bC\u0010DR\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\"¢\u0006\b\n��\u001a\u0004\bE\u0010FR\u0011\u0010#\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\bG\u00100R\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\bH\u0010(R\u0011\u0010I\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bJ\u0010.R\u0011\u0010K\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bL\u0010.R\u0011\u0010M\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bN\u00106¨\u0006p"}, d2 = {"Lcom/example/data/Employee;", "", "id", "", "name", "role", "weeklySalary", "", "experience", "", "reliability", "", "honesty", "greed", "intelligence", "leadership", "loyalty", "isRetired", "", "traitDescription", "age", "contractWeeks", "integrity", "communication", "efficiency", "negotiation", "ambition", "stressLevel", "happiness", "workload", "reputation", "careerHistory", "", "permissions", "", "rating", "investorStyle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DIFFFFFFZLjava/lang/String;IIFFFFFFFFFLjava/util/List;Ljava/util/Map;FLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getRole", "getWeeklySalary", "()D", "getExperience", "()I", "getReliability", "()F", "getHonesty", "getGreed", "getIntelligence", "getLeadership", "getLoyalty", "()Z", "getTraitDescription", "getAge", "getContractWeeks", "getIntegrity", "getCommunication", "getEfficiency", "getNegotiation", "getAmbition", "getStressLevel", "getHappiness", "getWorkload", "getReputation", "getCareerHistory", "()Ljava/util/List;", "getPermissions", "()Ljava/util/Map;", "getRating", "getInvestorStyle", "skillRatingPercent", "getSkillRatingPercent", "experienceYears", "getExperienceYears", "hasStubbornTrait", "getHasStubbornTrait", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: Employee.class */
public final class Employee {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String role;
    private final double weeklySalary;
    private final int experience;
    private final float reliability;
    private final float honesty;
    private final float greed;
    private final float intelligence;
    private final float leadership;
    private final float loyalty;
    private final boolean isRetired;
    @NotNull
    private final String traitDescription;
    private final int age;
    private final int contractWeeks;
    private final float integrity;
    private final float communication;
    private final float efficiency;
    private final float negotiation;
    private final float ambition;
    private final float stressLevel;
    private final float happiness;
    private final float workload;
    private final float reputation;
    @NotNull
    private final List<String> careerHistory;
    @NotNull
    private final Map<String, Boolean> permissions;
    private final float rating;
    @NotNull
    private final String investorStyle;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.role;
    }

    public final double component4() {
        return this.weeklySalary;
    }

    public final int component5() {
        return this.experience;
    }

    public final float component6() {
        return this.reliability;
    }

    public final float component7() {
        return this.honesty;
    }

    public final float component8() {
        return this.greed;
    }

    public final float component9() {
        return this.intelligence;
    }

    public final float component10() {
        return this.leadership;
    }

    public final float component11() {
        return this.loyalty;
    }

    public final boolean component12() {
        return this.isRetired;
    }

    @NotNull
    public final String component13() {
        return this.traitDescription;
    }

    public final int component14() {
        return this.age;
    }

    public final int component15() {
        return this.contractWeeks;
    }

    public final float component16() {
        return this.integrity;
    }

    public final float component17() {
        return this.communication;
    }

    public final float component18() {
        return this.efficiency;
    }

    public final float component19() {
        return this.negotiation;
    }

    public final float component20() {
        return this.ambition;
    }

    public final float component21() {
        return this.stressLevel;
    }

    public final float component22() {
        return this.happiness;
    }

    public final float component23() {
        return this.workload;
    }

    public final float component24() {
        return this.reputation;
    }

    @NotNull
    public final List<String> component25() {
        return this.careerHistory;
    }

    @NotNull
    public final Map<String, Boolean> component26() {
        return this.permissions;
    }

    public final float component27() {
        return this.rating;
    }

    @NotNull
    public final String component28() {
        return this.investorStyle;
    }

    @NotNull
    public final Employee copy(@NotNull String id, @NotNull String name, @NotNull String role, double weeklySalary, int experience, float reliability, float honesty, float greed, float intelligence, float leadership, float loyalty, boolean isRetired, @NotNull String traitDescription, int age, int contractWeeks, float integrity, float communication, float efficiency, float negotiation, float ambition, float stressLevel, float happiness, float workload, float reputation, @NotNull List<String> list, @NotNull Map<String, Boolean> map, float rating, @NotNull String investorStyle) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(traitDescription, "traitDescription");
        Intrinsics.checkNotNullParameter(list, "careerHistory");
        Intrinsics.checkNotNullParameter(map, "permissions");
        Intrinsics.checkNotNullParameter(investorStyle, "investorStyle");
        return new Employee(id, name, role, weeklySalary, experience, reliability, honesty, greed, intelligence, leadership, loyalty, isRetired, traitDescription, age, contractWeeks, integrity, communication, efficiency, negotiation, ambition, stressLevel, happiness, workload, reputation, list, map, rating, investorStyle);
    }

    public static /* synthetic */ Employee copy$default(Employee employee, String str, String str2, String str3, double d, int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z, String str4, int i2, int i3, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, List list, Map map, float f16, String str5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = employee.id;
        }
        if ((i4 & 2) != 0) {
            str2 = employee.name;
        }
        if ((i4 & 4) != 0) {
            str3 = employee.role;
        }
        if ((i4 & 8) != 0) {
            d = employee.weeklySalary;
        }
        if ((i4 & 16) != 0) {
            i = employee.experience;
        }
        if ((i4 & 32) != 0) {
            f = employee.reliability;
        }
        if ((i4 & 64) != 0) {
            f2 = employee.honesty;
        }
        if ((i4 & 128) != 0) {
            f3 = employee.greed;
        }
        if ((i4 & 256) != 0) {
            f4 = employee.intelligence;
        }
        if ((i4 & 512) != 0) {
            f5 = employee.leadership;
        }
        if ((i4 & 1024) != 0) {
            f6 = employee.loyalty;
        }
        if ((i4 & 2048) != 0) {
            z = employee.isRetired;
        }
        if ((i4 & 4096) != 0) {
            str4 = employee.traitDescription;
        }
        if ((i4 & 8192) != 0) {
            i2 = employee.age;
        }
        if ((i4 & 16384) != 0) {
            i3 = employee.contractWeeks;
        }
        if ((i4 & 32768) != 0) {
            f7 = employee.integrity;
        }
        if ((i4 & 65536) != 0) {
            f8 = employee.communication;
        }
        if ((i4 & 131072) != 0) {
            f9 = employee.efficiency;
        }
        if ((i4 & 262144) != 0) {
            f10 = employee.negotiation;
        }
        if ((i4 & 524288) != 0) {
            f11 = employee.ambition;
        }
        if ((i4 & 1048576) != 0) {
            f12 = employee.stressLevel;
        }
        if ((i4 & 2097152) != 0) {
            f13 = employee.happiness;
        }
        if ((i4 & 4194304) != 0) {
            f14 = employee.workload;
        }
        if ((i4 & 8388608) != 0) {
            f15 = employee.reputation;
        }
        if ((i4 & 16777216) != 0) {
            list = employee.careerHistory;
        }
        if ((i4 & 33554432) != 0) {
            map = employee.permissions;
        }
        if ((i4 & 67108864) != 0) {
            f16 = employee.rating;
        }
        if ((i4 & 134217728) != 0) {
            str5 = employee.investorStyle;
        }
        return employee.copy(str, str2, str3, d, i, f, f2, f3, f4, f5, f6, z, str4, i2, i3, f7, f8, f9, f10, f11, f12, f13, f14, f15, list, map, f16, str5);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.role;
        double d = this.weeklySalary;
        int i = this.experience;
        float f = this.reliability;
        float f2 = this.honesty;
        float f3 = this.greed;
        float f4 = this.intelligence;
        float f5 = this.leadership;
        float f6 = this.loyalty;
        boolean z = this.isRetired;
        String str4 = this.traitDescription;
        int i2 = this.age;
        int i3 = this.contractWeeks;
        float f7 = this.integrity;
        float f8 = this.communication;
        float f9 = this.efficiency;
        float f10 = this.negotiation;
        float f11 = this.ambition;
        float f12 = this.stressLevel;
        float f13 = this.happiness;
        float f14 = this.workload;
        float f15 = this.reputation;
        List<String> list = this.careerHistory;
        Map<String, Boolean> map = this.permissions;
        float f16 = this.rating;
        String str5 = this.investorStyle;
        return "Employee(id=" + str + ", name=" + str2 + ", role=" + str3 + ", weeklySalary=" + d + ", experience=" + str + ", reliability=" + i + ", honesty=" + f + ", greed=" + f2 + ", intelligence=" + f3 + ", leadership=" + f4 + ", loyalty=" + f5 + ", isRetired=" + f6 + ", traitDescription=" + z + ", age=" + str4 + ", contractWeeks=" + i2 + ", integrity=" + i3 + ", communication=" + f7 + ", efficiency=" + f8 + ", negotiation=" + f9 + ", ambition=" + f10 + ", stressLevel=" + f11 + ", happiness=" + f12 + ", workload=" + f13 + ", reputation=" + f14 + ", careerHistory=" + f15 + ", permissions=" + list + ", rating=" + map + ", investorStyle=" + f16 + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((result * 31) + this.name.hashCode()) * 31) + this.role.hashCode()) * 31) + Double.hashCode(this.weeklySalary)) * 31) + Integer.hashCode(this.experience)) * 31) + Float.hashCode(this.reliability)) * 31) + Float.hashCode(this.honesty)) * 31) + Float.hashCode(this.greed)) * 31) + Float.hashCode(this.intelligence)) * 31) + Float.hashCode(this.leadership)) * 31) + Float.hashCode(this.loyalty)) * 31) + Boolean.hashCode(this.isRetired)) * 31) + this.traitDescription.hashCode()) * 31) + Integer.hashCode(this.age)) * 31) + Integer.hashCode(this.contractWeeks)) * 31) + Float.hashCode(this.integrity)) * 31) + Float.hashCode(this.communication)) * 31) + Float.hashCode(this.efficiency)) * 31) + Float.hashCode(this.negotiation)) * 31) + Float.hashCode(this.ambition)) * 31) + Float.hashCode(this.stressLevel)) * 31) + Float.hashCode(this.happiness)) * 31) + Float.hashCode(this.workload)) * 31) + Float.hashCode(this.reputation)) * 31) + this.careerHistory.hashCode()) * 31) + this.permissions.hashCode()) * 31) + Float.hashCode(this.rating)) * 31) + this.investorStyle.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Employee) {
            Employee employee = (Employee) other;
            return Intrinsics.areEqual(this.id, employee.id) && Intrinsics.areEqual(this.name, employee.name) && Intrinsics.areEqual(this.role, employee.role) && Double.compare(this.weeklySalary, employee.weeklySalary) == 0 && this.experience == employee.experience && Float.compare(this.reliability, employee.reliability) == 0 && Float.compare(this.honesty, employee.honesty) == 0 && Float.compare(this.greed, employee.greed) == 0 && Float.compare(this.intelligence, employee.intelligence) == 0 && Float.compare(this.leadership, employee.leadership) == 0 && Float.compare(this.loyalty, employee.loyalty) == 0 && this.isRetired == employee.isRetired && Intrinsics.areEqual(this.traitDescription, employee.traitDescription) && this.age == employee.age && this.contractWeeks == employee.contractWeeks && Float.compare(this.integrity, employee.integrity) == 0 && Float.compare(this.communication, employee.communication) == 0 && Float.compare(this.efficiency, employee.efficiency) == 0 && Float.compare(this.negotiation, employee.negotiation) == 0 && Float.compare(this.ambition, employee.ambition) == 0 && Float.compare(this.stressLevel, employee.stressLevel) == 0 && Float.compare(this.happiness, employee.happiness) == 0 && Float.compare(this.workload, employee.workload) == 0 && Float.compare(this.reputation, employee.reputation) == 0 && Intrinsics.areEqual(this.careerHistory, employee.careerHistory) && Intrinsics.areEqual(this.permissions, employee.permissions) && Float.compare(this.rating, employee.rating) == 0 && Intrinsics.areEqual(this.investorStyle, employee.investorStyle);
        }
        return false;
    }

    public Employee(@NotNull String id, @NotNull String name, @NotNull String role, double weeklySalary, int experience, float reliability, float honesty, float greed, float intelligence, float leadership, float loyalty, boolean isRetired, @NotNull String traitDescription, int age, int contractWeeks, float integrity, float communication, float efficiency, float negotiation, float ambition, float stressLevel, float happiness, float workload, float reputation, @NotNull List<String> list, @NotNull Map<String, Boolean> map, float rating, @NotNull String investorStyle) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(traitDescription, "traitDescription");
        Intrinsics.checkNotNullParameter(list, "careerHistory");
        Intrinsics.checkNotNullParameter(map, "permissions");
        Intrinsics.checkNotNullParameter(investorStyle, "investorStyle");
        this.id = id;
        this.name = name;
        this.role = role;
        this.weeklySalary = weeklySalary;
        this.experience = experience;
        this.reliability = reliability;
        this.honesty = honesty;
        this.greed = greed;
        this.intelligence = intelligence;
        this.leadership = leadership;
        this.loyalty = loyalty;
        this.isRetired = isRetired;
        this.traitDescription = traitDescription;
        this.age = age;
        this.contractWeeks = contractWeeks;
        this.integrity = integrity;
        this.communication = communication;
        this.efficiency = efficiency;
        this.negotiation = negotiation;
        this.ambition = ambition;
        this.stressLevel = stressLevel;
        this.happiness = happiness;
        this.workload = workload;
        this.reputation = reputation;
        this.careerHistory = list;
        this.permissions = map;
        this.rating = rating;
        this.investorStyle = investorStyle;
    }

    public /* synthetic */ Employee(String str, String str2, String str3, double d, int i, float f, float f2, float f3, float f4, float f5, float f6, boolean z, String str4, int i2, int i3, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, List list, Map map, float f16, String str5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, i, f, f2, f3, f4, f5, (i4 & 1024) != 0 ? 60.0f : f6, (i4 & 2048) != 0 ? false : z, (i4 & 4096) != 0 ? "Experienced" : str4, (i4 & 8192) != 0 ? 30 : i2, (i4 & 16384) != 0 ? 12 : i3, (i4 & 32768) != 0 ? 60.0f : f7, (i4 & 65536) != 0 ? 60.0f : f8, (i4 & 131072) != 0 ? 60.0f : f9, (i4 & 262144) != 0 ? 60.0f : f10, (i4 & 524288) != 0 ? 60.0f : f11, (i4 & 1048576) != 0 ? 10.0f : f12, (i4 & 2097152) != 0 ? 80.0f : f13, (i4 & 4194304) != 0 ? 20.0f : f14, (i4 & 8388608) != 0 ? 70.0f : f15, (i4 & 16777216) != 0 ? CollectionsKt.emptyList() : list, (i4 & 33554432) != 0 ? MapsKt.emptyMap() : map, (i4 & 67108864) != 0 ? 4.5f : f16, (i4 & 134217728) != 0 ? "Balanced" : str5);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getRole() {
        return this.role;
    }

    public final double getWeeklySalary() {
        return this.weeklySalary;
    }

    public final int getExperience() {
        return this.experience;
    }

    public final float getReliability() {
        return this.reliability;
    }

    public final float getHonesty() {
        return this.honesty;
    }

    public final float getGreed() {
        return this.greed;
    }

    public final float getIntelligence() {
        return this.intelligence;
    }

    public final float getLeadership() {
        return this.leadership;
    }

    public final float getLoyalty() {
        return this.loyalty;
    }

    public final boolean isRetired() {
        return this.isRetired;
    }

    @NotNull
    public final String getTraitDescription() {
        return this.traitDescription;
    }

    public final int getAge() {
        return this.age;
    }

    public final int getContractWeeks() {
        return this.contractWeeks;
    }

    public final float getIntegrity() {
        return this.integrity;
    }

    public final float getCommunication() {
        return this.communication;
    }

    public final float getEfficiency() {
        return this.efficiency;
    }

    public final float getNegotiation() {
        return this.negotiation;
    }

    public final float getAmbition() {
        return this.ambition;
    }

    public final float getStressLevel() {
        return this.stressLevel;
    }

    public final float getHappiness() {
        return this.happiness;
    }

    public final float getWorkload() {
        return this.workload;
    }

    public final float getReputation() {
        return this.reputation;
    }

    @NotNull
    public final List<String> getCareerHistory() {
        return this.careerHistory;
    }

    @NotNull
    public final Map<String, Boolean> getPermissions() {
        return this.permissions;
    }

    public final float getRating() {
        return this.rating;
    }

    @NotNull
    public final String getInvestorStyle() {
        return this.investorStyle;
    }

    public final int getSkillRatingPercent() {
        float calculated = (this.experience * 0.4f) + (this.intelligence * 0.3f) + (this.reliability * 0.2f) + (this.leadership * 0.1f);
        return RangesKt.coerceIn((int) calculated, 20, 99);
    }

    public final int getExperienceYears() {
        return RangesKt.coerceIn((int) (this.experience / 3.5f), 1, 35);
    }

    public final boolean getHasStubbornTrait() {
        return (StringsKt.contains(this.role, "Crypto", true) || StringsKt.contains(this.role, "Accountant", true) || StringsKt.contains(this.role, "Financial", true)) && (getSkillRatingPercent() >= 80 || this.rating >= 4.0f);
    }
}
