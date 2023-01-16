package Homework12;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger { // Логирование арифметических операция в файл txt.
    public static void logger(String output) {
        Date dt = new Date();
        try (FileWriter writer = new FileWriter("logger.txt", true)) {
            writer.append(dt + ":   " + output + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
