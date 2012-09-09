package org.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hellos")
public class HelloController {
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public
    @ResponseBody
    Hello get(@PathVariable int id) {
        Hello hello = new Hello();
        hello.setGreeting("oh hai!");
        hello.setId(id);
        return hello;
    }
}
