package org.abc.InputOutput;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test13 {
    public static void main(String[] args) {
        try(ZipOutputStream zos=new ZipOutputStream(new FileOutputStream("a.zip"))) { //압축파일 생성 객체
            ZipEntry entry=new ZipEntry("a.txt"); //압축파일 내부의 파일 표현을 위한 ZipEntry 객체 생성
            zos.putNextEntry(entry);//a.zip 에 a.txt 엔트리 추가
            byte[] data= Files.readAllBytes(Paths.get("a.txt")); //a.txt 읽고 바이트 배열로 변환
            zos.write(data); //a.txt에 내용 추가, 안하면 entry만 생성되고 내용은 빈껍데기

            entry=new ZipEntry("a2.txt");
            zos.putNextEntry(entry);
            zos.write(Files.readAllBytes(Paths.get("a2.txt")));

            entry=new ZipEntry("a3.txt");
            zos.putNextEntry(entry);
            zos.write(Files.readAllBytes(Paths.get("a3.txt")));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
