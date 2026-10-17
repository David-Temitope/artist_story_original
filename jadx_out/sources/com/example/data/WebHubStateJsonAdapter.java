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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: WebHubStateJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000b\n��\n\u0002\u0010\b\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0016\u001a\u00020\u000eH\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00130\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n��¨\u0006\u001f"}, d2 = {"Lcom/example/data/WebHubStateJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/WebHubState;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "booleanAdapter", "", "intAdapter", "", "stringAdapter", "", "doubleAdapter", "", "nullableStringAdapter", "listOfStringAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
/* loaded from: WebHubStateJsonAdapter.class */
public final class WebHubStateJsonAdapter extends JsonAdapter<WebHubState> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<Boolean> booleanAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @Nullable
    private volatile Constructor<WebHubState> constructorRef;
    public static final int $stable = 8;

    public WebHubStateJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"wgtApplied", "wgtAuditionWeek", "wgtAuditionYear", "wgtCompletedCount", "wgtWon", "isSccWanted", "sccCrimeReason", "sccFineAmount", "blackHatPurchasesCount", "electionVotedCandidateId", "electionVotedWeek", "electionVotedYear", "grandAwardNominated", "grandAwardWon", "grandAwardVipAccess", "lastDemoSubmissionWeek", "labelContractObligations", "wgtSeason", "wgtSeasonYear", "wgtSemiFinalsWeek", "wgtGrandFinaleWeek", "wgtRegistrationStatus", "wgtLastWinner", "wgtContestants"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<Boolean> adapter = moshi.adapter(Boolean.TYPE, SetsKt.emptySet(), "wgtApplied");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.booleanAdapter = adapter;
        JsonAdapter<Integer> adapter2 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "wgtAuditionWeek");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.intAdapter = adapter2;
        JsonAdapter<String> adapter3 = moshi.adapter(String.class, SetsKt.emptySet(), "sccCrimeReason");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.stringAdapter = adapter3;
        JsonAdapter<Double> adapter4 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "sccFineAmount");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.doubleAdapter = adapter4;
        JsonAdapter<String> adapter5 = moshi.adapter(String.class, SetsKt.emptySet(), "electionVotedCandidateId");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.nullableStringAdapter = adapter5;
        JsonAdapter<List<String>> adapter6 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "wgtContestants");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.listOfStringAdapter = adapter6;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(").append("WebHubState").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public WebHubState m183fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Boolean wgtApplied = false;
        Integer wgtAuditionWeek = 0;
        Integer wgtAuditionYear = 0;
        Integer wgtCompletedCount = 0;
        Boolean wgtWon = false;
        Boolean isSccWanted = false;
        String sccCrimeReason = null;
        Double sccFineAmount = Double.valueOf(0.0d);
        Integer blackHatPurchasesCount = 0;
        String electionVotedCandidateId = null;
        Integer electionVotedWeek = 0;
        Integer electionVotedYear = 0;
        Boolean grandAwardNominated = false;
        Boolean grandAwardWon = false;
        Boolean grandAwardVipAccess = false;
        Integer lastDemoSubmissionWeek = 0;
        String labelContractObligations = null;
        Integer wgtSeason = 0;
        Integer wgtSeasonYear = 0;
        Integer wgtSemiFinalsWeek = 0;
        Integer wgtGrandFinaleWeek = 0;
        String wgtRegistrationStatus = null;
        String wgtLastWinner = null;
        List wgtContestants = null;
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
                        wgtApplied = bool;
                        mask0 &= -2;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtApplied", "wgtApplied", reader);
                    }
                case 1:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        wgtAuditionWeek = num;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtAuditionWeek", "wgtAuditionWeek", reader);
                    }
                case 2:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        wgtAuditionYear = num2;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtAuditionYear", "wgtAuditionYear", reader);
                    }
                case 3:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        wgtCompletedCount = num3;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtCompletedCount", "wgtCompletedCount", reader);
                    }
                case 4:
                    Boolean bool2 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool2 != null) {
                        wgtWon = bool2;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtWon", "wgtWon", reader);
                    }
                case 5:
                    Boolean bool3 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool3 != null) {
                        isSccWanted = bool3;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("isSccWanted", "isSccWanted", reader);
                    }
                case 6:
                    String str = (String) this.stringAdapter.fromJson(reader);
                    if (str != null) {
                        sccCrimeReason = str;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("sccCrimeReason", "sccCrimeReason", reader);
                    }
                case 7:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        sccFineAmount = d;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("sccFineAmount", "sccFineAmount", reader);
                    }
                case 8:
                    Integer num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 != null) {
                        blackHatPurchasesCount = num4;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("blackHatPurchasesCount", "blackHatPurchasesCount", reader);
                    }
                case 9:
                    electionVotedCandidateId = (String) this.nullableStringAdapter.fromJson(reader);
                    mask0 &= -513;
                    break;
                case 10:
                    Integer num5 = (Integer) this.intAdapter.fromJson(reader);
                    if (num5 != null) {
                        electionVotedWeek = num5;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("electionVotedWeek", "electionVotedWeek", reader);
                    }
                case 11:
                    Integer num6 = (Integer) this.intAdapter.fromJson(reader);
                    if (num6 != null) {
                        electionVotedYear = num6;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("electionVotedYear", "electionVotedYear", reader);
                    }
                case 12:
                    Boolean bool4 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool4 != null) {
                        grandAwardNominated = bool4;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("grandAwardNominated", "grandAwardNominated", reader);
                    }
                case 13:
                    Boolean bool5 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool5 != null) {
                        grandAwardWon = bool5;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("grandAwardWon", "grandAwardWon", reader);
                    }
                case 14:
                    Boolean bool6 = (Boolean) this.booleanAdapter.fromJson(reader);
                    if (bool6 != null) {
                        grandAwardVipAccess = bool6;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("grandAwardVipAccess", "grandAwardVipAccess", reader);
                    }
                case 15:
                    Integer num7 = (Integer) this.intAdapter.fromJson(reader);
                    if (num7 != null) {
                        lastDemoSubmissionWeek = num7;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("lastDemoSubmissionWeek", "lastDemoSubmissionWeek", reader);
                    }
                case 16:
                    String str2 = (String) this.stringAdapter.fromJson(reader);
                    if (str2 != null) {
                        labelContractObligations = str2;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("labelContractObligations", "labelContractObligations", reader);
                    }
                case 17:
                    Integer num8 = (Integer) this.intAdapter.fromJson(reader);
                    if (num8 != null) {
                        wgtSeason = num8;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtSeason", "wgtSeason", reader);
                    }
                case 18:
                    Integer num9 = (Integer) this.intAdapter.fromJson(reader);
                    if (num9 != null) {
                        wgtSeasonYear = num9;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtSeasonYear", "wgtSeasonYear", reader);
                    }
                case 19:
                    Integer num10 = (Integer) this.intAdapter.fromJson(reader);
                    if (num10 != null) {
                        wgtSemiFinalsWeek = num10;
                        mask0 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtSemiFinalsWeek", "wgtSemiFinalsWeek", reader);
                    }
                case 20:
                    Integer num11 = (Integer) this.intAdapter.fromJson(reader);
                    if (num11 != null) {
                        wgtGrandFinaleWeek = num11;
                        mask0 &= -1048577;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtGrandFinaleWeek", "wgtGrandFinaleWeek", reader);
                    }
                case 21:
                    String str3 = (String) this.stringAdapter.fromJson(reader);
                    if (str3 != null) {
                        wgtRegistrationStatus = str3;
                        mask0 &= -2097153;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtRegistrationStatus", "wgtRegistrationStatus", reader);
                    }
                case 22:
                    String str4 = (String) this.stringAdapter.fromJson(reader);
                    if (str4 != null) {
                        wgtLastWinner = str4;
                        mask0 &= -4194305;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtLastWinner", "wgtLastWinner", reader);
                    }
                case 23:
                    List list = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list != null) {
                        wgtContestants = list;
                        mask0 &= -8388609;
                        break;
                    } else {
                        throw Util.unexpectedNull("wgtContestants", "wgtContestants", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 != -16777216) {
            Constructor constructor = this.constructorRef;
            if (constructor == null) {
                Constructor declaredConstructor = WebHubState.class.getDeclaredConstructor(Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, String.class, Double.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
                this.constructorRef = declaredConstructor;
                constructor = declaredConstructor;
                Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
            }
            Constructor localConstructor = constructor;
            WebHubState newInstance = localConstructor.newInstance(wgtApplied, wgtAuditionWeek, wgtAuditionYear, wgtCompletedCount, wgtWon, isSccWanted, sccCrimeReason, sccFineAmount, blackHatPurchasesCount, electionVotedCandidateId, electionVotedWeek, electionVotedYear, grandAwardNominated, grandAwardWon, grandAwardVipAccess, lastDemoSubmissionWeek, labelContractObligations, wgtSeason, wgtSeasonYear, wgtSemiFinalsWeek, wgtGrandFinaleWeek, wgtRegistrationStatus, wgtLastWinner, wgtContestants, Integer.valueOf(mask0), null);
            Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
            return newInstance;
        }
        boolean booleanValue = wgtApplied.booleanValue();
        int intValue = wgtAuditionWeek.intValue();
        int intValue2 = wgtAuditionYear.intValue();
        int intValue3 = wgtCompletedCount.intValue();
        boolean booleanValue2 = wgtWon.booleanValue();
        boolean booleanValue3 = isSccWanted.booleanValue();
        String str5 = sccCrimeReason;
        Intrinsics.checkNotNull(str5, "null cannot be cast to non-null type kotlin.String");
        int intValue4 = electionVotedWeek.intValue();
        int intValue5 = electionVotedYear.intValue();
        boolean booleanValue4 = grandAwardNominated.booleanValue();
        boolean booleanValue5 = grandAwardWon.booleanValue();
        boolean booleanValue6 = grandAwardVipAccess.booleanValue();
        int intValue6 = lastDemoSubmissionWeek.intValue();
        String str6 = labelContractObligations;
        Intrinsics.checkNotNull(str6, "null cannot be cast to non-null type kotlin.String");
        int intValue7 = wgtSeason.intValue();
        int intValue8 = wgtSeasonYear.intValue();
        int intValue9 = wgtSemiFinalsWeek.intValue();
        int intValue10 = wgtGrandFinaleWeek.intValue();
        String str7 = wgtRegistrationStatus;
        Intrinsics.checkNotNull(str7, "null cannot be cast to non-null type kotlin.String");
        String str8 = wgtLastWinner;
        Intrinsics.checkNotNull(str8, "null cannot be cast to non-null type kotlin.String");
        List list2 = wgtContestants;
        Intrinsics.checkNotNull(list2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
        return new WebHubState(booleanValue, intValue, intValue2, intValue3, booleanValue2, booleanValue3, str5, sccFineAmount.doubleValue(), blackHatPurchasesCount.intValue(), electionVotedCandidateId, intValue4, intValue5, booleanValue4, booleanValue5, booleanValue6, intValue6, str6, intValue7, intValue8, intValue9, intValue10, str7, str8, list2);
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable WebHubState value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("wgtApplied");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getWgtApplied()));
        writer.name("wgtAuditionWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWgtAuditionWeek()));
        writer.name("wgtAuditionYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWgtAuditionYear()));
        writer.name("wgtCompletedCount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWgtCompletedCount()));
        writer.name("wgtWon");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getWgtWon()));
        writer.name("isSccWanted");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.isSccWanted()));
        writer.name("sccCrimeReason");
        this.stringAdapter.toJson(writer, value_.getSccCrimeReason());
        writer.name("sccFineAmount");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getSccFineAmount()));
        writer.name("blackHatPurchasesCount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getBlackHatPurchasesCount()));
        writer.name("electionVotedCandidateId");
        this.nullableStringAdapter.toJson(writer, value_.getElectionVotedCandidateId());
        writer.name("electionVotedWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getElectionVotedWeek()));
        writer.name("electionVotedYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getElectionVotedYear()));
        writer.name("grandAwardNominated");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getGrandAwardNominated()));
        writer.name("grandAwardWon");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getGrandAwardWon()));
        writer.name("grandAwardVipAccess");
        this.booleanAdapter.toJson(writer, Boolean.valueOf(value_.getGrandAwardVipAccess()));
        writer.name("lastDemoSubmissionWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLastDemoSubmissionWeek()));
        writer.name("labelContractObligations");
        this.stringAdapter.toJson(writer, value_.getLabelContractObligations());
        writer.name("wgtSeason");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWgtSeason()));
        writer.name("wgtSeasonYear");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWgtSeasonYear()));
        writer.name("wgtSemiFinalsWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWgtSemiFinalsWeek()));
        writer.name("wgtGrandFinaleWeek");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getWgtGrandFinaleWeek()));
        writer.name("wgtRegistrationStatus");
        this.stringAdapter.toJson(writer, value_.getWgtRegistrationStatus());
        writer.name("wgtLastWinner");
        this.stringAdapter.toJson(writer, value_.getWgtLastWinner());
        writer.name("wgtContestants");
        this.listOfStringAdapter.toJson(writer, value_.getWgtContestants());
        writer.endObject();
    }
}
