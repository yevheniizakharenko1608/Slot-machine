package State;

/**
 * Created by Yevhenii on 19.04.2016.
 */
public class Context {

    private State state;
    public String[] picture = {"BANANA","CHERRY","STAR","PLUM","LEMON","ORANGE"};

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
