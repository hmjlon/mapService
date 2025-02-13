package com.my.mapService.controller;

import com.my.mapService.dto.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService service;
    @GetMapping("")
    public String list() {
        return "/members/memberList";
    }

    @GetMapping("/new")
    public String newMembers(Model model){
    model.addAttribute("member",new Member());
        return "/members/createMemberForm";
    }

    @PostMapping("/new")
    public String createMember(Member member) {
        // 1. 회원가입 창에서 보낸 자료를
        //    Member DTO 로 받는다.
        System.out.println(member);
        // 2. 받은 회원 정보를 서비스에 보내서
        //    맵에 저장한다.
        return "redirect:/members";
    }
    @GetMapping("/delete/{id}")
    public String deleteMember(@PathVariable("id")Long id){
        System.out.println("id : " + id);
        service.deleteById(id);
        return "redirect:/members";
    }

    @GetMapping("/update/{id}")
    public String updateMember(@PathVariable("id")Long id,
                               Model model
    ){
//        1. id로 검색 후 Member를 수정폼에 전달해서 뿌려준다
        model.addAttribute("member",
                service.findOne(id));
        return "/members/createMemberForm";

    }
    @PostMapping("/update")
    public String update(Member member){
        System.out.println(member);
        return "redirect:/members";

    }
}
