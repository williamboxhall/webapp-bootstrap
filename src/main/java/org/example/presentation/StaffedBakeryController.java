package org.example.presentation;

import org.example.application.BakeryRepository;
import org.example.application.StaffedBakery;
import org.example.infrastructure.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/staffedBakeries")
public class StaffedBakeryController {
    @Autowired
    private BakeryRepository bakerRepository;
    @Autowired
    private Mapper mapper;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public StaffedBakery get(@PathVariable int id) {
        return mapper.map(bakerRepository.get(id), StaffedBakery.class);
    }
}
