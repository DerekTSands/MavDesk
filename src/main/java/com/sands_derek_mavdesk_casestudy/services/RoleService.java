package com.sands_derek_mavdesk_casestudy.services;

import com.sands_derek_mavdesk_casestudy.models.Role;
import java.util.List;

public interface RoleService {
    Role saveRole(Role role);
    List<Role> getAllRoles();
    Role getRoleById(Long id);
    Role getRoleByName(String name);
    void deleteRole(Long id);
}
