package xyz.solidspoon.coupon.calculation.controller.service.intf;

import xyz.solidspoon.coupon.calculation.api.beans.ShoppingCart;
import xyz.solidspoon.coupon.calculation.api.beans.SimulationOrder;
import xyz.solidspoon.coupon.calculation.api.beans.SimulationResponse;
import org.springframework.web.bind.annotation.RequestBody;

public interface CouponCalculationService {

    ShoppingCart calculateOrderPrice(@RequestBody ShoppingCart cart);

    SimulationResponse simulateOrder(@RequestBody SimulationOrder cart);
}
