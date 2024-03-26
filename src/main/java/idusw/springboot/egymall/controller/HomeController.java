package idusw.springboot.egymall.controller;

import idusw.springboot.egymall.serivce.HomeService;
import idusw.springboot.egymall.serivce.HomeServiceImpl3;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import idusw.springboot.egymall.model.Member;

@Controller
public class HomeController {

    private HomeService homeService = new HomeServiceImpl3(); // tightly-coupled
    /*
    public HomeController(HomeService homeService) { // loosely-coupled <- IoC Container, DI
        this.homeService = homeService;
    }
    */
    @GetMapping(value={"/", "/1"}) // Get Method 요청으로 처리하라는 annotation
    public String getRoot() {
        homeService.sayHello();
        // model : dto (data transfer object)
        // -- model --> service -- model --> repository -> service -> controller -> view
        return "main/index"; // view
    }
    @GetMapping("/2")
    public String geIndex2(Model model) {
        Member member = new Member();
        member.setId("egyou");
        member.setName("유응구");
        member.setEmail("egyou@induk.ac.kr");

        // spring에서 ui 통해 view에게 전달할 때 사용하는 객체 : Model model
        model.addAttribute("member", member);
        // model == dto (data transfer object)
        // -- dto --> service -- dto --> repository -> service -> controller -> view
        return "main/index2"; // view
    }
}
