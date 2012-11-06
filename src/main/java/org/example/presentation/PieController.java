package org.example.presentation;

import java.util.List;

import org.example.application.PieService;
import org.example.domain.Pie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/pies")
public class PieController {
    @Autowired
    private PieService pieService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Pie get(@PathVariable int id) {
        return pieService.get(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Pie> list() {
        return pieService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Pie create(@RequestBody Pie pie) {
        return pieService.save(pie);
    }
}
