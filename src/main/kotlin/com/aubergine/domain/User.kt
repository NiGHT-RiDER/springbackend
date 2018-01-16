package com.aubergine.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonManagedReference
import javax.validation.constraints.NotNull
import javax.persistence.*
import javax.persistence.FetchType
import javax.persistence.ElementCollection

@Entity
@Table(name = "app_user")
class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @NotNull
    @Column(unique = true)
    var username: String? = null

    @JsonIgnore
    @NotNull
    var password: String? = null

    @JsonManagedReference
    @OneToMany(mappedBy = "author")
    var messages: List<Message>? = null

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    val roles: List<Role>? = null

}
