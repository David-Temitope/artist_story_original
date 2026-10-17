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
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n��\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018��2\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003JG\u0010\u001c\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n��\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n��\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n��\u001a\u0004\b\u0015\u0010\u000e¨\u0006#"}, d2 = {"Lcom/example/data/Producer;", "", "id", "", "name", "level", "cost", "", "ratingBonus", "", "specialtyGenre", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DFLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "getLevel", "getCost", "()D", "getRatingBonus", "()F", "getSpecialtyGenre", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app"})
/* loaded from: Producer.class */
public final class Producer {
    @NotNull
    private final String id;
    @NotNull
    private final String name;
    @NotNull
    private final String level;
    private final double cost;
    private final float ratingBonus;
    @Nullable
    private final String specialtyGenre;
    public static final int $stable = 0;

    @NotNull
    public final String component1() {
        return this.id;
    }

    @NotNull
    public final String component2() {
        return this.name;
    }

    @NotNull
    public final String component3() {
        return this.level;
    }

    public final double component4() {
        return this.cost;
    }

    public final float component5() {
        return this.ratingBonus;
    }

    @Nullable
    public final String component6() {
        return this.specialtyGenre;
    }

    @NotNull
    public final Producer copy(@NotNull String id, @NotNull String name, @NotNull String level, double cost, float ratingBonus, @Nullable String specialtyGenre) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(level, "level");
        return new Producer(id, name, level, cost, ratingBonus, specialtyGenre);
    }

    public static /* synthetic */ Producer copy$default(Producer producer, String str, String str2, String str3, double d, float f, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = producer.id;
        }
        if ((i & 2) != 0) {
            str2 = producer.name;
        }
        if ((i & 4) != 0) {
            str3 = producer.level;
        }
        if ((i & 8) != 0) {
            d = producer.cost;
        }
        if ((i & 16) != 0) {
            f = producer.ratingBonus;
        }
        if ((i & 32) != 0) {
            str4 = producer.specialtyGenre;
        }
        return producer.copy(str, str2, str3, d, f, str4);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.level;
        double d = this.cost;
        float f = this.ratingBonus;
        String str4 = this.specialtyGenre;
        return "Producer(id=" + str + ", name=" + str2 + ", level=" + str3 + ", cost=" + d + ", ratingBonus=" + str + ", specialtyGenre=" + f + ")";
    }

    public int hashCode() {
        int result = this.id.hashCode();
        return (((((((((result * 31) + this.name.hashCode()) * 31) + this.level.hashCode()) * 31) + Double.hashCode(this.cost)) * 31) + Float.hashCode(this.ratingBonus)) * 31) + (this.specialtyGenre == null ? 0 : this.specialtyGenre.hashCode());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Producer) {
            Producer producer = (Producer) other;
            return Intrinsics.areEqual(this.id, producer.id) && Intrinsics.areEqual(this.name, producer.name) && Intrinsics.areEqual(this.level, producer.level) && Double.compare(this.cost, producer.cost) == 0 && Float.compare(this.ratingBonus, producer.ratingBonus) == 0 && Intrinsics.areEqual(this.specialtyGenre, producer.specialtyGenre);
        }
        return false;
    }

    public Producer(@NotNull String id, @NotNull String name, @NotNull String level, double cost, float ratingBonus, @Nullable String specialtyGenre) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(level, "level");
        this.id = id;
        this.name = name;
        this.level = level;
        this.cost = cost;
        this.ratingBonus = ratingBonus;
        this.specialtyGenre = specialtyGenre;
    }

    public /* synthetic */ Producer(String str, String str2, String str3, double d, float f, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, d, f, (i & 32) != 0 ? null : str4);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getLevel() {
        return this.level;
    }

    public final double getCost() {
        return this.cost;
    }

    public final float getRatingBonus() {
        return this.ratingBonus;
    }

    @Nullable
    public final String getSpecialtyGenre() {
        return this.specialtyGenre;
    }
}
