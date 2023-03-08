package Nivell1Observer;

public class stockMarketDrop extends StockMarketObserver {

    private final double rate = -0.7 ;
    public stockMarketDrop(Subject subject){
        this.subject = subject;
        this.subject.addObservers(this);
    }

    @Override
    public void update() {
        System.out.println( "Stocks can drop a : " + subject.getState()*rate + " %");
    }
}