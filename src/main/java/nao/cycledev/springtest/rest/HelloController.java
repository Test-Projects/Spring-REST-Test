package nao.cycledev.springtest.rest;

import nao.cycledev.springtest.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/{player}", method = RequestMethod.GET)
    public Message message(@PathVariable String player) {
        Message msg = new Message(player, "Hello " + player);
        return msg;
    }
}
