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
/* compiled from: WorldHistoryEntryJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0014\u001a\u00020\nH\u0016J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001d"}, d2 = {"Lcom/example/data/WorldHistoryEntryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/WorldHistoryEntry;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "intAdapter", "", "nullableStringAdapter", "floatAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: WorldHistoryEntryJsonAdapter.class */
public final class WorldHistoryEntryJsonAdapter extends JsonAdapter<WorldHistoryEntry> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<WorldHistoryEntry> constructorRef;
    public static final int $stable = 8;

    public WorldHistoryEntryJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "week", "year", "title", "description", "memoryType", "strength", "targetNpcId", "targetNpcName", "targetBusinessName", "targetSongTitle", "targetAlbumTitle", "valueAffected", "isPermanent", "isNpcOnly", "decayWeeksRemaining"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Integer> adapter2 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "week");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.intAdapter = adapter2;
        JsonAdapter<String> adapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "targetNpcId");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.nullableStringAdapter = adapter3;
        JsonAdapter<Float> adapter4 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "valueAffected");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.floatAdapter = adapter4;
        JsonAdapter<Boolean> adapter5 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isPermanent");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.booleanAdapter = adapter5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(39);
        sb.append("GeneratedJsonAdapter(").append("WorldHistoryEntry").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public WorldHistoryEntry m186fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        Integer week = null;
        Integer year = null;
        String title = null;
        String description = null;
        String memoryType = null;
        String strength = null;
        String targetNpcId = null;
        String targetNpcName = null;
        String targetBusinessName = null;
        String targetSongTitle = null;
        String targetAlbumTitle = null;
        Float valueAffected = Float.valueOf(0.0f);
        Boolean isPermanent = false;
        Boolean isNpcOnly = false;
        Integer decayWeeksRemaining = 0;
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
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        week = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("week", "week", reader);
                    }
                case 2:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        year = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("year", "year", reader);
                    }
                case 3:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        title = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("title", "title", reader);
                    }
                case 4:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        description = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("description", "description", reader);
                    }
                case 5:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        memoryType = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("memoryType", "memoryType", reader);
                    }
                case 6:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        strength = str5;
                        break;
                    } else {
                        throw Util.unexpectedNull("strength", "strength", reader);
                    }
                case 7:
                    targetNpcId = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -129;
                    break;
                case 8:
                    targetNpcName = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -257;
                    break;
                case 9:
                    targetBusinessName = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -513;
                    break;
                case 10:
                    targetSongTitle = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -1025;
                    break;
                case 11:
                    targetAlbumTitle = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -2049;
                    break;
                case 12:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        valueAffected = f;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("valueAffected", "valueAffected", reader);
                    }
                case 13:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isPermanent = bool;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("isPermanent", "isPermanent", reader);
                    }
                case 14:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        isNpcOnly = bool2;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("isNpcOnly", "isNpcOnly", reader);
                    }
                case 15:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        decayWeeksRemaining = num3;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("decayWeeksRemaining", "decayWeeksRemaining", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -65409) {
            String str6 = id;
            if (str6 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            Integer num4 = week;
            if (num4 != null) {
                int intValue = num4.intValue();
                Integer num5 = year;
                if (num5 != null) {
                    int intValue2 = num5.intValue();
                    String str7 = title;
                    if (str7 == null) {
                        throw Util.missingProperty("title", "title", reader);
                    }
                    String str8 = description;
                    if (str8 == null) {
                        throw Util.missingProperty("description", "description", reader);
                    }
                    String str9 = memoryType;
                    if (str9 == null) {
                        throw Util.missingProperty("memoryType", "memoryType", reader);
                    }
                    String str10 = strength;
                    if (str10 == null) {
                        throw Util.missingProperty("strength", "strength", reader);
                    }
                    return new WorldHistoryEntry(str6, intValue, intValue2, str7, str8, str9, str10, targetNpcId, targetNpcName, targetBusinessName, targetSongTitle, targetAlbumTitle, valueAffected.floatValue(), isPermanent.booleanValue(), isNpcOnly.booleanValue(), decayWeeksRemaining.intValue());
                }
                throw Util.missingProperty("year", "year", reader);
            }
            throw Util.missingProperty("week", "week", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = WorldHistoryEntry.class.getDeclaredConstructor(String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Float.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[18];
        String str11 = id;
        if (str11 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str11;
        Integer num6 = week;
        if (num6 != null) {
            objArr[1] = Integer.valueOf(num6.intValue());
            Integer num7 = year;
            if (num7 != null) {
                objArr[2] = Integer.valueOf(num7.intValue());
                String str12 = title;
                if (str12 == null) {
                    throw Util.missingProperty("title", "title", reader);
                }
                objArr[3] = str12;
                String str13 = description;
                if (str13 == null) {
                    throw Util.missingProperty("description", "description", reader);
                }
                objArr[4] = str13;
                String str14 = memoryType;
                if (str14 == null) {
                    throw Util.missingProperty("memoryType", "memoryType", reader);
                }
                objArr[5] = str14;
                String str15 = strength;
                if (str15 == null) {
                    throw Util.missingProperty("strength", "strength", reader);
                }
                objArr[6] = str15;
                objArr[7] = targetNpcId;
                objArr[8] = targetNpcName;
                objArr[9] = targetBusinessName;
                objArr[10] = targetSongTitle;
                objArr[11] = targetAlbumTitle;
                objArr[12] = valueAffected;
                objArr[13] = isPermanent;
                objArr[14] = isNpcOnly;
                objArr[15] = decayWeeksRemaining;
                objArr[16] = Integer.valueOf(mask0);
                objArr[17] = null;
                WorldHistoryEntry newInstance = localConstructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw Util.missingProperty("year", "year", reader);
        }
        throw Util.missingProperty("week", "week", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable WorldHistoryEntry value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("week");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeek()));
        writer.name("year");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYear()));
        writer.name("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.name("description");
        this.stringAdapter.toJson(writer, value_.getDescription());
        writer.name("memoryType");
        this.stringAdapter.toJson(writer, value_.getMemoryType());
        writer.name("strength");
        this.stringAdapter.toJson(writer, value_.getStrength());
        writer.name("targetNpcId");
        this.nullableStringAdapter.toJson(writer, value_.getTargetNpcId());
        writer.name("targetNpcName");
        this.nullableStringAdapter.toJson(writer, value_.getTargetNpcName());
        writer.name("targetBusinessName");
        this.nullableStringAdapter.toJson(writer, value_.getTargetBusinessName());
        writer.name("targetSongTitle");
        this.nullableStringAdapter.toJson(writer, value_.getTargetSongTitle());
        writer.name("targetAlbumTitle");
        this.nullableStringAdapter.toJson(writer, value_.getTargetAlbumTitle());
        writer.name("valueAffected");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getValueAffected()));
        writer.name("isPermanent");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isPermanent()));
        writer.name("isNpcOnly");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isNpcOnly()));
        writer.name("decayWeeksRemaining");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getDecayWeeksRemaining()));
        writer.endObject();
    }
}
