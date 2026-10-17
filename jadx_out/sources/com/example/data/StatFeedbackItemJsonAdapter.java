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
/* compiled from: StatFeedbackItemJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0018"}, d2 = {"Lcom/example/data/StatFeedbackItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/StatFeedbackItem;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: StatFeedbackItemJsonAdapter.class */
public final class StatFeedbackItemJsonAdapter extends JsonAdapter<StatFeedbackItem> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<StatFeedbackItem> constructorRef;
    public static final int $stable = 8;

    public StatFeedbackItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"label", "deltaText", "isPositive", "category"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "label");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Boolean> adapter2 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isPositive");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.booleanAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(").append("StatFeedbackItem").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public StatFeedbackItem m164fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String label = null;
        String deltaText = null;
        Boolean isPositive = false;
        String category = null;
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
                        label = str;
                        break;
                    } else {
                        throw Util.unexpectedNull("label", "label", reader);
                    }
                case 1:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        deltaText = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("deltaText", "deltaText", reader);
                    }
                case 2:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isPositive = bool;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("isPositive", "isPositive", reader);
                    }
                case 3:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        category = str3;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("category", "category", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -13) {
            String str4 = label;
            if (str4 == null) {
                throw Util.missingProperty("label", "label", reader);
            }
            String str5 = deltaText;
            if (str5 == null) {
                throw Util.missingProperty("deltaText", "deltaText", reader);
            }
            boolean booleanValue = isPositive.booleanValue();
            String str6 = category;
            Intrinsics.checkNotNull(str6, "null cannot be cast to non-null type kotlin.String");
            return new StatFeedbackItem(str4, str5, booleanValue, str6);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = StatFeedbackItem.class.getDeclaredConstructor(String.class, String.class, Boolean.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[6];
        String str7 = label;
        if (str7 == null) {
            throw Util.missingProperty("label", "label", reader);
        }
        objArr[0] = str7;
        String str8 = deltaText;
        if (str8 == null) {
            throw Util.missingProperty("deltaText", "deltaText", reader);
        }
        objArr[1] = str8;
        objArr[2] = isPositive;
        objArr[3] = category;
        objArr[4] = Integer.valueOf(mask0);
        objArr[5] = null;
        StatFeedbackItem newInstance = localConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable StatFeedbackItem value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("label");
        this.stringAdapter.toJson(writer, value_.getLabel());
        writer.name("deltaText");
        this.stringAdapter.toJson(writer, value_.getDeltaText());
        writer.name("isPositive");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isPositive()));
        writer.name("category");
        this.stringAdapter.toJson(writer, value_.getCategory());
        writer.endObject();
    }
}
