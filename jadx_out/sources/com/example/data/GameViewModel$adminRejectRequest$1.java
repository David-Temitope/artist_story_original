package com.example.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: GameViewModel.kt */
@Metadata(mv = {2, 2, 0}, k = 3, xi = 48, d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010��\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@DebugMetadata(f = "GameViewModel.kt", l = {2611, 2616}, i = {1, 1}, s = {"L$0", "L$1"}, n = {"playerState", "updatedRequests"}, m = "invokeSuspend", c = "com.example.data.GameViewModel$adminRejectRequest$1")
@SourceDebugExtension({"SMAP\nGameViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameViewModel.kt\ncom/example/data/GameViewModel$adminRejectRequest$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,10302:1\n1563#2:10303\n1634#2,3:10304\n*S KotlinDebug\n*F\n+ 1 GameViewModel.kt\ncom/example/data/GameViewModel$adminRejectRequest$1\n*L\n2612#1:10303\n2612#1:10304,3\n*E\n"})
/* loaded from: GameViewModel$adminRejectRequest$1.class */
final class GameViewModel$adminRejectRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GameViewModel this$0;
    final /* synthetic */ String $playerEmail;
    final /* synthetic */ String $requestId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$adminRejectRequest$1(GameViewModel $receiver, String $playerEmail, String $requestId, Continuation<? super GameViewModel$adminRejectRequest$1> continuation) {
        super(2, continuation);
        this.this$0 = $receiver;
        this.$playerEmail = $playerEmail;
        this.$requestId = $requestId;
    }

    public final Continuation<Unit> create(Object value, Continuation<?> continuation) {
        return new GameViewModel$adminRejectRequest$1(this.this$0, this.$playerEmail, this.$requestId, continuation);
    }

    public final Object invoke(CoroutineScope p1, Continuation<? super Unit> continuation) {
        return create(p1, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r171) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.GameViewModel$adminRejectRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
