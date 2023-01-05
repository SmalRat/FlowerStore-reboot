package ua.edu.ucu.apps.web.appUsers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppUsersService {
    private final AppUsersRepository appUsersRepository;

    @Autowired
    public AppUsersService(AppUsersRepository appUsersRepository) {
        this.appUsersRepository = appUsersRepository;
    }

    public List<AppUser> getAppUsers() {
        return appUsersRepository.findAll();
    }

    public String addAppUser(AppUser appUser){
        if (appUsersRepository.findAppUserByEmail(appUser.getEmail()).isPresent()){
            return "This email is already used!";
        }
        appUsersRepository.save(appUser);
        return "User was successfully saved!";
    }
}
