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
/* compiled from: BoardMemberJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0018"}, d2 = {"Lcom/example/data/BoardMemberJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/BoardMember;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "floatAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: BoardMemberJsonAdapter.class */
public final class BoardMemberJsonAdapter extends JsonAdapter<BoardMember> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @Nullable
    private volatile Constructor<BoardMember> constructorRef;
    public static final int $stable = 8;

    public BoardMemberJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "type", "powerWeight", "satisfaction", "alignment"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "powerWeight");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("BoardMember").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public BoardMember m26fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        String type = null;
        Float powerWeight = null;
        Float satisfaction = Float.valueOf(0.0f);
        String alignment = null;
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
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        powerWeight = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("powerWeight", "powerWeight", reader);
                    }
                case 4:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        satisfaction = f2;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("satisfaction", "satisfaction", reader);
                    }
                case 5:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        alignment = str4;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("alignment", "alignment", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -49) {
            String str5 = id;
            if (str5 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str6 = name;
            if (str6 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            String str7 = type;
            if (str7 == null) {
                throw Util.missingProperty("type", "type", reader);
            }
            Float f3 = powerWeight;
            if (f3 != null) {
                float floatValue = f3.floatValue();
                float floatValue2 = satisfaction.floatValue();
                String str8 = alignment;
                Intrinsics.checkNotNull(str8, "null cannot be cast to non-null type kotlin.String");
                return new BoardMember(str5, str6, str7, floatValue, floatValue2, str8);
            }
            throw Util.missingProperty("powerWeight", "powerWeight", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = BoardMember.class.getDeclaredConstructor(String.class, String.class, String.class, Float.TYPE, Float.TYPE, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
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
        String str10 = name;
        if (str10 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[1] = str10;
        String str11 = type;
        if (str11 == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        objArr[2] = str11;
        Float f4 = powerWeight;
        if (f4 != null) {
            objArr[3] = Float.valueOf(f4.floatValue());
            objArr[4] = satisfaction;
            objArr[5] = alignment;
            objArr[6] = Integer.valueOf(mask0);
            objArr[7] = null;
            BoardMember newInstance = localConstructor.newInstance(objArr);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        throw Util.missingProperty("powerWeight", "powerWeight", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable BoardMember value_) {
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
        writer.name("powerWeight");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getPowerWeight()));
        writer.name("satisfaction");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getSatisfaction()));
        writer.name("alignment");
        this.stringAdapter.toJson(writer, value_.getAlignment());
        writer.endObject();
    }
}
