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
/* compiled from: OwnRecordLabelJsonAdapter.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n��\n\u0002\u0010\u0007\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\t\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018��2\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010%\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\f0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0001X\u0082\u0004¢\u0006\u0002\n��R\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n��¨\u0006."}, d2 = {"Lcom/example/data/OwnRecordLabelJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/example/data/OwnRecordLabel;", "moshi", "Lcom/squareup/moshi/Moshi;", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "listOfLabelManagerAdapter", "", "Lcom/example/data/LabelManager;", "listOfLabelPromotionTeamAdapter", "Lcom/example/data/LabelPromotionTeam;", "intAdapter", "", "listOfStringAdapter", "doubleAdapter", "", "floatAdapter", "", "listOfCoFounderAdapter", "Lcom/example/data/CoFounder;", "listOfShareholderAdapter", "Lcom/example/data/Shareholder;", "listOfBoardMemberAdapter", "Lcom/example/data/BoardMember;", "listOfInvestorOfferAdapter", "Lcom/example/data/InvestorOffer;", "listOfArtistSigningOfferAdapter", "Lcom/example/data/ArtistSigningOffer;", "longAdapter", "", "constructorRef", "Ljava/lang/reflect/Constructor;", "toString", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "app"})
@SourceDebugExtension({"SMAP\nOwnRecordLabelJsonAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnRecordLabelJsonAdapter.kt\ncom/example/data/OwnRecordLabelJsonAdapter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,420:1\n1#2:421\n*E\n"})
/* loaded from: OwnRecordLabelJsonAdapter.class */
public final class OwnRecordLabelJsonAdapter extends JsonAdapter<OwnRecordLabel> {
    @NotNull
    private final JsonReader.Options options;
    @NotNull
    private final JsonAdapter<String> stringAdapter;
    @NotNull
    private final JsonAdapter<List<LabelManager>> listOfLabelManagerAdapter;
    @NotNull
    private final JsonAdapter<List<LabelPromotionTeam>> listOfLabelPromotionTeamAdapter;
    @NotNull
    private final JsonAdapter<Integer> intAdapter;
    @NotNull
    private final JsonAdapter<List<String>> listOfStringAdapter;
    @NotNull
    private final JsonAdapter<Double> doubleAdapter;
    @NotNull
    private final JsonAdapter<Float> floatAdapter;
    @NotNull
    private final JsonAdapter<List<CoFounder>> listOfCoFounderAdapter;
    @NotNull
    private final JsonAdapter<List<Shareholder>> listOfShareholderAdapter;
    @NotNull
    private final JsonAdapter<List<BoardMember>> listOfBoardMemberAdapter;
    @NotNull
    private final JsonAdapter<List<InvestorOffer>> listOfInvestorOfferAdapter;
    @NotNull
    private final JsonAdapter<List<ArtistSigningOffer>> listOfArtistSigningOfferAdapter;
    @NotNull
    private final JsonAdapter<Long> longAdapter;
    @Nullable
    private volatile Constructor<OwnRecordLabel> constructorRef;
    public static final int $stable = 8;

