package project.loker.loker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.loker.loker.model.User;
import project.loker.loker.security.services.UserService;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user",
            produces = "application/json",
            method= RequestMethod.GET)
    @PreAuthorize(" hasRole('ADMIN')")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping(value = "/user/{id}",
            produces = "application/json",
            method= RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @RequestMapping(value = "/user/add",
            produces = "application/json",
            method= RequestMethod.POST)
    @PreAuthorize(" hasRole('ADMIN')")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // @RequestMapping(value = "/bidang",
    //         produces = "application/json",
    //         method= RequestMethod.DELETE)
    // public BidangPerusahaan deleteAllBidangPerusahaan(BidangPerusahaan bidangPerusahaan) {
    //     return bidangService.deleteAllBidangPerusahaan(bidangPerusahaan);
    // }

    @RequestMapping(value = "/user/{id}",
            produces = "application/json",
            method= RequestMethod.DELETE)
    public User deleteUser(@PathVariable Long id) {
        return userService.deleteUser(id);
    }
}
