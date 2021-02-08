package ma.exam.dpexam.Composite;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.exam.dpexam.Observer.Observable;

import java.io.Serializable;

@Data @AllArgsConstructor @NoArgsConstructor
public class Circle extends Figgur implements Serializable {

    public double rayon;

    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon,2);
    }

    @Override
    public double piremiter() {
        return 2 * Math.PI * rayon;
    }

    @Override
    public void draw() {
        System.out.println("rayen :"+rayon + "Surface : "+surface()+"pirimetre :" +piremiter());
    }

    @Override
    public void update(Observable o) {

    }
}
