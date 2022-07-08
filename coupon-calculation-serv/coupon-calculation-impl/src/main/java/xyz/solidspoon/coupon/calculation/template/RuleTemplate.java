package xyz.solidspoon.coupon.calculation.template;


import xyz.solidspoon.coupon.calculation.api.beans.ShoppingCart;

public interface RuleTemplate {

    // 计算优惠券
    ShoppingCart calculate(ShoppingCart settlement);
}
