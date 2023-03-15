package me.whiteship.chapter01.item08.cleaner_as_a_safetynet;

// cleaner 안전망을 갖춘 자원을 제대로 활용하는 클라이언트 (45쪽)
public class Adult {
    public static void main(String[] args) {

        //AutoClosable 의 close 로 알아서 정리됨
        try (Room myRoom = new Room(7)) {
            System.out.println("안녕~");
        }
    }
}
