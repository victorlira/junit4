package org.junit.runners.model;

import java.util.concurrent.TimeUnit;

/**
 * Exception thrown when a test fails on timeout.
 * 
 * @since 4.12
 * 
 */
public class TestFailedOnTimeoutException extends Exception {

    private static final long serialVersionUID = 31935685163547539L;

    private TimeUnit fTimeUnit;
    private long fTimeout;

    /**
     * Creates exception with a standard message "test timed out after [timeout] [timeUnit]"
     * 
     * @param timeout The amount of time passed before the test was interrupted
     * @param timeUnit The time unit for the timeout value
     */
    public TestFailedOnTimeoutException(long timeout, TimeUnit timeUnit) {
        super(String.format("test timed out after %d %s", timeout, timeUnit
                .name().toLowerCase()));
        fTimeUnit = timeUnit;
        fTimeout = timeout;
    }

    /**
     * @return the time passed before the test was interrupted
     */
    public long getTimeout() {
        return fTimeout;
    }

    /**
     * @return The time unit for the timeout value
     */
    public TimeUnit getTimeUnit() {
        return fTimeUnit;
    }
}