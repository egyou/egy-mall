package idusw.springboot.egymall.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

/*
@Controller
@ResponseBody
 */
public class RestApiController {
    @GetMapping(value = {"my", "my/"})
    public String getMy(HttpServletRequest request) {
        // /my?fav=값 or /my/?fav=값
        return "<h1>" + request.getParameter("fav") + "</h1>"; // view 지정 없이 바로 응답
    }
}
