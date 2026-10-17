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
/* compiled from: BusinessAssetJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001c"}, d2 = {"Lcom/example/data/BusinessAssetJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/BusinessAsset;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "intAdapter", "", "floatAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: BusinessAssetJsonAdapter.class */
public final class BusinessAssetJsonAdapter extends JsonAdapter<BusinessAsset> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @Nullable
    private volatile Constructor<BusinessAsset> constructorRef;
    public static final int $stable = 8;

    public BusinessAssetJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "type", "purchaseCost", "weeklyProfit", "energyBonus", "ratingBonus"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "purchaseCost");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "energyBonus");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
        JsonAdapter<Float> adapter4 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "ratingBonus");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.floatAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(").append("BusinessAsset").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public BusinessAsset m32fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        String type = null;
        Double purchaseCost = null;
        Double weeklyProfit = null;
        Integer energyBonus = 0;
        Float ratingBonus = Float.valueOf(0.0f);
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
                        type = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("type", "type", reader);
                    }
                case 3:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        purchaseCost = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("purchaseCost", "purchaseCost", reader);
                    }
                case 4:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        weeklyProfit = d2;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyProfit", "weeklyProfit", reader);
                    }
                case 5:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        energyBonus = num;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("energyBonus", "energyBonus", reader);
                    }
                case 6:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        ratingBonus = f;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("ratingBonus", "ratingBonus", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -97) {
            String str4 = id;
            if (str4 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str5 = name;
            if (str5 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            String str6 = type;
            if (str6 == null) {
                throw Util.missingProperty("type", "type", reader);
            }
            Double d3 = purchaseCost;
            if (d3 != null) {
                double doubleValue = d3.doubleValue();
                Double d4 = weeklyProfit;
                if (d4 != null) {
                    return new BusinessAsset(str4, str5, str6, doubleValue, d4.doubleValue(), energyBonus.intValue(), ratingBonus.floatValue());
                }
                throw Util.missingProperty("weeklyProfit", "weeklyProfit", reader);
            }
            throw Util.missingProperty("purchaseCost", "purchaseCost", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = BusinessAsset.class.getDeclaredConstructor(String.class, String.class, String.class, Double.TYPE, Double.TYPE, Integer.TYPE, Float.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[9];
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
        String str9 = type;
        if (str9 == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        objArr[2] = str9;
        Double d5 = purchaseCost;
        if (d5 != null) {
            objArr[3] = Double.valueOf(d5.doubleValue());
            Double d6 = weeklyProfit;
            if (d6 != null) {
                objArr[4] = Double.valueOf(d6.doubleValue());
                objArr[5] = energyBonus;
                objArr[6] = ratingBonus;
                objArr[7] = Integer.valueOf(mask0);
                objArr[8] = null;
                BusinessAsset newInstance = localConstructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw Util.missingProperty("weeklyProfit", "weeklyProfit", reader);
        }
        throw Util.missingProperty("purchaseCost", "purchaseCost", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable BusinessAsset value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("purchaseCost");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getPurchaseCost()));
        writer.name("weeklyProfit");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWeeklyProfit()));
        writer.name("energyBonus");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getEnergyBonus()));
        writer.name("ratingBonus");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRatingBonus()));
        writer.endObject();
    }
}
