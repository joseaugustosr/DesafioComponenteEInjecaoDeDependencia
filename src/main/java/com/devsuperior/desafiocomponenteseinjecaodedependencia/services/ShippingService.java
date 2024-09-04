package com.devsuperior.desafiocomponenteseinjecaodedependencia.services;

import com.devsuperior.desafiocomponenteseinjecaodedependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double discount = 0.0;
        if (order.getBasic() < 100.0) {
            discount = 20.0;
        }
        else if (order.getBasic() >= 100.0 && order.getBasic() <= 200.0) {
            discount = 12.0;
        }
        return discount;
    }

}
