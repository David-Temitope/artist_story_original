package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DecisionModels.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003Js\u0010)\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000bHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/example/data/CareerDilemma;", "", "id", "", "category", "headline", "situationNarrative", "stakeholders", "stakes", "urgencyTag", "week", "", "year", "choices", "", "Lcom/example/data/DilemmaChoice;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)V", "getId", "()Ljava/lang/String;", "getCategory", "getHeadline", "getSituationNarrative", "getStakeholders", "getStakes", "getUrgencyTag", "getWeek", "()I", "getYear", "getChoices", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: CareerDilemma.class */
public final class CareerDilemma {
    @NotNull
    private final String id;
    @NotNull
    private final String category;
    @NotNull
    private final String headline;
    @NotNull
    private final String situationNarrative;
    @NotNull
    private final String stakeholders;
    @NotNull
    private final String stakes;
    @NotNull
    private final String urgencyTag;
    private final int week;
    private final int year;
    @NotNull
    private final List<DilemmaChoice> choices;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.category;
    }

    @NotNull
    public final String component3() {
        return this.headline;
    }

    @NotNull
    public final String component4() {
        return this.situationNarrative;
    }

    @NotNull
    public final String component5() {
        return this.stakeholders;
    }

    @NotNull
    public final String component6() {
        return this.stakes;
    }

    @NotNull
    public final String component7() {
        return this.urgencyTag;
    }

    public final int component8() {
        return this.week;
    }

    public final int component9() {
        return this.year;
    }

    @NotNull
    public final List<DilemmaChoice> component10() {
        return this.choices;
    }

    @NotNull
    public final CareerDilemma copy(@NotNull String id, @NotNull String category, @NotNull String headline, @NotNull String situationNarrative, @NotNull String stakeholders, @NotNull String stakes, @NotNull String urgencyTag, int week, int year, @NotNull List<DilemmaChoice> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(situationNarrative, "situationNarrative");
        Intrinsics.checkNotNullParameter(stakeholders, "stakeholders");
        Intrinsics.checkNotNullParameter(stakes, "stakes");
        Intrinsics.checkNotNullParameter(urgencyTag, "urgencyTag");
        Intrinsics.checkNotNullParameter(list, "choices");
        return new CareerDilemma(id, category, headline, situationNarrative, stakeholders, stakes, urgencyTag, week, year, list);
    }

    public static /* synthetic */ CareerDilemma copy$default(CareerDilemma careerDilemma, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = careerDilemma.id;
        }
        if ((i3 & 2) != 0) {
            str2 = careerDilemma.category;
        }
        if ((i3 & 4) != 0) {
            str3 = careerDilemma.headline;
        }
        if ((i3 & 8) != 0) {
            str4 = careerDilemma.situationNarrative;
        }
        if ((i3 & 16) != 0) {
            str5 = careerDilemma.stakeholders;
        }
        if ((i3 & 32) != 0) {
            str6 = careerDilemma.stakes;
        }
        if ((i3 & 64) != 0) {
            str7 = careerDilemma.urgencyTag;
        }
        if ((i3 & 128) != 0) {
            i = careerDilemma.week;
        }
        if ((i3 & 256) != 0) {
            i2 = careerDilemma.year;
        }
        if ((i3 & 512) != 0) {
            list = careerDilemma.choices;
        }
        return careerDilemma.copy(str, str2, str3, str4, str5, str6, str7, i, i2, list);
    }

    @NotNull
    public String toString() {
        return "CareerDilemma(id=" + this.id + ", category=" + this.category + ", headline=" + this.headline + ", situationNarrative=" + this.situationNarrative + ", stakeholders=" + this.stakeholders + ", stakes=" + this.stakes + ", urgencyTag=" + this.urgencyTag + ", week=" + this.week + ", year=" + this.year + ", choices=" + this.choices + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((result * 31) + this.category.hashCode()) * 31) + this.headline.hashCode()) * 31) + this.situationNarrative.hashCode()) * 31) + this.stakeholders.hashCode()) * 31) + this.stakes.hashCode()) * 31) + this.urgencyTag.hashCode()) * 31) + Integer.hashCode(this.week)) * 31) + Integer.hashCode(this.year)) * 31) + this.choices.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof CareerDilemma) {
            CareerDilemma careerDilemma = (CareerDilemma) other;
            return Intrinsics.areEqual(this.id, careerDilemma.id) && Intrinsics.areEqual(this.category, careerDilemma.category) && Intrinsics.areEqual(this.headline, careerDilemma.headline) && Intrinsics.areEqual(this.situationNarrative, careerDilemma.situationNarrative) && Intrinsics.areEqual(this.stakeholders, careerDilemma.stakeholders) && Intrinsics.areEqual(this.stakes, careerDilemma.stakes) && Intrinsics.areEqual(this.urgencyTag, careerDilemma.urgencyTag) && this.week == careerDilemma.week && this.year == careerDilemma.year && Intrinsics.areEqual(this.choices, careerDilemma.choices);
        }
        return false;
    }

    public CareerDilemma(@NotNull String id, @NotNull String category, @NotNull String headline, @NotNull String situationNarrative, @NotNull String stakeholders, @NotNull String stakes, @NotNull String urgencyTag, int week, int year, @NotNull List<DilemmaChoice> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(situationNarrative, "situationNarrative");
        Intrinsics.checkNotNullParameter(stakeholders, "stakeholders");
        Intrinsics.checkNotNullParameter(stakes, "stakes");
        Intrinsics.checkNotNullParameter(urgencyTag, "urgencyTag");
        Intrinsics.checkNotNullParameter(list, "choices");
        this.id = id;
        this.category = category;
        this.headline = headline;
        this.situationNarrative = situationNarrative;
        this.stakeholders = stakeholders;
        this.stakes = stakes;
        this.urgencyTag = urgencyTag;
        this.week = week;
        this.year = year;
        this.choices = list;
    }

    public /* synthetic */ CareerDilemma(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i3 & 64) != 0 ? "DECISION REQUIRED" : str7, (i3 & 128) != 0 ? 1 : i, (i3 & 256) != 0 ? 1 : i2, list);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }

    @NotNull
    public final String getHeadline() {
        return this.headline;
    }

    @NotNull
    public final String getSituationNarrative() {
        return this.situationNarrative;
    }

    @NotNull
    public final String getStakeholders() {
        return this.stakeholders;
    }

    @NotNull
    public final String getStakes() {
        return this.stakes;
    }

    @NotNull
    public final String getUrgencyTag() {
        return this.urgencyTag;
    }

    public final int getWeek() {
        return this.week;
    }

    public final int getYear() {
        return this.year;
    }

    @NotNull
    public final List<DilemmaChoice> getChoices() {
        return this.choices;
    }
}
