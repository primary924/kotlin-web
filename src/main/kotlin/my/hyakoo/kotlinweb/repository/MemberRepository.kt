package my.hyakoo.kotlinweb.repository

import my.hyakoo.kotlinweb.domain.Member
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface MemberRepository : JpaRepository<Member, Long> {
    fun getOptionalById(id: Long): Optional<Member>
}