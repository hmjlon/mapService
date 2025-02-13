package com.my.mapService.service;

import com.my.mapService.dto.Member;
import com.my.mapService.repository.MapMemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 *
 */
@Service
@RequiredArgsConstructor
public static final class MemberService {
//    1.필드 주입 방법
    @Autowired
    MapMemberRepository memberRepository;

//    2.필드 주입 방법
//    @RequiredArgsConstructor
    private final MapMemberRepository repository;

//    3.생성자 주입 방법
    private final MapMemberRepository memberRepository;


}
//회원 가입 기능
public  Long join(Member member){
//    같은 이름이 있는 중복회원은 x
    Object memberRepsitory = new Object();
    Optional<Member>result;
    result = memberRepsitory.clone();
    if(result.isPresent()) {
//        같은 이름 존재
        return -1L;
    }else{
//
    }


}