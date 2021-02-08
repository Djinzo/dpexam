package ma.exam.dpexam;

import ma.exam.dpexam.Composite.*;
import ma.exam.dpexam.Observer.Observable;
import ma.exam.dpexam.Observer.Observer;
import ma.exam.dpexam.Observer.Parametrage;
import ma.exam.dpexam.stratgy.Dessin;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class DpexamApplication {

    public static void main(String[] args) {
        SpringApplication.run(DpexamApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            Dessin d =new Dessin();
            d.add(new Circle(2.1,new Point(0,0)));
            Group c=new Group(new Point(1,2));
            c.addFigure(new Rectangle(20,30,new Point(0,0)));
            d.add(c);
            ArrayList<Observer> fs=new ArrayList<>();
            fs.add(new Circle(3,new Point(0,0)));
            Parametrage p =new Parametrage(20,20,20,fs);
            p.notif();

        };
    }
}
