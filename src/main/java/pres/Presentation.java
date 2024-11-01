package pres;

import dao.DaoImpl;
import dao.IDao;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        // injection de dependence par instanciation statique
        DaoImpl dao= new DaoImpl();
        MetierImpl metier= new MetierImpl();
        metier.setiDao(dao);
        double res=metier.calcul();
        System.out.println(res);
    }
}
