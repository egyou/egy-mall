package idusw.springboot.egymall.service;

import idusw.springboot.egymall.model.MemberDto;
import idusw.springboot.egymall.serivce.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class MemberServiceTest {
    @Autowired
    MemberService memberService;
    @Test
    public void initMembers() {
        IntStream.rangeClosed(1, 10).forEach(i -> {
            MemberDto dto = MemberDto.builder()
                    .id("id-" + i)
                    .pw("cometrue")
                    .name("name-" + i)
                    .email("id-" + i + "@induk.ac.kr")
                    .build();

            memberService.create(dto);
        });
    }
    @Test
    public void readById() {
        MemberDto dto = MemberDto.builder()
                .idx(6L)
                .build();
        MemberDto ret;
        if((ret = memberService.readById(dto.getIdx())) != null)
            System.out.println("success" + ret );
        else
            System.out.println("fail");
    }
    @Test
    public void readList() {
        List<MemberDto> list = memberService.readAll();
        if(list != null) {
            System.out.println("success");
            for(MemberDto dto : list) {
                System.out.println(dto);
            }
        }
        else
            System.out.println("fail");
    }
    @Test
    public void registerOne() {
        MemberDto dto = MemberDto.builder()
                    .id("dream")
                    .pw("cometrue")
                    .name("passion")
                    .email("dream" + "@induk.ac.kr")
                    .build();

        if(memberService.create(dto) > 0)
            System.out.println("success");
        else
            System.out.println("fail");
    }



}
