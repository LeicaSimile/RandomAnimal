package leicasimile.randomanimal
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import org.jetbrains.anko.db.ManagedSQLiteOpenHelper

class DatabaseHelper(ctx: Context) : ManagedSQLiteOpenHelper(ctx, "", null, 1) {
    companion object {
        private var instance: DatabaseHelper? = null

        @Synchronized
        fun Instance(ctx: Context): DatabaseHelper {
            if (instance == null) {
                instance = DatabaseHelper(ctx.applicationContext)
            }
            return instance!!
        }
    }

    override fun onCreate(db: SQLiteDatabase) {
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
    }
}