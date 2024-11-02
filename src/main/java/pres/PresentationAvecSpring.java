package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecSpring {
    public static void main(String[] args) {

        // lire le fihcier de configuration spring
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("metier","dao");
        // get bean de la class qui implemente l interface Imetier en donnant son (id = optionnel )
        Imetier imetier = applicationContext.getBean(Imetier.class);
        // test
        System.out.println(imetier.calcul());

    }
}
