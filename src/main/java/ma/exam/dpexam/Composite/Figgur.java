package ma.exam.dpexam.Composite;


import lombok.AllArgsConstructor;
import lombok.Data;
import ma.exam.dpexam.Observer.Observable;
import ma.exam.dpexam.Observer.Observer;

import java.io.File;
import java.io.Serializable;


public abstract class Figgur implements Observer, Serializable {

    public Point p;

    public Figgur(Point p ){
        this.p=p;
    }
    public abstract double surface();
    public abstract double piremiter();
    public abstract void draw();

}
