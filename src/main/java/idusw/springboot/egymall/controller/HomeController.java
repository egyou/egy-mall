package idusw.springboot.egymall.controller;

import idusw.springboot.egymall.serivce.HomeService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import idusw.springboot.egymall.model.MemberDto;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class HomeController {

    //private HomeService homeService = new HomeServiceImpl3(); // tightly-coupled

    /*
    @Autowired // 필드 주입 : field injection - testing
    private HomeService homeService;
    */

    // setter injection
    /*
    public void setHomeService(HomeService homeService) {
        this.homeService = homeService;
    }
    */
    // loosely-coupled <- IoC Container, DI
    private HomeService homeService;
    public HomeController(HomeService homeService) { // constructor injection
        this.homeService = homeService;
    }

    @GetMapping(value={"/", ""}) // Get Method 요청으로 처리하라는 annotation
    public String goLogin(HttpServletRequest request, Model model) {
        return "./main/index";
        //return "redirect:/members/login"; // GetMapping이 members/login 또는 /members/login으로 매핑
    }
    
    // http://localhost:8080/?name=<value> : 매개변수 값이 request객체에 저장됨
    @GetMapping(value={"/1"}) // Get Method 요청으로 처리하라는 annotation
    public String getRoot(HttpServletRequest request, Model model) {
        homeService.sayHello();
        // model : dto (data transfer object)
        // -- model --> service -- model --> repository -> service -> controller -> view
        model.addAttribute("greeting", request.getParameter("name"));
        return "main/index"; // view
    }
    // ?<search_part> or <query_string> : 매개변수를 Map객체로 전달받음
    // /2?name=<value>&email=<value>
    @GetMapping("/2")
    public String getIndex2(@RequestParam Map<String, String> param, Model model) {
        MemberDto memberDto = MemberDto.builder().build();
        memberDto.setId("egyou");
        memberDto.setName(param.get("name"));
        memberDto.setEmail(param.get("email"));

        // spring에서 ui 통해 view에게 전달할 때 사용하는 객체 : Model model
        model.addAttribute("member", memberDto);
        // model == dto (data transfer object)
        // controller -- dto --> service -- dto, entity --> repository
        // -- entity, dto --> service -- dto --> controller -- dto -> view
        return "main/index2"; // view
    }
}
