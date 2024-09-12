package hoangloc.mynoteapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

import androidx.room.Room
import hoangloc.mynoteapp.data.database.NoteDatabase

@HiltAndroidApp
class NoteApplication : Application()  {

    companion object {
        var database: NoteDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()

        // Khởi tạo Room database
        database = Room.databaseBuilder(
            applicationContext,
            NoteDatabase::class.java,
            "notes_database"
        ).build()
    }
}