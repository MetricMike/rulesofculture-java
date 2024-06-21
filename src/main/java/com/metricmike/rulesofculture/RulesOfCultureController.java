package com.metricmike.rulesofculture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RulesOfCultureController {

  @RequestMapping("/")
  public String index() {
    return "hello world";
  }

}
