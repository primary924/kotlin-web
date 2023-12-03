package my.hyakoo.kotlinweb.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
class MemberControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun getMembers() {
        mockMvc.get("/members/1")
            .andExpect {
                status { isOk() }
                content {
                    string(
                        """
                        {"id":1,"name":"임용혁","email":"primary924@gmail.com"}
                    """.trimIndent()
                    )
                }
            }
    }
}