package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JK\u0010\u001d\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/example/data/ActionFeedback;", "", "id", "", "title", "subtitle", "deltas", "", "Lcom/example/data/StatFeedbackItem;", "iconType", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubtitle", "getDeltas", "()Ljava/util/List;", "getIconType", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: ActionFeedback.class */
public final class ActionFeedback {
    @NotNull
    private final String id;
    @NotNull
    private final String title;
    @NotNull
    private final String subtitle;
    @NotNull
    private final List<StatFeedbackItem> deltas;
    @NotNull
    private final String iconType;
    private final long timestamp;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @NotNull
    public final String component3() {
        return this.subtitle;
    }

    @NotNull
    public final List<StatFeedbackItem> component4() {
        return this.deltas;
    }

    @NotNull
    public final String component5() {
        return this.iconType;
    }

    public final long component6() {
        return this.timestamp;
    }

    @NotNull
    public final ActionFeedback copy(@NotNull String id, @NotNull String title, @NotNull String subtitle, @NotNull List<StatFeedbackItem> list, @NotNull String iconType, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(list, "deltas");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        return new ActionFeedback(id, title, subtitle, list, iconType, timestamp);
    }

    public static /* synthetic */ ActionFeedback copy$default(ActionFeedback actionFeedback, String str, String str2, String str3, List list, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = actionFeedback.id;
        }
        if ((i & 2) != 0) {
            str2 = actionFeedback.title;
        }
        if ((i & 4) != 0) {
            str3 = actionFeedback.subtitle;
        }
        if ((i & 8) != 0) {
            list = actionFeedback.deltas;
        }
        if ((i & 16) != 0) {
            str4 = actionFeedback.iconType;
        }
        if ((i & 32) != 0) {
            j = actionFeedback.timestamp;
        }
        return actionFeedback.copy(str, str2, str3, list, str4, j);
    }

    @NotNull
    public String toString() {
        return "ActionFeedback(id=" + this.id + ", title=" + this.title + ", subtitle=" + this.subtitle + ", deltas=" + this.deltas + ", iconType=" + this.iconType + ", timestamp=" + this.timestamp + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((result * 31) + this.title.hashCode()) * 31) + this.subtitle.hashCode()) * 31) + this.deltas.hashCode()) * 31) + this.iconType.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ActionFeedback) {
            ActionFeedback actionFeedback = (ActionFeedback) other;
            return Intrinsics.areEqual(this.id, actionFeedback.id) && Intrinsics.areEqual(this.title, actionFeedback.title) && Intrinsics.areEqual(this.subtitle, actionFeedback.subtitle) && Intrinsics.areEqual(this.deltas, actionFeedback.deltas) && Intrinsics.areEqual(this.iconType, actionFeedback.iconType) && this.timestamp == actionFeedback.timestamp;
        }
        return false;
    }

    public ActionFeedback(@NotNull String id, @NotNull String title, @NotNull String subtitle, @NotNull List<StatFeedbackItem> list, @NotNull String iconType, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(list, "deltas");
        Intrinsics.checkNotNullParameter(iconType, "iconType");
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.deltas = list;
        this.iconType = iconType;
        this.timestamp = timestamp;
    }

    public /* synthetic */ ActionFeedback(String str, String str2, String str3, List list, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "bolt" : str4, (i & 32) != 0 ? System.currentTimeMillis() : j);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final List<StatFeedbackItem> getDeltas() {
        return this.deltas;
    }

    @NotNull
    public final String getIconType() {
        return this.iconType;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
