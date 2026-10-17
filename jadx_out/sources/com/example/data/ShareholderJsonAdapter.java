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
/* compiled from: ShareholderJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0007\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001a"}, d2 = {"Lcom/example/data/ShareholderJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/Shareholder;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "floatAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nShareholderJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShareholderJsonAdapter.kt\ncom/example/data/ShareholderJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"})
/* loaded from: ShareholderJsonAdapter.class */
public final class ShareholderJsonAdapter extends JsonAdapter<Shareholder> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<Shareholder> constructorRef;
    public static final int $stable = 8;

    public ShareholderJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"name", "equityShare", "type", "boardSeat", "satisfaction"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "name");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Float> adapter2 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "equityShare");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.floatAdapter = adapter2;
        JsonAdapter<Boolean> adapter3 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "boardSeat");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.booleanAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("Shareholder").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public Shareholder m149fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String name = null;
        Float equityShare = null;
        String type = null;
        Boolean boardSeat = false;
        Float satisfaction = Float.valueOf(0.0f);
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
                        name = str;
                        break;
                    } else {
                        throw Util.unexpectedNull("name", "name", reader);
                    }
                case 1:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        equityShare = f;
                        break;
                    } else {
                        throw Util.unexpectedNull("equityShare", "equityShare", reader);
                    }
                case 2:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        type = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("type", "type", reader);
                    }
                case 3:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        boardSeat = bool;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("boardSeat", "boardSeat", reader);
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
            }
        }
        reader.endObject();
        if (mask0 == -25) {
            String str3 = name;
            if (str3 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            Float f3 = equityShare;
            if (f3 != null) {
                float floatValue = f3.floatValue();
                String str4 = type;
                if (str4 == null) {
                    throw Util.missingProperty("type", "type", reader);
                }
                return new Shareholder(str3, floatValue, str4, boardSeat.booleanValue(), satisfaction.floatValue());
            }
            throw Util.missingProperty("equityShare", "equityShare", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = Shareholder.class.getDeclaredConstructor(String.class, Float.TYPE, String.class, Boolean.TYPE, Float.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[7];
        String str5 = name;
        if (str5 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[0] = str5;
        Float f4 = equityShare;
        if (f4 != null) {
            objArr[1] = Float.valueOf(f4.floatValue());
            String str6 = type;
            if (str6 == null) {
                throw Util.missingProperty("type", "type", reader);
            }
            objArr[2] = str6;
            objArr[3] = boardSeat;
            objArr[4] = satisfaction;
            objArr[5] = Integer.valueOf(mask0);
            objArr[6] = null;
            Shareholder newInstance = localConstructor.newInstance(objArr);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        throw Util.missingProperty("equityShare", "equityShare", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable Shareholder value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("equityShare");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getEquityShare()));
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("boardSeat");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getBoardSeat()));
        writer.name("satisfaction");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getSatisfaction()));
        writer.endObject();
    }
}
