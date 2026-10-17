package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: LegacyMilestonesJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0019"}, d2 = {"Lcom/example/data/LegacyMilestonesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/LegacyMilestones;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "booleanAdapter", "", "intAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nLegacyMilestonesJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyMilestonesJsonAdapter.kt\ncom/example/data/LegacyMilestonesJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,195:1\n1#2:196\n*E\n"})
/* loaded from: LegacyMilestonesJsonAdapter.class */
public final class LegacyMilestonesJsonAdapter extends JsonAdapter<LegacyMilestones> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @Nullable
    private volatile Constructor<LegacyMilestones> constructorRef;
    public static final int $stable = 8;

    public LegacyMilestonesJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"hasWikipediaPage", "hasHallOfFame", "hasMuseum", "hasDocumentary", "hasBiography", "hasNetflixSeries", "hasScholarships", "artistsInspiredCount", "receivedGovernorPitch", "receivedSenatorPitch"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<Boolean> adapter = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "hasWikipediaPage");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.booleanAdapter = adapter;
        JsonAdapter<Integer> adapter2 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "artistsInspiredCount");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.intAdapter = adapter2;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(").append("LegacyMilestones").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public LegacyMilestones m101fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean hasWikipediaPage = false;
        Boolean hasHallOfFame = false;
        Boolean hasMuseum = false;
        Boolean hasDocumentary = false;
        Boolean hasBiography = false;
        Boolean hasNetflixSeries = false;
        Boolean hasScholarships = false;
        Integer artistsInspiredCount = 0;
        Boolean receivedGovernorPitch = false;
        Boolean receivedSenatorPitch = false;
        int mask0 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        hasWikipediaPage = bool;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasWikipediaPage", "hasWikipediaPage", reader);
                    }
                case 1:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        hasHallOfFame = bool2;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasHallOfFame", "hasHallOfFame", reader);
                    }
                case 2:
                    Boolean bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 != null) {
                        hasMuseum = bool3;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasMuseum", "hasMuseum", reader);
                    }
                case 3:
                    Boolean bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 != null) {
                        hasDocumentary = bool4;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasDocumentary", "hasDocumentary", reader);
                    }
                case 4:
                    Boolean bool5 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool5 != null) {
                        hasBiography = bool5;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasBiography", "hasBiography", reader);
                    }
                case 5:
                    Boolean bool6 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool6 != null) {
                        hasNetflixSeries = bool6;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasNetflixSeries", "hasNetflixSeries", reader);
                    }
                case 6:
                    Boolean bool7 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool7 != null) {
                        hasScholarships = bool7;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("hasScholarships", "hasScholarships", reader);
                    }
                case 7:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        artistsInspiredCount = num;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("artistsInspiredCount", "artistsInspiredCount", reader);
                    }
                case 8:
                    Boolean bool8 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool8 != null) {
                        receivedGovernorPitch = bool8;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("receivedGovernorPitch", "receivedGovernorPitch", reader);
                    }
                case 9:
                    Boolean bool9 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool9 != null) {
                        receivedSenatorPitch = bool9;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("receivedSenatorPitch", "receivedSenatorPitch", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -1024) {
            return new LegacyMilestones(hasWikipediaPage.booleanValue(), hasHallOfFame.booleanValue(), hasMuseum.booleanValue(), hasDocumentary.booleanValue(), hasBiography.booleanValue(), hasNetflixSeries.booleanValue(), hasScholarships.booleanValue(), artistsInspiredCount.intValue(), receivedGovernorPitch.booleanValue(), receivedSenatorPitch.booleanValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = LegacyMilestones.class.getDeclaredConstructor(Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        LegacyMilestones newInstance = localConstructor.newInstance(hasWikipediaPage, hasHallOfFame, hasMuseum, hasDocumentary, hasBiography, hasNetflixSeries, hasScholarships, artistsInspiredCount, receivedGovernorPitch, receivedSenatorPitch, Integer.valueOf(mask0), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable LegacyMilestones value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("hasWikipediaPage");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasWikipediaPage()));
        writer.name("hasHallOfFame");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasHallOfFame()));
        writer.name("hasMuseum");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasMuseum()));
        writer.name("hasDocumentary");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasDocumentary()));
        writer.name("hasBiography");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasBiography()));
        writer.name("hasNetflixSeries");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasNetflixSeries()));
        writer.name("hasScholarships");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getHasScholarships()));
        writer.name("artistsInspiredCount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getArtistsInspiredCount()));
        writer.name("receivedGovernorPitch");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getReceivedGovernorPitch()));
        writer.name("receivedSenatorPitch");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getReceivedSenatorPitch()));
        writer.endObject();
    }
}
