package com.emaratech.lab.business.core;

import java.util.ArrayList;
import java.util.List;


public class Result<T> {
    public T getResult() {
        return result;
    }

    public List<ErrorMessageDetails> getErrorMessageDetails() {
        return errorMessageDetails;
    }

    private static enum ErrorLevel {
        Warn,
        Info,
        FatalError
    }

    private Result() {

    }

    private Result(OperationResult result, T data) {
        this.opResult = result;
        this.result = data;
    }

    private OperationResult opResult;
    private T result;
    private List<ErrorMessageDetails> errorMessageDetails;

    public static class ErrorMessageDetails {
        private int errorCode;
        private String errorMessage;
        private ErrorLevel errorLevel;

        public ErrorMessageDetails(int errorCode, String errorMessage, ErrorLevel errorLevel) {
            this.errorCode = errorCode;
            this.errorMessage = errorMessage;
            this.errorLevel = errorLevel;
        }

        public boolean isFatal() {
            return ErrorLevel.FatalError == errorLevel;
        }

        public boolean isWarning() {
            return ErrorLevel.Info == errorLevel;
        }

        public boolean isInfo() {
            return ErrorLevel.Warn == errorLevel;
        }
    }

    public boolean getOpResult() {
        return opResult.isSuccess();
    }

    public boolean isFailure() {
        return opResult.isFailure();
    }

    public boolean isSuccess() {
        return opResult.isSuccess();
    }

    public Result(OperationResult successFlag) {
        this.opResult = successFlag;
    }

    private Result<T> addErrorMessage(int errorCode, String errorMessage) {
        if(null == errorMessageDetails) {
            errorMessageDetails = new ArrayList<ErrorMessageDetails>();
        }
        errorMessageDetails.add(new ErrorMessageDetails(errorCode, errorMessage,
                ErrorLevel.FatalError));
        return this;
    }

    private Result<T> addErrorMessage(ErrorMessageDetails errorMessage) {
        if(null == errorMessageDetails) {
            errorMessageDetails = new ArrayList<ErrorMessageDetails>();
        }
        errorMessageDetails.add(errorMessage);
        return this;
    }

    public static <U> Result<U> success(U returnType) {
        return new Result<U>(OperationResult.Success, returnType);
    }

    public static <U> Result<U> failure(U returnType) {
        return new Result<U>(OperationResult.Failure, returnType);
    }

    public static <U> Result<U> success(U returnType, List<ErrorMessageDetails> messages) {
        Result<U> returnMessage = new Result<U>(OperationResult.Success, returnType);
        for(ErrorMessageDetails errorMessage : messages) {
            returnMessage.addErrorMessage(errorMessage);
        }
        return returnMessage;
    }

    public static <U> Result<U> success(U returnType, ErrorMessageDetails message) {
        return new Result<U>(OperationResult.Success).addErrorMessage(message);
    }


    public static <U> Result<U> failure(U returnType, List<ErrorMessageDetails> messages) {
        Result<U> returnMessage = new Result<U>(OperationResult.Failure, returnType);
        for(ErrorMessageDetails errorMessage : messages) {
            returnMessage.addErrorMessage(errorMessage);
        }
        return returnMessage;
    }


    public static <U> Result<U> failure(U returnType, ErrorMessageDetails message) {
        return new Result<U>(OperationResult.Failure).addErrorMessage(message);
    }
}
