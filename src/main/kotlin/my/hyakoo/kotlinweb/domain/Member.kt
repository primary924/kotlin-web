package my.hyakoo.kotlinweb.domain

import jakarta.persistence.*

@Entity
class Member(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long,

    @Column(length = 30, nullable = false)
    private var name: String,

    @Column(length = 30, nullable = false)
    private var email: String
) {
    fun getId(): Long = id
    fun getName(): String = name
    fun getEmail(): String = email
}