package idusw.springboot.egymall.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class MemberControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void test() throws Exception {
        RequestBuilder reqBuilder = MockMvcRequestBuilders
                .get("/members/6");

        //        .param("email", "ab2@induk.ac.kr")
        //        .param("pw", "pw2");

        mockMvc.perform(reqBuilder)
                //.andExpect(status().isOk())
                .andDo(print());
    }


}
