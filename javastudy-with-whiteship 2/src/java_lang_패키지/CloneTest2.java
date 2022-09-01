package java_lang_패키지;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CloneTest2 implements  Cloneable{
      public static void main(String[] args) {
            List<Integer> tmpList = new ArrayList<>();
            tmpList.add(1); tmpList.add(3); tmpList.add(5);
            CloneTest2 c1 = new CloneTest2(3, tmpList);

            CloneTest2 c2=c1.clone();
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
      public CloneTest2(Integer num, List<Integer>list){
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

      public void setList(List<Integer> list) {
            this.list = list;
      }

      @Override
      public CloneTest2 clone() {
            try {
                  CloneTest2 clone = (CloneTest2) super.clone();

                  List<Integer> newArrayList = new ArrayList<>(this.list);

                  clone.setList(newArrayList);
                  // TODO: 이 복제본이 원본의 내부를 변경할 수 없도록 여기에 가변 상태 복사합니다
                  return clone;
            } catch (CloneNotSupportedException e) {
                  throw new AssertionError();
            }
      }
}
