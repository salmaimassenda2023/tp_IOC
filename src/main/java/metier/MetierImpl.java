package metier;

import dao.IDao;

public class MetierImpl implements Imetier {
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
