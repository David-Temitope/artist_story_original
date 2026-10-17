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
/* compiled from: EmployeeJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010 \n��\n\u0002\u0010$\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00140\u0001X\u0082\u0004¢\u0006\u0002\n��R \u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u00160\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n��¨\u0006\""}, d2 = {"Lcom/example/data/EmployeeJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/Employee;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "intAdapter", "", "floatAdapter", "", "booleanAdapter", "", "listOfStringAdapter", "", "mapOfStringBooleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: EmployeeJsonAdapter.class */
public final class EmployeeJsonAdapter extends JsonAdapter<Employee> {
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
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @NotNull
    private final JsonAdapter<Map<String, Boolean>> mapOfStringBooleanAdapter;
    @Nullable
    private volatile Constructor<Employee> constructorRef;
    public static final int $stable = 8;

    public EmployeeJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "role", "weeklySalary", "experience", "reliability", "honesty", "greed", "intelligence", "leadership", "loyalty", "isRetired", "traitDescription", "age", "contractWeeks", "integrity", "communication", "efficiency", "negotiation", "ambition", "stressLevel", "happiness", "workload", "reputation", "careerHistory", "permissions", "rating", "investorStyle"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "weeklySalary");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "experience");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
        JsonAdapter<Float> adapter4 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "reliability");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.floatAdapter = adapter4;
        JsonAdapter<Boolean> adapter5 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isRetired");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.booleanAdapter = adapter5;
        JsonAdapter<List<String>> adapter6 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "careerHistory");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.listOfStringAdapter = adapter6;
        JsonAdapter<Map<String, Boolean>> adapter7 = moshi.adapter(Types.newParameterizedType(Map.class, new Type[]{String.class, Boolean.class}), SetsKt.emptySet(), "permissions");
        Intrinsics.checkNotNullExpressionValue(adapter7, "adapter(...)");
        this.mapOfStringBooleanAdapter = adapter7;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(").append("Employee").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public Employee m72fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        String role = null;
        Double weeklySalary = null;
        Integer experience = null;
        Float reliability = null;
        Float honesty = null;
        Float greed = null;
        Float intelligence = null;
        Float leadership = null;
        Float loyalty = Float.valueOf(0.0f);
        Boolean isRetired = false;
        String traitDescription = null;
        Integer age = 0;
        Integer contractWeeks = 0;
        Float integrity = Float.valueOf(0.0f);
        Float communication = Float.valueOf(0.0f);
        Float efficiency = Float.valueOf(0.0f);
        Float negotiation = Float.valueOf(0.0f);
        Float ambition = Float.valueOf(0.0f);
        Float stressLevel = Float.valueOf(0.0f);
        Float happiness = Float.valueOf(0.0f);
        Float workload = Float.valueOf(0.0f);
        Float reputation = Float.valueOf(0.0f);
        List careerHistory = null;
        Map permissions = null;
        Float rating = Float.valueOf(0.0f);
        String investorStyle = null;
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
                        role = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("role", "role", reader);
                    }
                case 3:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        weeklySalary = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklySalary", "weeklySalary", reader);
                    }
                case 4:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        experience = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("experience", "experience", reader);
                    }
                case 5:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        reliability = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("reliability", "reliability", reader);
                    }
                case 6:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        honesty = f2;
                        break;
                    } else {
                        throw Util.unexpectedNull("honesty", "honesty", reader);
                    }
                case 7:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 != null) {
                        greed = f3;
                        break;
                    } else {
                        throw Util.unexpectedNull("greed", "greed", reader);
                    }
                case 8:
                    Float f4 = (Float) this.floatAdapter.fromJson(reader);
                    if (f4 != null) {
                        intelligence = f4;
                        break;
                    } else {
                        throw Util.unexpectedNull("intelligence", "intelligence", reader);
                    }
                case 9:
                    Float f5 = (Float) this.floatAdapter.fromJson(reader);
                    if (f5 != null) {
                        leadership = f5;
                        break;
                    } else {
                        throw Util.unexpectedNull("leadership", "leadership", reader);
                    }
                case 10:
                    Float f6 = (Float) this.floatAdapter.fromJson(reader);
                    if (f6 != null) {
                        loyalty = f6;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("loyalty", "loyalty", reader);
                    }
                case 11:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isRetired = bool;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("isRetired", "isRetired", reader);
                    }
                case 12:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        traitDescription = str4;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("traitDescription", "traitDescription", reader);
                    }
                case 13:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        age = num2;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("age", "age", reader);
                    }
                case 14:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        contractWeeks = num3;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("contractWeeks", "contractWeeks", reader);
                    }
                case 15:
                    Float f7 = (Float) this.floatAdapter.fromJson(reader);
                    if (f7 != null) {
                        integrity = f7;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("integrity", "integrity", reader);
                    }
                case 16:
                    Float f8 = (Float) this.floatAdapter.fromJson(reader);
                    if (f8 != null) {
                        communication = f8;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("communication", "communication", reader);
                    }
                case 17:
                    Float f9 = (Float) this.floatAdapter.fromJson(reader);
                    if (f9 != null) {
                        efficiency = f9;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("efficiency", "efficiency", reader);
                    }
                case 18:
                    Float f10 = (Float) this.floatAdapter.fromJson(reader);
                    if (f10 != null) {
                        negotiation = f10;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("negotiation", "negotiation", reader);
                    }
                case 19:
                    Float f11 = (Float) this.floatAdapter.fromJson(reader);
                    if (f11 != null) {
                        ambition = f11;
                        mask0 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("ambition", "ambition", reader);
                    }
                case 20:
                    Float f12 = (Float) this.floatAdapter.fromJson(reader);
                    if (f12 != null) {
                        stressLevel = f12;
                        mask0 &= -1048577;
                        break;
                    } else {
                        throw Util.unexpectedNull("stressLevel", "stressLevel", reader);
                    }
                case 21:
                    Float f13 = (Float) this.floatAdapter.fromJson(reader);
                    if (f13 != null) {
                        happiness = f13;
                        mask0 &= -2097153;
                        break;
                    } else {
                        throw Util.unexpectedNull("happiness", "happiness", reader);
                    }
                case 22:
                    Float f14 = (Float) this.floatAdapter.fromJson(reader);
                    if (f14 != null) {
                        workload = f14;
                        mask0 &= -4194305;
                        break;
                    } else {
                        throw Util.unexpectedNull("workload", "workload", reader);
                    }
                case 23:
                    Float f15 = (Float) this.floatAdapter.fromJson(reader);
                    if (f15 != null) {
                        reputation = f15;
                        mask0 &= -8388609;
                        break;
                    } else {
                        throw Util.unexpectedNull("reputation", "reputation", reader);
                    }
                case 24:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        careerHistory = list;
                        mask0 &= -16777217;
                        break;
                    } else {
                        throw Util.unexpectedNull("careerHistory", "careerHistory", reader);
                    }
                case 25:
                    Map map = (Map) this.mapOfStringBooleanAdapter.fromJson(reader);
                    if (map != null) {
                        permissions = map;
                        mask0 &= -33554433;
                        break;
                    } else {
                        throw Util.unexpectedNull("permissions", "permissions", reader);
                    }
                case 26:
                    Float f16 = (Float) this.floatAdapter.fromJson(reader);
                    if (f16 != null) {
                        rating = f16;
                        mask0 &= -67108865;
                        break;
                    } else {
                        throw Util.unexpectedNull("rating", "rating", reader);
                    }
                case 27:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        investorStyle = str5;
                        mask0 &= -134217729;
                        break;
                    } else {
                        throw Util.unexpectedNull("investorStyle", "investorStyle", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -268434433) {
            String str6 = id;
            if (str6 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str7 = name;
            if (str7 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            String str8 = role;
            if (str8 == null) {
                throw Util.missingProperty("role", "role", reader);
            }
            Double d2 = weeklySalary;
            if (d2 != null) {
                double doubleValue = d2.doubleValue();
                Integer num4 = experience;
                if (num4 != null) {
                    int intValue = num4.intValue();
                    Float f17 = reliability;
                    if (f17 != null) {
                        float floatValue = f17.floatValue();
                        Float f18 = honesty;
                        if (f18 != null) {
                            float floatValue2 = f18.floatValue();
                            Float f19 = greed;
                            if (f19 != null) {
                                float floatValue3 = f19.floatValue();
                                Float f20 = intelligence;
                                if (f20 != null) {
                                    float floatValue4 = f20.floatValue();
                                    Float f21 = leadership;
                                    if (f21 != null) {
                                        float floatValue5 = f21.floatValue();
                                        float floatValue6 = loyalty.floatValue();
                                        boolean booleanValue = isRetired.booleanValue();
                                        String str9 = traitDescription;
                                        Intrinsics.checkNotNull(str9, "null cannot be cast to non-null type kotlin.String");
                                        int intValue2 = age.intValue();
                                        int intValue3 = contractWeeks.intValue();
                                        float floatValue7 = integrity.floatValue();
                                        float floatValue8 = communication.floatValue();
                                        float floatValue9 = efficiency.floatValue();
                                        float floatValue10 = negotiation.floatValue();
                                        float floatValue11 = ambition.floatValue();
                                        float floatValue12 = stressLevel.floatValue();
                                        float floatValue13 = happiness.floatValue();
                                        float floatValue14 = workload.floatValue();
                                        float floatValue15 = reputation.floatValue();
                                        List list2 = careerHistory;
                                        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                        Map map2 = permissions;
                                        Intrinsics.checkNotNull(map2, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
                                        float floatValue16 = rating.floatValue();
                                        String str10 = investorStyle;
                                        Intrinsics.checkNotNull(str10, "null cannot be cast to non-null type kotlin.String");
                                        return new Employee(str6, str7, str8, doubleValue, intValue, floatValue, floatValue2, floatValue3, floatValue4, floatValue5, floatValue6, booleanValue, str9, intValue2, intValue3, floatValue7, floatValue8, floatValue9, floatValue10, floatValue11, floatValue12, floatValue13, floatValue14, floatValue15, list2, map2, floatValue16, str10);
                                    }
                                    throw Util.missingProperty("leadership", "leadership", reader);
                                }
                                throw Util.missingProperty("intelligence", "intelligence", reader);
                            }
                            throw Util.missingProperty("greed", "greed", reader);
                        }
                        throw Util.missingProperty("honesty", "honesty", reader);
                    }
                    throw Util.missingProperty("reliability", "reliability", reader);
                }
                throw Util.missingProperty("experience", "experience", reader);
            }
            throw Util.missingProperty("weeklySalary", "weeklySalary", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = Employee.class.getDeclaredConstructor(String.class, String.class, String.class, Double.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Boolean.TYPE, String.class, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, List.class, Map.class, Float.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[30];
        String str11 = id;
        if (str11 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str11;
        String str12 = name;
        if (str12 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[1] = str12;
        String str13 = role;
        if (str13 == null) {
            throw Util.missingProperty("role", "role", reader);
        }
        objArr[2] = str13;
        Double d3 = weeklySalary;
        if (d3 != null) {
            objArr[3] = Double.valueOf(d3.doubleValue());
            Integer num5 = experience;
            if (num5 != null) {
                objArr[4] = Integer.valueOf(num5.intValue());
                Float f22 = reliability;
                if (f22 != null) {
                    objArr[5] = Float.valueOf(f22.floatValue());
                    Float f23 = honesty;
                    if (f23 != null) {
                        objArr[6] = Float.valueOf(f23.floatValue());
                        Float f24 = greed;
                        if (f24 != null) {
                            objArr[7] = Float.valueOf(f24.floatValue());
                            Float f25 = intelligence;
                            if (f25 != null) {
                                objArr[8] = Float.valueOf(f25.floatValue());
                                Float f26 = leadership;
                                if (f26 != null) {
                                    objArr[9] = Float.valueOf(f26.floatValue());
                                    objArr[10] = loyalty;
                                    objArr[11] = isRetired;
                                    objArr[12] = traitDescription;
                                    objArr[13] = age;
                                    objArr[14] = contractWeeks;
                                    objArr[15] = integrity;
                                    objArr[16] = communication;
                                    objArr[17] = efficiency;
                                    objArr[18] = negotiation;
                                    objArr[19] = ambition;
                                    objArr[20] = stressLevel;
                                    objArr[21] = happiness;
                                    objArr[22] = workload;
                                    objArr[23] = reputation;
                                    objArr[24] = careerHistory;
                                    objArr[25] = permissions;
                                    objArr[26] = rating;
                                    objArr[27] = investorStyle;
                                    objArr[28] = Integer.valueOf(mask0);
                                    objArr[29] = null;
                                    Employee newInstance = localConstructor.newInstance(objArr);
                                    Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                                    return newInstance;
                                }
                                throw Util.missingProperty("leadership", "leadership", reader);
                            }
                            throw Util.missingProperty("intelligence", "intelligence", reader);
                        }
                        throw Util.missingProperty("greed", "greed", reader);
                    }
                    throw Util.missingProperty("honesty", "honesty", reader);
                }
                throw Util.missingProperty("reliability", "reliability", reader);
            }
            throw Util.missingProperty("experience", "experience", reader);
        }
        throw Util.missingProperty("weeklySalary", "weeklySalary", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable Employee value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("role");
        this.stringAdapter.toJson(writer, value_.getRole());
        writer.name("weeklySalary");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWeeklySalary()));
        writer.name("experience");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getExperience()));
        writer.name("reliability");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getReliability()));
        writer.name("honesty");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getHonesty()));
        writer.name("greed");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getGreed()));
        writer.name("intelligence");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getIntelligence()));
        writer.name("leadership");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLeadership()));
        writer.name("loyalty");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLoyalty()));
        writer.name("isRetired");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isRetired()));
        writer.name("traitDescription");
        this.stringAdapter.toJson(writer, value_.getTraitDescription());
        writer.name("age");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getAge()));
        writer.name("contractWeeks");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getContractWeeks()));
        writer.name("integrity");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getIntegrity()));
        writer.name("communication");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getCommunication()));
        writer.name("efficiency");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getEfficiency()));
        writer.name("negotiation");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getNegotiation()));
        writer.name("ambition");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getAmbition()));
        writer.name("stressLevel");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getStressLevel()));
        writer.name("happiness");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getHappiness()));
        writer.name("workload");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getWorkload()));
        writer.name("reputation");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getReputation()));
        writer.name("careerHistory");
        this.listOfStringAdapter.toJson(writer, value_.getCareerHistory());
        writer.name("permissions");
        this.mapOfStringBooleanAdapter.toJson(writer, value_.getPermissions());
        writer.name("rating");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getRating()));
        writer.name("investorStyle");
        this.stringAdapter.toJson(writer, value_.getInvestorStyle());
        writer.endObject();
    }
}
