package com.my.mapService.service;

import com.my.mapService.dto.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MemberServiceTest {
    @Test
    public void 중복 회원 검사 (){
//		Given([장원영,서울],[안유진,제주] 입력
        Member jang = new Member();
        jang.setName("장원영");
        jang.setAddress("서울");
        memberService.join(jang);
//		when - [장원영,서울] -- 입력시도
//		then : 입력 후 결과가 -1 인지 확인
    }

    @Test
    public void findOne(){
//    Given
        Member member = new Member();
        member.setName("장원영");
        member.setAddress("서울");
        memberService.join(member)
        String memberService;
        memberService.join(member);
// when(1번 검색)
//    then ( 이름이 장원영인지 확인)
        assertThat(result.get()).isEqualTo("장원영");
    }
}
// 전체 리스트 출력
public List<Member>findALl(){
    return member
}

@Test
@DisplayName("전체리스트 검색 테스트")
public void findAll(){
//    Given
//    When
    List<Member>memberList = repository.findAll()
//    Then
    assertThat(memberList.size().isEqualTo)
}

// 삭제처리
 public  void deleteById(Long id){
    memberRepository.delete
            @Test
                    @DisplayName("삭제테스트")

                    void deleteById(){
//        Given
     Member jang = new Member ();
     jang.setName("장원영");
     jang.s

     }
 }