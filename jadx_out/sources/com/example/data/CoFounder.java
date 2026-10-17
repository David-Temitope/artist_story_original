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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��2\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003JO\u0010\u001f\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u000f¨\u0006&"}, d2 = {"Lcom/example/data/CoFounder;", "", "id", "", "name", "trait", "equityShare", "", "relationship", "salaryExpectation", "", "monthlyDemands", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFDLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getTrait", "getEquityShare", "()F", "getRelationship", "getSalaryExpectation", "()D", "getMonthlyDemands", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: CoFounder.class */
public final class CoFounder {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String trait;
    private final float equityShare;
    private final float relationship;
    private final double salaryExpectation;
    @NotNull
    private final String monthlyDemands;
    public static final int $stable = 0;

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
        return this.trait;
    }

    public final float component4() {
        return this.equityShare;
    }

    public final float component5() {
        return this.relationship;
    }

    public final double component6() {
        return this.salaryExpectation;
    }

    @NotNull
    public final String component7() {
        return this.monthlyDemands;
    }

    @NotNull
    public final CoFounder copy(@NotNull String id, @NotNull String name, @NotNull String trait, float equityShare, float relationship, double salaryExpectation, @NotNull String monthlyDemands) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(trait, "trait");
        Intrinsics.checkNotNullParameter(monthlyDemands, "monthlyDemands");
        return new CoFounder(id, name, trait, equityShare, relationship, salaryExpectation, monthlyDemands);
    }

    public static /* synthetic */ CoFounder copy$default(CoFounder coFounder, String str, String str2, String str3, float f, float f2, double d, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coFounder.id;
        }
        if ((i & 2) != 0) {
            str2 = coFounder.name;
        }
        if ((i & 4) != 0) {
            str3 = coFounder.trait;
        }
        if ((i & 8) != 0) {
            f = coFounder.equityShare;
        }
        if ((i & 16) != 0) {
            f2 = coFounder.relationship;
        }
        if ((i & 32) != 0) {
            d = coFounder.salaryExpectation;
        }
        if ((i & 64) != 0) {
            str4 = coFounder.monthlyDemands;
        }
        return coFounder.copy(str, str2, str3, f, f2, d, str4);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.trait;
        float f = this.equityShare;
        float f2 = this.relationship;
        double d = this.salaryExpectation;
        String str4 = this.monthlyDemands;
        return "CoFounder(id=" + str + ", name=" + str2 + ", trait=" + str3 + ", equityShare=" + f + ", relationship=" + f2 + ", salaryExpectation=" + d + ", monthlyDemands=" + str + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((result * 31) + this.name.hashCode()) * 31) + this.trait.hashCode()) * 31) + Float.hashCode(this.equityShare)) * 31) + Float.hashCode(this.relationship)) * 31) + Double.hashCode(this.salaryExpectation)) * 31) + this.monthlyDemands.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof CoFounder) {
            CoFounder coFounder = (CoFounder) other;
            return Intrinsics.areEqual(this.id, coFounder.id) && Intrinsics.areEqual(this.name, coFounder.name) && Intrinsics.areEqual(this.trait, coFounder.trait) && Float.compare(this.equityShare, coFounder.equityShare) == 0 && Float.compare(this.relationship, coFounder.relationship) == 0 && Double.compare(this.salaryExpectation, coFounder.salaryExpectation) == 0 && Intrinsics.areEqual(this.monthlyDemands, coFounder.monthlyDemands);
        }
        return false;
    }

    public CoFounder(@NotNull String id, @NotNull String name, @NotNull String trait, float equityShare, float relationship, double salaryExpectation, @NotNull String monthlyDemands) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(trait, "trait");
        Intrinsics.checkNotNullParameter(monthlyDemands, "monthlyDemands");
        this.id = id;
        this.name = name;
        this.trait = trait;
        this.equityShare = equityShare;
        this.relationship = relationship;
        this.salaryExpectation = salaryExpectation;
        this.monthlyDemands = monthlyDemands;
    }

    public /* synthetic */ CoFounder(String str, String str2, String str3, float f, float f2, double d, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, f, f2, d, (i & 64) != 0 ? "None" : str4);
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
    public final String getTrait() {
        return this.trait;
    }

    public final float getEquityShare() {
        return this.equityShare;
    }

    public final float getRelationship() {
        return this.relationship;
    }

    public final double getSalaryExpectation() {
        return this.salaryExpectation;
    }

    @NotNull
    public final String getMonthlyDemands() {
        return this.monthlyDemands;
    }
}
