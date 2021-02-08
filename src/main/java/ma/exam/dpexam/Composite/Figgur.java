package ma.exam.dpexam.Composite;


import ma.exam.dpexam.Observer.Observable;
import ma.exam.dpexam.Observer.Observer;

public abstract class Figgur implements Observer {

    public Point p;
    public abstract double surface();
    public abstract double piremiter();
    public abstract void draw();

}
