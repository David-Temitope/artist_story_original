package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SocialSentimentStateJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0019"}, d2 = {"Lcom/example/data/SocialSentimentStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/SocialSentimentState;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "floatAdapter", "", "longAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nSocialSentimentStateJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SocialSentimentStateJsonAdapter.kt\ncom/example/data/SocialSentimentStateJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,173:1\n1#2:174\n*E\n"})
/* loaded from: SocialSentimentStateJsonAdapter.class */
public final class SocialSentimentStateJsonAdapter extends JsonAdapter<SocialSentimentState> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @Nullable
    private volatile Constructor<SocialSentimentState> constructorRef;
    public static final int $stable = 8;

    public SocialSentimentStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"positiveSentiment", "negativeSentiment", "neutralSentiment", "conversationVolume", "trendingScore", "mediaAttention", "industryFollowers", "followers"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<Float> adapter = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "positiveSentiment");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.floatAdapter = adapter;
        JsonAdapter<Long> adapter2 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "conversationVolume");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.longAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(42);
        sb.append("GeneratedJsonAdapter(").append("SocialSentimentState").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public SocialSentimentState m155fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Float positiveSentiment = Float.valueOf(0.0f);
        Float negativeSentiment = Float.valueOf(0.0f);
        Float neutralSentiment = Float.valueOf(0.0f);
        Long conversationVolume = 0L;
        Float trendingScore = Float.valueOf(0.0f);
        Float mediaAttention = Float.valueOf(0.0f);
        Long industryFollowers = 0L;
        Long followers = 0L;
        int mask0 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        positiveSentiment = f;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("positiveSentiment", "positiveSentiment", reader);
                    }
                case 1:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        negativeSentiment = f2;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("negativeSentiment", "negativeSentiment", reader);
                    }
                case 2:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 != null) {
                        neutralSentiment = f3;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("neutralSentiment", "neutralSentiment", reader);
                    }
                case 3:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        conversationVolume = l;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("conversationVolume", "conversationVolume", reader);
                    }
                case 4:
                    Float f4 = (Float) this.floatAdapter.fromJson(reader);
                    if (f4 != null) {
                        trendingScore = f4;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("trendingScore", "trendingScore", reader);
                    }
                case 5:
                    Float f5 = (Float) this.floatAdapter.fromJson(reader);
                    if (f5 != null) {
                        mediaAttention = f5;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("mediaAttention", "mediaAttention", reader);
                    }
                case 6:
                    Long l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 != null) {
                        industryFollowers = l2;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("industryFollowers", "industryFollowers", reader);
                    }
                case 7:
                    Long l3 = (Long) this.longAdapter.fromJson(reader);
                    if (l3 != null) {
                        followers = l3;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("followers", "followers", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -256) {
            return new SocialSentimentState(positiveSentiment.floatValue(), negativeSentiment.floatValue(), neutralSentiment.floatValue(), conversationVolume.longValue(), trendingScore.floatValue(), mediaAttention.floatValue(), industryFollowers.longValue(), followers.longValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = SocialSentimentState.class.getDeclaredConstructor(Float.TYPE, Float.TYPE, Float.TYPE, Long.TYPE, Float.TYPE, Float.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        SocialSentimentState newInstance = localConstructor.newInstance(positiveSentiment, negativeSentiment, neutralSentiment, conversationVolume, trendingScore, mediaAttention, industryFollowers, followers, Integer.valueOf(mask0), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable SocialSentimentState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("positiveSentiment");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPositiveSentiment()));
        writer.name("negativeSentiment");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getNegativeSentiment()));
        writer.name("neutralSentiment");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getNeutralSentiment()));
        writer.name("conversationVolume");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getConversationVolume()));
        writer.name("trendingScore");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getTrendingScore()));
        writer.name("mediaAttention");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getMediaAttention()));
        writer.name("industryFollowers");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getIndustryFollowers()));
        writer.name("followers");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFollowers()));
        writer.endObject();
    }
}
