package ch15collection.book.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExanple {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
        Queue<Message> messages = new LinkedList<>();

        //메시지 넣기
        messages.offer(new Message("sendMail","홍길동"));
        messages.offer(new Message("sendMs","신용권"));
        messages.offer(new Message("sendKaKaotalK","감자바"));

        //메시지를 하나씩 꺼내어 처리
        while (!messages.isEmpty()){
            Message message = messages.poll();
            switch (message.getCommand()){
                case "sendMail":
                    System.out.println(message.getTo() +"님에게 메일을 보냅니다.");
                    break;
                case "sendMs":
                    System.out.println(message.getTo() +"님에게 SMS을 보냅니다.");
                    break;
                case "sendKaKaotalK":
                    System.out.println(message.getTo() +"님에게 카카오톡을 보냅니다.");
                    break;
            }
        }

    }
}
