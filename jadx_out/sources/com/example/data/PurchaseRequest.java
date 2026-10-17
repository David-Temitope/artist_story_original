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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JO\u0010\u001f\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/example/data/PurchaseRequest;", "", "id", "", "playerEmail", "playerName", "type", "amount", "", "status", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getPlayerEmail", "getPlayerName", "getType", "getAmount", "()I", "getStatus", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: PurchaseRequest.class */
public final class PurchaseRequest {
    @NotNull
    private final String id;
    @NotNull
    private final String playerEmail;
    @NotNull
    private final String playerName;
    @NotNull
    private final String type;
    private final int amount;
    @NotNull
    private final String status;
    private final long timestamp;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.playerEmail;
    }

    @NotNull
    public final String component3() {
        return this.playerName;
    }

    @NotNull
    public final String component4() {
        return this.type;
    }

    public final int component5() {
        return this.amount;
    }

    @NotNull
    public final String component6() {
        return this.status;
    }

    public final long component7() {
        return this.timestamp;
    }

    @NotNull
    public final PurchaseRequest copy(@NotNull String id, @NotNull String playerEmail, @NotNull String playerName, @NotNull String type, int amount, @NotNull String status, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(playerEmail, "playerEmail");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        return new PurchaseRequest(id, playerEmail, playerName, type, amount, status, timestamp);
    }

    public static /* synthetic */ PurchaseRequest copy$default(PurchaseRequest purchaseRequest, String str, String str2, String str3, String str4, int i, String str5, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = purchaseRequest.id;
        }
        if ((i2 & 2) != 0) {
            str2 = purchaseRequest.playerEmail;
        }
        if ((i2 & 4) != 0) {
            str3 = purchaseRequest.playerName;
        }
        if ((i2 & 8) != 0) {
            str4 = purchaseRequest.type;
        }
        if ((i2 & 16) != 0) {
            i = purchaseRequest.amount;
        }
        if ((i2 & 32) != 0) {
            str5 = purchaseRequest.status;
        }
        if ((i2 & 64) != 0) {
            j = purchaseRequest.timestamp;
        }
        return purchaseRequest.copy(str, str2, str3, str4, i, str5, j);
    }

    @NotNull
    public String toString() {
        return "PurchaseRequest(id=" + this.id + ", playerEmail=" + this.playerEmail + ", playerName=" + this.playerName + ", type=" + this.type + ", amount=" + this.amount + ", status=" + this.status + ", timestamp=" + this.timestamp + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((result * 31) + this.playerEmail.hashCode()) * 31) + this.playerName.hashCode()) * 31) + this.type.hashCode()) * 31) + Integer.hashCode(this.amount)) * 31) + this.status.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof PurchaseRequest) {
            PurchaseRequest purchaseRequest = (PurchaseRequest) other;
            return Intrinsics.areEqual(this.id, purchaseRequest.id) && Intrinsics.areEqual(this.playerEmail, purchaseRequest.playerEmail) && Intrinsics.areEqual(this.playerName, purchaseRequest.playerName) && Intrinsics.areEqual(this.type, purchaseRequest.type) && this.amount == purchaseRequest.amount && Intrinsics.areEqual(this.status, purchaseRequest.status) && this.timestamp == purchaseRequest.timestamp;
        }
        return false;
    }

    public PurchaseRequest(@NotNull String id, @NotNull String playerEmail, @NotNull String playerName, @NotNull String type, int amount, @NotNull String status, long timestamp) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(playerEmail, "playerEmail");
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.playerEmail = playerEmail;
        this.playerName = playerName;
        this.type = type;
        this.amount = amount;
        this.status = status;
        this.timestamp = timestamp;
    }

    public /* synthetic */ PurchaseRequest(String str, String str2, String str3, String str4, int i, String str5, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, str5, (i2 & 64) != 0 ? System.currentTimeMillis() : j);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getPlayerEmail() {
        return this.playerEmail;
    }

    @NotNull
    public final String getPlayerName() {
        return this.playerName;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final int getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
