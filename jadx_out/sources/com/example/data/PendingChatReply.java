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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n��\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010$\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n��\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lcom/example/data/PendingChatReply;", "", "id", "", "npcId", "replyText", "scheduledYear", "", "scheduledWeek", "relationChange", "", "addedCash", "", "toastMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFDLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getNpcId", "getReplyText", "getScheduledYear", "()I", "getScheduledWeek", "getRelationChange", "()F", "getAddedCash", "()D", "getToastMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: PendingChatReply.class */
public final class PendingChatReply {
    @NotNull
    private final String id;
    @NotNull
    private final String npcId;
    @NotNull
    private final String replyText;
    private final int scheduledYear;
    private final int scheduledWeek;
    private final float relationChange;
    private final double addedCash;
    @Nullable
    private final String toastMessage;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.npcId;
    }

    @NotNull
    public final String component3() {
        return this.replyText;
    }

    public final int component4() {
        return this.scheduledYear;
    }

    public final int component5() {
        return this.scheduledWeek;
    }

    public final float component6() {
        return this.relationChange;
    }

    public final double component7() {
        return this.addedCash;
    }

    @Nullable
    public final String component8() {
        return this.toastMessage;
    }

    @NotNull
    public final PendingChatReply copy(@NotNull String id, @NotNull String npcId, @NotNull String replyText, int scheduledYear, int scheduledWeek, float relationChange, double addedCash, @Nullable String toastMessage) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(npcId, "npcId");
        Intrinsics.checkNotNullParameter(replyText, "replyText");
        return new PendingChatReply(id, npcId, replyText, scheduledYear, scheduledWeek, relationChange, addedCash, toastMessage);
    }

    public static /* synthetic */ PendingChatReply copy$default(PendingChatReply pendingChatReply, String str, String str2, String str3, int i, int i2, float f, double d, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = pendingChatReply.id;
        }
        if ((i3 & 2) != 0) {
            str2 = pendingChatReply.npcId;
        }
        if ((i3 & 4) != 0) {
            str3 = pendingChatReply.replyText;
        }
        if ((i3 & 8) != 0) {
            i = pendingChatReply.scheduledYear;
        }
        if ((i3 & 16) != 0) {
            i2 = pendingChatReply.scheduledWeek;
        }
        if ((i3 & 32) != 0) {
            f = pendingChatReply.relationChange;
        }
        if ((i3 & 64) != 0) {
            d = pendingChatReply.addedCash;
        }
        if ((i3 & 128) != 0) {
            str4 = pendingChatReply.toastMessage;
        }
        return pendingChatReply.copy(str, str2, str3, i, i2, f, d, str4);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.npcId;
        String str3 = this.replyText;
        int i = this.scheduledYear;
        int i2 = this.scheduledWeek;
        float f = this.relationChange;
        double d = this.addedCash;
        String str4 = this.toastMessage;
        return "PendingChatReply(id=" + str + ", npcId=" + str2 + ", replyText=" + str3 + ", scheduledYear=" + i + ", scheduledWeek=" + i2 + ", relationChange=" + f + ", addedCash=" + d + ", toastMessage=" + str + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((result * 31) + this.npcId.hashCode()) * 31) + this.replyText.hashCode()) * 31) + Integer.hashCode(this.scheduledYear)) * 31) + Integer.hashCode(this.scheduledWeek)) * 31) + Float.hashCode(this.relationChange)) * 31) + Double.hashCode(this.addedCash)) * 31) + (this.toastMessage == null ? 0 : this.toastMessage.hashCode());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PendingChatReply) {
            PendingChatReply pendingChatReply = (PendingChatReply) other;
            return Intrinsics.areEqual(this.id, pendingChatReply.id) && Intrinsics.areEqual(this.npcId, pendingChatReply.npcId) && Intrinsics.areEqual(this.replyText, pendingChatReply.replyText) && this.scheduledYear == pendingChatReply.scheduledYear && this.scheduledWeek == pendingChatReply.scheduledWeek && Float.compare(this.relationChange, pendingChatReply.relationChange) == 0 && Double.compare(this.addedCash, pendingChatReply.addedCash) == 0 && Intrinsics.areEqual(this.toastMessage, pendingChatReply.toastMessage);
        }
        return false;
    }

    public PendingChatReply(@NotNull String id, @NotNull String npcId, @NotNull String replyText, int scheduledYear, int scheduledWeek, float relationChange, double addedCash, @Nullable String toastMessage) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(npcId, "npcId");
        Intrinsics.checkNotNullParameter(replyText, "replyText");
        this.id = id;
        this.npcId = npcId;
        this.replyText = replyText;
        this.scheduledYear = scheduledYear;
        this.scheduledWeek = scheduledWeek;
        this.relationChange = relationChange;
        this.addedCash = addedCash;
        this.toastMessage = toastMessage;
    }

    public /* synthetic */ PendingChatReply(String str, String str2, String str3, int i, int i2, float f, double d, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i, i2, (i3 & 32) != 0 ? 0.0f : f, (i3 & 64) != 0 ? 0.0d : d, (i3 & 128) != 0 ? null : str4);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getNpcId() {
        return this.npcId;
    }

    @NotNull
    public final String getReplyText() {
        return this.replyText;
    }

    public final int getScheduledYear() {
        return this.scheduledYear;
    }

    public final int getScheduledWeek() {
        return this.scheduledWeek;
    }

    public final float getRelationChange() {
        return this.relationChange;
    }

    public final double getAddedCash() {
        return this.addedCash;
    }

    @Nullable
    public final String getToastMessage() {
        return this.toastMessage;
    }
}
