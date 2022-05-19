package com.its.member.controller;

import com.its.member.DTO.MemberDTO;
import com.its.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        boolean saveResult = memberService.save(memberDTO);
        if (saveResult) {
            System.out.println("저장성공");
            return "login";
        } else {
            System.out.println("저장실패");
            return "save";
        }
    }

    @GetMapping("/findAll")
    public String findAll(Model model){
        List <MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberList",memberDTOList);
        return "list";
    }
//@ModelAttribute<< 한번만 쓴다 용도:set
    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO, Model model, HttpSession session){
        MemberDTO loginMember = memberService.login(memberDTO);
        // 세션(session) :model은 페이지당 한개만 유지 가능하지만 session은 여러페이지에서 값을 유지시킬 수 있다.
        if(loginMember!=null){
            System.out.println("로그인 성공");
            //model객체가 loginMember를 가져감
            model.addAttribute("loginMember",loginMember);
            session.setAttribute("loginMemberId",loginMember.getMemberId());
            session.setAttribute("loginId", loginMember.getId());
            return "main";
        }else{
            System.out.println("로그인 실패");
            return "login";
        }
    }
}
