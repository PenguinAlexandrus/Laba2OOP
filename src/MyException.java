public class MyException extends Exception{
    private String fatalERROR;
    public MyException(String fatalERROR) {
        this.fatalERROR = fatalERROR;
    }

    public String getFatalERROR() {
        return fatalERROR;
    }
}
