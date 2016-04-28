package Proxy;

public class RealGame implements Game {

    private String str;

    public RealGame(String fileName){
        this.str = fileName;
    }


    @Override
    public void display() {
        System.out.println("(it's information from Proxy)  " + str);
    }
}