package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MetierImpl implements Imetier {
    @Autowired //chercher la classe qui implemente l interface et la faire injecter
    private IDao iDao;

    public IDao getiDao() {
        return iDao;
    }

    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }

    @Override
    public double calcul() {
        double temp =iDao.getTemperature();
        // je fais un calcul quelquant
        return temp*12;
    }
}
