package Patterns;

import java.nio.file.*;
import java.io.IOException;

public class CountFilesNIO {
    public static void main(String[] args) throws IOException {
        long count = Files.list(Paths.get("."))
                          .filter(Files::isRegularFile)
                          .count();

        System.out.println("Number of files: " + count);
    }
}