package by.undrul.multithreading.util;

public class IdGenerator {
    private static long counter;

    static {
        counter = 0;
    }

    public static long generateId() {
        counter++;
        return counter;
    }
}

