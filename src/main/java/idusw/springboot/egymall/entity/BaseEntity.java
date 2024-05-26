package idusw.springboot.egymall.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;


@MappedSuperclass   // @Table을 생성하지 않고, 상속받은 서브 클래스에 추가
@Getter
@EntityListeners(value = {AuditingEntityListener.class})
// config 혹은 @EnableJpaAuditing 추가해야 사용가능
// 엔티티들을 유지(persist) 도는 업데이트(update)에 대한 감사(auditing) 정보를 캡처
public abstract class BaseEntity {
    @CreatedDate
    @Column(name = "regdate", updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    @Column(name = "moddate")
    private LocalDateTime modDate;
}
