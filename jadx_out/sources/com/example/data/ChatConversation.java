package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��,\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J7\u0010\u0017\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/example/data/ChatConversation;", "", "npcId", "", "npcName", "messages", "", "Lcom/example/data/ChatMessage;", "unreadCount", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "getNpcId", "()Ljava/lang/String;", "getNpcName", "getMessages", "()Ljava/util/List;", "getUnreadCount", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: ChatConversation.class */
public final class ChatConversation {
    @NotNull
    private final String npcId;
    @NotNull
    private final String npcName;
    @NotNull
    private final List<ChatMessage> messages;
    private final int unreadCount;
    public static final int $stable = 8;

    @NotNull
    public final String component1() {
        return this.npcId;
    }

    @NotNull
    public final String component2() {
        return this.npcName;
    }

    @NotNull
    public final List<ChatMessage> component3() {
        return this.messages;
    }

    public final int component4() {
        return this.unreadCount;
    }

    @NotNull
    public final ChatConversation copy(@NotNull String npcId, @NotNull String npcName, @NotNull List<ChatMessage> list, int unreadCount) {
        Intrinsics.checkNotNullParameter(npcId, "npcId");
        Intrinsics.checkNotNullParameter(npcName, "npcName");
        Intrinsics.checkNotNullParameter(list, "messages");
        return new ChatConversation(npcId, npcName, list, unreadCount);
    }

    public static /* synthetic */ ChatConversation copy$default(ChatConversation chatConversation, String str, String str2, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatConversation.npcId;
        }
        if ((i2 & 2) != 0) {
            str2 = chatConversation.npcName;
        }
        if ((i2 & 4) != 0) {
            list = chatConversation.messages;
        }
        if ((i2 & 8) != 0) {
            i = chatConversation.unreadCount;
        }
        return chatConversation.copy(str, str2, list, i);
    }

    @NotNull
    public String toString() {
        return "ChatConversation(npcId=" + this.npcId + ", npcName=" + this.npcName + ", messages=" + this.messages + ", unreadCount=" + this.unreadCount + ")";
    }

    public int hashCode() {
        int result = this.npcId.hashCode();
        return (((((result * 31) + this.npcName.hashCode()) * 31) + this.messages.hashCode()) * 31) + Integer.hashCode(this.unreadCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ChatConversation) {
            ChatConversation chatConversation = (ChatConversation) other;
            return Intrinsics.areEqual(this.npcId, chatConversation.npcId) && Intrinsics.areEqual(this.npcName, chatConversation.npcName) && Intrinsics.areEqual(this.messages, chatConversation.messages) && this.unreadCount == chatConversation.unreadCount;
        }
        return false;
    }

    public ChatConversation(@NotNull String npcId, @NotNull String npcName, @NotNull List<ChatMessage> list, int unreadCount) {
        Intrinsics.checkNotNullParameter(npcId, "npcId");
        Intrinsics.checkNotNullParameter(npcName, "npcName");
        Intrinsics.checkNotNullParameter(list, "messages");
        this.npcId = npcId;
        this.npcName = npcName;
        this.messages = list;
        this.unreadCount = unreadCount;
    }

    public /* synthetic */ ChatConversation(String str, String str2, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? 0 : i);
    }

    @NotNull
    public final String getNpcId() {
        return this.npcId;
    }

    @NotNull
    public final String getNpcName() {
        return this.npcName;
    }

    @NotNull
    public final List<ChatMessage> getMessages() {
        return this.messages;
    }

    public final int getUnreadCount() {
        return this.unreadCount;
    }
}
