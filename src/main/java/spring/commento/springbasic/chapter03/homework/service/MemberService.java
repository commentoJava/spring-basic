package spring.commento.springbasic.chapter03.homework.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import spring.commento.springbasic.chapter03.homework.domain.Member;
import spring.commento.springbasic.chapter03.homework.repository.MemberRepositoryJpa;


@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepositoryJpa memberRepositoryJpa;

    public Member getMember(Long memberId){
        Member member = memberRepositoryJpa.findById(memberId).orElseThrow(() -> {
            return new IllegalArgumentException("없는 사용자");
        });
        return member;
    }

}
