package com.example.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.random.Random;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: CareerDilemmaController.kt */
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��8\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n��\bÇ\u0002\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\fJ\u0016\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n��R\u0019\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b¢\u0006\b\n��\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/example/data/CareerDilemmaController;", "", "<init>", "()V", "_activeDilemma", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/data/CareerDilemma;", "activeDilemma", "Lkotlinx/coroutines/flow/StateFlow;", "getActiveDilemma", "()Lkotlinx/coroutines/flow/StateFlow;", "triggerDilemma", "", "state", "Lcom/example/data/GameStateEntity;", "customDilemma", "maybeTriggerRandomDilemma", "dismissDilemma", "resolveDilemma", "choice", "Lcom/example/data/DilemmaChoice;", "viewModel", "Lcom/example/data/GameViewModel;", "app"})
/* loaded from: CareerDilemmaController.class */
public final class CareerDilemmaController {
    @NotNull
    public static final CareerDilemmaController INSTANCE = new CareerDilemmaController();
    @NotNull
    private static final MutableStateFlow<CareerDilemma> _activeDilemma = StateFlowKt.MutableStateFlow((Object) null);
    @NotNull
    private static final StateFlow<CareerDilemma> activeDilemma = FlowKt.asStateFlow(_activeDilemma);
    public static final int $stable = 8;

    private CareerDilemmaController() {
    }

    @NotNull
    public final StateFlow<CareerDilemma> getActiveDilemma() {
        return activeDilemma;
    }

    public static /* synthetic */ void triggerDilemma$default(CareerDilemmaController careerDilemmaController, GameStateEntity gameStateEntity, CareerDilemma careerDilemma, int i, Object obj) {
        if ((i & 2) != 0) {
            careerDilemma = null;
        }
        careerDilemmaController.triggerDilemma(gameStateEntity, careerDilemma);
    }

    public final void triggerDilemma(@NotNull GameStateEntity state, @Nullable CareerDilemma customDilemma) {
        Intrinsics.checkNotNullParameter(state, "state");
        MutableStateFlow<CareerDilemma> mutableStateFlow = _activeDilemma;
        CareerDilemma careerDilemma = customDilemma;
        if (careerDilemma == null) {
            careerDilemma = CareerDilemmaGenerator.INSTANCE.generateDilemmaForState(state);
        }
        mutableStateFlow.setValue(careerDilemma);
    }

    public final void maybeTriggerRandomDilemma(@NotNull GameStateEntity state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (Random.Default.nextFloat() < 0.35f) {
            triggerDilemma$default(this, state, null, 2, null);
        }
    }

    public final void dismissDilemma() {
        _activeDilemma.setValue((Object) null);
    }

    public final void resolveDilemma(@NotNull DilemmaChoice choice, @NotNull GameViewModel viewModel) {
        String valueOf;
        String str;
        Intrinsics.checkNotNullParameter(choice, "choice");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        CareerDilemma currentDilemma = (CareerDilemma) _activeDilemma.getValue();
        viewModel.updateState((v2) -> {
            return resolveDilemma$lambda$0(r1, r2, v2);
        });
        List feedbackDeltas = new ArrayList();
        if (!(choice.getCashDelta() == 0.0d)) {
            if (choice.getCashDelta() > 0.0d) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Object[] objArr = {Double.valueOf(choice.getCashDelta())};
                String format = String.format("%,.0f", Arrays.copyOf(objArr, objArr.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                str = "+$" + format;
            } else {
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                Object[] objArr2 = {Double.valueOf(-choice.getCashDelta())};
                String format2 = String.format("%,.0f", Arrays.copyOf(objArr2, objArr2.length));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                str = "-$" + format2;
            }
            feedbackDeltas.add(new StatFeedbackItem("Cash", str, choice.getCashDelta() > 0.0d, null, 8, null));
        }
        if (choice.getFansDelta() != 0) {
            if (choice.getFansDelta() > 0) {
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                Object[] objArr3 = {Long.valueOf(choice.getFansDelta())};
                String format3 = String.format("%,d", Arrays.copyOf(objArr3, objArr3.length));
                Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                valueOf = "+" + format3;
            } else {
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                Object[] objArr4 = {Long.valueOf(choice.getFansDelta())};
                String format4 = String.format("%,d", Arrays.copyOf(objArr4, objArr4.length));
                Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
                valueOf = String.valueOf(format4);
            }
            feedbackDeltas.add(new StatFeedbackItem("Fans", valueOf, choice.getFansDelta() > 0, null, 8, null));
        }
        if (!(choice.getReputationDelta() == 0.0f)) {
            feedbackDeltas.add(new StatFeedbackItem("Reputation", choice.getReputationDelta() > 0.0f ? "+" + ((int) choice.getReputationDelta()) + "%" : ((int) choice.getReputationDelta()) + "%", choice.getReputationDelta() > 0.0f, null, 8, null));
        }
        if (!(choice.getStressDelta() == 0.0f)) {
            feedbackDeltas.add(new StatFeedbackItem("Stress", choice.getStressDelta() > 0.0f ? "+" + ((int) choice.getStressDelta()) + "%" : ((int) choice.getStressDelta()) + "%", choice.getStressDelta() <= 0.0f, null, 8, null));
        }
        viewModel.postActionFeedback(choice.getShortTitle(), choice.getOutcomeNarrative(), feedbackDeltas, "star");
        _activeDilemma.setValue((Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0069, code lost:
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final com.example.data.GameStateEntity resolveDilemma$lambda$0(com.example.data.DilemmaChoice r169, com.example.data.CareerDilemma r170, com.example.data.GameStateEntity r171) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.data.CareerDilemmaController.resolveDilemma$lambda$0(com.example.data.DilemmaChoice, com.example.data.CareerDilemma, com.example.data.GameStateEntity):com.example.data.GameStateEntity");
    }
}
