package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
/* compiled from: AppDatabase_Impl.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0002\n��\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n��\n\u0002\u0010\"\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018��2\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016J\"\u0010\r\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00100\u000eH\u0014J\u0016\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f0\u0012H\u0016J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u001a\u0010\u0016\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u000f\u0012\u0004\u0012\u00020\u00130\u000eH\u0016J\b\u0010\u0017\u001a\u00020\u0006H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n��¨\u0006\u0018"}, d2 = {"Lcom/example/data/AppDatabase_Impl;", "Lcom/example/data/AppDatabase;", "<init>", "()V", "_gameStateDao", "Lkotlin/Lazy;", "Lcom/example/data/GameStateDao;", "createOpenDelegate", "Landroidx/room/RoomOpenDelegate;", "createInvalidationTracker", "Landroidx/room/InvalidationTracker;", "clearAllTables", "", "getRequiredTypeConverterClasses", "", "Lkotlin/reflect/KClass;", "", "getRequiredAutoMigrationSpecClasses", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "gameStateDao", "app"})
/* loaded from: AppDatabase_Impl.class */
public final class AppDatabase_Impl extends AppDatabase {
    @NotNull
    private final Lazy<GameStateDao> _gameStateDao = LazyKt.lazy(() -> {
        return _gameStateDao$lambda$0(r1);
    });
    public static final int $stable = 8;

