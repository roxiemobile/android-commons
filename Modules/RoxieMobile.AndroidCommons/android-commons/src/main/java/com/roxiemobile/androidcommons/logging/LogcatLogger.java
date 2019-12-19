package com.roxiemobile.androidcommons.logging;

import android.util.Log;

import java.util.concurrent.Callable;

public final class LogcatLogger implements Logger.Contract
{
// MARK: - Methods

    @Override
    public void v(String tag, String msg) {
        if (tag != null && msg != null) {
            Log.v(cropTag(tag), msg);
        }
    }

    @Override
    public void v(String tag, Callable<String> task) {
        try {
            this.v(tag, task.call());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void d(String tag, String msg) {
        if (tag != null && msg != null) {
            Log.d(cropTag(tag), msg);
        }
    }

    @Override
    public void d(String tag, Callable<String> task) {
        try {
            this.d(tag, task.call());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void i(String tag, String msg) {
        if (tag != null && msg != null) {
            Log.i(cropTag(tag), msg);
        }
    }

    @Override
    public void i(String tag, Callable<String> task) {
        try {
            this.i(tag, task.call());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void w(String tag, String msg) {
        if (tag != null && msg != null) {
            Log.w(cropTag(tag), msg);
        }
    }

    @Override
    public void w(String tag, String msg, Throwable err) {
        if (tag != null && msg != null) {
            Log.w(cropTag(tag), msg, err);
        }
    }

    @Override
    public void w(String tag, Throwable err) {
        if (tag != null) {
            Log.w(cropTag(tag), Log.getStackTraceString(err));
        }
    }

    @Override
    public void w(String tag, Callable<String> task) {
        try {
            this.w(tag, task.call());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void w(String tag, Callable<String> task, Throwable err) {
        try {
            this.w(tag, task.call(), err);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void e(String tag, String msg) {
        if (tag != null && msg != null) {
            Log.e(cropTag(tag), msg);
        }
    }

    @Override
    public void e(String tag, String msg, Throwable err) {
        if (tag != null && msg != null) {
            Log.e(cropTag(tag), msg, err);
        }
    }

    @Override
    public void e(String tag, Throwable err) {
        if (tag != null) {
            Log.e(cropTag(tag), Log.getStackTraceString(err));
        }
    }

    @Override
    public void e(String tag, Callable<String> task) {
        try {
            this.e(tag, task.call());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void e(String tag, Callable<String> task, Throwable err) {
        try {
            this.e(tag, task.call(), err);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

// MARK: - Private Methods

    /**
     * This is an Android side limitation:
     * IllegalArgumentException is thrown if the tag.length() > 23
     */
    private static String cropTag(String tag) {
        return (tag.length() > 23) ? tag.substring(0, 23) : tag;
    }
}
