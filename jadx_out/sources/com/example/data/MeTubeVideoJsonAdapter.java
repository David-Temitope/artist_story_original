package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MeTubeVideoJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\t\n��\n\u0002\u0010 \n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001f"}, d2 = {"Lcom/example/data/MeTubeVideoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/MeTubeVideo;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "longAdapter", "", "listOfStringAdapter", "", "doubleAdapter", "", "intAdapter", "", "nullableStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: MeTubeVideoJsonAdapter.class */
public final class MeTubeVideoJsonAdapter extends JsonAdapter<MeTubeVideo> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @Nullable
    private volatile Constructor<MeTubeVideo> constructorRef;
    public static final int $stable = 8;

    public MeTubeVideoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "title", "type", "views", "likes", "comments", "revenueEarned", "weekPublished", "yearPublished", "thumbnailId", "artistName"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Long> adapter2 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "views");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.longAdapter = adapter2;
        JsonAdapter<List<String>> adapter3 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "comments");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.listOfStringAdapter = adapter3;
        JsonAdapter<Double> adapter4 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "revenueEarned");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.doubleAdapter = adapter4;
        JsonAdapter<Integer> adapter5 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "weekPublished");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.intAdapter = adapter5;
        JsonAdapter<String> adapter6 = moshi.adapter(String.class, SetsKt.emptySet(), "artistName");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.nullableStringAdapter = adapter6;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("MeTubeVideo").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public MeTubeVideo m117fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String title = null;
        String type = null;
        Long views = null;
        Long likes = null;
        List comments = null;
        Double revenueEarned = Double.valueOf(0.0d);
        Integer weekPublished = null;
        Integer yearPublished = null;
        String thumbnailId = null;
        String artistName = null;
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
                        title = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("title", "title", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        type = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("type", "type", reader);
                    }
                case 3:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        views = l;
                        break;
                    } else {
                        throw Util.unexpectedNull("views", "views", reader);
                    }
                case 4:
                    Long l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 != null) {
                        likes = l2;
                        break;
                    } else {
                        throw Util.unexpectedNull("likes", "likes", reader);
                    }
                case 5:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        comments = list;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("comments", "comments", reader);
                    }
                case 6:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        revenueEarned = d;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("revenueEarned", "revenueEarned", reader);
                    }
                case 7:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        weekPublished = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("weekPublished", "weekPublished", reader);
                    }
                case 8:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        yearPublished = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("yearPublished", "yearPublished", reader);
                    }
                case 9:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        thumbnailId = str4;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("thumbnailId", "thumbnailId", reader);
                    }
                case 10:
                    artistName = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -1025;
                    break;
            }
        }
        reader.endObject();
        if (mask0 == -1633) {
            String str5 = id;
            if (str5 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str6 = title;
            if (str6 == null) {
                throw Util.missingProperty("title", "title", reader);
            }
            String str7 = type;
            if (str7 == null) {
                throw Util.missingProperty("type", "type", reader);
            }
            Long l3 = views;
            if (l3 != null) {
                long longValue = l3.longValue();
                Long l4 = likes;
                if (l4 != null) {
                    long longValue2 = l4.longValue();
                    List list2 = comments;
                    Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                    double doubleValue = revenueEarned.doubleValue();
                    Integer num3 = weekPublished;
                    if (num3 != null) {
                        int intValue = num3.intValue();
                        Integer num4 = yearPublished;
                        if (num4 != null) {
                            int intValue2 = num4.intValue();
                            String str8 = thumbnailId;
                            Intrinsics.checkNotNull(str8, "null cannot be cast to non-null type kotlin.String");
                            return new MeTubeVideo(str5, str6, str7, longValue, longValue2, list2, doubleValue, intValue, intValue2, str8, artistName);
                        }
                        throw Util.missingProperty("yearPublished", "yearPublished", reader);
                    }
                    throw Util.missingProperty("weekPublished", "weekPublished", reader);
                }
                throw Util.missingProperty("likes", "likes", reader);
            }
            throw Util.missingProperty("views", "views", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = MeTubeVideo.class.getDeclaredConstructor(String.class, String.class, String.class, Long.TYPE, Long.TYPE, List.class, Double.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[13];
        String str9 = id;
        if (str9 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str9;
        String str10 = title;
        if (str10 == null) {
            throw Util.missingProperty("title", "title", reader);
        }
        objArr[1] = str10;
        String str11 = type;
        if (str11 == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        objArr[2] = str11;
        Long l5 = views;
        if (l5 != null) {
            objArr[3] = Long.valueOf(l5.longValue());
            Long l6 = likes;
            if (l6 != null) {
                objArr[4] = Long.valueOf(l6.longValue());
                objArr[5] = comments;
                objArr[6] = revenueEarned;
                Integer num5 = weekPublished;
                if (num5 != null) {
                    objArr[7] = Integer.valueOf(num5.intValue());
                    Integer num6 = yearPublished;
                    if (num6 != null) {
                        objArr[8] = Integer.valueOf(num6.intValue());
                        objArr[9] = thumbnailId;
                        objArr[10] = artistName;
                        objArr[11] = Integer.valueOf(mask0);
                        objArr[12] = null;
                        MeTubeVideo newInstance = localConstructor.newInstance(objArr);
                        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                        return newInstance;
                    }
                    throw Util.missingProperty("yearPublished", "yearPublished", reader);
                }
                throw Util.missingProperty("weekPublished", "weekPublished", reader);
            }
            throw Util.missingProperty("likes", "likes", reader);
        }
        throw Util.missingProperty("views", "views", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable MeTubeVideo value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("views");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getViews()));
        writer.name("likes");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getLikes()));
        writer.name("comments");
        this.listOfStringAdapter.toJson(writer, value_.getComments());
        writer.name("revenueEarned");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getRevenueEarned()));
        writer.name("weekPublished");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeekPublished()));
        writer.name("yearPublished");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYearPublished()));
        writer.name("thumbnailId");
        this.stringAdapter.toJson(writer, value_.getThumbnailId());
        writer.name("artistName");
        this.nullableStringAdapter.toJson(writer, value_.getArtistName());
        writer.endObject();
    }
}
