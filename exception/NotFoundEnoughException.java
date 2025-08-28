package br.com.dio.model.exception;

public class NotFoundEnoughException extends RuntimeException {
    public NotFoundEnoughException(String message) {
        super(message);
    }
}
