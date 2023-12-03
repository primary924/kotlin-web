package my.hyakoo.kotlinweb.service

import my.hyakoo.kotlinweb.domain.MemberDto
import my.hyakoo.kotlinweb.repository.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberService(val memberRepository: MemberRepository) {
    fun getMember(id: String): MemberDto {
        val member = memberRepository.getOptionalById(id.toLong())
            .orElseThrow { throw RuntimeException("not found member: $id") }
        return MemberDto(member)
    }
}
