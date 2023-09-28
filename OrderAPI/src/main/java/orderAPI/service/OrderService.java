package orderAPI.service;

import jakarta.persistence.criteria.Order;
import orderAPI.models.Cart;
import orderAPI.repository.OrderRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepositry orderRepositry;

    public Cart createOrder(Cart cart) {

        Cart cart1 = orderRepositry.save(cart);
        return cart1;
    }

    public List<Cart> getOrdersByEmail(String email) {
        return null;
    }

    public List<Cart> getOrdersWithinPeriod(Date start, Date end) {
        return null;
    }
}
