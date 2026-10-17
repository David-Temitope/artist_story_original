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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018��2\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003JY\u0010#\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001J\u0013\u0010$\u001a\u00020\f2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\u0019R\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n��\u001a\u0004\b\u001a\u0010\u0014¨\u0006("}, d2 = {"Lcom/example/data/NPCMemory;", "", "id", "", "description", "emotionalImpact", "", "memoryType", "weekRecorded", "", "yearRecorded", "isCoreMemory", "", "decayRate", "<init>", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;IIZF)V", "getId", "()Ljava/lang/String;", "getDescription", "getEmotionalImpact", "()F", "getMemoryType", "getWeekRecorded", "()I", "getYearRecorded", "()Z", "getDecayRate", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: NPCMemory.class */
public final class NPCMemory {
    @NotNull
    private final String id;
    @NotNull
    private final String description;
    private final float emotionalImpact;
    @NotNull
    private final String memoryType;
    private final int weekRecorded;
    private final int yearRecorded;
    private final boolean isCoreMemory;
    private final float decayRate;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.description;
    }

    public final float component3() {
        return this.emotionalImpact;
    }

    @NotNull
    public final String component4() {
        return this.memoryType;
    }

    public final int component5() {
        return this.weekRecorded;
    }

    public final int component6() {
        return this.yearRecorded;
    }

    public final boolean component7() {
        return this.isCoreMemory;
    }

    public final float component8() {
        return this.decayRate;
    }

    @NotNull
    public final NPCMemory copy(@NotNull String id, @NotNull String description, float emotionalImpact, @NotNull String memoryType, int weekRecorded, int yearRecorded, boolean isCoreMemory, float decayRate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(memoryType, "memoryType");
        return new NPCMemory(id, description, emotionalImpact, memoryType, weekRecorded, yearRecorded, isCoreMemory, decayRate);
    }

    public static /* synthetic */ NPCMemory copy$default(NPCMemory nPCMemory, String str, String str2, float f, String str3, int i, int i2, boolean z, float f2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = nPCMemory.id;
        }
        if ((i3 & 2) != 0) {
            str2 = nPCMemory.description;
        }
        if ((i3 & 4) != 0) {
            f = nPCMemory.emotionalImpact;
        }
        if ((i3 & 8) != 0) {
            str3 = nPCMemory.memoryType;
        }
        if ((i3 & 16) != 0) {
            i = nPCMemory.weekRecorded;
        }
        if ((i3 & 32) != 0) {
            i2 = nPCMemory.yearRecorded;
        }
        if ((i3 & 64) != 0) {
            z = nPCMemory.isCoreMemory;
        }
        if ((i3 & 128) != 0) {
            f2 = nPCMemory.decayRate;
        }
        return nPCMemory.copy(str, str2, f, str3, i, i2, z, f2);
    }

    @NotNull
    public String toString() {
        return "NPCMemory(id=" + this.id + ", description=" + this.description + ", emotionalImpact=" + this.emotionalImpact + ", memoryType=" + this.memoryType + ", weekRecorded=" + this.weekRecorded + ", yearRecorded=" + this.yearRecorded + ", isCoreMemory=" + this.isCoreMemory + ", decayRate=" + this.decayRate + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((result * 31) + this.description.hashCode()) * 31) + Float.hashCode(this.emotionalImpact)) * 31) + this.memoryType.hashCode()) * 31) + Integer.hashCode(this.weekRecorded)) * 31) + Integer.hashCode(this.yearRecorded)) * 31) + Boolean.hashCode(this.isCoreMemory)) * 31) + Float.hashCode(this.decayRate);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof NPCMemory) {
            NPCMemory nPCMemory = (NPCMemory) other;
            return Intrinsics.areEqual(this.id, nPCMemory.id) && Intrinsics.areEqual(this.description, nPCMemory.description) && Float.compare(this.emotionalImpact, nPCMemory.emotionalImpact) == 0 && Intrinsics.areEqual(this.memoryType, nPCMemory.memoryType) && this.weekRecorded == nPCMemory.weekRecorded && this.yearRecorded == nPCMemory.yearRecorded && this.isCoreMemory == nPCMemory.isCoreMemory && Float.compare(this.decayRate, nPCMemory.decayRate) == 0;
        }
        return false;
    }

    public NPCMemory(@NotNull String id, @NotNull String description, float emotionalImpact, @NotNull String memoryType, int weekRecorded, int yearRecorded, boolean isCoreMemory, float decayRate) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(memoryType, "memoryType");
        this.id = id;
        this.description = description;
        this.emotionalImpact = emotionalImpact;
        this.memoryType = memoryType;
        this.weekRecorded = weekRecorded;
        this.yearRecorded = yearRecorded;
        this.isCoreMemory = isCoreMemory;
        this.decayRate = decayRate;
    }

    public /* synthetic */ NPCMemory(String str, String str2, float f, String str3, int i, int i2, boolean z, float f2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, f, str3, i, i2, (i3 & 64) != 0 ? false : z, (i3 & 128) != 0 ? 4.0f : f2);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final float getEmotionalImpact() {
        return this.emotionalImpact;
    }

    @NotNull
    public final String getMemoryType() {
        return this.memoryType;
    }

    public final int getWeekRecorded() {
        return this.weekRecorded;
    }

    public final int getYearRecorded() {
        return this.yearRecorded;
    }

    public final boolean isCoreMemory() {
        return this.isCoreMemory;
    }

    public final float getDecayRate() {
        return this.decayRate;
    }
}
