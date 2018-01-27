package click.kevuche.kevucheapi.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/")
public class AppController {
    private static final Logger logger = LogManager.getLogger(AppUsersController.class);


    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> applicationStatus() {
        logger.traceExit("applicationStatus");
        return ResponseEntity.ok("Sample is Up");
    }
}
