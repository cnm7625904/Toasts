package com.toast.wang.toastutils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator。 on 2018/1/14.
 */

public  class ToastUtils {
    private static Toast toast=null;

    /**
     * 长吐司
     * @param context
     * @param message
     */
    public static void  showLongToast(Context context, CharSequence message){
        if(toast==null){
            toast= Toast.makeText(context,message, Toast.LENGTH_LONG);
        }else {
            toast.setText(message);
        }
        toast.show();
    }

    /**
     * 短吐司
     * @param context
     * @param message
     */
    public static void  showShortToast(Context context, CharSequence message){
        if(toast==null){
            toast= Toast.makeText(context,message, Toast.LENGTH_SHORT);
        }else {
            toast.setText(message);
        }
        toast.show();
    }

    /**
     * 取消吐司
     */
    public static void cancleToast(){
        if(toast!=null){
            toast.cancel();
            toast=null;
        }
    }

}
