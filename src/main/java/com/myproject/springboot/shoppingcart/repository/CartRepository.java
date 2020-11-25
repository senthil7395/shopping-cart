/**
 *
 */
package com.myproject.springboot.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.springboot.shoppingcart.model.*;

/**
 * The Interface CartRespository.
 *
 */
public interface CartRepository extends JpaRepository<Cart, Integer> {


    /**
     * Find cart by user.
     *
     * @param userId the user id
     * @return the cart
     */
    Cart findByUser(User user);
}
