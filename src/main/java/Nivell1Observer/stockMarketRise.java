package Nivell1Observer;

public class stockMarketRise extends StockMarketObserver {

    private final double rate = 1.2 ;
    public stockMarketRise(Subject subject){
        this.subject = subject;
        this.subject.addObservers(this);
    }

    @Override
    public void update() {
        System.out.println( "Stocks can  go up a : " + subject.getState()*rate + " %");
    }
}