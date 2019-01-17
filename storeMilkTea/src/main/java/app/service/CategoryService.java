package app.service;

import java.util.List;

import app.bean.CategoryInfo;

public interface CategoryService extends BaseService<Integer, CategoryInfo> {
	List<CategoryInfo> loadAllCategory();

}
