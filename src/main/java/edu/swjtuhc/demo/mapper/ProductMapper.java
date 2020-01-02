package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Product;
@Mapper
public interface ProductMapper {
	 List<Product> list(String keyWord);

	    void save(Product product);
}
