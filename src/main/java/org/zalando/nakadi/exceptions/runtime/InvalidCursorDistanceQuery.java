package org.zalando.nakadi.exceptions.runtime;

public class InvalidCursorDistanceQuery extends MyNakadiRuntimeException1 {
    private final Reason reason;

    public enum Reason {
        INVERTED_TIMELINE_ORDER,
        TIMELINE_NOT_FOUND,
        INVERTED_OFFSET_ORDER,
        PARTITION_NOT_FOUND,
        CURSORS_WITH_DIFFERENT_PARTITION
    }

    public InvalidCursorDistanceQuery(final Reason reason) {
        super();
        this.reason = reason;
    }

    public Reason getReason() {
        return reason;
    }
}
