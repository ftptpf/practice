package ru.practice.readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Программа считает количество вхождений слов в текстовом файле.
 * Файл "text.txt" с текстом расположен в той же папке, что и программа.
 * Слово в качестве аргумента берется из аргумента командной строки программы.
 */
public class CountWordFromFile {
    public static void main(String[] args) throws IOException {
        int counter = 0;
        String classPath = CountWordFromFile.class
                .getProtectionDomain()
                .getCodeSource()
                .getLocation()
                .getFile();
        String targetFile = "text.txt";
        Path path = Path.of(classPath + targetFile);
        if (args.length > 0) {
            String target = args[0];
            try (Stream<String> stream = Files.lines(path)) {
                String[] array = stream.collect(Collectors.joining()).split("");
                for (String word : array) {
                    if (word.equals(target)) {
                        counter++;
                    }
                }
            } catch (NoSuchFileException e) {
                e.printStackTrace();
            }
            System.out.println("The word " + target + " is present in text " + counter + " times");
        } else {
            System.out.println("Please add word to search argument your program command line.");
        }
    }
}
