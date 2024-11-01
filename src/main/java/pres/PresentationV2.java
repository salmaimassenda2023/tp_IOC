package pres;

import dao.IDao;
import metier.Imetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
//instanciation dynamique "programmation dynamique"
public class PresentationV2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner= new Scanner(new File("config.txt"));
        //steep 1 : INSTANCIER CLASS 1
        String daoClassName = scanner.nextLine();
        //charger la classe en memoire
        Class cDao = Class.forName(daoClassName);
        //instanciation
        IDao iDao=(IDao)cDao.getDeclaredConstructor().newInstance();
        //test => System.out.println(iDao.getTemperature());

        //steep 2: INSTANCIER CLASS 2
        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        Imetier imetier=(Imetier)cMetier.getDeclaredConstructor().newInstance();

        //steep 2: ASSOCIATION
        // creer la methode  <=>  imetier.setiDao(iDao) le cas statique
        Method method=imetier.getClass().getMethod("setiDao",IDao.class);
        method.invoke(imetier,iDao);
        //test =>
        System.out.println(imetier.calcul());



    }
}