    private static final GameStateDao_Impl _gameStateDao$lambda$0(AppDatabase_Impl this$0) {
        return new GameStateDao_Impl(this$0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: createOpenDelegate */
    public RoomOpenDelegate m14createOpenDelegate() {
        RoomOpenDelegate _openDelegate = new RoomOpenDelegate() { // from class: com.example.data.AppDatabase_Impl$createOpenDelegate$_openDelegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(17, "1d8688fe7f1bfd8c58cc11d76b0a5c31", "11a3b5636f6f5754694cbe52f1d44e13");
            }

            public void createAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `game_states` (`email` TEXT NOT NULL, `artistName` TEXT NOT NULL, `isAdmin` INTEGER NOT NULL, `cash` REAL NOT NULL, `fans` INTEGER NOT NULL, `popularity` REAL NOT NULL, `influence` REAL NOT NULL, `voiceSkill` REAL NOT NULL, `writingSkill` REAL NOT NULL, `businessSkill` REAL NOT NULL, `energy` INTEGER NOT NULL, `maxEnergy` INTEGER NOT NULL, `timeSlots` INTEGER NOT NULL, `maxTimeSlots` INTEGER NOT NULL, `currentWeek` INTEGER NOT NULL, `currentYear` INTEGER NOT NULL, `practiceMissedWeeks` INTEGER NOT NULL, `activeToursCount` INTEGER NOT NULL, `ownedCars` TEXT NOT NULL, `ownedHouses` TEXT NOT NULL, `ownedInstruments` TEXT NOT NULL, `songs` TEXT NOT NULL, `tours` TEXT NOT NULL, `sideJobs` TEXT NOT NULL, `stocks` TEXT NOT NULL, `cryptos` TEXT NOT NULL, `ownLabel` TEXT, `signedLabelId` TEXT, `signedLabelCut` REAL NOT NULL, `signedLabelRole` TEXT, `signedLabelLevel` INTEGER NOT NULL, `signedLabelStartWeek` INTEGER NOT NULL, `signedLabelStartYear` INTEGER NOT NULL, `signedLabelEndWeek` INTEGER NOT NULL, `signedLabelEndYear` INTEGER NOT NULL, `signedLabelReqSingles` INTEGER NOT NULL, `signedLabelReqAlbumsLP` INTEGER NOT NULL, `signedLabelReqAlbumsEP` INTEGER NOT NULL, `signedLabelReqMeTubeVideos` INTEGER NOT NULL, `signedLabelDeliveredSingles` INTEGER NOT NULL, `signedLabelDeliveredAlbumsLP` INTEGER NOT NULL, `signedLabelDeliveredAlbumsEP` INTEGER NOT NULL, `signedLabelDeliveredMeTubeVideos` INTEGER NOT NULL, `mailbox` TEXT NOT NULL, `npcs` TEXT NOT NULL, `purchaseRequests` TEXT NOT NULL, `industryRespect` REAL NOT NULL, `publicImage` REAL NOT NULL, `criticalAcclaim` REAL NOT NULL, `trustworthiness` REAL NOT NULL, `legacyPoints` INTEGER NOT NULL, `businessReputation` REAL NOT NULL, `discipline` REAL NOT NULL, `integrity` REAL NOT NULL, `generosity` REAL NOT NULL, `humility` REAL NOT NULL, `reliability` REAL NOT NULL, `stress` REAL NOT NULL, `burnout` REAL NOT NULL, `creativeInspiration` REAL NOT NULL, `motivation` REAL NOT NULL, `happiness` REAL NOT NULL, `workLifeBalance` REAL NOT NULL, `genreTrends` TEXT NOT NULL, `timelineEvents` TEXT NOT NULL, `ownedBusinesses` TEXT NOT NULL, `activeGlobalEvent` TEXT, `globalEventEffect` TEXT, `meTubeVideos` TEXT NOT NULL, `meTubeSubscribers` INTEGER NOT NULL, `meTubeWatchTime` REAL NOT NULL, `meTubeRevenue` REAL NOT NULL, `activeBrandDealName` TEXT, `brandDealWeeksRemaining` INTEGER NOT NULL, `brandDealWeeklyPayout` REAL NOT NULL, `brandDealRequiredEngagement` INTEGER NOT NULL, `brandDealPostedThisWeek` INTEGER NOT NULL, `chatConversations` TEXT NOT NULL, `pendingChatReplies` TEXT NOT NULL, `castPosts` TEXT NOT NULL, `castTrendingHashtags` TEXT NOT NULL, `castTimeSpentThisWeek` INTEGER NOT NULL, `castPostsCountThisWeek` INTEGER NOT NULL, `castNicheFocus` TEXT NOT NULL, `hiredEmployees` TEXT NOT NULL, `candidateRoster` TEXT NOT NULL, `pendingStockOrders` TEXT NOT NULL, `pendingCryptoOrders` TEXT NOT NULL, `wallpaperId` TEXT NOT NULL, `isPhoneLocked` INTEGER NOT NULL, `notificationLogs` TEXT NOT NULL, `insuredCars` TEXT NOT NULL, `insuredHouses` TEXT NOT NULL, `adCompanyBudget` REAL NOT NULL, `activeAdCampaigns` TEXT NOT NULL, `employeeEvents` TEXT NOT NULL, `activeBrandDeals` TEXT NOT NULL, `newsArticles` TEXT NOT NULL, `weatherCondition` TEXT NOT NULL, `activeNoteText` TEXT NOT NULL, `savedPhotos` TEXT NOT NULL, `scheduledActivities` TEXT NOT NULL, `economyCycle` TEXT NOT NULL, `inflationRate` REAL NOT NULL, `fuelPrice` REAL NOT NULL, `touristIndex` INTEGER NOT NULL, `isElectionSeason` INTEGER NOT NULL, `residenceCountry` TEXT NOT NULL, `hasGlobalStreamingLicense` INTEGER NOT NULL, `accountantAutoInvestPercent` REAL NOT NULL, `accountantAutoSellProfitMargin` REAL NOT NULL, `cryptoAutoInvestPercent` REAL NOT NULL, `cryptoAutoSellProfitMargin` REAL NOT NULL, `merchStyles` TEXT NOT NULL, `endorsedCandidateId` TEXT, `politicalTaxModifier` REAL NOT NULL, `cityProjectWeeksRemaining` INTEGER NOT NULL, `soundstreamMonthlyListeners` INTEGER NOT NULL, `soundstreamWorldRank` INTEGER NOT NULL, `soundstreamWeeklyStreams` INTEGER NOT NULL, `soundstreamSongs` TEXT NOT NULL, `activeFamilyReqNpcId` TEXT, `activeFamilyReqAmount` REAL NOT NULL, `activeFamilyReqType` TEXT, `activeFamilyReqDetail` TEXT, `activeFamilyReqStatus` TEXT, `lastFamilyReqWeek` INTEGER NOT NULL, `activeDistributionDeal` TEXT NOT NULL, `activePublishingDeal` TEXT NOT NULL, `recoupableAdvanceBalance` REAL NOT NULL, `signedDistributionWeek` INTEGER NOT NULL, `signedPublishingWeek` INTEGER NOT NULL, `albums` TEXT NOT NULL, `worldHistory` TEXT NOT NULL, `accountantStopLossMargin` REAL NOT NULL, `cryptoStopLossMargin` REAL NOT NULL, `accountantAutoInvestEnabled` INTEGER NOT NULL, `cryptoAutoInvestEnabled` INTEGER NOT NULL, `upgradedPlatforms` TEXT NOT NULL, `hasWikipediaPage` INTEGER NOT NULL, `hasHallOfFame` INTEGER NOT NULL, `hasMuseum` INTEGER NOT NULL, `hasDocumentary` INTEGER NOT NULL, `hasBiography` INTEGER NOT NULL, `hasNetflixSeries` INTEGER NOT NULL, `hasScholarships` INTEGER NOT NULL, `artistsInspiredCount` INTEGER NOT NULL, `receivedGovernorPitch` INTEGER NOT NULL, `receivedSenatorPitch` INTEGER NOT NULL, `hiredSecurityCompany` TEXT NOT NULL, `hasCyberInsurance` INTEGER NOT NULL, `hasStudioInsurance` INTEGER NOT NULL, `casualFans` INTEGER NOT NULL, `hardcoreFans` INTEGER NOT NULL, `collectors` INTEGER NOT NULL, `concertGoers` INTEGER NOT NULL, `internationalFans` INTEGER NOT NULL, `onlineCommunity` INTEGER NOT NULL, `fansPersonalityLovers` INTEGER NOT NULL, `fansLyricsLovers` INTEGER NOT NULL, `fansVoicePurists` INTEGER NOT NULL, `fansFashionistas` INTEGER NOT NULL, `fansControversySeekers` INTEGER NOT NULL, `fansBusinessAdmirers` INTEGER NOT NULL, `fansCharityBelievers` INTEGER NOT NULL, `emergencyFundBalance` REAL NOT NULL, `payrollReserve` REAL NOT NULL, `businessReserve` REAL NOT NULL, `bondsBalance` REAL NOT NULL, `bondsInterestRate` REAL NOT NULL, `financialReviewLog` TEXT NOT NULL, `lastReviewWeek` INTEGER NOT NULL, `lastReviewYear` INTEGER NOT NULL, `financialHistoryCashFlow` TEXT NOT NULL, `smmPostCategory` TEXT NOT NULL, `smmAutoPost` INTEGER NOT NULL, `wgtApplied` INTEGER NOT NULL, `wgtAuditionWeek` INTEGER NOT NULL, `wgtAuditionYear` INTEGER NOT NULL, `wgtCompletedCount` INTEGER NOT NULL, `wgtWon` INTEGER NOT NULL, `isSccWanted` INTEGER NOT NULL, `sccCrimeReason` TEXT NOT NULL, `sccFineAmount` REAL NOT NULL, `blackHatPurchasesCount` INTEGER NOT NULL, `electionVotedCandidateId` TEXT, `electionVotedWeek` INTEGER NOT NULL, `electionVotedYear` INTEGER NOT NULL, `grandAwardNominated` INTEGER NOT NULL, `grandAwardWon` INTEGER NOT NULL, `grandAwardVipAccess` INTEGER NOT NULL, `lastDemoSubmissionWeek` INTEGER NOT NULL, `labelContractObligations` TEXT NOT NULL, `wgtSeason` INTEGER NOT NULL, `wgtSeasonYear` INTEGER NOT NULL, `wgtSemiFinalsWeek` INTEGER NOT NULL, `wgtGrandFinaleWeek` INTEGER NOT NULL, `wgtRegistrationStatus` TEXT NOT NULL, `wgtLastWinner` TEXT NOT NULL, `wgtContestants` TEXT NOT NULL, `avatarBaseLook` TEXT NOT NULL, `avatarSkinTone` TEXT NOT NULL, `avatarHairStyleId` TEXT NOT NULL, `avatarClothingId` TEXT NOT NULL, `avatarJewelryId` TEXT NOT NULL, `avatarOwnedItemIds` TEXT NOT NULL, `spiritualPrayerSetting` INTEGER NOT NULL, `spiritualTitheSetting` INTEGER NOT NULL, `spiritualTotalTithesPaid` REAL NOT NULL, `spiritualTitheReminderActive` INTEGER NOT NULL, `spiritualJournal` TEXT NOT NULL, `savingsBalance` REAL NOT NULL, `loanAmount` REAL NOT NULL, `accumulatedLoanInterest` REAL NOT NULL, `taxDebt` REAL NOT NULL, `titheDebt` REAL NOT NULL, `savingsInterestRate` REAL NOT NULL, `loanInterestRate` REAL NOT NULL, `mortgageAmount` REAL NOT NULL, `consecutiveUnpaidTaxWeeks` INTEGER NOT NULL, `consecutiveUnpaidTitheWeeks` INTEGER NOT NULL, `taxRate` REAL NOT NULL, `positiveSentiment` REAL NOT NULL, `negativeSentiment` REAL NOT NULL, `neutralSentiment` REAL NOT NULL, `conversationVolume` INTEGER NOT NULL, `trendingScore` REAL NOT NULL, `mediaAttention` REAL NOT NULL, `industryFollowers` INTEGER NOT NULL, `followers` INTEGER NOT NULL, PRIMARY KEY(`email`))");
                SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1d8688fe7f1bfd8c58cc11d76b0a5c31')");
            }

            public void dropAllTables(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                SQLite.execSQL(connection, "DROP TABLE IF EXISTS `game_states`");
            }

            public void onCreate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            public void onOpen(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                AppDatabase_Impl.this.internalInitInvalidationTracker(connection);
            }

            public void onPreMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                DBUtil.dropFtsSyncTriggers(connection);
            }

            public void onPostMigrate(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
            }

            public RoomOpenDelegate.ValidationResult onValidateSchema(SQLiteConnection connection) {
                Intrinsics.checkNotNullParameter(connection, "connection");
                Map _columnsGameStates = new LinkedHashMap();
                _columnsGameStates.put("email", new TableInfo.Column("email", "TEXT", true, 1, (String) null, 1));
                _columnsGameStates.put("artistName", new TableInfo.Column("artistName", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("isAdmin", new TableInfo.Column("isAdmin", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("cash", new TableInfo.Column("cash", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("fans", new TableInfo.Column("fans", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("popularity", new TableInfo.Column("popularity", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("influence", new TableInfo.Column("influence", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("voiceSkill", new TableInfo.Column("voiceSkill", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("writingSkill", new TableInfo.Column("writingSkill", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("businessSkill", new TableInfo.Column("businessSkill", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("energy", new TableInfo.Column("energy", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("maxEnergy", new TableInfo.Column("maxEnergy", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("timeSlots", new TableInfo.Column("timeSlots", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("maxTimeSlots", new TableInfo.Column("maxTimeSlots", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("currentWeek", new TableInfo.Column("currentWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("currentYear", new TableInfo.Column("currentYear", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("practiceMissedWeeks", new TableInfo.Column("practiceMissedWeeks", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("activeToursCount", new TableInfo.Column("activeToursCount", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("ownedCars", new TableInfo.Column("ownedCars", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("ownedHouses", new TableInfo.Column("ownedHouses", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("ownedInstruments", new TableInfo.Column("ownedInstruments", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("songs", new TableInfo.Column("songs", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("tours", new TableInfo.Column("tours", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("sideJobs", new TableInfo.Column("sideJobs", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("stocks", new TableInfo.Column("stocks", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("cryptos", new TableInfo.Column("cryptos", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("ownLabel", new TableInfo.Column("ownLabel", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelId", new TableInfo.Column("signedLabelId", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelCut", new TableInfo.Column("signedLabelCut", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelRole", new TableInfo.Column("signedLabelRole", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelLevel", new TableInfo.Column("signedLabelLevel", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelStartWeek", new TableInfo.Column("signedLabelStartWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelStartYear", new TableInfo.Column("signedLabelStartYear", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelEndWeek", new TableInfo.Column("signedLabelEndWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelEndYear", new TableInfo.Column("signedLabelEndYear", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelReqSingles", new TableInfo.Column("signedLabelReqSingles", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelReqAlbumsLP", new TableInfo.Column("signedLabelReqAlbumsLP", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelReqAlbumsEP", new TableInfo.Column("signedLabelReqAlbumsEP", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelReqMeTubeVideos", new TableInfo.Column("signedLabelReqMeTubeVideos", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelDeliveredSingles", new TableInfo.Column("signedLabelDeliveredSingles", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelDeliveredAlbumsLP", new TableInfo.Column("signedLabelDeliveredAlbumsLP", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelDeliveredAlbumsEP", new TableInfo.Column("signedLabelDeliveredAlbumsEP", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedLabelDeliveredMeTubeVideos", new TableInfo.Column("signedLabelDeliveredMeTubeVideos", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("mailbox", new TableInfo.Column("mailbox", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("npcs", new TableInfo.Column("npcs", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("purchaseRequests", new TableInfo.Column("purchaseRequests", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("industryRespect", new TableInfo.Column("industryRespect", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("publicImage", new TableInfo.Column("publicImage", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("criticalAcclaim", new TableInfo.Column("criticalAcclaim", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("trustworthiness", new TableInfo.Column("trustworthiness", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("legacyPoints", new TableInfo.Column("legacyPoints", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("businessReputation", new TableInfo.Column("businessReputation", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("discipline", new TableInfo.Column("discipline", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("integrity", new TableInfo.Column("integrity", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("generosity", new TableInfo.Column("generosity", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("humility", new TableInfo.Column("humility", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("reliability", new TableInfo.Column("reliability", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("stress", new TableInfo.Column("stress", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("burnout", new TableInfo.Column("burnout", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("creativeInspiration", new TableInfo.Column("creativeInspiration", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("motivation", new TableInfo.Column("motivation", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("happiness", new TableInfo.Column("happiness", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("workLifeBalance", new TableInfo.Column("workLifeBalance", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("genreTrends", new TableInfo.Column("genreTrends", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("timelineEvents", new TableInfo.Column("timelineEvents", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("ownedBusinesses", new TableInfo.Column("ownedBusinesses", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("activeGlobalEvent", new TableInfo.Column("activeGlobalEvent", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("globalEventEffect", new TableInfo.Column("globalEventEffect", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("meTubeVideos", new TableInfo.Column("meTubeVideos", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("meTubeSubscribers", new TableInfo.Column("meTubeSubscribers", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("meTubeWatchTime", new TableInfo.Column("meTubeWatchTime", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("meTubeRevenue", new TableInfo.Column("meTubeRevenue", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("activeBrandDealName", new TableInfo.Column("activeBrandDealName", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("brandDealWeeksRemaining", new TableInfo.Column("brandDealWeeksRemaining", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("brandDealWeeklyPayout", new TableInfo.Column("brandDealWeeklyPayout", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("brandDealRequiredEngagement", new TableInfo.Column("brandDealRequiredEngagement", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("brandDealPostedThisWeek", new TableInfo.Column("brandDealPostedThisWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("chatConversations", new TableInfo.Column("chatConversations", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("pendingChatReplies", new TableInfo.Column("pendingChatReplies", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("castPosts", new TableInfo.Column("castPosts", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("castTrendingHashtags", new TableInfo.Column("castTrendingHashtags", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("castTimeSpentThisWeek", new TableInfo.Column("castTimeSpentThisWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("castPostsCountThisWeek", new TableInfo.Column("castPostsCountThisWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("castNicheFocus", new TableInfo.Column("castNicheFocus", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("hiredEmployees", new TableInfo.Column("hiredEmployees", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("candidateRoster", new TableInfo.Column("candidateRoster", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("pendingStockOrders", new TableInfo.Column("pendingStockOrders", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("pendingCryptoOrders", new TableInfo.Column("pendingCryptoOrders", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("wallpaperId", new TableInfo.Column("wallpaperId", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("isPhoneLocked", new TableInfo.Column("isPhoneLocked", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("notificationLogs", new TableInfo.Column("notificationLogs", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("insuredCars", new TableInfo.Column("insuredCars", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("insuredHouses", new TableInfo.Column("insuredHouses", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("adCompanyBudget", new TableInfo.Column("adCompanyBudget", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("activeAdCampaigns", new TableInfo.Column("activeAdCampaigns", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("employeeEvents", new TableInfo.Column("employeeEvents", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("activeBrandDeals", new TableInfo.Column("activeBrandDeals", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("newsArticles", new TableInfo.Column("newsArticles", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("weatherCondition", new TableInfo.Column("weatherCondition", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("activeNoteText", new TableInfo.Column("activeNoteText", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("savedPhotos", new TableInfo.Column("savedPhotos", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("scheduledActivities", new TableInfo.Column("scheduledActivities", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("economyCycle", new TableInfo.Column("economyCycle", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("inflationRate", new TableInfo.Column("inflationRate", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("fuelPrice", new TableInfo.Column("fuelPrice", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("touristIndex", new TableInfo.Column("touristIndex", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("isElectionSeason", new TableInfo.Column("isElectionSeason", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("residenceCountry", new TableInfo.Column("residenceCountry", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("hasGlobalStreamingLicense", new TableInfo.Column("hasGlobalStreamingLicense", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("accountantAutoInvestPercent", new TableInfo.Column("accountantAutoInvestPercent", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("accountantAutoSellProfitMargin", new TableInfo.Column("accountantAutoSellProfitMargin", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("cryptoAutoInvestPercent", new TableInfo.Column("cryptoAutoInvestPercent", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("cryptoAutoSellProfitMargin", new TableInfo.Column("cryptoAutoSellProfitMargin", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("merchStyles", new TableInfo.Column("merchStyles", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("endorsedCandidateId", new TableInfo.Column("endorsedCandidateId", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("politicalTaxModifier", new TableInfo.Column("politicalTaxModifier", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("cityProjectWeeksRemaining", new TableInfo.Column("cityProjectWeeksRemaining", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("soundstreamMonthlyListeners", new TableInfo.Column("soundstreamMonthlyListeners", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("soundstreamWorldRank", new TableInfo.Column("soundstreamWorldRank", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("soundstreamWeeklyStreams", new TableInfo.Column("soundstreamWeeklyStreams", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("soundstreamSongs", new TableInfo.Column("soundstreamSongs", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("activeFamilyReqNpcId", new TableInfo.Column("activeFamilyReqNpcId", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("activeFamilyReqAmount", new TableInfo.Column("activeFamilyReqAmount", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("activeFamilyReqType", new TableInfo.Column("activeFamilyReqType", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("activeFamilyReqDetail", new TableInfo.Column("activeFamilyReqDetail", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("activeFamilyReqStatus", new TableInfo.Column("activeFamilyReqStatus", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("lastFamilyReqWeek", new TableInfo.Column("lastFamilyReqWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("activeDistributionDeal", new TableInfo.Column("activeDistributionDeal", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("activePublishingDeal", new TableInfo.Column("activePublishingDeal", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("recoupableAdvanceBalance", new TableInfo.Column("recoupableAdvanceBalance", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("signedDistributionWeek", new TableInfo.Column("signedDistributionWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("signedPublishingWeek", new TableInfo.Column("signedPublishingWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("albums", new TableInfo.Column("albums", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("worldHistory", new TableInfo.Column("worldHistory", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("accountantStopLossMargin", new TableInfo.Column("accountantStopLossMargin", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("cryptoStopLossMargin", new TableInfo.Column("cryptoStopLossMargin", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("accountantAutoInvestEnabled", new TableInfo.Column("accountantAutoInvestEnabled", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("cryptoAutoInvestEnabled", new TableInfo.Column("cryptoAutoInvestEnabled", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("upgradedPlatforms", new TableInfo.Column("upgradedPlatforms", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("hasWikipediaPage", new TableInfo.Column("hasWikipediaPage", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hasHallOfFame", new TableInfo.Column("hasHallOfFame", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hasMuseum", new TableInfo.Column("hasMuseum", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hasDocumentary", new TableInfo.Column("hasDocumentary", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hasBiography", new TableInfo.Column("hasBiography", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hasNetflixSeries", new TableInfo.Column("hasNetflixSeries", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hasScholarships", new TableInfo.Column("hasScholarships", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("artistsInspiredCount", new TableInfo.Column("artistsInspiredCount", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("receivedGovernorPitch", new TableInfo.Column("receivedGovernorPitch", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("receivedSenatorPitch", new TableInfo.Column("receivedSenatorPitch", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hiredSecurityCompany", new TableInfo.Column("hiredSecurityCompany", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("hasCyberInsurance", new TableInfo.Column("hasCyberInsurance", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hasStudioInsurance", new TableInfo.Column("hasStudioInsurance", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("casualFans", new TableInfo.Column("casualFans", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("hardcoreFans", new TableInfo.Column("hardcoreFans", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("collectors", new TableInfo.Column("collectors", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("concertGoers", new TableInfo.Column("concertGoers", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("internationalFans", new TableInfo.Column("internationalFans", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("onlineCommunity", new TableInfo.Column("onlineCommunity", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("fansPersonalityLovers", new TableInfo.Column("fansPersonalityLovers", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("fansLyricsLovers", new TableInfo.Column("fansLyricsLovers", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("fansVoicePurists", new TableInfo.Column("fansVoicePurists", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("fansFashionistas", new TableInfo.Column("fansFashionistas", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("fansControversySeekers", new TableInfo.Column("fansControversySeekers", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("fansBusinessAdmirers", new TableInfo.Column("fansBusinessAdmirers", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("fansCharityBelievers", new TableInfo.Column("fansCharityBelievers", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("emergencyFundBalance", new TableInfo.Column("emergencyFundBalance", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("payrollReserve", new TableInfo.Column("payrollReserve", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("businessReserve", new TableInfo.Column("businessReserve", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("bondsBalance", new TableInfo.Column("bondsBalance", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("bondsInterestRate", new TableInfo.Column("bondsInterestRate", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("financialReviewLog", new TableInfo.Column("financialReviewLog", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("lastReviewWeek", new TableInfo.Column("lastReviewWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("lastReviewYear", new TableInfo.Column("lastReviewYear", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("financialHistoryCashFlow", new TableInfo.Column("financialHistoryCashFlow", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("smmPostCategory", new TableInfo.Column("smmPostCategory", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("smmAutoPost", new TableInfo.Column("smmAutoPost", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtApplied", new TableInfo.Column("wgtApplied", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtAuditionWeek", new TableInfo.Column("wgtAuditionWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtAuditionYear", new TableInfo.Column("wgtAuditionYear", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtCompletedCount", new TableInfo.Column("wgtCompletedCount", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtWon", new TableInfo.Column("wgtWon", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("isSccWanted", new TableInfo.Column("isSccWanted", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("sccCrimeReason", new TableInfo.Column("sccCrimeReason", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("sccFineAmount", new TableInfo.Column("sccFineAmount", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("blackHatPurchasesCount", new TableInfo.Column("blackHatPurchasesCount", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("electionVotedCandidateId", new TableInfo.Column("electionVotedCandidateId", "TEXT", false, 0, (String) null, 1));
                _columnsGameStates.put("electionVotedWeek", new TableInfo.Column("electionVotedWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("electionVotedYear", new TableInfo.Column("electionVotedYear", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("grandAwardNominated", new TableInfo.Column("grandAwardNominated", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("grandAwardWon", new TableInfo.Column("grandAwardWon", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("grandAwardVipAccess", new TableInfo.Column("grandAwardVipAccess", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("lastDemoSubmissionWeek", new TableInfo.Column("lastDemoSubmissionWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("labelContractObligations", new TableInfo.Column("labelContractObligations", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtSeason", new TableInfo.Column("wgtSeason", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtSeasonYear", new TableInfo.Column("wgtSeasonYear", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtSemiFinalsWeek", new TableInfo.Column("wgtSemiFinalsWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtGrandFinaleWeek", new TableInfo.Column("wgtGrandFinaleWeek", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtRegistrationStatus", new TableInfo.Column("wgtRegistrationStatus", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtLastWinner", new TableInfo.Column("wgtLastWinner", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("wgtContestants", new TableInfo.Column("wgtContestants", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("avatarBaseLook", new TableInfo.Column("avatarBaseLook", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("avatarSkinTone", new TableInfo.Column("avatarSkinTone", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("avatarHairStyleId", new TableInfo.Column("avatarHairStyleId", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("avatarClothingId", new TableInfo.Column("avatarClothingId", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("avatarJewelryId", new TableInfo.Column("avatarJewelryId", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("avatarOwnedItemIds", new TableInfo.Column("avatarOwnedItemIds", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("spiritualPrayerSetting", new TableInfo.Column("spiritualPrayerSetting", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("spiritualTitheSetting", new TableInfo.Column("spiritualTitheSetting", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("spiritualTotalTithesPaid", new TableInfo.Column("spiritualTotalTithesPaid", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("spiritualTitheReminderActive", new TableInfo.Column("spiritualTitheReminderActive", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("spiritualJournal", new TableInfo.Column("spiritualJournal", "TEXT", true, 0, (String) null, 1));
                _columnsGameStates.put("savingsBalance", new TableInfo.Column("savingsBalance", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("loanAmount", new TableInfo.Column("loanAmount", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("accumulatedLoanInterest", new TableInfo.Column("accumulatedLoanInterest", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("taxDebt", new TableInfo.Column("taxDebt", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("titheDebt", new TableInfo.Column("titheDebt", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("savingsInterestRate", new TableInfo.Column("savingsInterestRate", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("loanInterestRate", new TableInfo.Column("loanInterestRate", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("mortgageAmount", new TableInfo.Column("mortgageAmount", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("consecutiveUnpaidTaxWeeks", new TableInfo.Column("consecutiveUnpaidTaxWeeks", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("consecutiveUnpaidTitheWeeks", new TableInfo.Column("consecutiveUnpaidTitheWeeks", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("taxRate", new TableInfo.Column("taxRate", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("positiveSentiment", new TableInfo.Column("positiveSentiment", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("negativeSentiment", new TableInfo.Column("negativeSentiment", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("neutralSentiment", new TableInfo.Column("neutralSentiment", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("conversationVolume", new TableInfo.Column("conversationVolume", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("trendingScore", new TableInfo.Column("trendingScore", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("mediaAttention", new TableInfo.Column("mediaAttention", "REAL", true, 0, (String) null, 1));
                _columnsGameStates.put("industryFollowers", new TableInfo.Column("industryFollowers", "INTEGER", true, 0, (String) null, 1));
                _columnsGameStates.put("followers", new TableInfo.Column("followers", "INTEGER", true, 0, (String) null, 1));
                Set _foreignKeysGameStates = new LinkedHashSet();
                Set _indicesGameStates = new LinkedHashSet();
                TableInfo _infoGameStates = new TableInfo("game_states", _columnsGameStates, _foreignKeysGameStates, _indicesGameStates);
                TableInfo _existingGameStates = TableInfo.Companion.read(connection, "game_states");
                if (!_infoGameStates.equals(_existingGameStates)) {
                    return new RoomOpenDelegate.ValidationResult(false, "game_states(com.example.data.GameStateEntity).\n Expected:\n" + _infoGameStates + "\n Found:\n" + _existingGameStates);
                }
                return new RoomOpenDelegate.ValidationResult(true, (String) null);
            }
        };
        return _openDelegate;
    }

    @NotNull
    protected InvalidationTracker createInvalidationTracker() {
        Map _shadowTablesMap = new LinkedHashMap();
        Map _viewTables = new LinkedHashMap();
        return new InvalidationTracker(this, _shadowTablesMap, _viewTables, new String[]{"game_states"});
    }

    public void clearAllTables() {
        super.performClear(false, new String[]{"game_states"});
    }

    @NotNull
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Map _typeConvertersMap = new LinkedHashMap();
        _typeConvertersMap.put(Reflection.getOrCreateKotlinClass(GameStateDao.class), GameStateDao_Impl.Companion.getRequiredConverters());
        return _typeConvertersMap;
    }

    @NotNull
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set _autoMigrationSpecsSet = new LinkedHashSet();
        return _autoMigrationSpecsSet;
    }

    @NotNull
    public List<Migration> createAutoMigrations(@NotNull Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> map) {
        Intrinsics.checkNotNullParameter(map, "autoMigrationSpecs");
        List _autoMigrations = new ArrayList();
        return _autoMigrations;
    }

    @Override // com.example.data.AppDatabase
    @NotNull
    public GameStateDao gameStateDao() {
        return (GameStateDao) this._gameStateDao.getValue();
    }
}
