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
/* compiled from: ProducerJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"Lcom/example/data/ProducerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/Producer;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "floatAdapter", "", "nullableStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: ProducerJsonAdapter.class */
public final class ProducerJsonAdapter extends JsonAdapter<Producer> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @Nullable
    private volatile Constructor<Producer> constructorRef;
    public static final int $stable = 8;

    public ProducerJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "level", "cost", "ratingBonus", "specialtyGenre"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "cost");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Float> adapter3 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "ratingBonus");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.floatAdapter = adapter3;
        JsonAdapter<String> adapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "specialtyGenre");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.nullableStringAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(").append("Producer").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public Producer m138fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        String level = null;
        Double cost = null;
        Float ratingBonus = null;
        String specialtyGenre = null;
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
                        name = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("name", "name", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        level = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("level", "level", reader);
                    }
                case 3:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        cost = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("cost", "cost", reader);
                    }
                case 4:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        ratingBonus = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("ratingBonus", "ratingBonus", reader);
                    }
                case 5:
                    specialtyGenre = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (mask0 == -33) {
            String str4 = id;
            if (str4 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str5 = name;
            if (str5 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            String str6 = level;
            if (str6 == null) {
                throw Util.missingProperty("level", "level", reader);
            }
            Double d2 = cost;
            if (d2 != null) {
                double doubleValue = d2.doubleValue();
                Float f2 = ratingBonus;
                if (f2 != null) {
                    return new Producer(str4, str5, str6, doubleValue, f2.floatValue(), specialtyGenre);
                }
                throw Util.missingProperty("ratingBonus", "ratingBonus", reader);
            }
            throw Util.missingProperty("cost", "cost", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = Producer.class.getDeclaredConstructor(String.class, String.class, String.class, Double.TYPE, Float.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[8];
        String str7 = id;
        if (str7 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str7;
        String str8 = name;
        if (str8 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[1] = str8;
        String str9 = level;
        if (str9 == null) {
            throw Util.missingProperty("level", "level", reader);
        }
        objArr[2] = str9;
        Double d3 = cost;
        if (d3 != null) {
            objArr[3] = Double.valueOf(d3.doubleValue());
            Float f3 = ratingBonus;
            if (f3 != null) {
                objArr[4] = Float.valueOf(f3.floatValue());
                objArr[5] = specialtyGenre;
                objArr[6] = Integer.valueOf(mask0);
                objArr[7] = null;
                Producer newInstance = localConstructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw Util.missingProperty("ratingBonus", "ratingBonus", reader);
        }
        throw Util.missingProperty("cost", "cost", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable Producer value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("level");
        this.stringAdapter.toJson(writer, value_.getLevel());
        writer.name("cost");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCost()));
        writer.name("ratingBonus");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRatingBonus()));
        writer.name("specialtyGenre");
        this.nullableStringAdapter.toJson(writer, value_.getSpecialtyGenre());
        writer.endObject();
    }
}
