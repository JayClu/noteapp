package hoangloc.mynoteapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import hoangloc.mynoteapp.data.NoteDatabaseDao.NoteDatabaseDao
import hoangloc.mynoteapp.data.entity.Note


@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDatabaseDao
}
