package State;

import Iterator.NameRepository;

/**
 * Created by Yevhenii on 19.04.2016.
 */
public interface State {
    void doAction(Context contex, NameRepository nameRepository);
}
