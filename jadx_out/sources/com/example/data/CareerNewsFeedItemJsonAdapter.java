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
/* compiled from: CareerNewsFeedItemJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"Lcom/example/data/CareerNewsFeedItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/CareerNewsFeedItem;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "intAdapter", "", "booleanAdapter", "", "nullableStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nCareerNewsFeedItemJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CareerNewsFeedItemJsonAdapter.kt\ncom/example/data/CareerNewsFeedItemJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,167:1\n1#2:168\n*E\n"})
/* loaded from: CareerNewsFeedItemJsonAdapter.class */
public final class CareerNewsFeedItemJsonAdapter extends JsonAdapter<CareerNewsFeedItem> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @Nullable
    private volatile Constructor<CareerNewsFeedItem> constructorRef;
    public static final int $stable = 8;

    public CareerNewsFeedItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "category", "headline", "detailedBody", "sourceOutlet", "week", "year", "severity", "isViral", "actionSuggestion"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Integer> adapter2 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "week");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.intAdapter = adapter2;
        JsonAdapter<Boolean> adapter3 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isViral");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.booleanAdapter = adapter3;
        JsonAdapter<String> adapter4 = moshi.adapter(String.class, SetsKt.emptySet(), "actionSuggestion");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.nullableStringAdapter = adapter4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(").append("CareerNewsFeedItem").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public CareerNewsFeedItem m43fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String category = null;
        String headline = null;
        String detailedBody = null;
        String sourceOutlet = null;
        Integer week = null;
        Integer year = null;
        String severity = null;
        Boolean isViral = false;
        String actionSuggestion = null;
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
                        detailedBody = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("detailedBody", "detailedBody", reader);
                    }
                case 4:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        sourceOutlet = str5;
                        break;
                    } else {
                        throw Util.unexpectedNull("sourceOutlet", "sourceOutlet", reader);
                    }
                case 5:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        week = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("week", "week", reader);
                    }
                case 6:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        year = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("year", "year", reader);
                    }
                case 7:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        severity = str6;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("severity", "severity", reader);
                    }
                case 8:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isViral = bool;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("isViral", "isViral", reader);
                    }
                case 9:
                    actionSuggestion = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -513;
                    break;
            }
        }
        reader.endObject();
        if (mask0 == -897) {
            String str7 = id;
            if (str7 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str8 = category;
            if (str8 == null) {
                throw Util.missingProperty("category", "category", reader);
            }
            String str9 = headline;
            if (str9 == null) {
                throw Util.missingProperty("headline", "headline", reader);
            }
            String str10 = detailedBody;
            if (str10 == null) {
                throw Util.missingProperty("detailedBody", "detailedBody", reader);
            }
            String str11 = sourceOutlet;
            if (str11 == null) {
                throw Util.missingProperty("sourceOutlet", "sourceOutlet", reader);
            }
            Integer num3 = week;
            if (num3 != null) {
                int intValue = num3.intValue();
                Integer num4 = year;
                if (num4 != null) {
                    int intValue2 = num4.intValue();
                    String str12 = severity;
                    Intrinsics.checkNotNull(str12, "null cannot be cast to non-null type kotlin.String");
                    return new CareerNewsFeedItem(str7, str8, str9, str10, str11, intValue, intValue2, str12, isViral.booleanValue(), actionSuggestion);
                }
                throw Util.missingProperty("year", "year", reader);
            }
            throw Util.missingProperty("week", "week", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = CareerNewsFeedItem.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[12];
        String str13 = id;
        if (str13 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str13;
        String str14 = category;
        if (str14 == null) {
            throw Util.missingProperty("category", "category", reader);
        }
        objArr[1] = str14;
        String str15 = headline;
        if (str15 == null) {
            throw Util.missingProperty("headline", "headline", reader);
        }
        objArr[2] = str15;
        String str16 = detailedBody;
        if (str16 == null) {
            throw Util.missingProperty("detailedBody", "detailedBody", reader);
        }
        objArr[3] = str16;
        String str17 = sourceOutlet;
        if (str17 == null) {
            throw Util.missingProperty("sourceOutlet", "sourceOutlet", reader);
        }
        objArr[4] = str17;
        Integer num5 = week;
        if (num5 != null) {
            objArr[5] = Integer.valueOf(num5.intValue());
            Integer num6 = year;
            if (num6 != null) {
                objArr[6] = Integer.valueOf(num6.intValue());
                objArr[7] = severity;
                objArr[8] = isViral;
                objArr[9] = actionSuggestion;
                objArr[10] = Integer.valueOf(mask0);
                objArr[11] = null;
                CareerNewsFeedItem newInstance = localConstructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw Util.missingProperty("year", "year", reader);
        }
        throw Util.missingProperty("week", "week", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable CareerNewsFeedItem value_) {
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
        writer.name("detailedBody");
        this.stringAdapter.toJson(writer, value_.getDetailedBody());
        writer.name("sourceOutlet");
        this.stringAdapter.toJson(writer, value_.getSourceOutlet());
        writer.name("week");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeek()));
        writer.name("year");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getYear()));
        writer.name("severity");
        this.stringAdapter.toJson(writer, value_.getSeverity());
        writer.name("isViral");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isViral()));
        writer.name("actionSuggestion");
        this.nullableStringAdapter.toJson(writer, value_.getActionSuggestion());
        writer.endObject();
    }
}
