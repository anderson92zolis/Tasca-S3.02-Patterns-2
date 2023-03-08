package Nivell1Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {

        Subject subject = new Subject();

        new stockMarketRise(subject);
        new stockMarketDrop(subject);

        System.out.println("the risk of investing "+ "15" +" is as follows");
        subject.setState(15);
        System.out.println("the risk of investing "+ "10" +" is as follows");
        subject.setState(10);
    }

}