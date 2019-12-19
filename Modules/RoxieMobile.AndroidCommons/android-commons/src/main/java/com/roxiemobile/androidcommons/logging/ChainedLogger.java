package com.roxiemobile.androidcommons.logging;

import com.roxiemobile.androidcommons.logging.Logger.Contract;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public final class ChainedLogger implements Logger.Contract
{
// MARK: - Construction

    public ChainedLogger(Logger.Contract... loggers) {
        // Init instance variables
        mLoggers = (loggers == null) ? Collections.EMPTY_LIST : Arrays.asList(loggers);
    }

// MARK: - Methods

    @Override
    public void v(String tag, String msg) {
        for (Contract logger : mLoggers) {
            logger.v(tag, msg);
        }
    }

    @Override
    public void v(String tag, Callable<String> task) {
        for (Contract logger : mLoggers) {
            logger.v(tag, task);
        }
    }

    @Override
    public void d(String tag, String msg) {
        for (Contract logger : mLoggers) {
            logger.d(tag, msg);
        }
    }

    @Override
    public void d(String tag, Callable<String> task) {
        for (Contract logger : mLoggers) {
            logger.d(tag, task);
        }
    }

    @Override
    public void i(String tag, String msg) {
        for (Contract logger : mLoggers) {
            logger.i(tag, msg);
        }
    }

    @Override
    public void i(String tag, Callable<String> task) {
        for (Contract logger : mLoggers) {
            logger.i(tag, task);
        }
    }

    @Override
    public void w(String tag, String msg) {
        for (Contract logger : mLoggers) {
            logger.w(tag, msg);
        }
    }

    @Override
    public void w(String tag, String msg, Throwable err) {
        for (Contract logger : mLoggers) {
            logger.w(tag, msg, err);
        }
    }

    @Override
    public void w(String tag, Throwable err) {
        for (Contract logger : mLoggers) {
            logger.w(tag, err);
        }
    }

    @Override
    public void w(String tag, Callable<String> task) {
        for (Contract logger : mLoggers) {
            logger.w(tag, task);
        }
    }

    @Override
    public void w(String tag, Callable<String> task, Throwable err) {
        for (Contract logger : mLoggers) {
            logger.w(tag, task, err);
        }
    }

    @Override
    public void e(String tag, String msg) {
        for (Contract logger : mLoggers) {
            logger.e(tag, msg);
        }
    }

    @Override
    public void e(String tag, String msg, Throwable err) {
        for (Contract logger : mLoggers) {
            logger.e(tag, msg, err);
        }
    }

    @Override
    public void e(String tag, Throwable err) {
        for (Contract logger : mLoggers) {
            logger.e(tag, err);
        }
    }

    @Override
    public void e(String tag, Callable<String> task) {
        for (Contract logger : mLoggers) {
            logger.e(tag, task);
        }
    }

    @Override
    public void e(String tag, Callable<String> task, Throwable err) {
        for (Contract logger : mLoggers) {
            logger.e(tag, task, err);
        }
    }

// MARK: - Variables

    private final List<Contract> mLoggers;
}
