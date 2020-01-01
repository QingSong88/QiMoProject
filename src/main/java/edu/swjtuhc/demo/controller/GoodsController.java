package edu.swjtuhc.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.model.SeaGoods;
import edu.swjtuhc.demo.service.GoodsService;
import net.sf.json.JSONObject;

@RestController
@RequestMapping("/Goods")
public class GoodsController {
	
	@Autowired
	GoodsService goodsService;
	//商品分类列表
	@RequestMapping("/DivideGoods")
	public List<Goods> getGoodsList(String GoodsType){
		
		return goodsService.getGoodsList(GoodsType);
		
	}
	//发布商品
	@RequestMapping("/releaseGoods")
	public JSONObject releaseGoods(Goods goods,MultipartFile file) {
		JSONObject result = new JSONObject();
		goods.setGoodsPicture(file.getOriginalFilename());
		int i = 0;
		try {
			i = goodsService.releaseGoods(goods, file.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i==-2) {
			System.out.println("商品发布失败，图片本地保存失败！");
		} else if (i==-3) {
			System.out.println("商品发布失败，请添加商品图片！");
		}else if (i==1) {
			System.out.println("商品发布成功，等待管理员审核！");
		}
		result.put("state",i);
		return result;
	}
	//发布商品求购信息
	@RequestMapping("/searchGoods")
	public JSONObject searchGoods(SeaGoods seaGoods) {
		JSONObject result01 = new JSONObject();
		int i = goodsService.searchGoods(seaGoods);
		if (i==-1) {
			System.out.println("发布失败，请完善信息！");
		}else if (i==1) {
			System.out.println("发布成功，等待管理员的审核！");
		}
		result01.put("state",i);
		return result01;
	}
}
