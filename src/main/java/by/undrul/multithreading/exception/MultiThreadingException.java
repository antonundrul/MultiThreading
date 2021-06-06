package by.undrul.multithreading.exception;

public class MultiThreadingException extends Exception{
    public MultiThreadingException() {
        super();
    }

    public MultiThreadingException(String message) {
        super(message);
    }

    public MultiThreadingException(String message, Throwable cause) {
        super(message, cause);
    }

    public MultiThreadingException(Throwable cause) {
        super(cause);
    }
}
