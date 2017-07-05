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
    private static final String rank1 = null;
    private static final String rank2 = null;
    private static final String rank3 = null;
    private static final String rank4 = null;
    private static final String rank5 = null;
    private static final String rank6 = null;
    private static final String rank7 = null;
    private static final String rank8 = null;
    private static final String rank9 = null;
    private static final String rank10 = null;
    private static final String rank11 = null;


    public static void setStoredText(Context context, int upTick, int playerRank){
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        SharedPreferences.Editor editor = sharedPreferences.edit();

        String player = String.format("rank%d", playerRank);
        editor.putInt(player, upTick);
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
