package com.aubergine.controller

import com.aubergine.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UserController {

    @Autowired
    var userRepository: UserRepository? = null

    @GetMapping("/api/users")
    fun getAllUsers()= userRepository!!.findAll()


}
