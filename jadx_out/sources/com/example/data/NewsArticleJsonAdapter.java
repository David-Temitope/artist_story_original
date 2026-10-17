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
/* compiled from: NewsArticleJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0019"}, d2 = {"Lcom/example/data/NewsArticleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/NewsArticle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "intAdapter", "", "nullableStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nNewsArticleJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewsArticleJsonAdapter.kt\ncom/example/data/NewsArticleJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: NewsArticleJsonAdapter.class */
public final class NewsArticleJsonAdapter extends JsonAdapter<NewsArticle> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @Nullable
    private volatile Constructor<NewsArticle> constructorRef;
    public static final int $stable = 8;

    public NewsArticleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "headline", "subtitle", "body", "author", "outlet", "category", "coverImageId", "week", "year", "relatedArtistName"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Integer> adapter2 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "week");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.intAdapter = adapter2;
        JsonAdapter<String> adapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "relatedArtistName");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.nullableStringAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("NewsArticle").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public NewsArticle m129fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String headline = null;
        String subtitle = null;
        String body = null;
        String author = null;
        String outlet = null;
        String category = null;
        String coverImageId = null;
        Integer week = null;
        Integer year = null;
        String relatedArtistName = null;
        int mask0 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    String str = (String) this.stringAdapter.fromJson(reader);
                    if (str != null) {
                        id = str;
                        break;
                    } else {
                        throw Util.unexpectedNull("id", "id", reader);
                    }
                case 1:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        headline = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("headline", "headline", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        subtitle = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("subtitle", "subtitle", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        body = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("body", "body", reader);
                    }
                case 4:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        author = str5;
                        break;
                    } else {
                        throw Util.unexpectedNull("author", "author", reader);
                    }
                case 5:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        outlet = str6;
                        break;
                    } else {
                        throw Util.unexpectedNull("outlet", "outlet", reader);
                    }
                case 6:
                    String str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 != null) {
                        category = str7;
                        break;
                    } else {
                        throw Util.unexpectedNull("category", "category", reader);
                    }
                case 7:
                    String str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 != null) {
                        coverImageId = str8;
                        break;
                    } else {
                        throw Util.unexpectedNull("coverImageId", "coverImageId", reader);
                    }
                case 8:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        week = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("week", "week", reader);
                    }
                case 9:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        year = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("year", "year", reader);
                    }
                case 10:
                    relatedArtistName = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -1025;
                    break;
            }
        }
        reader.endObject();
        if (mask0 == -1025) {
            String str9 = id;
            if (str9 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str10 = headline;
            if (str10 == null) {
                throw Util.missingProperty("headline", "headline", reader);
            }
            String str11 = subtitle;
            if (str11 == null) {
                throw Util.missingProperty("subtitle", "subtitle", reader);
            }
            String str12 = body;
            if (str12 == null) {
                throw Util.missingProperty("body", "body", reader);
            }
            String str13 = author;
            if (str13 == null) {
                throw Util.missingProperty("author", "author", reader);
            }
            String str14 = outlet;
            if (str14 == null) {
                throw Util.missingProperty("outlet", "outlet", reader);
            }
            String str15 = category;
            if (str15 == null) {
                throw Util.missingProperty("category", "category", reader);
            }
            String str16 = coverImageId;
            if (str16 == null) {
                throw Util.missingProperty("coverImageId", "coverImageId", reader);
            }
            Integer num3 = week;
            if (num3 != null) {
                int intValue = num3.intValue();
                Integer num4 = year;
                if (num4 != null) {
                    return new NewsArticle(str9, str10, str11, str12, str13, str14, str15, str16, intValue, num4.intValue(), relatedArtistName);
                }
                throw Util.missingProperty("year", "year", reader);
            }
            throw Util.missingProperty("week", "week", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = NewsArticle.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[13];
        String str17 = id;
        if (str17 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str17;
        String str18 = headline;
        if (str18 == null) {
            throw Util.missingProperty("headline", "headline", reader);
        }
        objArr[1] = str18;
        String str19 = subtitle;
        if (str19 == null) {
            throw Util.missingProperty("subtitle", "subtitle", reader);
        }
        objArr[2] = str19;
        String str20 = body;
        if (str20 == null) {
            throw Util.missingProperty("body", "body", reader);
        }
        objArr[3] = str20;
        String str21 = author;
        if (str21 == null) {
            throw Util.missingProperty("author", "author", reader);
        }
        objArr[4] = str21;
        String str22 = outlet;
        if (str22 == null) {
            throw Util.missingProperty("outlet", "outlet", reader);
        }
        objArr[5] = str22;
        String str23 = category;
        if (str23 == null) {
            throw Util.missingProperty("category", "category", reader);
        }
        objArr[6] = str23;
        String str24 = coverImageId;
        if (str24 == null) {
            throw Util.missingProperty("coverImageId", "coverImageId", reader);
        }
        objArr[7] = str24;
        Integer num5 = week;
        if (num5 != null) {
            objArr[8] = Integer.valueOf(num5.intValue());
            Integer num6 = year;
            if (num6 != null) {
                objArr[9] = Integer.valueOf(num6.intValue());
                objArr[10] = relatedArtistName;
                objArr[11] = Integer.valueOf(mask0);
                objArr[12] = null;
                NewsArticle newInstance = localConstructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw Util.missingProperty("year", "year", reader);
        }
        throw Util.missingProperty("week", "week", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable NewsArticle value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("headline");
        this.stringAdapter.toJson(writer, value_.getHeadline());
        writer.name("subtitle");
        this.stringAdapter.toJson(writer, value_.getSubtitle());
        writer.name("body");
        this.stringAdapter.toJson(writer, value_.getBody());
        writer.name("author");
        this.stringAdapter.toJson(writer, value_.getAuthor());
        writer.name("outlet");
        this.stringAdapter.toJson(writer, value_.getOutlet());
        writer.name("category");
        this.stringAdapter.toJson(writer, value_.getCategory());
        writer.name("coverImageId");
        this.stringAdapter.toJson(writer, value_.getCoverImageId());
        writer.name("week");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeek()));
        writer.name("year");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYear()));
        writer.name("relatedArtistName");
        this.nullableStringAdapter.toJson(writer, value_.getRelatedArtistName());
        writer.endObject();
    }
}
