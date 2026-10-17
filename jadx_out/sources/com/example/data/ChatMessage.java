package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/example/data/ChatMessage;", "", "id", "", "senderId", "senderName", "message", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getSenderId", "getSenderName", "getMessage", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: ChatMessage.class */
public final class ChatMessage {
    @NotNull
    private final String id;
    @NotNull
    private final String senderId;
    @NotNull
    private final String senderName;
    @NotNull
    private final String message;
    private final long timestamp;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.senderId;
    }

    @NotNull
    public final String component3() {
        return this.senderName;
    }

    @NotNull
    public final String component4() {
        return this.message;
    }

    public final long component5() {
        return this.timestamp;
    }

    @NotNull
    public final ChatMessage copy(@NotNull String id, @NotNull String senderId, @NotNull String senderName, @NotNull String message, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(message, "message");
        return new ChatMessage(id, senderId, senderName, message, timestamp);
    }

    public static /* synthetic */ ChatMessage copy$default(ChatMessage chatMessage, String str, String str2, String str3, String str4, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatMessage.id;
        }
        if ((i & 2) != 0) {
            str2 = chatMessage.senderId;
        }
        if ((i & 4) != 0) {
            str3 = chatMessage.senderName;
        }
        if ((i & 8) != 0) {
            str4 = chatMessage.message;
        }
        if ((i & 16) != 0) {
            j = chatMessage.timestamp;
        }
        return chatMessage.copy(str, str2, str3, str4, j);
    }

    @NotNull
    public String toString() {
        return "ChatMessage(id=" + this.id + ", senderId=" + this.senderId + ", senderName=" + this.senderName + ", message=" + this.message + ", timestamp=" + this.timestamp + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((result * 31) + this.senderId.hashCode()) * 31) + this.senderName.hashCode()) * 31) + this.message.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ChatMessage) {
            ChatMessage chatMessage = (ChatMessage) other;
            return Intrinsics.areEqual(this.id, chatMessage.id) && Intrinsics.areEqual(this.senderId, chatMessage.senderId) && Intrinsics.areEqual(this.senderName, chatMessage.senderName) && Intrinsics.areEqual(this.message, chatMessage.message) && this.timestamp == chatMessage.timestamp;
        }
        return false;
    }

    public ChatMessage(@NotNull String id, @NotNull String senderId, @NotNull String senderName, @NotNull String message, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(message, "message");
        this.id = id;
        this.senderId = senderId;
        this.senderName = senderName;
        this.message = message;
        this.timestamp = timestamp;
    }

    public /* synthetic */ ChatMessage(String str, String str2, String str3, String str4, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? System.currentTimeMillis() : j);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getSenderId() {
        return this.senderId;
    }

    @NotNull
    public final String getSenderName() {
        return this.senderName;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
