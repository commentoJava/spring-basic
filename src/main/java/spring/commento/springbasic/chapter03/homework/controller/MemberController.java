package spring.commento.springbasic.chapter03.homework.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.commento.springbasic.chapter03.homework.domain.Member;
import spring.commento.springbasic.chapter03.homework.service.MemberService;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("/{member-id}")
    public ResponseEntity getMember(@PathVariable("member-id") Long memberId) {
        Member member = memberService.getMember(memberId);
        return new ResponseEntity(member, HttpStatus.OK);
    }
}
