package com.aubergine.repository

import com.aubergine.domain.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User , Int>
