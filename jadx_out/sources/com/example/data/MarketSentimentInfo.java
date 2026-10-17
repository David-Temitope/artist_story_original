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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J1\u0010\u0014\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/example/data/MarketSentimentInfo;", "", "score", "", "label", "", "summary", "actionableTip", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScore", "()I", "getLabel", "()Ljava/lang/String;", "getSummary", "getActionableTip", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: MarketSentimentInfo.class */
public final class MarketSentimentInfo {
    private final int score;
    @NotNull
    private final String label;
    @NotNull
    private final String summary;
    @NotNull
    private final String actionableTip;
    public static final int $stable = 0;

    public final int component1() {
        return this.score;
    }

    @NotNull
    public final String component2() {
        return this.label;
    }

    @NotNull
    public final String component3() {
        return this.summary;
    }

    @NotNull
    public final String component4() {
        return this.actionableTip;
    }

    @NotNull
    public final MarketSentimentInfo copy(int score, @NotNull String label, @NotNull String summary, @NotNull String actionableTip) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(actionableTip, "actionableTip");
        return new MarketSentimentInfo(score, label, summary, actionableTip);
    }

    public static /* synthetic */ MarketSentimentInfo copy$default(MarketSentimentInfo marketSentimentInfo, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = marketSentimentInfo.score;
        }
        if ((i2 & 2) != 0) {
            str = marketSentimentInfo.label;
        }
        if ((i2 & 4) != 0) {
            str2 = marketSentimentInfo.summary;
        }
        if ((i2 & 8) != 0) {
            str3 = marketSentimentInfo.actionableTip;
        }
        return marketSentimentInfo.copy(i, str, str2, str3);
    }

    @NotNull
    public String toString() {
        return "MarketSentimentInfo(score=" + this.score + ", label=" + this.label + ", summary=" + this.summary + ", actionableTip=" + this.actionableTip + ")";
    }

    public int hashCode() {
        int result = Integer.hashCode(this.score);
        return (((((result * 31) + this.label.hashCode()) * 31) + this.summary.hashCode()) * 31) + this.actionableTip.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof MarketSentimentInfo) {
            MarketSentimentInfo marketSentimentInfo = (MarketSentimentInfo) other;
            return this.score == marketSentimentInfo.score && Intrinsics.areEqual(this.label, marketSentimentInfo.label) && Intrinsics.areEqual(this.summary, marketSentimentInfo.summary) && Intrinsics.areEqual(this.actionableTip, marketSentimentInfo.actionableTip);
        }
        return false;
    }

    public MarketSentimentInfo() {
        this(0, null, null, null, 15, null);
    }

    public MarketSentimentInfo(int score, @NotNull String label, @NotNull String summary, @NotNull String actionableTip) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(actionableTip, "actionableTip");
        this.score = score;
        this.label = label;
        this.summary = summary;
        this.actionableTip = actionableTip;
    }

    public /* synthetic */ MarketSentimentInfo(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 50 : i, (i2 & 2) != 0 ? "Neutral" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3);
    }

    public final int getScore() {
        return this.score;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final String getSummary() {
        return this.summary;
    }

    @NotNull
    public final String getActionableTip() {
        return this.actionableTip;
    }
}
