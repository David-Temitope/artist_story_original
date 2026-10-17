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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018��2\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jo\u0010'\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\tHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n��\u001a\u0004\b\f\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u0012¨\u0006,"}, d2 = {"Lcom/example/data/CareerNewsFeedItem;", "", "id", "", "category", "headline", "detailedBody", "sourceOutlet", "week", "", "year", "severity", "isViral", "", "actionSuggestion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCategory", "getHeadline", "getDetailedBody", "getSourceOutlet", "getWeek", "()I", "getYear", "getSeverity", "()Z", "getActionSuggestion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: CareerNewsFeedItem.class */
public final class CareerNewsFeedItem {
    @NotNull
    private final String id;
    @NotNull
    private final String category;
    @NotNull
    private final String headline;
    @NotNull
    private final String detailedBody;
    @NotNull
    private final String sourceOutlet;
    private final int week;
    private final int year;
    @NotNull
    private final String severity;
    private final boolean isViral;
    @Nullable
    private final String actionSuggestion;
    public static final int $stable = 0;

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
        return this.detailedBody;
    }

    @NotNull
    public final String component5() {
        return this.sourceOutlet;
    }

    public final int component6() {
        return this.week;
    }

    public final int component7() {
        return this.year;
    }

    @NotNull
    public final String component8() {
        return this.severity;
    }

    public final boolean component9() {
        return this.isViral;
    }

    @Nullable
    public final String component10() {
        return this.actionSuggestion;
    }

    @NotNull
    public final CareerNewsFeedItem copy(@NotNull String id, @NotNull String category, @NotNull String headline, @NotNull String detailedBody, @NotNull String sourceOutlet, int week, int year, @NotNull String severity, boolean isViral, @Nullable String actionSuggestion) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(detailedBody, "detailedBody");
        Intrinsics.checkNotNullParameter(sourceOutlet, "sourceOutlet");
        Intrinsics.checkNotNullParameter(severity, "severity");
        return new CareerNewsFeedItem(id, category, headline, detailedBody, sourceOutlet, week, year, severity, isViral, actionSuggestion);
    }

    public static /* synthetic */ CareerNewsFeedItem copy$default(CareerNewsFeedItem careerNewsFeedItem, String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, boolean z, String str7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = careerNewsFeedItem.id;
        }
        if ((i3 & 2) != 0) {
            str2 = careerNewsFeedItem.category;
        }
        if ((i3 & 4) != 0) {
            str3 = careerNewsFeedItem.headline;
        }
        if ((i3 & 8) != 0) {
            str4 = careerNewsFeedItem.detailedBody;
        }
        if ((i3 & 16) != 0) {
            str5 = careerNewsFeedItem.sourceOutlet;
        }
        if ((i3 & 32) != 0) {
            i = careerNewsFeedItem.week;
        }
        if ((i3 & 64) != 0) {
            i2 = careerNewsFeedItem.year;
        }
        if ((i3 & 128) != 0) {
            str6 = careerNewsFeedItem.severity;
        }
        if ((i3 & 256) != 0) {
            z = careerNewsFeedItem.isViral;
        }
        if ((i3 & 512) != 0) {
            str7 = careerNewsFeedItem.actionSuggestion;
        }
        return careerNewsFeedItem.copy(str, str2, str3, str4, str5, i, i2, str6, z, str7);
    }

    @NotNull
    public String toString() {
        return "CareerNewsFeedItem(id=" + this.id + ", category=" + this.category + ", headline=" + this.headline + ", detailedBody=" + this.detailedBody + ", sourceOutlet=" + this.sourceOutlet + ", week=" + this.week + ", year=" + this.year + ", severity=" + this.severity + ", isViral=" + this.isViral + ", actionSuggestion=" + this.actionSuggestion + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((result * 31) + this.category.hashCode()) * 31) + this.headline.hashCode()) * 31) + this.detailedBody.hashCode()) * 31) + this.sourceOutlet.hashCode()) * 31) + Integer.hashCode(this.week)) * 31) + Integer.hashCode(this.year)) * 31) + this.severity.hashCode()) * 31) + Boolean.hashCode(this.isViral)) * 31) + (this.actionSuggestion == null ? 0 : this.actionSuggestion.hashCode());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof CareerNewsFeedItem) {
            CareerNewsFeedItem careerNewsFeedItem = (CareerNewsFeedItem) other;
            return Intrinsics.areEqual(this.id, careerNewsFeedItem.id) && Intrinsics.areEqual(this.category, careerNewsFeedItem.category) && Intrinsics.areEqual(this.headline, careerNewsFeedItem.headline) && Intrinsics.areEqual(this.detailedBody, careerNewsFeedItem.detailedBody) && Intrinsics.areEqual(this.sourceOutlet, careerNewsFeedItem.sourceOutlet) && this.week == careerNewsFeedItem.week && this.year == careerNewsFeedItem.year && Intrinsics.areEqual(this.severity, careerNewsFeedItem.severity) && this.isViral == careerNewsFeedItem.isViral && Intrinsics.areEqual(this.actionSuggestion, careerNewsFeedItem.actionSuggestion);
        }
        return false;
    }

    public CareerNewsFeedItem(@NotNull String id, @NotNull String category, @NotNull String headline, @NotNull String detailedBody, @NotNull String sourceOutlet, int week, int year, @NotNull String severity, boolean isViral, @Nullable String actionSuggestion) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(detailedBody, "detailedBody");
        Intrinsics.checkNotNullParameter(sourceOutlet, "sourceOutlet");
        Intrinsics.checkNotNullParameter(severity, "severity");
        this.id = id;
        this.category = category;
        this.headline = headline;
        this.detailedBody = detailedBody;
        this.sourceOutlet = sourceOutlet;
        this.week = week;
        this.year = year;
        this.severity = severity;
        this.isViral = isViral;
        this.actionSuggestion = actionSuggestion;
    }

    public /* synthetic */ CareerNewsFeedItem(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, boolean z, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, i, i2, (i3 & 128) != 0 ? "NORMAL" : str6, (i3 & 256) != 0 ? false : z, (i3 & 512) != 0 ? null : str7);
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
    public final String getDetailedBody() {
        return this.detailedBody;
    }

    @NotNull
    public final String getSourceOutlet() {
        return this.sourceOutlet;
    }

    public final int getWeek() {
        return this.week;
    }

    public final int getYear() {
        return this.year;
    }

    @NotNull
    public final String getSeverity() {
        return this.severity;
    }

    public final boolean isViral() {
        return this.isViral;
    }

    @Nullable
    public final String getActionSuggestion() {
        return this.actionSuggestion;
    }
}
