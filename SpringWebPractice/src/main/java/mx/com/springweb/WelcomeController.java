package mx.com.springweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by jrodriguez on 07/10/15.
 */

@Controller
public class WelcomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model){

        model.put("title", "Prueba Title");
        model.put("msg", "Prueba Msg");

        return "index";
    }
}
