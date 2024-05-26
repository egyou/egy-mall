package idusw.springboot.egymall.repository;

import idusw.springboot.egymall.entity.MemberEntity;
import idusw.springboot.egymall.model.MemberDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends
        JpaRepository<MemberEntity, Long> {

    Optional<MemberEntity> findByIdx(Long idx);
    Optional<MemberEntity> findByIdAndPw(String id, String pw);

    //QuerydslPredicateExecutor<MemberEntity> {
    /*
    @Query("select m from MemberEntity m where m.id = :id and m.pw = :pw")
    Object getMemberEntityById(@Param("id") String id, @Param("pw") String pw);

     */

}
