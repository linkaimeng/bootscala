package com.linkm.controller

import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RequestMethod, RestController}

@RestController
class ScalaBootController {

//  @RequestMapping(value = Array("/sayScalaHello"),method = Array(RequestMethod.GET))
  @GetMapping(Array("/sayScalaHello"))
  def sayScalaHello(): String ={
    "say hello scala"
  }

}
