/**
 *
 */
package com.myproject.springboot.shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.myproject.springboot.shoppingcart.service.ProductService;

/**
 *
 */
public abstract class AbstractProductController {

    /** The product service. */
    @Autowired
    protected ProductService productService;


    /**
     * Populate product types.
     *
     * @return the list
     */
    @ModelAttribute(name = "productTypes")
    public List<String> populateProductTypes() {
        List<String> productTypes = productService.getProductTypes();
        return productTypes;
    }



}
