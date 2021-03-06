/**
 *
 */
package com.myproject.springboot.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myproject.springboot.shoppingcart.model.User;

/**
 * The Interface UserRespository.
 *
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * Find by name.
     *
     * @param name the name
     * @return the user
     */
    User findByName(String name);

}
