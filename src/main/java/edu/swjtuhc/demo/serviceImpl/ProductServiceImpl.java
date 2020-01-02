package edu.swjtuhc.demo.serviceImpl;

import edu.swjtuhc.demo.mapper.ProductMapper;
import edu.swjtuhc.demo.model.Product;
import edu.swjtuhc.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductServiceImpl  implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> list(String keyWord) {
        return productMapper.list(keyWord);
    }

}
