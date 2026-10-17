package com.example.data;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AppDatabase.kt */
@Dao
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n��\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018��2\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\n0\u0003H'J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H§@¢\u0006\u0002\u0010\b¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/example/data/GameStateDao;", "", "getGameState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/data/GameStateEntity;", "email", "", "getGameStateDirect", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllGameStates", "", "insertGameState", "", "gameState", "(Lcom/example/data/GameStateEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGameState", "app"})
/* loaded from: GameStateDao.class */
public interface GameStateDao {
    @Query("SELECT * FROM game_states WHERE email = :email")
    @NotNull
    Flow<GameStateEntity> getGameState(@NotNull String str);

    @Query("SELECT * FROM game_states WHERE email = :email")
    @Nullable
    Object getGameStateDirect(@NotNull String str, @NotNull Continuation<? super GameStateEntity> continuation);

    @Query("SELECT * FROM game_states")
    @NotNull
    Flow<List<GameStateEntity>> getAllGameStates();

    @Insert(onConflict = 1)
    @Nullable
    Object insertGameState(@NotNull GameStateEntity gameStateEntity, @NotNull Continuation<? super Unit> continuation);

    @Query("DELETE FROM game_states WHERE email = :email")
    @Nullable
    Object deleteGameState(@NotNull String str, @NotNull Continuation<? super Unit> continuation);
}
