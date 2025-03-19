package com.example.practice_project.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * packageName    : com.example.practice_project.member.controller
 * fileName       : MemberJoinController
 * author         : wonpyo
 * date           : 2025-03-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-03-19        wonpyo       최초 생성
 */
@Controller
@RequestMapping("/member")
public class MemberJoinController {

    @GetMapping(value = "/login")
    public String LoginView(){
        return "login";
    }

    @GetMapping(value = "/join")
    public String JoinMeberView(){
        return "join";
    }

    @PostMapping(value = "/doJoin")
    @ResponseBody
    public String doJoin(@RequestBody String name){

        return "success";
    }

}
