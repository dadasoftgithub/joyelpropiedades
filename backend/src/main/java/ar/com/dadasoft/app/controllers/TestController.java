package ar.com.dadasoft.app.controllers;

import ar.com.dadasoft.app.entities.Test;
import ar.com.dadasoft.app.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping(value = "/app/hello2")
    public ModelAndView getUsers(@ModelAttribute("test")@Valid Test test){

        ModelAndView model = new ModelAndView("test");

        testService.guardar(test);

        List<Test> tests = testService.listarTests();

        model.addObject("tests". tests);

        return model;

    }

}
