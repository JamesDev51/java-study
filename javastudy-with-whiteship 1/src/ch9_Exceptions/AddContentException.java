package ch9_Exceptions;

public class AddContentException extends  RuntimeException{
    private final String code;

    public AddContentException(Throwable cause, String code){
        super(cause);
        this.code=code;
    }
    public String getCode(){
        return code;
    }
    private void addContent(){
//        try{
//            //컨텐츠를 추가하는 로직
//        }catch(SomeException 1 || SomeException2 e){
//            throw new AddContentException(e,e.getCode());
//        }catch(SomeException 3){
//            throw new AddContentException(e,"SE3");
        }
}

