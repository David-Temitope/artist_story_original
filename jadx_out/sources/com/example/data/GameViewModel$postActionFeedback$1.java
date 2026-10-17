package com.example.data;

import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GameViewModel.kt */
@Metadata(mv = {2, 2, 0}, k = 3, xi = 48, d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010��\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@DebugMetadata(f = "GameViewModel.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.example.data.GameViewModel$postActionFeedback$1")
/* loaded from: GameViewModel$postActionFeedback$1.class */
public final class GameViewModel$postActionFeedback$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ GameViewModel this$0;
    final /* synthetic */ String $title;
    final /* synthetic */ String $subtitle;
    final /* synthetic */ List<StatFeedbackItem> $deltas;
    final /* synthetic */ String $iconType;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$postActionFeedback$1(GameViewModel $receiver, String $title, String $subtitle, List<StatFeedbackItem> list, String $iconType, Continuation<? super GameViewModel$postActionFeedback$1> continuation) {
        super(2, continuation);
        this.this$0 = $receiver;
        this.$title = $title;
        this.$subtitle = $subtitle;
        this.$deltas = list;
        this.$iconType = $iconType;
    }

    public final Continuation<Unit> create(Object value, Continuation<?> continuation) {
        return new GameViewModel$postActionFeedback$1(this.this$0, this.$title, this.$subtitle, this.$deltas, this.$iconType, continuation);
    }

    public final Object invoke(CoroutineScope p1, Continuation<? super Unit> continuation) {
        return create(p1, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        MutableStateFlow mutableStateFlow;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                mutableStateFlow = this.this$0._actionFeedback;
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                mutableStateFlow.setValue(new ActionFeedback(uuid, this.$title, this.$subtitle, this.$deltas, this.$iconType, System.currentTimeMillis()));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
