package app.dao.impl;

import app.dao.GenericDAO;
import app.dao.RoleDAO;
import app.model.Role;

public class RoleDAOImpl extends GenericDAO<Integer, Role> implements RoleDAO {

    @Override
    public Role findRoleByName(String name) {
        return getSession().createQuery("FROM Role r WHERE r.name = :name", Role.class)
                .setParameter("name", name).uniqueResult();
    }
}
