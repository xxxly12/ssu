package P.com.test;

public class FuShuException extends Exception {
    private  int value;
    public FuShuException() {
        super();
    }
    public FuShuException(int value,String message){
        super(message);
        this.value=value;
    }
    public int  getValue() {
        return value;
    }


}
