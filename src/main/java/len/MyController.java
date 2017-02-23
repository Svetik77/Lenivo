package len;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Sveta_Medion on 23.02.2017.
 */
@Controller
public class MyController {
    @RequestMapping(value = "/")
    public static String my() {

        return "mytest";
    }
}
