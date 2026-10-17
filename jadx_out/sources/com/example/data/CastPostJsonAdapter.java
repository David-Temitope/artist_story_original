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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CastPostJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\t\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001d"}, d2 = {"Lcom/example/data/CastPostJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/CastPost;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "longAdapter", "", "intAdapter", "", "booleanAdapter", "", "nullableStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: CastPostJsonAdapter.class */
public final class CastPostJsonAdapter extends JsonAdapter<CastPost> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @Nullable
    private volatile Constructor<CastPost> constructorRef;
    public static final int $stable = 8;

    public CastPostJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "authorName", "authorHandle", "content", "likes", "reposts", "commentsCount", "week", "year", "isByPlayer", "isLikedByPlayer", "imageRes"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Long> adapter2 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "likes");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.longAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "week");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
        JsonAdapter<Boolean> adapter4 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isByPlayer");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.booleanAdapter = adapter4;
        JsonAdapter<String> adapter5 = moshi.adapter(String.class, SetsKt.emptySet(), "imageRes");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.nullableStringAdapter = adapter5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(").append("CastPost").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public CastPost m46fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String authorName = null;
        String authorHandle = null;
        String content = null;
        Long likes = 0L;
        Long reposts = 0L;
        Long commentsCount = 0L;
        Integer week = null;
        Integer year = null;
        Boolean isByPlayer = false;
        Boolean isLikedByPlayer = false;
        String imageRes = null;
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
                        authorName = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("authorName", "authorName", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        authorHandle = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("authorHandle", "authorHandle", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        content = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("content", "content", reader);
                    }
                case 4:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        likes = l;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("likes", "likes", reader);
                    }
                case 5:
                    Long l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 != null) {
                        reposts = l2;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("reposts", "reposts", reader);
                    }
                case 6:
                    Long l3 = (Long) this.longAdapter.fromJson(reader);
                    if (l3 != null) {
                        commentsCount = l3;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("commentsCount", "commentsCount", reader);
                    }
                case 7:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        week = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("week", "week", reader);
                    }
                case 8:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        year = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("year", "year", reader);
                    }
                case 9:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isByPlayer = bool;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("isByPlayer", "isByPlayer", reader);
                    }
                case 10:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        isLikedByPlayer = bool2;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("isLikedByPlayer", "isLikedByPlayer", reader);
                    }
                case 11:
                    imageRes = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -2049;
                    break;
            }
        }
        reader.endObject();
        if (mask0 == -3697) {
            String str5 = id;
            if (str5 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str6 = authorName;
            if (str6 == null) {
                throw Util.missingProperty("authorName", "authorName", reader);
            }
            String str7 = authorHandle;
            if (str7 == null) {
                throw Util.missingProperty("authorHandle", "authorHandle", reader);
            }
            String str8 = content;
            if (str8 == null) {
                throw Util.missingProperty("content", "content", reader);
            }
            long longValue = likes.longValue();
            long longValue2 = reposts.longValue();
            long longValue3 = commentsCount.longValue();
            Integer num3 = week;
            if (num3 != null) {
                int intValue = num3.intValue();
                Integer num4 = year;
                if (num4 != null) {
                    return new CastPost(str5, str6, str7, str8, longValue, longValue2, longValue3, intValue, num4.intValue(), isByPlayer.booleanValue(), isLikedByPlayer.booleanValue(), imageRes);
                }
                throw Util.missingProperty("year", "year", reader);
            }
            throw Util.missingProperty("week", "week", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = CastPost.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[14];
        String str9 = id;
        if (str9 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str9;
        String str10 = authorName;
        if (str10 == null) {
            throw Util.missingProperty("authorName", "authorName", reader);
        }
        objArr[1] = str10;
        String str11 = authorHandle;
        if (str11 == null) {
            throw Util.missingProperty("authorHandle", "authorHandle", reader);
        }
        objArr[2] = str11;
        String str12 = content;
        if (str12 == null) {
            throw Util.missingProperty("content", "content", reader);
        }
        objArr[3] = str12;
        objArr[4] = likes;
        objArr[5] = reposts;
        objArr[6] = commentsCount;
        Integer num5 = week;
        if (num5 != null) {
            objArr[7] = Integer.valueOf(num5.intValue());
            Integer num6 = year;
            if (num6 != null) {
                objArr[8] = Integer.valueOf(num6.intValue());
                objArr[9] = isByPlayer;
                objArr[10] = isLikedByPlayer;
                objArr[11] = imageRes;
                objArr[12] = Integer.valueOf(mask0);
                objArr[13] = null;
                CastPost newInstance = localConstructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw Util.missingProperty("year", "year", reader);
        }
        throw Util.missingProperty("week", "week", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable CastPost value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("authorName");
        this.stringAdapter.toJson(writer, value_.getAuthorName());
        writer.name("authorHandle");
        this.stringAdapter.toJson(writer, value_.getAuthorHandle());
        writer.name("content");
        this.stringAdapter.toJson(writer, value_.getContent());
        writer.name("likes");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getLikes()));
        writer.name("reposts");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getReposts()));
        writer.name("commentsCount");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getCommentsCount()));
        writer.name("week");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeek()));
        writer.name("year");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYear()));
        writer.name("isByPlayer");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isByPlayer()));
        writer.name("isLikedByPlayer");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isLikedByPlayer()));
        writer.name("imageRes");
        this.nullableStringAdapter.toJson(writer, value_.getImageRes());
        writer.endObject();
    }
}
