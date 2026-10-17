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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SongJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010 \n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n��R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00110\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n��¨\u0006%"}, d2 = {"Lcom/example/data/SongJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/Song;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "nullableStringAdapter", "floatAdapter", "", "mapOfStringLongAdapter", "", "", "longAdapter", "intAdapter", "", "booleanAdapter", "", "listOfStringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: SongJsonAdapter.class */
public final class SongJsonAdapter extends JsonAdapter<Song> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Map<String, Long>> mapOfStringLongAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @Nullable
    private volatile Constructor<Song> constructorRef;
    public static final int $stable = 8;

    public SongJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "title", "genreId", "budget", "producerId", "rating", "isUploadedMap", "totalStreams", "videoTier", "weekCreated", "yearCreated", "licenseType", "promoWeeksLeft", "promoWeeklyBoost", "playlistsCount", "isGlobal", "weeksSinceRelease", "peakStreams", "isViral", "isReleased", "hype", "weeksUntilRelease", "initialHypeWeeksSet", "soundEngineerQuality", "mixingStyle", "backingVocalists", "studioDecor", "producerTier", "coverArt", "isCopyrightRegistered", "hasSampleClearance", "audienceFeedback"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "budget");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<String> adapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "producerId");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.nullableStringAdapter = adapter3;
        JsonAdapter<Float> adapter4 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "rating");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.floatAdapter = adapter4;
        JsonAdapter<Map<String, Long>> adapter5 = moshi.adapter(Types.newParameterizedType(Map.class, new Type[]{String.class, Long.class}), SetsKt.emptySet(), "isUploadedMap");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.mapOfStringLongAdapter = adapter5;
        JsonAdapter<Long> adapter6 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "totalStreams");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.longAdapter = adapter6;
        JsonAdapter<Integer> adapter7 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "weekCreated");
        Intrinsics.checkNotNullExpressionValue(adapter7, "adapter(...)");
        this.intAdapter = adapter7;
        JsonAdapter<Boolean> adapter8 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isGlobal");
        Intrinsics.checkNotNullExpressionValue(adapter8, "adapter(...)");
        this.booleanAdapter = adapter8;
        JsonAdapter<List<String>> adapter9 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "audienceFeedback");
        Intrinsics.checkNotNullExpressionValue(adapter9, "adapter(...)");
        this.listOfStringAdapter = adapter9;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("GeneratedJsonAdapter(").append("Song").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public Song m158fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String title = null;
        String genreId = null;
        Double budget = null;
        String producerId = null;
        Float rating = null;
        Map isUploadedMap = null;
        Long totalStreams = 0L;
        String videoTier = null;
        Integer weekCreated = null;
        Integer yearCreated = null;
        String licenseType = null;
        Integer promoWeeksLeft = 0;
        Float promoWeeklyBoost = Float.valueOf(0.0f);
        Integer playlistsCount = 0;
        Boolean isGlobal = false;
        Integer weeksSinceRelease = 0;
        Long peakStreams = 0L;
        Boolean isViral = false;
        Boolean isReleased = false;
        Float hype = Float.valueOf(0.0f);
        Integer weeksUntilRelease = 0;
        Integer initialHypeWeeksSet = 0;
        String soundEngineerQuality = null;
        String mixingStyle = null;
        String backingVocalists = null;
        String studioDecor = null;
        String producerTier = null;
        String coverArt = null;
        Boolean isCopyrightRegistered = false;
        Boolean hasSampleClearance = false;
        List audienceFeedback = null;
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
                        genreId = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("genreId", "genreId", reader);
                    }
                case 3:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        budget = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("budget", "budget", reader);
                    }
                case 4:
                    producerId = (String) this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        rating = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("rating", "rating", reader);
                    }
                case 6:
                    Map map = (Map) this.mapOfStringLongAdapter.fromJson(reader);
                    if (map != null) {
                        isUploadedMap = map;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("isUploadedMap", "isUploadedMap", reader);
                    }
                case 7:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        totalStreams = l;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("totalStreams", "totalStreams", reader);
                    }
                case 8:
                    videoTier = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -257;
                    break;
                case 9:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        weekCreated = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("weekCreated", "weekCreated", reader);
                    }
                case 10:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        yearCreated = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("yearCreated", "yearCreated", reader);
                    }
                case 11:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        licenseType = str4;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("licenseType", "licenseType", reader);
                    }
                case 12:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        promoWeeksLeft = num3;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("promoWeeksLeft", "promoWeeksLeft", reader);
                    }
                case 13:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        promoWeeklyBoost = f2;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("promoWeeklyBoost", "promoWeeklyBoost", reader);
                    }
                case 14:
                    Integer num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 != null) {
                        playlistsCount = num4;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("playlistsCount", "playlistsCount", reader);
                    }
                case 15:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isGlobal = bool;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("isGlobal", "isGlobal", reader);
                    }
                case 16:
                    Integer num5 = (Integer) this.intAdapter.fromJson(reader);
                    if (num5 != null) {
                        weeksSinceRelease = num5;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeksSinceRelease", "weeksSinceRelease", reader);
                    }
                case 17:
                    Long l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 != null) {
                        peakStreams = l2;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("peakStreams", "peakStreams", reader);
                    }
                case 18:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        isViral = bool2;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("isViral", "isViral", reader);
                    }
                case 19:
                    Boolean bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 != null) {
                        isReleased = bool3;
                        mask0 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("isReleased", "isReleased", reader);
                    }
                case 20:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 != null) {
                        hype = f3;
                        mask0 &= -1048577;
                        break;
                    } else {
                        throw Util.unexpectedNull("hype", "hype", reader);
                    }
                case 21:
                    Integer num6 = (Integer) this.intAdapter.fromJson(reader);
                    if (num6 != null) {
                        weeksUntilRelease = num6;
                        mask0 &= -2097153;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeksUntilRelease", "weeksUntilRelease", reader);
                    }
                case 22:
                    Integer num7 = (Integer) this.intAdapter.fromJson(reader);
                    if (num7 != null) {
                        initialHypeWeeksSet = num7;
                        mask0 &= -4194305;
                        break;
                    } else {
                        throw Util.unexpectedNull("initialHypeWeeksSet", "initialHypeWeeksSet", reader);
                    }
                case 23:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        soundEngineerQuality = str5;
                        mask0 &= -8388609;
                        break;
                    } else {
                        throw Util.unexpectedNull("soundEngineerQuality", "soundEngineerQuality", reader);
                    }
                case 24:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        mixingStyle = str6;
                        mask0 &= -16777217;
                        break;
                    } else {
                        throw Util.unexpectedNull("mixingStyle", "mixingStyle", reader);
                    }
                case 25:
                    String str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 != null) {
                        backingVocalists = str7;
                        mask0 &= -33554433;
                        break;
                    } else {
                        throw Util.unexpectedNull("backingVocalists", "backingVocalists", reader);
                    }
                case 26:
                    String str8 = (String) this.stringAdapter.fromJson(reader);
                    if (str8 != null) {
                        studioDecor = str8;
                        mask0 &= -67108865;
                        break;
                    } else {
                        throw Util.unexpectedNull("studioDecor", "studioDecor", reader);
                    }
                case 27:
                    String str9 = (String) this.stringAdapter.fromJson(reader);
                    if (str9 != null) {
                        producerTier = str9;
                        mask0 &= -134217729;
                        break;
                    } else {
                        throw Util.unexpectedNull("producerTier", "producerTier", reader);
                    }
                case 28:
                    coverArt = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -268435457;
                    break;
                case 29:
                    Boolean bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 != null) {
                        isCopyrightRegistered = bool4;
                        mask0 &= -536870913;
                        break;
                    } else {
                        throw Util.unexpectedNull("isCopyrightRegistered", "isCopyrightRegistered", reader);
                    }
                case 30:
                    Boolean bool5 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool5 != null) {
                        hasSampleClearance = bool5;
                        mask0 &= -1073741825;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasSampleClearance", "hasSampleClearance", reader);
                    }
                case 31:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        audienceFeedback = list;
                        mask0 &= Integer.MAX_VALUE;
                        break;
                    } else {
                        throw Util.unexpectedNull("audienceFeedback", "audienceFeedback", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == 1599) {
            String str10 = id;
            if (str10 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str11 = title;
            if (str11 == null) {
                throw Util.missingProperty("title", "title", reader);
            }
            String str12 = genreId;
            if (str12 == null) {
                throw Util.missingProperty("genreId", "genreId", reader);
            }
            Double d2 = budget;
            if (d2 != null) {
                double doubleValue = d2.doubleValue();
                String str13 = producerId;
                Float f4 = rating;
                if (f4 != null) {
                    float floatValue = f4.floatValue();
                    Map map2 = isUploadedMap;
                    Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Long>");
                    long longValue = totalStreams.longValue();
                    String str14 = videoTier;
                    Integer num8 = weekCreated;
                    if (num8 != null) {
                        int intValue = num8.intValue();
                        Integer num9 = yearCreated;
                        if (num9 != null) {
                            int intValue2 = num9.intValue();
                            String str15 = licenseType;
                            Intrinsics.checkNotNull(str15, "null cannot be cast to non-null type kotlin.String");
                            int intValue3 = promoWeeksLeft.intValue();
                            float floatValue2 = promoWeeklyBoost.floatValue();
                            int intValue4 = playlistsCount.intValue();
                            boolean booleanValue = isGlobal.booleanValue();
                            int intValue5 = weeksSinceRelease.intValue();
                            long longValue2 = peakStreams.longValue();
                            boolean booleanValue2 = isViral.booleanValue();
                            boolean booleanValue3 = isReleased.booleanValue();
                            float floatValue3 = hype.floatValue();
                            int intValue6 = weeksUntilRelease.intValue();
                            int intValue7 = initialHypeWeeksSet.intValue();
                            String str16 = soundEngineerQuality;
                            Intrinsics.checkNotNull(str16, "null cannot be cast to non-null type kotlin.String");
                            String str17 = mixingStyle;
                            Intrinsics.checkNotNull(str17, "null cannot be cast to non-null type kotlin.String");
                            String str18 = backingVocalists;
                            Intrinsics.checkNotNull(str18, "null cannot be cast to non-null type kotlin.String");
                            String str19 = studioDecor;
                            Intrinsics.checkNotNull(str19, "null cannot be cast to non-null type kotlin.String");
                            String str20 = producerTier;
                            Intrinsics.checkNotNull(str20, "null cannot be cast to non-null type kotlin.String");
                            boolean booleanValue4 = isCopyrightRegistered.booleanValue();
                            boolean booleanValue5 = hasSampleClearance.booleanValue();
                            List list2 = audienceFeedback;
                            Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                            return new Song(str10, str11, str12, doubleValue, str13, floatValue, map2, longValue, str14, intValue, intValue2, str15, intValue3, floatValue2, intValue4, booleanValue, intValue5, longValue2, booleanValue2, booleanValue3, floatValue3, intValue6, intValue7, str16, str17, str18, str19, str20, coverArt, booleanValue4, booleanValue5, list2);
                        }
                        throw Util.missingProperty("yearCreated", "yearCreated", reader);
                    }
                    throw Util.missingProperty("weekCreated", "weekCreated", reader);
                }
                throw Util.missingProperty("rating", "rating", reader);
            }
            throw Util.missingProperty("budget", "budget", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = Song.class.getDeclaredConstructor(String.class, String.class, String.class, Double.TYPE, String.class, Float.TYPE, Map.class, Long.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Float.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Long.TYPE, Boolean.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Boolean.TYPE, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[34];
        String str21 = id;
        if (str21 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str21;
        String str22 = title;
        if (str22 == null) {
            throw Util.missingProperty("title", "title", reader);
        }
        objArr[1] = str22;
        String str23 = genreId;
        if (str23 == null) {
            throw Util.missingProperty("genreId", "genreId", reader);
        }
        objArr[2] = str23;
        Double d3 = budget;
        if (d3 != null) {
            objArr[3] = Double.valueOf(d3.doubleValue());
            objArr[4] = producerId;
            Float f5 = rating;
            if (f5 != null) {
                objArr[5] = Float.valueOf(f5.floatValue());
                objArr[6] = isUploadedMap;
                objArr[7] = totalStreams;
                objArr[8] = videoTier;
                Integer num10 = weekCreated;
                if (num10 != null) {
                    objArr[9] = Integer.valueOf(num10.intValue());
                    Integer num11 = yearCreated;
                    if (num11 != null) {
                        objArr[10] = Integer.valueOf(num11.intValue());
                        objArr[11] = licenseType;
                        objArr[12] = promoWeeksLeft;
                        objArr[13] = promoWeeklyBoost;
                        objArr[14] = playlistsCount;
                        objArr[15] = isGlobal;
                        objArr[16] = weeksSinceRelease;
                        objArr[17] = peakStreams;
                        objArr[18] = isViral;
                        objArr[19] = isReleased;
                        objArr[20] = hype;
                        objArr[21] = weeksUntilRelease;
                        objArr[22] = initialHypeWeeksSet;
                        objArr[23] = soundEngineerQuality;
                        objArr[24] = mixingStyle;
                        objArr[25] = backingVocalists;
                        objArr[26] = studioDecor;
                        objArr[27] = producerTier;
                        objArr[28] = coverArt;
                        objArr[29] = isCopyrightRegistered;
                        objArr[30] = hasSampleClearance;
                        objArr[31] = audienceFeedback;
                        objArr[32] = Integer.valueOf(mask0);
                        objArr[33] = null;
                        Song newInstance = localConstructor.newInstance(objArr);
                        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                        return newInstance;
                    }
                    throw Util.missingProperty("yearCreated", "yearCreated", reader);
                }
                throw Util.missingProperty("weekCreated", "weekCreated", reader);
            }
            throw Util.missingProperty("rating", "rating", reader);
        }
        throw Util.missingProperty("budget", "budget", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable Song value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.name("genreId");
        this.stringAdapter.toJson(writer, value_.getGenreId());
        writer.name("budget");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getBudget()));
        writer.name("producerId");
        this.nullableStringAdapter.toJson(writer, value_.getProducerId());
        writer.name("rating");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRating()));
        writer.name("isUploadedMap");
        this.mapOfStringLongAdapter.toJson(writer, value_.isUploadedMap());
        writer.name("totalStreams");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getTotalStreams()));
        writer.name("videoTier");
        this.nullableStringAdapter.toJson(writer, value_.getVideoTier());
        writer.name("weekCreated");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeekCreated()));
        writer.name("yearCreated");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYearCreated()));
        writer.name("licenseType");
        this.stringAdapter.toJson(writer, value_.getLicenseType());
        writer.name("promoWeeksLeft");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getPromoWeeksLeft()));
        writer.name("promoWeeklyBoost");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPromoWeeklyBoost()));
        writer.name("playlistsCount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getPlaylistsCount()));
        writer.name("isGlobal");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isGlobal()));
        writer.name("weeksSinceRelease");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeeksSinceRelease()));
        writer.name("peakStreams");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getPeakStreams()));
        writer.name("isViral");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isViral()));
        writer.name("isReleased");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isReleased()));
        writer.name("hype");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getHype()));
        writer.name("weeksUntilRelease");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeeksUntilRelease()));
        writer.name("initialHypeWeeksSet");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getInitialHypeWeeksSet()));
        writer.name("soundEngineerQuality");
        this.stringAdapter.toJson(writer, value_.getSoundEngineerQuality());
        writer.name("mixingStyle");
        this.stringAdapter.toJson(writer, value_.getMixingStyle());
        writer.name("backingVocalists");
        this.stringAdapter.toJson(writer, value_.getBackingVocalists());
        writer.name("studioDecor");
        this.stringAdapter.toJson(writer, value_.getStudioDecor());
        writer.name("producerTier");
        this.stringAdapter.toJson(writer, value_.getProducerTier());
        writer.name("coverArt");
        this.nullableStringAdapter.toJson(writer, value_.getCoverArt());
        writer.name("isCopyrightRegistered");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isCopyrightRegistered()));
        writer.name("hasSampleClearance");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasSampleClearance()));
        writer.name("audienceFeedback");
        this.listOfStringAdapter.toJson(writer, value_.getAudienceFeedback());
        writer.endObject();
    }
}
