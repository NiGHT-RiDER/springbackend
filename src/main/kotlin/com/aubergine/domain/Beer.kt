package com.aubergine.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotNull

@Entity
class Beer() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @NotNull
    var name: String? = null

    constructor(name: String) : this() {
        this.name = name
    }

    override fun toString(): String {
        return "{" + this.name + "}"
    }
}
