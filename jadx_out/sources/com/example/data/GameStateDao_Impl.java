package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: GameStateDao_Impl.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018�� \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0014J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00160\u0010H\u0016J\u0016\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n��R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n��R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0019"}, d2 = {"Lcom/example/data/GameStateDao_Impl;", "Lcom/example/data/GameStateDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "__insertAdapterOfGameStateEntity", "Landroidx/room/EntityInsertAdapter;", "Lcom/example/data/GameStateEntity;", "__converters", "Lcom/example/data/Converters;", "insertGameState", "", "gameState", "(Lcom/example/data/GameStateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGameState", "Lkotlinx/coroutines/flow/Flow;", "email", "", "getGameStateDirect", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGameStates", "", "deleteGameState", "Companion", "app"})
/* loaded from: GameStateDao_Impl.class */
public final class GameStateDao_Impl implements GameStateDao {
    @NotNull
    private final RoomDatabase __db;
    @NotNull
    private final EntityInsertAdapter<GameStateEntity> __insertAdapterOfGameStateEntity;
    @NotNull
    private final Converters __converters;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public GameStateDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__converters = new Converters();
        this.__db = __db;
        this.__insertAdapterOfGameStateEntity = new EntityInsertAdapter<GameStateEntity>() { // from class: com.example.data.GameStateDao_Impl.1
            protected String createQuery() {
                return "INSERT OR REPLACE INTO `game_states` (`email`,`artistName`,`isAdmin`,`cash`,`fans`,`popularity`,`influence`,`voiceSkill`,`writingSkill`,`businessSkill`,`energy`,`maxEnergy`,`timeSlots`,`maxTimeSlots`,`currentWeek`,`currentYear`,`practiceMissedWeeks`,`activeToursCount`,`ownedCars`,`ownedHouses`,`ownedInstruments`,`songs`,`tours`,`sideJobs`,`stocks`,`cryptos`,`ownLabel`,`signedLabelId`,`signedLabelCut`,`signedLabelRole`,`signedLabelLevel`,`signedLabelStartWeek`,`signedLabelStartYear`,`signedLabelEndWeek`,`signedLabelEndYear`,`signedLabelReqSingles`,`signedLabelReqAlbumsLP`,`signedLabelReqAlbumsEP`,`signedLabelReqMeTubeVideos`,`signedLabelDeliveredSingles`,`signedLabelDeliveredAlbumsLP`,`signedLabelDeliveredAlbumsEP`,`signedLabelDeliveredMeTubeVideos`,`mailbox`,`npcs`,`purchaseRequests`,`industryRespect`,`publicImage`,`criticalAcclaim`,`trustworthiness`,`legacyPoints`,`businessReputation`,`discipline`,`integrity`,`generosity`,`humility`,`reliability`,`stress`,`burnout`,`creativeInspiration`,`motivation`,`happiness`,`workLifeBalance`,`genreTrends`,`timelineEvents`,`ownedBusinesses`,`activeGlobalEvent`,`globalEventEffect`,`meTubeVideos`,`meTubeSubscribers`,`meTubeWatchTime`,`meTubeRevenue`,`activeBrandDealName`,`brandDealWeeksRemaining`,`brandDealWeeklyPayout`,`brandDealRequiredEngagement`,`brandDealPostedThisWeek`,`chatConversations`,`pendingChatReplies`,`castPosts`,`castTrendingHashtags`,`castTimeSpentThisWeek`,`castPostsCountThisWeek`,`castNicheFocus`,`hiredEmployees`,`candidateRoster`,`pendingStockOrders`,`pendingCryptoOrders`,`wallpaperId`,`isPhoneLocked`,`notificationLogs`,`insuredCars`,`insuredHouses`,`adCompanyBudget`,`activeAdCampaigns`,`employeeEvents`,`activeBrandDeals`,`newsArticles`,`weatherCondition`,`activeNoteText`,`savedPhotos`,`scheduledActivities`,`economyCycle`,`inflationRate`,`fuelPrice`,`touristIndex`,`isElectionSeason`,`residenceCountry`,`hasGlobalStreamingLicense`,`accountantAutoInvestPercent`,`accountantAutoSellProfitMargin`,`cryptoAutoInvestPercent`,`cryptoAutoSellProfitMargin`,`merchStyles`,`endorsedCandidateId`,`politicalTaxModifier`,`cityProjectWeeksRemaining`,`soundstreamMonthlyListeners`,`soundstreamWorldRank`,`soundstreamWeeklyStreams`,`soundstreamSongs`,`activeFamilyReqNpcId`,`activeFamilyReqAmount`,`activeFamilyReqType`,`activeFamilyReqDetail`,`activeFamilyReqStatus`,`lastFamilyReqWeek`,`activeDistributionDeal`,`activePublishingDeal`,`recoupableAdvanceBalance`,`signedDistributionWeek`,`signedPublishingWeek`,`albums`,`worldHistory`,`accountantStopLossMargin`,`cryptoStopLossMargin`,`accountantAutoInvestEnabled`,`cryptoAutoInvestEnabled`,`upgradedPlatforms`,`hasWikipediaPage`,`hasHallOfFame`,`hasMuseum`,`hasDocumentary`,`hasBiography`,`hasNetflixSeries`,`hasScholarships`,`artistsInspiredCount`,`receivedGovernorPitch`,`receivedSenatorPitch`,`hiredSecurityCompany`,`hasCyberInsurance`,`hasStudioInsurance`,`casualFans`,`hardcoreFans`,`collectors`,`concertGoers`,`internationalFans`,`onlineCommunity`,`fansPersonalityLovers`,`fansLyricsLovers`,`fansVoicePurists`,`fansFashionistas`,`fansControversySeekers`,`fansBusinessAdmirers`,`fansCharityBelievers`,`emergencyFundBalance`,`payrollReserve`,`businessReserve`,`bondsBalance`,`bondsInterestRate`,`financialReviewLog`,`lastReviewWeek`,`lastReviewYear`,`financialHistoryCashFlow`,`smmPostCategory`,`smmAutoPost`,`wgtApplied`,`wgtAuditionWeek`,`wgtAuditionYear`,`wgtCompletedCount`,`wgtWon`,`isSccWanted`,`sccCrimeReason`,`sccFineAmount`,`blackHatPurchasesCount`,`electionVotedCandidateId`,`electionVotedWeek`,`electionVotedYear`,`grandAwardNominated`,`grandAwardWon`,`grandAwardVipAccess`,`lastDemoSubmissionWeek`,`labelContractObligations`,`wgtSeason`,`wgtSeasonYear`,`wgtSemiFinalsWeek`,`wgtGrandFinaleWeek`,`wgtRegistrationStatus`,`wgtLastWinner`,`wgtContestants`,`avatarBaseLook`,`avatarSkinTone`,`avatarHairStyleId`,`avatarClothingId`,`avatarJewelryId`,`avatarOwnedItemIds`,`spiritualPrayerSetting`,`spiritualTitheSetting`,`spiritualTotalTithesPaid`,`spiritualTitheReminderActive`,`spiritualJournal`,`savingsBalance`,`loanAmount`,`accumulatedLoanInterest`,`taxDebt`,`titheDebt`,`savingsInterestRate`,`loanInterestRate`,`mortgageAmount`,`consecutiveUnpaidTaxWeeks`,`consecutiveUnpaidTitheWeeks`,`taxRate`,`positiveSentiment`,`negativeSentiment`,`neutralSentiment`,`conversationVolume`,`trendingScore`,`mediaAttention`,`industryFollowers`,`followers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            /* JADX INFO: Access modifiers changed from: protected */
            public void bind(SQLiteStatement statement, GameStateEntity entity) {
                Intrinsics.checkNotNullParameter(statement, "statement");
                Intrinsics.checkNotNullParameter(entity, "entity");
                statement.bindText(1, entity.getEmail());
                statement.bindText(2, entity.getArtistName());
                int _tmp = entity.isAdmin() ? 1 : 0;
                statement.bindLong(3, _tmp);
                statement.bindDouble(4, entity.getCash());
                statement.bindLong(5, entity.getFans());
                statement.bindDouble(6, entity.getPopularity());
                statement.bindDouble(7, entity.getInfluence());
                statement.bindDouble(8, entity.getVoiceSkill());
                statement.bindDouble(9, entity.getWritingSkill());
                statement.bindDouble(10, entity.getBusinessSkill());
                statement.bindLong(11, entity.getEnergy());
                statement.bindLong(12, entity.getMaxEnergy());
                statement.bindLong(13, entity.getTimeSlots());
                statement.bindLong(14, entity.getMaxTimeSlots());
                statement.bindLong(15, entity.getCurrentWeek());
                statement.bindLong(16, entity.getCurrentYear());
                statement.bindLong(17, entity.getPracticeMissedWeeks());
                statement.bindLong(18, entity.getActiveToursCount());
                String _tmp_1 = GameStateDao_Impl.this.__converters.fromCarList(entity.getOwnedCars());
                statement.bindText(19, _tmp_1);
                String _tmp_2 = GameStateDao_Impl.this.__converters.fromHouseList(entity.getOwnedHouses());
                statement.bindText(20, _tmp_2);
                String _tmp_3 = GameStateDao_Impl.this.__converters.fromInstrumentList(entity.getOwnedInstruments());
                statement.bindText(21, _tmp_3);
                String _tmp_4 = GameStateDao_Impl.this.__converters.fromSongList(entity.getSongs());
                statement.bindText(22, _tmp_4);
                String _tmp_5 = GameStateDao_Impl.this.__converters.fromTourList(entity.getTours());
                statement.bindText(23, _tmp_5);
                String _tmp_6 = GameStateDao_Impl.this.__converters.fromSideJobList(entity.getSideJobs());
                statement.bindText(24, _tmp_6);
                String _tmp_7 = GameStateDao_Impl.this.__converters.fromStockList(entity.getStocks());
                statement.bindText(25, _tmp_7);
                String _tmp_8 = GameStateDao_Impl.this.__converters.fromCryptoList(entity.getCryptos());
                statement.bindText(26, _tmp_8);
                OwnRecordLabel _tmpOwnLabel = entity.getOwnLabel();
                String _tmp_9 = GameStateDao_Impl.this.__converters.fromOwnRecordLabel(_tmpOwnLabel);
                if (_tmp_9 == null) {
                    statement.bindNull(27);
                } else {
                    statement.bindText(27, _tmp_9);
                }
                String _tmpSignedLabelId = entity.getSignedLabelId();
                if (_tmpSignedLabelId == null) {
                    statement.bindNull(28);
                } else {
                    statement.bindText(28, _tmpSignedLabelId);
                }
                statement.bindDouble(29, entity.getSignedLabelCut());
                String _tmpSignedLabelRole = entity.getSignedLabelRole();
                if (_tmpSignedLabelRole == null) {
                    statement.bindNull(30);
                } else {
                    statement.bindText(30, _tmpSignedLabelRole);
                }
                statement.bindLong(31, entity.getSignedLabelLevel());
                statement.bindLong(32, entity.getSignedLabelStartWeek());
                statement.bindLong(33, entity.getSignedLabelStartYear());
                statement.bindLong(34, entity.getSignedLabelEndWeek());
                statement.bindLong(35, entity.getSignedLabelEndYear());
                statement.bindLong(36, entity.getSignedLabelReqSingles());
                statement.bindLong(37, entity.getSignedLabelReqAlbumsLP());
                statement.bindLong(38, entity.getSignedLabelReqAlbumsEP());
                statement.bindLong(39, entity.getSignedLabelReqMeTubeVideos());
                statement.bindLong(40, entity.getSignedLabelDeliveredSingles());
                statement.bindLong(41, entity.getSignedLabelDeliveredAlbumsLP());
                statement.bindLong(42, entity.getSignedLabelDeliveredAlbumsEP());
                statement.bindLong(43, entity.getSignedLabelDeliveredMeTubeVideos());
                String _tmp_10 = GameStateDao_Impl.this.__converters.fromMailMessageList(entity.getMailbox());
                statement.bindText(44, _tmp_10);
                String _tmp_11 = GameStateDao_Impl.this.__converters.fromNPCEntityList(entity.getNpcs());
                statement.bindText(45, _tmp_11);
                String _tmp_12 = GameStateDao_Impl.this.__converters.fromPurchaseRequestList(entity.getPurchaseRequests());
                statement.bindText(46, _tmp_12);
                statement.bindDouble(47, entity.getIndustryRespect());
                statement.bindDouble(48, entity.getPublicImage());
                statement.bindDouble(49, entity.getCriticalAcclaim());
                statement.bindDouble(50, entity.getTrustworthiness());
                statement.bindLong(51, entity.getLegacyPoints());
                statement.bindDouble(52, entity.getBusinessReputation());
                statement.bindDouble(53, entity.getDiscipline());
                statement.bindDouble(54, entity.getIntegrity());
                statement.bindDouble(55, entity.getGenerosity());
                statement.bindDouble(56, entity.getHumility());
                statement.bindDouble(57, entity.getReliability());
                statement.bindDouble(58, entity.getStress());
                statement.bindDouble(59, entity.getBurnout());
                statement.bindDouble(60, entity.getCreativeInspiration());
                statement.bindDouble(61, entity.getMotivation());
                statement.bindDouble(62, entity.getHappiness());
                statement.bindDouble(63, entity.getWorkLifeBalance());
                String _tmp_13 = GameStateDao_Impl.this.__converters.fromStringMap(entity.getGenreTrends());
                statement.bindText(64, _tmp_13);
                String _tmp_14 = GameStateDao_Impl.this.__converters.fromStringList(entity.getTimelineEvents());
                statement.bindText(65, _tmp_14);
                String _tmp_15 = GameStateDao_Impl.this.__converters.fromBusinessAssetList(entity.getOwnedBusinesses());
                statement.bindText(66, _tmp_15);
                String _tmpActiveGlobalEvent = entity.getActiveGlobalEvent();
                if (_tmpActiveGlobalEvent == null) {
                    statement.bindNull(67);
                } else {
                    statement.bindText(67, _tmpActiveGlobalEvent);
                }
                String _tmpGlobalEventEffect = entity.getGlobalEventEffect();
                if (_tmpGlobalEventEffect == null) {
                    statement.bindNull(68);
                } else {
                    statement.bindText(68, _tmpGlobalEventEffect);
                }
                String _tmp_16 = GameStateDao_Impl.this.__converters.fromMeTubeVideoList(entity.getMeTubeVideos());
                statement.bindText(69, _tmp_16);
                statement.bindLong(70, entity.getMeTubeSubscribers());
                statement.bindDouble(71, entity.getMeTubeWatchTime());
                statement.bindDouble(72, entity.getMeTubeRevenue());
                String _tmpActiveBrandDealName = entity.getActiveBrandDealName();
                if (_tmpActiveBrandDealName == null) {
                    statement.bindNull(73);
                } else {
                    statement.bindText(73, _tmpActiveBrandDealName);
                }
                statement.bindLong(74, entity.getBrandDealWeeksRemaining());
                statement.bindDouble(75, entity.getBrandDealWeeklyPayout());
                statement.bindLong(76, entity.getBrandDealRequiredEngagement());
                int _tmp_17 = entity.getBrandDealPostedThisWeek() ? 1 : 0;
                statement.bindLong(77, _tmp_17);
                String _tmp_18 = GameStateDao_Impl.this.__converters.fromChatConversationList(entity.getChatConversations());
                statement.bindText(78, _tmp_18);
                String _tmp_19 = GameStateDao_Impl.this.__converters.fromPendingChatReplyList(entity.getPendingChatReplies());
                statement.bindText(79, _tmp_19);
                String _tmp_20 = GameStateDao_Impl.this.__converters.fromCastPostList(entity.getCastPosts());
                statement.bindText(80, _tmp_20);
                String _tmp_21 = GameStateDao_Impl.this.__converters.fromStringList(entity.getCastTrendingHashtags());
                statement.bindText(81, _tmp_21);
                statement.bindLong(82, entity.getCastTimeSpentThisWeek());
                statement.bindLong(83, entity.getCastPostsCountThisWeek());
                statement.bindText(84, entity.getCastNicheFocus());
                String _tmp_22 = GameStateDao_Impl.this.__converters.fromEmployeeList(entity.getHiredEmployees());
                statement.bindText(85, _tmp_22);
                String _tmp_23 = GameStateDao_Impl.this.__converters.fromEmployeeList(entity.getCandidateRoster());
                statement.bindText(86, _tmp_23);
                String _tmp_24 = GameStateDao_Impl.this.__converters.fromStockOrderList(entity.getPendingStockOrders());
                statement.bindText(87, _tmp_24);
                String _tmp_25 = GameStateDao_Impl.this.__converters.fromCryptoOrderList(entity.getPendingCryptoOrders());
                statement.bindText(88, _tmp_25);
                statement.bindText(89, entity.getWallpaperId());
                int _tmp_26 = entity.isPhoneLocked() ? 1 : 0;
                statement.bindLong(90, _tmp_26);
                String _tmp_27 = GameStateDao_Impl.this.__converters.fromStringList(entity.getNotificationLogs());
                statement.bindText(91, _tmp_27);
                String _tmp_28 = GameStateDao_Impl.this.__converters.fromStringList(entity.getInsuredCars());
                statement.bindText(92, _tmp_28);
                String _tmp_29 = GameStateDao_Impl.this.__converters.fromStringList(entity.getInsuredHouses());
                statement.bindText(93, _tmp_29);
                statement.bindDouble(94, entity.getAdCompanyBudget());
                String _tmp_30 = GameStateDao_Impl.this.__converters.fromAdCampaignList(entity.getActiveAdCampaigns());
                statement.bindText(95, _tmp_30);
                String _tmp_31 = GameStateDao_Impl.this.__converters.fromStringList(entity.getEmployeeEvents());
                statement.bindText(96, _tmp_31);
                String _tmp_32 = GameStateDao_Impl.this.__converters.fromBrandDealList(entity.getActiveBrandDeals());
                statement.bindText(97, _tmp_32);
                String _tmp_33 = GameStateDao_Impl.this.__converters.fromNewsArticleList(entity.getNewsArticles());
                statement.bindText(98, _tmp_33);
                statement.bindText(99, entity.getWeatherCondition());
                statement.bindText(100, entity.getActiveNoteText());
                String _tmp_34 = GameStateDao_Impl.this.__converters.fromStringList(entity.getSavedPhotos());
                statement.bindText(101, _tmp_34);
                String _tmp_35 = GameStateDao_Impl.this.__converters.fromStringList(entity.getScheduledActivities());
                statement.bindText(102, _tmp_35);
                statement.bindText(103, entity.getEconomyCycle());
                statement.bindDouble(104, entity.getInflationRate());
                statement.bindDouble(105, entity.getFuelPrice());
                statement.bindLong(106, entity.getTouristIndex());
                int _tmp_36 = entity.isElectionSeason() ? 1 : 0;
                statement.bindLong(107, _tmp_36);
                statement.bindText(108, entity.getResidenceCountry());
                int _tmp_37 = entity.getHasGlobalStreamingLicense() ? 1 : 0;
                statement.bindLong(109, _tmp_37);
                statement.bindDouble(110, entity.getAccountantAutoInvestPercent());
                statement.bindDouble(111, entity.getAccountantAutoSellProfitMargin());
                statement.bindDouble(112, entity.getCryptoAutoInvestPercent());
                statement.bindDouble(113, entity.getCryptoAutoSellProfitMargin());
                String _tmp_38 = GameStateDao_Impl.this.__converters.fromMerchStyleList(entity.getMerchStyles());
                statement.bindText(114, _tmp_38);
                String _tmpEndorsedCandidateId = entity.getEndorsedCandidateId();
                if (_tmpEndorsedCandidateId == null) {
                    statement.bindNull(115);
                } else {
                    statement.bindText(115, _tmpEndorsedCandidateId);
                }
                statement.bindDouble(116, entity.getPoliticalTaxModifier());
                statement.bindLong(117, entity.getCityProjectWeeksRemaining());
                statement.bindLong(118, entity.getSoundstreamMonthlyListeners());
                statement.bindLong(119, entity.getSoundstreamWorldRank());
                statement.bindLong(120, entity.getSoundstreamWeeklyStreams());
                String _tmp_39 = GameStateDao_Impl.this.__converters.fromChartSongList(entity.getSoundstreamSongs());
                statement.bindText(121, _tmp_39);
                String _tmpActiveFamilyReqNpcId = entity.getActiveFamilyReqNpcId();
                if (_tmpActiveFamilyReqNpcId == null) {
                    statement.bindNull(122);
                } else {
                    statement.bindText(122, _tmpActiveFamilyReqNpcId);
                }
                statement.bindDouble(123, entity.getActiveFamilyReqAmount());
                String _tmpActiveFamilyReqType = entity.getActiveFamilyReqType();
                if (_tmpActiveFamilyReqType == null) {
                    statement.bindNull(124);
                } else {
                    statement.bindText(124, _tmpActiveFamilyReqType);
                }
                String _tmpActiveFamilyReqDetail = entity.getActiveFamilyReqDetail();
                if (_tmpActiveFamilyReqDetail == null) {
                    statement.bindNull(125);
                } else {
                    statement.bindText(125, _tmpActiveFamilyReqDetail);
                }
                String _tmpActiveFamilyReqStatus = entity.getActiveFamilyReqStatus();
                if (_tmpActiveFamilyReqStatus == null) {
                    statement.bindNull(126);
                } else {
                    statement.bindText(126, _tmpActiveFamilyReqStatus);
                }
                statement.bindLong(127, entity.getLastFamilyReqWeek());
                statement.bindText(128, entity.getActiveDistributionDeal());
                statement.bindText(129, entity.getActivePublishingDeal());
                statement.bindDouble(130, entity.getRecoupableAdvanceBalance());
                statement.bindLong(131, entity.getSignedDistributionWeek());
                statement.bindLong(132, entity.getSignedPublishingWeek());
                String _tmp_40 = GameStateDao_Impl.this.__converters.fromAlbumList(entity.getAlbums());
                statement.bindText(133, _tmp_40);
                String _tmp_41 = GameStateDao_Impl.this.__converters.fromWorldHistoryEntryList(entity.getWorldHistory());
                statement.bindText(134, _tmp_41);
                statement.bindDouble(135, entity.getAccountantStopLossMargin());
                statement.bindDouble(136, entity.getCryptoStopLossMargin());
                int _tmp_42 = entity.getAccountantAutoInvestEnabled() ? 1 : 0;
                statement.bindLong(137, _tmp_42);
                int _tmp_43 = entity.getCryptoAutoInvestEnabled() ? 1 : 0;
                statement.bindLong(138, _tmp_43);
                String _tmp_44 = GameStateDao_Impl.this.__converters.fromStringSet(entity.getUpgradedPlatforms());
                statement.bindText(139, _tmp_44);
                LegacyMilestones _tmpLegacy = entity.getLegacy();
                int _tmp_45 = _tmpLegacy.getHasWikipediaPage() ? 1 : 0;
                statement.bindLong(140, _tmp_45);
                int _tmp_46 = _tmpLegacy.getHasHallOfFame() ? 1 : 0;
                statement.bindLong(141, _tmp_46);
                int _tmp_47 = _tmpLegacy.getHasMuseum() ? 1 : 0;
                statement.bindLong(142, _tmp_47);
                int _tmp_48 = _tmpLegacy.getHasDocumentary() ? 1 : 0;
                statement.bindLong(143, _tmp_48);
                int _tmp_49 = _tmpLegacy.getHasBiography() ? 1 : 0;
                statement.bindLong(144, _tmp_49);
                int _tmp_50 = _tmpLegacy.getHasNetflixSeries() ? 1 : 0;
                statement.bindLong(145, _tmp_50);
                int _tmp_51 = _tmpLegacy.getHasScholarships() ? 1 : 0;
                statement.bindLong(146, _tmp_51);
                statement.bindLong(147, _tmpLegacy.getArtistsInspiredCount());
                int _tmp_52 = _tmpLegacy.getReceivedGovernorPitch() ? 1 : 0;
                statement.bindLong(148, _tmp_52);
                int _tmp_53 = _tmpLegacy.getReceivedSenatorPitch() ? 1 : 0;
                statement.bindLong(149, _tmp_53);
                SecurityCyberState _tmpSecurity = entity.getSecurity();
                statement.bindText(150, _tmpSecurity.getHiredSecurityCompany());
                int _tmp_54 = _tmpSecurity.getHasCyberInsurance() ? 1 : 0;
                statement.bindLong(151, _tmp_54);
                int _tmp_55 = _tmpSecurity.getHasStudioInsurance() ? 1 : 0;
                statement.bindLong(152, _tmp_55);
                FanSegmentsState _tmpFanSegments = entity.getFanSegments();
                statement.bindLong(153, _tmpFanSegments.getCasualFans());
                statement.bindLong(154, _tmpFanSegments.getHardcoreFans());
                statement.bindLong(155, _tmpFanSegments.getCollectors());
                statement.bindLong(156, _tmpFanSegments.getConcertGoers());
                statement.bindLong(157, _tmpFanSegments.getInternationalFans());
                statement.bindLong(158, _tmpFanSegments.getOnlineCommunity());
                statement.bindLong(159, _tmpFanSegments.getFansPersonalityLovers());
                statement.bindLong(160, _tmpFanSegments.getFansLyricsLovers());
                statement.bindLong(161, _tmpFanSegments.getFansVoicePurists());
                statement.bindLong(162, _tmpFanSegments.getFansFashionistas());
                statement.bindLong(163, _tmpFanSegments.getFansControversySeekers());
                statement.bindLong(164, _tmpFanSegments.getFansBusinessAdmirers());
                statement.bindLong(165, _tmpFanSegments.getFansCharityBelievers());
                WealthEngineState _tmpWealth = entity.getWealth();
                statement.bindDouble(166, _tmpWealth.getEmergencyFundBalance());
                statement.bindDouble(167, _tmpWealth.getPayrollReserve());
                statement.bindDouble(168, _tmpWealth.getBusinessReserve());
                statement.bindDouble(169, _tmpWealth.getBondsBalance());
                statement.bindDouble(170, _tmpWealth.getBondsInterestRate());
                String _tmp_56 = GameStateDao_Impl.this.__converters.fromStringList(_tmpWealth.getFinancialReviewLog());
                statement.bindText(171, _tmp_56);
                statement.bindLong(172, _tmpWealth.getLastReviewWeek());
                statement.bindLong(173, _tmpWealth.getLastReviewYear());
                String _tmp_57 = GameStateDao_Impl.this.__converters.fromStringList(_tmpWealth.getFinancialHistoryCashFlow());
                statement.bindText(174, _tmp_57);
                statement.bindText(175, _tmpWealth.getSmmPostCategory());
                int _tmp_58 = _tmpWealth.getSmmAutoPost() ? 1 : 0;
                statement.bindLong(176, _tmp_58);
                WebHubState _tmpWebHub = entity.getWebHub();
                int _tmp_59 = _tmpWebHub.getWgtApplied() ? 1 : 0;
                statement.bindLong(177, _tmp_59);
                statement.bindLong(178, _tmpWebHub.getWgtAuditionWeek());
                statement.bindLong(179, _tmpWebHub.getWgtAuditionYear());
                statement.bindLong(180, _tmpWebHub.getWgtCompletedCount());
                int _tmp_60 = _tmpWebHub.getWgtWon() ? 1 : 0;
                statement.bindLong(181, _tmp_60);
                int _tmp_61 = _tmpWebHub.isSccWanted() ? 1 : 0;
                statement.bindLong(182, _tmp_61);
                statement.bindText(183, _tmpWebHub.getSccCrimeReason());
                statement.bindDouble(184, _tmpWebHub.getSccFineAmount());
                statement.bindLong(185, _tmpWebHub.getBlackHatPurchasesCount());
                String _tmpElectionVotedCandidateId = _tmpWebHub.getElectionVotedCandidateId();
                if (_tmpElectionVotedCandidateId == null) {
                    statement.bindNull(186);
                } else {
                    statement.bindText(186, _tmpElectionVotedCandidateId);
                }
                statement.bindLong(187, _tmpWebHub.getElectionVotedWeek());
                statement.bindLong(188, _tmpWebHub.getElectionVotedYear());
                int _tmp_62 = _tmpWebHub.getGrandAwardNominated() ? 1 : 0;
                statement.bindLong(189, _tmp_62);
                int _tmp_63 = _tmpWebHub.getGrandAwardWon() ? 1 : 0;
                statement.bindLong(190, _tmp_63);
                int _tmp_64 = _tmpWebHub.getGrandAwardVipAccess() ? 1 : 0;
                statement.bindLong(191, _tmp_64);
                statement.bindLong(192, _tmpWebHub.getLastDemoSubmissionWeek());
                statement.bindText(193, _tmpWebHub.getLabelContractObligations());
                statement.bindLong(194, _tmpWebHub.getWgtSeason());
                statement.bindLong(195, _tmpWebHub.getWgtSeasonYear());
                statement.bindLong(196, _tmpWebHub.getWgtSemiFinalsWeek());
                statement.bindLong(197, _tmpWebHub.getWgtGrandFinaleWeek());
                statement.bindText(198, _tmpWebHub.getWgtRegistrationStatus());
                statement.bindText(199, _tmpWebHub.getWgtLastWinner());
                String _tmp_65 = GameStateDao_Impl.this.__converters.fromStringList(_tmpWebHub.getWgtContestants());
                statement.bindText(200, _tmp_65);
                AvatarState _tmpAvatar = entity.getAvatar();
                statement.bindText(201, _tmpAvatar.getAvatarBaseLook());
                statement.bindText(202, _tmpAvatar.getAvatarSkinTone());
                statement.bindText(203, _tmpAvatar.getAvatarHairStyleId());
                statement.bindText(204, _tmpAvatar.getAvatarClothingId());
                statement.bindText(205, _tmpAvatar.getAvatarJewelryId());
                String _tmp_66 = GameStateDao_Impl.this.__converters.fromStringList(_tmpAvatar.getAvatarOwnedItemIds());
                statement.bindText(206, _tmp_66);
                SpiritualState _tmpSpiritual = entity.getSpiritual();
                int _tmp_67 = _tmpSpiritual.getSpiritualPrayerSetting() ? 1 : 0;
                statement.bindLong(207, _tmp_67);
                int _tmp_68 = _tmpSpiritual.getSpiritualTitheSetting() ? 1 : 0;
                statement.bindLong(208, _tmp_68);
                statement.bindDouble(209, _tmpSpiritual.getSpiritualTotalTithesPaid());
                int _tmp_69 = _tmpSpiritual.getSpiritualTitheReminderActive() ? 1 : 0;
                statement.bindLong(210, _tmp_69);
                String _tmp_70 = GameStateDao_Impl.this.__converters.fromStringList(_tmpSpiritual.getSpiritualJournal());
                statement.bindText(211, _tmp_70);
                BankingState _tmpBanking = entity.getBanking();
                statement.bindDouble(212, _tmpBanking.getSavingsBalance());
                statement.bindDouble(213, _tmpBanking.getLoanAmount());
                statement.bindDouble(214, _tmpBanking.getAccumulatedLoanInterest());
                statement.bindDouble(215, _tmpBanking.getTaxDebt());
                statement.bindDouble(216, _tmpBanking.getTitheDebt());
                statement.bindDouble(217, _tmpBanking.getSavingsInterestRate());
                statement.bindDouble(218, _tmpBanking.getLoanInterestRate());
                statement.bindDouble(219, _tmpBanking.getMortgageAmount());
                statement.bindLong(220, _tmpBanking.getConsecutiveUnpaidTaxWeeks());
                statement.bindLong(221, _tmpBanking.getConsecutiveUnpaidTitheWeeks());
                statement.bindDouble(222, _tmpBanking.getTaxRate());
                SocialSentimentState _tmpSentiment = entity.getSentiment();
                statement.bindDouble(223, _tmpSentiment.getPositiveSentiment());
                statement.bindDouble(224, _tmpSentiment.getNegativeSentiment());
                statement.bindDouble(225, _tmpSentiment.getNeutralSentiment());
                statement.bindLong(226, _tmpSentiment.getConversationVolume());
                statement.bindDouble(227, _tmpSentiment.getTrendingScore());
                statement.bindDouble(228, _tmpSentiment.getMediaAttention());
                statement.bindLong(229, _tmpSentiment.getIndustryFollowers());
                statement.bindLong(230, _tmpSentiment.getFollowers());
            }
        };
    }

