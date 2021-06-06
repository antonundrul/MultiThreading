package by.undrul.multithreading.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Queue;

public class Ferry {
    public static Logger logger = LogManager.getLogger();
    public static Ferry instance;
    private int ferryArea;
    private int ferryLiftingCapacity;
    private Queue<Car> carQueue;

    private Ferry(){

    }

    public static Ferry getInstance(){
        if (instance == null) {
            instance = new Ferry();
        }
        return instance;
    }
}
