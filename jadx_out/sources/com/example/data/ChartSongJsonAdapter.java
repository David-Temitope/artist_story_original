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
/* compiled from: ChartSongJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\t\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001e"}, d2 = {"Lcom/example/data/ChartSongJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/ChartSong;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "floatAdapter", "", "longAdapter", "", "intAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nChartSongJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChartSongJsonAdapter.kt\ncom/example/data/ChartSongJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n1#2:207\n*E\n"})
/* loaded from: ChartSongJsonAdapter.class */
public final class ChartSongJsonAdapter extends JsonAdapter<ChartSong> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<ChartSong> constructorRef;
    public static final int $stable = 8;

    public ChartSongJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "title", "artistName", "artistId", "genreName", "rating", "weeklyStreams", "totalStreams", "weeksOnChart", "peakRank", "currentRank", "isPlayer", "releasedWeek", "releasedYear"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "rating");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
        JsonAdapter<Long> adapter3 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "weeklyStreams");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.longAdapter = adapter3;
        JsonAdapter<Integer> adapter4 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "weeksOnChart");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.intAdapter = adapter4;
        JsonAdapter<Boolean> adapter5 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isPlayer");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.booleanAdapter = adapter5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(").append("ChartSong").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public ChartSong m49fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String title = null;
        String artistName = null;
        String artistId = null;
        String genreName = null;
        Float rating = null;
        Long weeklyStreams = null;
        Long totalStreams = null;
        Integer weeksOnChart = null;
        Integer peakRank = null;
        Integer currentRank = 0;
        Boolean isPlayer = false;
        Integer releasedWeek = null;
        Integer releasedYear = null;
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
                        artistName = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("artistName", "artistName", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        artistId = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("artistId", "artistId", reader);
                    }
                case 4:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        genreName = str5;
                        break;
                    } else {
                        throw Util.unexpectedNull("genreName", "genreName", reader);
                    }
                case 5:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        rating = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("rating", "rating", reader);
                    }
                case 6:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        weeklyStreams = l;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyStreams", "weeklyStreams", reader);
                    }
                case 7:
                    Long l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 != null) {
                        totalStreams = l2;
                        break;
                    } else {
                        throw Util.unexpectedNull("totalStreams", "totalStreams", reader);
                    }
                case 8:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        weeksOnChart = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeksOnChart", "weeksOnChart", reader);
                    }
                case 9:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        peakRank = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("peakRank", "peakRank", reader);
                    }
                case 10:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        currentRank = num3;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("currentRank", "currentRank", reader);
                    }
                case 11:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isPlayer = bool;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("isPlayer", "isPlayer", reader);
                    }
                case 12:
                    Integer num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 != null) {
                        releasedWeek = num4;
                        break;
                    } else {
                        throw Util.unexpectedNull("releasedWeek", "releasedWeek", reader);
                    }
                case 13:
                    Integer num5 = (Integer) this.intAdapter.fromJson(reader);
                    if (num5 != null) {
                        releasedYear = num5;
                        break;
                    } else {
                        throw Util.unexpectedNull("releasedYear", "releasedYear", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -3073) {
            String str6 = id;
            if (str6 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str7 = title;
            if (str7 == null) {
                throw Util.missingProperty("title", "title", reader);
            }
            String str8 = artistName;
            if (str8 == null) {
                throw Util.missingProperty("artistName", "artistName", reader);
            }
            String str9 = artistId;
            if (str9 == null) {
                throw Util.missingProperty("artistId", "artistId", reader);
            }
            String str10 = genreName;
            if (str10 == null) {
                throw Util.missingProperty("genreName", "genreName", reader);
            }
            Float f2 = rating;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                Long l3 = weeklyStreams;
                if (l3 != null) {
                    long longValue = l3.longValue();
                    Long l4 = totalStreams;
                    if (l4 != null) {
                        long longValue2 = l4.longValue();
                        Integer num6 = weeksOnChart;
                        if (num6 != null) {
                            int intValue = num6.intValue();
                            Integer num7 = peakRank;
                            if (num7 != null) {
                                int intValue2 = num7.intValue();
                                int intValue3 = currentRank.intValue();
                                boolean booleanValue = isPlayer.booleanValue();
                                Integer num8 = releasedWeek;
                                if (num8 != null) {
                                    int intValue4 = num8.intValue();
                                    Integer num9 = releasedYear;
                                    if (num9 != null) {
                                        return new ChartSong(str6, str7, str8, str9, str10, floatValue, longValue, longValue2, intValue, intValue2, intValue3, booleanValue, intValue4, num9.intValue());
                                    }
                                    throw Util.missingProperty("releasedYear", "releasedYear", reader);
                                }
                                throw Util.missingProperty("releasedWeek", "releasedWeek", reader);
                            }
                            throw Util.missingProperty("peakRank", "peakRank", reader);
                        }
                        throw Util.missingProperty("weeksOnChart", "weeksOnChart", reader);
                    }
                    throw Util.missingProperty("totalStreams", "totalStreams", reader);
                }
                throw Util.missingProperty("weeklyStreams", "weeklyStreams", reader);
            }
            throw Util.missingProperty("rating", "rating", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = ChartSong.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Float.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[16];
        String str11 = id;
        if (str11 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str11;
        String str12 = title;
        if (str12 == null) {
            throw Util.missingProperty("title", "title", reader);
        }
        objArr[1] = str12;
        String str13 = artistName;
        if (str13 == null) {
            throw Util.missingProperty("artistName", "artistName", reader);
        }
        objArr[2] = str13;
        String str14 = artistId;
        if (str14 == null) {
            throw Util.missingProperty("artistId", "artistId", reader);
        }
        objArr[3] = str14;
        String str15 = genreName;
        if (str15 == null) {
            throw Util.missingProperty("genreName", "genreName", reader);
        }
        objArr[4] = str15;
        Float f3 = rating;
        if (f3 != null) {
            objArr[5] = Float.valueOf(f3.floatValue());
            Long l5 = weeklyStreams;
            if (l5 != null) {
                objArr[6] = Long.valueOf(l5.longValue());
                Long l6 = totalStreams;
                if (l6 != null) {
                    objArr[7] = Long.valueOf(l6.longValue());
                    Integer num10 = weeksOnChart;
                    if (num10 != null) {
                        objArr[8] = Integer.valueOf(num10.intValue());
                        Integer num11 = peakRank;
                        if (num11 != null) {
                            objArr[9] = Integer.valueOf(num11.intValue());
                            objArr[10] = currentRank;
                            objArr[11] = isPlayer;
                            Integer num12 = releasedWeek;
                            if (num12 != null) {
                                objArr[12] = Integer.valueOf(num12.intValue());
                                Integer num13 = releasedYear;
                                if (num13 != null) {
                                    objArr[13] = Integer.valueOf(num13.intValue());
                                    objArr[14] = Integer.valueOf(mask0);
                                    objArr[15] = null;
                                    ChartSong newInstance = localConstructor.newInstance(objArr);
                                    Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                                    return newInstance;
                                }
                                throw Util.missingProperty("releasedYear", "releasedYear", reader);
                            }
                            throw Util.missingProperty("releasedWeek", "releasedWeek", reader);
                        }
                        throw Util.missingProperty("peakRank", "peakRank", reader);
                    }
                    throw Util.missingProperty("weeksOnChart", "weeksOnChart", reader);
                }
                throw Util.missingProperty("totalStreams", "totalStreams", reader);
            }
            throw Util.missingProperty("weeklyStreams", "weeklyStreams", reader);
        }
        throw Util.missingProperty("rating", "rating", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable ChartSong value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.name("artistName");
        this.stringAdapter.toJson(writer, value_.getArtistName());
        writer.name("artistId");
        this.stringAdapter.toJson(writer, value_.getArtistId());
        writer.name("genreName");
        this.stringAdapter.toJson(writer, value_.getGenreName());
        writer.name("rating");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRating()));
        writer.name("weeklyStreams");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getWeeklyStreams()));
        writer.name("totalStreams");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getTotalStreams()));
        writer.name("weeksOnChart");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeeksOnChart()));
        writer.name("peakRank");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getPeakRank()));
        writer.name("currentRank");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getCurrentRank()));
        writer.name("isPlayer");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isPlayer()));
        writer.name("releasedWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getReleasedWeek()));
        writer.name("releasedYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getReleasedYear()));
        writer.endObject();
    }
}
