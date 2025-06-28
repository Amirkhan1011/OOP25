package task_3;

import java.io.*;
import java.util.*;

public class TemperatureLogger {

    private static final String TEXT_INPUT = "src/task_3/sensor_readings.txt"; 
    private static final String BINARY_FILE = "src/task_3/temp.bin";

    public static void main(String[] args) {
        try {
            List<Double> temps = readTemperaturesFromTxt(TEXT_INPUT);
            writeTemperaturesToBinary(temps, BINARY_FILE);
            readAndPrintStats(BINARY_FILE);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static List<Double> readTemperaturesFromTxt(String filename) throws IOException {
        List<Double> temperatures = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    double temp = Double.parseDouble(line.trim());
                    temperatures.add(temp);
                } catch (NumberFormatException e) {
                    System.out.println("An incorrect line was omitted: " + line);
                }
            }
        }
        return temperatures;
    }

    private static void writeTemperaturesToBinary(List<Double> temperatures, String filename) throws IOException {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
            for (double temp : temperatures) {
                out.writeDouble(temp);
            }
        }
    }

    private static void readAndPrintStats(String filename) throws IOException {
        double sum = 0, min = Double.MAX_VALUE, max = Double.MIN_VALUE;
        int count = 0;

        try (DataInputStream in = new DataInputStream(new FileInputStream(filename))) {
            while (in.available() >= 8) {
                double temp = in.readDouble();
                sum += temp;
                if (temp < min) min = temp;
                if (temp > max) max = temp;
                count++;
            }
        }

        if (count == 0) {
            System.out.println("No data");
        } else {
            System.out.printf("Min: %.2f°C\n", min);
            System.out.printf("Max: %.2f°C\n", max);
            System.out.printf("Avg: %.2f°C\n", sum / count);
        }
    }
}

