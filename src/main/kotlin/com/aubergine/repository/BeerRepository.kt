package com.aubergine.repository

import com.aubergine.domain.Beer
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface BeerRepository : CrudRepository<Beer, Long> {
    fun findByName(name : String) : List<Beer>
}
