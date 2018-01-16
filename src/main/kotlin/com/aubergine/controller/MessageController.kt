package com.aubergine.controller

import com.aubergine.repository.MessageRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by stefan on 16/01/18.
 */

@RestController
class MessageController{

    @Autowired
    var messageRepository: MessageRepository? = null

    @GetMapping("/api/messages")
    fun getAllMessages() = messageRepository!!.findAll()
}

