package Nivell1Observer;
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<StockMarketObserver> stockExchangeAgenciesArrayL = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void addObservers(StockMarketObserver observer){
        stockExchangeAgenciesArrayL.add(observer);
    }

    public void notifyAllObservers(){
        stockExchangeAgenciesArrayL.forEach(x-> x.update());
    }
}