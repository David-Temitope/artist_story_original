package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameStateEntity.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"�� \n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n��\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/example/data/SecurityCyberState;", "", "hiredSecurityCompany", "", "hasCyberInsurance", "", "hasStudioInsurance", "<init>", "(Ljava/lang/String;ZZ)V", "getHiredSecurityCompany", "()Ljava/lang/String;", "getHasCyberInsurance", "()Z", "getHasStudioInsurance", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app"})
/* loaded from: SecurityCyberState.class */
public final class SecurityCyberState {
    @NotNull
    private final String hiredSecurityCompany;
    private final boolean hasCyberInsurance;
    private final boolean hasStudioInsurance;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.hiredSecurityCompany;
    }

    public final boolean component2() {
        return this.hasCyberInsurance;
    }

    public final boolean component3() {
        return this.hasStudioInsurance;
    }

    @NotNull
    public final SecurityCyberState copy(@NotNull String hiredSecurityCompany, boolean hasCyberInsurance, boolean hasStudioInsurance) {
        Intrinsics.checkNotNullParameter(hiredSecurityCompany, "hiredSecurityCompany");
        return new SecurityCyberState(hiredSecurityCompany, hasCyberInsurance, hasStudioInsurance);
    }

    public static /* synthetic */ SecurityCyberState copy$default(SecurityCyberState securityCyberState, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = securityCyberState.hiredSecurityCompany;
        }
        if ((i & 2) != 0) {
            z = securityCyberState.hasCyberInsurance;
        }
        if ((i & 4) != 0) {
            z2 = securityCyberState.hasStudioInsurance;
        }
        return securityCyberState.copy(str, z, z2);
    }

    @NotNull
    public String toString() {
        return "SecurityCyberState(hiredSecurityCompany=" + this.hiredSecurityCompany + ", hasCyberInsurance=" + this.hasCyberInsurance + ", hasStudioInsurance=" + this.hasStudioInsurance + ")";
    }

    public int hashCode() {
        int result = this.hiredSecurityCompany.hashCode();
        return (((result * 31) + Boolean.hashCode(this.hasCyberInsurance)) * 31) + Boolean.hashCode(this.hasStudioInsurance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SecurityCyberState) {
            SecurityCyberState securityCyberState = (SecurityCyberState) other;
            return Intrinsics.areEqual(this.hiredSecurityCompany, securityCyberState.hiredSecurityCompany) && this.hasCyberInsurance == securityCyberState.hasCyberInsurance && this.hasStudioInsurance == securityCyberState.hasStudioInsurance;
        }
        return false;
    }

    public SecurityCyberState() {
        this(null, false, false, 7, null);
    }

    public SecurityCyberState(@NotNull String hiredSecurityCompany, boolean hasCyberInsurance, boolean hasStudioInsurance) {
        Intrinsics.checkNotNullParameter(hiredSecurityCompany, "hiredSecurityCompany");
        this.hiredSecurityCompany = hiredSecurityCompany;
        this.hasCyberInsurance = hasCyberInsurance;
        this.hasStudioInsurance = hasStudioInsurance;
    }

    public /* synthetic */ SecurityCyberState(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "None" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    @NotNull
    public final String getHiredSecurityCompany() {
        return this.hiredSecurityCompany;
    }

    public final boolean getHasCyberInsurance() {
        return this.hasCyberInsurance;
    }

    public final boolean getHasStudioInsurance() {
        return this.hasStudioInsurance;
    }
}
