package app.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import app.dao.CategoryDAO;
import app.dao.GenericDAO;
import app.model.Category;

public class CategoryDAOImpl extends GenericDAO<Integer, Category> implements CategoryDAO {
	
	public CategoryDAOImpl() {
		super(Category.class);
	}
	
	public CategoryDAOImpl(SessionFactory sessionFactory){
		setSessionFactory(sessionFactory);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> loadAllCategory() {
		return getSession().createQuery("From Category").getResultList();
	}

}
