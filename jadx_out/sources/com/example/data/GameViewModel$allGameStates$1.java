package com.example.data;

import android.util.Log;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: GameViewModel.kt */
@Metadata(mv = {2, 2, 0}, k = 3, xi = 48, d1 = {"��\u0018\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n��\n\u0002\u0010\u0003\u0010��\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "", "Lcom/example/data/GameStateEntity;", "e", ""})
@DebugMetadata(f = "GameViewModel.kt", l = {47}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"$this$catch", "e"}, m = "invokeSuspend", c = "com.example.data.GameViewModel$allGameStates$1")
/* loaded from: GameViewModel$allGameStates$1.class */
final class GameViewModel$allGameStates$1 extends SuspendLambda implements Function3<FlowCollector<? super List<? extends GameStateEntity>>, Throwable, Continuation<? super Unit>, Object> {
    int label;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GameViewModel$allGameStates$1(Continuation<? super GameViewModel$allGameStates$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(FlowCollector<? super List<GameStateEntity>> flowCollector, Throwable p2, Continuation<? super Unit> continuation) {
        GameViewModel$allGameStates$1 gameViewModel$allGameStates$1 = new GameViewModel$allGameStates$1(continuation);
        gameViewModel$allGameStates$1.L$0 = flowCollector;
        gameViewModel$allGameStates$1.L$1 = p2;
        return gameViewModel$allGameStates$1.invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        FlowCollector $this$catch = (FlowCollector) this.L$0;
        Throwable e = (Throwable) this.L$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Log.e("GameViewModel", "Error observing all states: " + e.getMessage(), e);
                this.L$0 = SpillingKt.nullOutSpilledVariable($this$catch);
                this.L$1 = SpillingKt.nullOutSpilledVariable(e);
                this.label = 1;
                if ($this$catch.emit(CollectionsKt.emptyList(), (Continuation) this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
