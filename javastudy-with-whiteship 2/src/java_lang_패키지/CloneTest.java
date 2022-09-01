package java_lang_패키지;

import java.util.ArrayList;
import java.util.List;

public class CloneTest implements  Cloneable{
      public static void main(String[] args) {
            List<Integer> tmpList = new ArrayList<>();
            tmpList.add(1); tmpList.add(3); tmpList.add(5);
            CloneTest c1 = new CloneTest(3, tmpList);

            CloneTest c2=c1.clone();
            System.out.println("c1 : "+c1);
            System.out.println("c2 : "+c2);
            System.out.println();

            c1.getList().add(5);
            System.out.println("c1 : "+c1);
            System.out.println("c2 : "+c2);
            System.out.println();

            c1.setNum(5);
            System.out.println("c1 : "+c1);
            System.out.println("c2 : "+c2);
            System.out.println();

      }
      private List<Integer> list;
      private Integer num;
      public CloneTest(Integer num,List<Integer>list){
            this.list=list;
            this.num=num;
      }

      public void setNum(Integer num) {
            this.num = num;
      }

      public List<Integer> getList() {
            return list;
      }

      @Override
      public String toString() {
            return "CloneTest{" +
                        "list=" + list +
                        ", num=" + num +
                        '}';
      }

      @Override
      public CloneTest clone() {
            try {
                  CloneTest clone = (CloneTest) super.clone();
                  // TODO: 이 복제본이 원본의 내부를 변경할 수 없도록 여기에 가변 상태 복사합니다
                  return clone;
            } catch (CloneNotSupportedException e) {
                  throw new AssertionError();
            }
      }
}
