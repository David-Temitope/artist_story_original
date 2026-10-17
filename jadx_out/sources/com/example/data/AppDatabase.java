package com.example.data;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: AppDatabase.kt */
@TypeConverters({Converters.class})
@StabilityInferred(parameters = 0)
@Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018�� \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/example/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "gameStateDao", "Lcom/example/data/GameStateDao;", "Companion", "app"})
@Database(entities = {GameStateEntity.class}, version = 17, exportSchema = false)
/* loaded from: AppDatabase.class */
public abstract class AppDatabase extends RoomDatabase {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Nullable
    private static volatile AppDatabase INSTANCE;

    @NotNull
    public abstract GameStateDao gameStateDao();

    /* compiled from: AppDatabase.kt */
    @Metadata(mv = {2, 2, 0}, k = 1, xi = 48, d1 = {"��\u001a\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n��\b\u0086\u0003\u0018��2\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n��¨\u0006\t"}, d2 = {"Lcom/example/data/AppDatabase$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/example/data/AppDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app"})
    /* loaded from: AppDatabase$Companion.class */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        private Companion() {
        }

        @NotNull
        public final AppDatabase getDatabase(@NotNull Context context) {
            AppDatabase appDatabase;
            AppDatabase appDatabase2;
            Intrinsics.checkNotNullParameter(context, "context");
            AppDatabase appDatabase3 = AppDatabase.INSTANCE;
            if (appDatabase3 != null) {
                return appDatabase3;
            }
            synchronized (this) {
                try {
                    Context applicationContext = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                    AppDatabase appDatabase4 = (AppDatabase) Room.databaseBuilder(applicationContext, AppDatabase.class, "artist_story_database").fallbackToDestructiveMigration(true).fallbackToDestructiveMigrationOnDowngrade(true).build();
                    Companion companion = AppDatabase.Companion;
                    AppDatabase.INSTANCE = appDatabase4;
                    appDatabase = appDatabase4;
                } catch (Exception e) {
                    Log.e("AppDatabase", "Error initializing database, rebuilding cleanly: " + e.getMessage());
                    try {
                        context.getApplicationContext().deleteDatabase("artist_story_database");
                    } catch (Exception e2) {
                    }
                    Context applicationContext2 = context.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
                    AppDatabase appDatabase5 = (AppDatabase) Room.databaseBuilder(applicationContext2, AppDatabase.class, "artist_story_database").fallbackToDestructiveMigration(true).fallbackToDestructiveMigrationOnDowngrade(true).build();
                    Companion companion2 = AppDatabase.Companion;
                    AppDatabase.INSTANCE = appDatabase5;
                    appDatabase = appDatabase5;
                }
                appDatabase2 = appDatabase;
            }
            return appDatabase2;
        }
    }
}
