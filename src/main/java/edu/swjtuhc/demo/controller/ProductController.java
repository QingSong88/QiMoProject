package edu.swjtuhc.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.swjtuhc.demo.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {
	 @Autowired
	    private ProductService productService;

	    @RequestMapping("list")
	    public Map<String, Object> list(@RequestParam(required = false) String keyWord) {
	        Map<String, Object> map = new HashMap<>();
	        map.put("list", productService.list(keyWord));
	        return map;
	    }
}
