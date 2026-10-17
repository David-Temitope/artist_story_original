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
/* compiled from: ActionFeedbackJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"Lcom/example/data/ActionFeedbackJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/ActionFeedback;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "listOfStatFeedbackItemAdapter", "", "Lcom/example/data/StatFeedbackItem;", "longAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: ActionFeedbackJsonAdapter.class */
public final class ActionFeedbackJsonAdapter extends JsonAdapter<ActionFeedback> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<List<StatFeedbackItem>> listOfStatFeedbackItemAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @Nullable
    private volatile Constructor<ActionFeedback> constructorRef;
    public static final int $stable = 8;

    public ActionFeedbackJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "title", "subtitle", "deltas", "iconType", "timestamp"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<List<StatFeedbackItem>> adapter2 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{StatFeedbackItem.class}), SetsKt.emptySet(), "deltas");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.listOfStatFeedbackItemAdapter = adapter2;
        JsonAdapter<Long> adapter3 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "timestamp");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.longAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(").append("ActionFeedback").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public ActionFeedback m2fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String title = null;
        String subtitle = null;
        List deltas = null;
        String iconType = null;
        Long timestamp = 0L;
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
                        title = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("title", "title", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        subtitle = str3;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("subtitle", "subtitle", reader);
                    }
                case 3:
                    List list = (List) this.listOfStatFeedbackItemAdapter.fromJson(reader);
                    if (list != null) {
                        deltas = list;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("deltas", "deltas", reader);
                    }
                case 4:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        iconType = str4;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("iconType", "iconType", reader);
                    }
                case 5:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        timestamp = l;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("timestamp", "timestamp", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -61) {
            String str5 = id;
            if (str5 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str6 = title;
            if (str6 == null) {
                throw Util.missingProperty("title", "title", reader);
            }
            String str7 = subtitle;
            Intrinsics.checkNotNull(str7, "null cannot be cast to non-null type kotlin.String");
            List list2 = deltas;
            Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.StatFeedbackItem>");
            String str8 = iconType;
            Intrinsics.checkNotNull(str8, "null cannot be cast to non-null type kotlin.String");
            return new ActionFeedback(str5, str6, str7, list2, str8, timestamp.longValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = ActionFeedback.class.getDeclaredConstructor(String.class, String.class, String.class, List.class, String.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[8];
        String str9 = id;
        if (str9 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str9;
        String str10 = title;
        if (str10 == null) {
            throw Util.missingProperty("title", "title", reader);
        }
        objArr[1] = str10;
        objArr[2] = subtitle;
        objArr[3] = deltas;
        objArr[4] = iconType;
        objArr[5] = timestamp;
        objArr[6] = Integer.valueOf(mask0);
        objArr[7] = null;
        ActionFeedback newInstance = localConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable ActionFeedback value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.name("subtitle");
        this.stringAdapter.toJson(writer, value_.getSubtitle());
        writer.name("deltas");
        this.listOfStatFeedbackItemAdapter.toJson(writer, value_.getDeltas());
        writer.name("iconType");
        this.stringAdapter.toJson(writer, value_.getIconType());
        writer.name("timestamp");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getTimestamp()));
        writer.endObject();
    }
}
