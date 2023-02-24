package org.abc.InputOutput;

import java.io.File;
import java.io.PrintWriter;

public class Test05 {
    public static void main(String[] args) {
        try {
            File dir = new File("c:\\work"); //경로를 가지는 dir의 File 객체 생성
            dir.mkdir();//mkdir == make directory 경로를 실제로 생성

            File file = new File(dir, "file1.txt");//상위 경로 = dir, 하위 경로=file1.txt
            file.createNewFile();//실제로 파일 생성

            if (dir.isDirectory()) {
                System.out.println(dir.getName() + "은 디렉터리 입니다.");
            }
            if (file.isFile()) {
                System.out.println(file.getName() + "은 파일입니다.");
            }
            if (file.exists()) {
                try (PrintWriter out = new PrintWriter(file)) { //PrintWrite= 출력 스트림, try 문이기 때문에 작업 끝나면 스트림 해제
                    out.println("hello java!");
                }
                System.out.println("파일 이름 : " + file.getName());
                System.out.println("파일 경로 : " + file.getPath());
                System.out.println("쓰기 가능 : " + file.canWrite());
                System.out.println("읽기 가능 : " + file.canRead());
                System.out.println("파일 길이 : " + file.length() + " 바이트");
            } else {
                System.out.println("작업할 파일이 존재하지 않음");
            }

            File subDir = new File("C:\\work\\subDir");
            subDir.mkdir();
            File file2 = new File(subDir, "file2.txt");
            file2.createNewFile();

            String file2Path = file2.getAbsolutePath();//경로 가져옴
            System.out.println("절대 경로 : " + file2Path);

            String parentDir = file2.getParent();//부모 경로 가져옴
            System.out.println("부모 경로 : " + parentDir);

            File parentFile = file.getParentFile(); //상위 경로 가져옴
            String[] fileNames = parentFile.list(); //목록을 String 으로 바꿈
            System.out.println(parentDir + "목록 ==>");
            for (String name : fileNames) {
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
