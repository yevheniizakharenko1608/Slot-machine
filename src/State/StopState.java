package State;

import Iterator.NameRepository;
import Proxy.Game;
import Proxy.ProxyGame;

/**
 * Created by Yevhenii on 20.04.2016.
 */
public class StopState implements State {

    Game game;
    @Override
    public void doAction(Context contex, NameRepository nameRepository) {
        game = new ProxyGame("You take your current money!");
        game.display();
        System.out.println("Your win is equal $" + nameRepository.getMoney());
        nameRepository.setMoney(0);
    }
}
