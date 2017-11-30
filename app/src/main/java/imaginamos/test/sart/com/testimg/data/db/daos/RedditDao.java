package imaginamos.test.sart.com.testimg.data.db.daos;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import imaginamos.test.sart.com.testimg.data.db.models.Reddit;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

@Dao
public interface RedditDao {

    @Query("SELECT * FROM reddits")
    LiveData<List<Reddit>> getReddits();

    @Query("SELECT * FROM reddits WHERE id = :id")
    LiveData<Reddit> getRedditById(String id);

    @Insert(onConflict = REPLACE)
    void addReddit(Reddit reddit);

    @Delete
    void deleteReddit(Reddit reddit);
}
