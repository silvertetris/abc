package org.abc.InputOutput;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class Test10 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("a.txt", "rw");
            FileChannel channel=file.getChannel();) { //file(a.txt)에 대한 FileChannel 객체 생성

            int bufferSize=1024;
            ByteBuffer buffer=ByteBuffer.allocate(bufferSize); //버퍼 용량 할당

            WritableByteChannel out = Channels.newChannel(System.out);//출력 스트림의 채널에 대한 객체 생성, 바이트 단위 데이터 출력 담당

            while(channel.read(buffer) !=-1) {
                buffer.flip();//position=현재 작업 위치, limit=작업 한계 위치 flip=postion을 0으로 limit을 postition으로
                out.write(buffer); //buffer의 내용을 out에 전달, 출력
                buffer.clear();//buffer 내용 지움
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
