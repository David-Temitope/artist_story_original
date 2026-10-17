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
/* compiled from: CoFounderJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u0006\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001a"}, d2 = {"Lcom/example/data/CoFounderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/CoFounder;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "floatAdapter", "", "doubleAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nCoFounderJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoFounderJsonAdapter.kt\ncom/example/data/CoFounderJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,141:1\n1#2:142\n*E\n"})
/* loaded from: CoFounderJsonAdapter.class */
public final class CoFounderJsonAdapter extends JsonAdapter<CoFounder> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @Nullable
    private volatile Constructor<CoFounder> constructorRef;
    public static final int $stable = 8;

    public CoFounderJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "trait", "equityShare", "relationship", "salaryExpectation", "monthlyDemands"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "equityShare");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
        JsonAdapter<Double> adapter3 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "salaryExpectation");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.doubleAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(31);
        sb.append("GeneratedJsonAdapter(").append("CoFounder").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public CoFounder m58fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        String trait = null;
        Float equityShare = null;
        Float relationship = null;
        Double salaryExpectation = null;
        String monthlyDemands = null;
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
                        trait = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("trait", "trait", reader);
                    }
                case 3:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        equityShare = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("equityShare", "equityShare", reader);
                    }
                case 4:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        relationship = f2;
                        break;
                    } else {
                        throw Util.unexpectedNull("relationship", "relationship", reader);
                    }
                case 5:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        salaryExpectation = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("salaryExpectation", "salaryExpectation", reader);
                    }
                case 6:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        monthlyDemands = str4;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("monthlyDemands", "monthlyDemands", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -65) {
            String str5 = id;
            if (str5 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str6 = name;
            if (str6 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            String str7 = trait;
            if (str7 == null) {
                throw Util.missingProperty("trait", "trait", reader);
            }
            Float f3 = equityShare;
            if (f3 != null) {
                float floatValue = f3.floatValue();
                Float f4 = relationship;
                if (f4 != null) {
                    float floatValue2 = f4.floatValue();
                    Double d2 = salaryExpectation;
                    if (d2 != null) {
                        double doubleValue = d2.doubleValue();
                        String str8 = monthlyDemands;
                        Intrinsics.checkNotNull(str8, "null cannot be cast to non-null type kotlin.String");
                        return new CoFounder(str5, str6, str7, floatValue, floatValue2, doubleValue, str8);
                    }
                    throw Util.missingProperty("salaryExpectation", "salaryExpectation", reader);
                }
                throw Util.missingProperty("relationship", "relationship", reader);
            }
            throw Util.missingProperty("equityShare", "equityShare", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = CoFounder.class.getDeclaredConstructor(String.class, String.class, String.class, Float.TYPE, Float.TYPE, Double.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[9];
        String str9 = id;
        if (str9 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str9;
        String str10 = name;
        if (str10 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[1] = str10;
        String str11 = trait;
        if (str11 == null) {
            throw Util.missingProperty("trait", "trait", reader);
        }
        objArr[2] = str11;
        Float f5 = equityShare;
        if (f5 != null) {
            objArr[3] = Float.valueOf(f5.floatValue());
            Float f6 = relationship;
            if (f6 != null) {
                objArr[4] = Float.valueOf(f6.floatValue());
                Double d3 = salaryExpectation;
                if (d3 != null) {
                    objArr[5] = Double.valueOf(d3.doubleValue());
                    objArr[6] = monthlyDemands;
                    objArr[7] = Integer.valueOf(mask0);
                    objArr[8] = null;
                    CoFounder newInstance = localConstructor.newInstance(objArr);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                    return newInstance;
                }
                throw Util.missingProperty("salaryExpectation", "salaryExpectation", reader);
            }
            throw Util.missingProperty("relationship", "relationship", reader);
        }
        throw Util.missingProperty("equityShare", "equityShare", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable CoFounder value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("trait");
        this.stringAdapter.toJson(writer, value_.getTrait());
        writer.name("equityShare");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getEquityShare()));
        writer.name("relationship");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRelationship()));
        writer.name("salaryExpectation");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getSalaryExpectation()));
        writer.name("monthlyDemands");
        this.stringAdapter.toJson(writer, value_.getMonthlyDemands());
        writer.endObject();
    }
}
