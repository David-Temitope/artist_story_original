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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: FanSegmentsStateJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n��¨\u0006\u0017"}, d2 = {"Lcom/example/data/FanSegmentsStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/FanSegmentsState;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "longAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: FanSegmentsStateJsonAdapter.class */
public final class FanSegmentsStateJsonAdapter extends JsonAdapter<FanSegmentsState> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @Nullable
    private volatile Constructor<FanSegmentsState> constructorRef;
    public static final int $stable = 8;

    public FanSegmentsStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"casualFans", "hardcoreFans", "collectors", "concertGoers", "internationalFans", "onlineCommunity", "fansPersonalityLovers", "fansLyricsLovers", "fansVoicePurists", "fansFashionistas", "fansControversySeekers", "fansBusinessAdmirers", "fansCharityBelievers"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<Long> adapter = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "casualFans");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.longAdapter = adapter;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(38);
        sb.append("GeneratedJsonAdapter(").append("FanSegmentsState").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public FanSegmentsState m75fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Long casualFans = 0L;
        Long hardcoreFans = 0L;
        Long collectors = 0L;
        Long concertGoers = 0L;
        Long internationalFans = 0L;
        Long onlineCommunity = 0L;
        Long fansPersonalityLovers = 0L;
        Long fansLyricsLovers = 0L;
        Long fansVoicePurists = 0L;
        Long fansFashionistas = 0L;
        Long fansControversySeekers = 0L;
        Long fansBusinessAdmirers = 0L;
        Long fansCharityBelievers = 0L;
        int mask0 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        casualFans = l;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("casualFans", "casualFans", reader);
                    }
                case 1:
                    Long l2 = (Long) this.longAdapter.fromJson(reader);
                    if (l2 != null) {
                        hardcoreFans = l2;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("hardcoreFans", "hardcoreFans", reader);
                    }
                case 2:
                    Long l3 = (Long) this.longAdapter.fromJson(reader);
                    if (l3 != null) {
                        collectors = l3;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("collectors", "collectors", reader);
                    }
                case 3:
                    Long l4 = (Long) this.longAdapter.fromJson(reader);
                    if (l4 != null) {
                        concertGoers = l4;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("concertGoers", "concertGoers", reader);
                    }
                case 4:
                    Long l5 = (Long) this.longAdapter.fromJson(reader);
                    if (l5 != null) {
                        internationalFans = l5;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("internationalFans", "internationalFans", reader);
                    }
                case 5:
                    Long l6 = (Long) this.longAdapter.fromJson(reader);
                    if (l6 != null) {
                        onlineCommunity = l6;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("onlineCommunity", "onlineCommunity", reader);
                    }
                case 6:
                    Long l7 = (Long) this.longAdapter.fromJson(reader);
                    if (l7 != null) {
                        fansPersonalityLovers = l7;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("fansPersonalityLovers", "fansPersonalityLovers", reader);
                    }
                case 7:
                    Long l8 = (Long) this.longAdapter.fromJson(reader);
                    if (l8 != null) {
                        fansLyricsLovers = l8;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("fansLyricsLovers", "fansLyricsLovers", reader);
                    }
                case 8:
                    Long l9 = (Long) this.longAdapter.fromJson(reader);
                    if (l9 != null) {
                        fansVoicePurists = l9;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("fansVoicePurists", "fansVoicePurists", reader);
                    }
                case 9:
                    Long l10 = (Long) this.longAdapter.fromJson(reader);
                    if (l10 != null) {
                        fansFashionistas = l10;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("fansFashionistas", "fansFashionistas", reader);
                    }
                case 10:
                    Long l11 = (Long) this.longAdapter.fromJson(reader);
                    if (l11 != null) {
                        fansControversySeekers = l11;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("fansControversySeekers", "fansControversySeekers", reader);
                    }
                case 11:
                    Long l12 = (Long) this.longAdapter.fromJson(reader);
                    if (l12 != null) {
                        fansBusinessAdmirers = l12;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("fansBusinessAdmirers", "fansBusinessAdmirers", reader);
                    }
                case 12:
                    Long l13 = (Long) this.longAdapter.fromJson(reader);
                    if (l13 != null) {
                        fansCharityBelievers = l13;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("fansCharityBelievers", "fansCharityBelievers", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -8192) {
            return new FanSegmentsState(casualFans.longValue(), hardcoreFans.longValue(), collectors.longValue(), concertGoers.longValue(), internationalFans.longValue(), onlineCommunity.longValue(), fansPersonalityLovers.longValue(), fansLyricsLovers.longValue(), fansVoicePurists.longValue(), fansFashionistas.longValue(), fansControversySeekers.longValue(), fansBusinessAdmirers.longValue(), fansCharityBelievers.longValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = FanSegmentsState.class.getDeclaredConstructor(Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        FanSegmentsState newInstance = localConstructor.newInstance(casualFans, hardcoreFans, collectors, concertGoers, internationalFans, onlineCommunity, fansPersonalityLovers, fansLyricsLovers, fansVoicePurists, fansFashionistas, fansControversySeekers, fansBusinessAdmirers, fansCharityBelievers, Integer.valueOf(mask0), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable FanSegmentsState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("casualFans");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getCasualFans()));
        writer.name("hardcoreFans");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getHardcoreFans()));
        writer.name("collectors");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getCollectors()));
        writer.name("concertGoers");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getConcertGoers()));
        writer.name("internationalFans");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getInternationalFans()));
        writer.name("onlineCommunity");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getOnlineCommunity()));
        writer.name("fansPersonalityLovers");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFansPersonalityLovers()));
        writer.name("fansLyricsLovers");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFansLyricsLovers()));
        writer.name("fansVoicePurists");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFansVoicePurists()));
        writer.name("fansFashionistas");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFansFashionistas()));
        writer.name("fansControversySeekers");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFansControversySeekers()));
        writer.name("fansBusinessAdmirers");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFansBusinessAdmirers()));
        writer.name("fansCharityBelievers");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getFansCharityBelievers()));
        writer.endObject();
    }
}
