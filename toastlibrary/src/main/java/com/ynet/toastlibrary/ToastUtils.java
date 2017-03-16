package com.ynet.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * 项目名称：OpenSourceDemo
 * 创建人：super_peng
 * 创建时间：2017/3/16 0016 上午 11:00
 * 类描述：
 */

public class ToastUtils {

    public static void showToast(Context context, String text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

}
