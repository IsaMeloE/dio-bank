package br.com.dio.exception;

public class NotFundsEnoughException extends RuntimeException {
    public NotFundsEnoughException(String message) {
        super(message);
    }
}
