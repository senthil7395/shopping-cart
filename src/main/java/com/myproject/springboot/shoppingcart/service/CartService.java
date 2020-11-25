/**
 *
 */
package com.myproject.springboot.shoppingcart.service;

import java.util.*;

import com.myproject.springboot.shoppingcart.exception.*;
import com.myproject.springboot.shoppingcart.model.*;

/**
 * The Interface CartService.
 *
 */
public interface CartService {

    /**
     * Creates the user cart.
     *
     * @param user the user
     * @return the cart
     * @throws ShoppingCartException
     * @throws ShoppingCartBusinessException
     */
    Cart createUserCart(User user) throws ShoppingCartBusinessException, ShoppingCartException;

    /**
     * Adds the to cart details.
     *
     * @param cartDetail the cart detail
     * @param userCart the user cart
     * @throws ShoppingCartException
     * @throws ShoppingCartBusinessException
     */
    void addToCartDetails(CartItem cartDetail, Cart userCart) throws ShoppingCartBusinessException, ShoppingCartException;

    /**
     * Fetch cart items.
     *
     * @param loggedInUser the logged in user
     * @return the map
     */
    Map<String, List<CartItem>> fetchCartItems(User loggedInUser);

    /**
     * Update cart details.
     *
     * @param cartDetail the cart detail
     * @param userCart the user cart
     * @throws ShoppingCartBusinessException the shopping cart business exception
     * @throws ShoppingCartException the shopping cart exception
     */
    void updateCartDetails(CartItem cartDetail, Cart userCart) throws ShoppingCartBusinessException, ShoppingCartException;

	/**
	 * @param id
	 * @return
	 * @throws ShoppingCartBusinessException
	 * @throws ShoppingCartException
	 */
	String deleteProduct(int id) throws ShoppingCartBusinessException, ShoppingCartException;

}
