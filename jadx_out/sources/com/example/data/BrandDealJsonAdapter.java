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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: BrandDealJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0010 \n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u001a\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001c"}, d2 = {"Lcom/example/data/BrandDealJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/BrandDeal;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "intAdapter", "", "listOfStringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nBrandDealJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrandDealJsonAdapter.kt\ncom/example/data/BrandDealJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,160:1\n1#2:161\n*E\n"})
/* loaded from: BrandDealJsonAdapter.class */
public final class BrandDealJsonAdapter extends JsonAdapter<BrandDeal> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @Nullable
    private volatile Constructor<BrandDeal> constructorRef;
    public static final int $stable = 8;

    public BrandDealJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "brandName", "tier", "weeklyPayment", "durationWeeks", "weeksRemaining", "conditions", "signedWeek", "signedYear"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "weeklyPayment");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "durationWeeks");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
        JsonAdapter<List<String>> adapter4 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "conditions");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.listOfStringAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(").append("BrandDeal").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public BrandDeal m29fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String brandName = null;
        String tier = null;
        Double weeklyPayment = null;
        Integer durationWeeks = null;
        Integer weeksRemaining = null;
        List conditions = null;
        Integer signedWeek = null;
        Integer signedYear = null;
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
                        brandName = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("brandName", "brandName", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        tier = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("tier", "tier", reader);
                    }
                case 3:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        weeklyPayment = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyPayment", "weeklyPayment", reader);
                    }
                case 4:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        durationWeeks = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("durationWeeks", "durationWeeks", reader);
                    }
                case 5:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        weeksRemaining = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeksRemaining", "weeksRemaining", reader);
                    }
                case 6:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        conditions = list;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("conditions", "conditions", reader);
                    }
                case 7:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        signedWeek = num3;
                        break;
                    } else {
                        throw Util.unexpectedNull("signedWeek", "signedWeek", reader);
                    }
                case 8:
                    Integer num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 != null) {
                        signedYear = num4;
                        break;
                    } else {
                        throw Util.unexpectedNull("signedYear", "signedYear", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -65) {
            String str4 = id;
            if (str4 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str5 = brandName;
            if (str5 == null) {
                throw Util.missingProperty("brandName", "brandName", reader);
            }
            String str6 = tier;
            if (str6 == null) {
                throw Util.missingProperty("tier", "tier", reader);
            }
            Double d2 = weeklyPayment;
            if (d2 != null) {
                double doubleValue = d2.doubleValue();
                Integer num5 = durationWeeks;
                if (num5 != null) {
                    int intValue = num5.intValue();
                    Integer num6 = weeksRemaining;
                    if (num6 != null) {
                        int intValue2 = num6.intValue();
                        List list2 = conditions;
                        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                        Integer num7 = signedWeek;
                        if (num7 != null) {
                            int intValue3 = num7.intValue();
                            Integer num8 = signedYear;
                            if (num8 != null) {
                                return new BrandDeal(str4, str5, str6, doubleValue, intValue, intValue2, list2, intValue3, num8.intValue());
                            }
                            throw Util.missingProperty("signedYear", "signedYear", reader);
                        }
                        throw Util.missingProperty("signedWeek", "signedWeek", reader);
                    }
                    throw Util.missingProperty("weeksRemaining", "weeksRemaining", reader);
                }
                throw Util.missingProperty("durationWeeks", "durationWeeks", reader);
            }
            throw Util.missingProperty("weeklyPayment", "weeklyPayment", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = BrandDeal.class.getDeclaredConstructor(String.class, String.class, String.class, Double.TYPE, Integer.TYPE, Integer.TYPE, List.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[11];
        String str7 = id;
        if (str7 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str7;
        String str8 = brandName;
        if (str8 == null) {
            throw Util.missingProperty("brandName", "brandName", reader);
        }
        objArr[1] = str8;
        String str9 = tier;
        if (str9 == null) {
            throw Util.missingProperty("tier", "tier", reader);
        }
        objArr[2] = str9;
        Double d3 = weeklyPayment;
        if (d3 != null) {
            objArr[3] = Double.valueOf(d3.doubleValue());
            Integer num9 = durationWeeks;
            if (num9 != null) {
                objArr[4] = Integer.valueOf(num9.intValue());
                Integer num10 = weeksRemaining;
                if (num10 != null) {
                    objArr[5] = Integer.valueOf(num10.intValue());
                    objArr[6] = conditions;
                    Integer num11 = signedWeek;
                    if (num11 != null) {
                        objArr[7] = Integer.valueOf(num11.intValue());
                        Integer num12 = signedYear;
                        if (num12 != null) {
                            objArr[8] = Integer.valueOf(num12.intValue());
                            objArr[9] = Integer.valueOf(mask0);
                            objArr[10] = null;
                            BrandDeal newInstance = localConstructor.newInstance(objArr);
                            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                            return newInstance;
                        }
                        throw Util.missingProperty("signedYear", "signedYear", reader);
                    }
                    throw Util.missingProperty("signedWeek", "signedWeek", reader);
                }
                throw Util.missingProperty("weeksRemaining", "weeksRemaining", reader);
            }
            throw Util.missingProperty("durationWeeks", "durationWeeks", reader);
        }
        throw Util.missingProperty("weeklyPayment", "weeklyPayment", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable BrandDeal value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("brandName");
        this.stringAdapter.toJson(writer, value_.getBrandName());
        writer.name("tier");
        this.stringAdapter.toJson(writer, value_.getTier());
        writer.name("weeklyPayment");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWeeklyPayment()));
        writer.name("durationWeeks");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getDurationWeeks()));
        writer.name("weeksRemaining");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeeksRemaining()));
        writer.name("conditions");
        this.listOfStringAdapter.toJson(writer, value_.getConditions());
        writer.name("signedWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSignedWeek()));
        writer.name("signedYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getSignedYear()));
        writer.endObject();
    }
}
