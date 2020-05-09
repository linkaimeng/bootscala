package com.linkm.repository

import com.linkm.domain.MetaTable
import org.springframework.data.repository.CrudRepository

trait MetaTableRepository extends CrudRepository[MetaTable,Integer]{

}
