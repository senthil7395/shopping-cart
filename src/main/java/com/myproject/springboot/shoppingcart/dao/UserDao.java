/**
 *
 */
package com.myproject.springboot.shoppingcart.dao;

import com.myproject.springboot.shoppingcart.model.User;

/**
 * The Interface UserDao.
 *
 */
public interface UserDao {

    /**
     * Gets the user.
     *
     * @param user the user
     * @return the user
     */
    User getUser(User user);

    /**
     * Save user.
     *
     * @param user the user
     * @return the user
     */
    User saveUser(User user);
}
