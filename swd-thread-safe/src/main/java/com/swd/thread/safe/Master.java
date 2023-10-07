package com.swd.thread.safe;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public interface Master<T> {
    T call(Thread thread) throws ExecutionException, InterruptedException, TimeoutException;
}
