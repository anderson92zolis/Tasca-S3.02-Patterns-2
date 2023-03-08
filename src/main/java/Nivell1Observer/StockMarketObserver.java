package Nivell1Observer;

public abstract class StockMarketObserver {
    protected Subject subject;
    public abstract void update();
}