package by.undrul.multithreading.reader.impl;

import by.undrul.multithreading.exception.MultiThreadingException;
import by.undrul.multithreading.reader.DataReader;
import by.undrul.multithreading.validator.FileValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.stream.Stream;

public class DataReaderImpl implements DataReader {

    private static Logger logger = LogManager.getLogger();

    @Override
    public ArrayList<String> readDataFromFile(String filepath) throws MultiThreadingException {
        logger.info("Method to read data from file started");

        if (!FileValidator.isFileValid(filepath)) {
            throw new MultiThreadingException("File " + filepath + " is empty or don't exist or has incorrect filepath");
        }

        ArrayList<String> dataFromFile = new ArrayList<>();
        File file = new File(filepath);

        try (Stream<String> linesStream = Files.lines(file.toPath())) {
            linesStream.forEach(dataFromFile::add);

        } catch (Exception e) {
            throw new MultiThreadingException("File is not found", e);
        }

        logger.info("Data from file read");
        return dataFromFile;

    }
}
