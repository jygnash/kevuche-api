package click.kevuche.kevucheapi.services;

import click.kevuche.kevucheapi.model.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppUsersService {

    @Autowired
    private AppUserRepository repository;

    public List<AppUser> listAll() {

        List<AppUser> tempList = new ArrayList<AppUser>();
        tempList.addAll(repository.findAllByUserIdNotNull());

        return tempList;

    }

    public void addUser(AppUser appAppUser){
        repository.save(appAppUser);
    }

    public AppUser findUser(String userId){
        return repository.findOne(userId);
    }
}
