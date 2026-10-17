package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.TypeConverter;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameStateEntity.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n��\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\b\u0007\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0007J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\r\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\nH\u0007J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u0010\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\nH\u0007J\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u0013\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\nH\u0007J\u0018\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u0016\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\nH\u0007J\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u0019\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\nH\u0007J\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u001c\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\nH\u0007J\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\u001f\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\nH\u0007J\u0018\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010\"\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\nH\u0007J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010%\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\nH\u0007J\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010(\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010\nH\u0007J\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010+\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010\nH\u0007J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010.\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010/H\u0007J\u0014\u00100\u001a\u0004\u0018\u00010/2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u00101\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010\nH\u0007J\u0018\u00103\u001a\b\u0012\u0004\u0012\u0002020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u00104\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010\nH\u0007J\u0018\u00106\u001a\b\u0012\u0004\u0012\u0002050\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u00107\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u000208\u0018\u00010\nH\u0007J\u0018\u00109\u001a\b\u0012\u0004\u0012\u0002080\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010:\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\nH\u0007J\u0018\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u001e\u0010=\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020?\u0018\u00010>H\u0007J\u001e\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020?0>2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010A\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\nH\u0007J\u0018\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010C\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010\nH\u0007J\u0018\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010F\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020G\u0018\u00010\nH\u0007J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020G0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010I\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020J\u0018\u00010\nH\u0007J\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020J0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010L\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020M\u0018\u00010\nH\u0007J\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020M0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010O\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020P\u0018\u00010\nH\u0007J\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010R\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020S\u0018\u00010\nH\u0007J\u0018\u0010T\u001a\b\u0012\u0004\u0012\u00020S0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010U\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020V\u0018\u00010\nH\u0007J\u0018\u0010W\u001a\b\u0012\u0004\u0012\u00020V0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010X\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020Y\u0018\u00010\nH\u0007J\u0018\u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010[\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\\\u0018\u00010\nH\u0007J\u0018\u0010]\u001a\b\u0012\u0004\u0012\u00020\\0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010^\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020_\u0018\u00010\nH\u0007J\u0018\u0010`\u001a\b\u0012\u0004\u0012\u00020_0\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0018\u0010a\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010bH\u0007J\u0018\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n��¨\u0006d"}, d2 = {"Lcom/example/data/Converters;", "", "<init>", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "fromWorldHistoryEntryList", "", "value", "", "Lcom/example/data/WorldHistoryEntry;", "toWorldHistoryEntryList", "fromAlbumList", "Lcom/example/data/Album;", "toAlbumList", "fromChartSongList", "Lcom/example/data/ChartSong;", "toChartSongList", "fromMerchStyleList", "Lcom/example/data/MerchStyle;", "toMerchStyleList", "fromCarList", "Lcom/example/data/Car;", "toCarList", "fromHouseList", "Lcom/example/data/House;", "toHouseList", "fromInstrumentList", "Lcom/example/data/Instrument;", "toInstrumentList", "fromSongList", "Lcom/example/data/Song;", "toSongList", "fromTourList", "Lcom/example/data/Tour;", "toTourList", "fromSideJobList", "Lcom/example/data/SideJob;", "toSideJobList", "fromStockList", "Lcom/example/data/Stock;", "toStockList", "fromCryptoList", "Lcom/example/data/Crypto;", "toCryptoList", "fromOwnRecordLabel", "Lcom/example/data/OwnRecordLabel;", "toOwnRecordLabel", "fromMailMessageList", "Lcom/example/data/MailMessage;", "toMailMessageList", "fromNPCEntityList", "Lcom/example/data/NPCEntity;", "toNPCEntityList", "fromPurchaseRequestList", "Lcom/example/data/PurchaseRequest;", "toPurchaseRequestList", "fromBusinessAssetList", "Lcom/example/data/BusinessAsset;", "toBusinessAssetList", "fromStringMap", "", "", "toStringMap", "fromStringList", "toStringList", "fromMeTubeVideoList", "Lcom/example/data/MeTubeVideo;", "toMeTubeVideoList", "fromCastPostList", "Lcom/example/data/CastPost;", "toCastPostList", "fromChatConversationList", "Lcom/example/data/ChatConversation;", "toChatConversationList", "fromPendingChatReplyList", "Lcom/example/data/PendingChatReply;", "toPendingChatReplyList", "fromEmployeeList", "Lcom/example/data/Employee;", "toEmployeeList", "fromStockOrderList", "Lcom/example/data/StockOrder;", "toStockOrderList", "fromCryptoOrderList", "Lcom/example/data/CryptoOrder;", "toCryptoOrderList", "fromAdCampaignList", "Lcom/example/data/AdCampaign;", "toAdCampaignList", "fromBrandDealList", "Lcom/example/data/BrandDeal;", "toBrandDealList", "fromNewsArticleList", "Lcom/example/data/NewsArticle;", "toNewsArticleList", "fromStringSet", "", "toStringSet", "app"})
/* loaded from: Converters.class */
public final class Converters {
    private final Moshi moshi = new Moshi.Builder().addLast(new KotlinJsonAdapterFactory()).build();
    public static final int $stable = 8;

