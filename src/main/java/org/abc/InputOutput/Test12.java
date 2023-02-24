package org.abc.InputOutput;

import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class Test12 {
    public static void main(String[] args) {
        try(RandomAccessFile file = new RandomAccessFile("a3.txt", "rw");
        FileChannel channel= file.getChannel();) {
            int bufferSize=1024;
            ByteBuffer buffer=ByteBuffer.allocate(bufferSize);

            buffer.put("hello".getBytes());
            buffer.flip();
            channel.write(buffer); //채널에 buffer을 씀 position0에서

            channel.position(0);//file 의 position을 0으로 지정
            buffer.clear();//buffer 초기화

            WritableByteChannel out= Channels.newChannel(System.out); //쓸 수 있는 바이트 채널 생성 System.out에대한 채널 생성
            while (channel.read(buffer)!=-1) { //channel을 다 읽음
                buffer.flip();
                out.write(buffer);
                buffer.clear();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }   
}
