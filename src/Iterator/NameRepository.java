package Iterator;

/**
 * Created by Yevhenii on 19.04.2016.
 */
public class NameRepository implements Container {

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private int money = 0;
    public void winner(int money){
        this.money = this.money + money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    private class NameIterator implements Iterator {

        @Override
        public boolean hasNext() {

            if(money > 0){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {

            if(this.hasNext()){
                System.out.println("(It's information from Iterator) Your money balance equals " + --money);
                return money;
            }
            return null;
        }
    }
}