    @TypeConverter
    @NotNull
    public final String fromWorldHistoryEntryList(@Nullable List<WorldHistoryEntry> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{WorldHistoryEntry.class}));
            List<WorldHistoryEntry> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<WorldHistoryEntry> toWorldHistoryEntryList(@Nullable String value) {
        List<WorldHistoryEntry> emptyList;
        List<WorldHistoryEntry> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{WorldHistoryEntry.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromAlbumList(@Nullable List<Album> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Album.class}));
            List<Album> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<Album> toAlbumList(@Nullable String value) {
        List<Album> emptyList;
        List<Album> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Album.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromChartSongList(@Nullable List<ChartSong> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{ChartSong.class}));
            List<ChartSong> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<ChartSong> toChartSongList(@Nullable String value) {
        List<ChartSong> emptyList;
        List<ChartSong> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{ChartSong.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromMerchStyleList(@Nullable List<MerchStyle> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{MerchStyle.class}));
            List<MerchStyle> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<MerchStyle> toMerchStyleList(@Nullable String value) {
        List<MerchStyle> emptyList;
        List<MerchStyle> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{MerchStyle.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromCarList(@Nullable List<Car> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Car.class}));
            List<Car> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<Car> toCarList(@Nullable String value) {
        List<Car> emptyList;
        List<Car> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Car.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromHouseList(@Nullable List<House> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{House.class}));
            List<House> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<House> toHouseList(@Nullable String value) {
        List<House> emptyList;
        List<House> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{House.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromInstrumentList(@Nullable List<Instrument> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Instrument.class}));
            List<Instrument> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<Instrument> toInstrumentList(@Nullable String value) {
        List<Instrument> emptyList;
        List<Instrument> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Instrument.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromSongList(@Nullable List<Song> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Song.class}));
            List<Song> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<Song> toSongList(@Nullable String value) {
        List<Song> emptyList;
        List<Song> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Song.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromTourList(@Nullable List<Tour> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Tour.class}));
            List<Tour> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<Tour> toTourList(@Nullable String value) {
        List<Tour> emptyList;
        List<Tour> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Tour.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromSideJobList(@Nullable List<SideJob> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{SideJob.class}));
            List<SideJob> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<SideJob> toSideJobList(@Nullable String value) {
        List<SideJob> emptyList;
        List<SideJob> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{SideJob.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromStockList(@Nullable List<Stock> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Stock.class}));
            List<Stock> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<Stock> toStockList(@Nullable String value) {
        List<Stock> emptyList;
        List<Stock> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Stock.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromCryptoList(@Nullable List<Crypto> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Crypto.class}));
            List<Crypto> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<Crypto> toCryptoList(@Nullable String value) {
        List<Crypto> emptyList;
        List<Crypto> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Crypto.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromOwnRecordLabel(@Nullable OwnRecordLabel value) {
        String str;
        try {
            String json = this.moshi.adapter(OwnRecordLabel.class).toJson(value);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "null";
        }
        return str;
    }

    @TypeConverter
    @Nullable
    public final OwnRecordLabel toOwnRecordLabel(@Nullable String value) {
        OwnRecordLabel ownRecordLabel;
        OwnRecordLabel ownRecordLabel2;
        if (value != null) {
            try {
            } catch (Throwable th) {
                ownRecordLabel = null;
            }
            if (!Intrinsics.areEqual(value, "null")) {
                if (!StringsKt.isBlank(value)) {
                    ownRecordLabel2 = (OwnRecordLabel) this.moshi.adapter(OwnRecordLabel.class).fromJson(value);
                    ownRecordLabel = ownRecordLabel2;
                    return ownRecordLabel;
                }
            }
        }
        ownRecordLabel2 = null;
        ownRecordLabel = ownRecordLabel2;
        return ownRecordLabel;
    }

    @TypeConverter
    @NotNull
    public final String fromMailMessageList(@Nullable List<MailMessage> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{MailMessage.class}));
            List<MailMessage> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<MailMessage> toMailMessageList(@Nullable String value) {
        List<MailMessage> emptyList;
        List<MailMessage> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{MailMessage.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromNPCEntityList(@Nullable List<NPCEntity> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{NPCEntity.class}));
            List<NPCEntity> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<NPCEntity> toNPCEntityList(@Nullable String value) {
        List<NPCEntity> emptyList;
        List<NPCEntity> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{NPCEntity.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromPurchaseRequestList(@Nullable List<PurchaseRequest> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{PurchaseRequest.class}));
            List<PurchaseRequest> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<PurchaseRequest> toPurchaseRequestList(@Nullable String value) {
        List<PurchaseRequest> emptyList;
        List<PurchaseRequest> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{PurchaseRequest.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromBusinessAssetList(@Nullable List<BusinessAsset> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{BusinessAsset.class}));
            List<BusinessAsset> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<BusinessAsset> toBusinessAssetList(@Nullable String value) {
        List<BusinessAsset> emptyList;
        List<BusinessAsset> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{BusinessAsset.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromStringMap(@Nullable Map<String, Float> map) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(Map.class, new Type[]{String.class, Float.class}));
            Map<String, Float> map2 = map;
            if (map2 == null) {
                map2 = MapsKt.emptyMap();
            }
            String json = adapter.toJson(map2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "{}";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final Map<String, Float> toStringMap(@Nullable String value) {
        Map<String, Float> emptyMap;
        Map<String, Float> emptyMap2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyMap2 = MapsKt.emptyMap();
            } else {
                emptyMap2 = (Map) this.moshi.adapter(Types.newParameterizedType(Map.class, new Type[]{String.class, Float.class})).fromJson(value);
                if (emptyMap2 == null) {
                    emptyMap2 = MapsKt.emptyMap();
                }
            }
            emptyMap = emptyMap2;
        } catch (Throwable th) {
            emptyMap = MapsKt.emptyMap();
        }
        return emptyMap;
    }

    @TypeConverter
    @NotNull
    public final String fromStringList(@Nullable List<String> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class}));
            List<String> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<String> toStringList(@Nullable String value) {
        List<String> emptyList;
        List<String> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{String.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromMeTubeVideoList(@Nullable List<MeTubeVideo> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{MeTubeVideo.class}));
            List<MeTubeVideo> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<MeTubeVideo> toMeTubeVideoList(@Nullable String value) {
        List<MeTubeVideo> emptyList;
        List<MeTubeVideo> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{MeTubeVideo.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromCastPostList(@Nullable List<CastPost> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{CastPost.class}));
            List<CastPost> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<CastPost> toCastPostList(@Nullable String value) {
        List<CastPost> emptyList;
        List<CastPost> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{CastPost.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromChatConversationList(@Nullable List<ChatConversation> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{ChatConversation.class}));
            List<ChatConversation> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<ChatConversation> toChatConversationList(@Nullable String value) {
        List<ChatConversation> emptyList;
        List<ChatConversation> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{ChatConversation.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromPendingChatReplyList(@Nullable List<PendingChatReply> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{PendingChatReply.class}));
            List<PendingChatReply> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<PendingChatReply> toPendingChatReplyList(@Nullable String value) {
        List<PendingChatReply> emptyList;
        List<PendingChatReply> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{PendingChatReply.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromEmployeeList(@Nullable List<Employee> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Employee.class}));
            List<Employee> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<Employee> toEmployeeList(@Nullable String value) {
        List<Employee> emptyList;
        List<Employee> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{Employee.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromStockOrderList(@Nullable List<StockOrder> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{StockOrder.class}));
            List<StockOrder> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<StockOrder> toStockOrderList(@Nullable String value) {
        List<StockOrder> emptyList;
        List<StockOrder> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{StockOrder.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromCryptoOrderList(@Nullable List<CryptoOrder> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{CryptoOrder.class}));
            List<CryptoOrder> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<CryptoOrder> toCryptoOrderList(@Nullable String value) {
        List<CryptoOrder> emptyList;
        List<CryptoOrder> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{CryptoOrder.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromAdCampaignList(@Nullable List<AdCampaign> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{AdCampaign.class}));
            List<AdCampaign> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<AdCampaign> toAdCampaignList(@Nullable String value) {
        List<AdCampaign> emptyList;
        List<AdCampaign> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{AdCampaign.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromBrandDealList(@Nullable List<BrandDeal> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{BrandDeal.class}));
            List<BrandDeal> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<BrandDeal> toBrandDealList(@Nullable String value) {
        List<BrandDeal> emptyList;
        List<BrandDeal> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{BrandDeal.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromNewsArticleList(@Nullable List<NewsArticle> list) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{NewsArticle.class}));
            List<NewsArticle> list2 = list;
            if (list2 == null) {
                list2 = CollectionsKt.emptyList();
            }
            String json = adapter.toJson(list2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final List<NewsArticle> toNewsArticleList(@Nullable String value) {
        List<NewsArticle> emptyList;
        List<NewsArticle> emptyList2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptyList2 = CollectionsKt.emptyList();
            } else {
                emptyList2 = (List) this.moshi.adapter(Types.newParameterizedType(List.class, new Type[]{NewsArticle.class})).fromJson(value);
                if (emptyList2 == null) {
                    emptyList2 = CollectionsKt.emptyList();
                }
            }
            emptyList = emptyList2;
        } catch (Throwable th) {
            emptyList = CollectionsKt.emptyList();
        }
        return emptyList;
    }

    @TypeConverter
    @NotNull
    public final String fromStringSet(@Nullable Set<String> set) {
        String str;
        try {
            JsonAdapter adapter = this.moshi.adapter(Types.newParameterizedType(Set.class, new Type[]{String.class}));
            Set<String> set2 = set;
            if (set2 == null) {
                set2 = SetsKt.emptySet();
            }
            String json = adapter.toJson(set2);
            Intrinsics.checkNotNull(json);
            str = json;
        } catch (Throwable th) {
            str = "[]";
        }
        return str;
    }

    @TypeConverter
    @NotNull
    public final Set<String> toStringSet(@Nullable String value) {
        Set<String> emptySet;
        Set<String> emptySet2;
        try {
            String str = value;
            if ((str == null || StringsKt.isBlank(str)) || Intrinsics.areEqual(value, "null")) {
                emptySet2 = SetsKt.emptySet();
            } else {
                emptySet2 = (Set) this.moshi.adapter(Types.newParameterizedType(Set.class, new Type[]{String.class})).fromJson(value);
                if (emptySet2 == null) {
                    emptySet2 = SetsKt.emptySet();
                }
            }
            emptySet = emptySet2;
        } catch (Throwable th) {
            emptySet = SetsKt.emptySet();
        }
        return emptySet;
    }
}
