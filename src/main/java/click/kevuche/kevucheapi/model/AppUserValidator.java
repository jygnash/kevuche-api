package click.kevuche.kevucheapi.model;

import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Validates the request to create the AppUser.
 * @author jygnash
 */
public class AppUserValidator implements Validator {


    @Override
    public boolean supports(Class<?> aClass) {
        return AppUser.class.equals(aClass);
    }

    @Override
    public void validate(Object user, Errors errors) {
        AppUser appUser = (AppUser) user;
        if(StringUtils.isEmpty(appUser.getFirstName())) {
            errors.reject("firstName", "firstName.empty");
        }

        if(StringUtils.isEmpty(appUser.getLastName())) {
            errors.reject("lastName", "lastName.empty");
        }

        if(StringUtils.isEmpty(appUser.getUserId())) {
            errors.reject("userId.empty");
        }

        if(StringUtils.isEmpty(appUser.getPassword())) {
            errors.reject("password.empty");
        }

    }
}
