package org.abc.InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test14 {
    public static void main(String[] args) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("a.zip"))) { //압축파일을 객체에 연결
            ZipEntry entry = null; //엔트리 초기화
            while ((entry = zis.getNextEntry()) != null) { //다음 엔트리가 없을 때 까지
                try (FileOutputStream out = new FileOutputStream("c:\\work\\" + entry.getName())) {//출력 스트림 생성
                    byte[] buf = new byte[1024];
                    int len = 0;
                    while ((len = zis.read(buf)) != -1) {//압축파일 내의 엔트리 읽음
                        out.write(buf, 0, len); //압축파일 내의 내용 모두 출력
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