    public OwnRecordLabelJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        JsonReader.Options of = JsonReader.Options.of(new String[]{"name", "managers", "promoTeams", "ownedPropertiesCount", "signedNPCIds", "accruedDebts", "companyCash", "equityHeldByPlayer", "valuation", "weeklyRoyaltiesEarned", "productionLevel", "marketingLevel", "touringLevel", "legalLevel", "arLevel", "coFounders", "shareholders", "boardMembers", "pendingInvestorOffers", "pendingSigningOffers", "dividendPayoutRate", "ceoSalary", "totalSharesIssued", "boardSatisfaction", "marketShare", "labelReputation"});
        Intrinsics.checkNotNullExpressionValue(of, "of(...)");
        this.options = of;
        JsonAdapter<String> adapter = moshi.adapter(String.class, SetsKt.emptySet(), "name");
        Intrinsics.checkNotNullExpressionValue(adapter, "adapter(...)");
        this.stringAdapter = adapter;
        JsonAdapter<List<LabelManager>> adapter2 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{LabelManager.class}), SetsKt.emptySet(), "managers");
        Intrinsics.checkNotNullExpressionValue(adapter2, "adapter(...)");
        this.listOfLabelManagerAdapter = adapter2;
        JsonAdapter<List<LabelPromotionTeam>> adapter3 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{LabelPromotionTeam.class}), SetsKt.emptySet(), "promoTeams");
        Intrinsics.checkNotNullExpressionValue(adapter3, "adapter(...)");
        this.listOfLabelPromotionTeamAdapter = adapter3;
        JsonAdapter<Integer> adapter4 = moshi.adapter(Integer.TYPE, SetsKt.emptySet(), "ownedPropertiesCount");
        Intrinsics.checkNotNullExpressionValue(adapter4, "adapter(...)");
        this.intAdapter = adapter4;
        JsonAdapter<List<String>> adapter5 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}), SetsKt.emptySet(), "signedNPCIds");
        Intrinsics.checkNotNullExpressionValue(adapter5, "adapter(...)");
        this.listOfStringAdapter = adapter5;
        JsonAdapter<Double> adapter6 = moshi.adapter(Double.TYPE, SetsKt.emptySet(), "accruedDebts");
        Intrinsics.checkNotNullExpressionValue(adapter6, "adapter(...)");
        this.doubleAdapter = adapter6;
        JsonAdapter<Float> adapter7 = moshi.adapter(Float.TYPE, SetsKt.emptySet(), "equityHeldByPlayer");
        Intrinsics.checkNotNullExpressionValue(adapter7, "adapter(...)");
        this.floatAdapter = adapter7;
        JsonAdapter<List<CoFounder>> adapter8 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{CoFounder.class}), SetsKt.emptySet(), "coFounders");
        Intrinsics.checkNotNullExpressionValue(adapter8, "adapter(...)");
        this.listOfCoFounderAdapter = adapter8;
        JsonAdapter<List<Shareholder>> adapter9 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Shareholder.class}), SetsKt.emptySet(), "shareholders");
        Intrinsics.checkNotNullExpressionValue(adapter9, "adapter(...)");
        this.listOfShareholderAdapter = adapter9;
        JsonAdapter<List<BoardMember>> adapter10 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{BoardMember.class}), SetsKt.emptySet(), "boardMembers");
        Intrinsics.checkNotNullExpressionValue(adapter10, "adapter(...)");
        this.listOfBoardMemberAdapter = adapter10;
        JsonAdapter<List<InvestorOffer>> adapter11 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{InvestorOffer.class}), SetsKt.emptySet(), "pendingInvestorOffers");
        Intrinsics.checkNotNullExpressionValue(adapter11, "adapter(...)");
        this.listOfInvestorOfferAdapter = adapter11;
        JsonAdapter<List<ArtistSigningOffer>> adapter12 = moshi.adapter(Types.newParameterizedType(List.class, new Type[]{ArtistSigningOffer.class}), SetsKt.emptySet(), "pendingSigningOffers");
        Intrinsics.checkNotNullExpressionValue(adapter12, "adapter(...)");
        this.listOfArtistSigningOfferAdapter = adapter12;
        JsonAdapter<Long> adapter13 = moshi.adapter(Long.TYPE, SetsKt.emptySet(), "totalSharesIssued");
        Intrinsics.checkNotNullExpressionValue(adapter13, "adapter(...)");
        this.longAdapter = adapter13;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder(36);
        sb.append("GeneratedJsonAdapter(").append("OwnRecordLabel").append(')');
        return sb.toString();
    }

    @NotNull
    /* renamed from: fromJson */
    public OwnRecordLabel m132fromJson(@NotNull JsonReader reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        String name = null;
        List managers = null;
        List promoTeams = null;
        Integer ownedPropertiesCount = 0;
        List signedNPCIds = null;
        Double accruedDebts = Double.valueOf(0.0d);
        Double companyCash = Double.valueOf(0.0d);
        Float equityHeldByPlayer = Float.valueOf(0.0f);
        Double valuation = Double.valueOf(0.0d);
        Double weeklyRoyaltiesEarned = Double.valueOf(0.0d);
        Integer productionLevel = 0;
        Integer marketingLevel = 0;
        Integer touringLevel = 0;
        Integer legalLevel = 0;
        Integer arLevel = 0;
        List coFounders = null;
        List shareholders = null;
        List boardMembers = null;
        List pendingInvestorOffers = null;
        List pendingSigningOffers = null;
        Float dividendPayoutRate = Float.valueOf(0.0f);
        Double ceoSalary = Double.valueOf(0.0d);
        Long totalSharesIssued = 0L;
        Float boardSatisfaction = Float.valueOf(0.0f);
        Float marketShare = Float.valueOf(0.0f);
        Float labelReputation = Float.valueOf(0.0f);
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
                        name = str;
                        break;
                    } else {
                        throw Util.unexpectedNull("name", "name", reader);
                    }
                case 1:
                    List list = (List) this.listOfLabelManagerAdapter.fromJson(reader);
                    if (list != null) {
                        managers = list;
                        mask0 &= -3;
                        break;
                    } else {
                        throw Util.unexpectedNull("managers", "managers", reader);
                    }
                case 2:
                    List list2 = (List) this.listOfLabelPromotionTeamAdapter.fromJson(reader);
                    if (list2 != null) {
                        promoTeams = list2;
                        mask0 &= -5;
                        break;
                    } else {
                        throw Util.unexpectedNull("promoTeams", "promoTeams", reader);
                    }
                case 3:
                    Integer num = (Integer) this.intAdapter.fromJson(reader);
                    if (num != null) {
                        ownedPropertiesCount = num;
                        mask0 &= -9;
                        break;
                    } else {
                        throw Util.unexpectedNull("ownedPropertiesCount", "ownedPropertiesCount", reader);
                    }
                case 4:
                    List list3 = (List) this.listOfStringAdapter.fromJson(reader);
                    if (list3 != null) {
                        signedNPCIds = list3;
                        mask0 &= -17;
                        break;
                    } else {
                        throw Util.unexpectedNull("signedNPCIds", "signedNPCIds", reader);
                    }
                case 5:
                    Double d = (Double) this.doubleAdapter.fromJson(reader);
                    if (d != null) {
                        accruedDebts = d;
                        mask0 &= -33;
                        break;
                    } else {
                        throw Util.unexpectedNull("accruedDebts", "accruedDebts", reader);
                    }
                case 6:
                    Double d2 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d2 != null) {
                        companyCash = d2;
                        mask0 &= -65;
                        break;
                    } else {
                        throw Util.unexpectedNull("companyCash", "companyCash", reader);
                    }
                case 7:
                    Float f = (Float) this.floatAdapter.fromJson(reader);
                    if (f != null) {
                        equityHeldByPlayer = f;
                        mask0 &= -129;
                        break;
                    } else {
                        throw Util.unexpectedNull("equityHeldByPlayer", "equityHeldByPlayer", reader);
                    }
                case 8:
                    Double d3 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d3 != null) {
                        valuation = d3;
                        mask0 &= -257;
                        break;
                    } else {
                        throw Util.unexpectedNull("valuation", "valuation", reader);
                    }
                case 9:
                    Double d4 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d4 != null) {
                        weeklyRoyaltiesEarned = d4;
                        mask0 &= -513;
                        break;
                    } else {
                        throw Util.unexpectedNull("weeklyRoyaltiesEarned", "weeklyRoyaltiesEarned", reader);
                    }
                case 10:
                    Integer num2 = (Integer) this.intAdapter.fromJson(reader);
                    if (num2 != null) {
                        productionLevel = num2;
                        mask0 &= -1025;
                        break;
                    } else {
                        throw Util.unexpectedNull("productionLevel", "productionLevel", reader);
                    }
                case 11:
                    Integer num3 = (Integer) this.intAdapter.fromJson(reader);
                    if (num3 != null) {
                        marketingLevel = num3;
                        mask0 &= -2049;
                        break;
                    } else {
                        throw Util.unexpectedNull("marketingLevel", "marketingLevel", reader);
                    }
                case 12:
                    Integer num4 = (Integer) this.intAdapter.fromJson(reader);
                    if (num4 != null) {
                        touringLevel = num4;
                        mask0 &= -4097;
                        break;
                    } else {
                        throw Util.unexpectedNull("touringLevel", "touringLevel", reader);
                    }
                case 13:
                    Integer num5 = (Integer) this.intAdapter.fromJson(reader);
                    if (num5 != null) {
                        legalLevel = num5;
                        mask0 &= -8193;
                        break;
                    } else {
                        throw Util.unexpectedNull("legalLevel", "legalLevel", reader);
                    }
                case 14:
                    Integer num6 = (Integer) this.intAdapter.fromJson(reader);
                    if (num6 != null) {
                        arLevel = num6;
                        mask0 &= -16385;
                        break;
                    } else {
                        throw Util.unexpectedNull("arLevel", "arLevel", reader);
                    }
                case 15:
                    List list4 = (List) this.listOfCoFounderAdapter.fromJson(reader);
                    if (list4 != null) {
                        coFounders = list4;
                        mask0 &= -32769;
                        break;
                    } else {
                        throw Util.unexpectedNull("coFounders", "coFounders", reader);
                    }
                case 16:
                    List list5 = (List) this.listOfShareholderAdapter.fromJson(reader);
                    if (list5 != null) {
                        shareholders = list5;
                        mask0 &= -65537;
                        break;
                    } else {
                        throw Util.unexpectedNull("shareholders", "shareholders", reader);
                    }
                case 17:
                    List list6 = (List) this.listOfBoardMemberAdapter.fromJson(reader);
                    if (list6 != null) {
                        boardMembers = list6;
                        mask0 &= -131073;
                        break;
                    } else {
                        throw Util.unexpectedNull("boardMembers", "boardMembers", reader);
                    }
                case 18:
                    List list7 = (List) this.listOfInvestorOfferAdapter.fromJson(reader);
                    if (list7 != null) {
                        pendingInvestorOffers = list7;
                        mask0 &= -262145;
                        break;
                    } else {
                        throw Util.unexpectedNull("pendingInvestorOffers", "pendingInvestorOffers", reader);
                    }
                case 19:
                    List list8 = (List) this.listOfArtistSigningOfferAdapter.fromJson(reader);
                    if (list8 != null) {
                        pendingSigningOffers = list8;
                        mask0 &= -524289;
                        break;
                    } else {
                        throw Util.unexpectedNull("pendingSigningOffers", "pendingSigningOffers", reader);
                    }
                case 20:
                    Float f2 = (Float) this.floatAdapter.fromJson(reader);
                    if (f2 != null) {
                        dividendPayoutRate = f2;
                        mask0 &= -1048577;
                        break;
                    } else {
                        throw Util.unexpectedNull("dividendPayoutRate", "dividendPayoutRate", reader);
                    }
                case 21:
                    Double d5 = (Double) this.doubleAdapter.fromJson(reader);
                    if (d5 != null) {
                        ceoSalary = d5;
                        mask0 &= -2097153;
                        break;
                    } else {
                        throw Util.unexpectedNull("ceoSalary", "ceoSalary", reader);
                    }
                case 22:
                    Long l = (Long) this.longAdapter.fromJson(reader);
                    if (l != null) {
                        totalSharesIssued = l;
                        mask0 &= -4194305;
                        break;
                    } else {
                        throw Util.unexpectedNull("totalSharesIssued", "totalSharesIssued", reader);
                    }
                case 23:
                    Float f3 = (Float) this.floatAdapter.fromJson(reader);
                    if (f3 != null) {
                        boardSatisfaction = f3;
                        mask0 &= -8388609;
                        break;
                    } else {
                        throw Util.unexpectedNull("boardSatisfaction", "boardSatisfaction", reader);
                    }
                case 24:
                    Float f4 = (Float) this.floatAdapter.fromJson(reader);
                    if (f4 != null) {
                        marketShare = f4;
                        mask0 &= -16777217;
                        break;
                    } else {
                        throw Util.unexpectedNull("marketShare", "marketShare", reader);
                    }
                case 25:
                    Float f5 = (Float) this.floatAdapter.fromJson(reader);
                    if (f5 != null) {
                        labelReputation = f5;
                        mask0 &= -33554433;
                        break;
                    } else {
                        throw Util.unexpectedNull("labelReputation", "labelReputation", reader);
                    }
            }
        }
        reader.endObject();
        if (mask0 == -67108863) {
            String str2 = name;
            if (str2 == null) {
                throw Util.missingProperty("name", "name", reader);
            }
            List list9 = managers;
            Intrinsics.checkNotNull(list9, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.LabelManager>");
            List list10 = promoTeams;
            Intrinsics.checkNotNull(list10, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.LabelPromotionTeam>");
            int intValue = ownedPropertiesCount.intValue();
            List list11 = signedNPCIds;
            Intrinsics.checkNotNull(list11, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            double doubleValue = accruedDebts.doubleValue();
            double doubleValue2 = companyCash.doubleValue();
            float floatValue = equityHeldByPlayer.floatValue();
            double doubleValue3 = valuation.doubleValue();
            double doubleValue4 = weeklyRoyaltiesEarned.doubleValue();
            int intValue2 = productionLevel.intValue();
            int intValue3 = marketingLevel.intValue();
            int intValue4 = touringLevel.intValue();
            int intValue5 = legalLevel.intValue();
            int intValue6 = arLevel.intValue();
            List list12 = coFounders;
            Intrinsics.checkNotNull(list12, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.CoFounder>");
            List list13 = shareholders;
            Intrinsics.checkNotNull(list13, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.Shareholder>");
            List list14 = boardMembers;
            Intrinsics.checkNotNull(list14, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.BoardMember>");
            List list15 = pendingInvestorOffers;
            Intrinsics.checkNotNull(list15, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.InvestorOffer>");
            List list16 = pendingSigningOffers;
            Intrinsics.checkNotNull(list16, "null cannot be cast to non-null type kotlin.collections.List<com.example.data.ArtistSigningOffer>");
            return new OwnRecordLabel(str2, list9, list10, intValue, list11, doubleValue, doubleValue2, floatValue, doubleValue3, doubleValue4, intValue2, intValue3, intValue4, intValue5, intValue6, list12, list13, list14, list15, list16, dividendPayoutRate.floatValue(), ceoSalary.doubleValue(), totalSharesIssued.longValue(), boardSatisfaction.floatValue(), marketShare.floatValue(), labelReputation.floatValue());
        }
        Constructor constructor = this.constructorRef;
        if (constructor == null) {
            Constructor declaredConstructor = OwnRecordLabel.class.getDeclaredConstructor(String.class, List.class, List.class, Integer.TYPE, List.class, Double.TYPE, Double.TYPE, Float.TYPE, Double.TYPE, Double.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, List.class, List.class, List.class, List.class, List.class, Float.TYPE, Double.TYPE, Long.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = declaredConstructor;
            constructor = declaredConstructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor localConstructor = constructor;
        Object[] objArr = new Object[28];
        String str3 = name;
        if (str3 == null) {
            throw Util.missingProperty("name", "name", reader);
        }
        objArr[0] = str3;
        objArr[1] = managers;
        objArr[2] = promoTeams;
        objArr[3] = ownedPropertiesCount;
        objArr[4] = signedNPCIds;
        objArr[5] = accruedDebts;
        objArr[6] = companyCash;
        objArr[7] = equityHeldByPlayer;
        objArr[8] = valuation;
        objArr[9] = weeklyRoyaltiesEarned;
        objArr[10] = productionLevel;
        objArr[11] = marketingLevel;
        objArr[12] = touringLevel;
        objArr[13] = legalLevel;
        objArr[14] = arLevel;
        objArr[15] = coFounders;
        objArr[16] = shareholders;
        objArr[17] = boardMembers;
        objArr[18] = pendingInvestorOffers;
        objArr[19] = pendingSigningOffers;
        objArr[20] = dividendPayoutRate;
        objArr[21] = ceoSalary;
        objArr[22] = totalSharesIssued;
        objArr[23] = boardSatisfaction;
        objArr[24] = marketShare;
        objArr[25] = labelReputation;
        objArr[26] = Integer.valueOf(mask0);
        objArr[27] = null;
        OwnRecordLabel newInstance = localConstructor.newInstance(objArr);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    public void toJson(@NotNull JsonWriter writer, @Nullable OwnRecordLabel value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.beginObject();
        writer.name("name");
        this.stringAdapter.toJson(writer, value_.getName());
        writer.name("managers");
        this.listOfLabelManagerAdapter.toJson(writer, value_.getManagers());
        writer.name("promoTeams");
        this.listOfLabelPromotionTeamAdapter.toJson(writer, value_.getPromoTeams());
        writer.name("ownedPropertiesCount");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getOwnedPropertiesCount()));
        writer.name("signedNPCIds");
        this.listOfStringAdapter.toJson(writer, value_.getSignedNPCIds());
        writer.name("accruedDebts");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getAccruedDebts()));
        writer.name("companyCash");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCompanyCash()));
        writer.name("equityHeldByPlayer");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getEquityHeldByPlayer()));
        writer.name("valuation");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getValuation()));
        writer.name("weeklyRoyaltiesEarned");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getWeeklyRoyaltiesEarned()));
        writer.name("productionLevel");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getProductionLevel()));
        writer.name("marketingLevel");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getMarketingLevel()));
        writer.name("touringLevel");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getTouringLevel()));
        writer.name("legalLevel");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getLegalLevel()));
        writer.name("arLevel");
        this.intAdapter.toJson(writer, Integer.valueOf(value_.getArLevel()));
        writer.name("coFounders");
        this.listOfCoFounderAdapter.toJson(writer, value_.getCoFounders());
        writer.name("shareholders");
        this.listOfShareholderAdapter.toJson(writer, value_.getShareholders());
        writer.name("boardMembers");
        this.listOfBoardMemberAdapter.toJson(writer, value_.getBoardMembers());
        writer.name("pendingInvestorOffers");
        this.listOfInvestorOfferAdapter.toJson(writer, value_.getPendingInvestorOffers());
        writer.name("pendingSigningOffers");
        this.listOfArtistSigningOfferAdapter.toJson(writer, value_.getPendingSigningOffers());
        writer.name("dividendPayoutRate");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getDividendPayoutRate()));
        writer.name("ceoSalary");
        this.doubleAdapter.toJson(writer, Double.valueOf(value_.getCeoSalary()));
        writer.name("totalSharesIssued");
        this.longAdapter.toJson(writer, Long.valueOf(value_.getTotalSharesIssued()));
        writer.name("boardSatisfaction");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getBoardSatisfaction()));
        writer.name("marketShare");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getMarketShare()));
        writer.name("labelReputation");
        this.floatAdapter.toJson(writer, Float.valueOf(value_.getLabelReputation()));
        writer.endObject();
    }
}
