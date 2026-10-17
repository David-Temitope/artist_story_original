package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: Models.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/example/data/CryptoOrder;", "", "id", "", "cryptoId", "type", "targetPrice", "", "quantity", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DD)V", "getId", "()Ljava/lang/String;", "getCryptoId", "getType", "getTargetPrice", "()D", "getQuantity", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: CryptoOrder.class */
public final class CryptoOrder {
    @NotNull
    private final String id;
    @NotNull
    private final String cryptoId;
    @NotNull
    private final String type;
    private final double targetPrice;
    private final double quantity;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.cryptoId;
    }

    @NotNull
    public final String component3() {
        return this.type;
    }

    public final double component4() {
        return this.targetPrice;
    }

    public final double component5() {
        return this.quantity;
    }

    @NotNull
    public final CryptoOrder copy(@NotNull String id, @NotNull String cryptoId, @NotNull String type, double targetPrice, double quantity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cryptoId, "cryptoId");
        Intrinsics.checkNotNullParameter(type, "type");
        return new CryptoOrder(id, cryptoId, type, targetPrice, quantity);
    }

    public static /* synthetic */ CryptoOrder copy$default(CryptoOrder cryptoOrder, String str, String str2, String str3, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoOrder.id;
        }
        if ((i & 2) != 0) {
            str2 = cryptoOrder.cryptoId;
        }
        if ((i & 4) != 0) {
            str3 = cryptoOrder.type;
        }
        if ((i & 8) != 0) {
            d = cryptoOrder.targetPrice;
        }
        if ((i & 16) != 0) {
            d2 = cryptoOrder.quantity;
        }
        return cryptoOrder.copy(str, str2, str3, d, d2);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.cryptoId;
        String str3 = this.type;
        double d = this.targetPrice;
        double d2 = this.quantity;
        return "CryptoOrder(id=" + str + ", cryptoId=" + str2 + ", type=" + str3 + ", targetPrice=" + d + ", quantity=" + str + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((result * 31) + this.cryptoId.hashCode()) * 31) + this.type.hashCode()) * 31) + Double.hashCode(this.targetPrice)) * 31) + Double.hashCode(this.quantity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof CryptoOrder) {
            CryptoOrder cryptoOrder = (CryptoOrder) other;
            return Intrinsics.areEqual(this.id, cryptoOrder.id) && Intrinsics.areEqual(this.cryptoId, cryptoOrder.cryptoId) && Intrinsics.areEqual(this.type, cryptoOrder.type) && Double.compare(this.targetPrice, cryptoOrder.targetPrice) == 0 && Double.compare(this.quantity, cryptoOrder.quantity) == 0;
        }
        return false;
    }

    public CryptoOrder(@NotNull String id, @NotNull String cryptoId, @NotNull String type, double targetPrice, double quantity) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cryptoId, "cryptoId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.cryptoId = cryptoId;
        this.type = type;
        this.targetPrice = targetPrice;
        this.quantity = quantity;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getCryptoId() {
        return this.cryptoId;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final double getTargetPrice() {
        return this.targetPrice;
    }

    public final double getQuantity() {
        return this.quantity;
    }
}
