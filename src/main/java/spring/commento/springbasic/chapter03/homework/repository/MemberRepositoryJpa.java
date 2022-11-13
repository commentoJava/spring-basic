package spring.commento.springbasic.chapter03.homework.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.commento.springbasic.chapter03.homework.domain.Member;

@Repository
public interface MemberRepositoryJpa extends JpaRepository<Member, Long> {
}
