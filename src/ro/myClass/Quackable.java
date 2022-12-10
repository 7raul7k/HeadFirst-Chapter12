package ro.myClass;

public interface Quackable  extends  QuackObservable{

    public void quack();

    void registerObserver(Quackologist quackologist);
}
