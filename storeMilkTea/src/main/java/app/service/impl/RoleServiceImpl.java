package app.service.impl;

import app.model.Role;
import app.service.RoleService;

import java.io.Serializable;

public class RoleServiceImpl extends BaseServiceImpl implements RoleService {
    @Override
    public Role findByName(String name) {
        try {
            return roleDAO.findRoleByName(name);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Role findById(Serializable key, boolean lock) {
        return null;
    }

    @Override
    public Role saveOrUpdate(Role entity) {
        return null;
    }

    @Override
    public boolean delete(Role entity) {
        return false;
    }
}
