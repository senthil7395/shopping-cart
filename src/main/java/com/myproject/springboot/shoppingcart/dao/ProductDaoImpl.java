/**
 *
 */
package com.myproject.springboot.shoppingcart.dao;

import java.util.*;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.myproject.springboot.shoppingcart.model.Product;
import com.myproject.springboot.shoppingcart.repository.ProductRepository;

/**
 * The Class ProductDaoImpl.
 *
 */
@Repository
public class ProductDaoImpl implements ProductDao {

    /** productRepository. */
    @Resource
    ProductRepository productRepository;

    /**
     * Fetch all product.
     *
     * @return the list
     */
    @Override
    public List<Product> fetchAllProduct() {
        return productRepository.findAll();
    }

    /**
     * Fetch all product type.
     *
     * @return the list
     */
    @Override
    public List<String> fetchAllProductType() {
        return productRepository.findAllProductType();
    }

    /**
     * Fetch product by id.
     *
     * @param productId the product id
     * @return the optional
     */
    @Override
    public Optional<Product> fetchProductById(Integer productId) {
        return productRepository.findById(productId);
    }

    /**
     * Fetch product by name.
     *
     * @param productName the product name
     * @return the list
     */
    @Override
    public List<Product> fetchProductByName(String productName) {
        return productRepository.findByName(productName);
    }

    /**
     * Find all ordered by name descending.
     *
     * @return the list
     */
    @Override
    public List<Product> findAllOrderedByNameDescending() {
        return productRepository.findAllOrderedByNameDescending();
    }

}
