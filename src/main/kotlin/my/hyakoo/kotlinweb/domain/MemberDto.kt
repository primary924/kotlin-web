package my.hyakoo.kotlinweb.domain

class MemberDto(member: Member) {
    val id: Long = member.getId()
    val name: String = member.getName()
    val email: String = member.getEmail()
}
