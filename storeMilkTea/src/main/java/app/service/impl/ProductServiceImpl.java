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

	@Override
	public Long page(Long countProduct, Integer maxResult) {

		return (maxResult >= countProduct) ? 1
				: ((countProduct % maxResult == 0) ? (countProduct / maxResult) : (countProduct / maxResult + 1));

	}

	@Override
	public List<ProductInfo> loadProductByPage(Integer page, Integer maxResult) {
		try {
			return ConvertModelToBean.mapProductsToProductInfo(productDAO.loadProductByPage(page, maxResult));
		} catch (Exception e) {
			return null;
		}

	}

	@Override
	public Long count() {
		try {
			return productDAO.count();
		} catch (Exception e) {
			return null;
		}

	}

}
