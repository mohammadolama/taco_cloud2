package sia.taco_cloud2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkController {

    @GetMapping("/work")
    public String work() {
        return "work";
    }
}
