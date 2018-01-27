package click.kevuche.kevucheapi.web;

import click.kevuche.kevucheapi.KevucheApiApplication;
import click.kevuche.kevucheapi.model.AppUser;
import click.kevuche.kevucheapi.model.AppUserValidator;
import click.kevuche.kevucheapi.services.AppUsersService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
@RequestMapping("/appusers")
public class AppUsersController {
    private static final Logger logger = LogManager.getLogger(AppUsersController.class);

    @Autowired
    private AppUsersService usersService;

    @RequestMapping(method = RequestMethod.GET)
    public List<AppUser> list() {
        logger.traceEntry("Sample Entry Messages");
        logger.traceExit("Sample Exit Messages");
        return usersService.listAll();
    }

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator(new AppUserValidator());
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> add(@Valid @RequestBody AppUser appAppUser) {
        logger.traceEntry();
        logger.debug("got app user ==" + appAppUser.toString());
        usersService.addUser(appAppUser);
        logger.traceExit();
        return ResponseEntity.ok("it worked");
    }
}
