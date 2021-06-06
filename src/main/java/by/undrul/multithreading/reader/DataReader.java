package by.undrul.multithreading.reader;

import by.undrul.multithreading.exception.MultiThreadingException;

import java.util.ArrayList;

public interface DataReader {
    ArrayList<String> readDataFromFile(String filepath) throws MultiThreadingException;
}
