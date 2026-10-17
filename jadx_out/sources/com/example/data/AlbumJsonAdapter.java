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
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AlbumJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010 \n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\t\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001X\u0082\u0004¢\u0006\u0002\n��R \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u00180\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n��¨\u0006%"}, d2 = {"Lcom/example/data/AlbumJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/Album;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "booleanAdapter", "", "listOfStringAdapter", "", "intAdapter", "", "floatAdapter", "", "longAdapter", "", "doubleAdapter", "", "mapOfStringLongAdapter", "", "nullableStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nAlbumJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlbumJsonAdapter.kt\ncom/example/data/AlbumJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,295:1\n1#2:296\n*E\n"})
/* loaded from: AlbumJsonAdapter.class */
public final class AlbumJsonAdapter extends JsonAdapter<Album> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Map<String, Long>> mapOfStringLongAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @Nullable
    private volatile Constructor<Album> constructorRef;
    public static final int $stable = 8;

    public AlbumJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "title", "isEP", "songIds", "weekCreated", "yearCreated", "rating", "criticalAcclaim", "totalStreams", "sales", "price", "isReleased", "isUploadedMap", "hype", "weeksSinceRelease", "albumCutEarned", "marketingTier", "coverArt", "reviews"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Boolean> adapter2 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isEP");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.booleanAdapter = adapter2;
        JsonAdapter<List<String>> adapter3 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "songIds");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.listOfStringAdapter = adapter3;
        JsonAdapter<Integer> adapter4 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "weekCreated");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.intAdapter = adapter4;
        JsonAdapter<Float> adapter5 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "rating");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.floatAdapter = adapter5;
        JsonAdapter<Long> adapter6 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "totalStreams");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.longAdapter = adapter6;
        JsonAdapter<Double> adapter7 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "price");
        Intrinsics.checkNotNullExpressionValue(adapter7, "adapter(...)");
        this.doubleAdapter = adapter7;
        JsonAdapter<Map<String, Long>> adapter8 = moshi.adapter(Types.newParameterizedType(Map.class, new Type[]{String.class, Long.class}), SetsKt.emptySet(), "isUploadedMap");
        Intrinsics.checkNotNullExpressionValue(adapter8, "adapter(...)");
        this.mapOfStringLongAdapter = adapter8;
        JsonAdapter<String> adapter9 = moshi.adapter(String.class, SetsKt.emptySet(), "coverArt");
        Intrinsics.checkNotNullExpressionValue(adapter9, "adapter(...)");
        this.nullableStringAdapter = adapter9;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(27);
        sb.append("GeneratedJsonAdapter(").append("Album").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public Album m11fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String title = null;
        Boolean isEP = null;
        List songIds = null;
        Integer weekCreated = null;
        Integer yearCreated = null;
        Float rating = null;
        Float criticalAcclaim = null;
        Long totalStreams = 0L;
        Long sales = 0L;
        Double price = Double.valueOf(0.0d);
        Boolean isReleased = false;
        Map isUploadedMap = null;
        Float hype = Float.valueOf(0.0f);
        Integer weeksSinceRelease = 0;
        Double albumCutEarned = Double.valueOf(0.0d);
        String marketingTier = null;
        String coverArt = null;
        List reviews = null;
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
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isEP = bool;
                        break;
                    } else {
                        throw Util.unexpectedNull("isEP", "isEP", reader);
                    }
                case 3:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        songIds = list;
                        break;
                    } else {
                        throw Util.unexpectedNull("songIds", "songIds", reader);
                    }
                case 4:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        weekCreated = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("weekCreated", "weekCreated", reader);
                    }
                case 5:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        yearCreated = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("yearCreated", "yearCreated", reader);
                    }
                case 6:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        rating = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("rating", "rating", reader);
                    }
                case 7:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        criticalAcclaim = f2;
                        break;
                    } else {
                        throw Util.unexpectedNull("criticalAcclaim", "criticalAcclaim", reader);
                    }
                case 8:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        totalStreams = l;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("totalStreams", "totalStreams", reader);
                    }
                case 9:
                    Long l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 != null) {
                        sales = l2;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("sales", "sales", reader);
                    }
                case 10:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        price = d;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("price", "price", reader);
                    }
                case 11:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        isReleased = bool2;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("isReleased", "isReleased", reader);
                    }
                case 12:
                    Map map = (Map) this.mapOfStringLongAdapter.fromJson(reader);
                    if (map != null) {
                        isUploadedMap = map;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("isUploadedMap", "isUploadedMap", reader);
                    }
                case 13:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 != null) {
                        hype = f3;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("hype", "hype", reader);
                    }
                case 14:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        weeksSinceRelease = num3;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeksSinceRelease", "weeksSinceRelease", reader);
                    }
                case 15:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        albumCutEarned = d2;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("albumCutEarned", "albumCutEarned", reader);
                    }
                case 16:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        marketingTier = str3;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("marketingTier", "marketingTier", reader);
                    }
                case 17:
                    coverArt = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -131073;
                    break;
                case 18:
                    List list2 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list2 != null) {
                        reviews = list2;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("reviews", "reviews", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -524033) {
            String str4 = id;
            if (str4 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str5 = title;
            if (str5 == null) {
                throw Util.missingProperty("title", "title", reader);
            }
            Boolean bool3 = isEP;
            if (bool3 != null) {
                boolean booleanValue = bool3.booleanValue();
                List list3 = songIds;
                if (list3 == null) {
                    throw Util.missingProperty("songIds", "songIds", reader);
                }
                Integer num4 = weekCreated;
                if (num4 != null) {
                    int intValue = num4.intValue();
                    Integer num5 = yearCreated;
                    if (num5 != null) {
                        int intValue2 = num5.intValue();
                        Float f4 = rating;
                        if (f4 != null) {
                            float floatValue = f4.floatValue();
                            Float f5 = criticalAcclaim;
                            if (f5 != null) {
                                float floatValue2 = f5.floatValue();
                                long longValue = totalStreams.longValue();
                                long longValue2 = sales.longValue();
                                double doubleValue = price.doubleValue();
                                boolean booleanValue2 = isReleased.booleanValue();
                                Map map2 = isUploadedMap;
                                Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Long>");
                                float floatValue3 = hype.floatValue();
                                int intValue3 = weeksSinceRelease.intValue();
                                double doubleValue2 = albumCutEarned.doubleValue();
                                String str6 = marketingTier;
                                Intrinsics.checkNotNull(str6, "null cannot be cast to non-null type kotlin.String");
                                List list4 = reviews;
                                Intrinsics.checkNotNull(list4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                return new Album(str4, str5, booleanValue, list3, intValue, intValue2, floatValue, floatValue2, longValue, longValue2, doubleValue, booleanValue2, map2, floatValue3, intValue3, doubleValue2, str6, coverArt, list4);
                            }
                            throw Util.missingProperty("criticalAcclaim", "criticalAcclaim", reader);
                        }
                        throw Util.missingProperty("rating", "rating", reader);
                    }
                    throw Util.missingProperty("yearCreated", "yearCreated", reader);
                }
                throw Util.missingProperty("weekCreated", "weekCreated", reader);
            }
            throw Util.missingProperty("isEP", "isEP", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = Album.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, List.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Long.TYPE, Long.TYPE, Double.TYPE, Boolean.TYPE, Map.class, Float.TYPE, Integer.TYPE, Double.TYPE, String.class, String.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[21];
        String str7 = id;
        if (str7 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str7;
        String str8 = title;
        if (str8 == null) {
            throw Util.missingProperty("title", "title", reader);
        }
        objArr[1] = str8;
        Boolean bool4 = isEP;
        if (bool4 != null) {
            objArr[2] = Boolean.valueOf(bool4.booleanValue());
            List list5 = songIds;
            if (list5 == null) {
                throw Util.missingProperty("songIds", "songIds", reader);
            }
            objArr[3] = list5;
            Integer num6 = weekCreated;
            if (num6 != null) {
                objArr[4] = Integer.valueOf(num6.intValue());
                Integer num7 = yearCreated;
                if (num7 != null) {
                    objArr[5] = Integer.valueOf(num7.intValue());
                    Float f6 = rating;
                    if (f6 != null) {
                        objArr[6] = Float.valueOf(f6.floatValue());
                        Float f7 = criticalAcclaim;
                        if (f7 != null) {
                            objArr[7] = Float.valueOf(f7.floatValue());
                            objArr[8] = totalStreams;
                            objArr[9] = sales;
                            objArr[10] = price;
                            objArr[11] = isReleased;
                            objArr[12] = isUploadedMap;
                            objArr[13] = hype;
                            objArr[14] = weeksSinceRelease;
                            objArr[15] = albumCutEarned;
                            objArr[16] = marketingTier;
                            objArr[17] = coverArt;
                            objArr[18] = reviews;
                            objArr[19] = Integer.valueOf(mask0);
                            objArr[20] = null;
                            Album newInstance = localConstructor.newInstance(objArr);
                            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                            return newInstance;
                        }
                        throw Util.missingProperty("criticalAcclaim", "criticalAcclaim", reader);
                    }
                    throw Util.missingProperty("rating", "rating", reader);
                }
                throw Util.missingProperty("yearCreated", "yearCreated", reader);
            }
            throw Util.missingProperty("weekCreated", "weekCreated", reader);
        }
        throw Util.missingProperty("isEP", "isEP", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable Album value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.name("isEP");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isEP()));
        writer.name("songIds");
        this.listOfStringAdapter.toJson(writer, value_.getSongIds());
        writer.name("weekCreated");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeekCreated()));
        writer.name("yearCreated");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYearCreated()));
        writer.name("rating");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRating()));
        writer.name("criticalAcclaim");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCriticalAcclaim()));
        writer.name("totalStreams");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getTotalStreams()));
        writer.name("sales");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getSales()));
        writer.name("price");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getPrice()));
        writer.name("isReleased");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isReleased()));
        writer.name("isUploadedMap");
        this.mapOfStringLongAdapter.toJson(writer, value_.isUploadedMap());
        writer.name("hype");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getHype()));
        writer.name("weeksSinceRelease");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeeksSinceRelease()));
        writer.name("albumCutEarned");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getAlbumCutEarned()));
        writer.name("marketingTier");
        this.stringAdapter.toJson(writer, value_.getMarketingTier());
        writer.name("coverArt");
        this.nullableStringAdapter.toJson(writer, value_.getCoverArt());
        writer.name("reviews");
        this.listOfStringAdapter.toJson(writer, value_.getReviews());
        writer.endObject();
    }
}
