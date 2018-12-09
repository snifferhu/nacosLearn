package org.demo.dubboLearn.web;

import org.demo.dubboLearn.action.DemoConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
    @Autowired
    private DemoConsumer demoConsumer;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name")String name){
        return demoConsumer.doSayHello(name);
    }
}
