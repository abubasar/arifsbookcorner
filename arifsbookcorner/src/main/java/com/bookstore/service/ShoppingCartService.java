package com.bookstore.service;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;

import java.math.BigDecimal;

public interface ShoppingCartService {

    ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);

    void clearShoppingCart(ShoppingCart shoppingCart);
}
