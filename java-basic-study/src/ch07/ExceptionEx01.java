package ch07;

class 총{
    void shoot(){
        System.out.println("총을 발사했습니다.");
    }
}

public class ExceptionEx01 {

    public static void main(String[] args) {
        //컴파일 예외
        try {
            System.out.println("잠자기 시작");
            Thread.sleep(1000);
            System.out.println("잠자기 끝");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //런타임 예외 (개발자가 알 수 있다)
        int [] nums={1,2,3};
        try{
            System.out.println(nums[3]); //강제 종료!!
        }catch(ArrayIndexOutOfBoundsException e){
            //catch의 역할은 try(시도)하다가 예외가 발생하면 어떻게 처리할지를 정의하는 영역
            System.out.println("괜찮아 그냥 진행해");
            System.out.println(e.getMessage());
        }
        String data=null;
        System.out.println(data.length());
        System.out.println("메인 쓰레드 종료");


    }
}
