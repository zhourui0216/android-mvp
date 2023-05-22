package com.example.mvp.utils;

import android.util.Log;

public class LogUtil {
    public static final int NOTHING = 0;
    public static final int VERBOSE = 1;
    public static final int DEBUG = 2;
    public static final int INFO = 3;
    public static final int WARNING = 4;
    public static final int ERROR = 5;
    public static int LEVEL = ERROR;

    // 不需要再在类中定义TAG，直接打印日志信息
    public static void v(String mess) {
        if (LEVEL >= 1) {
            Log.v(getTag(), mess);
        }
    }

    public static void d(String mess) {
        if (LEVEL >= 2) {
            Log.d(getTag(), mess);
        }
    }

    public static void i(String mess) {
        if (LEVEL >= 3) {
            Log.i(getTag(), mess);
        }
    }

    public static void w(String mess) {
        if (LEVEL >= 4) {
            Log.w(getTag(), mess);
        }
    }

    public static void e(String mess) {
        if (LEVEL >= 5) {
            Log.e(getTag(), mess);
        }
    }

    /**
     * 获取到调用者的类名
     *
     * @return 调用者的类名
     */
    private static String getTag() {
        StackTraceElement[] trace = new Throwable().fillInStackTrace()
                .getStackTrace();
        String callingClass = "";
        for (int i = 2; i < trace.length; i++) {
            Class<?> clazz = trace[i].getClass();
            if (!clazz.equals(LogUtil.class)) {
                callingClass = trace[i].getClassName();
                callingClass = callingClass.substring(callingClass
                        .lastIndexOf('.') + 1);
                break;
            }
        }
        return callingClass;
    }
}
