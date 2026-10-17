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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��\"\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J1\u0010\u0013\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/example/data/StatFeedbackItem;", "", "label", "", "deltaText", "isPositive", "", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getDeltaText", "()Z", "getCategory", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app"})
/* loaded from: StatFeedbackItem.class */
public final class StatFeedbackItem {
    @NotNull
    private final String label;
    @NotNull
    private final String deltaText;
    private final boolean isPositive;
    @NotNull
    private final String category;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.label;
    }

    @NotNull
    public final String component2() {
        return this.deltaText;
    }

    public final boolean component3() {
        return this.isPositive;
    }

    @NotNull
    public final String component4() {
        return this.category;
    }

    @NotNull
    public final StatFeedbackItem copy(@NotNull String label, @NotNull String deltaText, boolean isPositive, @NotNull String category) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deltaText, "deltaText");
        Intrinsics.checkNotNullParameter(category, "category");
        return new StatFeedbackItem(label, deltaText, isPositive, category);
    }

    public static /* synthetic */ StatFeedbackItem copy$default(StatFeedbackItem statFeedbackItem, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statFeedbackItem.label;
        }
        if ((i & 2) != 0) {
            str2 = statFeedbackItem.deltaText;
        }
        if ((i & 4) != 0) {
            z = statFeedbackItem.isPositive;
        }
        if ((i & 8) != 0) {
            str3 = statFeedbackItem.category;
        }
        return statFeedbackItem.copy(str, str2, z, str3);
    }

    @NotNull
    public String toString() {
        return "StatFeedbackItem(label=" + this.label + ", deltaText=" + this.deltaText + ", isPositive=" + this.isPositive + ", category=" + this.category + ")";
    }

    public int hashCode() {
        int result = this.label.hashCode();
        return (((((result * 31) + this.deltaText.hashCode()) * 31) + Boolean.hashCode(this.isPositive)) * 31) + this.category.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof StatFeedbackItem) {
            StatFeedbackItem statFeedbackItem = (StatFeedbackItem) other;
            return Intrinsics.areEqual(this.label, statFeedbackItem.label) && Intrinsics.areEqual(this.deltaText, statFeedbackItem.deltaText) && this.isPositive == statFeedbackItem.isPositive && Intrinsics.areEqual(this.category, statFeedbackItem.category);
        }
        return false;
    }

    public StatFeedbackItem(@NotNull String label, @NotNull String deltaText, boolean isPositive, @NotNull String category) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deltaText, "deltaText");
        Intrinsics.checkNotNullParameter(category, "category");
        this.label = label;
        this.deltaText = deltaText;
        this.isPositive = isPositive;
        this.category = category;
    }

    public /* synthetic */ StatFeedbackItem(String str, String str2, boolean z, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? true : z, (i & 8) != 0 ? "general" : str3);
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getDeltaText() {
        return this.deltaText;
    }

    public final boolean isPositive() {
        return this.isPositive;
    }

    @NotNull
    public final String getCategory() {
        return this.category;
    }
}
