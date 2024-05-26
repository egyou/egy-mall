package idusw.springboot.egymall.model;


import lombok.*;

import java.time.LocalDateTime;

// boilerplate code : 상용구 코드, 뻔한 코드
// Annotation : 컴파일러에게 처리를 요청하는 부연 설명 vs. Comment : 주석 - 소스코드 설명

@Data // @Getter @Setter  @EqualsAndHashCode @RequiredArgsConstructor
// @NoArgsConstructor
// @AllArgsConstructor
@Builder  // Design Pattern 중 하나로 생성시 명확성을 제공함

/**
 * Define a Member Class
 * @Author egyou
 */
public class MemberDto { // DTO(Data Transfer Object) or VO(Valuable Object)
    private Long idx;
    private String id;
    private String pw;
    private String name;
    private String email;
    private LocalDateTime regDate; // <- 게시글 등록일자
    private LocalDateTime modDate;
}
