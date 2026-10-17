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
/* compiled from: LuxuryItemJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0018"}, d2 = {"Lcom/example/data/LuxuryItemJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/LuxuryItem;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: LuxuryItemJsonAdapter.class */
public final class LuxuryItemJsonAdapter extends JsonAdapter<LuxuryItem> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @Nullable
    private volatile Constructor<LuxuryItem> constructorRef;
    public static final int $stable = 8;

    public LuxuryItemJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "name", "description", "cost", "perks", "unlockRequirement"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "cost");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("GeneratedJsonAdapter(").append("LuxuryItem").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public LuxuryItem m104fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String name = null;
        String description = null;
        Double cost = null;
        String perks = null;
        String unlockRequirement = null;
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
                        description = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("description", "description", reader);
                    }
                case 3:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        cost = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("cost", "cost", reader);
                    }
                case 4:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        perks = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("perks", "perks", reader);
                    }
                case 5:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        unlockRequirement = str5;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("unlockRequirement", "unlockRequirement", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -33) {
            String str6 = id;
            if (str6 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str7 = name;
            if (str7 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            String str8 = description;
            if (str8 == null) {
                throw Util.missingProperty("description", "description", reader);
            }
            Double d2 = cost;
            if (d2 != null) {
                double doubleValue = d2.doubleValue();
                String str9 = perks;
                if (str9 == null) {
                    throw Util.missingProperty("perks", "perks", reader);
                }
                String str10 = unlockRequirement;
                Intrinsics.checkNotNull(str10, "null cannot be cast to non-null type kotlin.String");
                return new LuxuryItem(str6, str7, str8, doubleValue, str9, str10);
            }
            throw Util.missingProperty("cost", "cost", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = LuxuryItem.class.getDeclaredConstructor(String.class, String.class, String.class, Double.TYPE, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[8];
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
        String str13 = description;
        if (str13 == null) {
            throw Util.missingProperty("description", "description", reader);
        }
        objArr[2] = str13;
        Double d3 = cost;
        if (d3 != null) {
            objArr[3] = Double.valueOf(d3.doubleValue());
            String str14 = perks;
            if (str14 == null) {
                throw Util.missingProperty("perks", "perks", reader);
            }
            objArr[4] = str14;
            objArr[5] = unlockRequirement;
            objArr[6] = Integer.valueOf(mask0);
            objArr[7] = null;
            LuxuryItem newInstance = localConstructor.newInstance(objArr);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        throw Util.missingProperty("cost", "cost", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable LuxuryItem value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("description");
        this.stringAdapter.toJson(writer, value_.getDescription());
        writer.name("cost");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCost()));
        writer.name("perks");
        this.stringAdapter.toJson(writer, value_.getPerks());
        writer.name("unlockRequirement");
        this.stringAdapter.toJson(writer, value_.getUnlockRequirement());
        writer.endObject();
    }
}
