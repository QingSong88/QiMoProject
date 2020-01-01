package edu.swjtuhc.demo.serviceImpl;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.swjtuhc.demo.mapper.GoodsMapper;
import edu.swjtuhc.demo.model.Goods;
import edu.swjtuhc.demo.model.SeaGoods;
import edu.swjtuhc.demo.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	GoodsMapper goodsMapper;
	
	//商品分类列表
	@Override
	public List<Goods> getGoodsList(String GoodsType) {
		// TODO Auto-generated method stub
		return goodsMapper.selectGoods(GoodsType);
	}
	//发布商品
	@Override
	public int releaseGoods(Goods goods, InputStream fileStream) {
		// TODO Auto-generated method stub
		//先保存文件
		String path = "D:\\localfiles";//文件本地保存地址
		int i = -1;//用来代表文件是否保存成功
		byte[] bs = new byte[1024];
		//设计缓存区，读取到的数据长度
		int len;  //缓存区长度
		try {
			File tempFile = new File(path);//在D盘创建目录
			if (!tempFile.exists()) {
				tempFile.mkdirs();//检验路径是否存在，若不存在创建该路径
			}
			Date today = new Date();  
			String fileName = today.getTime()+goods.getGoodsPicture();//在原图名前加上时间戳，避免同名，文件保存不成功！
			goods.setGoodsPicture("/GoodsPicture/"+fileName);//GoodsPicture是为了在服务器和浏览器之间添加映射而临时命名的
			OutputStream os = new FileOutputStream(tempFile.getPath()+File.separator + fileName);
			//开始读取
			while ((len = fileStream.read(bs))!= -1) {
				os.write(bs,0,len);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
				i=-2;
		}
		if (goods.getGoodsPicture().equals("")) {
				i=-3;
		} else {
			//调用GoodsMapper,将Goods信息存入信息库
				i = goodsMapper.insertGoods(goods);
		}
		return i;
	}
	@Override
	public int searchGoods(SeaGoods seaGoods) {
		// TODO Auto-generated method stub
		int i = -1;
		if (!StringUtils.isEmpty(seaGoods.getGoodsName())
				&&!StringUtils.isEmpty(seaGoods.getGoodsAmount())
				&&!StringUtils.isEmpty(seaGoods.getStuID())
				&&!StringUtils.isEmpty(seaGoods.getGoodsDescribe())
				&&!StringUtils.isEmpty(seaGoods.getStuQQnumber())){
			i = goodsMapper.insertSeaGoods(seaGoods);
		}else {
			i = -1;
		}
		return i;
	}
	
}
