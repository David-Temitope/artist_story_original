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
/* compiled from: SecurityCyberStateJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u000b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0018"}, d2 = {"Lcom/example/data/SecurityCyberStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/SecurityCyberState;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "booleanAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: SecurityCyberStateJsonAdapter.class */
public final class SecurityCyberStateJsonAdapter extends JsonAdapter<SecurityCyberState> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @Nullable
    private volatile Constructor<SecurityCyberState> constructorRef;
    public static final int $stable = 8;

    public SecurityCyberStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"hiredSecurityCompany", "hasCyberInsurance", "hasStudioInsurance"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "hiredSecurityCompany");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Boolean> adapter2 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "hasCyberInsurance");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.booleanAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("GeneratedJsonAdapter(").append("SecurityCyberState").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public SecurityCyberState m146fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String hiredSecurityCompany = null;
        Boolean hasCyberInsurance = false;
        Boolean hasStudioInsurance = false;
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
                        hiredSecurityCompany = str;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("hiredSecurityCompany", "hiredSecurityCompany", reader);
                    }
                case 1:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        hasCyberInsurance = bool;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasCyberInsurance", "hasCyberInsurance", reader);
                    }
                case 2:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        hasStudioInsurance = bool2;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasStudioInsurance", "hasStudioInsurance", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -8) {
            String str2 = hiredSecurityCompany;
            Intrinsics.checkNotNull(str2, "null cannot be cast to non-null type kotlin.String");
            return new SecurityCyberState(str2, hasCyberInsurance.booleanValue(), hasStudioInsurance.booleanValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = SecurityCyberState.class.getDeclaredConstructor(String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        SecurityCyberState newInstance = localConstructor.newInstance(hiredSecurityCompany, hasCyberInsurance, hasStudioInsurance, Integer.valueOf(mask0), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable SecurityCyberState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("hiredSecurityCompany");
        this.stringAdapter.toJson(writer, value_.getHiredSecurityCompany());
        writer.name("hasCyberInsurance");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasCyberInsurance()));
        writer.name("hasStudioInsurance");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasStudioInsurance()));
        writer.endObject();
    }
}