    @Override // com.example.data.GameStateDao
    @Nullable
    public Object insertGameState(@NotNull GameStateEntity gameState, @NotNull Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, (v2) -> {
            return insertGameState$lambda$0(r3, r4, v2);
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    private static final Unit insertGameState$lambda$0(GameStateDao_Impl this$0, GameStateEntity $gameState, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        this$0.__insertAdapterOfGameStateEntity.insert(_connection, $gameState);
        return Unit.INSTANCE;
    }

    @Override // com.example.data.GameStateDao
    @NotNull
    public Flow<GameStateEntity> getGameState(@NotNull String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        return FlowUtil.createFlow(this.__db, false, new String[]{"game_states"}, (v3) -> {
            return getGameState$lambda$1(r3, r4, r5, v3);
        });
    }

    private static final GameStateEntity getGameState$lambda$1(String $_sql, String $email, GameStateDao_Impl this$0, SQLiteConnection _connection) {
        GameStateEntity _result;
        String _tmp_9;
        String _tmpSignedLabelId;
        String _tmpSignedLabelRole;
        String _tmpActiveGlobalEvent;
        String _tmpGlobalEventEffect;
        String _tmpActiveBrandDealName;
        String _tmpEndorsedCandidateId;
        String _tmpActiveFamilyReqNpcId;
        String _tmpActiveFamilyReqType;
        String _tmpActiveFamilyReqDetail;
        String _tmpActiveFamilyReqStatus;
        String _tmpElectionVotedCandidateId;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $email);
            int _columnIndexOfEmail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
            int _columnIndexOfArtistName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "artistName");
            int _columnIndexOfIsAdmin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isAdmin");
            int _columnIndexOfCash = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cash");
            int _columnIndexOfFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fans");
            int _columnIndexOfPopularity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "popularity");
            int _columnIndexOfInfluence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "influence");
            int _columnIndexOfVoiceSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "voiceSkill");
            int _columnIndexOfWritingSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "writingSkill");
            int _columnIndexOfBusinessSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessSkill");
            int _columnIndexOfEnergy = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "energy");
            int _columnIndexOfMaxEnergy = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "maxEnergy");
            int _columnIndexOfTimeSlots = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timeSlots");
            int _columnIndexOfMaxTimeSlots = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "maxTimeSlots");
            int _columnIndexOfCurrentWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "currentWeek");
            int _columnIndexOfCurrentYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "currentYear");
            int _columnIndexOfPracticeMissedWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "practiceMissedWeeks");
            int _columnIndexOfActiveToursCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeToursCount");
            int _columnIndexOfOwnedCars = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedCars");
            int _columnIndexOfOwnedHouses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedHouses");
            int _columnIndexOfOwnedInstruments = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedInstruments");
            int _columnIndexOfSongs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "songs");
            int _columnIndexOfTours = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tours");
            int _columnIndexOfSideJobs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sideJobs");
            int _columnIndexOfStocks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stocks");
            int _columnIndexOfCryptos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptos");
            int _columnIndexOfOwnLabel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownLabel");
            int _columnIndexOfSignedLabelId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelId");
            int _columnIndexOfSignedLabelCut = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelCut");
            int _columnIndexOfSignedLabelRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelRole");
            int _columnIndexOfSignedLabelLevel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelLevel");
            int _columnIndexOfSignedLabelStartWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelStartWeek");
            int _columnIndexOfSignedLabelStartYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelStartYear");
            int _columnIndexOfSignedLabelEndWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelEndWeek");
            int _columnIndexOfSignedLabelEndYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelEndYear");
            int _columnIndexOfSignedLabelReqSingles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqSingles");
            int _columnIndexOfSignedLabelReqAlbumsLP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqAlbumsLP");
            int _columnIndexOfSignedLabelReqAlbumsEP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqAlbumsEP");
            int _columnIndexOfSignedLabelReqMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqMeTubeVideos");
            int _columnIndexOfSignedLabelDeliveredSingles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredSingles");
            int _columnIndexOfSignedLabelDeliveredAlbumsLP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredAlbumsLP");
            int _columnIndexOfSignedLabelDeliveredAlbumsEP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredAlbumsEP");
            int _columnIndexOfSignedLabelDeliveredMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredMeTubeVideos");
            int _columnIndexOfMailbox = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mailbox");
            int _columnIndexOfNpcs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "npcs");
            int _columnIndexOfPurchaseRequests = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "purchaseRequests");
            int _columnIndexOfIndustryRespect = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "industryRespect");
            int _columnIndexOfPublicImage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "publicImage");
            int _columnIndexOfCriticalAcclaim = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "criticalAcclaim");
            int _columnIndexOfTrustworthiness = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "trustworthiness");
            int _columnIndexOfLegacyPoints = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "legacyPoints");
            int _columnIndexOfBusinessReputation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessReputation");
            int _columnIndexOfDiscipline = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "discipline");
            int _columnIndexOfIntegrity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "integrity");
            int _columnIndexOfGenerosity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "generosity");
            int _columnIndexOfHumility = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "humility");
            int _columnIndexOfReliability = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reliability");
            int _columnIndexOfStress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stress");
            int _columnIndexOfBurnout = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "burnout");
            int _columnIndexOfCreativeInspiration = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "creativeInspiration");
            int _columnIndexOfMotivation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "motivation");
            int _columnIndexOfHappiness = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "happiness");
            int _columnIndexOfWorkLifeBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "workLifeBalance");
            int _columnIndexOfGenreTrends = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "genreTrends");
            int _columnIndexOfTimelineEvents = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timelineEvents");
            int _columnIndexOfOwnedBusinesses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedBusinesses");
            int _columnIndexOfActiveGlobalEvent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeGlobalEvent");
            int _columnIndexOfGlobalEventEffect = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "globalEventEffect");
            int _columnIndexOfMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeVideos");
            int _columnIndexOfMeTubeSubscribers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeSubscribers");
            int _columnIndexOfMeTubeWatchTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeWatchTime");
            int _columnIndexOfMeTubeRevenue = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeRevenue");
            int _columnIndexOfActiveBrandDealName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeBrandDealName");
            int _columnIndexOfBrandDealWeeksRemaining = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealWeeksRemaining");
            int _columnIndexOfBrandDealWeeklyPayout = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealWeeklyPayout");
            int _columnIndexOfBrandDealRequiredEngagement = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealRequiredEngagement");
            int _columnIndexOfBrandDealPostedThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealPostedThisWeek");
            int _columnIndexOfChatConversations = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chatConversations");
            int _columnIndexOfPendingChatReplies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingChatReplies");
            int _columnIndexOfCastPosts = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castPosts");
            int _columnIndexOfCastTrendingHashtags = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castTrendingHashtags");
            int _columnIndexOfCastTimeSpentThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castTimeSpentThisWeek");
            int _columnIndexOfCastPostsCountThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castPostsCountThisWeek");
            int _columnIndexOfCastNicheFocus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castNicheFocus");
            int _columnIndexOfHiredEmployees = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hiredEmployees");
            int _columnIndexOfCandidateRoster = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "candidateRoster");
            int _columnIndexOfPendingStockOrders = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingStockOrders");
            int _columnIndexOfPendingCryptoOrders = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingCryptoOrders");
            int _columnIndexOfWallpaperId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wallpaperId");
            int _columnIndexOfIsPhoneLocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isPhoneLocked");
            int _columnIndexOfNotificationLogs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notificationLogs");
            int _columnIndexOfInsuredCars = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "insuredCars");
            int _columnIndexOfInsuredHouses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "insuredHouses");
            int _columnIndexOfAdCompanyBudget = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "adCompanyBudget");
            int _columnIndexOfActiveAdCampaigns = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeAdCampaigns");
            int _columnIndexOfEmployeeEvents = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "employeeEvents");
            int _columnIndexOfActiveBrandDeals = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeBrandDeals");
            int _columnIndexOfNewsArticles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "newsArticles");
            int _columnIndexOfWeatherCondition = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "weatherCondition");
            int _columnIndexOfActiveNoteText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeNoteText");
            int _columnIndexOfSavedPhotos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savedPhotos");
            int _columnIndexOfScheduledActivities = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "scheduledActivities");
            int _columnIndexOfEconomyCycle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "economyCycle");
            int _columnIndexOfInflationRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "inflationRate");
            int _columnIndexOfFuelPrice = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fuelPrice");
            int _columnIndexOfTouristIndex = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "touristIndex");
            int _columnIndexOfIsElectionSeason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isElectionSeason");
            int _columnIndexOfResidenceCountry = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "residenceCountry");
            int _columnIndexOfHasGlobalStreamingLicense = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasGlobalStreamingLicense");
            int _columnIndexOfAccountantAutoInvestPercent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoInvestPercent");
            int _columnIndexOfAccountantAutoSellProfitMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoSellProfitMargin");
            int _columnIndexOfCryptoAutoInvestPercent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoInvestPercent");
            int _columnIndexOfCryptoAutoSellProfitMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoSellProfitMargin");
            int _columnIndexOfMerchStyles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "merchStyles");
            int _columnIndexOfEndorsedCandidateId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "endorsedCandidateId");
            int _columnIndexOfPoliticalTaxModifier = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "politicalTaxModifier");
            int _columnIndexOfCityProjectWeeksRemaining = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cityProjectWeeksRemaining");
            int _columnIndexOfSoundstreamMonthlyListeners = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamMonthlyListeners");
            int _columnIndexOfSoundstreamWorldRank = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamWorldRank");
            int _columnIndexOfSoundstreamWeeklyStreams = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamWeeklyStreams");
            int _columnIndexOfSoundstreamSongs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamSongs");
            int _columnIndexOfActiveFamilyReqNpcId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqNpcId");
            int _columnIndexOfActiveFamilyReqAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqAmount");
            int _columnIndexOfActiveFamilyReqType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqType");
            int _columnIndexOfActiveFamilyReqDetail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqDetail");
            int _columnIndexOfActiveFamilyReqStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqStatus");
            int _columnIndexOfLastFamilyReqWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastFamilyReqWeek");
            int _columnIndexOfActiveDistributionDeal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeDistributionDeal");
            int _columnIndexOfActivePublishingDeal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activePublishingDeal");
            int _columnIndexOfRecoupableAdvanceBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "recoupableAdvanceBalance");
            int _columnIndexOfSignedDistributionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedDistributionWeek");
            int _columnIndexOfSignedPublishingWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedPublishingWeek");
            int _columnIndexOfAlbums = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "albums");
            int _columnIndexOfWorldHistory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "worldHistory");
            int _columnIndexOfAccountantStopLossMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantStopLossMargin");
            int _columnIndexOfCryptoStopLossMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoStopLossMargin");
            int _columnIndexOfAccountantAutoInvestEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoInvestEnabled");
            int _columnIndexOfCryptoAutoInvestEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoInvestEnabled");
            int _columnIndexOfUpgradedPlatforms = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "upgradedPlatforms");
            int _columnIndexOfHasWikipediaPage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasWikipediaPage");
            int _columnIndexOfHasHallOfFame = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasHallOfFame");
            int _columnIndexOfHasMuseum = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasMuseum");
            int _columnIndexOfHasDocumentary = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasDocumentary");
            int _columnIndexOfHasBiography = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasBiography");
            int _columnIndexOfHasNetflixSeries = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasNetflixSeries");
            int _columnIndexOfHasScholarships = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasScholarships");
            int _columnIndexOfArtistsInspiredCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "artistsInspiredCount");
            int _columnIndexOfReceivedGovernorPitch = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "receivedGovernorPitch");
            int _columnIndexOfReceivedSenatorPitch = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "receivedSenatorPitch");
            int _columnIndexOfHiredSecurityCompany = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hiredSecurityCompany");
            int _columnIndexOfHasCyberInsurance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasCyberInsurance");
            int _columnIndexOfHasStudioInsurance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasStudioInsurance");
            int _columnIndexOfCasualFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "casualFans");
            int _columnIndexOfHardcoreFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hardcoreFans");
            int _columnIndexOfCollectors = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "collectors");
            int _columnIndexOfConcertGoers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "concertGoers");
            int _columnIndexOfInternationalFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "internationalFans");
            int _columnIndexOfOnlineCommunity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "onlineCommunity");
            int _columnIndexOfFansPersonalityLovers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansPersonalityLovers");
            int _columnIndexOfFansLyricsLovers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansLyricsLovers");
            int _columnIndexOfFansVoicePurists = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansVoicePurists");
            int _columnIndexOfFansFashionistas = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansFashionistas");
            int _columnIndexOfFansControversySeekers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansControversySeekers");
            int _columnIndexOfFansBusinessAdmirers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansBusinessAdmirers");
            int _columnIndexOfFansCharityBelievers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansCharityBelievers");
            int _columnIndexOfEmergencyFundBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergencyFundBalance");
            int _columnIndexOfPayrollReserve = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "payrollReserve");
            int _columnIndexOfBusinessReserve = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessReserve");
            int _columnIndexOfBondsBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "bondsBalance");
            int _columnIndexOfBondsInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "bondsInterestRate");
            int _columnIndexOfFinancialReviewLog = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "financialReviewLog");
            int _columnIndexOfLastReviewWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReviewWeek");
            int _columnIndexOfLastReviewYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReviewYear");
            int _columnIndexOfFinancialHistoryCashFlow = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "financialHistoryCashFlow");
            int _columnIndexOfSmmPostCategory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "smmPostCategory");
            int _columnIndexOfSmmAutoPost = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "smmAutoPost");
            int _columnIndexOfWgtApplied = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtApplied");
            int _columnIndexOfWgtAuditionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtAuditionWeek");
            int _columnIndexOfWgtAuditionYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtAuditionYear");
            int _columnIndexOfWgtCompletedCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtCompletedCount");
            int _columnIndexOfWgtWon = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtWon");
            int _columnIndexOfIsSccWanted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isSccWanted");
            int _columnIndexOfSccCrimeReason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sccCrimeReason");
            int _columnIndexOfSccFineAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sccFineAmount");
            int _columnIndexOfBlackHatPurchasesCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "blackHatPurchasesCount");
            int _columnIndexOfElectionVotedCandidateId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedCandidateId");
            int _columnIndexOfElectionVotedWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedWeek");
            int _columnIndexOfElectionVotedYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedYear");
            int _columnIndexOfGrandAwardNominated = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardNominated");
            int _columnIndexOfGrandAwardWon = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardWon");
            int _columnIndexOfGrandAwardVipAccess = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardVipAccess");
            int _columnIndexOfLastDemoSubmissionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastDemoSubmissionWeek");
            int _columnIndexOfLabelContractObligations = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "labelContractObligations");
            int _columnIndexOfWgtSeason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSeason");
            int _columnIndexOfWgtSeasonYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSeasonYear");
            int _columnIndexOfWgtSemiFinalsWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSemiFinalsWeek");
            int _columnIndexOfWgtGrandFinaleWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtGrandFinaleWeek");
            int _columnIndexOfWgtRegistrationStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtRegistrationStatus");
            int _columnIndexOfWgtLastWinner = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtLastWinner");
            int _columnIndexOfWgtContestants = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtContestants");
            int _columnIndexOfAvatarBaseLook = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarBaseLook");
            int _columnIndexOfAvatarSkinTone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarSkinTone");
            int _columnIndexOfAvatarHairStyleId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarHairStyleId");
            int _columnIndexOfAvatarClothingId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarClothingId");
            int _columnIndexOfAvatarJewelryId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarJewelryId");
            int _columnIndexOfAvatarOwnedItemIds = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarOwnedItemIds");
            int _columnIndexOfSpiritualPrayerSetting = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualPrayerSetting");
            int _columnIndexOfSpiritualTitheSetting = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTitheSetting");
            int _columnIndexOfSpiritualTotalTithesPaid = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTotalTithesPaid");
            int _columnIndexOfSpiritualTitheReminderActive = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTitheReminderActive");
            int _columnIndexOfSpiritualJournal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualJournal");
            int _columnIndexOfSavingsBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savingsBalance");
            int _columnIndexOfLoanAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "loanAmount");
            int _columnIndexOfAccumulatedLoanInterest = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accumulatedLoanInterest");
            int _columnIndexOfTaxDebt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "taxDebt");
            int _columnIndexOfTitheDebt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "titheDebt");
            int _columnIndexOfSavingsInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savingsInterestRate");
            int _columnIndexOfLoanInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "loanInterestRate");
            int _columnIndexOfMortgageAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mortgageAmount");
            int _columnIndexOfConsecutiveUnpaidTaxWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "consecutiveUnpaidTaxWeeks");
            int _columnIndexOfConsecutiveUnpaidTitheWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "consecutiveUnpaidTitheWeeks");
            int _columnIndexOfTaxRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "taxRate");
            int _columnIndexOfPositiveSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "positiveSentiment");
            int _columnIndexOfNegativeSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "negativeSentiment");
            int _columnIndexOfNeutralSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "neutralSentiment");
            int _columnIndexOfConversationVolume = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "conversationVolume");
            int _columnIndexOfTrendingScore = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "trendingScore");
            int _columnIndexOfMediaAttention = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mediaAttention");
            int _columnIndexOfIndustryFollowers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "industryFollowers");
            int _columnIndexOfFollowers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "followers");
            if (_stmt.step()) {
                String _tmpEmail = _stmt.getText(_columnIndexOfEmail);
                String _tmpArtistName = _stmt.getText(_columnIndexOfArtistName);
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsAdmin);
                boolean _tmpIsAdmin = _tmp != 0;
                double _tmpCash = _stmt.getDouble(_columnIndexOfCash);
                long _tmpFans = _stmt.getLong(_columnIndexOfFans);
                float _tmpPopularity = (float) _stmt.getDouble(_columnIndexOfPopularity);
                float _tmpInfluence = (float) _stmt.getDouble(_columnIndexOfInfluence);
                float _tmpVoiceSkill = (float) _stmt.getDouble(_columnIndexOfVoiceSkill);
                float _tmpWritingSkill = (float) _stmt.getDouble(_columnIndexOfWritingSkill);
                float _tmpBusinessSkill = (float) _stmt.getDouble(_columnIndexOfBusinessSkill);
                int _tmpEnergy = (int) _stmt.getLong(_columnIndexOfEnergy);
                int _tmpMaxEnergy = (int) _stmt.getLong(_columnIndexOfMaxEnergy);
                int _tmpTimeSlots = (int) _stmt.getLong(_columnIndexOfTimeSlots);
                int _tmpMaxTimeSlots = (int) _stmt.getLong(_columnIndexOfMaxTimeSlots);
                int _tmpCurrentWeek = (int) _stmt.getLong(_columnIndexOfCurrentWeek);
                int _tmpCurrentYear = (int) _stmt.getLong(_columnIndexOfCurrentYear);
                int _tmpPracticeMissedWeeks = (int) _stmt.getLong(_columnIndexOfPracticeMissedWeeks);
                int _tmpActiveToursCount = (int) _stmt.getLong(_columnIndexOfActiveToursCount);
                String _tmp_1 = _stmt.getText(_columnIndexOfOwnedCars);
                List _tmpOwnedCars = this$0.__converters.toCarList(_tmp_1);
                String _tmp_2 = _stmt.getText(_columnIndexOfOwnedHouses);
                List _tmpOwnedHouses = this$0.__converters.toHouseList(_tmp_2);
                String _tmp_3 = _stmt.getText(_columnIndexOfOwnedInstruments);
                List _tmpOwnedInstruments = this$0.__converters.toInstrumentList(_tmp_3);
                String _tmp_4 = _stmt.getText(_columnIndexOfSongs);
                List _tmpSongs = this$0.__converters.toSongList(_tmp_4);
                String _tmp_5 = _stmt.getText(_columnIndexOfTours);
                List _tmpTours = this$0.__converters.toTourList(_tmp_5);
                String _tmp_6 = _stmt.getText(_columnIndexOfSideJobs);
                List _tmpSideJobs = this$0.__converters.toSideJobList(_tmp_6);
                String _tmp_7 = _stmt.getText(_columnIndexOfStocks);
                List _tmpStocks = this$0.__converters.toStockList(_tmp_7);
                String _tmp_8 = _stmt.getText(_columnIndexOfCryptos);
                List _tmpCryptos = this$0.__converters.toCryptoList(_tmp_8);
                if (_stmt.isNull(_columnIndexOfOwnLabel)) {
                    _tmp_9 = null;
                } else {
                    _tmp_9 = _stmt.getText(_columnIndexOfOwnLabel);
                }
                OwnRecordLabel _tmpOwnLabel = this$0.__converters.toOwnRecordLabel(_tmp_9);
                if (_stmt.isNull(_columnIndexOfSignedLabelId)) {
                    _tmpSignedLabelId = null;
                } else {
                    _tmpSignedLabelId = _stmt.getText(_columnIndexOfSignedLabelId);
                }
                float _tmpSignedLabelCut = (float) _stmt.getDouble(_columnIndexOfSignedLabelCut);
                if (_stmt.isNull(_columnIndexOfSignedLabelRole)) {
                    _tmpSignedLabelRole = null;
                } else {
                    _tmpSignedLabelRole = _stmt.getText(_columnIndexOfSignedLabelRole);
                }
                int _tmpSignedLabelLevel = (int) _stmt.getLong(_columnIndexOfSignedLabelLevel);
                int _tmpSignedLabelStartWeek = (int) _stmt.getLong(_columnIndexOfSignedLabelStartWeek);
                int _tmpSignedLabelStartYear = (int) _stmt.getLong(_columnIndexOfSignedLabelStartYear);
                int _tmpSignedLabelEndWeek = (int) _stmt.getLong(_columnIndexOfSignedLabelEndWeek);
                int _tmpSignedLabelEndYear = (int) _stmt.getLong(_columnIndexOfSignedLabelEndYear);
                int _tmpSignedLabelReqSingles = (int) _stmt.getLong(_columnIndexOfSignedLabelReqSingles);
                int _tmpSignedLabelReqAlbumsLP = (int) _stmt.getLong(_columnIndexOfSignedLabelReqAlbumsLP);
                int _tmpSignedLabelReqAlbumsEP = (int) _stmt.getLong(_columnIndexOfSignedLabelReqAlbumsEP);
                int _tmpSignedLabelReqMeTubeVideos = (int) _stmt.getLong(_columnIndexOfSignedLabelReqMeTubeVideos);
                int _tmpSignedLabelDeliveredSingles = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredSingles);
                int _tmpSignedLabelDeliveredAlbumsLP = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredAlbumsLP);
                int _tmpSignedLabelDeliveredAlbumsEP = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredAlbumsEP);
                int _tmpSignedLabelDeliveredMeTubeVideos = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredMeTubeVideos);
                String _tmp_10 = _stmt.getText(_columnIndexOfMailbox);
                List _tmpMailbox = this$0.__converters.toMailMessageList(_tmp_10);
                String _tmp_11 = _stmt.getText(_columnIndexOfNpcs);
                List _tmpNpcs = this$0.__converters.toNPCEntityList(_tmp_11);
                String _tmp_12 = _stmt.getText(_columnIndexOfPurchaseRequests);
                List _tmpPurchaseRequests = this$0.__converters.toPurchaseRequestList(_tmp_12);
                float _tmpIndustryRespect = (float) _stmt.getDouble(_columnIndexOfIndustryRespect);
                float _tmpPublicImage = (float) _stmt.getDouble(_columnIndexOfPublicImage);
                float _tmpCriticalAcclaim = (float) _stmt.getDouble(_columnIndexOfCriticalAcclaim);
                float _tmpTrustworthiness = (float) _stmt.getDouble(_columnIndexOfTrustworthiness);
                long _tmpLegacyPoints = _stmt.getLong(_columnIndexOfLegacyPoints);
                float _tmpBusinessReputation = (float) _stmt.getDouble(_columnIndexOfBusinessReputation);
                float _tmpDiscipline = (float) _stmt.getDouble(_columnIndexOfDiscipline);
                float _tmpIntegrity = (float) _stmt.getDouble(_columnIndexOfIntegrity);
                float _tmpGenerosity = (float) _stmt.getDouble(_columnIndexOfGenerosity);
                float _tmpHumility = (float) _stmt.getDouble(_columnIndexOfHumility);
                float _tmpReliability = (float) _stmt.getDouble(_columnIndexOfReliability);
                float _tmpStress = (float) _stmt.getDouble(_columnIndexOfStress);
                float _tmpBurnout = (float) _stmt.getDouble(_columnIndexOfBurnout);
                float _tmpCreativeInspiration = (float) _stmt.getDouble(_columnIndexOfCreativeInspiration);
                float _tmpMotivation = (float) _stmt.getDouble(_columnIndexOfMotivation);
                float _tmpHappiness = (float) _stmt.getDouble(_columnIndexOfHappiness);
                float _tmpWorkLifeBalance = (float) _stmt.getDouble(_columnIndexOfWorkLifeBalance);
                String _tmp_13 = _stmt.getText(_columnIndexOfGenreTrends);
                Map _tmpGenreTrends = this$0.__converters.toStringMap(_tmp_13);
                String _tmp_14 = _stmt.getText(_columnIndexOfTimelineEvents);
                List _tmpTimelineEvents = this$0.__converters.toStringList(_tmp_14);
                String _tmp_15 = _stmt.getText(_columnIndexOfOwnedBusinesses);
                List _tmpOwnedBusinesses = this$0.__converters.toBusinessAssetList(_tmp_15);
                if (_stmt.isNull(_columnIndexOfActiveGlobalEvent)) {
                    _tmpActiveGlobalEvent = null;
                } else {
                    _tmpActiveGlobalEvent = _stmt.getText(_columnIndexOfActiveGlobalEvent);
                }
                if (_stmt.isNull(_columnIndexOfGlobalEventEffect)) {
                    _tmpGlobalEventEffect = null;
                } else {
                    _tmpGlobalEventEffect = _stmt.getText(_columnIndexOfGlobalEventEffect);
                }
                String _tmp_16 = _stmt.getText(_columnIndexOfMeTubeVideos);
                List _tmpMeTubeVideos = this$0.__converters.toMeTubeVideoList(_tmp_16);
                long _tmpMeTubeSubscribers = _stmt.getLong(_columnIndexOfMeTubeSubscribers);
                double _tmpMeTubeWatchTime = _stmt.getDouble(_columnIndexOfMeTubeWatchTime);
                double _tmpMeTubeRevenue = _stmt.getDouble(_columnIndexOfMeTubeRevenue);
                if (_stmt.isNull(_columnIndexOfActiveBrandDealName)) {
                    _tmpActiveBrandDealName = null;
                } else {
                    _tmpActiveBrandDealName = _stmt.getText(_columnIndexOfActiveBrandDealName);
                }
                int _tmpBrandDealWeeksRemaining = (int) _stmt.getLong(_columnIndexOfBrandDealWeeksRemaining);
                double _tmpBrandDealWeeklyPayout = _stmt.getDouble(_columnIndexOfBrandDealWeeklyPayout);
                long _tmpBrandDealRequiredEngagement = _stmt.getLong(_columnIndexOfBrandDealRequiredEngagement);
                int _tmp_17 = (int) _stmt.getLong(_columnIndexOfBrandDealPostedThisWeek);
                boolean _tmpBrandDealPostedThisWeek = _tmp_17 != 0;
                String _tmp_18 = _stmt.getText(_columnIndexOfChatConversations);
                List _tmpChatConversations = this$0.__converters.toChatConversationList(_tmp_18);
                String _tmp_19 = _stmt.getText(_columnIndexOfPendingChatReplies);
                List _tmpPendingChatReplies = this$0.__converters.toPendingChatReplyList(_tmp_19);
                String _tmp_20 = _stmt.getText(_columnIndexOfCastPosts);
                List _tmpCastPosts = this$0.__converters.toCastPostList(_tmp_20);
                String _tmp_21 = _stmt.getText(_columnIndexOfCastTrendingHashtags);
                List _tmpCastTrendingHashtags = this$0.__converters.toStringList(_tmp_21);
                int _tmpCastTimeSpentThisWeek = (int) _stmt.getLong(_columnIndexOfCastTimeSpentThisWeek);
                int _tmpCastPostsCountThisWeek = (int) _stmt.getLong(_columnIndexOfCastPostsCountThisWeek);
                String _tmpCastNicheFocus = _stmt.getText(_columnIndexOfCastNicheFocus);
                String _tmp_22 = _stmt.getText(_columnIndexOfHiredEmployees);
                List _tmpHiredEmployees = this$0.__converters.toEmployeeList(_tmp_22);
                String _tmp_23 = _stmt.getText(_columnIndexOfCandidateRoster);
                List _tmpCandidateRoster = this$0.__converters.toEmployeeList(_tmp_23);
                String _tmp_24 = _stmt.getText(_columnIndexOfPendingStockOrders);
                List _tmpPendingStockOrders = this$0.__converters.toStockOrderList(_tmp_24);
                String _tmp_25 = _stmt.getText(_columnIndexOfPendingCryptoOrders);
                List _tmpPendingCryptoOrders = this$0.__converters.toCryptoOrderList(_tmp_25);
                String _tmpWallpaperId = _stmt.getText(_columnIndexOfWallpaperId);
                int _tmp_26 = (int) _stmt.getLong(_columnIndexOfIsPhoneLocked);
                boolean _tmpIsPhoneLocked = _tmp_26 != 0;
                String _tmp_27 = _stmt.getText(_columnIndexOfNotificationLogs);
                List _tmpNotificationLogs = this$0.__converters.toStringList(_tmp_27);
                String _tmp_28 = _stmt.getText(_columnIndexOfInsuredCars);
                List _tmpInsuredCars = this$0.__converters.toStringList(_tmp_28);
                String _tmp_29 = _stmt.getText(_columnIndexOfInsuredHouses);
                List _tmpInsuredHouses = this$0.__converters.toStringList(_tmp_29);
                double _tmpAdCompanyBudget = _stmt.getDouble(_columnIndexOfAdCompanyBudget);
                String _tmp_30 = _stmt.getText(_columnIndexOfActiveAdCampaigns);
                List _tmpActiveAdCampaigns = this$0.__converters.toAdCampaignList(_tmp_30);
                String _tmp_31 = _stmt.getText(_columnIndexOfEmployeeEvents);
                List _tmpEmployeeEvents = this$0.__converters.toStringList(_tmp_31);
                String _tmp_32 = _stmt.getText(_columnIndexOfActiveBrandDeals);
                List _tmpActiveBrandDeals = this$0.__converters.toBrandDealList(_tmp_32);
                String _tmp_33 = _stmt.getText(_columnIndexOfNewsArticles);
                List _tmpNewsArticles = this$0.__converters.toNewsArticleList(_tmp_33);
                String _tmpWeatherCondition = _stmt.getText(_columnIndexOfWeatherCondition);
                String _tmpActiveNoteText = _stmt.getText(_columnIndexOfActiveNoteText);
                String _tmp_34 = _stmt.getText(_columnIndexOfSavedPhotos);
                List _tmpSavedPhotos = this$0.__converters.toStringList(_tmp_34);
                String _tmp_35 = _stmt.getText(_columnIndexOfScheduledActivities);
                List _tmpScheduledActivities = this$0.__converters.toStringList(_tmp_35);
                String _tmpEconomyCycle = _stmt.getText(_columnIndexOfEconomyCycle);
                float _tmpInflationRate = (float) _stmt.getDouble(_columnIndexOfInflationRate);
                float _tmpFuelPrice = (float) _stmt.getDouble(_columnIndexOfFuelPrice);
                int _tmpTouristIndex = (int) _stmt.getLong(_columnIndexOfTouristIndex);
                int _tmp_36 = (int) _stmt.getLong(_columnIndexOfIsElectionSeason);
                boolean _tmpIsElectionSeason = _tmp_36 != 0;
                String _tmpResidenceCountry = _stmt.getText(_columnIndexOfResidenceCountry);
                int _tmp_37 = (int) _stmt.getLong(_columnIndexOfHasGlobalStreamingLicense);
                boolean _tmpHasGlobalStreamingLicense = _tmp_37 != 0;
                float _tmpAccountantAutoInvestPercent = (float) _stmt.getDouble(_columnIndexOfAccountantAutoInvestPercent);
                float _tmpAccountantAutoSellProfitMargin = (float) _stmt.getDouble(_columnIndexOfAccountantAutoSellProfitMargin);
                float _tmpCryptoAutoInvestPercent = (float) _stmt.getDouble(_columnIndexOfCryptoAutoInvestPercent);
                float _tmpCryptoAutoSellProfitMargin = (float) _stmt.getDouble(_columnIndexOfCryptoAutoSellProfitMargin);
                String _tmp_38 = _stmt.getText(_columnIndexOfMerchStyles);
                List _tmpMerchStyles = this$0.__converters.toMerchStyleList(_tmp_38);
                if (_stmt.isNull(_columnIndexOfEndorsedCandidateId)) {
                    _tmpEndorsedCandidateId = null;
                } else {
                    _tmpEndorsedCandidateId = _stmt.getText(_columnIndexOfEndorsedCandidateId);
                }
                float _tmpPoliticalTaxModifier = (float) _stmt.getDouble(_columnIndexOfPoliticalTaxModifier);
                int _tmpCityProjectWeeksRemaining = (int) _stmt.getLong(_columnIndexOfCityProjectWeeksRemaining);
                long _tmpSoundstreamMonthlyListeners = _stmt.getLong(_columnIndexOfSoundstreamMonthlyListeners);
                int _tmpSoundstreamWorldRank = (int) _stmt.getLong(_columnIndexOfSoundstreamWorldRank);
                long _tmpSoundstreamWeeklyStreams = _stmt.getLong(_columnIndexOfSoundstreamWeeklyStreams);
                String _tmp_39 = _stmt.getText(_columnIndexOfSoundstreamSongs);
                List _tmpSoundstreamSongs = this$0.__converters.toChartSongList(_tmp_39);
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqNpcId)) {
                    _tmpActiveFamilyReqNpcId = null;
                } else {
                    _tmpActiveFamilyReqNpcId = _stmt.getText(_columnIndexOfActiveFamilyReqNpcId);
                }
                double _tmpActiveFamilyReqAmount = _stmt.getDouble(_columnIndexOfActiveFamilyReqAmount);
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqType)) {
                    _tmpActiveFamilyReqType = null;
                } else {
                    _tmpActiveFamilyReqType = _stmt.getText(_columnIndexOfActiveFamilyReqType);
                }
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqDetail)) {
                    _tmpActiveFamilyReqDetail = null;
                } else {
                    _tmpActiveFamilyReqDetail = _stmt.getText(_columnIndexOfActiveFamilyReqDetail);
                }
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqStatus)) {
                    _tmpActiveFamilyReqStatus = null;
                } else {
                    _tmpActiveFamilyReqStatus = _stmt.getText(_columnIndexOfActiveFamilyReqStatus);
                }
                int _tmpLastFamilyReqWeek = (int) _stmt.getLong(_columnIndexOfLastFamilyReqWeek);
                String _tmpActiveDistributionDeal = _stmt.getText(_columnIndexOfActiveDistributionDeal);
                String _tmpActivePublishingDeal = _stmt.getText(_columnIndexOfActivePublishingDeal);
                double _tmpRecoupableAdvanceBalance = _stmt.getDouble(_columnIndexOfRecoupableAdvanceBalance);
                int _tmpSignedDistributionWeek = (int) _stmt.getLong(_columnIndexOfSignedDistributionWeek);
                int _tmpSignedPublishingWeek = (int) _stmt.getLong(_columnIndexOfSignedPublishingWeek);
                String _tmp_40 = _stmt.getText(_columnIndexOfAlbums);
                List _tmpAlbums = this$0.__converters.toAlbumList(_tmp_40);
                String _tmp_41 = _stmt.getText(_columnIndexOfWorldHistory);
                List _tmpWorldHistory = this$0.__converters.toWorldHistoryEntryList(_tmp_41);
                float _tmpAccountantStopLossMargin = (float) _stmt.getDouble(_columnIndexOfAccountantStopLossMargin);
                float _tmpCryptoStopLossMargin = (float) _stmt.getDouble(_columnIndexOfCryptoStopLossMargin);
                int _tmp_42 = (int) _stmt.getLong(_columnIndexOfAccountantAutoInvestEnabled);
                boolean _tmpAccountantAutoInvestEnabled = _tmp_42 != 0;
                int _tmp_43 = (int) _stmt.getLong(_columnIndexOfCryptoAutoInvestEnabled);
                boolean _tmpCryptoAutoInvestEnabled = _tmp_43 != 0;
                String _tmp_44 = _stmt.getText(_columnIndexOfUpgradedPlatforms);
                Set _tmpUpgradedPlatforms = this$0.__converters.toStringSet(_tmp_44);
                int _tmp_45 = (int) _stmt.getLong(_columnIndexOfHasWikipediaPage);
                boolean _tmpHasWikipediaPage = _tmp_45 != 0;
                int _tmp_46 = (int) _stmt.getLong(_columnIndexOfHasHallOfFame);
                boolean _tmpHasHallOfFame = _tmp_46 != 0;
                int _tmp_47 = (int) _stmt.getLong(_columnIndexOfHasMuseum);
                boolean _tmpHasMuseum = _tmp_47 != 0;
                int _tmp_48 = (int) _stmt.getLong(_columnIndexOfHasDocumentary);
                boolean _tmpHasDocumentary = _tmp_48 != 0;
                int _tmp_49 = (int) _stmt.getLong(_columnIndexOfHasBiography);
                boolean _tmpHasBiography = _tmp_49 != 0;
                int _tmp_50 = (int) _stmt.getLong(_columnIndexOfHasNetflixSeries);
                boolean _tmpHasNetflixSeries = _tmp_50 != 0;
                int _tmp_51 = (int) _stmt.getLong(_columnIndexOfHasScholarships);
                boolean _tmpHasScholarships = _tmp_51 != 0;
                int _tmpArtistsInspiredCount = (int) _stmt.getLong(_columnIndexOfArtistsInspiredCount);
                int _tmp_52 = (int) _stmt.getLong(_columnIndexOfReceivedGovernorPitch);
                boolean _tmpReceivedGovernorPitch = _tmp_52 != 0;
                int _tmp_53 = (int) _stmt.getLong(_columnIndexOfReceivedSenatorPitch);
                boolean _tmpReceivedSenatorPitch = _tmp_53 != 0;
                LegacyMilestones _tmpLegacy = new LegacyMilestones(_tmpHasWikipediaPage, _tmpHasHallOfFame, _tmpHasMuseum, _tmpHasDocumentary, _tmpHasBiography, _tmpHasNetflixSeries, _tmpHasScholarships, _tmpArtistsInspiredCount, _tmpReceivedGovernorPitch, _tmpReceivedSenatorPitch);
                String _tmpHiredSecurityCompany = _stmt.getText(_columnIndexOfHiredSecurityCompany);
                int _tmp_54 = (int) _stmt.getLong(_columnIndexOfHasCyberInsurance);
                boolean _tmpHasCyberInsurance = _tmp_54 != 0;
                int _tmp_55 = (int) _stmt.getLong(_columnIndexOfHasStudioInsurance);
                boolean _tmpHasStudioInsurance = _tmp_55 != 0;
                SecurityCyberState _tmpSecurity = new SecurityCyberState(_tmpHiredSecurityCompany, _tmpHasCyberInsurance, _tmpHasStudioInsurance);
                long _tmpCasualFans = _stmt.getLong(_columnIndexOfCasualFans);
                long _tmpHardcoreFans = _stmt.getLong(_columnIndexOfHardcoreFans);
                long _tmpCollectors = _stmt.getLong(_columnIndexOfCollectors);
                long _tmpConcertGoers = _stmt.getLong(_columnIndexOfConcertGoers);
                long _tmpInternationalFans = _stmt.getLong(_columnIndexOfInternationalFans);
                long _tmpOnlineCommunity = _stmt.getLong(_columnIndexOfOnlineCommunity);
                long _tmpFansPersonalityLovers = _stmt.getLong(_columnIndexOfFansPersonalityLovers);
                long _tmpFansLyricsLovers = _stmt.getLong(_columnIndexOfFansLyricsLovers);
                long _tmpFansVoicePurists = _stmt.getLong(_columnIndexOfFansVoicePurists);
                long _tmpFansFashionistas = _stmt.getLong(_columnIndexOfFansFashionistas);
                long _tmpFansControversySeekers = _stmt.getLong(_columnIndexOfFansControversySeekers);
                long _tmpFansBusinessAdmirers = _stmt.getLong(_columnIndexOfFansBusinessAdmirers);
                long _tmpFansCharityBelievers = _stmt.getLong(_columnIndexOfFansCharityBelievers);
                FanSegmentsState _tmpFanSegments = new FanSegmentsState(_tmpCasualFans, _tmpHardcoreFans, _tmpCollectors, _tmpConcertGoers, _tmpInternationalFans, _tmpOnlineCommunity, _tmpFansPersonalityLovers, _tmpFansLyricsLovers, _tmpFansVoicePurists, _tmpFansFashionistas, _tmpFansControversySeekers, _tmpFansBusinessAdmirers, _tmpFansCharityBelievers);
                double _tmpEmergencyFundBalance = _stmt.getDouble(_columnIndexOfEmergencyFundBalance);
                double _tmpPayrollReserve = _stmt.getDouble(_columnIndexOfPayrollReserve);
                double _tmpBusinessReserve = _stmt.getDouble(_columnIndexOfBusinessReserve);
                double _tmpBondsBalance = _stmt.getDouble(_columnIndexOfBondsBalance);
                float _tmpBondsInterestRate = (float) _stmt.getDouble(_columnIndexOfBondsInterestRate);
                String _tmp_56 = _stmt.getText(_columnIndexOfFinancialReviewLog);
                List _tmpFinancialReviewLog = this$0.__converters.toStringList(_tmp_56);
                int _tmpLastReviewWeek = (int) _stmt.getLong(_columnIndexOfLastReviewWeek);
                int _tmpLastReviewYear = (int) _stmt.getLong(_columnIndexOfLastReviewYear);
                String _tmp_57 = _stmt.getText(_columnIndexOfFinancialHistoryCashFlow);
                List _tmpFinancialHistoryCashFlow = this$0.__converters.toStringList(_tmp_57);
                String _tmpSmmPostCategory = _stmt.getText(_columnIndexOfSmmPostCategory);
                int _tmp_58 = (int) _stmt.getLong(_columnIndexOfSmmAutoPost);
                boolean _tmpSmmAutoPost = _tmp_58 != 0;
                WealthEngineState _tmpWealth = new WealthEngineState(_tmpEmergencyFundBalance, _tmpPayrollReserve, _tmpBusinessReserve, _tmpBondsBalance, _tmpBondsInterestRate, _tmpFinancialReviewLog, _tmpLastReviewWeek, _tmpLastReviewYear, _tmpFinancialHistoryCashFlow, _tmpSmmPostCategory, _tmpSmmAutoPost);
                int _tmp_59 = (int) _stmt.getLong(_columnIndexOfWgtApplied);
                boolean _tmpWgtApplied = _tmp_59 != 0;
                int _tmpWgtAuditionWeek = (int) _stmt.getLong(_columnIndexOfWgtAuditionWeek);
                int _tmpWgtAuditionYear = (int) _stmt.getLong(_columnIndexOfWgtAuditionYear);
                int _tmpWgtCompletedCount = (int) _stmt.getLong(_columnIndexOfWgtCompletedCount);
                int _tmp_60 = (int) _stmt.getLong(_columnIndexOfWgtWon);
                boolean _tmpWgtWon = _tmp_60 != 0;
                int _tmp_61 = (int) _stmt.getLong(_columnIndexOfIsSccWanted);
                boolean _tmpIsSccWanted = _tmp_61 != 0;
                String _tmpSccCrimeReason = _stmt.getText(_columnIndexOfSccCrimeReason);
                double _tmpSccFineAmount = _stmt.getDouble(_columnIndexOfSccFineAmount);
                int _tmpBlackHatPurchasesCount = (int) _stmt.getLong(_columnIndexOfBlackHatPurchasesCount);
                if (_stmt.isNull(_columnIndexOfElectionVotedCandidateId)) {
                    _tmpElectionVotedCandidateId = null;
                } else {
                    _tmpElectionVotedCandidateId = _stmt.getText(_columnIndexOfElectionVotedCandidateId);
                }
                int _tmpElectionVotedWeek = (int) _stmt.getLong(_columnIndexOfElectionVotedWeek);
                int _tmpElectionVotedYear = (int) _stmt.getLong(_columnIndexOfElectionVotedYear);
                int _tmp_62 = (int) _stmt.getLong(_columnIndexOfGrandAwardNominated);
                boolean _tmpGrandAwardNominated = _tmp_62 != 0;
                int _tmp_63 = (int) _stmt.getLong(_columnIndexOfGrandAwardWon);
                boolean _tmpGrandAwardWon = _tmp_63 != 0;
                int _tmp_64 = (int) _stmt.getLong(_columnIndexOfGrandAwardVipAccess);
                boolean _tmpGrandAwardVipAccess = _tmp_64 != 0;
                int _tmpLastDemoSubmissionWeek = (int) _stmt.getLong(_columnIndexOfLastDemoSubmissionWeek);
                String _tmpLabelContractObligations = _stmt.getText(_columnIndexOfLabelContractObligations);
                int _tmpWgtSeason = (int) _stmt.getLong(_columnIndexOfWgtSeason);
                int _tmpWgtSeasonYear = (int) _stmt.getLong(_columnIndexOfWgtSeasonYear);
                int _tmpWgtSemiFinalsWeek = (int) _stmt.getLong(_columnIndexOfWgtSemiFinalsWeek);
                int _tmpWgtGrandFinaleWeek = (int) _stmt.getLong(_columnIndexOfWgtGrandFinaleWeek);
                String _tmpWgtRegistrationStatus = _stmt.getText(_columnIndexOfWgtRegistrationStatus);
                String _tmpWgtLastWinner = _stmt.getText(_columnIndexOfWgtLastWinner);
                String _tmp_65 = _stmt.getText(_columnIndexOfWgtContestants);
                List _tmpWgtContestants = this$0.__converters.toStringList(_tmp_65);
                WebHubState _tmpWebHub = new WebHubState(_tmpWgtApplied, _tmpWgtAuditionWeek, _tmpWgtAuditionYear, _tmpWgtCompletedCount, _tmpWgtWon, _tmpIsSccWanted, _tmpSccCrimeReason, _tmpSccFineAmount, _tmpBlackHatPurchasesCount, _tmpElectionVotedCandidateId, _tmpElectionVotedWeek, _tmpElectionVotedYear, _tmpGrandAwardNominated, _tmpGrandAwardWon, _tmpGrandAwardVipAccess, _tmpLastDemoSubmissionWeek, _tmpLabelContractObligations, _tmpWgtSeason, _tmpWgtSeasonYear, _tmpWgtSemiFinalsWeek, _tmpWgtGrandFinaleWeek, _tmpWgtRegistrationStatus, _tmpWgtLastWinner, _tmpWgtContestants);
                String _tmpAvatarBaseLook = _stmt.getText(_columnIndexOfAvatarBaseLook);
                String _tmpAvatarSkinTone = _stmt.getText(_columnIndexOfAvatarSkinTone);
                String _tmpAvatarHairStyleId = _stmt.getText(_columnIndexOfAvatarHairStyleId);
                String _tmpAvatarClothingId = _stmt.getText(_columnIndexOfAvatarClothingId);
                String _tmpAvatarJewelryId = _stmt.getText(_columnIndexOfAvatarJewelryId);
                String _tmp_66 = _stmt.getText(_columnIndexOfAvatarOwnedItemIds);
                List _tmpAvatarOwnedItemIds = this$0.__converters.toStringList(_tmp_66);
                AvatarState _tmpAvatar = new AvatarState(_tmpAvatarBaseLook, _tmpAvatarSkinTone, _tmpAvatarHairStyleId, _tmpAvatarClothingId, _tmpAvatarJewelryId, _tmpAvatarOwnedItemIds);
                int _tmp_67 = (int) _stmt.getLong(_columnIndexOfSpiritualPrayerSetting);
                boolean _tmpSpiritualPrayerSetting = _tmp_67 != 0;
                int _tmp_68 = (int) _stmt.getLong(_columnIndexOfSpiritualTitheSetting);
                boolean _tmpSpiritualTitheSetting = _tmp_68 != 0;
                double _tmpSpiritualTotalTithesPaid = _stmt.getDouble(_columnIndexOfSpiritualTotalTithesPaid);
                int _tmp_69 = (int) _stmt.getLong(_columnIndexOfSpiritualTitheReminderActive);
                boolean _tmpSpiritualTitheReminderActive = _tmp_69 != 0;
                String _tmp_70 = _stmt.getText(_columnIndexOfSpiritualJournal);
                List _tmpSpiritualJournal = this$0.__converters.toStringList(_tmp_70);
                SpiritualState _tmpSpiritual = new SpiritualState(_tmpSpiritualPrayerSetting, _tmpSpiritualTitheSetting, _tmpSpiritualTotalTithesPaid, _tmpSpiritualTitheReminderActive, _tmpSpiritualJournal);
                double _tmpSavingsBalance = _stmt.getDouble(_columnIndexOfSavingsBalance);
                double _tmpLoanAmount = _stmt.getDouble(_columnIndexOfLoanAmount);
                double _tmpAccumulatedLoanInterest = _stmt.getDouble(_columnIndexOfAccumulatedLoanInterest);
                double _tmpTaxDebt = _stmt.getDouble(_columnIndexOfTaxDebt);
                double _tmpTitheDebt = _stmt.getDouble(_columnIndexOfTitheDebt);
                float _tmpSavingsInterestRate = (float) _stmt.getDouble(_columnIndexOfSavingsInterestRate);
                float _tmpLoanInterestRate = (float) _stmt.getDouble(_columnIndexOfLoanInterestRate);
                double _tmpMortgageAmount = _stmt.getDouble(_columnIndexOfMortgageAmount);
                int _tmpConsecutiveUnpaidTaxWeeks = (int) _stmt.getLong(_columnIndexOfConsecutiveUnpaidTaxWeeks);
                int _tmpConsecutiveUnpaidTitheWeeks = (int) _stmt.getLong(_columnIndexOfConsecutiveUnpaidTitheWeeks);
                float _tmpTaxRate = (float) _stmt.getDouble(_columnIndexOfTaxRate);
                BankingState _tmpBanking = new BankingState(_tmpSavingsBalance, _tmpLoanAmount, _tmpAccumulatedLoanInterest, _tmpTaxDebt, _tmpTitheDebt, _tmpSavingsInterestRate, _tmpLoanInterestRate, _tmpMortgageAmount, _tmpConsecutiveUnpaidTaxWeeks, _tmpConsecutiveUnpaidTitheWeeks, _tmpTaxRate);
                float _tmpPositiveSentiment = (float) _stmt.getDouble(_columnIndexOfPositiveSentiment);
                float _tmpNegativeSentiment = (float) _stmt.getDouble(_columnIndexOfNegativeSentiment);
                float _tmpNeutralSentiment = (float) _stmt.getDouble(_columnIndexOfNeutralSentiment);
                long _tmpConversationVolume = _stmt.getLong(_columnIndexOfConversationVolume);
                float _tmpTrendingScore = (float) _stmt.getDouble(_columnIndexOfTrendingScore);
                float _tmpMediaAttention = (float) _stmt.getDouble(_columnIndexOfMediaAttention);
                long _tmpIndustryFollowers = _stmt.getLong(_columnIndexOfIndustryFollowers);
                long _tmpFollowers = _stmt.getLong(_columnIndexOfFollowers);
                SocialSentimentState _tmpSentiment = new SocialSentimentState(_tmpPositiveSentiment, _tmpNegativeSentiment, _tmpNeutralSentiment, _tmpConversationVolume, _tmpTrendingScore, _tmpMediaAttention, _tmpIndustryFollowers, _tmpFollowers);
                _result = new GameStateEntity(_tmpEmail, _tmpArtistName, _tmpIsAdmin, _tmpCash, _tmpFans, _tmpPopularity, _tmpInfluence, _tmpVoiceSkill, _tmpWritingSkill, _tmpBusinessSkill, _tmpEnergy, _tmpMaxEnergy, _tmpTimeSlots, _tmpMaxTimeSlots, _tmpCurrentWeek, _tmpCurrentYear, _tmpPracticeMissedWeeks, _tmpActiveToursCount, _tmpOwnedCars, _tmpOwnedHouses, _tmpOwnedInstruments, _tmpSongs, _tmpTours, _tmpSideJobs, _tmpStocks, _tmpCryptos, _tmpOwnLabel, _tmpSignedLabelId, _tmpSignedLabelCut, _tmpSignedLabelRole, _tmpSignedLabelLevel, _tmpSignedLabelStartWeek, _tmpSignedLabelStartYear, _tmpSignedLabelEndWeek, _tmpSignedLabelEndYear, _tmpSignedLabelReqSingles, _tmpSignedLabelReqAlbumsLP, _tmpSignedLabelReqAlbumsEP, _tmpSignedLabelReqMeTubeVideos, _tmpSignedLabelDeliveredSingles, _tmpSignedLabelDeliveredAlbumsLP, _tmpSignedLabelDeliveredAlbumsEP, _tmpSignedLabelDeliveredMeTubeVideos, _tmpMailbox, _tmpNpcs, _tmpPurchaseRequests, _tmpIndustryRespect, _tmpPublicImage, _tmpCriticalAcclaim, _tmpTrustworthiness, _tmpLegacyPoints, _tmpBusinessReputation, _tmpDiscipline, _tmpIntegrity, _tmpGenerosity, _tmpHumility, _tmpReliability, _tmpStress, _tmpBurnout, _tmpCreativeInspiration, _tmpMotivation, _tmpHappiness, _tmpWorkLifeBalance, _tmpGenreTrends, _tmpTimelineEvents, _tmpOwnedBusinesses, _tmpActiveGlobalEvent, _tmpGlobalEventEffect, _tmpMeTubeVideos, _tmpMeTubeSubscribers, _tmpMeTubeWatchTime, _tmpMeTubeRevenue, _tmpActiveBrandDealName, _tmpBrandDealWeeksRemaining, _tmpBrandDealWeeklyPayout, _tmpBrandDealRequiredEngagement, _tmpBrandDealPostedThisWeek, _tmpChatConversations, _tmpPendingChatReplies, _tmpCastPosts, _tmpCastTrendingHashtags, _tmpCastTimeSpentThisWeek, _tmpCastPostsCountThisWeek, _tmpCastNicheFocus, _tmpHiredEmployees, _tmpCandidateRoster, _tmpPendingStockOrders, _tmpPendingCryptoOrders, _tmpWallpaperId, _tmpIsPhoneLocked, _tmpNotificationLogs, _tmpInsuredCars, _tmpInsuredHouses, _tmpAdCompanyBudget, _tmpActiveAdCampaigns, _tmpEmployeeEvents, _tmpActiveBrandDeals, _tmpNewsArticles, _tmpWeatherCondition, _tmpActiveNoteText, _tmpSavedPhotos, _tmpScheduledActivities, _tmpEconomyCycle, _tmpInflationRate, _tmpFuelPrice, _tmpTouristIndex, _tmpIsElectionSeason, _tmpResidenceCountry, _tmpHasGlobalStreamingLicense, _tmpAccountantAutoInvestPercent, _tmpAccountantAutoSellProfitMargin, _tmpCryptoAutoInvestPercent, _tmpCryptoAutoSellProfitMargin, _tmpMerchStyles, _tmpEndorsedCandidateId, _tmpPoliticalTaxModifier, _tmpCityProjectWeeksRemaining, _tmpSoundstreamMonthlyListeners, _tmpSoundstreamWorldRank, _tmpSoundstreamWeeklyStreams, _tmpSoundstreamSongs, _tmpActiveFamilyReqNpcId, _tmpActiveFamilyReqAmount, _tmpActiveFamilyReqType, _tmpActiveFamilyReqDetail, _tmpActiveFamilyReqStatus, _tmpLastFamilyReqWeek, _tmpActiveDistributionDeal, _tmpActivePublishingDeal, _tmpRecoupableAdvanceBalance, _tmpSignedDistributionWeek, _tmpSignedPublishingWeek, _tmpAlbums, _tmpWorldHistory, _tmpAccountantStopLossMargin, _tmpCryptoStopLossMargin, _tmpAccountantAutoInvestEnabled, _tmpCryptoAutoInvestEnabled, _tmpLegacy, _tmpSecurity, _tmpFanSegments, _tmpWealth, _tmpWebHub, _tmpUpgradedPlatforms, _tmpAvatar, _tmpSpiritual, _tmpBanking, _tmpSentiment);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.GameStateDao
    @Nullable
    public Object getGameStateDirect(@NotNull String email, @NotNull Continuation<? super GameStateEntity> continuation) {
        return DBUtil.performSuspending(this.__db, true, false, (v3) -> {
            return getGameStateDirect$lambda$2(r3, r4, r5, v3);
        }, continuation);
    }

    private static final GameStateEntity getGameStateDirect$lambda$2(String $_sql, String $email, GameStateDao_Impl this$0, SQLiteConnection _connection) {
        GameStateEntity _result;
        String _tmp_9;
        String _tmpSignedLabelId;
        String _tmpSignedLabelRole;
        String _tmpActiveGlobalEvent;
        String _tmpGlobalEventEffect;
        String _tmpActiveBrandDealName;
        String _tmpEndorsedCandidateId;
        String _tmpActiveFamilyReqNpcId;
        String _tmpActiveFamilyReqType;
        String _tmpActiveFamilyReqDetail;
        String _tmpActiveFamilyReqStatus;
        String _tmpElectionVotedCandidateId;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $email);
            int _columnIndexOfEmail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
            int _columnIndexOfArtistName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "artistName");
            int _columnIndexOfIsAdmin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isAdmin");
            int _columnIndexOfCash = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cash");
            int _columnIndexOfFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fans");
            int _columnIndexOfPopularity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "popularity");
            int _columnIndexOfInfluence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "influence");
            int _columnIndexOfVoiceSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "voiceSkill");
            int _columnIndexOfWritingSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "writingSkill");
            int _columnIndexOfBusinessSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessSkill");
            int _columnIndexOfEnergy = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "energy");
            int _columnIndexOfMaxEnergy = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "maxEnergy");
            int _columnIndexOfTimeSlots = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timeSlots");
            int _columnIndexOfMaxTimeSlots = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "maxTimeSlots");
            int _columnIndexOfCurrentWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "currentWeek");
            int _columnIndexOfCurrentYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "currentYear");
            int _columnIndexOfPracticeMissedWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "practiceMissedWeeks");
            int _columnIndexOfActiveToursCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeToursCount");
            int _columnIndexOfOwnedCars = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedCars");
            int _columnIndexOfOwnedHouses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedHouses");
            int _columnIndexOfOwnedInstruments = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedInstruments");
            int _columnIndexOfSongs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "songs");
            int _columnIndexOfTours = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tours");
            int _columnIndexOfSideJobs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sideJobs");
            int _columnIndexOfStocks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stocks");
            int _columnIndexOfCryptos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptos");
            int _columnIndexOfOwnLabel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownLabel");
            int _columnIndexOfSignedLabelId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelId");
            int _columnIndexOfSignedLabelCut = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelCut");
            int _columnIndexOfSignedLabelRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelRole");
            int _columnIndexOfSignedLabelLevel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelLevel");
            int _columnIndexOfSignedLabelStartWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelStartWeek");
            int _columnIndexOfSignedLabelStartYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelStartYear");
            int _columnIndexOfSignedLabelEndWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelEndWeek");
            int _columnIndexOfSignedLabelEndYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelEndYear");
            int _columnIndexOfSignedLabelReqSingles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqSingles");
            int _columnIndexOfSignedLabelReqAlbumsLP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqAlbumsLP");
            int _columnIndexOfSignedLabelReqAlbumsEP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqAlbumsEP");
            int _columnIndexOfSignedLabelReqMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqMeTubeVideos");
            int _columnIndexOfSignedLabelDeliveredSingles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredSingles");
            int _columnIndexOfSignedLabelDeliveredAlbumsLP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredAlbumsLP");
            int _columnIndexOfSignedLabelDeliveredAlbumsEP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredAlbumsEP");
            int _columnIndexOfSignedLabelDeliveredMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredMeTubeVideos");
            int _columnIndexOfMailbox = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mailbox");
            int _columnIndexOfNpcs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "npcs");
            int _columnIndexOfPurchaseRequests = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "purchaseRequests");
            int _columnIndexOfIndustryRespect = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "industryRespect");
            int _columnIndexOfPublicImage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "publicImage");
            int _columnIndexOfCriticalAcclaim = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "criticalAcclaim");
            int _columnIndexOfTrustworthiness = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "trustworthiness");
            int _columnIndexOfLegacyPoints = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "legacyPoints");
            int _columnIndexOfBusinessReputation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessReputation");
            int _columnIndexOfDiscipline = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "discipline");
            int _columnIndexOfIntegrity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "integrity");
            int _columnIndexOfGenerosity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "generosity");
            int _columnIndexOfHumility = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "humility");
            int _columnIndexOfReliability = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reliability");
            int _columnIndexOfStress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stress");
            int _columnIndexOfBurnout = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "burnout");
            int _columnIndexOfCreativeInspiration = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "creativeInspiration");
            int _columnIndexOfMotivation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "motivation");
            int _columnIndexOfHappiness = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "happiness");
            int _columnIndexOfWorkLifeBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "workLifeBalance");
            int _columnIndexOfGenreTrends = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "genreTrends");
            int _columnIndexOfTimelineEvents = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timelineEvents");
            int _columnIndexOfOwnedBusinesses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedBusinesses");
            int _columnIndexOfActiveGlobalEvent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeGlobalEvent");
            int _columnIndexOfGlobalEventEffect = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "globalEventEffect");
            int _columnIndexOfMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeVideos");
            int _columnIndexOfMeTubeSubscribers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeSubscribers");
            int _columnIndexOfMeTubeWatchTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeWatchTime");
            int _columnIndexOfMeTubeRevenue = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeRevenue");
            int _columnIndexOfActiveBrandDealName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeBrandDealName");
            int _columnIndexOfBrandDealWeeksRemaining = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealWeeksRemaining");
            int _columnIndexOfBrandDealWeeklyPayout = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealWeeklyPayout");
            int _columnIndexOfBrandDealRequiredEngagement = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealRequiredEngagement");
            int _columnIndexOfBrandDealPostedThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealPostedThisWeek");
            int _columnIndexOfChatConversations = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chatConversations");
            int _columnIndexOfPendingChatReplies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingChatReplies");
            int _columnIndexOfCastPosts = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castPosts");
            int _columnIndexOfCastTrendingHashtags = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castTrendingHashtags");
            int _columnIndexOfCastTimeSpentThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castTimeSpentThisWeek");
            int _columnIndexOfCastPostsCountThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castPostsCountThisWeek");
            int _columnIndexOfCastNicheFocus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castNicheFocus");
            int _columnIndexOfHiredEmployees = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hiredEmployees");
            int _columnIndexOfCandidateRoster = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "candidateRoster");
            int _columnIndexOfPendingStockOrders = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingStockOrders");
            int _columnIndexOfPendingCryptoOrders = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingCryptoOrders");
            int _columnIndexOfWallpaperId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wallpaperId");
            int _columnIndexOfIsPhoneLocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isPhoneLocked");
            int _columnIndexOfNotificationLogs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notificationLogs");
            int _columnIndexOfInsuredCars = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "insuredCars");
            int _columnIndexOfInsuredHouses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "insuredHouses");
            int _columnIndexOfAdCompanyBudget = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "adCompanyBudget");
            int _columnIndexOfActiveAdCampaigns = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeAdCampaigns");
            int _columnIndexOfEmployeeEvents = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "employeeEvents");
            int _columnIndexOfActiveBrandDeals = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeBrandDeals");
            int _columnIndexOfNewsArticles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "newsArticles");
            int _columnIndexOfWeatherCondition = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "weatherCondition");
            int _columnIndexOfActiveNoteText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeNoteText");
            int _columnIndexOfSavedPhotos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savedPhotos");
            int _columnIndexOfScheduledActivities = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "scheduledActivities");
            int _columnIndexOfEconomyCycle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "economyCycle");
            int _columnIndexOfInflationRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "inflationRate");
            int _columnIndexOfFuelPrice = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fuelPrice");
            int _columnIndexOfTouristIndex = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "touristIndex");
            int _columnIndexOfIsElectionSeason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isElectionSeason");
            int _columnIndexOfResidenceCountry = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "residenceCountry");
            int _columnIndexOfHasGlobalStreamingLicense = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasGlobalStreamingLicense");
            int _columnIndexOfAccountantAutoInvestPercent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoInvestPercent");
            int _columnIndexOfAccountantAutoSellProfitMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoSellProfitMargin");
            int _columnIndexOfCryptoAutoInvestPercent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoInvestPercent");
            int _columnIndexOfCryptoAutoSellProfitMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoSellProfitMargin");
            int _columnIndexOfMerchStyles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "merchStyles");
            int _columnIndexOfEndorsedCandidateId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "endorsedCandidateId");
            int _columnIndexOfPoliticalTaxModifier = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "politicalTaxModifier");
            int _columnIndexOfCityProjectWeeksRemaining = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cityProjectWeeksRemaining");
            int _columnIndexOfSoundstreamMonthlyListeners = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamMonthlyListeners");
            int _columnIndexOfSoundstreamWorldRank = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamWorldRank");
            int _columnIndexOfSoundstreamWeeklyStreams = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamWeeklyStreams");
            int _columnIndexOfSoundstreamSongs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamSongs");
            int _columnIndexOfActiveFamilyReqNpcId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqNpcId");
            int _columnIndexOfActiveFamilyReqAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqAmount");
            int _columnIndexOfActiveFamilyReqType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqType");
            int _columnIndexOfActiveFamilyReqDetail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqDetail");
            int _columnIndexOfActiveFamilyReqStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqStatus");
            int _columnIndexOfLastFamilyReqWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastFamilyReqWeek");
            int _columnIndexOfActiveDistributionDeal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeDistributionDeal");
            int _columnIndexOfActivePublishingDeal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activePublishingDeal");
            int _columnIndexOfRecoupableAdvanceBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "recoupableAdvanceBalance");
            int _columnIndexOfSignedDistributionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedDistributionWeek");
            int _columnIndexOfSignedPublishingWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedPublishingWeek");
            int _columnIndexOfAlbums = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "albums");
            int _columnIndexOfWorldHistory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "worldHistory");
            int _columnIndexOfAccountantStopLossMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantStopLossMargin");
            int _columnIndexOfCryptoStopLossMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoStopLossMargin");
            int _columnIndexOfAccountantAutoInvestEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoInvestEnabled");
            int _columnIndexOfCryptoAutoInvestEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoInvestEnabled");
            int _columnIndexOfUpgradedPlatforms = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "upgradedPlatforms");
            int _columnIndexOfHasWikipediaPage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasWikipediaPage");
            int _columnIndexOfHasHallOfFame = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasHallOfFame");
            int _columnIndexOfHasMuseum = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasMuseum");
            int _columnIndexOfHasDocumentary = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasDocumentary");
            int _columnIndexOfHasBiography = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasBiography");
            int _columnIndexOfHasNetflixSeries = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasNetflixSeries");
            int _columnIndexOfHasScholarships = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasScholarships");
            int _columnIndexOfArtistsInspiredCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "artistsInspiredCount");
            int _columnIndexOfReceivedGovernorPitch = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "receivedGovernorPitch");
            int _columnIndexOfReceivedSenatorPitch = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "receivedSenatorPitch");
            int _columnIndexOfHiredSecurityCompany = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hiredSecurityCompany");
            int _columnIndexOfHasCyberInsurance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasCyberInsurance");
            int _columnIndexOfHasStudioInsurance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasStudioInsurance");
            int _columnIndexOfCasualFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "casualFans");
            int _columnIndexOfHardcoreFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hardcoreFans");
            int _columnIndexOfCollectors = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "collectors");
            int _columnIndexOfConcertGoers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "concertGoers");
            int _columnIndexOfInternationalFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "internationalFans");
            int _columnIndexOfOnlineCommunity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "onlineCommunity");
            int _columnIndexOfFansPersonalityLovers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansPersonalityLovers");
            int _columnIndexOfFansLyricsLovers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansLyricsLovers");
            int _columnIndexOfFansVoicePurists = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansVoicePurists");
            int _columnIndexOfFansFashionistas = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansFashionistas");
            int _columnIndexOfFansControversySeekers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansControversySeekers");
            int _columnIndexOfFansBusinessAdmirers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansBusinessAdmirers");
            int _columnIndexOfFansCharityBelievers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansCharityBelievers");
            int _columnIndexOfEmergencyFundBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergencyFundBalance");
            int _columnIndexOfPayrollReserve = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "payrollReserve");
            int _columnIndexOfBusinessReserve = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessReserve");
            int _columnIndexOfBondsBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "bondsBalance");
            int _columnIndexOfBondsInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "bondsInterestRate");
            int _columnIndexOfFinancialReviewLog = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "financialReviewLog");
            int _columnIndexOfLastReviewWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReviewWeek");
            int _columnIndexOfLastReviewYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReviewYear");
            int _columnIndexOfFinancialHistoryCashFlow = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "financialHistoryCashFlow");
            int _columnIndexOfSmmPostCategory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "smmPostCategory");
            int _columnIndexOfSmmAutoPost = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "smmAutoPost");
            int _columnIndexOfWgtApplied = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtApplied");
            int _columnIndexOfWgtAuditionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtAuditionWeek");
            int _columnIndexOfWgtAuditionYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtAuditionYear");
            int _columnIndexOfWgtCompletedCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtCompletedCount");
            int _columnIndexOfWgtWon = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtWon");
            int _columnIndexOfIsSccWanted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isSccWanted");
            int _columnIndexOfSccCrimeReason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sccCrimeReason");
            int _columnIndexOfSccFineAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sccFineAmount");
            int _columnIndexOfBlackHatPurchasesCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "blackHatPurchasesCount");
            int _columnIndexOfElectionVotedCandidateId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedCandidateId");
            int _columnIndexOfElectionVotedWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedWeek");
            int _columnIndexOfElectionVotedYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedYear");
            int _columnIndexOfGrandAwardNominated = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardNominated");
            int _columnIndexOfGrandAwardWon = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardWon");
            int _columnIndexOfGrandAwardVipAccess = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardVipAccess");
            int _columnIndexOfLastDemoSubmissionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastDemoSubmissionWeek");
            int _columnIndexOfLabelContractObligations = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "labelContractObligations");
            int _columnIndexOfWgtSeason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSeason");
            int _columnIndexOfWgtSeasonYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSeasonYear");
            int _columnIndexOfWgtSemiFinalsWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSemiFinalsWeek");
            int _columnIndexOfWgtGrandFinaleWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtGrandFinaleWeek");
            int _columnIndexOfWgtRegistrationStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtRegistrationStatus");
            int _columnIndexOfWgtLastWinner = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtLastWinner");
            int _columnIndexOfWgtContestants = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtContestants");
            int _columnIndexOfAvatarBaseLook = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarBaseLook");
            int _columnIndexOfAvatarSkinTone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarSkinTone");
            int _columnIndexOfAvatarHairStyleId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarHairStyleId");
            int _columnIndexOfAvatarClothingId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarClothingId");
            int _columnIndexOfAvatarJewelryId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarJewelryId");
            int _columnIndexOfAvatarOwnedItemIds = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarOwnedItemIds");
            int _columnIndexOfSpiritualPrayerSetting = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualPrayerSetting");
            int _columnIndexOfSpiritualTitheSetting = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTitheSetting");
            int _columnIndexOfSpiritualTotalTithesPaid = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTotalTithesPaid");
            int _columnIndexOfSpiritualTitheReminderActive = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTitheReminderActive");
            int _columnIndexOfSpiritualJournal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualJournal");
            int _columnIndexOfSavingsBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savingsBalance");
            int _columnIndexOfLoanAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "loanAmount");
            int _columnIndexOfAccumulatedLoanInterest = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accumulatedLoanInterest");
            int _columnIndexOfTaxDebt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "taxDebt");
            int _columnIndexOfTitheDebt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "titheDebt");
            int _columnIndexOfSavingsInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savingsInterestRate");
            int _columnIndexOfLoanInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "loanInterestRate");
            int _columnIndexOfMortgageAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mortgageAmount");
            int _columnIndexOfConsecutiveUnpaidTaxWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "consecutiveUnpaidTaxWeeks");
            int _columnIndexOfConsecutiveUnpaidTitheWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "consecutiveUnpaidTitheWeeks");
            int _columnIndexOfTaxRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "taxRate");
            int _columnIndexOfPositiveSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "positiveSentiment");
            int _columnIndexOfNegativeSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "negativeSentiment");
            int _columnIndexOfNeutralSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "neutralSentiment");
            int _columnIndexOfConversationVolume = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "conversationVolume");
            int _columnIndexOfTrendingScore = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "trendingScore");
            int _columnIndexOfMediaAttention = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mediaAttention");
            int _columnIndexOfIndustryFollowers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "industryFollowers");
            int _columnIndexOfFollowers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "followers");
            if (_stmt.step()) {
                String _tmpEmail = _stmt.getText(_columnIndexOfEmail);
                String _tmpArtistName = _stmt.getText(_columnIndexOfArtistName);
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsAdmin);
                boolean _tmpIsAdmin = _tmp != 0;
                double _tmpCash = _stmt.getDouble(_columnIndexOfCash);
                long _tmpFans = _stmt.getLong(_columnIndexOfFans);
                float _tmpPopularity = (float) _stmt.getDouble(_columnIndexOfPopularity);
                float _tmpInfluence = (float) _stmt.getDouble(_columnIndexOfInfluence);
                float _tmpVoiceSkill = (float) _stmt.getDouble(_columnIndexOfVoiceSkill);
                float _tmpWritingSkill = (float) _stmt.getDouble(_columnIndexOfWritingSkill);
                float _tmpBusinessSkill = (float) _stmt.getDouble(_columnIndexOfBusinessSkill);
                int _tmpEnergy = (int) _stmt.getLong(_columnIndexOfEnergy);
                int _tmpMaxEnergy = (int) _stmt.getLong(_columnIndexOfMaxEnergy);
                int _tmpTimeSlots = (int) _stmt.getLong(_columnIndexOfTimeSlots);
                int _tmpMaxTimeSlots = (int) _stmt.getLong(_columnIndexOfMaxTimeSlots);
                int _tmpCurrentWeek = (int) _stmt.getLong(_columnIndexOfCurrentWeek);
                int _tmpCurrentYear = (int) _stmt.getLong(_columnIndexOfCurrentYear);
                int _tmpPracticeMissedWeeks = (int) _stmt.getLong(_columnIndexOfPracticeMissedWeeks);
                int _tmpActiveToursCount = (int) _stmt.getLong(_columnIndexOfActiveToursCount);
                String _tmp_1 = _stmt.getText(_columnIndexOfOwnedCars);
                List _tmpOwnedCars = this$0.__converters.toCarList(_tmp_1);
                String _tmp_2 = _stmt.getText(_columnIndexOfOwnedHouses);
                List _tmpOwnedHouses = this$0.__converters.toHouseList(_tmp_2);
                String _tmp_3 = _stmt.getText(_columnIndexOfOwnedInstruments);
                List _tmpOwnedInstruments = this$0.__converters.toInstrumentList(_tmp_3);
                String _tmp_4 = _stmt.getText(_columnIndexOfSongs);
                List _tmpSongs = this$0.__converters.toSongList(_tmp_4);
                String _tmp_5 = _stmt.getText(_columnIndexOfTours);
                List _tmpTours = this$0.__converters.toTourList(_tmp_5);
                String _tmp_6 = _stmt.getText(_columnIndexOfSideJobs);
                List _tmpSideJobs = this$0.__converters.toSideJobList(_tmp_6);
                String _tmp_7 = _stmt.getText(_columnIndexOfStocks);
                List _tmpStocks = this$0.__converters.toStockList(_tmp_7);
                String _tmp_8 = _stmt.getText(_columnIndexOfCryptos);
                List _tmpCryptos = this$0.__converters.toCryptoList(_tmp_8);
                if (_stmt.isNull(_columnIndexOfOwnLabel)) {
                    _tmp_9 = null;
                } else {
                    _tmp_9 = _stmt.getText(_columnIndexOfOwnLabel);
                }
                OwnRecordLabel _tmpOwnLabel = this$0.__converters.toOwnRecordLabel(_tmp_9);
                if (_stmt.isNull(_columnIndexOfSignedLabelId)) {
                    _tmpSignedLabelId = null;
                } else {
                    _tmpSignedLabelId = _stmt.getText(_columnIndexOfSignedLabelId);
                }
                float _tmpSignedLabelCut = (float) _stmt.getDouble(_columnIndexOfSignedLabelCut);
                if (_stmt.isNull(_columnIndexOfSignedLabelRole)) {
                    _tmpSignedLabelRole = null;
                } else {
                    _tmpSignedLabelRole = _stmt.getText(_columnIndexOfSignedLabelRole);
                }
                int _tmpSignedLabelLevel = (int) _stmt.getLong(_columnIndexOfSignedLabelLevel);
                int _tmpSignedLabelStartWeek = (int) _stmt.getLong(_columnIndexOfSignedLabelStartWeek);
                int _tmpSignedLabelStartYear = (int) _stmt.getLong(_columnIndexOfSignedLabelStartYear);
                int _tmpSignedLabelEndWeek = (int) _stmt.getLong(_columnIndexOfSignedLabelEndWeek);
                int _tmpSignedLabelEndYear = (int) _stmt.getLong(_columnIndexOfSignedLabelEndYear);
                int _tmpSignedLabelReqSingles = (int) _stmt.getLong(_columnIndexOfSignedLabelReqSingles);
                int _tmpSignedLabelReqAlbumsLP = (int) _stmt.getLong(_columnIndexOfSignedLabelReqAlbumsLP);
                int _tmpSignedLabelReqAlbumsEP = (int) _stmt.getLong(_columnIndexOfSignedLabelReqAlbumsEP);
                int _tmpSignedLabelReqMeTubeVideos = (int) _stmt.getLong(_columnIndexOfSignedLabelReqMeTubeVideos);
                int _tmpSignedLabelDeliveredSingles = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredSingles);
                int _tmpSignedLabelDeliveredAlbumsLP = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredAlbumsLP);
                int _tmpSignedLabelDeliveredAlbumsEP = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredAlbumsEP);
                int _tmpSignedLabelDeliveredMeTubeVideos = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredMeTubeVideos);
                String _tmp_10 = _stmt.getText(_columnIndexOfMailbox);
                List _tmpMailbox = this$0.__converters.toMailMessageList(_tmp_10);
                String _tmp_11 = _stmt.getText(_columnIndexOfNpcs);
                List _tmpNpcs = this$0.__converters.toNPCEntityList(_tmp_11);
                String _tmp_12 = _stmt.getText(_columnIndexOfPurchaseRequests);
                List _tmpPurchaseRequests = this$0.__converters.toPurchaseRequestList(_tmp_12);
                float _tmpIndustryRespect = (float) _stmt.getDouble(_columnIndexOfIndustryRespect);
                float _tmpPublicImage = (float) _stmt.getDouble(_columnIndexOfPublicImage);
                float _tmpCriticalAcclaim = (float) _stmt.getDouble(_columnIndexOfCriticalAcclaim);
                float _tmpTrustworthiness = (float) _stmt.getDouble(_columnIndexOfTrustworthiness);
                long _tmpLegacyPoints = _stmt.getLong(_columnIndexOfLegacyPoints);
                float _tmpBusinessReputation = (float) _stmt.getDouble(_columnIndexOfBusinessReputation);
                float _tmpDiscipline = (float) _stmt.getDouble(_columnIndexOfDiscipline);
                float _tmpIntegrity = (float) _stmt.getDouble(_columnIndexOfIntegrity);
                float _tmpGenerosity = (float) _stmt.getDouble(_columnIndexOfGenerosity);
                float _tmpHumility = (float) _stmt.getDouble(_columnIndexOfHumility);
                float _tmpReliability = (float) _stmt.getDouble(_columnIndexOfReliability);
                float _tmpStress = (float) _stmt.getDouble(_columnIndexOfStress);
                float _tmpBurnout = (float) _stmt.getDouble(_columnIndexOfBurnout);
                float _tmpCreativeInspiration = (float) _stmt.getDouble(_columnIndexOfCreativeInspiration);
                float _tmpMotivation = (float) _stmt.getDouble(_columnIndexOfMotivation);
                float _tmpHappiness = (float) _stmt.getDouble(_columnIndexOfHappiness);
                float _tmpWorkLifeBalance = (float) _stmt.getDouble(_columnIndexOfWorkLifeBalance);
                String _tmp_13 = _stmt.getText(_columnIndexOfGenreTrends);
                Map _tmpGenreTrends = this$0.__converters.toStringMap(_tmp_13);
                String _tmp_14 = _stmt.getText(_columnIndexOfTimelineEvents);
                List _tmpTimelineEvents = this$0.__converters.toStringList(_tmp_14);
                String _tmp_15 = _stmt.getText(_columnIndexOfOwnedBusinesses);
                List _tmpOwnedBusinesses = this$0.__converters.toBusinessAssetList(_tmp_15);
                if (_stmt.isNull(_columnIndexOfActiveGlobalEvent)) {
                    _tmpActiveGlobalEvent = null;
                } else {
                    _tmpActiveGlobalEvent = _stmt.getText(_columnIndexOfActiveGlobalEvent);
                }
                if (_stmt.isNull(_columnIndexOfGlobalEventEffect)) {
                    _tmpGlobalEventEffect = null;
                } else {
                    _tmpGlobalEventEffect = _stmt.getText(_columnIndexOfGlobalEventEffect);
                }
                String _tmp_16 = _stmt.getText(_columnIndexOfMeTubeVideos);
                List _tmpMeTubeVideos = this$0.__converters.toMeTubeVideoList(_tmp_16);
                long _tmpMeTubeSubscribers = _stmt.getLong(_columnIndexOfMeTubeSubscribers);
                double _tmpMeTubeWatchTime = _stmt.getDouble(_columnIndexOfMeTubeWatchTime);
                double _tmpMeTubeRevenue = _stmt.getDouble(_columnIndexOfMeTubeRevenue);
                if (_stmt.isNull(_columnIndexOfActiveBrandDealName)) {
                    _tmpActiveBrandDealName = null;
                } else {
                    _tmpActiveBrandDealName = _stmt.getText(_columnIndexOfActiveBrandDealName);
                }
                int _tmpBrandDealWeeksRemaining = (int) _stmt.getLong(_columnIndexOfBrandDealWeeksRemaining);
                double _tmpBrandDealWeeklyPayout = _stmt.getDouble(_columnIndexOfBrandDealWeeklyPayout);
                long _tmpBrandDealRequiredEngagement = _stmt.getLong(_columnIndexOfBrandDealRequiredEngagement);
                int _tmp_17 = (int) _stmt.getLong(_columnIndexOfBrandDealPostedThisWeek);
                boolean _tmpBrandDealPostedThisWeek = _tmp_17 != 0;
                String _tmp_18 = _stmt.getText(_columnIndexOfChatConversations);
                List _tmpChatConversations = this$0.__converters.toChatConversationList(_tmp_18);
                String _tmp_19 = _stmt.getText(_columnIndexOfPendingChatReplies);
                List _tmpPendingChatReplies = this$0.__converters.toPendingChatReplyList(_tmp_19);
                String _tmp_20 = _stmt.getText(_columnIndexOfCastPosts);
                List _tmpCastPosts = this$0.__converters.toCastPostList(_tmp_20);
                String _tmp_21 = _stmt.getText(_columnIndexOfCastTrendingHashtags);
                List _tmpCastTrendingHashtags = this$0.__converters.toStringList(_tmp_21);
                int _tmpCastTimeSpentThisWeek = (int) _stmt.getLong(_columnIndexOfCastTimeSpentThisWeek);
                int _tmpCastPostsCountThisWeek = (int) _stmt.getLong(_columnIndexOfCastPostsCountThisWeek);
                String _tmpCastNicheFocus = _stmt.getText(_columnIndexOfCastNicheFocus);
                String _tmp_22 = _stmt.getText(_columnIndexOfHiredEmployees);
                List _tmpHiredEmployees = this$0.__converters.toEmployeeList(_tmp_22);
                String _tmp_23 = _stmt.getText(_columnIndexOfCandidateRoster);
                List _tmpCandidateRoster = this$0.__converters.toEmployeeList(_tmp_23);
                String _tmp_24 = _stmt.getText(_columnIndexOfPendingStockOrders);
                List _tmpPendingStockOrders = this$0.__converters.toStockOrderList(_tmp_24);
                String _tmp_25 = _stmt.getText(_columnIndexOfPendingCryptoOrders);
                List _tmpPendingCryptoOrders = this$0.__converters.toCryptoOrderList(_tmp_25);
                String _tmpWallpaperId = _stmt.getText(_columnIndexOfWallpaperId);
                int _tmp_26 = (int) _stmt.getLong(_columnIndexOfIsPhoneLocked);
                boolean _tmpIsPhoneLocked = _tmp_26 != 0;
                String _tmp_27 = _stmt.getText(_columnIndexOfNotificationLogs);
                List _tmpNotificationLogs = this$0.__converters.toStringList(_tmp_27);
                String _tmp_28 = _stmt.getText(_columnIndexOfInsuredCars);
                List _tmpInsuredCars = this$0.__converters.toStringList(_tmp_28);
                String _tmp_29 = _stmt.getText(_columnIndexOfInsuredHouses);
                List _tmpInsuredHouses = this$0.__converters.toStringList(_tmp_29);
                double _tmpAdCompanyBudget = _stmt.getDouble(_columnIndexOfAdCompanyBudget);
                String _tmp_30 = _stmt.getText(_columnIndexOfActiveAdCampaigns);
                List _tmpActiveAdCampaigns = this$0.__converters.toAdCampaignList(_tmp_30);
                String _tmp_31 = _stmt.getText(_columnIndexOfEmployeeEvents);
                List _tmpEmployeeEvents = this$0.__converters.toStringList(_tmp_31);
                String _tmp_32 = _stmt.getText(_columnIndexOfActiveBrandDeals);
                List _tmpActiveBrandDeals = this$0.__converters.toBrandDealList(_tmp_32);
                String _tmp_33 = _stmt.getText(_columnIndexOfNewsArticles);
                List _tmpNewsArticles = this$0.__converters.toNewsArticleList(_tmp_33);
                String _tmpWeatherCondition = _stmt.getText(_columnIndexOfWeatherCondition);
                String _tmpActiveNoteText = _stmt.getText(_columnIndexOfActiveNoteText);
                String _tmp_34 = _stmt.getText(_columnIndexOfSavedPhotos);
                List _tmpSavedPhotos = this$0.__converters.toStringList(_tmp_34);
                String _tmp_35 = _stmt.getText(_columnIndexOfScheduledActivities);
                List _tmpScheduledActivities = this$0.__converters.toStringList(_tmp_35);
                String _tmpEconomyCycle = _stmt.getText(_columnIndexOfEconomyCycle);
                float _tmpInflationRate = (float) _stmt.getDouble(_columnIndexOfInflationRate);
                float _tmpFuelPrice = (float) _stmt.getDouble(_columnIndexOfFuelPrice);
                int _tmpTouristIndex = (int) _stmt.getLong(_columnIndexOfTouristIndex);
                int _tmp_36 = (int) _stmt.getLong(_columnIndexOfIsElectionSeason);
                boolean _tmpIsElectionSeason = _tmp_36 != 0;
                String _tmpResidenceCountry = _stmt.getText(_columnIndexOfResidenceCountry);
                int _tmp_37 = (int) _stmt.getLong(_columnIndexOfHasGlobalStreamingLicense);
                boolean _tmpHasGlobalStreamingLicense = _tmp_37 != 0;
                float _tmpAccountantAutoInvestPercent = (float) _stmt.getDouble(_columnIndexOfAccountantAutoInvestPercent);
                float _tmpAccountantAutoSellProfitMargin = (float) _stmt.getDouble(_columnIndexOfAccountantAutoSellProfitMargin);
                float _tmpCryptoAutoInvestPercent = (float) _stmt.getDouble(_columnIndexOfCryptoAutoInvestPercent);
                float _tmpCryptoAutoSellProfitMargin = (float) _stmt.getDouble(_columnIndexOfCryptoAutoSellProfitMargin);
                String _tmp_38 = _stmt.getText(_columnIndexOfMerchStyles);
                List _tmpMerchStyles = this$0.__converters.toMerchStyleList(_tmp_38);
                if (_stmt.isNull(_columnIndexOfEndorsedCandidateId)) {
                    _tmpEndorsedCandidateId = null;
                } else {
                    _tmpEndorsedCandidateId = _stmt.getText(_columnIndexOfEndorsedCandidateId);
                }
                float _tmpPoliticalTaxModifier = (float) _stmt.getDouble(_columnIndexOfPoliticalTaxModifier);
                int _tmpCityProjectWeeksRemaining = (int) _stmt.getLong(_columnIndexOfCityProjectWeeksRemaining);
                long _tmpSoundstreamMonthlyListeners = _stmt.getLong(_columnIndexOfSoundstreamMonthlyListeners);
                int _tmpSoundstreamWorldRank = (int) _stmt.getLong(_columnIndexOfSoundstreamWorldRank);
                long _tmpSoundstreamWeeklyStreams = _stmt.getLong(_columnIndexOfSoundstreamWeeklyStreams);
                String _tmp_39 = _stmt.getText(_columnIndexOfSoundstreamSongs);
                List _tmpSoundstreamSongs = this$0.__converters.toChartSongList(_tmp_39);
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqNpcId)) {
                    _tmpActiveFamilyReqNpcId = null;
                } else {
                    _tmpActiveFamilyReqNpcId = _stmt.getText(_columnIndexOfActiveFamilyReqNpcId);
                }
                double _tmpActiveFamilyReqAmount = _stmt.getDouble(_columnIndexOfActiveFamilyReqAmount);
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqType)) {
                    _tmpActiveFamilyReqType = null;
                } else {
                    _tmpActiveFamilyReqType = _stmt.getText(_columnIndexOfActiveFamilyReqType);
                }
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqDetail)) {
                    _tmpActiveFamilyReqDetail = null;
                } else {
                    _tmpActiveFamilyReqDetail = _stmt.getText(_columnIndexOfActiveFamilyReqDetail);
                }
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqStatus)) {
                    _tmpActiveFamilyReqStatus = null;
                } else {
                    _tmpActiveFamilyReqStatus = _stmt.getText(_columnIndexOfActiveFamilyReqStatus);
                }
                int _tmpLastFamilyReqWeek = (int) _stmt.getLong(_columnIndexOfLastFamilyReqWeek);
                String _tmpActiveDistributionDeal = _stmt.getText(_columnIndexOfActiveDistributionDeal);
                String _tmpActivePublishingDeal = _stmt.getText(_columnIndexOfActivePublishingDeal);
                double _tmpRecoupableAdvanceBalance = _stmt.getDouble(_columnIndexOfRecoupableAdvanceBalance);
                int _tmpSignedDistributionWeek = (int) _stmt.getLong(_columnIndexOfSignedDistributionWeek);
                int _tmpSignedPublishingWeek = (int) _stmt.getLong(_columnIndexOfSignedPublishingWeek);
                String _tmp_40 = _stmt.getText(_columnIndexOfAlbums);
                List _tmpAlbums = this$0.__converters.toAlbumList(_tmp_40);
                String _tmp_41 = _stmt.getText(_columnIndexOfWorldHistory);
                List _tmpWorldHistory = this$0.__converters.toWorldHistoryEntryList(_tmp_41);
                float _tmpAccountantStopLossMargin = (float) _stmt.getDouble(_columnIndexOfAccountantStopLossMargin);
                float _tmpCryptoStopLossMargin = (float) _stmt.getDouble(_columnIndexOfCryptoStopLossMargin);
                int _tmp_42 = (int) _stmt.getLong(_columnIndexOfAccountantAutoInvestEnabled);
                boolean _tmpAccountantAutoInvestEnabled = _tmp_42 != 0;
                int _tmp_43 = (int) _stmt.getLong(_columnIndexOfCryptoAutoInvestEnabled);
                boolean _tmpCryptoAutoInvestEnabled = _tmp_43 != 0;
                String _tmp_44 = _stmt.getText(_columnIndexOfUpgradedPlatforms);
                Set _tmpUpgradedPlatforms = this$0.__converters.toStringSet(_tmp_44);
                int _tmp_45 = (int) _stmt.getLong(_columnIndexOfHasWikipediaPage);
                boolean _tmpHasWikipediaPage = _tmp_45 != 0;
                int _tmp_46 = (int) _stmt.getLong(_columnIndexOfHasHallOfFame);
                boolean _tmpHasHallOfFame = _tmp_46 != 0;
                int _tmp_47 = (int) _stmt.getLong(_columnIndexOfHasMuseum);
                boolean _tmpHasMuseum = _tmp_47 != 0;
                int _tmp_48 = (int) _stmt.getLong(_columnIndexOfHasDocumentary);
                boolean _tmpHasDocumentary = _tmp_48 != 0;
                int _tmp_49 = (int) _stmt.getLong(_columnIndexOfHasBiography);
                boolean _tmpHasBiography = _tmp_49 != 0;
                int _tmp_50 = (int) _stmt.getLong(_columnIndexOfHasNetflixSeries);
                boolean _tmpHasNetflixSeries = _tmp_50 != 0;
                int _tmp_51 = (int) _stmt.getLong(_columnIndexOfHasScholarships);
                boolean _tmpHasScholarships = _tmp_51 != 0;
                int _tmpArtistsInspiredCount = (int) _stmt.getLong(_columnIndexOfArtistsInspiredCount);
                int _tmp_52 = (int) _stmt.getLong(_columnIndexOfReceivedGovernorPitch);
                boolean _tmpReceivedGovernorPitch = _tmp_52 != 0;
                int _tmp_53 = (int) _stmt.getLong(_columnIndexOfReceivedSenatorPitch);
                boolean _tmpReceivedSenatorPitch = _tmp_53 != 0;
                LegacyMilestones _tmpLegacy = new LegacyMilestones(_tmpHasWikipediaPage, _tmpHasHallOfFame, _tmpHasMuseum, _tmpHasDocumentary, _tmpHasBiography, _tmpHasNetflixSeries, _tmpHasScholarships, _tmpArtistsInspiredCount, _tmpReceivedGovernorPitch, _tmpReceivedSenatorPitch);
                String _tmpHiredSecurityCompany = _stmt.getText(_columnIndexOfHiredSecurityCompany);
                int _tmp_54 = (int) _stmt.getLong(_columnIndexOfHasCyberInsurance);
                boolean _tmpHasCyberInsurance = _tmp_54 != 0;
                int _tmp_55 = (int) _stmt.getLong(_columnIndexOfHasStudioInsurance);
                boolean _tmpHasStudioInsurance = _tmp_55 != 0;
                SecurityCyberState _tmpSecurity = new SecurityCyberState(_tmpHiredSecurityCompany, _tmpHasCyberInsurance, _tmpHasStudioInsurance);
                long _tmpCasualFans = _stmt.getLong(_columnIndexOfCasualFans);
                long _tmpHardcoreFans = _stmt.getLong(_columnIndexOfHardcoreFans);
                long _tmpCollectors = _stmt.getLong(_columnIndexOfCollectors);
                long _tmpConcertGoers = _stmt.getLong(_columnIndexOfConcertGoers);
                long _tmpInternationalFans = _stmt.getLong(_columnIndexOfInternationalFans);
                long _tmpOnlineCommunity = _stmt.getLong(_columnIndexOfOnlineCommunity);
                long _tmpFansPersonalityLovers = _stmt.getLong(_columnIndexOfFansPersonalityLovers);
                long _tmpFansLyricsLovers = _stmt.getLong(_columnIndexOfFansLyricsLovers);
                long _tmpFansVoicePurists = _stmt.getLong(_columnIndexOfFansVoicePurists);
                long _tmpFansFashionistas = _stmt.getLong(_columnIndexOfFansFashionistas);
                long _tmpFansControversySeekers = _stmt.getLong(_columnIndexOfFansControversySeekers);
                long _tmpFansBusinessAdmirers = _stmt.getLong(_columnIndexOfFansBusinessAdmirers);
                long _tmpFansCharityBelievers = _stmt.getLong(_columnIndexOfFansCharityBelievers);
                FanSegmentsState _tmpFanSegments = new FanSegmentsState(_tmpCasualFans, _tmpHardcoreFans, _tmpCollectors, _tmpConcertGoers, _tmpInternationalFans, _tmpOnlineCommunity, _tmpFansPersonalityLovers, _tmpFansLyricsLovers, _tmpFansVoicePurists, _tmpFansFashionistas, _tmpFansControversySeekers, _tmpFansBusinessAdmirers, _tmpFansCharityBelievers);
                double _tmpEmergencyFundBalance = _stmt.getDouble(_columnIndexOfEmergencyFundBalance);
                double _tmpPayrollReserve = _stmt.getDouble(_columnIndexOfPayrollReserve);
                double _tmpBusinessReserve = _stmt.getDouble(_columnIndexOfBusinessReserve);
                double _tmpBondsBalance = _stmt.getDouble(_columnIndexOfBondsBalance);
                float _tmpBondsInterestRate = (float) _stmt.getDouble(_columnIndexOfBondsInterestRate);
                String _tmp_56 = _stmt.getText(_columnIndexOfFinancialReviewLog);
                List _tmpFinancialReviewLog = this$0.__converters.toStringList(_tmp_56);
                int _tmpLastReviewWeek = (int) _stmt.getLong(_columnIndexOfLastReviewWeek);
                int _tmpLastReviewYear = (int) _stmt.getLong(_columnIndexOfLastReviewYear);
                String _tmp_57 = _stmt.getText(_columnIndexOfFinancialHistoryCashFlow);
                List _tmpFinancialHistoryCashFlow = this$0.__converters.toStringList(_tmp_57);
                String _tmpSmmPostCategory = _stmt.getText(_columnIndexOfSmmPostCategory);
                int _tmp_58 = (int) _stmt.getLong(_columnIndexOfSmmAutoPost);
                boolean _tmpSmmAutoPost = _tmp_58 != 0;
                WealthEngineState _tmpWealth = new WealthEngineState(_tmpEmergencyFundBalance, _tmpPayrollReserve, _tmpBusinessReserve, _tmpBondsBalance, _tmpBondsInterestRate, _tmpFinancialReviewLog, _tmpLastReviewWeek, _tmpLastReviewYear, _tmpFinancialHistoryCashFlow, _tmpSmmPostCategory, _tmpSmmAutoPost);
                int _tmp_59 = (int) _stmt.getLong(_columnIndexOfWgtApplied);
                boolean _tmpWgtApplied = _tmp_59 != 0;
                int _tmpWgtAuditionWeek = (int) _stmt.getLong(_columnIndexOfWgtAuditionWeek);
                int _tmpWgtAuditionYear = (int) _stmt.getLong(_columnIndexOfWgtAuditionYear);
                int _tmpWgtCompletedCount = (int) _stmt.getLong(_columnIndexOfWgtCompletedCount);
                int _tmp_60 = (int) _stmt.getLong(_columnIndexOfWgtWon);
                boolean _tmpWgtWon = _tmp_60 != 0;
                int _tmp_61 = (int) _stmt.getLong(_columnIndexOfIsSccWanted);
                boolean _tmpIsSccWanted = _tmp_61 != 0;
                String _tmpSccCrimeReason = _stmt.getText(_columnIndexOfSccCrimeReason);
                double _tmpSccFineAmount = _stmt.getDouble(_columnIndexOfSccFineAmount);
                int _tmpBlackHatPurchasesCount = (int) _stmt.getLong(_columnIndexOfBlackHatPurchasesCount);
                if (_stmt.isNull(_columnIndexOfElectionVotedCandidateId)) {
                    _tmpElectionVotedCandidateId = null;
                } else {
                    _tmpElectionVotedCandidateId = _stmt.getText(_columnIndexOfElectionVotedCandidateId);
                }
                int _tmpElectionVotedWeek = (int) _stmt.getLong(_columnIndexOfElectionVotedWeek);
                int _tmpElectionVotedYear = (int) _stmt.getLong(_columnIndexOfElectionVotedYear);
                int _tmp_62 = (int) _stmt.getLong(_columnIndexOfGrandAwardNominated);
                boolean _tmpGrandAwardNominated = _tmp_62 != 0;
                int _tmp_63 = (int) _stmt.getLong(_columnIndexOfGrandAwardWon);
                boolean _tmpGrandAwardWon = _tmp_63 != 0;
                int _tmp_64 = (int) _stmt.getLong(_columnIndexOfGrandAwardVipAccess);
                boolean _tmpGrandAwardVipAccess = _tmp_64 != 0;
                int _tmpLastDemoSubmissionWeek = (int) _stmt.getLong(_columnIndexOfLastDemoSubmissionWeek);
                String _tmpLabelContractObligations = _stmt.getText(_columnIndexOfLabelContractObligations);
                int _tmpWgtSeason = (int) _stmt.getLong(_columnIndexOfWgtSeason);
                int _tmpWgtSeasonYear = (int) _stmt.getLong(_columnIndexOfWgtSeasonYear);
                int _tmpWgtSemiFinalsWeek = (int) _stmt.getLong(_columnIndexOfWgtSemiFinalsWeek);
                int _tmpWgtGrandFinaleWeek = (int) _stmt.getLong(_columnIndexOfWgtGrandFinaleWeek);
                String _tmpWgtRegistrationStatus = _stmt.getText(_columnIndexOfWgtRegistrationStatus);
                String _tmpWgtLastWinner = _stmt.getText(_columnIndexOfWgtLastWinner);
                String _tmp_65 = _stmt.getText(_columnIndexOfWgtContestants);
                List _tmpWgtContestants = this$0.__converters.toStringList(_tmp_65);
                WebHubState _tmpWebHub = new WebHubState(_tmpWgtApplied, _tmpWgtAuditionWeek, _tmpWgtAuditionYear, _tmpWgtCompletedCount, _tmpWgtWon, _tmpIsSccWanted, _tmpSccCrimeReason, _tmpSccFineAmount, _tmpBlackHatPurchasesCount, _tmpElectionVotedCandidateId, _tmpElectionVotedWeek, _tmpElectionVotedYear, _tmpGrandAwardNominated, _tmpGrandAwardWon, _tmpGrandAwardVipAccess, _tmpLastDemoSubmissionWeek, _tmpLabelContractObligations, _tmpWgtSeason, _tmpWgtSeasonYear, _tmpWgtSemiFinalsWeek, _tmpWgtGrandFinaleWeek, _tmpWgtRegistrationStatus, _tmpWgtLastWinner, _tmpWgtContestants);
                String _tmpAvatarBaseLook = _stmt.getText(_columnIndexOfAvatarBaseLook);
                String _tmpAvatarSkinTone = _stmt.getText(_columnIndexOfAvatarSkinTone);
                String _tmpAvatarHairStyleId = _stmt.getText(_columnIndexOfAvatarHairStyleId);
                String _tmpAvatarClothingId = _stmt.getText(_columnIndexOfAvatarClothingId);
                String _tmpAvatarJewelryId = _stmt.getText(_columnIndexOfAvatarJewelryId);
                String _tmp_66 = _stmt.getText(_columnIndexOfAvatarOwnedItemIds);
                List _tmpAvatarOwnedItemIds = this$0.__converters.toStringList(_tmp_66);
                AvatarState _tmpAvatar = new AvatarState(_tmpAvatarBaseLook, _tmpAvatarSkinTone, _tmpAvatarHairStyleId, _tmpAvatarClothingId, _tmpAvatarJewelryId, _tmpAvatarOwnedItemIds);
                int _tmp_67 = (int) _stmt.getLong(_columnIndexOfSpiritualPrayerSetting);
                boolean _tmpSpiritualPrayerSetting = _tmp_67 != 0;
                int _tmp_68 = (int) _stmt.getLong(_columnIndexOfSpiritualTitheSetting);
                boolean _tmpSpiritualTitheSetting = _tmp_68 != 0;
                double _tmpSpiritualTotalTithesPaid = _stmt.getDouble(_columnIndexOfSpiritualTotalTithesPaid);
                int _tmp_69 = (int) _stmt.getLong(_columnIndexOfSpiritualTitheReminderActive);
                boolean _tmpSpiritualTitheReminderActive = _tmp_69 != 0;
                String _tmp_70 = _stmt.getText(_columnIndexOfSpiritualJournal);
                List _tmpSpiritualJournal = this$0.__converters.toStringList(_tmp_70);
                SpiritualState _tmpSpiritual = new SpiritualState(_tmpSpiritualPrayerSetting, _tmpSpiritualTitheSetting, _tmpSpiritualTotalTithesPaid, _tmpSpiritualTitheReminderActive, _tmpSpiritualJournal);
                double _tmpSavingsBalance = _stmt.getDouble(_columnIndexOfSavingsBalance);
                double _tmpLoanAmount = _stmt.getDouble(_columnIndexOfLoanAmount);
                double _tmpAccumulatedLoanInterest = _stmt.getDouble(_columnIndexOfAccumulatedLoanInterest);
                double _tmpTaxDebt = _stmt.getDouble(_columnIndexOfTaxDebt);
                double _tmpTitheDebt = _stmt.getDouble(_columnIndexOfTitheDebt);
                float _tmpSavingsInterestRate = (float) _stmt.getDouble(_columnIndexOfSavingsInterestRate);
                float _tmpLoanInterestRate = (float) _stmt.getDouble(_columnIndexOfLoanInterestRate);
                double _tmpMortgageAmount = _stmt.getDouble(_columnIndexOfMortgageAmount);
                int _tmpConsecutiveUnpaidTaxWeeks = (int) _stmt.getLong(_columnIndexOfConsecutiveUnpaidTaxWeeks);
                int _tmpConsecutiveUnpaidTitheWeeks = (int) _stmt.getLong(_columnIndexOfConsecutiveUnpaidTitheWeeks);
                float _tmpTaxRate = (float) _stmt.getDouble(_columnIndexOfTaxRate);
                BankingState _tmpBanking = new BankingState(_tmpSavingsBalance, _tmpLoanAmount, _tmpAccumulatedLoanInterest, _tmpTaxDebt, _tmpTitheDebt, _tmpSavingsInterestRate, _tmpLoanInterestRate, _tmpMortgageAmount, _tmpConsecutiveUnpaidTaxWeeks, _tmpConsecutiveUnpaidTitheWeeks, _tmpTaxRate);
                float _tmpPositiveSentiment = (float) _stmt.getDouble(_columnIndexOfPositiveSentiment);
                float _tmpNegativeSentiment = (float) _stmt.getDouble(_columnIndexOfNegativeSentiment);
                float _tmpNeutralSentiment = (float) _stmt.getDouble(_columnIndexOfNeutralSentiment);
                long _tmpConversationVolume = _stmt.getLong(_columnIndexOfConversationVolume);
                float _tmpTrendingScore = (float) _stmt.getDouble(_columnIndexOfTrendingScore);
                float _tmpMediaAttention = (float) _stmt.getDouble(_columnIndexOfMediaAttention);
                long _tmpIndustryFollowers = _stmt.getLong(_columnIndexOfIndustryFollowers);
                long _tmpFollowers = _stmt.getLong(_columnIndexOfFollowers);
                SocialSentimentState _tmpSentiment = new SocialSentimentState(_tmpPositiveSentiment, _tmpNegativeSentiment, _tmpNeutralSentiment, _tmpConversationVolume, _tmpTrendingScore, _tmpMediaAttention, _tmpIndustryFollowers, _tmpFollowers);
                _result = new GameStateEntity(_tmpEmail, _tmpArtistName, _tmpIsAdmin, _tmpCash, _tmpFans, _tmpPopularity, _tmpInfluence, _tmpVoiceSkill, _tmpWritingSkill, _tmpBusinessSkill, _tmpEnergy, _tmpMaxEnergy, _tmpTimeSlots, _tmpMaxTimeSlots, _tmpCurrentWeek, _tmpCurrentYear, _tmpPracticeMissedWeeks, _tmpActiveToursCount, _tmpOwnedCars, _tmpOwnedHouses, _tmpOwnedInstruments, _tmpSongs, _tmpTours, _tmpSideJobs, _tmpStocks, _tmpCryptos, _tmpOwnLabel, _tmpSignedLabelId, _tmpSignedLabelCut, _tmpSignedLabelRole, _tmpSignedLabelLevel, _tmpSignedLabelStartWeek, _tmpSignedLabelStartYear, _tmpSignedLabelEndWeek, _tmpSignedLabelEndYear, _tmpSignedLabelReqSingles, _tmpSignedLabelReqAlbumsLP, _tmpSignedLabelReqAlbumsEP, _tmpSignedLabelReqMeTubeVideos, _tmpSignedLabelDeliveredSingles, _tmpSignedLabelDeliveredAlbumsLP, _tmpSignedLabelDeliveredAlbumsEP, _tmpSignedLabelDeliveredMeTubeVideos, _tmpMailbox, _tmpNpcs, _tmpPurchaseRequests, _tmpIndustryRespect, _tmpPublicImage, _tmpCriticalAcclaim, _tmpTrustworthiness, _tmpLegacyPoints, _tmpBusinessReputation, _tmpDiscipline, _tmpIntegrity, _tmpGenerosity, _tmpHumility, _tmpReliability, _tmpStress, _tmpBurnout, _tmpCreativeInspiration, _tmpMotivation, _tmpHappiness, _tmpWorkLifeBalance, _tmpGenreTrends, _tmpTimelineEvents, _tmpOwnedBusinesses, _tmpActiveGlobalEvent, _tmpGlobalEventEffect, _tmpMeTubeVideos, _tmpMeTubeSubscribers, _tmpMeTubeWatchTime, _tmpMeTubeRevenue, _tmpActiveBrandDealName, _tmpBrandDealWeeksRemaining, _tmpBrandDealWeeklyPayout, _tmpBrandDealRequiredEngagement, _tmpBrandDealPostedThisWeek, _tmpChatConversations, _tmpPendingChatReplies, _tmpCastPosts, _tmpCastTrendingHashtags, _tmpCastTimeSpentThisWeek, _tmpCastPostsCountThisWeek, _tmpCastNicheFocus, _tmpHiredEmployees, _tmpCandidateRoster, _tmpPendingStockOrders, _tmpPendingCryptoOrders, _tmpWallpaperId, _tmpIsPhoneLocked, _tmpNotificationLogs, _tmpInsuredCars, _tmpInsuredHouses, _tmpAdCompanyBudget, _tmpActiveAdCampaigns, _tmpEmployeeEvents, _tmpActiveBrandDeals, _tmpNewsArticles, _tmpWeatherCondition, _tmpActiveNoteText, _tmpSavedPhotos, _tmpScheduledActivities, _tmpEconomyCycle, _tmpInflationRate, _tmpFuelPrice, _tmpTouristIndex, _tmpIsElectionSeason, _tmpResidenceCountry, _tmpHasGlobalStreamingLicense, _tmpAccountantAutoInvestPercent, _tmpAccountantAutoSellProfitMargin, _tmpCryptoAutoInvestPercent, _tmpCryptoAutoSellProfitMargin, _tmpMerchStyles, _tmpEndorsedCandidateId, _tmpPoliticalTaxModifier, _tmpCityProjectWeeksRemaining, _tmpSoundstreamMonthlyListeners, _tmpSoundstreamWorldRank, _tmpSoundstreamWeeklyStreams, _tmpSoundstreamSongs, _tmpActiveFamilyReqNpcId, _tmpActiveFamilyReqAmount, _tmpActiveFamilyReqType, _tmpActiveFamilyReqDetail, _tmpActiveFamilyReqStatus, _tmpLastFamilyReqWeek, _tmpActiveDistributionDeal, _tmpActivePublishingDeal, _tmpRecoupableAdvanceBalance, _tmpSignedDistributionWeek, _tmpSignedPublishingWeek, _tmpAlbums, _tmpWorldHistory, _tmpAccountantStopLossMargin, _tmpCryptoStopLossMargin, _tmpAccountantAutoInvestEnabled, _tmpCryptoAutoInvestEnabled, _tmpLegacy, _tmpSecurity, _tmpFanSegments, _tmpWealth, _tmpWebHub, _tmpUpgradedPlatforms, _tmpAvatar, _tmpSpiritual, _tmpBanking, _tmpSentiment);
            } else {
                _result = null;
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.GameStateDao
    @NotNull
    public Flow<List<GameStateEntity>> getAllGameStates() {
        return FlowUtil.createFlow(this.__db, false, new String[]{"game_states"}, (v2) -> {
            return getAllGameStates$lambda$3(r3, r4, v2);
        });
    }

    private static final List getAllGameStates$lambda$3(String $_sql, GameStateDao_Impl this$0, SQLiteConnection _connection) {
        String _tmp_9;
        String _tmpSignedLabelId;
        String _tmpSignedLabelRole;
        String _tmpActiveGlobalEvent;
        String _tmpGlobalEventEffect;
        String _tmpActiveBrandDealName;
        String _tmpEndorsedCandidateId;
        String _tmpActiveFamilyReqNpcId;
        String _tmpActiveFamilyReqType;
        String _tmpActiveFamilyReqDetail;
        String _tmpActiveFamilyReqStatus;
        String _tmpElectionVotedCandidateId;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            int _columnIndexOfEmail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "email");
            int _columnIndexOfArtistName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "artistName");
            int _columnIndexOfIsAdmin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isAdmin");
            int _columnIndexOfCash = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cash");
            int _columnIndexOfFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fans");
            int _columnIndexOfPopularity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "popularity");
            int _columnIndexOfInfluence = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "influence");
            int _columnIndexOfVoiceSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "voiceSkill");
            int _columnIndexOfWritingSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "writingSkill");
            int _columnIndexOfBusinessSkill = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessSkill");
            int _columnIndexOfEnergy = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "energy");
            int _columnIndexOfMaxEnergy = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "maxEnergy");
            int _columnIndexOfTimeSlots = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timeSlots");
            int _columnIndexOfMaxTimeSlots = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "maxTimeSlots");
            int _columnIndexOfCurrentWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "currentWeek");
            int _columnIndexOfCurrentYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "currentYear");
            int _columnIndexOfPracticeMissedWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "practiceMissedWeeks");
            int _columnIndexOfActiveToursCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeToursCount");
            int _columnIndexOfOwnedCars = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedCars");
            int _columnIndexOfOwnedHouses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedHouses");
            int _columnIndexOfOwnedInstruments = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedInstruments");
            int _columnIndexOfSongs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "songs");
            int _columnIndexOfTours = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "tours");
            int _columnIndexOfSideJobs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sideJobs");
            int _columnIndexOfStocks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stocks");
            int _columnIndexOfCryptos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptos");
            int _columnIndexOfOwnLabel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownLabel");
            int _columnIndexOfSignedLabelId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelId");
            int _columnIndexOfSignedLabelCut = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelCut");
            int _columnIndexOfSignedLabelRole = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelRole");
            int _columnIndexOfSignedLabelLevel = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelLevel");
            int _columnIndexOfSignedLabelStartWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelStartWeek");
            int _columnIndexOfSignedLabelStartYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelStartYear");
            int _columnIndexOfSignedLabelEndWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelEndWeek");
            int _columnIndexOfSignedLabelEndYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelEndYear");
            int _columnIndexOfSignedLabelReqSingles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqSingles");
            int _columnIndexOfSignedLabelReqAlbumsLP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqAlbumsLP");
            int _columnIndexOfSignedLabelReqAlbumsEP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqAlbumsEP");
            int _columnIndexOfSignedLabelReqMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelReqMeTubeVideos");
            int _columnIndexOfSignedLabelDeliveredSingles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredSingles");
            int _columnIndexOfSignedLabelDeliveredAlbumsLP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredAlbumsLP");
            int _columnIndexOfSignedLabelDeliveredAlbumsEP = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredAlbumsEP");
            int _columnIndexOfSignedLabelDeliveredMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedLabelDeliveredMeTubeVideos");
            int _columnIndexOfMailbox = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mailbox");
            int _columnIndexOfNpcs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "npcs");
            int _columnIndexOfPurchaseRequests = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "purchaseRequests");
            int _columnIndexOfIndustryRespect = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "industryRespect");
            int _columnIndexOfPublicImage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "publicImage");
            int _columnIndexOfCriticalAcclaim = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "criticalAcclaim");
            int _columnIndexOfTrustworthiness = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "trustworthiness");
            int _columnIndexOfLegacyPoints = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "legacyPoints");
            int _columnIndexOfBusinessReputation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessReputation");
            int _columnIndexOfDiscipline = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "discipline");
            int _columnIndexOfIntegrity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "integrity");
            int _columnIndexOfGenerosity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "generosity");
            int _columnIndexOfHumility = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "humility");
            int _columnIndexOfReliability = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "reliability");
            int _columnIndexOfStress = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "stress");
            int _columnIndexOfBurnout = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "burnout");
            int _columnIndexOfCreativeInspiration = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "creativeInspiration");
            int _columnIndexOfMotivation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "motivation");
            int _columnIndexOfHappiness = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "happiness");
            int _columnIndexOfWorkLifeBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "workLifeBalance");
            int _columnIndexOfGenreTrends = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "genreTrends");
            int _columnIndexOfTimelineEvents = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "timelineEvents");
            int _columnIndexOfOwnedBusinesses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "ownedBusinesses");
            int _columnIndexOfActiveGlobalEvent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeGlobalEvent");
            int _columnIndexOfGlobalEventEffect = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "globalEventEffect");
            int _columnIndexOfMeTubeVideos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeVideos");
            int _columnIndexOfMeTubeSubscribers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeSubscribers");
            int _columnIndexOfMeTubeWatchTime = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeWatchTime");
            int _columnIndexOfMeTubeRevenue = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "meTubeRevenue");
            int _columnIndexOfActiveBrandDealName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeBrandDealName");
            int _columnIndexOfBrandDealWeeksRemaining = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealWeeksRemaining");
            int _columnIndexOfBrandDealWeeklyPayout = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealWeeklyPayout");
            int _columnIndexOfBrandDealRequiredEngagement = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealRequiredEngagement");
            int _columnIndexOfBrandDealPostedThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "brandDealPostedThisWeek");
            int _columnIndexOfChatConversations = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "chatConversations");
            int _columnIndexOfPendingChatReplies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingChatReplies");
            int _columnIndexOfCastPosts = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castPosts");
            int _columnIndexOfCastTrendingHashtags = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castTrendingHashtags");
            int _columnIndexOfCastTimeSpentThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castTimeSpentThisWeek");
            int _columnIndexOfCastPostsCountThisWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castPostsCountThisWeek");
            int _columnIndexOfCastNicheFocus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "castNicheFocus");
            int _columnIndexOfHiredEmployees = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hiredEmployees");
            int _columnIndexOfCandidateRoster = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "candidateRoster");
            int _columnIndexOfPendingStockOrders = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingStockOrders");
            int _columnIndexOfPendingCryptoOrders = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "pendingCryptoOrders");
            int _columnIndexOfWallpaperId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wallpaperId");
            int _columnIndexOfIsPhoneLocked = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isPhoneLocked");
            int _columnIndexOfNotificationLogs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "notificationLogs");
            int _columnIndexOfInsuredCars = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "insuredCars");
            int _columnIndexOfInsuredHouses = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "insuredHouses");
            int _columnIndexOfAdCompanyBudget = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "adCompanyBudget");
            int _columnIndexOfActiveAdCampaigns = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeAdCampaigns");
            int _columnIndexOfEmployeeEvents = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "employeeEvents");
            int _columnIndexOfActiveBrandDeals = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeBrandDeals");
            int _columnIndexOfNewsArticles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "newsArticles");
            int _columnIndexOfWeatherCondition = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "weatherCondition");
            int _columnIndexOfActiveNoteText = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeNoteText");
            int _columnIndexOfSavedPhotos = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savedPhotos");
            int _columnIndexOfScheduledActivities = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "scheduledActivities");
            int _columnIndexOfEconomyCycle = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "economyCycle");
            int _columnIndexOfInflationRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "inflationRate");
            int _columnIndexOfFuelPrice = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fuelPrice");
            int _columnIndexOfTouristIndex = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "touristIndex");
            int _columnIndexOfIsElectionSeason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isElectionSeason");
            int _columnIndexOfResidenceCountry = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "residenceCountry");
            int _columnIndexOfHasGlobalStreamingLicense = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasGlobalStreamingLicense");
            int _columnIndexOfAccountantAutoInvestPercent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoInvestPercent");
            int _columnIndexOfAccountantAutoSellProfitMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoSellProfitMargin");
            int _columnIndexOfCryptoAutoInvestPercent = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoInvestPercent");
            int _columnIndexOfCryptoAutoSellProfitMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoSellProfitMargin");
            int _columnIndexOfMerchStyles = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "merchStyles");
            int _columnIndexOfEndorsedCandidateId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "endorsedCandidateId");
            int _columnIndexOfPoliticalTaxModifier = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "politicalTaxModifier");
            int _columnIndexOfCityProjectWeeksRemaining = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cityProjectWeeksRemaining");
            int _columnIndexOfSoundstreamMonthlyListeners = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamMonthlyListeners");
            int _columnIndexOfSoundstreamWorldRank = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamWorldRank");
            int _columnIndexOfSoundstreamWeeklyStreams = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamWeeklyStreams");
            int _columnIndexOfSoundstreamSongs = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "soundstreamSongs");
            int _columnIndexOfActiveFamilyReqNpcId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqNpcId");
            int _columnIndexOfActiveFamilyReqAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqAmount");
            int _columnIndexOfActiveFamilyReqType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqType");
            int _columnIndexOfActiveFamilyReqDetail = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqDetail");
            int _columnIndexOfActiveFamilyReqStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeFamilyReqStatus");
            int _columnIndexOfLastFamilyReqWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastFamilyReqWeek");
            int _columnIndexOfActiveDistributionDeal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activeDistributionDeal");
            int _columnIndexOfActivePublishingDeal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "activePublishingDeal");
            int _columnIndexOfRecoupableAdvanceBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "recoupableAdvanceBalance");
            int _columnIndexOfSignedDistributionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedDistributionWeek");
            int _columnIndexOfSignedPublishingWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "signedPublishingWeek");
            int _columnIndexOfAlbums = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "albums");
            int _columnIndexOfWorldHistory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "worldHistory");
            int _columnIndexOfAccountantStopLossMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantStopLossMargin");
            int _columnIndexOfCryptoStopLossMargin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoStopLossMargin");
            int _columnIndexOfAccountantAutoInvestEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accountantAutoInvestEnabled");
            int _columnIndexOfCryptoAutoInvestEnabled = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "cryptoAutoInvestEnabled");
            int _columnIndexOfUpgradedPlatforms = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "upgradedPlatforms");
            int _columnIndexOfHasWikipediaPage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasWikipediaPage");
            int _columnIndexOfHasHallOfFame = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasHallOfFame");
            int _columnIndexOfHasMuseum = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasMuseum");
            int _columnIndexOfHasDocumentary = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasDocumentary");
            int _columnIndexOfHasBiography = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasBiography");
            int _columnIndexOfHasNetflixSeries = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasNetflixSeries");
            int _columnIndexOfHasScholarships = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasScholarships");
            int _columnIndexOfArtistsInspiredCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "artistsInspiredCount");
            int _columnIndexOfReceivedGovernorPitch = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "receivedGovernorPitch");
            int _columnIndexOfReceivedSenatorPitch = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "receivedSenatorPitch");
            int _columnIndexOfHiredSecurityCompany = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hiredSecurityCompany");
            int _columnIndexOfHasCyberInsurance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasCyberInsurance");
            int _columnIndexOfHasStudioInsurance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hasStudioInsurance");
            int _columnIndexOfCasualFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "casualFans");
            int _columnIndexOfHardcoreFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "hardcoreFans");
            int _columnIndexOfCollectors = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "collectors");
            int _columnIndexOfConcertGoers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "concertGoers");
            int _columnIndexOfInternationalFans = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "internationalFans");
            int _columnIndexOfOnlineCommunity = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "onlineCommunity");
            int _columnIndexOfFansPersonalityLovers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansPersonalityLovers");
            int _columnIndexOfFansLyricsLovers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansLyricsLovers");
            int _columnIndexOfFansVoicePurists = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansVoicePurists");
            int _columnIndexOfFansFashionistas = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansFashionistas");
            int _columnIndexOfFansControversySeekers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansControversySeekers");
            int _columnIndexOfFansBusinessAdmirers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansBusinessAdmirers");
            int _columnIndexOfFansCharityBelievers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "fansCharityBelievers");
            int _columnIndexOfEmergencyFundBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "emergencyFundBalance");
            int _columnIndexOfPayrollReserve = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "payrollReserve");
            int _columnIndexOfBusinessReserve = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "businessReserve");
            int _columnIndexOfBondsBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "bondsBalance");
            int _columnIndexOfBondsInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "bondsInterestRate");
            int _columnIndexOfFinancialReviewLog = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "financialReviewLog");
            int _columnIndexOfLastReviewWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReviewWeek");
            int _columnIndexOfLastReviewYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastReviewYear");
            int _columnIndexOfFinancialHistoryCashFlow = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "financialHistoryCashFlow");
            int _columnIndexOfSmmPostCategory = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "smmPostCategory");
            int _columnIndexOfSmmAutoPost = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "smmAutoPost");
            int _columnIndexOfWgtApplied = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtApplied");
            int _columnIndexOfWgtAuditionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtAuditionWeek");
            int _columnIndexOfWgtAuditionYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtAuditionYear");
            int _columnIndexOfWgtCompletedCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtCompletedCount");
            int _columnIndexOfWgtWon = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtWon");
            int _columnIndexOfIsSccWanted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "isSccWanted");
            int _columnIndexOfSccCrimeReason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sccCrimeReason");
            int _columnIndexOfSccFineAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "sccFineAmount");
            int _columnIndexOfBlackHatPurchasesCount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "blackHatPurchasesCount");
            int _columnIndexOfElectionVotedCandidateId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedCandidateId");
            int _columnIndexOfElectionVotedWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedWeek");
            int _columnIndexOfElectionVotedYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "electionVotedYear");
            int _columnIndexOfGrandAwardNominated = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardNominated");
            int _columnIndexOfGrandAwardWon = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardWon");
            int _columnIndexOfGrandAwardVipAccess = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "grandAwardVipAccess");
            int _columnIndexOfLastDemoSubmissionWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "lastDemoSubmissionWeek");
            int _columnIndexOfLabelContractObligations = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "labelContractObligations");
            int _columnIndexOfWgtSeason = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSeason");
            int _columnIndexOfWgtSeasonYear = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSeasonYear");
            int _columnIndexOfWgtSemiFinalsWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtSemiFinalsWeek");
            int _columnIndexOfWgtGrandFinaleWeek = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtGrandFinaleWeek");
            int _columnIndexOfWgtRegistrationStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtRegistrationStatus");
            int _columnIndexOfWgtLastWinner = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtLastWinner");
            int _columnIndexOfWgtContestants = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "wgtContestants");
            int _columnIndexOfAvatarBaseLook = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarBaseLook");
            int _columnIndexOfAvatarSkinTone = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarSkinTone");
            int _columnIndexOfAvatarHairStyleId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarHairStyleId");
            int _columnIndexOfAvatarClothingId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarClothingId");
            int _columnIndexOfAvatarJewelryId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarJewelryId");
            int _columnIndexOfAvatarOwnedItemIds = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "avatarOwnedItemIds");
            int _columnIndexOfSpiritualPrayerSetting = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualPrayerSetting");
            int _columnIndexOfSpiritualTitheSetting = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTitheSetting");
            int _columnIndexOfSpiritualTotalTithesPaid = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTotalTithesPaid");
            int _columnIndexOfSpiritualTitheReminderActive = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualTitheReminderActive");
            int _columnIndexOfSpiritualJournal = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "spiritualJournal");
            int _columnIndexOfSavingsBalance = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savingsBalance");
            int _columnIndexOfLoanAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "loanAmount");
            int _columnIndexOfAccumulatedLoanInterest = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "accumulatedLoanInterest");
            int _columnIndexOfTaxDebt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "taxDebt");
            int _columnIndexOfTitheDebt = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "titheDebt");
            int _columnIndexOfSavingsInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "savingsInterestRate");
            int _columnIndexOfLoanInterestRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "loanInterestRate");
            int _columnIndexOfMortgageAmount = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mortgageAmount");
            int _columnIndexOfConsecutiveUnpaidTaxWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "consecutiveUnpaidTaxWeeks");
            int _columnIndexOfConsecutiveUnpaidTitheWeeks = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "consecutiveUnpaidTitheWeeks");
            int _columnIndexOfTaxRate = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "taxRate");
            int _columnIndexOfPositiveSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "positiveSentiment");
            int _columnIndexOfNegativeSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "negativeSentiment");
            int _columnIndexOfNeutralSentiment = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "neutralSentiment");
            int _columnIndexOfConversationVolume = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "conversationVolume");
            int _columnIndexOfTrendingScore = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "trendingScore");
            int _columnIndexOfMediaAttention = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "mediaAttention");
            int _columnIndexOfIndustryFollowers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "industryFollowers");
            int _columnIndexOfFollowers = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "followers");
            List _result = new ArrayList();
            while (_stmt.step()) {
                String _tmpEmail = _stmt.getText(_columnIndexOfEmail);
                String _tmpArtistName = _stmt.getText(_columnIndexOfArtistName);
                int _tmp = (int) _stmt.getLong(_columnIndexOfIsAdmin);
                boolean _tmpIsAdmin = _tmp != 0;
                double _tmpCash = _stmt.getDouble(_columnIndexOfCash);
                long _tmpFans = _stmt.getLong(_columnIndexOfFans);
                float _tmpPopularity = (float) _stmt.getDouble(_columnIndexOfPopularity);
                float _tmpInfluence = (float) _stmt.getDouble(_columnIndexOfInfluence);
                float _tmpVoiceSkill = (float) _stmt.getDouble(_columnIndexOfVoiceSkill);
                float _tmpWritingSkill = (float) _stmt.getDouble(_columnIndexOfWritingSkill);
                float _tmpBusinessSkill = (float) _stmt.getDouble(_columnIndexOfBusinessSkill);
                int _tmpEnergy = (int) _stmt.getLong(_columnIndexOfEnergy);
                int _tmpMaxEnergy = (int) _stmt.getLong(_columnIndexOfMaxEnergy);
                int _tmpTimeSlots = (int) _stmt.getLong(_columnIndexOfTimeSlots);
                int _tmpMaxTimeSlots = (int) _stmt.getLong(_columnIndexOfMaxTimeSlots);
                int _tmpCurrentWeek = (int) _stmt.getLong(_columnIndexOfCurrentWeek);
                int _tmpCurrentYear = (int) _stmt.getLong(_columnIndexOfCurrentYear);
                int _tmpPracticeMissedWeeks = (int) _stmt.getLong(_columnIndexOfPracticeMissedWeeks);
                int _tmpActiveToursCount = (int) _stmt.getLong(_columnIndexOfActiveToursCount);
                String _tmp_1 = _stmt.getText(_columnIndexOfOwnedCars);
                List _tmpOwnedCars = this$0.__converters.toCarList(_tmp_1);
                String _tmp_2 = _stmt.getText(_columnIndexOfOwnedHouses);
                List _tmpOwnedHouses = this$0.__converters.toHouseList(_tmp_2);
                String _tmp_3 = _stmt.getText(_columnIndexOfOwnedInstruments);
                List _tmpOwnedInstruments = this$0.__converters.toInstrumentList(_tmp_3);
                String _tmp_4 = _stmt.getText(_columnIndexOfSongs);
                List _tmpSongs = this$0.__converters.toSongList(_tmp_4);
                String _tmp_5 = _stmt.getText(_columnIndexOfTours);
                List _tmpTours = this$0.__converters.toTourList(_tmp_5);
                String _tmp_6 = _stmt.getText(_columnIndexOfSideJobs);
                List _tmpSideJobs = this$0.__converters.toSideJobList(_tmp_6);
                String _tmp_7 = _stmt.getText(_columnIndexOfStocks);
                List _tmpStocks = this$0.__converters.toStockList(_tmp_7);
                String _tmp_8 = _stmt.getText(_columnIndexOfCryptos);
                List _tmpCryptos = this$0.__converters.toCryptoList(_tmp_8);
                if (_stmt.isNull(_columnIndexOfOwnLabel)) {
                    _tmp_9 = null;
                } else {
                    _tmp_9 = _stmt.getText(_columnIndexOfOwnLabel);
                }
                OwnRecordLabel _tmpOwnLabel = this$0.__converters.toOwnRecordLabel(_tmp_9);
                if (_stmt.isNull(_columnIndexOfSignedLabelId)) {
                    _tmpSignedLabelId = null;
                } else {
                    _tmpSignedLabelId = _stmt.getText(_columnIndexOfSignedLabelId);
                }
                float _tmpSignedLabelCut = (float) _stmt.getDouble(_columnIndexOfSignedLabelCut);
                if (_stmt.isNull(_columnIndexOfSignedLabelRole)) {
                    _tmpSignedLabelRole = null;
                } else {
                    _tmpSignedLabelRole = _stmt.getText(_columnIndexOfSignedLabelRole);
                }
                int _tmpSignedLabelLevel = (int) _stmt.getLong(_columnIndexOfSignedLabelLevel);
                int _tmpSignedLabelStartWeek = (int) _stmt.getLong(_columnIndexOfSignedLabelStartWeek);
                int _tmpSignedLabelStartYear = (int) _stmt.getLong(_columnIndexOfSignedLabelStartYear);
                int _tmpSignedLabelEndWeek = (int) _stmt.getLong(_columnIndexOfSignedLabelEndWeek);
                int _tmpSignedLabelEndYear = (int) _stmt.getLong(_columnIndexOfSignedLabelEndYear);
                int _tmpSignedLabelReqSingles = (int) _stmt.getLong(_columnIndexOfSignedLabelReqSingles);
                int _tmpSignedLabelReqAlbumsLP = (int) _stmt.getLong(_columnIndexOfSignedLabelReqAlbumsLP);
                int _tmpSignedLabelReqAlbumsEP = (int) _stmt.getLong(_columnIndexOfSignedLabelReqAlbumsEP);
                int _tmpSignedLabelReqMeTubeVideos = (int) _stmt.getLong(_columnIndexOfSignedLabelReqMeTubeVideos);
                int _tmpSignedLabelDeliveredSingles = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredSingles);
                int _tmpSignedLabelDeliveredAlbumsLP = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredAlbumsLP);
                int _tmpSignedLabelDeliveredAlbumsEP = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredAlbumsEP);
                int _tmpSignedLabelDeliveredMeTubeVideos = (int) _stmt.getLong(_columnIndexOfSignedLabelDeliveredMeTubeVideos);
                String _tmp_10 = _stmt.getText(_columnIndexOfMailbox);
                List _tmpMailbox = this$0.__converters.toMailMessageList(_tmp_10);
                String _tmp_11 = _stmt.getText(_columnIndexOfNpcs);
                List _tmpNpcs = this$0.__converters.toNPCEntityList(_tmp_11);
                String _tmp_12 = _stmt.getText(_columnIndexOfPurchaseRequests);
                List _tmpPurchaseRequests = this$0.__converters.toPurchaseRequestList(_tmp_12);
                float _tmpIndustryRespect = (float) _stmt.getDouble(_columnIndexOfIndustryRespect);
                float _tmpPublicImage = (float) _stmt.getDouble(_columnIndexOfPublicImage);
                float _tmpCriticalAcclaim = (float) _stmt.getDouble(_columnIndexOfCriticalAcclaim);
                float _tmpTrustworthiness = (float) _stmt.getDouble(_columnIndexOfTrustworthiness);
                long _tmpLegacyPoints = _stmt.getLong(_columnIndexOfLegacyPoints);
                float _tmpBusinessReputation = (float) _stmt.getDouble(_columnIndexOfBusinessReputation);
                float _tmpDiscipline = (float) _stmt.getDouble(_columnIndexOfDiscipline);
                float _tmpIntegrity = (float) _stmt.getDouble(_columnIndexOfIntegrity);
                float _tmpGenerosity = (float) _stmt.getDouble(_columnIndexOfGenerosity);
                float _tmpHumility = (float) _stmt.getDouble(_columnIndexOfHumility);
                float _tmpReliability = (float) _stmt.getDouble(_columnIndexOfReliability);
                float _tmpStress = (float) _stmt.getDouble(_columnIndexOfStress);
                float _tmpBurnout = (float) _stmt.getDouble(_columnIndexOfBurnout);
                float _tmpCreativeInspiration = (float) _stmt.getDouble(_columnIndexOfCreativeInspiration);
                float _tmpMotivation = (float) _stmt.getDouble(_columnIndexOfMotivation);
                float _tmpHappiness = (float) _stmt.getDouble(_columnIndexOfHappiness);
                float _tmpWorkLifeBalance = (float) _stmt.getDouble(_columnIndexOfWorkLifeBalance);
                String _tmp_13 = _stmt.getText(_columnIndexOfGenreTrends);
                Map _tmpGenreTrends = this$0.__converters.toStringMap(_tmp_13);
                String _tmp_14 = _stmt.getText(_columnIndexOfTimelineEvents);
                List _tmpTimelineEvents = this$0.__converters.toStringList(_tmp_14);
                String _tmp_15 = _stmt.getText(_columnIndexOfOwnedBusinesses);
                List _tmpOwnedBusinesses = this$0.__converters.toBusinessAssetList(_tmp_15);
                if (_stmt.isNull(_columnIndexOfActiveGlobalEvent)) {
                    _tmpActiveGlobalEvent = null;
                } else {
                    _tmpActiveGlobalEvent = _stmt.getText(_columnIndexOfActiveGlobalEvent);
                }
                if (_stmt.isNull(_columnIndexOfGlobalEventEffect)) {
                    _tmpGlobalEventEffect = null;
                } else {
                    _tmpGlobalEventEffect = _stmt.getText(_columnIndexOfGlobalEventEffect);
                }
                String _tmp_16 = _stmt.getText(_columnIndexOfMeTubeVideos);
                List _tmpMeTubeVideos = this$0.__converters.toMeTubeVideoList(_tmp_16);
                long _tmpMeTubeSubscribers = _stmt.getLong(_columnIndexOfMeTubeSubscribers);
                double _tmpMeTubeWatchTime = _stmt.getDouble(_columnIndexOfMeTubeWatchTime);
                double _tmpMeTubeRevenue = _stmt.getDouble(_columnIndexOfMeTubeRevenue);
                if (_stmt.isNull(_columnIndexOfActiveBrandDealName)) {
                    _tmpActiveBrandDealName = null;
                } else {
                    _tmpActiveBrandDealName = _stmt.getText(_columnIndexOfActiveBrandDealName);
                }
                int _tmpBrandDealWeeksRemaining = (int) _stmt.getLong(_columnIndexOfBrandDealWeeksRemaining);
                double _tmpBrandDealWeeklyPayout = _stmt.getDouble(_columnIndexOfBrandDealWeeklyPayout);
                long _tmpBrandDealRequiredEngagement = _stmt.getLong(_columnIndexOfBrandDealRequiredEngagement);
                int _tmp_17 = (int) _stmt.getLong(_columnIndexOfBrandDealPostedThisWeek);
                boolean _tmpBrandDealPostedThisWeek = _tmp_17 != 0;
                String _tmp_18 = _stmt.getText(_columnIndexOfChatConversations);
                List _tmpChatConversations = this$0.__converters.toChatConversationList(_tmp_18);
                String _tmp_19 = _stmt.getText(_columnIndexOfPendingChatReplies);
                List _tmpPendingChatReplies = this$0.__converters.toPendingChatReplyList(_tmp_19);
                String _tmp_20 = _stmt.getText(_columnIndexOfCastPosts);
                List _tmpCastPosts = this$0.__converters.toCastPostList(_tmp_20);
                String _tmp_21 = _stmt.getText(_columnIndexOfCastTrendingHashtags);
                List _tmpCastTrendingHashtags = this$0.__converters.toStringList(_tmp_21);
                int _tmpCastTimeSpentThisWeek = (int) _stmt.getLong(_columnIndexOfCastTimeSpentThisWeek);
                int _tmpCastPostsCountThisWeek = (int) _stmt.getLong(_columnIndexOfCastPostsCountThisWeek);
                String _tmpCastNicheFocus = _stmt.getText(_columnIndexOfCastNicheFocus);
                String _tmp_22 = _stmt.getText(_columnIndexOfHiredEmployees);
                List _tmpHiredEmployees = this$0.__converters.toEmployeeList(_tmp_22);
                String _tmp_23 = _stmt.getText(_columnIndexOfCandidateRoster);
                List _tmpCandidateRoster = this$0.__converters.toEmployeeList(_tmp_23);
                String _tmp_24 = _stmt.getText(_columnIndexOfPendingStockOrders);
                List _tmpPendingStockOrders = this$0.__converters.toStockOrderList(_tmp_24);
                String _tmp_25 = _stmt.getText(_columnIndexOfPendingCryptoOrders);
                List _tmpPendingCryptoOrders = this$0.__converters.toCryptoOrderList(_tmp_25);
                String _tmpWallpaperId = _stmt.getText(_columnIndexOfWallpaperId);
                int _tmp_26 = (int) _stmt.getLong(_columnIndexOfIsPhoneLocked);
                boolean _tmpIsPhoneLocked = _tmp_26 != 0;
                String _tmp_27 = _stmt.getText(_columnIndexOfNotificationLogs);
                List _tmpNotificationLogs = this$0.__converters.toStringList(_tmp_27);
                String _tmp_28 = _stmt.getText(_columnIndexOfInsuredCars);
                List _tmpInsuredCars = this$0.__converters.toStringList(_tmp_28);
                String _tmp_29 = _stmt.getText(_columnIndexOfInsuredHouses);
                List _tmpInsuredHouses = this$0.__converters.toStringList(_tmp_29);
                double _tmpAdCompanyBudget = _stmt.getDouble(_columnIndexOfAdCompanyBudget);
                String _tmp_30 = _stmt.getText(_columnIndexOfActiveAdCampaigns);
                List _tmpActiveAdCampaigns = this$0.__converters.toAdCampaignList(_tmp_30);
                String _tmp_31 = _stmt.getText(_columnIndexOfEmployeeEvents);
                List _tmpEmployeeEvents = this$0.__converters.toStringList(_tmp_31);
                String _tmp_32 = _stmt.getText(_columnIndexOfActiveBrandDeals);
                List _tmpActiveBrandDeals = this$0.__converters.toBrandDealList(_tmp_32);
                String _tmp_33 = _stmt.getText(_columnIndexOfNewsArticles);
                List _tmpNewsArticles = this$0.__converters.toNewsArticleList(_tmp_33);
                String _tmpWeatherCondition = _stmt.getText(_columnIndexOfWeatherCondition);
                String _tmpActiveNoteText = _stmt.getText(_columnIndexOfActiveNoteText);
                String _tmp_34 = _stmt.getText(_columnIndexOfSavedPhotos);
                List _tmpSavedPhotos = this$0.__converters.toStringList(_tmp_34);
                String _tmp_35 = _stmt.getText(_columnIndexOfScheduledActivities);
                List _tmpScheduledActivities = this$0.__converters.toStringList(_tmp_35);
                String _tmpEconomyCycle = _stmt.getText(_columnIndexOfEconomyCycle);
                float _tmpInflationRate = (float) _stmt.getDouble(_columnIndexOfInflationRate);
                float _tmpFuelPrice = (float) _stmt.getDouble(_columnIndexOfFuelPrice);
                int _tmpTouristIndex = (int) _stmt.getLong(_columnIndexOfTouristIndex);
                int _tmp_36 = (int) _stmt.getLong(_columnIndexOfIsElectionSeason);
                boolean _tmpIsElectionSeason = _tmp_36 != 0;
                String _tmpResidenceCountry = _stmt.getText(_columnIndexOfResidenceCountry);
                int _tmp_37 = (int) _stmt.getLong(_columnIndexOfHasGlobalStreamingLicense);
                boolean _tmpHasGlobalStreamingLicense = _tmp_37 != 0;
                float _tmpAccountantAutoInvestPercent = (float) _stmt.getDouble(_columnIndexOfAccountantAutoInvestPercent);
                float _tmpAccountantAutoSellProfitMargin = (float) _stmt.getDouble(_columnIndexOfAccountantAutoSellProfitMargin);
                float _tmpCryptoAutoInvestPercent = (float) _stmt.getDouble(_columnIndexOfCryptoAutoInvestPercent);
                float _tmpCryptoAutoSellProfitMargin = (float) _stmt.getDouble(_columnIndexOfCryptoAutoSellProfitMargin);
                String _tmp_38 = _stmt.getText(_columnIndexOfMerchStyles);
                List _tmpMerchStyles = this$0.__converters.toMerchStyleList(_tmp_38);
                if (_stmt.isNull(_columnIndexOfEndorsedCandidateId)) {
                    _tmpEndorsedCandidateId = null;
                } else {
                    _tmpEndorsedCandidateId = _stmt.getText(_columnIndexOfEndorsedCandidateId);
                }
                float _tmpPoliticalTaxModifier = (float) _stmt.getDouble(_columnIndexOfPoliticalTaxModifier);
                int _tmpCityProjectWeeksRemaining = (int) _stmt.getLong(_columnIndexOfCityProjectWeeksRemaining);
                long _tmpSoundstreamMonthlyListeners = _stmt.getLong(_columnIndexOfSoundstreamMonthlyListeners);
                int _tmpSoundstreamWorldRank = (int) _stmt.getLong(_columnIndexOfSoundstreamWorldRank);
                long _tmpSoundstreamWeeklyStreams = _stmt.getLong(_columnIndexOfSoundstreamWeeklyStreams);
                String _tmp_39 = _stmt.getText(_columnIndexOfSoundstreamSongs);
                List _tmpSoundstreamSongs = this$0.__converters.toChartSongList(_tmp_39);
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqNpcId)) {
                    _tmpActiveFamilyReqNpcId = null;
                } else {
                    _tmpActiveFamilyReqNpcId = _stmt.getText(_columnIndexOfActiveFamilyReqNpcId);
                }
                double _tmpActiveFamilyReqAmount = _stmt.getDouble(_columnIndexOfActiveFamilyReqAmount);
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqType)) {
                    _tmpActiveFamilyReqType = null;
                } else {
                    _tmpActiveFamilyReqType = _stmt.getText(_columnIndexOfActiveFamilyReqType);
                }
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqDetail)) {
                    _tmpActiveFamilyReqDetail = null;
                } else {
                    _tmpActiveFamilyReqDetail = _stmt.getText(_columnIndexOfActiveFamilyReqDetail);
                }
                if (_stmt.isNull(_columnIndexOfActiveFamilyReqStatus)) {
                    _tmpActiveFamilyReqStatus = null;
                } else {
                    _tmpActiveFamilyReqStatus = _stmt.getText(_columnIndexOfActiveFamilyReqStatus);
                }
                int _tmpLastFamilyReqWeek = (int) _stmt.getLong(_columnIndexOfLastFamilyReqWeek);
                String _tmpActiveDistributionDeal = _stmt.getText(_columnIndexOfActiveDistributionDeal);
                String _tmpActivePublishingDeal = _stmt.getText(_columnIndexOfActivePublishingDeal);
                double _tmpRecoupableAdvanceBalance = _stmt.getDouble(_columnIndexOfRecoupableAdvanceBalance);
                int _tmpSignedDistributionWeek = (int) _stmt.getLong(_columnIndexOfSignedDistributionWeek);
                int _tmpSignedPublishingWeek = (int) _stmt.getLong(_columnIndexOfSignedPublishingWeek);
                String _tmp_40 = _stmt.getText(_columnIndexOfAlbums);
                List _tmpAlbums = this$0.__converters.toAlbumList(_tmp_40);
                String _tmp_41 = _stmt.getText(_columnIndexOfWorldHistory);
                List _tmpWorldHistory = this$0.__converters.toWorldHistoryEntryList(_tmp_41);
                float _tmpAccountantStopLossMargin = (float) _stmt.getDouble(_columnIndexOfAccountantStopLossMargin);
                float _tmpCryptoStopLossMargin = (float) _stmt.getDouble(_columnIndexOfCryptoStopLossMargin);
                int _tmp_42 = (int) _stmt.getLong(_columnIndexOfAccountantAutoInvestEnabled);
                boolean _tmpAccountantAutoInvestEnabled = _tmp_42 != 0;
                int _tmp_43 = (int) _stmt.getLong(_columnIndexOfCryptoAutoInvestEnabled);
                boolean _tmpCryptoAutoInvestEnabled = _tmp_43 != 0;
                String _tmp_44 = _stmt.getText(_columnIndexOfUpgradedPlatforms);
                Set _tmpUpgradedPlatforms = this$0.__converters.toStringSet(_tmp_44);
                int _tmp_45 = (int) _stmt.getLong(_columnIndexOfHasWikipediaPage);
                boolean _tmpHasWikipediaPage = _tmp_45 != 0;
                int _tmp_46 = (int) _stmt.getLong(_columnIndexOfHasHallOfFame);
                boolean _tmpHasHallOfFame = _tmp_46 != 0;
                int _tmp_47 = (int) _stmt.getLong(_columnIndexOfHasMuseum);
                boolean _tmpHasMuseum = _tmp_47 != 0;
                int _tmp_48 = (int) _stmt.getLong(_columnIndexOfHasDocumentary);
                boolean _tmpHasDocumentary = _tmp_48 != 0;
                int _tmp_49 = (int) _stmt.getLong(_columnIndexOfHasBiography);
                boolean _tmpHasBiography = _tmp_49 != 0;
                int _tmp_50 = (int) _stmt.getLong(_columnIndexOfHasNetflixSeries);
                boolean _tmpHasNetflixSeries = _tmp_50 != 0;
                int _tmp_51 = (int) _stmt.getLong(_columnIndexOfHasScholarships);
                boolean _tmpHasScholarships = _tmp_51 != 0;
                int _tmpArtistsInspiredCount = (int) _stmt.getLong(_columnIndexOfArtistsInspiredCount);
                int _tmp_52 = (int) _stmt.getLong(_columnIndexOfReceivedGovernorPitch);
                boolean _tmpReceivedGovernorPitch = _tmp_52 != 0;
                int _tmp_53 = (int) _stmt.getLong(_columnIndexOfReceivedSenatorPitch);
                boolean _tmpReceivedSenatorPitch = _tmp_53 != 0;
                LegacyMilestones _tmpLegacy = new LegacyMilestones(_tmpHasWikipediaPage, _tmpHasHallOfFame, _tmpHasMuseum, _tmpHasDocumentary, _tmpHasBiography, _tmpHasNetflixSeries, _tmpHasScholarships, _tmpArtistsInspiredCount, _tmpReceivedGovernorPitch, _tmpReceivedSenatorPitch);
                String _tmpHiredSecurityCompany = _stmt.getText(_columnIndexOfHiredSecurityCompany);
                int _tmp_54 = (int) _stmt.getLong(_columnIndexOfHasCyberInsurance);
                boolean _tmpHasCyberInsurance = _tmp_54 != 0;
                int _tmp_55 = (int) _stmt.getLong(_columnIndexOfHasStudioInsurance);
                boolean _tmpHasStudioInsurance = _tmp_55 != 0;
                SecurityCyberState _tmpSecurity = new SecurityCyberState(_tmpHiredSecurityCompany, _tmpHasCyberInsurance, _tmpHasStudioInsurance);
                long _tmpCasualFans = _stmt.getLong(_columnIndexOfCasualFans);
                long _tmpHardcoreFans = _stmt.getLong(_columnIndexOfHardcoreFans);
                long _tmpCollectors = _stmt.getLong(_columnIndexOfCollectors);
                long _tmpConcertGoers = _stmt.getLong(_columnIndexOfConcertGoers);
                long _tmpInternationalFans = _stmt.getLong(_columnIndexOfInternationalFans);
                long _tmpOnlineCommunity = _stmt.getLong(_columnIndexOfOnlineCommunity);
                long _tmpFansPersonalityLovers = _stmt.getLong(_columnIndexOfFansPersonalityLovers);
                long _tmpFansLyricsLovers = _stmt.getLong(_columnIndexOfFansLyricsLovers);
                long _tmpFansVoicePurists = _stmt.getLong(_columnIndexOfFansVoicePurists);
                long _tmpFansFashionistas = _stmt.getLong(_columnIndexOfFansFashionistas);
                long _tmpFansControversySeekers = _stmt.getLong(_columnIndexOfFansControversySeekers);
                long _tmpFansBusinessAdmirers = _stmt.getLong(_columnIndexOfFansBusinessAdmirers);
                long _tmpFansCharityBelievers = _stmt.getLong(_columnIndexOfFansCharityBelievers);
                FanSegmentsState _tmpFanSegments = new FanSegmentsState(_tmpCasualFans, _tmpHardcoreFans, _tmpCollectors, _tmpConcertGoers, _tmpInternationalFans, _tmpOnlineCommunity, _tmpFansPersonalityLovers, _tmpFansLyricsLovers, _tmpFansVoicePurists, _tmpFansFashionistas, _tmpFansControversySeekers, _tmpFansBusinessAdmirers, _tmpFansCharityBelievers);
                double _tmpEmergencyFundBalance = _stmt.getDouble(_columnIndexOfEmergencyFundBalance);
                double _tmpPayrollReserve = _stmt.getDouble(_columnIndexOfPayrollReserve);
                double _tmpBusinessReserve = _stmt.getDouble(_columnIndexOfBusinessReserve);
                double _tmpBondsBalance = _stmt.getDouble(_columnIndexOfBondsBalance);
                float _tmpBondsInterestRate = (float) _stmt.getDouble(_columnIndexOfBondsInterestRate);
                String _tmp_56 = _stmt.getText(_columnIndexOfFinancialReviewLog);
                List _tmpFinancialReviewLog = this$0.__converters.toStringList(_tmp_56);
                int _tmpLastReviewWeek = (int) _stmt.getLong(_columnIndexOfLastReviewWeek);
                int _tmpLastReviewYear = (int) _stmt.getLong(_columnIndexOfLastReviewYear);
                String _tmp_57 = _stmt.getText(_columnIndexOfFinancialHistoryCashFlow);
                List _tmpFinancialHistoryCashFlow = this$0.__converters.toStringList(_tmp_57);
                String _tmpSmmPostCategory = _stmt.getText(_columnIndexOfSmmPostCategory);
                int _tmp_58 = (int) _stmt.getLong(_columnIndexOfSmmAutoPost);
                boolean _tmpSmmAutoPost = _tmp_58 != 0;
                WealthEngineState _tmpWealth = new WealthEngineState(_tmpEmergencyFundBalance, _tmpPayrollReserve, _tmpBusinessReserve, _tmpBondsBalance, _tmpBondsInterestRate, _tmpFinancialReviewLog, _tmpLastReviewWeek, _tmpLastReviewYear, _tmpFinancialHistoryCashFlow, _tmpSmmPostCategory, _tmpSmmAutoPost);
                int _tmp_59 = (int) _stmt.getLong(_columnIndexOfWgtApplied);
                boolean _tmpWgtApplied = _tmp_59 != 0;
                int _tmpWgtAuditionWeek = (int) _stmt.getLong(_columnIndexOfWgtAuditionWeek);
                int _tmpWgtAuditionYear = (int) _stmt.getLong(_columnIndexOfWgtAuditionYear);
                int _tmpWgtCompletedCount = (int) _stmt.getLong(_columnIndexOfWgtCompletedCount);
                int _tmp_60 = (int) _stmt.getLong(_columnIndexOfWgtWon);
                boolean _tmpWgtWon = _tmp_60 != 0;
                int _tmp_61 = (int) _stmt.getLong(_columnIndexOfIsSccWanted);
                boolean _tmpIsSccWanted = _tmp_61 != 0;
                String _tmpSccCrimeReason = _stmt.getText(_columnIndexOfSccCrimeReason);
                double _tmpSccFineAmount = _stmt.getDouble(_columnIndexOfSccFineAmount);
                int _tmpBlackHatPurchasesCount = (int) _stmt.getLong(_columnIndexOfBlackHatPurchasesCount);
                if (_stmt.isNull(_columnIndexOfElectionVotedCandidateId)) {
                    _tmpElectionVotedCandidateId = null;
                } else {
                    _tmpElectionVotedCandidateId = _stmt.getText(_columnIndexOfElectionVotedCandidateId);
                }
                int _tmpElectionVotedWeek = (int) _stmt.getLong(_columnIndexOfElectionVotedWeek);
                int _tmpElectionVotedYear = (int) _stmt.getLong(_columnIndexOfElectionVotedYear);
                int _tmp_62 = (int) _stmt.getLong(_columnIndexOfGrandAwardNominated);
                boolean _tmpGrandAwardNominated = _tmp_62 != 0;
                int _tmp_63 = (int) _stmt.getLong(_columnIndexOfGrandAwardWon);
                boolean _tmpGrandAwardWon = _tmp_63 != 0;
                int _tmp_64 = (int) _stmt.getLong(_columnIndexOfGrandAwardVipAccess);
                boolean _tmpGrandAwardVipAccess = _tmp_64 != 0;
                int _tmpLastDemoSubmissionWeek = (int) _stmt.getLong(_columnIndexOfLastDemoSubmissionWeek);
                String _tmpLabelContractObligations = _stmt.getText(_columnIndexOfLabelContractObligations);
                int _tmpWgtSeason = (int) _stmt.getLong(_columnIndexOfWgtSeason);
                int _tmpWgtSeasonYear = (int) _stmt.getLong(_columnIndexOfWgtSeasonYear);
                int _tmpWgtSemiFinalsWeek = (int) _stmt.getLong(_columnIndexOfWgtSemiFinalsWeek);
                int _tmpWgtGrandFinaleWeek = (int) _stmt.getLong(_columnIndexOfWgtGrandFinaleWeek);
                String _tmpWgtRegistrationStatus = _stmt.getText(_columnIndexOfWgtRegistrationStatus);
                String _tmpWgtLastWinner = _stmt.getText(_columnIndexOfWgtLastWinner);
                String _tmp_65 = _stmt.getText(_columnIndexOfWgtContestants);
                List _tmpWgtContestants = this$0.__converters.toStringList(_tmp_65);
                WebHubState _tmpWebHub = new WebHubState(_tmpWgtApplied, _tmpWgtAuditionWeek, _tmpWgtAuditionYear, _tmpWgtCompletedCount, _tmpWgtWon, _tmpIsSccWanted, _tmpSccCrimeReason, _tmpSccFineAmount, _tmpBlackHatPurchasesCount, _tmpElectionVotedCandidateId, _tmpElectionVotedWeek, _tmpElectionVotedYear, _tmpGrandAwardNominated, _tmpGrandAwardWon, _tmpGrandAwardVipAccess, _tmpLastDemoSubmissionWeek, _tmpLabelContractObligations, _tmpWgtSeason, _tmpWgtSeasonYear, _tmpWgtSemiFinalsWeek, _tmpWgtGrandFinaleWeek, _tmpWgtRegistrationStatus, _tmpWgtLastWinner, _tmpWgtContestants);
                String _tmpAvatarBaseLook = _stmt.getText(_columnIndexOfAvatarBaseLook);
                String _tmpAvatarSkinTone = _stmt.getText(_columnIndexOfAvatarSkinTone);
                String _tmpAvatarHairStyleId = _stmt.getText(_columnIndexOfAvatarHairStyleId);
                String _tmpAvatarClothingId = _stmt.getText(_columnIndexOfAvatarClothingId);
                String _tmpAvatarJewelryId = _stmt.getText(_columnIndexOfAvatarJewelryId);
                String _tmp_66 = _stmt.getText(_columnIndexOfAvatarOwnedItemIds);
                List _tmpAvatarOwnedItemIds = this$0.__converters.toStringList(_tmp_66);
                AvatarState _tmpAvatar = new AvatarState(_tmpAvatarBaseLook, _tmpAvatarSkinTone, _tmpAvatarHairStyleId, _tmpAvatarClothingId, _tmpAvatarJewelryId, _tmpAvatarOwnedItemIds);
                int _tmp_67 = (int) _stmt.getLong(_columnIndexOfSpiritualPrayerSetting);
                boolean _tmpSpiritualPrayerSetting = _tmp_67 != 0;
                int _tmp_68 = (int) _stmt.getLong(_columnIndexOfSpiritualTitheSetting);
                boolean _tmpSpiritualTitheSetting = _tmp_68 != 0;
                double _tmpSpiritualTotalTithesPaid = _stmt.getDouble(_columnIndexOfSpiritualTotalTithesPaid);
                int _tmp_69 = (int) _stmt.getLong(_columnIndexOfSpiritualTitheReminderActive);
                boolean _tmpSpiritualTitheReminderActive = _tmp_69 != 0;
                String _tmp_70 = _stmt.getText(_columnIndexOfSpiritualJournal);
                List _tmpSpiritualJournal = this$0.__converters.toStringList(_tmp_70);
                SpiritualState _tmpSpiritual = new SpiritualState(_tmpSpiritualPrayerSetting, _tmpSpiritualTitheSetting, _tmpSpiritualTotalTithesPaid, _tmpSpiritualTitheReminderActive, _tmpSpiritualJournal);
                double _tmpSavingsBalance = _stmt.getDouble(_columnIndexOfSavingsBalance);
                double _tmpLoanAmount = _stmt.getDouble(_columnIndexOfLoanAmount);
                double _tmpAccumulatedLoanInterest = _stmt.getDouble(_columnIndexOfAccumulatedLoanInterest);
                double _tmpTaxDebt = _stmt.getDouble(_columnIndexOfTaxDebt);
                double _tmpTitheDebt = _stmt.getDouble(_columnIndexOfTitheDebt);
                float _tmpSavingsInterestRate = (float) _stmt.getDouble(_columnIndexOfSavingsInterestRate);
                float _tmpLoanInterestRate = (float) _stmt.getDouble(_columnIndexOfLoanInterestRate);
                double _tmpMortgageAmount = _stmt.getDouble(_columnIndexOfMortgageAmount);
                int _tmpConsecutiveUnpaidTaxWeeks = (int) _stmt.getLong(_columnIndexOfConsecutiveUnpaidTaxWeeks);
                int _tmpConsecutiveUnpaidTitheWeeks = (int) _stmt.getLong(_columnIndexOfConsecutiveUnpaidTitheWeeks);
                float _tmpTaxRate = (float) _stmt.getDouble(_columnIndexOfTaxRate);
                BankingState _tmpBanking = new BankingState(_tmpSavingsBalance, _tmpLoanAmount, _tmpAccumulatedLoanInterest, _tmpTaxDebt, _tmpTitheDebt, _tmpSavingsInterestRate, _tmpLoanInterestRate, _tmpMortgageAmount, _tmpConsecutiveUnpaidTaxWeeks, _tmpConsecutiveUnpaidTitheWeeks, _tmpTaxRate);
                float _tmpPositiveSentiment = (float) _stmt.getDouble(_columnIndexOfPositiveSentiment);
                float _tmpNegativeSentiment = (float) _stmt.getDouble(_columnIndexOfNegativeSentiment);
                float _tmpNeutralSentiment = (float) _stmt.getDouble(_columnIndexOfNeutralSentiment);
                long _tmpConversationVolume = _stmt.getLong(_columnIndexOfConversationVolume);
                float _tmpTrendingScore = (float) _stmt.getDouble(_columnIndexOfTrendingScore);
                float _tmpMediaAttention = (float) _stmt.getDouble(_columnIndexOfMediaAttention);
                long _tmpIndustryFollowers = _stmt.getLong(_columnIndexOfIndustryFollowers);
                long _tmpFollowers = _stmt.getLong(_columnIndexOfFollowers);
                SocialSentimentState _tmpSentiment = new SocialSentimentState(_tmpPositiveSentiment, _tmpNegativeSentiment, _tmpNeutralSentiment, _tmpConversationVolume, _tmpTrendingScore, _tmpMediaAttention, _tmpIndustryFollowers, _tmpFollowers);
                GameStateEntity _item = new GameStateEntity(_tmpEmail, _tmpArtistName, _tmpIsAdmin, _tmpCash, _tmpFans, _tmpPopularity, _tmpInfluence, _tmpVoiceSkill, _tmpWritingSkill, _tmpBusinessSkill, _tmpEnergy, _tmpMaxEnergy, _tmpTimeSlots, _tmpMaxTimeSlots, _tmpCurrentWeek, _tmpCurrentYear, _tmpPracticeMissedWeeks, _tmpActiveToursCount, _tmpOwnedCars, _tmpOwnedHouses, _tmpOwnedInstruments, _tmpSongs, _tmpTours, _tmpSideJobs, _tmpStocks, _tmpCryptos, _tmpOwnLabel, _tmpSignedLabelId, _tmpSignedLabelCut, _tmpSignedLabelRole, _tmpSignedLabelLevel, _tmpSignedLabelStartWeek, _tmpSignedLabelStartYear, _tmpSignedLabelEndWeek, _tmpSignedLabelEndYear, _tmpSignedLabelReqSingles, _tmpSignedLabelReqAlbumsLP, _tmpSignedLabelReqAlbumsEP, _tmpSignedLabelReqMeTubeVideos, _tmpSignedLabelDeliveredSingles, _tmpSignedLabelDeliveredAlbumsLP, _tmpSignedLabelDeliveredAlbumsEP, _tmpSignedLabelDeliveredMeTubeVideos, _tmpMailbox, _tmpNpcs, _tmpPurchaseRequests, _tmpIndustryRespect, _tmpPublicImage, _tmpCriticalAcclaim, _tmpTrustworthiness, _tmpLegacyPoints, _tmpBusinessReputation, _tmpDiscipline, _tmpIntegrity, _tmpGenerosity, _tmpHumility, _tmpReliability, _tmpStress, _tmpBurnout, _tmpCreativeInspiration, _tmpMotivation, _tmpHappiness, _tmpWorkLifeBalance, _tmpGenreTrends, _tmpTimelineEvents, _tmpOwnedBusinesses, _tmpActiveGlobalEvent, _tmpGlobalEventEffect, _tmpMeTubeVideos, _tmpMeTubeSubscribers, _tmpMeTubeWatchTime, _tmpMeTubeRevenue, _tmpActiveBrandDealName, _tmpBrandDealWeeksRemaining, _tmpBrandDealWeeklyPayout, _tmpBrandDealRequiredEngagement, _tmpBrandDealPostedThisWeek, _tmpChatConversations, _tmpPendingChatReplies, _tmpCastPosts, _tmpCastTrendingHashtags, _tmpCastTimeSpentThisWeek, _tmpCastPostsCountThisWeek, _tmpCastNicheFocus, _tmpHiredEmployees, _tmpCandidateRoster, _tmpPendingStockOrders, _tmpPendingCryptoOrders, _tmpWallpaperId, _tmpIsPhoneLocked, _tmpNotificationLogs, _tmpInsuredCars, _tmpInsuredHouses, _tmpAdCompanyBudget, _tmpActiveAdCampaigns, _tmpEmployeeEvents, _tmpActiveBrandDeals, _tmpNewsArticles, _tmpWeatherCondition, _tmpActiveNoteText, _tmpSavedPhotos, _tmpScheduledActivities, _tmpEconomyCycle, _tmpInflationRate, _tmpFuelPrice, _tmpTouristIndex, _tmpIsElectionSeason, _tmpResidenceCountry, _tmpHasGlobalStreamingLicense, _tmpAccountantAutoInvestPercent, _tmpAccountantAutoSellProfitMargin, _tmpCryptoAutoInvestPercent, _tmpCryptoAutoSellProfitMargin, _tmpMerchStyles, _tmpEndorsedCandidateId, _tmpPoliticalTaxModifier, _tmpCityProjectWeeksRemaining, _tmpSoundstreamMonthlyListeners, _tmpSoundstreamWorldRank, _tmpSoundstreamWeeklyStreams, _tmpSoundstreamSongs, _tmpActiveFamilyReqNpcId, _tmpActiveFamilyReqAmount, _tmpActiveFamilyReqType, _tmpActiveFamilyReqDetail, _tmpActiveFamilyReqStatus, _tmpLastFamilyReqWeek, _tmpActiveDistributionDeal, _tmpActivePublishingDeal, _tmpRecoupableAdvanceBalance, _tmpSignedDistributionWeek, _tmpSignedPublishingWeek, _tmpAlbums, _tmpWorldHistory, _tmpAccountantStopLossMargin, _tmpCryptoStopLossMargin, _tmpAccountantAutoInvestEnabled, _tmpCryptoAutoInvestEnabled, _tmpLegacy, _tmpSecurity, _tmpFanSegments, _tmpWealth, _tmpWebHub, _tmpUpgradedPlatforms, _tmpAvatar, _tmpSpiritual, _tmpBanking, _tmpSentiment);
                _result.add(_item);
            }
            return _result;
        } finally {
            _stmt.close();
        }
    }

    @Override // com.example.data.GameStateDao
    @Nullable
    public Object deleteGameState(@NotNull String email, @NotNull Continuation<? super Unit> continuation) {
        Object performSuspending = DBUtil.performSuspending(this.__db, false, true, (v2) -> {
            return deleteGameState$lambda$4(r3, r4, v2);
        }, continuation);
        return performSuspending == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? performSuspending : Unit.INSTANCE;
    }

    private static final Unit deleteGameState$lambda$4(String $_sql, String $email, SQLiteConnection _connection) {
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement _stmt = _connection.prepare($_sql);
        try {
            _stmt.bindText(1, $email);
            _stmt.step();
            _stmt.close();
            return Unit.INSTANCE;
        } catch (Throwable th) {
            _stmt.close();
            throw th;
        }
    }

    /* compiled from: GameStateDao_Impl.kt */
    @Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��\u0016\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n��\b\u0086\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/data/GameStateDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "app"})
    /* loaded from: GameStateDao_Impl$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }
    }
}
