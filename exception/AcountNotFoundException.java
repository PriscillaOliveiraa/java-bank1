package br.com.dio.model.exception;

public class AcountNotFoundException extends RuntimeException {
    public AcountNotFoundException(String message) {
        super(message);
    }

}
