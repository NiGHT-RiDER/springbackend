package com.aubergine.repository

import com.aubergine.domain.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message , Int>
