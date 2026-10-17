package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: RosterAndIntelHelper.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��6\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\b\u0087\b\u0018��2\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020��2\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/example/data/RosterAndIntelResult;", "", "updatedCandidateRoster", "", "Lcom/example/data/Employee;", "finalStocks", "Lcom/example/data/Stock;", "finalCryptos", "Lcom/example/data/Crypto;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getUpdatedCandidateRoster", "()Ljava/util/List;", "getFinalStocks", "getFinalCryptos", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app"})
/* loaded from: RosterAndIntelResult.class */
public final class RosterAndIntelResult {
    @NotNull
    private final List<Employee> updatedCandidateRoster;
    @NotNull
    private final List<Stock> finalStocks;
    @NotNull
    private final List<Crypto> finalCryptos;
    public static final int $stable = 8;

    @NotNull
    public final List<Employee> component1() {
        return this.updatedCandidateRoster;
    }

    @NotNull
    public final List<Stock> component2() {
        return this.finalStocks;
    }

    @NotNull
    public final List<Crypto> component3() {
        return this.finalCryptos;
    }

    @NotNull
    public final RosterAndIntelResult copy(@NotNull List<Employee> list, @NotNull List<Stock> list2, @NotNull List<Crypto> list3) {
        Intrinsics.checkNotNullParameter(list, "updatedCandidateRoster");
        Intrinsics.checkNotNullParameter(list2, "finalStocks");
        Intrinsics.checkNotNullParameter(list3, "finalCryptos");
        return new RosterAndIntelResult(list, list2, list3);
    }

    public static /* synthetic */ RosterAndIntelResult copy$default(RosterAndIntelResult rosterAndIntelResult, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rosterAndIntelResult.updatedCandidateRoster;
        }
        if ((i & 2) != 0) {
            list2 = rosterAndIntelResult.finalStocks;
        }
        if ((i & 4) != 0) {
            list3 = rosterAndIntelResult.finalCryptos;
        }
        return rosterAndIntelResult.copy(list, list2, list3);
    }

    @NotNull
    public String toString() {
        return "RosterAndIntelResult(updatedCandidateRoster=" + this.updatedCandidateRoster + ", finalStocks=" + this.finalStocks + ", finalCryptos=" + this.finalCryptos + ")";
    }

    public int hashCode() {
        int result = this.updatedCandidateRoster.hashCode();
        return (((result * 31) + this.finalStocks.hashCode()) * 31) + this.finalCryptos.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof RosterAndIntelResult) {
            RosterAndIntelResult rosterAndIntelResult = (RosterAndIntelResult) other;
            return Intrinsics.areEqual(this.updatedCandidateRoster, rosterAndIntelResult.updatedCandidateRoster) && Intrinsics.areEqual(this.finalStocks, rosterAndIntelResult.finalStocks) && Intrinsics.areEqual(this.finalCryptos, rosterAndIntelResult.finalCryptos);
        }
        return false;
    }

    public RosterAndIntelResult(@NotNull List<Employee> list, @NotNull List<Stock> list2, @NotNull List<Crypto> list3) {
        Intrinsics.checkNotNullParameter(list, "updatedCandidateRoster");
        Intrinsics.checkNotNullParameter(list2, "finalStocks");
        Intrinsics.checkNotNullParameter(list3, "finalCryptos");
        this.updatedCandidateRoster = list;
        this.finalStocks = list2;
        this.finalCryptos = list3;
    }

    @NotNull
    public final List<Employee> getUpdatedCandidateRoster() {
        return this.updatedCandidateRoster;
    }

    @NotNull
    public final List<Stock> getFinalStocks() {
        return this.finalStocks;
    }

    @NotNull
    public final List<Crypto> getFinalCryptos() {
        return this.finalCryptos;
    }
}
