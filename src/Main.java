import Iterator.Iterator;
import Iterator.NameRepository;
import State.Context;
import State.CurState;
import State.State;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Yevhenii on 19.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        int money;
        System.out.println("--------------------------------------------------------------------------------- \n" +
                "Play rules: \n - If your answer is 'Yes, I want to play' press '1'                           - " +
                "\n - If you are 'not ready to play' press 2 and system will return current money -" +
                "\n -                 One try cost only 1 dollar! Check yourself!                 -" +
                "\n ---------------------------------------------------------------------------------");
        Context context = new Context();
        State curState = new CurState();
        NameRepository namesRepository = new NameRepository();

        try{
            System.out.println("Please, input amount of your money in dollar");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            money = Integer.parseInt(bufferedReader.readLine());
            namesRepository.setMoney(money);
            Iterator iter = namesRepository.getIterator();

            while(iter.hasNext()){
                curState.doAction(context, namesRepository);
                context.getState().doAction(context, namesRepository);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
