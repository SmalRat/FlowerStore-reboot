package ua.edu.ucu.apps.web.appUsers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class AppUsersController {
    private final AppUsersService appUsersService;

    @Autowired
    public AppUsersController(AppUsersService appUsersService){
        this.appUsersService = appUsersService;
    }
    @GetMapping("/get-users")
    public List<AppUser> getAppUsers(){
        return appUsersService.getAppUsers();
    }
    @PostMapping("/post-user")
    public String postUser(@RequestBody AppUser appUser){
        return appUsersService.addAppUser(appUser);
    }
}
