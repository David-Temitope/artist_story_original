package com.example.data

import android.content.Context
import androidx.room.*
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.flow.Flow

@Dao
interface GameStateDao {
    @Query("SELECT * FROM game_states WHERE email = :email")
    fun getGameState(email: String): Flow<GameStateEntity?>

    @Query("SELECT * FROM game_states WHERE email = :email")
    suspend fun getGameStateDirect(email: String): GameStateEntity?

    @Query("SELECT * FROM game_states")
    fun getAllGameStates(): Flow<List<GameStateEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertGameState(gameState: GameStateEntity)

    @Query("DELETE FROM game_states WHERE email = :email")
    suspend fun deleteGameState(email: String)
}

@Database(entities = [GameStateEntity::class], version = 21, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun gameStateDao(): GameStateDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        private fun safeMigrate(db: SupportSQLiteDatabase) {
            val columns = listOf(
                "ALTER TABLE game_states ADD COLUMN activeLoanContracts TEXT NOT NULL DEFAULT '[]'",
                "ALTER TABLE game_states ADD COLUMN purchasedEbooks TEXT NOT NULL DEFAULT '[]'",
                "ALTER TABLE game_states ADD COLUMN stressUntreatedWeeks INTEGER NOT NULL DEFAULT 0",
                "ALTER TABLE game_states ADD COLUMN stressTreatedConsecutiveWeeks INTEGER NOT NULL DEFAULT 0",
                "ALTER TABLE game_states ADD COLUMN stressTreatedThisWeek INTEGER NOT NULL DEFAULT 0"
            )
            for (sql in columns) {
                try {
                    db.execSQL(sql)
                } catch (_: Throwable) {}
            }
        }

        val MIGRATION_20_21 = object : Migration(20, 21) {
            override fun migrate(db: SupportSQLiteDatabase) {
                safeMigrate(db)
            }
        }

        val MIGRATION_19_21 = object : Migration(19, 21) {
            override fun migrate(db: SupportSQLiteDatabase) {
                safeMigrate(db)
            }
        }

        val MIGRATION_18_21 = object : Migration(18, 21) {
            override fun migrate(db: SupportSQLiteDatabase) {
                safeMigrate(db)
            }
        }

        val MIGRATION_17_21 = object : Migration(17, 21) {
            override fun migrate(db: SupportSQLiteDatabase) {
                safeMigrate(db)
            }
        }

        val MIGRATION_19_20 = object : Migration(19, 20) {
            override fun migrate(db: SupportSQLiteDatabase) {
                safeMigrate(db)
            }
        }

        val MIGRATION_18_20 = object : Migration(18, 20) {
            override fun migrate(db: SupportSQLiteDatabase) {
                safeMigrate(db)
            }
        }

        val MIGRATION_17_20 = object : Migration(17, 20) {
            override fun migrate(db: SupportSQLiteDatabase) {
                safeMigrate(db)
            }
        }

        private fun createBuilder(context: Context): RoomDatabase.Builder<AppDatabase> {
            val builder = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "artist_story_database"
            )
            builder.addMigrations(
                MIGRATION_20_21,
                MIGRATION_19_21,
                MIGRATION_18_21,
                MIGRATION_17_21,
                MIGRATION_19_20,
                MIGRATION_18_20,
                MIGRATION_17_20
            )
            builder.fallbackToDestructiveMigration(true)
            builder.fallbackToDestructiveMigrationOnDowngrade(true)
            builder.allowMainThreadQueries()
            builder.addCallback(object : RoomDatabase.Callback() {
                override fun onOpen(db: SupportSQLiteDatabase) {
                    super.onOpen(db)
                    safeMigrate(db)
                }
            })
            return builder
        }

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val current = INSTANCE
                if (current != null) return@synchronized current

                val appContext = context.applicationContext
                val instance = createBuilder(appContext).build()
                INSTANCE = instance
                instance
            }
        }
    }
}
