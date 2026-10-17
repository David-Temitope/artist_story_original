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
/* compiled from: SideJobJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001c"}, d2 = {"Lcom/example/data/SideJobJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/SideJob;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "intAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: SideJobJsonAdapter.class */
public final class SideJobJsonAdapter extends JsonAdapter<SideJob> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<SideJob> constructorRef;
    public static final int $stable = 8;

    public SideJobJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "weeklyPay", "energyCost", "timeCost", "isActive"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "weeklyPay");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "energyCost");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
        JsonAdapter<Boolean> adapter4 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isActive");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.booleanAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(29);
        sb.append("GeneratedJsonAdapter(").append("SideJob").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public SideJob m152fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        Double weeklyPay = null;
        Integer energyCost = null;
        Integer timeCost = null;
        Boolean isActive = false;
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
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        weeklyPay = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyPay", "weeklyPay", reader);
                    }
                case 3:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        energyCost = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("energyCost", "energyCost", reader);
                    }
                case 4:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        timeCost = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("timeCost", "timeCost", reader);
                    }
                case 5:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isActive = bool;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("isActive", "isActive", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -33) {
            String str3 = id;
            if (str3 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str4 = name;
            if (str4 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            Double d2 = weeklyPay;
            if (d2 != null) {
                double doubleValue = d2.doubleValue();
                Integer num3 = energyCost;
                if (num3 != null) {
                    int intValue = num3.intValue();
                    Integer num4 = timeCost;
                    if (num4 != null) {
                        return new SideJob(str3, str4, doubleValue, intValue, num4.intValue(), isActive.booleanValue());
                    }
                    throw Util.missingProperty("timeCost", "timeCost", reader);
                }
                throw Util.missingProperty("energyCost", "energyCost", reader);
            }
            throw Util.missingProperty("weeklyPay", "weeklyPay", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = SideJob.class.getDeclaredConstructor(String.class, String.class, Double.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[8];
        String str5 = id;
        if (str5 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str5;
        String str6 = name;
        if (str6 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[1] = str6;
        Double d3 = weeklyPay;
        if (d3 != null) {
            objArr[2] = Double.valueOf(d3.doubleValue());
            Integer num5 = energyCost;
            if (num5 != null) {
                objArr[3] = Integer.valueOf(num5.intValue());
                Integer num6 = timeCost;
                if (num6 != null) {
                    objArr[4] = Integer.valueOf(num6.intValue());
                    objArr[5] = isActive;
                    objArr[6] = Integer.valueOf(mask0);
                    objArr[7] = null;
                    SideJob newInstance = localConstructor.newInstance(objArr);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                    return newInstance;
                }
                throw Util.missingProperty("timeCost", "timeCost", reader);
            }
            throw Util.missingProperty("energyCost", "energyCost", reader);
        }
        throw Util.missingProperty("weeklyPay", "weeklyPay", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable SideJob value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("weeklyPay");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWeeklyPay()));
        writer.name("energyCost");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getEnergyCost()));
        writer.name("timeCost");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTimeCost()));
        writer.name("isActive");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isActive()));
        writer.endObject();
    }
}
