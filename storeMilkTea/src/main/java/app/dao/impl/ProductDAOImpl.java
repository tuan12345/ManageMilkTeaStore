package app.dao.impl;

import java.util.List;

import org.hibernate.criterion.Projections;

import app.dao.GenericDAO;
import app.dao.ProductDAO;
import app.model.Product;

public class ProductDAOImpl extends GenericDAO<Integer, Product> implements ProductDAO {

	@Override
	public List<Product> loadAllProduct() {
		return getSession().createQuery("From Product").getResultList();
	}

	@Override
	public Long count() {
		return   (long) getSession().createQuery("SELECT count(id) From Product").uniqueResult();
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<Product> loadProductByPage(Integer page, Integer maxProduct) {

		return getSession().createCriteria(Product.class).setFirstResult(page == null ? 0 : (page - 1) * maxProduct)
				.setMaxResults(maxProduct).list();
	}

}
