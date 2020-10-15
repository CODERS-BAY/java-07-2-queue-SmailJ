package com.codersbay;

public class QueueTooSmallException extends Exception {
    public QueueTooSmallException(String message) {
        super(message);
    }
}