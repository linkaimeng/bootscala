package com.linkm.controller

import com.linkm.domain.MetaTable
import com.linkm.service.MetaTableService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, ModelAttribute, PostMapping, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/meta/table"))
class MetaTableController @Autowired()(metaTableService:MetaTableService){

  @PostMapping(Array("/save"))
  def save(@ModelAttribute metaTable:MetaTable) ={
    metaTableService.save(metaTable)
  }

  @GetMapping(Array("/query"))
  def query()={
    metaTableService.query()
  }

}
