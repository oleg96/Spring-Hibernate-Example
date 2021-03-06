package by.intexsoft.controller;

import by.intexsoft.model.Product;
import by.intexsoft.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleController.class);

    @Autowired
    private ProductService productService;

    @RequestMapping("/all")
    public List<Product> loadAllProducts() {
        LOGGER.info("Start loadAllProducts");
        try {
            return productService.findAll();
        } catch (NullPointerException e) {
            LOGGER.error("Exception in loadAllProducts. " + e.getLocalizedMessage());
            return null;
        }
    }
}
