package imaginamos.test.sart.com.testimg;

import android.graphics.Bitmap;

import com.squareup.picasso.Picasso;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by SergioAlejandro on 30/11/2017.
 */

public class PicassoTest {


    @Test
    public void testPicassaDownloadImageBitmapDifferentThenNull_positive() {
        String urlImage = "https://a.thumbs.redditmedia.com/9zfV0uAe-z008QZ0NJnHQ34o30cmLCN9-qBCgAZGcc0.png";
        try {
            Bitmap bitmap = Picasso.with(App.get()).load(urlImage).get();
            assertTrue("Bitmap is null, test failed", bitmap != null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
