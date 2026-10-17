package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: MarketSimulationHelper.kt */
@StabilityInferred(parameters = 1)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��(\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018��2\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/example/data/CryptoSpec;", "", "anchor", "", "support", "resistance", "tier", "", "dev", "", "<init>", "(DDDILjava/lang/String;)V", "getAnchor", "()D", "getSupport", "getResistance", "getTier", "()I", "getDev", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: CryptoSpec.class */
public final class CryptoSpec {
    private final double anchor;
    private final double support;
    private final double resistance;
    private final int tier;
    @NotNull
    private final String dev;
    public static final int $stable = 0;

    public final double component1() {
        return this.anchor;
    }

    public final double component2() {
        return this.support;
    }

    public final double component3() {
        return this.resistance;
    }

    public final int component4() {
        return this.tier;
    }

    @NotNull
    public final String component5() {
        return this.dev;
    }

    @NotNull
    public final CryptoSpec copy(double anchor, double support, double resistance, int tier, @NotNull String dev) {
        Intrinsics.checkNotNullParameter(dev, "dev");
        return new CryptoSpec(anchor, support, resistance, tier, dev);
    }

    public static /* synthetic */ CryptoSpec copy$default(CryptoSpec cryptoSpec, double d, double d2, double d3, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            d = cryptoSpec.anchor;
        }
        if ((i2 & 2) != 0) {
            d2 = cryptoSpec.support;
        }
        if ((i2 & 4) != 0) {
            d3 = cryptoSpec.resistance;
        }
        if ((i2 & 8) != 0) {
            i = cryptoSpec.tier;
        }
        if ((i2 & 16) != 0) {
            str = cryptoSpec.dev;
        }
        return cryptoSpec.copy(d, d2, d3, i, str);
    }

    @NotNull
    public String toString() {
        double d = this.anchor;
        double d2 = this.support;
        double d3 = this.resistance;
        int i = this.tier;
        String str = this.dev;
        return "CryptoSpec(anchor=" + d + ", support=" + d + ", resistance=" + d2 + ", tier=" + d + ", dev=" + d3 + ")";
    }

    public int hashCode() {
        int result = Double.hashCode(this.anchor);
        return (((((((result * 31) + Double.hashCode(this.support)) * 31) + Double.hashCode(this.resistance)) * 31) + Integer.hashCode(this.tier)) * 31) + this.dev.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof CryptoSpec) {
            CryptoSpec cryptoSpec = (CryptoSpec) other;
            return Double.compare(this.anchor, cryptoSpec.anchor) == 0 && Double.compare(this.support, cryptoSpec.support) == 0 && Double.compare(this.resistance, cryptoSpec.resistance) == 0 && this.tier == cryptoSpec.tier && Intrinsics.areEqual(this.dev, cryptoSpec.dev);
        }
        return false;
    }

    public CryptoSpec(double anchor, double support, double resistance, int tier, @NotNull String dev) {
        Intrinsics.checkNotNullParameter(dev, "dev");
        this.anchor = anchor;
        this.support = support;
        this.resistance = resistance;
        this.tier = tier;
        this.dev = dev;
    }

    public final double getAnchor() {
        return this.anchor;
    }

    public final double getSupport() {
        return this.support;
    }

    public final double getResistance() {
        return this.resistance;
    }

    public final int getTier() {
        return this.tier;
    }

    @NotNull
    public final String getDev() {
        return this.dev;
    }
}
