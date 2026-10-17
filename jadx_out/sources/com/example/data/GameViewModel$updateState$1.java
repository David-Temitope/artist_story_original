package com.example.data;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GameViewModel.kt */
@Metadata(mv = {2, 2, 0}, k = 3, xi = 48, d1 = {"��\n\n��\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010��\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
@DebugMetadata(f = "GameViewModel.kt", l = {353, 355}, i = {1, 1}, s = {"L$0", "L$1"}, n = {"current", "updated"}, m = "invokeSuspend", c = "com.example.data.GameViewModel$updateState$1")
/* loaded from: GameViewModel$updateState$1.class */
public final class GameViewModel$updateState$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GameViewModel this$0;
    final /* synthetic */ String $email;
    final /* synthetic */ Function1<GameStateEntity, GameStateEntity> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public GameViewModel$updateState$1(GameViewModel $receiver, String $email, Function1<? super GameStateEntity, GameStateEntity> function1, Continuation<? super GameViewModel$updateState$1> continuation) {
        super(2, continuation);
        this.this$0 = $receiver;
        this.$email = $email;
        this.$block = function1;
    }

    public final Continuation<Unit> create(Object value, Continuation<?> continuation) {
        return new GameViewModel$updateState$1(this.this$0, this.$email, this.$block, continuation);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r10 = r0
            r0 = r6
            int r0 = r0.label
            switch(r0) {
                case 0: goto L24;
                case 1: goto L4a;
                case 2: goto L99;
                default: goto Lb3;
            }
        L24:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r6
            com.example.data.GameViewModel r0 = r0.this$0
            com.example.data.GameStateDao r0 = com.example.data.GameViewModel.access$getDao$p(r0)
            r1 = r6
            java.lang.String r1 = r1.$email
            r2 = r6
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r3 = r6
            r4 = 1
            r3.label = r4
            java.lang.Object r0 = r0.getGameStateDirect(r1, r2)
            r1 = r0
            r2 = r10
            if (r1 != r2) goto L4f
            r1 = r10
            return r1
        L4a:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
        L4f:
            com.example.data.GameStateEntity r0 = (com.example.data.GameStateEntity) r0
            r1 = r0
            if (r1 != 0) goto L5b
        L57:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L5b:
            r8 = r0
            r0 = r6
            kotlin.jvm.functions.Function1<com.example.data.GameStateEntity, com.example.data.GameStateEntity> r0 = r0.$block
            r1 = r8
            java.lang.Object r0 = r0.invoke(r1)
            com.example.data.GameStateEntity r0 = (com.example.data.GameStateEntity) r0
            r9 = r0
            r0 = r6
            com.example.data.GameViewModel r0 = r0.this$0
            com.example.data.GameStateDao r0 = com.example.data.GameViewModel.access$getDao$p(r0)
            r1 = r9
            r2 = r6
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r3 = r6
            r4 = r8
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r3.L$0 = r4
            r3 = r6
            r4 = r9
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)
            r3.L$1 = r4
            r3 = r6
            r4 = 2
            r3.label = r4
            java.lang.Object r0 = r0.insertGameState(r1, r2)
            r1 = r0
            r2 = r10
            if (r1 != r2) goto Lae
            r1 = r10
            return r1
        L99:
            r0 = r6
            java.lang.Object r0 = r0.L$1
            com.example.data.GameStateEntity r0 = (com.example.data.GameStateEntity) r0
            r9 = r0
            r0 = r6
            java.lang.Object r0 = r0.L$0
            com.example.data.GameStateEntity r0 = (com.example.data.GameStateEntity) r0
            r8 = r0
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
        Lae:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        Lb3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.GameViewModel$updateState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
