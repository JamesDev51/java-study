package me.whiteship.chapter01.item03.field;

import java.io.*;

// 역직렬화로 여러 인스턴스 만들기
public class ElvisSerialization {

    public static void main(String[] args) {

        //직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))) {
            out.writeObject(Elvis.INSTANCE);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //역직렬화
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))) {
            Elvis elvis3 = (Elvis) in.readObject();
            System.out.println(elvis3 == Elvis.INSTANCE); //같은 인스턴스인지 다른 인스턴스인지 확인
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
