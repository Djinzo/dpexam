package ma.exam.dpexam.Composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import ma.exam.dpexam.Observer.Observable;
import ma.exam.dpexam.Observer.Parametrage;

@Data @AllArgsConstructor
public class Rectangle extends Figgur{

    public double L;
    public double H;

    @Override
    public double surface() {
        return L*H;
    }

    @Override
    public double piremiter() {
        return 2*(L+H);
    }

    @Override
    public void draw() {
        System.out.println("L : "+L+"H :"+H+"piremiter :"+piremiter()+"surface :"+surface());
    }

    @Override
    public void update(Observable o) {
        int cc=((Parametrage) o).getColorC();
        int cs=((Parametrage) o).getColorS();
        int ec=((Parametrage) o).getEpaisseurC();
        System.out.println("color conteur :"+cc+" colore surface :"+cs+"Epaisseur Color"+ec);
    }
}
