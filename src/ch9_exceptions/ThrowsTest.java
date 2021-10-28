package ch9_exceptions;

public class ThrowsTest {
    private static void checkException() throws Exception{
        throw new Exception("checkException 함수에서 예외를 던졌습니다.");
    }
    private static void uncheckedException(){
        throw new RuntimeException("uncheckedException 함수에서 런타임 예외를 던졌습니다.");
    }
    public static void main(String[] args) {
        try{
        checkException();
        }catch(Exception e){
            System.out.println("전파 받은 에러 메세지 : "+e.getMessage());
        }
        try{
        uncheckedException();
        }catch(RuntimeException e){
            System.out.println("전달 받은 에러 메세지 : "+e.getMessage());
        }
    }
}
