package idusw.springboot.egymall.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Member { // DTO(Data Transfer Object) or VO(Valuable Object)
    private Long idx;
    private String id;
    private String pw;
    private String name;
    private String email;
}
