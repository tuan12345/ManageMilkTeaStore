package app.service.impl;

import java.io.Serializable;
import java.util.List;

import app.bean.ProductInfo;
import app.service.ProductService;
import app.util.ConvertModelToBean;

public class ProductServiceImpl extends BaseServiceImpl implements ProductService {

	@Override
	public ProductInfo findById(Serializable key, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductInfo saveOrUpdate(ProductInfo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(ProductInfo entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<ProductInfo> loadAllProduct() {
		try {
			return ConvertModelToBean.mapProductsToProductInfo(productDAO.loadAllProduct());
			
		} catch (Exception e) {
			return null;
		}
		
	}

}
