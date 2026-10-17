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
/* compiled from: ChatConversationJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"Lcom/example/data/ChatConversationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/ChatConversation;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "listOfChatMessageAdapter", "", "Lcom/example/data/ChatMessage;", "intAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: ChatConversationJsonAdapter.class */
public final class ChatConversationJsonAdapter extends JsonAdapter<ChatConversation> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<List<ChatMessage>> listOfChatMessageAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @Nullable
    private volatile Constructor<ChatConversation> constructorRef;
    public static final int $stable = 8;

    public ChatConversationJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"npcId", "npcName", "messages", "unreadCount"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "npcId");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<List<ChatMessage>> adapter2 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{ChatMessage.class}), SetsKt.emptySet(), "messages");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.listOfChatMessageAdapter = adapter2;
        JsonAdapter<Integer> adapter3 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "unreadCount");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.intAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(").append("ChatConversation").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public ChatConversation m52fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String npcId = null;
        String npcName = null;
        List messages = null;
        Integer unreadCount = 0;
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
                        npcId = str;
                        break;
                    } else {
                        throw Util.unexpectedNull("npcId", "npcId", reader);
                    }
                case 1:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        npcName = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("npcName", "npcName", reader);
                    }
                case 2:
                    List list = (List) this.listOfChatMessageAdapter.fromJson(reader);
                    if (list != null) {
                        messages = list;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("messages", "messages", reader);
                    }
                case 3:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        unreadCount = num;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("unreadCount", "unreadCount", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -13) {
            String str3 = npcId;
            if (str3 == null) {
                throw Util.missingProperty("npcId", "npcId", reader);
            }
            String str4 = npcName;
            if (str4 == null) {
                throw Util.missingProperty("npcName", "npcName", reader);
            }
            List list2 = messages;
            Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.ChatMessage>");
            return new ChatConversation(str3, str4, list2, unreadCount.intValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = ChatConversation.class.getDeclaredConstructor(String.class, String.class, List.class, Integer.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[6];
        String str5 = npcId;
        if (str5 == null) {
            throw Util.missingProperty("npcId", "npcId", reader);
        }
        objArr[0] = str5;
        String str6 = npcName;
        if (str6 == null) {
            throw Util.missingProperty("npcName", "npcName", reader);
        }
        objArr[1] = str6;
        objArr[2] = messages;
        objArr[3] = unreadCount;
        objArr[4] = Integer.valueOf(mask0);
        objArr[5] = null;
        ChatConversation newInstance = localConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable ChatConversation value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("npcId");
        this.stringAdapter.toJson(writer, value_.getNpcId());
        writer.name("npcName");
        this.stringAdapter.toJson(writer, value_.getNpcName());
        writer.name("messages");
        this.listOfChatMessageAdapter.toJson(writer, value_.getMessages());
        writer.name("unreadCount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getUnreadCount()));
        writer.endObject();
    }
}
