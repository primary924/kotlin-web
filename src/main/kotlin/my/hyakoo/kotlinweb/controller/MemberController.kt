package my.hyakoo.kotlinweb.controller

import my.hyakoo.kotlinweb.domain.MemberDto
import my.hyakoo.kotlinweb.service.MemberService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class MemberController(val memberService: MemberService) {

    @GetMapping("/members/{id}")
    fun getMembers(@PathVariable("id") id: String): MemberDto {
        return memberService.getMember(id)
    }
}