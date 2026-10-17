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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CareerDilemmaJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"Lcom/example/data/CareerDilemmaJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/CareerDilemma;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "intAdapter", "", "listOfDilemmaChoiceAdapter", "", "Lcom/example/data/DilemmaChoice;", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: CareerDilemmaJsonAdapter.class */
public final class CareerDilemmaJsonAdapter extends JsonAdapter<CareerDilemma> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<List<DilemmaChoice>> listOfDilemmaChoiceAdapter;
    @Nullable
    private volatile Constructor<CareerDilemma> constructorRef;
    public static final int $stable = 8;

    public CareerDilemmaJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "category", "headline", "situationNarrative", "stakeholders", "stakes", "urgencyTag", "week", "year", "choices"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Integer> adapter2 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "week");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.intAdapter = adapter2;
        JsonAdapter<List<DilemmaChoice>> adapter3 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{DilemmaChoice.class}), SetsKt.emptySet(), "choices");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.listOfDilemmaChoiceAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(").append("CareerDilemma").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public CareerDilemma m40fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String category = null;
        String headline = null;
        String situationNarrative = null;
        String stakeholders = null;
        String stakes = null;
        String urgencyTag = null;
        Integer week = 0;
        Integer year = 0;
        List choices = null;
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
                        category = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("category", "category", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        headline = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("headline", "headline", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        situationNarrative = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("situationNarrative", "situationNarrative", reader);
                    }
                case 4:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        stakeholders = str5;
                        break;
                    } else {
                        throw Util.unexpectedNull("stakeholders", "stakeholders", reader);
                    }
                case 5:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        stakes = str6;
                        break;
                    } else {
                        throw Util.unexpectedNull("stakes", "stakes", reader);
                    }
                case 6:
                    String str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 != null) {
                        urgencyTag = str7;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("urgencyTag", "urgencyTag", reader);
                    }
                case 7:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        week = num;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("week", "week", reader);
                    }
                case 8:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        year = num2;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("year", "year", reader);
                    }
                case 9:
                    List list = (List) this.listOfDilemmaChoiceAdapter.fromJson(reader);
                    if (list != null) {
                        choices = list;
                        break;
                    } else {
                        throw Util.unexpectedNull("choices", "choices", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -449) {
            String str8 = id;
            if (str8 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str9 = category;
            if (str9 == null) {
                throw Util.missingProperty("category", "category", reader);
            }
            String str10 = headline;
            if (str10 == null) {
                throw Util.missingProperty("headline", "headline", reader);
            }
            String str11 = situationNarrative;
            if (str11 == null) {
                throw Util.missingProperty("situationNarrative", "situationNarrative", reader);
            }
            String str12 = stakeholders;
            if (str12 == null) {
                throw Util.missingProperty("stakeholders", "stakeholders", reader);
            }
            String str13 = stakes;
            if (str13 == null) {
                throw Util.missingProperty("stakes", "stakes", reader);
            }
            String str14 = urgencyTag;
            Intrinsics.checkNotNull(str14, "null cannot be cast to non-null type kotlin.String");
            int intValue = week.intValue();
            int intValue2 = year.intValue();
            List list2 = choices;
            if (list2 == null) {
                throw Util.missingProperty("choices", "choices", reader);
            }
            return new CareerDilemma(str8, str9, str10, str11, str12, str13, str14, intValue, intValue2, list2);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = CareerDilemma.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[12];
        String str15 = id;
        if (str15 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str15;
        String str16 = category;
        if (str16 == null) {
            throw Util.missingProperty("category", "category", reader);
        }
        objArr[1] = str16;
        String str17 = headline;
        if (str17 == null) {
            throw Util.missingProperty("headline", "headline", reader);
        }
        objArr[2] = str17;
        String str18 = situationNarrative;
        if (str18 == null) {
            throw Util.missingProperty("situationNarrative", "situationNarrative", reader);
        }
        objArr[3] = str18;
        String str19 = stakeholders;
        if (str19 == null) {
            throw Util.missingProperty("stakeholders", "stakeholders", reader);
        }
        objArr[4] = str19;
        String str20 = stakes;
        if (str20 == null) {
            throw Util.missingProperty("stakes", "stakes", reader);
        }
        objArr[5] = str20;
        objArr[6] = urgencyTag;
        objArr[7] = week;
        objArr[8] = year;
        List list3 = choices;
        if (list3 == null) {
            throw Util.missingProperty("choices", "choices", reader);
        }
        objArr[9] = list3;
        objArr[10] = Integer.valueOf(mask0);
        objArr[11] = null;
        CareerDilemma newInstance = localConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable CareerDilemma value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("category");
        this.stringAdapter.toJson(writer, value_.getCategory());
        writer.name("headline");
        this.stringAdapter.toJson(writer, value_.getHeadline());
        writer.name("situationNarrative");
        this.stringAdapter.toJson(writer, value_.getSituationNarrative());
        writer.name("stakeholders");
        this.stringAdapter.toJson(writer, value_.getStakeholders());
        writer.name("stakes");
        this.stringAdapter.toJson(writer, value_.getStakes());
        writer.name("urgencyTag");
        this.stringAdapter.toJson(writer, value_.getUrgencyTag());
        writer.name("week");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeek()));
        writer.name("year");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYear()));
        writer.name("choices");
        this.listOfDilemmaChoiceAdapter.toJson(writer, value_.getChoices());
        writer.endObject();
    }
}
