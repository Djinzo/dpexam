package ma.exam.dpexam.Composite;

import lombok.Data;
import ma.exam.dpexam.Observer.Observable;

import java.util.ArrayList;


@Data
public class Group extends Figgur{

    private ArrayList<Figgur> figgurs;


    @Override
    public double surface() {
        double ans=0;
        for(Figgur f:figgurs){
            ans+=f.surface();
        }
        return ans;
    }

    @Override
    public double piremiter() {
        double ans=0;
        for( Figgur f : figgurs){
            ans=f.piremiter();
        }

        return ans;
    }

    @Override
    public void draw() {
        for (Figgur f: figgurs){
            f.draw();
        }
    }

    public void addFigure(Figgur f){
        this.figgurs.add(f);
    }
    public void remove(Figgur f){
        figgurs.remove(f);
    }

    @Override
    public void update(Observable o) {
        for(Figgur f : figgurs){
            f.update(o);
        }
    }
}
