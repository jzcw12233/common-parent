package com.jzcw.ssm.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // @RequestMapping(name = "/test", method = RequestMethod.GET , produces="application/json")
   // @ResponseBody
    @GetMapping("/test")
    public Map<String, Object> test() {
        Map<String, Object> resp = new HashMap<>(3);
        resp.put("hello", "SpringMVC");
        resp.put("hello1", "SpringMVC");
        resp.put("hello2", "SpringMVC");

        return resp;
    }
}
