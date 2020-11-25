package com.myproject.springboot.shoppingcart.dao;

/**
 *
 */

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.myproject.springboot.shoppingcart.exception.*;
import com.myproject.springboot.shoppingcart.model.*;

/**
 * The Interface CartDao.
 *
 */
@Repository
public interface CartDao {

    /**
     * Creates the user cart.
     *
     * @param userCart the user cart
     * @return the cart
     * @throws ShoppingCartBusinessException
     * @throws ShoppingCartException
     */
    Cart createCart(Cart userCart) throws ShoppingCartBusinessException, ShoppingCartException;

    /**
     * Gets the cart by user.
     *
     * @param user the user
     * @return the cart by user
     */
    Cart getCartByUser(User user);

    /**
     * Gets the cart by id.
     *
     * @param userCart the user cart
     * @return the cart by id
     */
    Optional<Cart> getCartById(Cart userCart);

    /**
     * Adds the cart item.
     *
     * @param item the item
     * @return the cart item
     */
    CartItem addCartItem(CartItem item);
    
    /**
     * update the cart item.
     *
     * @param item the item
     * @return the cart item
     */
    CartItem updateCartItem(CartItem item);
    
    /**
     * update the cart item.
     *
     * @param item the item
     * @return the cart item
     */
    String removeCartItem(int itemID);

}
