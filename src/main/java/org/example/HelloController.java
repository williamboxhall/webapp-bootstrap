package org.example;

import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hellos")
public class HelloController {
    private final HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Hello get(@PathVariable int id) {
        return null;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Hello> list() {
        create(new Hello());
        return helloService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Hello create(@RequestBody Hello hello) {
        helloService.add(hello);
        return hello;
    }
}
