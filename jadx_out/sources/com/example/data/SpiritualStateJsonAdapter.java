package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: SpiritualStateJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010 \n\u0002\u0010\u000e\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\u0010\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001a\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001b"}, d2 = {"Lcom/example/data/SpiritualStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/SpiritualState;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "booleanAdapter", "", "doubleAdapter", "", "listOfStringAdapter", "", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nSpiritualStateJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpiritualStateJsonAdapter.kt\ncom/example/data/SpiritualStateJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,146:1\n1#2:147\n*E\n"})
/* loaded from: SpiritualStateJsonAdapter.class */
public final class SpiritualStateJsonAdapter extends JsonAdapter<SpiritualState> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @Nullable
    private volatile Constructor<SpiritualState> constructorRef;
    public static final int $stable = 8;

    public SpiritualStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"spiritualPrayerSetting", "spiritualTitheSetting", "spiritualTotalTithesPaid", "spiritualTitheReminderActive", "spiritualJournal"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<Boolean> adapter = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "spiritualPrayerSetting");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.booleanAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "spiritualTotalTithesPaid");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<List<String>> adapter3 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "spiritualJournal");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.listOfStringAdapter = adapter3;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(").append("SpiritualState").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public SpiritualState m161fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean spiritualPrayerSetting = false;
        Boolean spiritualTitheSetting = false;
        Double spiritualTotalTithesPaid = Double.valueOf(0.0d);
        Boolean spiritualTitheReminderActive = false;
        List spiritualJournal = null;
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
                        spiritualPrayerSetting = bool;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("spiritualPrayerSetting", "spiritualPrayerSetting", reader);
                    }
                case 1:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        spiritualTitheSetting = bool2;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("spiritualTitheSetting", "spiritualTitheSetting", reader);
                    }
                case 2:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        spiritualTotalTithesPaid = d;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("spiritualTotalTithesPaid", "spiritualTotalTithesPaid", reader);
                    }
                case 3:
                    Boolean bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 != null) {
                        spiritualTitheReminderActive = bool3;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("spiritualTitheReminderActive", "spiritualTitheReminderActive", reader);
                    }
                case 4:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        spiritualJournal = list;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("spiritualJournal", "spiritualJournal", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -32) {
            boolean booleanValue = spiritualPrayerSetting.booleanValue();
            boolean booleanValue2 = spiritualTitheSetting.booleanValue();
            double doubleValue = spiritualTotalTithesPaid.doubleValue();
            boolean booleanValue3 = spiritualTitheReminderActive.booleanValue();
            List list2 = spiritualJournal;
            Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            return new SpiritualState(booleanValue, booleanValue2, doubleValue, booleanValue3, list2);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = SpiritualState.class.getDeclaredConstructor(Boolean.TYPE, Boolean.TYPE, Double.TYPE, Boolean.TYPE, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        SpiritualState newInstance = localConstructor.newInstance(spiritualPrayerSetting, spiritualTitheSetting, spiritualTotalTithesPaid, spiritualTitheReminderActive, spiritualJournal, Integer.valueOf(mask0), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable SpiritualState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("spiritualPrayerSetting");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSpiritualPrayerSetting()));
        writer.name("spiritualTitheSetting");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSpiritualTitheSetting()));
        writer.name("spiritualTotalTithesPaid");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getSpiritualTotalTithesPaid()));
        writer.name("spiritualTitheReminderActive");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getSpiritualTitheReminderActive()));
        writer.name("spiritualJournal");
        this.listOfStringAdapter.toJson(writer, value_.getSpiritualJournal());
        writer.endObject();
    }
}
