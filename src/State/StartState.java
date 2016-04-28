package State;
import Iterator.NameRepository;
import Proxy.Game;
import Proxy.ProxyGame;
import java.util.Random;

public class StartState implements State {

    Game game;

    @Override
    public void doAction(Context contex, NameRepository nameRepository) {

        Random random = new Random();
        int one = random.nextInt(5);
        int two = random.nextInt(5);
        int three = random.nextInt(5);

        if (contex.picture[one] == contex.picture[two] && contex.picture[two] == contex.picture[three]) {
            game = new ProxyGame("You are winner!");
            game.display();
            nameRepository.winner(100);
            System.out.println("Your win is equal $" + nameRepository.getMoney());
        } else {
            game = new ProxyGame("You are loser!");
            game.display();
            nameRepository.getIterator().next();
        }
    }
}
