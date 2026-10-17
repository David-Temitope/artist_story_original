package com.example.data;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GameViewModel.kt */
@Metadata(mv = {2, 2, 0}, k = 3, xi = 48, d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010��\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@DebugMetadata(f = "GameViewModel.kt", l = {110, 329, 334}, i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "L$0", "L$1", "L$2", "L$3"}, n = {"trimmedEmail", "trimmedName", "trimmedEmail", "trimmedName", "existing", "random", "personalities", "goals", "genres", "proceduralNPCs", "customNPCs", "initialDefaultCastPosts", "defaultState", "isAdmin", "trimmedEmail", "trimmedName", "existing", "repaired"}, m = "invokeSuspend", c = "com.example.data.GameViewModel$loginOrCreateAccount$1")
@SourceDebugExtension({"SMAP\nGameViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameViewModel.kt\ncom/example/data/GameViewModel$loginOrCreateAccount$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,10302:1\n1563#2:10303\n1634#2,3:10304\n1563#2:10307\n1634#2,3:10308\n*S KotlinDebug\n*F\n+ 1 GameViewModel.kt\ncom/example/data/GameViewModel$loginOrCreateAccount$1\n*L\n121#1:10303\n121#1:10304,3\n284#1:10307\n284#1:10308,3\n*E\n"})
/* loaded from: GameViewModel$loginOrCreateAccount$1.class */
public final class GameViewModel$loginOrCreateAccount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    Object L$10;
    int I$0;
    int label;
    final /* synthetic */ String $email;
    final /* synthetic */ String $artistName;
    final /* synthetic */ GameViewModel this$0;
    final /* synthetic */ String $country;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$loginOrCreateAccount$1(String $email, String $artistName, GameViewModel $receiver, String $country, Continuation<? super GameViewModel$loginOrCreateAccount$1> continuation) {
        super(2, continuation);
        this.$email = $email;
        this.$artistName = $artistName;
        this.this$0 = $receiver;
        this.$country = $country;
    }

    public final Continuation<Unit> create(Object value, Continuation<?> continuation) {
        return new GameViewModel$loginOrCreateAccount$1(this.$email, this.$artistName, this.this$0, this.$country, continuation);
    }

    public final Object invoke(CoroutineScope p1, Continuation<? super Unit> continuation) {
        return create(p1, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        GameStateEntity existing;
        String trimmedName;
        String trimmedEmail;
        Object obj;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        GameStateDao gameStateDao;
        GameStateDao gameStateDao2;
        MutableStateFlow mutableStateFlow4;
        MutableStateFlow mutableStateFlow5;
        SharedPreferences sharedPreferences;
        GameStateDao gameStateDao3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                String lowerCase = StringsKt.trim(this.$email).toString().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                trimmedEmail = lowerCase;
                trimmedName = StringsKt.trim(this.$artistName).toString();
                if (!(trimmedEmail.length() == 0)) {
                    if (!(trimmedName.length() == 0)) {
                        mutableStateFlow4 = this.this$0._currentUserEmail;
                        mutableStateFlow4.setValue(trimmedEmail);
                        mutableStateFlow5 = this.this$0._currentArtistName;
                        mutableStateFlow5.setValue(trimmedName);
                        sharedPreferences = this.this$0.prefs;
                        sharedPreferences.edit().putString("saved_email", trimmedEmail).putString("saved_name", trimmedName).apply();
                        gameStateDao3 = this.this$0.dao;
                        this.L$0 = trimmedEmail;
                        this.L$1 = trimmedName;
                        this.label = 1;
                        obj = gameStateDao3.getGameStateDirect(trimmedEmail, (Continuation) this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                this.this$0.showToast("Email and Name cannot be empty!");
                return Unit.INSTANCE;
            case 1:
                trimmedName = (String) this.L$1;
                trimmedEmail = (String) this.L$0;
                ResultKt.throwOnFailure($result);
                obj = $result;
                break;
            case 2:
                int i = this.I$0;
                GameStateEntity gameStateEntity = (GameStateEntity) this.L$10;
                List list = (List) this.L$9;
                List list2 = (List) this.L$8;
                List list3 = (List) this.L$7;
                List list4 = (List) this.L$6;
                List list5 = (List) this.L$5;
                List list6 = (List) this.L$4;
                Random random = (Random) this.L$3;
                GameStateEntity gameStateEntity2 = (GameStateEntity) this.L$2;
                trimmedName = (String) this.L$1;
                String str = (String) this.L$0;
                ResultKt.throwOnFailure($result);
                mutableStateFlow2 = this.this$0._weeklyReport;
                mutableStateFlow2.setValue("Welcome to your musical journey, " + trimmedName + "!");
                return Unit.INSTANCE;
            case 3:
                GameStateEntity gameStateEntity3 = (GameStateEntity) this.L$3;
                existing = (GameStateEntity) this.L$2;
                String str2 = (String) this.L$1;
                String str3 = (String) this.L$0;
                ResultKt.throwOnFailure($result);
                mutableStateFlow = this.this$0._weeklyReport;
                mutableStateFlow.setValue("Loaded saved game for " + existing.getArtistName() + " (Account balance restored).");
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        existing = (GameStateEntity) obj;
        if (existing != null) {
            if (existing.getCash() >= 0.0d) {
                mutableStateFlow3 = this.this$0._weeklyReport;
                mutableStateFlow3.setValue("Loaded saved game for " + existing.getArtistName() + ".");
                return Unit.INSTANCE;
            }
            GameStateEntity repaired = GameStateEntity.copy$default(existing, null, null, false, 10000.0d, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, 0.0f, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, 0L, 0.0d, 0.0d, null, 0, 0.0d, 0L, false, null, null, null, null, 0, 0, null, null, null, null, null, null, false, null, null, null, 0.0d, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, false, null, false, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0, 0L, 0, 0L, null, null, 0.0d, null, null, null, 0, null, null, 0.0d, 0, 0, null, null, 0.0f, 0.0f, false, false, null, null, null, null, null, null, null, null, null, null, -9, -1, -1, -1, 1048575, null);
            gameStateDao = this.this$0.dao;
            this.L$0 = SpillingKt.nullOutSpilledVariable(trimmedEmail);
            this.L$1 = SpillingKt.nullOutSpilledVariable(trimmedName);
            this.L$2 = existing;
            this.L$3 = SpillingKt.nullOutSpilledVariable(repaired);
            this.label = 3;
            if (gameStateDao.insertGameState(repaired, (Continuation) this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutableStateFlow = this.this$0._weeklyReport;
            mutableStateFlow.setValue("Loaded saved game for " + existing.getArtistName() + " (Account balance restored).");
            return Unit.INSTANCE;
        }
        int i2 = (Intrinsics.areEqual(trimmedEmail, "davemcthunder@gmail.com") || Intrinsics.areEqual(trimmedEmail, "oluwasegundave001@gmail.com")) ? 1 : 0;
        Random random2 = RandomKt.Random(System.currentTimeMillis());
        List personalities = CollectionsKt.listOf(new String[]{"Charismatic", "Ambitious", "Creative", "Rebel", "Hustler", "Diva"});
        List goals = CollectionsKt.listOf(new String[]{"Superstardom", "Critical Acclaim", "Financial Empire", "Genre Pioneer", "Underground Legend"});
        List genres = CollectionsKt.listOf(new String[]{"Pop", "Hip Hop", "Rock", "R&B", "Electronic", "Country", "Jazz", "Indie"});
        Iterable<NPCEntity> default_npcs = GameData.INSTANCE.getDEFAULT_NPCS();
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(default_npcs, 10));
        for (NPCEntity nPCEntity : default_npcs) {
            arrayList.add(ModelsKt.withPsychology(NPCEntity.copy$default(nPCEntity, null, null, 0.0f, 0.0f, 0L, false, 0.0d, null, 0.0f, 0L, random2.nextInt(18, 35), (String) CollectionsKt.random(personalities, random2), (random2.nextFloat() * 40.0f) + 50.0f, (random2.nextFloat() * 40.0f) + 50.0f, (random2.nextFloat() * 45.0f) + 40.0f, (String) CollectionsKt.random(genres, random2), random2.nextDouble(15000.0d, 250000.0d), (random2.nextFloat() * 30.0f) + 10.0f, (random2.nextFloat() * 30.0f) + 65.0f, (random2.nextFloat() * 30.0f) + 65.0f, 50.0f, false, random2.nextFloat() > 0.5f ? (String) CollectionsKt.random(CollectionsKt.listOf(new String[]{"Def Jam Records", "Apex Records", "Sub Pop", "Sony Music"}), random2) : "Independent", (String) CollectionsKt.random(CollectionsKt.listOf(new String[]{"Alfie Miller", "Sophia Carter", "Marcus Vance", "Olivia Sterling", "None"}), random2), (String) CollectionsKt.random(goals, random2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, false, -31456257, -1, 255, null), random2));
        }
        List proceduralNPCs = (List) arrayList;
        Iterable customNPCs = CollectionsKt.listOf(new NPCEntity[]{new NPCEntity("npc_gov_sterling", "Governor Sterling", 75.0f, 80.0f, 10000000L, false, 0.0d, "Political Pulse", 1.0f, 0L, 52, "Ambitious", 0.0f, 0.0f, 0.0f, null, 0.0d, 0.0f, 0.0f, 0.0f, 45.0f, false, null, null, "Political Power", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, false, -17829792, -1, 255, null), new NPCEntity("npc_sen_vance", "Senator Vance", 85.0f, 90.0f, 50000000L, false, 0.0d, "The Freedom Anthem", 1.0f, 0L, 48, "Hustler", 0.0f, 0.0f, 0.0f, null, 0.0d, 0.0f, 0.0f, 0.0f, 40.0f, false, null, null, "Presidency", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, false, -17829792, -1, 255, null), new NPCEntity("npc_family_uncle_joe", "Uncle Joe", 15.0f, 10.0f, 100L, false, 0.0d, "Grill Master Blues", 3.0f, 1000L, 45, "Hustler", 0.0f, 0.0f, 0.0f, null, 0.0d, 0.0f, 0.0f, 0.0f, 70.0f, false, null, null, "Get Rich Quick", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, false, -17829792, -1, 255, null), new NPCEntity("npc_family_cousin_sarah", "Cousin Sarah", 25.0f, 15.0f, 1200L, false, 0.0d, "Guitar Strings", 4.0f, 5000L, 22, "Creative", 0.0f, 0.0f, 0.0f, null, 0.0d, 0.0f, 0.0f, 0.0f, 75.0f, false, null, null, "Bake Shop Dream", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, false, -17829792, -1, 255, null), new NPCEntity("npc_family_mom", "Mom", 5.0f, 5.0f, 50L, false, 0.0d, "Lullaby for You", 5.0f, 10L, 55, "Charismatic", 0.0f, 0.0f, 0.0f, null, 0.0d, 0.0f, 0.0f, 0.0f, 90.0f, false, null, null, "Your Success", 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, false, -17829792, -1, 255, null)});
        List initialDefaultCastPosts = CollectionsKt.listOf(new CastPost[]{new CastPost("init_cast_alpha", "Alphadom Official", "@alphadom", "Build, scale, and automate your independent music label on the cloud. Visit alphadom.online to deploy your next studio workstation today.", 1240L, 340L, 42L, 1, 1, false, false, null, 3072, null), new CastPost("init_cast_apex", "Apex Records & Publishing", "@apexrecords", "Looking for raw talent and demo submissions. Check out our global contract roster at apexrecord.org and get heard by A&R executives.", 3120L, 890L, 115L, 1, 1, false, false, null, 3072, null), new CastPost("init_cast_wgt", "Who Is Got Talent", "@wgt_show", "Auditions are now open worldwide! Compete on the main stage and secure your grand finale spot at wgt.show.", 5400L, 1220L, 310L, 1, 1, false, false, null, 3072, null), new CastPost("init_cast_pulse", "PulseWire News Network", "@pulsewire", "Global charts update: Streaming volumes reach an all-time high as independent artists take over the airwaves. Read breaking stories at pulsewire.com.", 2450L, 630L, 78L, 1, 1, false, false, null, 3072, null), new CastPost("init_cast_sold", "SOLD Real Estate Exchange", "@sold_properties", "Explore luxury recording compounds, high-rise penthouses, and private estates on sold.com.", 1890L, 410L, 52L, 1, 1, false, false, null, 3072, null)});
        List emptyList = CollectionsKt.emptyList();
        List<SideJob> side_jobs = GameData.INSTANCE.getSIDE_JOBS();
        List<Stock> stocks = GameData.INSTANCE.getSTOCKS();
        List<Crypto> cryptos = GameData.INSTANCE.getCRYPTOS();
        List list7 = proceduralNPCs;
        Iterable<NPCEntity> iterable = customNPCs;
        Collection arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (NPCEntity nPCEntity2 : iterable) {
            arrayList2.add(ModelsKt.withPsychology(nPCEntity2, random2));
        }
        List plus = CollectionsKt.plus(list7, (List) arrayList2);
        Map mapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to("genre_pop", Boxing.boxFloat(1.0f)), TuplesKt.to("genre_hiphop", Boxing.boxFloat(1.1f)), TuplesKt.to("genre_rock", Boxing.boxFloat(0.9f)), TuplesKt.to("genre_rnb", Boxing.boxFloat(1.0f)), TuplesKt.to("genre_electronic", Boxing.boxFloat(1.0f)), TuplesKt.to("genre_country", Boxing.boxFloat(0.8f)), TuplesKt.to("genre_jazz", Boxing.boxFloat(0.7f)), TuplesKt.to("genre_indie", Boxing.boxFloat(0.9f))});
        List listOf = CollectionsKt.listOf("Year 1, Week 1: Started your music career as an aspiring independent artist in " + this.$country + "!");
        GameStateEntity defaultState = new GameStateEntity(trimmedEmail, trimmedName, i2 != 0, 0.0d, 0L, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, emptyList, null, side_jobs, stocks, cryptos, null, null, 0.0f, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, CollectionsKt.listOf(new MailMessage("welcome_msg", "Music Council", "Welcome to Artist Story!", "Welcome " + trimmedName + "! Start by doing some Side Jobs in the Gigs section to earn cash, then rent a Studio to write your first hit song! Reach 45% influence on social media and 60% popularity to get Record Label deals.", 0.0d, "NORMAL", false, false, 5, 1, 0.0f, null, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 33553616, null)), plus, null, 10.0f, 50.0f, 10.0f, 50.0f, 0L, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 50.0f, 20.0f, 0.0f, 100.0f, 80.0f, 75.0f, 50.0f, mapOf, listOf, null, null, null, null, 0L, 0.0d, 0.0d, null, 0, 0.0d, 0L, false, null, null, initialDefaultCastPosts, null, 0, 0, null, null, null, null, null, null, false, null, null, null, 0.0d, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, false, this.$country, false, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 0.0f, 0, 0L, 0, 0L, null, null, 0.0d, null, null, null, 0, null, null, 0.0d, 0, 0, null, null, 0.0f, 0.0f, false, false, null, null, new FanSegmentsState(200L, 10L, 2L, 5L, 0L, 50L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8128, null), null, null, null, null, null, null, new SocialSentimentState(60.0f, 10.0f, 30.0f, 120L, 5.0f, 10.0f, 50L, 1500L), -60817416, 10239, -32770, -6145, 520191, null);
        gameStateDao2 = this.this$0.dao;
        this.L$0 = SpillingKt.nullOutSpilledVariable(trimmedEmail);
        this.L$1 = trimmedName;
        this.L$2 = SpillingKt.nullOutSpilledVariable(existing);
        this.L$3 = SpillingKt.nullOutSpilledVariable(random2);
        this.L$4 = SpillingKt.nullOutSpilledVariable(personalities);
        this.L$5 = SpillingKt.nullOutSpilledVariable(goals);
        this.L$6 = SpillingKt.nullOutSpilledVariable(genres);
        this.L$7 = SpillingKt.nullOutSpilledVariable(proceduralNPCs);
        this.L$8 = SpillingKt.nullOutSpilledVariable(customNPCs);
        this.L$9 = SpillingKt.nullOutSpilledVariable(initialDefaultCastPosts);
        this.L$10 = SpillingKt.nullOutSpilledVariable(defaultState);
        this.I$0 = i2;
        this.label = 2;
        if (gameStateDao2.insertGameState(defaultState, (Continuation) this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        mutableStateFlow2 = this.this$0._weeklyReport;
        mutableStateFlow2.setValue("Welcome to your musical journey, " + trimmedName + "!");
        return Unit.INSTANCE;
    }
}
