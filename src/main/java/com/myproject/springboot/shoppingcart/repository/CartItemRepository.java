/**
 *
 */
package com.myproject.springboot.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.springboot.shoppingcart.model.CartItem;

/**
 * The Interface ProductRespository.
 *
 */
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

}
