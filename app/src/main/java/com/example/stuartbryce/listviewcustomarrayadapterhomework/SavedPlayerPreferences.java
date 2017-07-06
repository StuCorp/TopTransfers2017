package com.example.stuartbryce.listviewcustomarrayadapterhomework;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.ArrayList;

import static com.example.stuartbryce.listviewcustomarrayadapterhomework.R.id.rank;

/**
 * Created by stuartbryce on 2017-07-05.
 */

public class SavedPlayerPreferences {

//    private static final ArrayList<Integer> PREF_INTARRAY = new ArrayList<>();
//    private static final String rank1 = "rank1";



    public static void setStoredText(Context context, int upTick, int playerRank){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        String player = String.format("rank%d", playerRank);
        editor.putInt(player, upTick);

        String my_key = "key";
        editor.putString(my_key, "value");

        editor.apply();

//        or one line:
//        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(PREF_SAVEDTEXT, text).apply();

//        or more lines :
//        PreferenceManager.getDefaultSharedPreferences(context)
//              .edit()
//              .putString(PREF_SAVEDTEXT, text)
//              .apply();
    }


    public static String getStoredText(Context context, int playerRank){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        String player = String.format("rank%d", playerRank);
        return sharedPreferences.getString(player, null);
    }

}
