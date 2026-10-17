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
/* compiled from: NPCMemoryJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001c"}, d2 = {"Lcom/example/data/NPCMemoryJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/NPCMemory;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "floatAdapter", "", "intAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nNPCMemoryJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NPCMemoryJsonAdapter.kt\ncom/example/data/NPCMemoryJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,157:1\n1#2:158\n*E\n"})
/* loaded from: NPCMemoryJsonAdapter.class */
public final class NPCMemoryJsonAdapter extends JsonAdapter<NPCMemory> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<NPCMemory> constructorRef;
    public static final int $stable = 8;

    public NPCMemoryJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "description", "emotionalImpact", "memoryType", "weekRecorded", "yearRecorded", "isCoreMemory", "decayRate"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "emotionalImpact");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "weekRecorded");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
        JsonAdapter<Boolean> adapter4 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isCoreMemory");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.booleanAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(").append("NPCMemory").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public NPCMemory m126fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String description = null;
        Float emotionalImpact = null;
        String memoryType = null;
        Integer weekRecorded = null;
        Integer yearRecorded = null;
        Boolean isCoreMemory = false;
        Float decayRate = Float.valueOf(0.0f);
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
                        description = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("description", "description", reader);
                    }
                case 2:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        emotionalImpact = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("emotionalImpact", "emotionalImpact", reader);
                    }
                case 3:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        memoryType = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("memoryType", "memoryType", reader);
                    }
                case 4:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        weekRecorded = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("weekRecorded", "weekRecorded", reader);
                    }
                case 5:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        yearRecorded = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("yearRecorded", "yearRecorded", reader);
                    }
                case 6:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isCoreMemory = bool;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("isCoreMemory", "isCoreMemory", reader);
                    }
                case 7:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        decayRate = f2;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("decayRate", "decayRate", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -193) {
            String str4 = id;
            if (str4 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str5 = description;
            if (str5 == null) {
                throw Util.missingProperty("description", "description", reader);
            }
            Float f3 = emotionalImpact;
            if (f3 != null) {
                float floatValue = f3.floatValue();
                String str6 = memoryType;
                if (str6 == null) {
                    throw Util.missingProperty("memoryType", "memoryType", reader);
                }
                Integer num3 = weekRecorded;
                if (num3 != null) {
                    int intValue = num3.intValue();
                    Integer num4 = yearRecorded;
                    if (num4 != null) {
                        return new NPCMemory(str4, str5, floatValue, str6, intValue, num4.intValue(), isCoreMemory.booleanValue(), decayRate.floatValue());
                    }
                    throw Util.missingProperty("yearRecorded", "yearRecorded", reader);
                }
                throw Util.missingProperty("weekRecorded", "weekRecorded", reader);
            }
            throw Util.missingProperty("emotionalImpact", "emotionalImpact", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = NPCMemory.class.getDeclaredConstructor(String.class, String.class, Float.TYPE, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[10];
        String str7 = id;
        if (str7 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str7;
        String str8 = description;
        if (str8 == null) {
            throw Util.missingProperty("description", "description", reader);
        }
        objArr[1] = str8;
        Float f4 = emotionalImpact;
        if (f4 != null) {
            objArr[2] = Float.valueOf(f4.floatValue());
            String str9 = memoryType;
            if (str9 == null) {
                throw Util.missingProperty("memoryType", "memoryType", reader);
            }
            objArr[3] = str9;
            Integer num5 = weekRecorded;
            if (num5 != null) {
                objArr[4] = Integer.valueOf(num5.intValue());
                Integer num6 = yearRecorded;
                if (num6 != null) {
                    objArr[5] = Integer.valueOf(num6.intValue());
                    objArr[6] = isCoreMemory;
                    objArr[7] = decayRate;
                    objArr[8] = Integer.valueOf(mask0);
                    objArr[9] = null;
                    NPCMemory newInstance = localConstructor.newInstance(objArr);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                    return newInstance;
                }
                throw Util.missingProperty("yearRecorded", "yearRecorded", reader);
            }
            throw Util.missingProperty("weekRecorded", "weekRecorded", reader);
        }
        throw Util.missingProperty("emotionalImpact", "emotionalImpact", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable NPCMemory value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("description");
        this.stringAdapter.toJson(writer, value_.getDescription());
        writer.name("emotionalImpact");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getEmotionalImpact()));
        writer.name("memoryType");
        this.stringAdapter.toJson(writer, value_.getMemoryType());
        writer.name("weekRecorded");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeekRecorded()));
        writer.name("yearRecorded");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYearRecorded()));
        writer.name("isCoreMemory");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isCoreMemory()));
        writer.name("decayRate");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getDecayRate()));
        writer.endObject();
    }
}
