package app.service;

import java.util.List;

import app.bean.ProductInfo;

public interface ProductService extends BaseService<Integer, ProductInfo> {
	List<ProductInfo> loadAllProduct();
	
	Long page(Long countProduct,Integer maxResult);
	
	Long count();
	
	List<ProductInfo> loadProductByPage(Integer page,Integer maxResult);

}
