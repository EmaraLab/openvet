package com.emaratech.lab.business.core;

public enum OperationResult {
    Failure(1, "FAILURE"),
    Success(0, "SUCCESS");

    private OperationResult(int success, String message) {
        this.message = message;
        this.success = success;
    }

    public boolean isSuccess() {
        return success == 0;
    }

    public boolean isFailure() {
        return success == 1;
    }

    public String getMessage() {
        return message;
    }

    private final int success;
    private final String message;
}
