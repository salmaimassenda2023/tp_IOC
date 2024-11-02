package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository //spring scanne l annotation et fait une instance de cette classe nomme dao (Spring Beans)
public class DaoImplV2 implements IDao{
    @Override
    public Double getTemperature() {
        double data=12;
        return data;
    }
}
