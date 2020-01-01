package edu.swjtuhc.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.model.SeaGoods;

@Mapper
public interface GoodsMapper {
	public List<Goods> selectGoods(String GoodsType);
	public int insertGoods(Goods goods);
	public int insertSeaGoods(SeaGoods seaGoods);
}
