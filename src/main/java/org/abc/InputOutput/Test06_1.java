package org.abc.InputOutput;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test06_1 {
    public static void main(String[] args) {
        try {
            Path dir = Paths.get("c:", "work2", "subDir");//1.처음 경로의 path 경로 2. more additional 경로
            Files.createDirectories(dir);

            Path file1 = Paths.get("c:\\work2\\file1.txt");
            Files.createFile(file1);

            File f1 = new File("C:\\work2\\file1.txt");
            Path p1 = f1.toPath(); //File 형식을 Path 로 변형

            File f2 = file1.toFile(); //Path 형식을 File로 변형
            Path file2 =  dir.resolve("file2.txt");
            Path normalPath = file2.normalize();
            Path root = file2.getRoot();
            Path parent = file2.getParent();
            System.out.println("Path normalize : " + normalPath);
            System.out.println("root 경로 : " + root);
            System.out.println("parent 경로 : " + parent);

            if (Files.exists(file1)) {
                System.out.println(file1 + " 존재");
                try (PrintWriter out = new PrintWriter(f2)) {
                    out.println("hello java!");
                }
            }

            if (Files.notExists(file2)) {
                System.out.println(file2 + " 존재하지 않음");
            }

            Path file3 = dir.resolve("file3.txt");
            Files.copy(file1, file3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
