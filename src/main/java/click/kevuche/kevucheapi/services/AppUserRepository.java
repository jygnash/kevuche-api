package click.kevuche.kevucheapi.services;

import click.kevuche.kevucheapi.model.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppUserRepository extends CrudRepository<AppUser, String> {

    List<AppUser> findAllByUserIdNotNull();

}
