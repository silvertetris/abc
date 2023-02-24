package org.abc.InputOutput;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Test06_2 {
    public static void main(String[] args) {
        try{
            Path input = Paths.get("a.txt");

            byte[] bytes= Files.readAllBytes(input);
            System.out.println("== readAllBytes ==");
            System.out.println(new String(bytes));

            System.out.println("\n== readAllInes( ) ==");
            List<String> lines=Files.readAllLines(input);
            for(String line:lines) {
                System.out.println(line);
            }

            Path out1=Paths.get("c.txt");
            Files.write(out1, bytes);

            Path out2=Paths.get("d.txt");
            Files.write(out2, lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
