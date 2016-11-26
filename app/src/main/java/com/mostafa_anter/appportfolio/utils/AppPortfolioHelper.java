package com.mostafa_anter.appportfolio.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by mostafa_anter on 11/26/16.
 */

public class AppPortfolioHelper {
    /**
     *
     * @param view your clickable view
     * @param message that you want to show
     */
    public static void showSnackbar(View view, String message){
        Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
