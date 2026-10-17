package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameStateEntity.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0087\b\u0018��2\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003JY\u0010 \u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0013¨\u0006("}, d2 = {"Lcom/example/data/SocialSentimentState;", "", "positiveSentiment", "", "negativeSentiment", "neutralSentiment", "conversationVolume", "", "trendingScore", "mediaAttention", "industryFollowers", "followers", "<init>", "(FFFJFFJJ)V", "getPositiveSentiment", "()F", "getNegativeSentiment", "getNeutralSentiment", "getConversationVolume", "()J", "getTrendingScore", "getMediaAttention", "getIndustryFollowers", "getFollowers", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"})
/* loaded from: SocialSentimentState.class */
public final class SocialSentimentState {
    private final float positiveSentiment;
    private final float negativeSentiment;
    private final float neutralSentiment;
    private final long conversationVolume;
    private final float trendingScore;
    private final float mediaAttention;
    private final long industryFollowers;
    private final long followers;
    public static final int $stable = 0;

    public final float component1() {
        return this.positiveSentiment;
    }

    public final float component2() {
        return this.negativeSentiment;
    }

    public final float component3() {
        return this.neutralSentiment;
    }

    public final long component4() {
        return this.conversationVolume;
    }

    public final float component5() {
        return this.trendingScore;
    }

    public final float component6() {
        return this.mediaAttention;
    }

    public final long component7() {
        return this.industryFollowers;
    }

    public final long component8() {
        return this.followers;
    }

    @NotNull
    public final SocialSentimentState copy(float positiveSentiment, float negativeSentiment, float neutralSentiment, long conversationVolume, float trendingScore, float mediaAttention, long industryFollowers, long followers) {
        return new SocialSentimentState(positiveSentiment, negativeSentiment, neutralSentiment, conversationVolume, trendingScore, mediaAttention, industryFollowers, followers);
    }

    public static /* synthetic */ SocialSentimentState copy$default(SocialSentimentState socialSentimentState, float f, float f2, float f3, long j, float f4, float f5, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = socialSentimentState.positiveSentiment;
        }
        if ((i & 2) != 0) {
            f2 = socialSentimentState.negativeSentiment;
        }
        if ((i & 4) != 0) {
            f3 = socialSentimentState.neutralSentiment;
        }
        if ((i & 8) != 0) {
            j = socialSentimentState.conversationVolume;
        }
        if ((i & 16) != 0) {
            f4 = socialSentimentState.trendingScore;
        }
        if ((i & 32) != 0) {
            f5 = socialSentimentState.mediaAttention;
        }
        if ((i & 64) != 0) {
            j2 = socialSentimentState.industryFollowers;
        }
        if ((i & 128) != 0) {
            j3 = socialSentimentState.followers;
        }
        return socialSentimentState.copy(f, f2, f3, j, f4, f5, j2, j3);
    }

    @NotNull
    public String toString() {
        float f = this.positiveSentiment;
        float f2 = this.negativeSentiment;
        float f3 = this.neutralSentiment;
        long j = this.conversationVolume;
        float f4 = this.trendingScore;
        float f5 = this.mediaAttention;
        long j2 = this.industryFollowers;
        long j3 = this.followers;
        return "SocialSentimentState(positiveSentiment=" + f + ", negativeSentiment=" + f2 + ", neutralSentiment=" + f3 + ", conversationVolume=" + j + ", trendingScore=" + f + ", mediaAttention=" + f4 + ", industryFollowers=" + f5 + ", followers=" + j2 + ")";
    }

    public int hashCode() {
        int result = Float.hashCode(this.positiveSentiment);
        return (((((((((((((result * 31) + Float.hashCode(this.negativeSentiment)) * 31) + Float.hashCode(this.neutralSentiment)) * 31) + Long.hashCode(this.conversationVolume)) * 31) + Float.hashCode(this.trendingScore)) * 31) + Float.hashCode(this.mediaAttention)) * 31) + Long.hashCode(this.industryFollowers)) * 31) + Long.hashCode(this.followers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SocialSentimentState) {
            SocialSentimentState socialSentimentState = (SocialSentimentState) other;
            return Float.compare(this.positiveSentiment, socialSentimentState.positiveSentiment) == 0 && Float.compare(this.negativeSentiment, socialSentimentState.negativeSentiment) == 0 && Float.compare(this.neutralSentiment, socialSentimentState.neutralSentiment) == 0 && this.conversationVolume == socialSentimentState.conversationVolume && Float.compare(this.trendingScore, socialSentimentState.trendingScore) == 0 && Float.compare(this.mediaAttention, socialSentimentState.mediaAttention) == 0 && this.industryFollowers == socialSentimentState.industryFollowers && this.followers == socialSentimentState.followers;
        }
        return false;
    }

    public SocialSentimentState() {
        this(0.0f, 0.0f, 0.0f, 0L, 0.0f, 0.0f, 0L, 0L, 255, null);
    }

    public SocialSentimentState(float positiveSentiment, float negativeSentiment, float neutralSentiment, long conversationVolume, float trendingScore, float mediaAttention, long industryFollowers, long followers) {
        this.positiveSentiment = positiveSentiment;
        this.negativeSentiment = negativeSentiment;
        this.neutralSentiment = neutralSentiment;
        this.conversationVolume = conversationVolume;
        this.trendingScore = trendingScore;
        this.mediaAttention = mediaAttention;
        this.industryFollowers = industryFollowers;
        this.followers = followers;
    }

    public /* synthetic */ SocialSentimentState(float f, float f2, float f3, long j, float f4, float f5, long j2, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 50.0f : f, (i & 2) != 0 ? 20.0f : f2, (i & 4) != 0 ? 30.0f : f3, (i & 8) != 0 ? 50L : j, (i & 16) != 0 ? 10.0f : f4, (i & 32) != 0 ? 10.0f : f5, (i & 64) != 0 ? 10L : j2, (i & 128) != 0 ? 100L : j3);
    }

    public final float getPositiveSentiment() {
        return this.positiveSentiment;
    }

    public final float getNegativeSentiment() {
        return this.negativeSentiment;
    }

    public final float getNeutralSentiment() {
        return this.neutralSentiment;
    }

    public final long getConversationVolume() {
        return this.conversationVolume;
    }

    public final float getTrendingScore() {
        return this.trendingScore;
    }

    public final float getMediaAttention() {
        return this.mediaAttention;
    }

    public final long getIndustryFollowers() {
        return this.industryFollowers;
    }

    public final long getFollowers() {
        return this.followers;
    }
}
