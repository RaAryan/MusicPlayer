package com.shiva.musicplayer;

/**
 * Created by Shambhu on 3/15/2017.
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.shiva.musicplayer.action.main";
        public static String INIT_ACTION = "com.shiva.musicplayer.action.init";
        public static String PREV_ACTION = "com.shiva.musicplayer.action.prev";
        public static String PLAY_ACTION = "com.shiva.musicplayer.action.play";
        public static String NEXT_ACTION = "com.shiva.musicplayer.action.next";
        public static String STARTFOREGROUND_ACTION = "com.shiva.musicplayer.action.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.shiva.musicplayer.action.stopforeground";

    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }

    public static Bitmap getDefaultAlbumArt(Context context) {
        Bitmap bm = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            bm = BitmapFactory.decodeResource(context.getResources(),
                    R.drawable.default_album_art, options);
        } catch (Error ee) {
        } catch (Exception e) {
        }
        return bm;
    }

}