package app.service.impl;

import java.io.Serializable;
import java.util.List;

import app.bean.CategoryInfo;
import app.model.Category;
import app.service.CategoryService;
import app.util.ConvertModelToBean;

public class CategoryServiceImpl extends BaseServiceImpl implements CategoryService {

	@Override
	public CategoryInfo findById(Serializable key, boolean lock) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CategoryInfo saveOrUpdate(CategoryInfo entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(CategoryInfo entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<CategoryInfo> loadAllCategory() {
		try {
			List<Category> list=categoryDAO.loadAllCategory();
			return ConvertModelToBean.mapCategoriesToCategoriesInfos(list);
		} catch (Exception e) {
			return null;
		}
		
	}



}
