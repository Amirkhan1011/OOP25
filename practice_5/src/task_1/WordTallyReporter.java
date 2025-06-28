package task_1;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class WordTallyReporter {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new HashMap<>();

        Path inputPath = Paths.get("src/task_1/input.txt");
        Path outputPath = Paths.get("src/task_1/report.txt");
        
        try (BufferedReader reader = Files.newBufferedReader(inputPath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading input.txt: " + e.getMessage());
            return;
        }
        
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCounts.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(outputPath))) {
            for (Map.Entry<String, Integer> entry : sortedWords) {
                writer.println(entry.getKey() + ": " + entry.getValue());
            }
            System.out.println("Word tally written to report.txt");
        } catch (IOException e) {
            System.err.println("Error writing to report.txt: " + e.getMessage());
        }
    }
}

