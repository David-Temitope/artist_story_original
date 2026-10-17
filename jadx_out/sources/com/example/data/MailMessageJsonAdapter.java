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
/* compiled from: MailMessageJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001f"}, d2 = {"Lcom/example/data/MailMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/MailMessage;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "doubleAdapter", "", "booleanAdapter", "", "intAdapter", "", "floatAdapter", "", "nullableStringAdapter", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: MailMessageJsonAdapter.class */
public final class MailMessageJsonAdapter extends JsonAdapter<MailMessage> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @Nullable
    private volatile Constructor<MailMessage> constructorRef;
    public static final int $stable = 8;

    public MailMessageJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"id", "sender", "subject", "body", "cashOffer", "type", "isRead", "isAccepted", "expiresWeek", "expiresYear", "labelCut", "labelId", "labelRole", "labelLevel", "contractDurationWeeks", "startWeek", "startYear", "endWeek", "endYear", "reqSingles", "reqAlbumsLP", "reqAlbumsEP", "reqMeTubeVideos", "contractTemplate", "labelLevelText"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "id");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<Double> adapter2 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "cashOffer");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.doubleAdapter = adapter2;
        JsonAdapter<Boolean> adapter3 = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "isRead");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.booleanAdapter = adapter3;
        JsonAdapter<Integer> adapter4 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "expiresWeek");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.intAdapter = adapter4;
        JsonAdapter<Float> adapter5 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "labelCut");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.floatAdapter = adapter5;
        JsonAdapter<String> adapter6 = moshi.adapter(String.class, SetsKt.emptySet(), "labelId");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.nullableStringAdapter = adapter6;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("MailMessage").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public MailMessage m107fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String id = null;
        String sender = null;
        String subject = null;
        String body = null;
        Double cashOffer = Double.valueOf(0.0d);
        String type = null;
        Boolean isRead = false;
        Boolean isAccepted = false;
        Integer expiresWeek = null;
        Integer expiresYear = null;
        Float labelCut = Float.valueOf(0.0f);
        String labelId = null;
        String labelRole = null;
        Integer labelLevel = 0;
        Integer contractDurationWeeks = 0;
        Integer startWeek = 0;
        Integer startYear = 0;
        Integer endWeek = 0;
        Integer endYear = 0;
        Integer reqSingles = 0;
        Integer reqAlbumsLP = 0;
        Integer reqAlbumsEP = 0;
        Integer reqMeTubeVideos = 0;
        String contractTemplate = null;
        String labelLevelText = null;
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
                        sender = str2;
                        break;
                    } else {
                        throw Util.unexpectedNull("sender", "sender", reader);
                    }
                case 2:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        subject = str3;
                        break;
                    } else {
                        throw Util.unexpectedNull("subject", "subject", reader);
                    }
                case 3:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        body = str4;
                        break;
                    } else {
                        throw Util.unexpectedNull("body", "body", reader);
                    }
                case 4:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        cashOffer = d;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("cashOffer", "cashOffer", reader);
                    }
                case 5:
                    String str5 = (String) this.stringAdapter.fromJson(reader);
                    if (str5 != null) {
                        type = str5;
                        break;
                    } else {
                        throw Util.unexpectedNull("type", "type", reader);
                    }
                case 6:
                    Boolean bool = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool != null) {
                        isRead = bool;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("isRead", "isRead", reader);
                    }
                case 7:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        isAccepted = bool2;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("isAccepted", "isAccepted", reader);
                    }
                case 8:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        expiresWeek = num;
                        break;
                    } else {
                        throw Util.unexpectedNull("expiresWeek", "expiresWeek", reader);
                    }
                case 9:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        expiresYear = num2;
                        break;
                    } else {
                        throw Util.unexpectedNull("expiresYear", "expiresYear", reader);
                    }
                case 10:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        labelCut = f;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("labelCut", "labelCut", reader);
                    }
                case 11:
                    labelId = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -2049;
                    break;
                case 12:
                    labelRole = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -4097;
                    break;
                case 13:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        labelLevel = num3;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("labelLevel", "labelLevel", reader);
                    }
                case 14:
                    Integer num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 != null) {
                        contractDurationWeeks = num4;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("contractDurationWeeks", "contractDurationWeeks", reader);
                    }
                case 15:
                    Integer num5 = (Integer) this.intAdapter.fromJson(reader);
                    if (num5 != null) {
                        startWeek = num5;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("startWeek", "startWeek", reader);
                    }
                case 16:
                    Integer num6 = (Integer) this.intAdapter.fromJson(reader);
                    if (num6 != null) {
                        startYear = num6;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("startYear", "startYear", reader);
                    }
                case 17:
                    Integer num7 = (Integer) this.intAdapter.fromJson(reader);
                    if (num7 != null) {
                        endWeek = num7;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("endWeek", "endWeek", reader);
                    }
                case 18:
                    Integer num8 = (Integer) this.intAdapter.fromJson(reader);
                    if (num8 != null) {
                        endYear = num8;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("endYear", "endYear", reader);
                    }
                case 19:
                    Integer num9 = (Integer) this.intAdapter.fromJson(reader);
                    if (num9 != null) {
                        reqSingles = num9;
                        mask0 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("reqSingles", "reqSingles", reader);
                    }
                case 20:
                    Integer num10 = (Integer) this.intAdapter.fromJson(reader);
                    if (num10 != null) {
                        reqAlbumsLP = num10;
                        mask0 &= -1048577;
                        break;
                    } else {
                        throw Util.unexpectedNull("reqAlbumsLP", "reqAlbumsLP", reader);
                    }
                case 21:
                    Integer num11 = (Integer) this.intAdapter.fromJson(reader);
                    if (num11 != null) {
                        reqAlbumsEP = num11;
                        mask0 &= -2097153;
                        break;
                    } else {
                        throw Util.unexpectedNull("reqAlbumsEP", "reqAlbumsEP", reader);
                    }
                case 22:
                    Integer num12 = (Integer) this.intAdapter.fromJson(reader);
                    if (num12 != null) {
                        reqMeTubeVideos = num12;
                        mask0 &= -4194305;
                        break;
                    } else {
                        throw Util.unexpectedNull("reqMeTubeVideos", "reqMeTubeVideos", reader);
                    }
                case 23:
                    String str6 = (String) this.stringAdapter.fromJson(reader);
                    if (str6 != null) {
                        contractTemplate = str6;
                        mask0 &= -8388609;
                        break;
                    } else {
                        throw Util.unexpectedNull("contractTemplate", "contractTemplate", reader);
                    }
                case 24:
                    String str7 = (String) this.stringAdapter.fromJson(reader);
                    if (str7 != null) {
                        labelLevelText = str7;
                        mask0 &= -16777217;
                        break;
                    } else {
                        throw Util.unexpectedNull("labelLevelText", "labelLevelText", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -33553617) {
            String str8 = id;
            if (str8 == null) {
                throw Util.missingProperty("id", "id", reader);
            }
            String str9 = sender;
            if (str9 == null) {
                throw Util.missingProperty("sender", "sender", reader);
            }
            String str10 = subject;
            if (str10 == null) {
                throw Util.missingProperty("subject", "subject", reader);
            }
            String str11 = body;
            if (str11 == null) {
                throw Util.missingProperty("body", "body", reader);
            }
            double doubleValue = cashOffer.doubleValue();
            String str12 = type;
            if (str12 == null) {
                throw Util.missingProperty("type", "type", reader);
            }
            boolean booleanValue = isRead.booleanValue();
            boolean booleanValue2 = isAccepted.booleanValue();
            Integer num13 = expiresWeek;
            if (num13 != null) {
                int intValue = num13.intValue();
                Integer num14 = expiresYear;
                if (num14 != null) {
                    int intValue2 = num14.intValue();
                    int intValue3 = labelLevel.intValue();
                    int intValue4 = contractDurationWeeks.intValue();
                    int intValue5 = startWeek.intValue();
                    int intValue6 = startYear.intValue();
                    int intValue7 = endWeek.intValue();
                    int intValue8 = endYear.intValue();
                    int intValue9 = reqSingles.intValue();
                    int intValue10 = reqAlbumsLP.intValue();
                    int intValue11 = reqAlbumsEP.intValue();
                    int intValue12 = reqMeTubeVideos.intValue();
                    String str13 = contractTemplate;
                    Intrinsics.checkNotNull(str13, "null cannot be cast to non-null type kotlin.String");
                    String str14 = labelLevelText;
                    Intrinsics.checkNotNull(str14, "null cannot be cast to non-null type kotlin.String");
                    return new MailMessage(str8, str9, str10, str11, doubleValue, str12, booleanValue, booleanValue2, intValue, intValue2, labelCut.floatValue(), labelId, labelRole, intValue3, intValue4, intValue5, intValue6, intValue7, intValue8, intValue9, intValue10, intValue11, intValue12, str13, str14);
                }
                throw Util.missingProperty("expiresYear", "expiresYear", reader);
            }
            throw Util.missingProperty("expiresWeek", "expiresWeek", reader);
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = MailMessage.class.getDeclaredConstructor(String.class, String.class, String.class, String.class, Double.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[27];
        String str15 = id;
        if (str15 == null) {
            throw Util.missingProperty("id", "id", reader);
        }
        objArr[0] = str15;
        String str16 = sender;
        if (str16 == null) {
            throw Util.missingProperty("sender", "sender", reader);
        }
        objArr[1] = str16;
        String str17 = subject;
        if (str17 == null) {
            throw Util.missingProperty("subject", "subject", reader);
        }
        objArr[2] = str17;
        String str18 = body;
        if (str18 == null) {
            throw Util.missingProperty("body", "body", reader);
        }
        objArr[3] = str18;
        objArr[4] = cashOffer;
        String str19 = type;
        if (str19 == null) {
            throw Util.missingProperty("type", "type", reader);
        }
        objArr[5] = str19;
        objArr[6] = isRead;
        objArr[7] = isAccepted;
        Integer num15 = expiresWeek;
        if (num15 != null) {
            objArr[8] = Integer.valueOf(num15.intValue());
            Integer num16 = expiresYear;
            if (num16 != null) {
                objArr[9] = Integer.valueOf(num16.intValue());
                objArr[10] = labelCut;
                objArr[11] = labelId;
                objArr[12] = labelRole;
                objArr[13] = labelLevel;
                objArr[14] = contractDurationWeeks;
                objArr[15] = startWeek;
                objArr[16] = startYear;
                objArr[17] = endWeek;
                objArr[18] = endYear;
                objArr[19] = reqSingles;
                objArr[20] = reqAlbumsLP;
                objArr[21] = reqAlbumsEP;
                objArr[22] = reqMeTubeVideos;
                objArr[23] = contractTemplate;
                objArr[24] = labelLevelText;
                objArr[25] = Integer.valueOf(mask0);
                objArr[26] = null;
                MailMessage newInstance = localConstructor.newInstance(objArr);
                Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
                return newInstance;
            }
            throw Util.missingProperty("expiresYear", "expiresYear", reader);
        }
        throw Util.missingProperty("expiresWeek", "expiresWeek", reader);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable MailMessage value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.name("sender");
        this.stringAdapter.toJson(writer, value_.getSender());
        writer.name("subject");
        this.stringAdapter.toJson(writer, value_.getSubject());
        writer.name("body");
        this.stringAdapter.toJson(writer, value_.getBody());
        writer.name("cashOffer");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCashOffer()));
        writer.name("type");
        this.stringAdapter.toJson(writer, value_.getType());
        writer.name("isRead");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isRead()));
        writer.name("isAccepted");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isAccepted()));
        writer.name("expiresWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getExpiresWeek()));
        writer.name("expiresYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getExpiresYear()));
        writer.name("labelCut");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLabelCut()));
        writer.name("labelId");
        this.nullableStringAdapter.toJson(writer, value_.getLabelId());
        writer.name("labelRole");
        this.nullableStringAdapter.toJson(writer, value_.getLabelRole());
        writer.name("labelLevel");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLabelLevel()));
        writer.name("contractDurationWeeks");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getContractDurationWeeks()));
        writer.name("startWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getStartWeek()));
        writer.name("startYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getStartYear()));
        writer.name("endWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getEndWeek()));
        writer.name("endYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getEndYear()));
        writer.name("reqSingles");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getReqSingles()));
        writer.name("reqAlbumsLP");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getReqAlbumsLP()));
        writer.name("reqAlbumsEP");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getReqAlbumsEP()));
        writer.name("reqMeTubeVideos");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getReqMeTubeVideos()));
        writer.name("contractTemplate");
        this.stringAdapter.toJson(writer, value_.getContractTemplate());
        writer.name("labelLevelText");
        this.stringAdapter.toJson(writer, value_.getLabelLevelText());
        writer.endObject();
    }
}
