package Proxy;

/**
 * Created by Yevhenii on 19.04.2016.
 */
public class ProxyGame implements Game {
    private RealGame realGame = null;
    private String str;

    public ProxyGame(String fileName){
        this.str = fileName;
    }

    @Override
    public void display() {
        if(realGame == null){
            realGame = new RealGame(str);
        }
        realGame.display();
    }
}
