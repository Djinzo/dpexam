package ma.exam.dpexam.Observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import ma.exam.dpexam.Composite.Figgur;

import java.util.ArrayList;


@Data @AllArgsConstructor
public class Parametrage implements Observable{
    public  int colorC;
    public int colorS;
    public int epaisseurC;
    public ArrayList<Observer> figurs;



    @Override
    public void notif() {
        for(Observer o : figurs){
            o.update(this);
        }
    }

    @Override
    public void remove(Figgur f) {
        figurs.remove(f);
    }

    @Override
    public void add(Figgur f) {
        figurs.add(f);
    }
}
