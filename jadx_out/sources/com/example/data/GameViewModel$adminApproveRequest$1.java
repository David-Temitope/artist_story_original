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
@DebugMetadata(f = "GameViewModel.kt", l = {2582, 2604}, i = {1, 1, 1, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$3", "D$0", "I$0", "I$1"}, n = {"playerState", "updatedRequests", "req", "updatedPlayer", "newCash", "newMaxSlots", "newMaxEnergy"}, m = "invokeSuspend", c = "com.example.data.GameViewModel$adminApproveRequest$1")
@SourceDebugExtension({"SMAP\nGameViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameViewModel.kt\ncom/example/data/GameViewModel$adminApproveRequest$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,10302:1\n1563#2:10303\n1634#2,3:10304\n1#3:10307\n*S KotlinDebug\n*F\n+ 1 GameViewModel.kt\ncom/example/data/GameViewModel$adminApproveRequest$1\n*L\n2583#1:10303\n2583#1:10304,3\n*E\n"})
/* loaded from: GameViewModel$adminApproveRequest$1.class */
final class GameViewModel$adminApproveRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    double D$0;
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ GameViewModel this$0;
    final /* synthetic */ String $playerEmail;
    final /* synthetic */ String $requestId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$adminApproveRequest$1(GameViewModel $receiver, String $playerEmail, String $requestId, Continuation<? super GameViewModel$adminApproveRequest$1> continuation) {
        super(2, continuation);
        this.this$0 = $receiver;
        this.$playerEmail = $playerEmail;
        this.$requestId = $requestId;
    }

    public final Continuation<Unit> create(Object value, Continuation<?> continuation) {
        return new GameViewModel$adminApproveRequest$1(this.this$0, this.$playerEmail, this.$requestId, continuation);
    }

    public final Object invoke(CoroutineScope p1, Continuation<? super Unit> continuation) {
        return create(p1, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r170) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.GameViewModel$adminApproveRequest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
