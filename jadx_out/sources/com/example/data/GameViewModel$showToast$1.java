package com.example.data;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GameViewModel.kt */
@Metadata(mv = {2, 2, 0}, k = 3, xi = 48, d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010��\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@DebugMetadata(f = "GameViewModel.kt", l = {87}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.example.data.GameViewModel$showToast$1")
/* loaded from: GameViewModel$showToast$1.class */
public final class GameViewModel$showToast$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GameViewModel this$0;
    final /* synthetic */ String $msg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$showToast$1(GameViewModel $receiver, String $msg, Continuation<? super GameViewModel$showToast$1> continuation) {
        super(2, continuation);
        this.this$0 = $receiver;
        this.$msg = $msg;
    }

    public final Continuation<Unit> create(Object value, Continuation<?> continuation) {
        return new GameViewModel$showToast$1(this.this$0, this.$msg, continuation);
    }

    public final Object invoke(CoroutineScope p1, Continuation<? super Unit> continuation) {
        return create(p1, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                mutableSharedFlow = this.this$0._toastMessage;
                this.label = 1;
                if (mutableSharedFlow.emit(this.$msg, (Continuation) this) == coroutine_suspended) {
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
