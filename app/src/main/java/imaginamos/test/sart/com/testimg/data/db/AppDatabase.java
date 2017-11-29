package imaginamos.test.sart.com.testimg.data.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

import imaginamos.test.sart.com.testimg.App;
import imaginamos.test.sart.com.testimg.data.db.daos.RedditDao;
import imaginamos.test.sart.com.testimg.data.db.models.Reddit;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */
@Database(entities = {Reddit.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public static AppDatabase get() {
        if (instance == null) {
            instance = Room.databaseBuilder(App.get(), AppDatabase.class,
                    "reddit_imagi_db").allowMainThreadQueries().build();
        }
        return instance;
    }

    /*private static synchronized AppDatabase getSync() {
        if (instance == null) {

        }
        return instance;
    }*/

    public abstract RedditDao queryRedditsDB();
}
