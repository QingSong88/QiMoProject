package edu.swjtuhc.demo.service;

import edu.swjtuhc.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> list(String keyWord);
}
