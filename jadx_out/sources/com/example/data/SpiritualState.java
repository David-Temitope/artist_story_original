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
/* compiled from: GameStateEntity.kt */
@StabilityInferred(parameters = 0)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��.\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JA\u0010\u001a\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014¨\u0006 "}, d2 = {"Lcom/example/data/SpiritualState;", "", "spiritualPrayerSetting", "", "spiritualTitheSetting", "spiritualTotalTithesPaid", "", "spiritualTitheReminderActive", "spiritualJournal", "", "", "<init>", "(ZZDZLjava/util/List;)V", "getSpiritualPrayerSetting", "()Z", "getSpiritualTitheSetting", "getSpiritualTotalTithesPaid", "()D", "getSpiritualTitheReminderActive", "getSpiritualJournal", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app"})
/* loaded from: SpiritualState.class */
public final class SpiritualState {
    private final boolean spiritualPrayerSetting;
    private final boolean spiritualTitheSetting;
    private final double spiritualTotalTithesPaid;
    private final boolean spiritualTitheReminderActive;
    @NotNull
    private final List<String> spiritualJournal;
    public static final int $stable = 8;

    public final boolean component1() {
        return this.spiritualPrayerSetting;
    }

    public final boolean component2() {
        return this.spiritualTitheSetting;
    }

    public final double component3() {
        return this.spiritualTotalTithesPaid;
    }

    public final boolean component4() {
        return this.spiritualTitheReminderActive;
    }

    @NotNull
    public final List<String> component5() {
        return this.spiritualJournal;
    }

    @NotNull
    public final SpiritualState copy(boolean spiritualPrayerSetting, boolean spiritualTitheSetting, double spiritualTotalTithesPaid, boolean spiritualTitheReminderActive, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "spiritualJournal");
        return new SpiritualState(spiritualPrayerSetting, spiritualTitheSetting, spiritualTotalTithesPaid, spiritualTitheReminderActive, list);
    }

    public static /* synthetic */ SpiritualState copy$default(SpiritualState spiritualState, boolean z, boolean z2, double d, boolean z3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = spiritualState.spiritualPrayerSetting;
        }
        if ((i & 2) != 0) {
            z2 = spiritualState.spiritualTitheSetting;
        }
        if ((i & 4) != 0) {
            d = spiritualState.spiritualTotalTithesPaid;
        }
        if ((i & 8) != 0) {
            z3 = spiritualState.spiritualTitheReminderActive;
        }
        if ((i & 16) != 0) {
            list = spiritualState.spiritualJournal;
        }
        return spiritualState.copy(z, z2, d, z3, list);
    }

    @NotNull
    public String toString() {
        boolean z = this.spiritualPrayerSetting;
        boolean z2 = this.spiritualTitheSetting;
        double d = this.spiritualTotalTithesPaid;
        boolean z3 = this.spiritualTitheReminderActive;
        List<String> list = this.spiritualJournal;
        return "SpiritualState(spiritualPrayerSetting=" + z + ", spiritualTitheSetting=" + z2 + ", spiritualTotalTithesPaid=" + d + ", spiritualTitheReminderActive=" + z + ", spiritualJournal=" + z3 + ")";
    }

    public int hashCode() {
        int result = Boolean.hashCode(this.spiritualPrayerSetting);
        return (((((((result * 31) + Boolean.hashCode(this.spiritualTitheSetting)) * 31) + Double.hashCode(this.spiritualTotalTithesPaid)) * 31) + Boolean.hashCode(this.spiritualTitheReminderActive)) * 31) + this.spiritualJournal.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SpiritualState) {
            SpiritualState spiritualState = (SpiritualState) other;
            return this.spiritualPrayerSetting == spiritualState.spiritualPrayerSetting && this.spiritualTitheSetting == spiritualState.spiritualTitheSetting && Double.compare(this.spiritualTotalTithesPaid, spiritualState.spiritualTotalTithesPaid) == 0 && this.spiritualTitheReminderActive == spiritualState.spiritualTitheReminderActive && Intrinsics.areEqual(this.spiritualJournal, spiritualState.spiritualJournal);
        }
        return false;
    }

    public SpiritualState() {
        this(false, false, 0.0d, false, null, 31, null);
    }

    public SpiritualState(boolean spiritualPrayerSetting, boolean spiritualTitheSetting, double spiritualTotalTithesPaid, boolean spiritualTitheReminderActive, @NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "spiritualJournal");
        this.spiritualPrayerSetting = spiritualPrayerSetting;
        this.spiritualTitheSetting = spiritualTitheSetting;
        this.spiritualTotalTithesPaid = spiritualTotalTithesPaid;
        this.spiritualTitheReminderActive = spiritualTitheReminderActive;
        this.spiritualJournal = list;
    }

    public /* synthetic */ SpiritualState(boolean z, boolean z2, double d, boolean z3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final boolean getSpiritualPrayerSetting() {
        return this.spiritualPrayerSetting;
    }

    public final boolean getSpiritualTitheSetting() {
        return this.spiritualTitheSetting;
    }

    public final double getSpiritualTotalTithesPaid() {
        return this.spiritualTotalTithesPaid;
    }

    public final boolean getSpiritualTitheReminderActive() {
        return this.spiritualTitheReminderActive;
    }

    @NotNull
    public final List<String> getSpiritualJournal() {
        return this.spiritualJournal;
    }
}
