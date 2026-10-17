package com.example.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GameViewModel.kt */
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��#\n��\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001��\b\u008a\b\u0018��2\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J6\u0010\u0014\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"com/example/data/GameViewModel$progressToNextWeek$1$LabelContractSpec", "", "name", "", "template", "levelText", "level", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getTemplate", "getLevelText", "getLevel", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/example/data/GameViewModel$progressToNextWeek$1$LabelContractSpec;", "equals", "", "other", "hashCode", "toString", "app"})
/* loaded from: GameViewModel$progressToNextWeek$1$LabelContractSpec.class */
public final class GameViewModel$progressToNextWeek$1$LabelContractSpec {
    private final String name;
    private final String template;
    private final String levelText;
    private final int level;

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.template;
    }

    public final String component3() {
        return this.levelText;
    }

    public final int component4() {
        return this.level;
    }

    public final GameViewModel$progressToNextWeek$1$LabelContractSpec copy(String name, String template, String levelText, int level) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(levelText, "levelText");
        return new GameViewModel$progressToNextWeek$1$LabelContractSpec(name, template, levelText, level);
    }

    public static /* synthetic */ GameViewModel$progressToNextWeek$1$LabelContractSpec copy$default(GameViewModel$progressToNextWeek$1$LabelContractSpec gameViewModel$progressToNextWeek$1$LabelContractSpec, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gameViewModel$progressToNextWeek$1$LabelContractSpec.name;
        }
        if ((i2 & 2) != 0) {
            str2 = gameViewModel$progressToNextWeek$1$LabelContractSpec.template;
        }
        if ((i2 & 4) != 0) {
            str3 = gameViewModel$progressToNextWeek$1$LabelContractSpec.levelText;
        }
        if ((i2 & 8) != 0) {
            i = gameViewModel$progressToNextWeek$1$LabelContractSpec.level;
        }
        return gameViewModel$progressToNextWeek$1$LabelContractSpec.copy(str, str2, str3, i);
    }

    public String toString() {
        return "LabelContractSpec(name=" + this.name + ", template=" + this.template + ", levelText=" + this.levelText + ", level=" + this.level + ")";
    }

    public int hashCode() {
        int result = this.name.hashCode();
        return (((((result * 31) + this.template.hashCode()) * 31) + this.levelText.hashCode()) * 31) + Integer.hashCode(this.level);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof GameViewModel$progressToNextWeek$1$LabelContractSpec) {
            GameViewModel$progressToNextWeek$1$LabelContractSpec gameViewModel$progressToNextWeek$1$LabelContractSpec = (GameViewModel$progressToNextWeek$1$LabelContractSpec) other;
            return Intrinsics.areEqual(this.name, gameViewModel$progressToNextWeek$1$LabelContractSpec.name) && Intrinsics.areEqual(this.template, gameViewModel$progressToNextWeek$1$LabelContractSpec.template) && Intrinsics.areEqual(this.levelText, gameViewModel$progressToNextWeek$1$LabelContractSpec.levelText) && this.level == gameViewModel$progressToNextWeek$1$LabelContractSpec.level;
        }
        return false;
    }

    public GameViewModel$progressToNextWeek$1$LabelContractSpec(String name, String template, String levelText, int level) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(template, "template");
        Intrinsics.checkNotNullParameter(levelText, "levelText");
        this.name = name;
        this.template = template;
        this.levelText = levelText;
        this.level = level;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTemplate() {
        return this.template;
    }

    public final String getLevelText() {
        return this.levelText;
    }

    public final int getLevel() {
        return this.level;
    }
}
