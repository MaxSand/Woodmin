package app.bennsandoval.com.woodmin.utilities;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import app.bennsandoval.com.woodmin.R;

/**
 * Created by Mackbook on 12/23/14.
 */
public class Utility {

    public static String getPreferredUser(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(context.getString(R.string.pref_user_key),null);
    }

    public static String getPreferredSecret(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(context.getString(R.string.pref_secret_key),null);
    }

    public static Long getPreferredLastSync(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getLong(context.getString(R.string.pref_last_update_key),0);
    }

    public static String getPreferredServer(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getString(context.getString(R.string.pref_server),null);
    }

    public static Long setPreferredLastSync(Context context, Long time) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putLong(context.getString(R.string.pref_last_update_key), time);
        editor.apply();
        return prefs.getLong(context.getString(R.string.pref_last_update_key),0);
    }

    public static void setPreferredUserSecret(Context context, String user, String secret) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(context.getString(R.string.pref_user_key), user);
        editor.putString(context.getString(R.string.pref_secret_key), secret);
        editor.apply();
    }

    public static String setPreferredServer(Context context, String server) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString(context.getString(R.string.pref_server), server);
        editor.apply();
        return prefs.getString(context.getString(R.string.pref_server),null);
    }

}
