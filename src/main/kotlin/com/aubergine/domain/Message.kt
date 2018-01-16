package com.aubergine.domain

import com.fasterxml.jackson.annotation.JsonBackReference
import org.jetbrains.annotations.NotNull
import javax.persistence.*


@Entity
@Table(name = "app_message")
class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null

    @NotNull
    var message: String? = null

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    var author: User? = null
}
