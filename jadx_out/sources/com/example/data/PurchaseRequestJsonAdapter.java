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
/* compiled from: PurchaseRequestJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0011\u001a\u00020\nH\u0016J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001a"}, d2 = {"Lcom/example/data/PurchaseRequestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/PurchaseRequest;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "intAdapter", "", "longAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nPurchaseRequestJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PurchaseRequestJsonAdapter.kt\ncom/example/data/PurchaseRequestJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
/* loaded from: PurchaseRequestJsonAdapter.class */
public final class PurchaseRequestJsonAdapter extends JsonAdapter<PurchaseRequest> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @Nullable
    private volatile Constructor<PurchaseRequest> constructorRef;
    public static final int $stable = 8;

    public PurchaseRequestJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "playerEmail", "playerName", "type", "amount", "status", "timestamp"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Integer> adapter2 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "amount");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.intAdapter = adapter2;
        JsonAdapter<Long> adapter3 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "timestamp");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.longAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(37);
        sb.append("GeneratedJsonAdapter(").append("PurchaseRequest").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public PurchaseRequest m141fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String playerEmail = null;
        String playerName = null;
        String type = null;
        Integer amount = null;
        String status = null;
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
                        playerEmail = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("playerEmail", "playerEmail", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        playerName = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("playerName", "playerName", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        type = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("type", "type", reader);
                    }
                case 4:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        amount = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("amount", "amount", reader);
                    }
                case 5:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        status = str5;
                        break;
                    } else {
                        throw Util.unexpectedNull("status", "status", reader);
                    }
                case 6:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        timestamp = l;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("timestamp", "timestamp", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -65) {
            String str6 = id;
            if (str6 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str7 = playerEmail;
            if (str7 == null) {
                throw Util.missingProperty("playerEmail", "playerEmail", reader);
            }
            String str8 = playerName;
            if (str8 == null) {
                throw Util.missingProperty("playerName", "playerName", reader);
            }
            String str9 = type;
            if (str9 == null) {
                throw Util.missingProperty("type", "type", reader);
            }
            Integer num2 = amount;
            if (num2 != null) {
                int intValue = num2.intValue();
                String str10 = status;
                if (str10 == null) {
                    throw Util.missingProperty("status", "status", reader);
                }
                return new PurchaseRequest(str6, str7, str8, str9, intValue, str10, timestamp.longValue());
            }
            throw Util.missingProperty("amount", "amount", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = PurchaseRequest.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Integer.TYPE, String.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[9];
        String str11 = id;
        if (str11 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str11;
        String str12 = playerEmail;
        if (str12 == null) {
            throw Util.missingProperty("playerEmail", "playerEmail", reader);
        }
        objArr[1] = str12;
        String str13 = playerName;
        if (str13 == null) {
            throw Util.missingProperty("playerName", "playerName", reader);
        }
        objArr[2] = str13;
        String str14 = type;
        if (str14 == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        objArr[3] = str14;
        Integer num3 = amount;
        if (num3 != null) {
            objArr[4] = Integer.valueOf(num3.intValue());
            String str15 = status;
            if (str15 == null) {
                throw Util.missingProperty("status", "status", reader);
            }
            objArr[5] = str15;
            objArr[6] = timestamp;
            objArr[7] = Integer.valueOf(mask0);
            objArr[8] = null;
            PurchaseRequest newInstance = localConstructor.newInstance(objArr);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        throw Util.missingProperty("amount", "amount", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable PurchaseRequest value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("playerEmail");
        this.stringAdapter.toJson(writer, value_.getPlayerEmail());
        writer.name("playerName");
        this.stringAdapter.toJson(writer, value_.getPlayerName());
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("amount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getAmount()));
        writer.name("status");
        this.stringAdapter.toJson(writer, value_.getStatus());
        writer.name("timestamp");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getTimestamp()));
        writer.endObject();
    }
}
