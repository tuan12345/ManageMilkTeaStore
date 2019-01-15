package app.dao.impl;

import java.util.List;

import app.dao.GenericDAO;
import app.dao.ProductDAO;
import app.model.Product;

public class ProductDAOImpl extends GenericDAO<Integer, Product> implements ProductDAO {

	@Override
	public List<Product> loadAllProduct() {
		return getSession().createQuery("From Product").getResultList();
	}

}
