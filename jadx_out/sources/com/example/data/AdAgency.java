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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003JO\u0010!\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0016¨\u0006("}, d2 = {"Lcom/example/data/AdAgency;", "", "id", "", "name", "specialty", "audienceReach", "", "conversionRate", "", "pricePerWeek", "", "credibility", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JFDF)V", "getId", "()Ljava/lang/String;", "getName", "getSpecialty", "getAudienceReach", "()J", "getConversionRate", "()F", "getPricePerWeek", "()D", "getCredibility", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: AdAgency.class */
public final class AdAgency {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String specialty;
    private final long audienceReach;
    private final float conversionRate;
    private final double pricePerWeek;
    private final float credibility;
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
        return this.specialty;
    }

    public final long component4() {
        return this.audienceReach;
    }

    public final float component5() {
        return this.conversionRate;
    }

    public final double component6() {
        return this.pricePerWeek;
    }

    public final float component7() {
        return this.credibility;
    }

    @NotNull
    public final AdAgency copy(@NotNull String id, @NotNull String name, @NotNull String specialty, long audienceReach, float conversionRate, double pricePerWeek, float credibility) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(specialty, "specialty");
        return new AdAgency(id, name, specialty, audienceReach, conversionRate, pricePerWeek, credibility);
    }

    public static /* synthetic */ AdAgency copy$default(AdAgency adAgency, String str, String str2, String str3, long j, float f, double d, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = adAgency.id;
        }
        if ((i & 2) != 0) {
            str2 = adAgency.name;
        }
        if ((i & 4) != 0) {
            str3 = adAgency.specialty;
        }
        if ((i & 8) != 0) {
            j = adAgency.audienceReach;
        }
        if ((i & 16) != 0) {
            f = adAgency.conversionRate;
        }
        if ((i & 32) != 0) {
            d = adAgency.pricePerWeek;
        }
        if ((i & 64) != 0) {
            f2 = adAgency.credibility;
        }
        return adAgency.copy(str, str2, str3, j, f, d, f2);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.specialty;
        long j = this.audienceReach;
        float f = this.conversionRate;
        double d = this.pricePerWeek;
        float f2 = this.credibility;
        return "AdAgency(id=" + str + ", name=" + str2 + ", specialty=" + str3 + ", audienceReach=" + j + ", conversionRate=" + str + ", pricePerWeek=" + f + ", credibility=" + d + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((result * 31) + this.name.hashCode()) * 31) + this.specialty.hashCode()) * 31) + Long.hashCode(this.audienceReach)) * 31) + Float.hashCode(this.conversionRate)) * 31) + Double.hashCode(this.pricePerWeek)) * 31) + Float.hashCode(this.credibility);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof AdAgency) {
            AdAgency adAgency = (AdAgency) other;
            return Intrinsics.areEqual(this.id, adAgency.id) && Intrinsics.areEqual(this.name, adAgency.name) && Intrinsics.areEqual(this.specialty, adAgency.specialty) && this.audienceReach == adAgency.audienceReach && Float.compare(this.conversionRate, adAgency.conversionRate) == 0 && Double.compare(this.pricePerWeek, adAgency.pricePerWeek) == 0 && Float.compare(this.credibility, adAgency.credibility) == 0;
        }
        return false;
    }

    public AdAgency(@NotNull String id, @NotNull String name, @NotNull String specialty, long audienceReach, float conversionRate, double pricePerWeek, float credibility) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(specialty, "specialty");
        this.id = id;
        this.name = name;
        this.specialty = specialty;
        this.audienceReach = audienceReach;
        this.conversionRate = conversionRate;
        this.pricePerWeek = pricePerWeek;
        this.credibility = credibility;
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
    public final String getSpecialty() {
        return this.specialty;
    }

    public final long getAudienceReach() {
        return this.audienceReach;
    }

    public final float getConversionRate() {
        return this.conversionRate;
    }

    public final double getPricePerWeek() {
        return this.pricePerWeek;
    }

    public final float getCredibility() {
        return this.credibility;
    }
}
