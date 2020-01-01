package edu.swjtuhc.demo.service;

import java.io.InputStream;
import java.util.List;

import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.model.SeaGoods;

public interface GoodsService {
	public List<Goods> getGoodsList(String GoodsType);
	
	public int releaseGoods(Goods goods,InputStream fileStream);
	
	public int searchGoods(SeaGoods seaGoods);
}
