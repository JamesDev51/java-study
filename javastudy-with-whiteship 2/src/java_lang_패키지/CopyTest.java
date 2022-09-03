package java_lang_패키지;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyTest {
      public static void main(String[] args) throws CloneNotSupportedException{
            List<Integer> list1 = new ArrayList<>();
            list1.add(1); list1.add(3); list1.add(5);

            SomeClass someClass1 = new SomeClass("james",3,list1);
            SomeClass someClass2 = (SomeClass) someClass1.clone();

            someClass1.setS("jeong minseok");
            someClass1.setN(8);
            someClass1.getList().add(5);

            System.out.println("someClass1 : "+someClass1); //someClass1 : SomeClass{s='jeong minseok', n=8, list=[1, 3, 5, 5]}
            System.out.println("someClass2 : "+someClass2); //someClass2 : SomeClass{s='james', n=3, list=[1, 3, 5, 5]}
            System.out.println();

            List<Integer> list2 = new ArrayList<>();
            list2.add(1); list2.add(3); list2.add(5);
            SomeClass someClass3 = new SomeClass("minseok",1,list2){
                  @Override
                  protected SomeClass clone() throws CloneNotSupportedException {
                        SomeClass obj=(SomeClass) super.clone();
                        List<Integer> cp_list= new ArrayList<>(this.list);
                        obj.setList(cp_list);
                        return obj;
                  }
            };
            SomeClass someClass4 = (SomeClass) someClass3.clone();

            someClass3.setS("jeong minseok");
            someClass3.setN(8);
            someClass3.getList().add(5);

            System.out.println("someClass3 : "+someClass3); //someClass3 : SomeClass{s='jeong minseok', n=8, list=[1, 3, 5, 5]}
            System.out.println("someClass4 : "+someClass4); //someClass4 : SomeClass{s='minseok', n=1, list=[1, 3, 5]}
            System.out.println();

      }

      static public class SomeClass implements Cloneable{
            String s;
            Integer n;
            List<Integer> list;

            public SomeClass(String s, Integer n, List<Integer> list) {
                  this.s = s;
                  this.n = n;
                  this.list = list;
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                  return super.clone();
            }

            @Override
            public String toString() {
                  return "SomeClass{" +
                              "s='" + s + '\'' +
                              ", n=" + n +
                              ", list=" + list +
                              '}';
            }

            public String getS() {
                  return s;
            }

            public void setS(String s) {
                  this.s = s;
            }

            public Integer getN() {
                  return n;
            }

            public void setN(Integer n) {
                  this.n = n;
            }

            public List<Integer> getList() {
                  return list;
            }

            public void setList(List<Integer> list) {
                  this.list = list;
            }
      }
}
