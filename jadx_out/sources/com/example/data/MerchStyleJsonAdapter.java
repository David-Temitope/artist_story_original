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
/* compiled from: MerchStyleJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001a"}, d2 = {"Lcom/example/data/MerchStyleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/MerchStyle;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "intAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nMerchStyleJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MerchStyleJsonAdapter.kt\ncom/example/data/MerchStyleJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,149:1\n1#2:150\n*E\n"})
/* loaded from: MerchStyleJsonAdapter.class */
public final class MerchStyleJsonAdapter extends JsonAdapter<MerchStyle> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @Nullable
    private volatile Constructor<MerchStyle> constructorRef;
    public static final int $stable = 8;

    public MerchStyleJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "type", "unitCost", "sellPrice", "stockRemaining", "totalSold", "totalRevenue"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "unitCost");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "stockRemaining");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(").append("MerchStyle").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public MerchStyle m120fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        String type = null;
        Double unitCost = null;
        Double sellPrice = null;
        Integer stockRemaining = null;
        Integer totalSold = 0;
        Double totalRevenue = Double.valueOf(0.0d);
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
                        unitCost = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("unitCost", "unitCost", reader);
                    }
                case 4:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        sellPrice = d2;
                        break;
                    } else {
                        throw Util.unexpectedNull("sellPrice", "sellPrice", reader);
                    }
                case 5:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        stockRemaining = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("stockRemaining", "stockRemaining", reader);
                    }
                case 6:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        totalSold = num2;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("totalSold", "totalSold", reader);
                    }
                case 7:
                    Double d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 != null) {
                        totalRevenue = d3;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("totalRevenue", "totalRevenue", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -193) {
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
            Double d4 = unitCost;
            if (d4 != null) {
                double doubleValue = d4.doubleValue();
                Double d5 = sellPrice;
                if (d5 != null) {
                    double doubleValue2 = d5.doubleValue();
                    Integer num3 = stockRemaining;
                    if (num3 != null) {
                        return new MerchStyle(str4, str5, str6, doubleValue, doubleValue2, num3.intValue(), totalSold.intValue(), totalRevenue.doubleValue());
                    }
                    throw Util.missingProperty("stockRemaining", "stockRemaining", reader);
                }
                throw Util.missingProperty("sellPrice", "sellPrice", reader);
            }
            throw Util.missingProperty("unitCost", "unitCost", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = MerchStyle.class.getDeclaredConstructor(String.class, String.class, String.class, Double.TYPE, Double.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
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
        Double d6 = unitCost;
        if (d6 != null) {
            objArr[3] = Double.valueOf(d6.doubleValue());
            Double d7 = sellPrice;
            if (d7 != null) {
                objArr[4] = Double.valueOf(d7.doubleValue());
                Integer num4 = stockRemaining;
                if (num4 != null) {
                    objArr[5] = Integer.valueOf(num4.intValue());
                    objArr[6] = totalSold;
                    objArr[7] = totalRevenue;
                    objArr[8] = Integer.valueOf(mask0);
                    objArr[9] = null;
                    MerchStyle newInstance = localConstructor.newInstance(objArr);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                    return newInstance;
                }
                throw Util.missingProperty("stockRemaining", "stockRemaining", reader);
            }
            throw Util.missingProperty("sellPrice", "sellPrice", reader);
        }
        throw Util.missingProperty("unitCost", "unitCost", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable MerchStyle value_) {
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
        writer.name("unitCost");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getUnitCost()));
        writer.name("sellPrice");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getSellPrice()));
        writer.name("stockRemaining");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getStockRemaining()));
        writer.name("totalSold");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTotalSold()));
        writer.name("totalRevenue");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getTotalRevenue()));
        writer.endObject();
    }
}
