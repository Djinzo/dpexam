package ma.exam.dpexam.Composite;


import ma.exam.dpexam.Observer.Observable;
import ma.exam.dpexam.Observer.Observer;

import java.io.Serializable;

public abstract class Figgur implements Observer, Serializable {

    public Point p;
    public abstract double surface();
    public abstract double piremiter();
    public abstract void draw();

}
