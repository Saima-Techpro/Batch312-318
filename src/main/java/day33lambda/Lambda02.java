package day33lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) throws IOException {


        Path path = Path.of("src/main/java/day33lambda/Notes.txt");

        // Task 1: Write code which allows to read all lines from a given file and print on the console

        // Files.lines(path).forEach(Utils::printWithSpace); //will print all lines from the file on the same line on the console
        Files.lines(path).forEach(System.out::println);

        System.out.println("======== Task 2 =======");
        // Task 2: Write code which allows to read all lines from a given file and print on the console in UPPERCASE
        // Files.lines(path).map(String::toUpperCase).forEach(System.out::println);

        System.out.println("======== Task 3 =======");
        // Task 3: Write code which prints all words from the file
        List<String> words = Files.lines(path).
                                    map(t -> t.replaceAll("\\p{Punct}", "").
                                    split(" ")). // returns Array of strings
                                    flatMap(Arrays::stream). // flatMap() function returns the Array of Strings back to stream
                                    toList();

        System.out.println("words = " + words);
        System.out.println("words.size() = " + words.size()); // 535


        System.out.println("======== Task 4 =======");
        // Task 4: Write code which prints UNIQUE words from the file
        List<String> uniqueWords = Files.lines(path).
                                    map(t -> t.replaceAll("\\p{Punct}", "").
                                    split(" ")). // returns Array of strings
                                    flatMap(Arrays::stream). // flatMap() function returns the Array of Strings back to stream
                                    distinct().
                                    toList();

        System.out.println("uniqueWords = " + uniqueWords);
        System.out.println("uniqueWords.size() = " + uniqueWords.size()); // 134


    }
}
