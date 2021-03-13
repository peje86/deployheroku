package project.loker.loker.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import project.loker.loker.model.Role;
import project.loker.loker.repository.RoleRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRole() {
        List<Role> role = new ArrayList<>();
        roleRepository.findAll().forEach(role::add);
        return role;
    }

   

    public Role addRole(Role role) {
        roleRepository.save(role);
        return role;
    }

   

    public Role deleteAllRole(Role role) {
        roleRepository.deleteAll();
        return role;
    }

}
