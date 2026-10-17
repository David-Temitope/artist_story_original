package com.example.data;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: Merge.kt */
@Metadata(mv = {2, 2, 0}, k = 3, xi = 48, d1 = {"��\u0012\n��\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010��\u001a\u00020\u0001\"\u0004\b��\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u0002H\u0003H\n¨\u0006\u0006"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1"})
@DebugMetadata(f = "GameViewModel.kt", l = {189}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$transformLatest", "it"}, m = "invokeSuspend", c = "com.example.data.GameViewModel$special$$inlined$flatMapLatest$1")
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 GameViewModel.kt\ncom/example/data/GameViewModel\n*L\n1#1,189:1\n35#2:190\n*E\n"})
/* loaded from: GameViewModel$special$$inlined$flatMapLatest$1.class */
public final class GameViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super GameStateEntity>, String, Continuation<? super Unit>, Object> {
    int label;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$special$$inlined$flatMapLatest$1(Continuation $completion, GameViewModel gameViewModel) {
        super(3, $completion);
        this.this$0 = gameViewModel;
    }

    public final Object invoke(FlowCollector<? super GameStateEntity> flowCollector, String str, Continuation<? super Unit> continuation) {
        GameViewModel$special$$inlined$flatMapLatest$1 gameViewModel$special$$inlined$flatMapLatest$1 = new GameViewModel$special$$inlined$flatMapLatest$1(continuation, this.this$0);
        gameViewModel$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        gameViewModel$special$$inlined$flatMapLatest$1.L$1 = str;
        return gameViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        return invoke((FlowCollector) p1, (String) p2, (Continuation) p3);
    }

    public final Object invokeSuspend(Object $result) {
        Flow<GameStateEntity> flowOf;
        GameStateDao gameStateDao;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                FlowCollector $this$transformLatest = (FlowCollector) this.L$0;
                Object it = this.L$1;
                Continuation continuation = (Continuation) this;
                String str = (String) it;
                if (str != null) {
                    gameStateDao = this.this$0.dao;
                    flowOf = gameStateDao.getGameState(str);
                } else {
                    flowOf = FlowKt.flowOf((Object) null);
                }
                this.L$0 = SpillingKt.nullOutSpilledVariable($this$transformLatest);
                this.L$1 = SpillingKt.nullOutSpilledVariable(it);
                this.label = 1;
                if (FlowKt.emitAll($this$transformLatest, flowOf, (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                Object obj = this.L$1;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
