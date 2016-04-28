package State;

import Iterator.NameRepository;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yevhenii on 25.04.2016.
 */
public class CurState implements State {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void doAction(Context context, NameRepository nameRepository) {
        System.out.println("Are you ready to play? \n (If your answer equals 'YES' press '1', if you are not ready " +
                "press '2').");
        try {
            if(Integer.parseInt(bufferedReader.readLine()) == 1){
                context.setState(new StartState());
            }
            else{
                context.setState(new StopState());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



       /* try {
            System.out.println("Are you ready to play?");
            String str = bufferedReader.readLine();
            iter = nameRepository.getIterator();
            if(str == "yes") {
                while (iter.hasNext()) {
                    start.doAction(contex, nameRepository);
                    iter.next();
                }
            }
            else if(str == "no"){
                stop.doAction(contex, nameRepository);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
