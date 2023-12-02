package my.hyakoo.kotlinweb.controller

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class HomeControllerTest {
    @Autowired
    private lateinit var mockMvc: MockMvc

    @Test
    fun `Assert status code and content`() {
        mockMvc.get("/home")
            .andExpect {
                status { isOk() }
                content {
                    string("hello world!")
                }
            }
    }
}