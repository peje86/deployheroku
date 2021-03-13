// package project.loker.loker.controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// import project.loker.loker.model.Role;
// import project.loker.loker.repository.RoleRepository;

// import java.util.List;

// // import org.springframework.security.access.prepost.PreAuthorize;


// @RestController

// @RequestMapping("/role")
// public class RoleController {

//     @Autowired
//     private RoleRepository roleRepository;

//     @PostMapping(path="/add")
//     public Role addRole(@RequestBody Role role){
//         return roleRepository.save(role);
//     }
//     @GetMapping (path="/role")
// public  java.util.List<Role> get_All() {  
//     return roleRepository.findAll();
// }
// }
