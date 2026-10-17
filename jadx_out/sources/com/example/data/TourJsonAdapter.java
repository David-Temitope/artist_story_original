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
/* compiled from: TourJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001e"}, d2 = {"Lcom/example/data/TourJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/Tour;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "intAdapter", "", "doubleAdapter", "", "booleanAdapter", "", "floatAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nTourJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TourJsonAdapter.kt\ncom/example/data/TourJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,315:1\n1#2:316\n*E\n"})
/* loaded from: TourJsonAdapter.class */
public final class TourJsonAdapter extends JsonAdapter<Tour> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @Nullable
    private volatile Constructor<Tour> constructorRef;
    public static final int $stable = 8;

    public TourJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "level", "totalWeeks", "currentWeek", "weeklyEnergyCost", "weeklyTimeCost", "setupCost", "payPerAttendee", "promotionBudget", "isPromotedOnSocial", "isPromotedOnNews", "baseAttendance", "bookedWeek", "bookedYear", "status", "title", "locationsCount", "ticketPrice", "productionTier", "transportTier", "backupDancersCount", "isLaunched", "showHype"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Integer> adapter2 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "totalWeeks");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.intAdapter = adapter2;
        JsonAdapter<Double> adapter3 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "setupCost");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.doubleAdapter = adapter3;
        JsonAdapter<Boolean> adapter4 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isPromotedOnSocial");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.booleanAdapter = adapter4;
        JsonAdapter<Float> adapter5 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "showHype");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.floatAdapter = adapter5;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(26);
        sb.append("GeneratedJsonAdapter(").append("Tour").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public Tour m174fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String level = null;
        Integer totalWeeks = null;
        Integer currentWeek = null;
        Integer weeklyEnergyCost = null;
        Integer weeklyTimeCost = null;
        Double setupCost = null;
        Double payPerAttendee = null;
        Double promotionBudget = Double.valueOf(0.0d);
        Boolean isPromotedOnSocial = false;
        Boolean isPromotedOnNews = false;
        Integer baseAttendance = 0;
        Integer bookedWeek = null;
        Integer bookedYear = null;
        String status = null;
        String title = null;
        Integer locationsCount = 0;
        Double ticketPrice = Double.valueOf(0.0d);
        String productionTier = null;
        String transportTier = null;
        Integer backupDancersCount = 0;
        Boolean isLaunched = false;
        Float showHype = Float.valueOf(0.0f);
        int mask0 = -1;
        reader.beginObject();
        while (reader.hasNext()) {
            switch (reader.selectName(this.options)) {
                case -1:
                    reader.skipName();
                    reader.skipValue();
                    break;
                case 0:
                    String str = (String) this.stringAdapter.fromJson(reader);
                    if (str != null) {
                        id = str;
                        break;
                    } else {
                        throw Util.unexpectedNull("id", "id", reader);
                    }
                case 1:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        level = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("level", "level", reader);
                    }
                case 2:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        totalWeeks = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("totalWeeks", "totalWeeks", reader);
                    }
                case 3:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        currentWeek = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("currentWeek", "currentWeek", reader);
                    }
                case 4:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        weeklyEnergyCost = num3;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyEnergyCost", "weeklyEnergyCost", reader);
                    }
                case 5:
                    Integer num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 != null) {
                        weeklyTimeCost = num4;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyTimeCost", "weeklyTimeCost", reader);
                    }
                case 6:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        setupCost = d;
                        break;
                    } else {
                        throw Util.unexpectedNull("setupCost", "setupCost", reader);
                    }
                case 7:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        payPerAttendee = d2;
                        break;
                    } else {
                        throw Util.unexpectedNull("payPerAttendee", "payPerAttendee", reader);
                    }
                case 8:
                    Double d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 != null) {
                        promotionBudget = d3;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("promotionBudget", "promotionBudget", reader);
                    }
                case 9:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isPromotedOnSocial = bool;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("isPromotedOnSocial", "isPromotedOnSocial", reader);
                    }
                case 10:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        isPromotedOnNews = bool2;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("isPromotedOnNews", "isPromotedOnNews", reader);
                    }
                case 11:
                    Integer num5 = (Integer) this.intAdapter.fromJson(reader);
                    if (num5 != null) {
                        baseAttendance = num5;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("baseAttendance", "baseAttendance", reader);
                    }
                case 12:
                    Integer num6 = (Integer) this.intAdapter.fromJson(reader);
                    if (num6 != null) {
                        bookedWeek = num6;
                        break;
                    } else {
                        throw Util.unexpectedNull("bookedWeek", "bookedWeek", reader);
                    }
                case 13:
                    Integer num7 = (Integer) this.intAdapter.fromJson(reader);
                    if (num7 != null) {
                        bookedYear = num7;
                        break;
                    } else {
                        throw Util.unexpectedNull("bookedYear", "bookedYear", reader);
                    }
                case 14:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        status = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("status", "status", reader);
                    }
                case 15:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        title = str4;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("title", "title", reader);
                    }
                case 16:
                    Integer num8 = (Integer) this.intAdapter.fromJson(reader);
                    if (num8 != null) {
                        locationsCount = num8;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("locationsCount", "locationsCount", reader);
                    }
                case 17:
                    Double d4 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d4 != null) {
                        ticketPrice = d4;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("ticketPrice", "ticketPrice", reader);
                    }
                case 18:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        productionTier = str5;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("productionTier", "productionTier", reader);
                    }
                case 19:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        transportTier = str6;
                        mask0 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("transportTier", "transportTier", reader);
                    }
                case 20:
                    Integer num9 = (Integer) this.intAdapter.fromJson(reader);
                    if (num9 != null) {
                        backupDancersCount = num9;
                        mask0 &= -1048577;
                        break;
                    } else {
                        throw Util.unexpectedNull("backupDancersCount", "backupDancersCount", reader);
                    }
                case 21:
                    Boolean bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 != null) {
                        isLaunched = bool3;
                        mask0 &= -2097153;
                        break;
                    } else {
                        throw Util.unexpectedNull("isLaunched", "isLaunched", reader);
                    }
                case 22:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        showHype = f;
                        mask0 &= -4194305;
                        break;
                    } else {
                        throw Util.unexpectedNull("showHype", "showHype", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -8359681) {
            String str7 = id;
            if (str7 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str8 = level;
            if (str8 == null) {
                throw Util.missingProperty("level", "level", reader);
            }
            Integer num10 = totalWeeks;
            if (num10 != null) {
                int intValue = num10.intValue();
                Integer num11 = currentWeek;
                if (num11 != null) {
                    int intValue2 = num11.intValue();
                    Integer num12 = weeklyEnergyCost;
                    if (num12 != null) {
                        int intValue3 = num12.intValue();
                        Integer num13 = weeklyTimeCost;
                        if (num13 != null) {
                            int intValue4 = num13.intValue();
                            Double d5 = setupCost;
                            if (d5 != null) {
                                double doubleValue = d5.doubleValue();
                                Double d6 = payPerAttendee;
                                if (d6 != null) {
                                    double doubleValue2 = d6.doubleValue();
                                    double doubleValue3 = promotionBudget.doubleValue();
                                    boolean booleanValue = isPromotedOnSocial.booleanValue();
                                    boolean booleanValue2 = isPromotedOnNews.booleanValue();
                                    int intValue5 = baseAttendance.intValue();
                                    Integer num14 = bookedWeek;
                                    if (num14 != null) {
                                        int intValue6 = num14.intValue();
                                        Integer num15 = bookedYear;
                                        if (num15 != null) {
                                            int intValue7 = num15.intValue();
                                            String str9 = status;
                                            if (str9 == null) {
                                                throw Util.missingProperty("status", "status", reader);
                                            }
                                            String str10 = title;
                                            Intrinsics.checkNotNull(str10, "null cannot be cast to non-null type kotlin.String");
                                            int intValue8 = locationsCount.intValue();
                                            double doubleValue4 = ticketPrice.doubleValue();
                                            String str11 = productionTier;
                                            Intrinsics.checkNotNull(str11, "null cannot be cast to non-null type kotlin.String");
                                            String str12 = transportTier;
                                            Intrinsics.checkNotNull(str12, "null cannot be cast to non-null type kotlin.String");
                                            return new Tour(str7, str8, intValue, intValue2, intValue3, intValue4, doubleValue, doubleValue2, doubleValue3, booleanValue, booleanValue2, intValue5, intValue6, intValue7, str9, str10, intValue8, doubleValue4, str11, str12, backupDancersCount.intValue(), isLaunched.booleanValue(), showHype.floatValue());
                                        }
                                        throw Util.missingProperty("bookedYear", "bookedYear", reader);
                                    }
                                    throw Util.missingProperty("bookedWeek", "bookedWeek", reader);
                                }
                                throw Util.missingProperty("payPerAttendee", "payPerAttendee", reader);
                            }
                            throw Util.missingProperty("setupCost", "setupCost", reader);
                        }
                        throw Util.missingProperty("weeklyTimeCost", "weeklyTimeCost", reader);
                    }
                    throw Util.missingProperty("weeklyEnergyCost", "weeklyEnergyCost", reader);
                }
                throw Util.missingProperty("currentWeek", "currentWeek", reader);
            }
            throw Util.missingProperty("totalWeeks", "totalWeeks", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = Tour.class.getDeclaredConstructor(String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, Double.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE, Double.TYPE, String.class, String.class, Integer.TYPE, Boolean.TYPE, Float.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[25];
        String str13 = id;
        if (str13 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str13;
        String str14 = level;
        if (str14 == null) {
            throw Util.missingProperty("level", "level", reader);
        }
        objArr[1] = str14;
        Integer num16 = totalWeeks;
        if (num16 != null) {
            objArr[2] = Integer.valueOf(num16.intValue());
            Integer num17 = currentWeek;
            if (num17 != null) {
                objArr[3] = Integer.valueOf(num17.intValue());
                Integer num18 = weeklyEnergyCost;
                if (num18 != null) {
                    objArr[4] = Integer.valueOf(num18.intValue());
                    Integer num19 = weeklyTimeCost;
                    if (num19 != null) {
                        objArr[5] = Integer.valueOf(num19.intValue());
                        Double d7 = setupCost;
                        if (d7 != null) {
                            objArr[6] = Double.valueOf(d7.doubleValue());
                            Double d8 = payPerAttendee;
                            if (d8 != null) {
                                objArr[7] = Double.valueOf(d8.doubleValue());
                                objArr[8] = promotionBudget;
                                objArr[9] = isPromotedOnSocial;
                                objArr[10] = isPromotedOnNews;
                                objArr[11] = baseAttendance;
                                Integer num20 = bookedWeek;
                                if (num20 != null) {
                                    objArr[12] = Integer.valueOf(num20.intValue());
                                    Integer num21 = bookedYear;
                                    if (num21 != null) {
                                        objArr[13] = Integer.valueOf(num21.intValue());
                                        String str15 = status;
                                        if (str15 == null) {
                                            throw Util.missingProperty("status", "status", reader);
                                        }
                                        objArr[14] = str15;
                                        objArr[15] = title;
                                        objArr[16] = locationsCount;
                                        objArr[17] = ticketPrice;
                                        objArr[18] = productionTier;
                                        objArr[19] = transportTier;
                                        objArr[20] = backupDancersCount;
                                        objArr[21] = isLaunched;
                                        objArr[22] = showHype;
                                        objArr[23] = Integer.valueOf(mask0);
                                        objArr[24] = null;
                                        Tour newInstance = localConstructor.newInstance(objArr);
                                        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                                        return newInstance;
                                    }
                                    throw Util.missingProperty("bookedYear", "bookedYear", reader);
                                }
                                throw Util.missingProperty("bookedWeek", "bookedWeek", reader);
                            }
                            throw Util.missingProperty("payPerAttendee", "payPerAttendee", reader);
                        }
                        throw Util.missingProperty("setupCost", "setupCost", reader);
                    }
                    throw Util.missingProperty("weeklyTimeCost", "weeklyTimeCost", reader);
                }
                throw Util.missingProperty("weeklyEnergyCost", "weeklyEnergyCost", reader);
            }
            throw Util.missingProperty("currentWeek", "currentWeek", reader);
        }
        throw Util.missingProperty("totalWeeks", "totalWeeks", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable Tour value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("level");
        this.stringAdapter.toJson(writer, value_.getLevel());
        writer.name("totalWeeks");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTotalWeeks()));
        writer.name("currentWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getCurrentWeek()));
        writer.name("weeklyEnergyCost");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeeklyEnergyCost()));
        writer.name("weeklyTimeCost");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWeeklyTimeCost()));
        writer.name("setupCost");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getSetupCost()));
        writer.name("payPerAttendee");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getPayPerAttendee()));
        writer.name("promotionBudget");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getPromotionBudget()));
        writer.name("isPromotedOnSocial");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isPromotedOnSocial()));
        writer.name("isPromotedOnNews");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isPromotedOnNews()));
        writer.name("baseAttendance");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getBaseAttendance()));
        writer.name("bookedWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getBookedWeek()));
        writer.name("bookedYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getBookedYear()));
        writer.name("status");
        this.stringAdapter.toJson(writer, value_.getStatus());
        writer.name("title");
        this.stringAdapter.toJson(writer, value_.getTitle());
        writer.name("locationsCount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLocationsCount()));
        writer.name("ticketPrice");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getTicketPrice()));
        writer.name("productionTier");
        this.stringAdapter.toJson(writer, value_.getProductionTier());
        writer.name("transportTier");
        this.stringAdapter.toJson(writer, value_.getTransportTier());
        writer.name("backupDancersCount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getBackupDancersCount()));
        writer.name("isLaunched");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isLaunched()));
        writer.name("showHype");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getShowHype()));
        writer.endObject();
    }
}
