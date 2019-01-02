package app.dao;

import app.model.Role;

public interface RoleDAO extends BaseDAO<Integer, Role> {
    Role findRoleByName(String name);
}
