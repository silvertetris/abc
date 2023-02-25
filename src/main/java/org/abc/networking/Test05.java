package org.abc.networking;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class Test05 {
    public static void main(String[] args) {
        try(ServerSocketChannel server=ServerSocketChannel.open()) {//서버소켓채널 객체 생성
            server.bind(new InetSocketAddress(8080));//포트 설정
            server.configureBlocking(false);//논블로킹 형식 설정

            System.out.println("서버가 시작되었습니다.");

            Selector selector=Selector.open();//채널 관리할 Selector 생성
            server.register(selector, SelectionKey.OP_ACCEPT); //접속 대기 상태

            while(selector.select()>0) { //.select 매서드= 요청이 들어온 채널의 수, 즉, 요청 들어오면 while문 작동
                Iterator<SelectionKey> it = selector.selectedKeys().iterator(); //채널들을 Iterator 객체에 저장(it)
                while (it.hasNext()) {
                    SelectionKey key=it.next();//다음 채널 확인, key에 반환
                    it.remove();//반환 끝나면 삭제

                    if(key.isAcceptable()) {//접속 대기 상태면
                        ServerSocketChannel serverChannel=(ServerSocketChannel) key.channel();//키 리스트에서 채널 반환, 소켓채널로 캐스팅
                        SocketChannel client = serverChannel.accept();//작업 허락
                        client.configureBlocking(false);//논블로킹
                        client.register(selector, SelectionKey.OP_WRITE);//쓰기 상태로 변환
                    } else if(key.isWritable()) {//쓰기 상태면
                        try(SocketChannel client = (SocketChannel) key.channel()) {
                            ByteBuffer buffer=ByteBuffer.allocate(1024);
                            buffer.put("HTTP/1.0 200 OK\n".getBytes());
                            buffer.put("Content-Type: text/html\n\n".getBytes());
                            for(int i=0; i<5; i++) {
                                buffer.put("<h1>Have a nice day!!</h1>".getBytes());
                                Thread.sleep(1000);
                            }
                            buffer.flip();
                            client.write(buffer);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
