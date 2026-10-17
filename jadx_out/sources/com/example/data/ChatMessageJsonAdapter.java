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
/* compiled from: ChatMessageJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0018"}, d2 = {"Lcom/example/data/ChatMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/ChatMessage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "longAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: ChatMessageJsonAdapter.class */
public final class ChatMessageJsonAdapter extends JsonAdapter<ChatMessage> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @Nullable
    private volatile Constructor<ChatMessage> constructorRef;
    public static final int $stable = 8;

    public ChatMessageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "senderId", "senderName", "message", "timestamp"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Long> adapter2 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "timestamp");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.longAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("ChatMessage").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public ChatMessage m55fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String senderId = null;
        String senderName = null;
        String message = null;
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
                        senderId = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("senderId", "senderId", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        senderName = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("senderName", "senderName", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        message = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("message", "message", reader);
                    }
                case 4:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        timestamp = l;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("timestamp", "timestamp", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -17) {
            String str5 = id;
            if (str5 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str6 = senderId;
            if (str6 == null) {
                throw Util.missingProperty("senderId", "senderId", reader);
            }
            String str7 = senderName;
            if (str7 == null) {
                throw Util.missingProperty("senderName", "senderName", reader);
            }
            String str8 = message;
            if (str8 == null) {
                throw Util.missingProperty("message", "message", reader);
            }
            return new ChatMessage(str5, str6, str7, str8, timestamp.longValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = ChatMessage.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[7];
        String str9 = id;
        if (str9 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str9;
        String str10 = senderId;
        if (str10 == null) {
            throw Util.missingProperty("senderId", "senderId", reader);
        }
        objArr[1] = str10;
        String str11 = senderName;
        if (str11 == null) {
            throw Util.missingProperty("senderName", "senderName", reader);
        }
        objArr[2] = str11;
        String str12 = message;
        if (str12 == null) {
            throw Util.missingProperty("message", "message", reader);
        }
        objArr[3] = str12;
        objArr[4] = timestamp;
        objArr[5] = Integer.valueOf(mask0);
        objArr[6] = null;
        ChatMessage newInstance = localConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable ChatMessage value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("senderId");
        this.stringAdapter.toJson(writer, value_.getSenderId());
        writer.name("senderName");
        this.stringAdapter.toJson(writer, value_.getSenderName());
        writer.name("message");
        this.stringAdapter.toJson(writer, value_.getMessage());
        writer.name("timestamp");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getTimestamp()));
        writer.endObject();
    }
}
