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
/* compiled from: MarketSentimentInfoJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0018"}, d2 = {"Lcom/example/data/MarketSentimentInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/MarketSentimentInfo;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "intAdapter", "", "stringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nMarketSentimentInfoJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketSentimentInfoJsonAdapter.kt\ncom/example/data/MarketSentimentInfoJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,121:1\n1#2:122\n*E\n"})
/* loaded from: MarketSentimentInfoJsonAdapter.class */
public final class MarketSentimentInfoJsonAdapter extends JsonAdapter<MarketSentimentInfo> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @Nullable
    private volatile Constructor<MarketSentimentInfo> constructorRef;
    public static final int $stable = 8;

    public MarketSentimentInfoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"score", "label", "summary", "actionableTip"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<Integer> adapter = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "score");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.intAdapter = adapter;
        JsonAdapter<String> adapter2 = moshi.adapter(String.class, SetsKt.emptySet(), "label");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.stringAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(41);
        sb.append("GeneratedJsonAdapter(").append("MarketSentimentInfo").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public MarketSentimentInfo m110fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Integer score = 0;
        String label = null;
        String summary = null;
        String actionableTip = null;
        int mask0 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        score = num;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("score", "score", reader);
                    }
                case 1:
                    String str = (String) this.stringAdapter.fromJson(reader);
                    if (str != null) {
                        label = str;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("label", "label", reader);
                    }
                case 2:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        summary = str2;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("summary", "summary", reader);
                    }
                case 3:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        actionableTip = str3;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("actionableTip", "actionableTip", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -16) {
            int intValue = score.intValue();
            String str4 = label;
            Intrinsics.checkNotNull(str4, "null cannot be cast to non-null type kotlin.String");
            String str5 = summary;
            Intrinsics.checkNotNull(str5, "null cannot be cast to non-null type kotlin.String");
            String str6 = actionableTip;
            Intrinsics.checkNotNull(str6, "null cannot be cast to non-null type kotlin.String");
            return new MarketSentimentInfo(intValue, str4, str5, str6);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = MarketSentimentInfo.class.getDeclaredConstructor(Integer.TYPE, String.class, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        MarketSentimentInfo newInstance = localConstructor.newInstance(score, label, summary, actionableTip, Integer.valueOf(mask0), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable MarketSentimentInfo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("score");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getScore()));
        writer.name("label");
        this.stringAdapter.toJson(writer, value_.getLabel());
        writer.name("summary");
        this.stringAdapter.toJson(writer, value_.getSummary());
        writer.name("actionableTip");
        this.stringAdapter.toJson(writer, value_.getActionableTip());
        writer.endObject();
    }
}
