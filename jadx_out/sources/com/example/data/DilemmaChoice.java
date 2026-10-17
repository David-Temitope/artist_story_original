package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: DecisionModels.kt */
@StabilityInferred(parameters = 1)
@JsonClass(generateAdapter = true)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b-\b\u0087\b\u0018��2\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\t\u00103\u001a\u00020\tHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\u000eHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\u0014HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J£\u0001\u0010<\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\t2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003HÆ\u0001J\u0013\u0010=\u001a\u00020\f2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0014HÖ\u0001J\t\u0010@\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u001f\u0010 R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b!\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\"R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n��\u001a\u0004\b#\u0010$R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b%\u0010 R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n��\u001a\u0004\b&\u0010'R\u0011\u0010\u0012\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b(\u0010 R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n��\u001a\u0004\b)\u0010*R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b+\u0010\u001aR\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b,\u0010\u001a¨\u0006A"}, d2 = {"Lcom/example/data/DilemmaChoice;", "", "id", "", "actionText", "shortTitle", "teaserConsequence", "requirementText", "requiredBusinessSkill", "", "requiredIntegrity", "isHighlighted", "", "cashDelta", "", "reputationDelta", "fansDelta", "", "stressDelta", "energyDelta", "", "relationshipDeltaNpc", "outcomeNarrative", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFZDFJFILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getActionText", "getShortTitle", "getTeaserConsequence", "getRequirementText", "getRequiredBusinessSkill", "()F", "getRequiredIntegrity", "()Z", "getCashDelta", "()D", "getReputationDelta", "getFansDelta", "()J", "getStressDelta", "getEnergyDelta", "()I", "getRelationshipDeltaNpc", "getOutcomeNarrative", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "equals", "other", "hashCode", "toString", "app"})
/* loaded from: DilemmaChoice.class */
public final class DilemmaChoice {
    @NotNull
    private final String id;
    @NotNull
    private final String actionText;
    @NotNull
    private final String shortTitle;
    @NotNull
    private final String teaserConsequence;
    @Nullable
    private final String requirementText;
    private final float requiredBusinessSkill;
    private final float requiredIntegrity;
    private final boolean isHighlighted;
    private final double cashDelta;
    private final float reputationDelta;
    private final long fansDelta;
    private final float stressDelta;
    private final int energyDelta;
    @Nullable
    private final String relationshipDeltaNpc;
    @NotNull
    private final String outcomeNarrative;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.actionText;
    }

    @NotNull
    public final String component3() {
        return this.shortTitle;
    }

    @NotNull
    public final String component4() {
        return this.teaserConsequence;
    }

    @Nullable
    public final String component5() {
        return this.requirementText;
    }

    public final float component6() {
        return this.requiredBusinessSkill;
    }

    public final float component7() {
        return this.requiredIntegrity;
    }

    public final boolean component8() {
        return this.isHighlighted;
    }

    public final double component9() {
        return this.cashDelta;
    }

    public final float component10() {
        return this.reputationDelta;
    }

    public final long component11() {
        return this.fansDelta;
    }

    public final float component12() {
        return this.stressDelta;
    }

    public final int component13() {
        return this.energyDelta;
    }

    @Nullable
    public final String component14() {
        return this.relationshipDeltaNpc;
    }

    @NotNull
    public final String component15() {
        return this.outcomeNarrative;
    }

    @NotNull
    public final DilemmaChoice copy(@NotNull String id, @NotNull String actionText, @NotNull String shortTitle, @NotNull String teaserConsequence, @Nullable String requirementText, float requiredBusinessSkill, float requiredIntegrity, boolean isHighlighted, double cashDelta, float reputationDelta, long fansDelta, float stressDelta, int energyDelta, @Nullable String relationshipDeltaNpc, @NotNull String outcomeNarrative) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        Intrinsics.checkNotNullParameter(shortTitle, "shortTitle");
        Intrinsics.checkNotNullParameter(teaserConsequence, "teaserConsequence");
        Intrinsics.checkNotNullParameter(outcomeNarrative, "outcomeNarrative");
        return new DilemmaChoice(id, actionText, shortTitle, teaserConsequence, requirementText, requiredBusinessSkill, requiredIntegrity, isHighlighted, cashDelta, reputationDelta, fansDelta, stressDelta, energyDelta, relationshipDeltaNpc, outcomeNarrative);
    }

    public static /* synthetic */ DilemmaChoice copy$default(DilemmaChoice dilemmaChoice, String str, String str2, String str3, String str4, String str5, float f, float f2, boolean z, double d, float f3, long j, float f4, int i, String str6, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dilemmaChoice.id;
        }
        if ((i2 & 2) != 0) {
            str2 = dilemmaChoice.actionText;
        }
        if ((i2 & 4) != 0) {
            str3 = dilemmaChoice.shortTitle;
        }
        if ((i2 & 8) != 0) {
            str4 = dilemmaChoice.teaserConsequence;
        }
        if ((i2 & 16) != 0) {
            str5 = dilemmaChoice.requirementText;
        }
        if ((i2 & 32) != 0) {
            f = dilemmaChoice.requiredBusinessSkill;
        }
        if ((i2 & 64) != 0) {
            f2 = dilemmaChoice.requiredIntegrity;
        }
        if ((i2 & 128) != 0) {
            z = dilemmaChoice.isHighlighted;
        }
        if ((i2 & 256) != 0) {
            d = dilemmaChoice.cashDelta;
        }
        if ((i2 & 512) != 0) {
            f3 = dilemmaChoice.reputationDelta;
        }
        if ((i2 & 1024) != 0) {
            j = dilemmaChoice.fansDelta;
        }
        if ((i2 & 2048) != 0) {
            f4 = dilemmaChoice.stressDelta;
        }
        if ((i2 & 4096) != 0) {
            i = dilemmaChoice.energyDelta;
        }
        if ((i2 & 8192) != 0) {
            str6 = dilemmaChoice.relationshipDeltaNpc;
        }
        if ((i2 & 16384) != 0) {
            str7 = dilemmaChoice.outcomeNarrative;
        }
        return dilemmaChoice.copy(str, str2, str3, str4, str5, f, f2, z, d, f3, j, f4, i, str6, str7);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.actionText;
        String str3 = this.shortTitle;
        String str4 = this.teaserConsequence;
        String str5 = this.requirementText;
        float f = this.requiredBusinessSkill;
        float f2 = this.requiredIntegrity;
        boolean z = this.isHighlighted;
        double d = this.cashDelta;
        float f3 = this.reputationDelta;
        long j = this.fansDelta;
        float f4 = this.stressDelta;
        int i = this.energyDelta;
        String str6 = this.relationshipDeltaNpc;
        String str7 = this.outcomeNarrative;
        return "DilemmaChoice(id=" + str + ", actionText=" + str2 + ", shortTitle=" + str3 + ", teaserConsequence=" + str4 + ", requirementText=" + str5 + ", requiredBusinessSkill=" + f + ", requiredIntegrity=" + f2 + ", isHighlighted=" + z + ", cashDelta=" + d + ", reputationDelta=" + str + ", fansDelta=" + f3 + ", stressDelta=" + j + ", energyDelta=" + str + ", relationshipDeltaNpc=" + f4 + ", outcomeNarrative=" + i + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((((((((((((((((((((result * 31) + this.actionText.hashCode()) * 31) + this.shortTitle.hashCode()) * 31) + this.teaserConsequence.hashCode()) * 31) + (this.requirementText == null ? 0 : this.requirementText.hashCode())) * 31) + Float.hashCode(this.requiredBusinessSkill)) * 31) + Float.hashCode(this.requiredIntegrity)) * 31) + Boolean.hashCode(this.isHighlighted)) * 31) + Double.hashCode(this.cashDelta)) * 31) + Float.hashCode(this.reputationDelta)) * 31) + Long.hashCode(this.fansDelta)) * 31) + Float.hashCode(this.stressDelta)) * 31) + Integer.hashCode(this.energyDelta)) * 31) + (this.relationshipDeltaNpc == null ? 0 : this.relationshipDeltaNpc.hashCode())) * 31) + this.outcomeNarrative.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof DilemmaChoice) {
            DilemmaChoice dilemmaChoice = (DilemmaChoice) other;
            return Intrinsics.areEqual(this.id, dilemmaChoice.id) && Intrinsics.areEqual(this.actionText, dilemmaChoice.actionText) && Intrinsics.areEqual(this.shortTitle, dilemmaChoice.shortTitle) && Intrinsics.areEqual(this.teaserConsequence, dilemmaChoice.teaserConsequence) && Intrinsics.areEqual(this.requirementText, dilemmaChoice.requirementText) && Float.compare(this.requiredBusinessSkill, dilemmaChoice.requiredBusinessSkill) == 0 && Float.compare(this.requiredIntegrity, dilemmaChoice.requiredIntegrity) == 0 && this.isHighlighted == dilemmaChoice.isHighlighted && Double.compare(this.cashDelta, dilemmaChoice.cashDelta) == 0 && Float.compare(this.reputationDelta, dilemmaChoice.reputationDelta) == 0 && this.fansDelta == dilemmaChoice.fansDelta && Float.compare(this.stressDelta, dilemmaChoice.stressDelta) == 0 && this.energyDelta == dilemmaChoice.energyDelta && Intrinsics.areEqual(this.relationshipDeltaNpc, dilemmaChoice.relationshipDeltaNpc) && Intrinsics.areEqual(this.outcomeNarrative, dilemmaChoice.outcomeNarrative);
        }
        return false;
    }

    public DilemmaChoice(@NotNull String id, @NotNull String actionText, @NotNull String shortTitle, @NotNull String teaserConsequence, @Nullable String requirementText, float requiredBusinessSkill, float requiredIntegrity, boolean isHighlighted, double cashDelta, float reputationDelta, long fansDelta, float stressDelta, int energyDelta, @Nullable String relationshipDeltaNpc, @NotNull String outcomeNarrative) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(actionText, "actionText");
        Intrinsics.checkNotNullParameter(shortTitle, "shortTitle");
        Intrinsics.checkNotNullParameter(teaserConsequence, "teaserConsequence");
        Intrinsics.checkNotNullParameter(outcomeNarrative, "outcomeNarrative");
        this.id = id;
        this.actionText = actionText;
        this.shortTitle = shortTitle;
        this.teaserConsequence = teaserConsequence;
        this.requirementText = requirementText;
        this.requiredBusinessSkill = requiredBusinessSkill;
        this.requiredIntegrity = requiredIntegrity;
        this.isHighlighted = isHighlighted;
        this.cashDelta = cashDelta;
        this.reputationDelta = reputationDelta;
        this.fansDelta = fansDelta;
        this.stressDelta = stressDelta;
        this.energyDelta = energyDelta;
        this.relationshipDeltaNpc = relationshipDeltaNpc;
        this.outcomeNarrative = outcomeNarrative;
    }

    public /* synthetic */ DilemmaChoice(String str, String str2, String str3, String str4, String str5, float f, float f2, boolean z, double d, float f3, long j, float f4, int i, String str6, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i2 & 16) != 0 ? null : str5, (i2 & 32) != 0 ? 0.0f : f, (i2 & 64) != 0 ? 0.0f : f2, (i2 & 128) != 0 ? false : z, (i2 & 256) != 0 ? 0.0d : d, (i2 & 512) != 0 ? 0.0f : f3, (i2 & 1024) != 0 ? 0L : j, (i2 & 2048) != 0 ? 0.0f : f4, (i2 & 4096) != 0 ? 0 : i, (i2 & 8192) != 0 ? null : str6, (i2 & 16384) != 0 ? "" : str7);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getActionText() {
        return this.actionText;
    }

    @NotNull
    public final String getShortTitle() {
        return this.shortTitle;
    }

    @NotNull
    public final String getTeaserConsequence() {
        return this.teaserConsequence;
    }

    @Nullable
    public final String getRequirementText() {
        return this.requirementText;
    }

    public final float getRequiredBusinessSkill() {
        return this.requiredBusinessSkill;
    }

    public final float getRequiredIntegrity() {
        return this.requiredIntegrity;
    }

    public final boolean isHighlighted() {
        return this.isHighlighted;
    }

    public final double getCashDelta() {
        return this.cashDelta;
    }

    public final float getReputationDelta() {
        return this.reputationDelta;
    }

    public final long getFansDelta() {
        return this.fansDelta;
    }

    public final float getStressDelta() {
        return this.stressDelta;
    }

    public final int getEnergyDelta() {
        return this.energyDelta;
    }

    @Nullable
    public final String getRelationshipDeltaNpc() {
        return this.relationshipDeltaNpc;
    }

    @NotNull
    public final String getOutcomeNarrative() {
        return this.outcomeNarrative;
    }
}
