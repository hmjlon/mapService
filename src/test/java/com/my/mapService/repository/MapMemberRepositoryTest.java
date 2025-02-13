package com.my.mapService.repository;

import com.my.mapService.dto.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MapMemberRepositoryTest {
    MapMemberRepository repository = new MapMemberRepository();

    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    void save() {
        // Given
        Member member = new Member();
        member.setName("장원영");
        member.setAddress("서울");
        repository.save(member);
        // When

        Member result = repository.findById(member.getId()).get();

        // Then
        Long saveId = 1L;
        // org.junit.juipter.api
        Assertions.assertEquals(member,result);
        // org.assertj.core.api --  static import
        assertThat(result).isEqualTo(result);
    }

    @Test
    @DisplayName("ID로 검색하기")
    void findById() {
        // Given
        Member member = new Member();
        member.setName("안유진");
        member.setAddress("제주");
        repository.save(member);

        // When
        Long id = 1L;
        Member findMember = repository.findById(id).get();

        // Then
        assertThat(findMember.getName()).isEqualTo("안유진");
    }

    @Test
    @DisplayName("ID로 검색 실패")
    void findById_Fail() {
        // Given
        Member member = new Member();
        member.setName("안유진");
        member.setAddress("제주");
        repository.save(member);

        // When
        Long id = 2L;
        Member findMember = repository.findById(id).orElse(null);

        // Then
        assertThat(findMember).isEqualTo(null);
    }

    @Test
    @DisplayName("전체검색테스트")
    void findAll(){
//        Given
        Member jang = new Member();
        jang.setName("장원영");
        jang.setAddress("서울");
        repository.save(jang);

        Member ahn = new Member();
        ahn.setName("안유진");
        ahn.setAddress("제주");
        repository.save(ahn);
//        when
        List<Member> list = repository.findAll();

//        then
        assertThat(list.size()).isEqualTo(2);



    }
    @Test
    @DisplayName("이름으로 검색하기")
    void findByName() {

//        Given
//        장원영, 안유진을 입력
        Member jang = new Member();
        jang.setName("장원영");
        jang.setAddress("서울");
        repository.save(jang);

        Member ahn = new Member();
        jang.setName("안유진");
        jang.setAddress("제주");
        repository.save(ahn);



//        When
        // 안유진 검색
        Member result = repository.findByName("안유진").get();


//        Then
//        찾은 Member 객체가 장원영 객체와
        assertThat(result).isEqualTo(ahn);


    }

//@Test
//@DisplayName("이름으로 검색하기")
//void findByName() {
//
////        Given
////        장원영, 안유진을 입력
//    Member jang = new Member();
//    jang.setName("장원영");
//    jang.setAddress("서울");
//    repository.save(jang);
//
//
//
////        When
//    // 안유진 검색
//    Member result = repository.findByName("안유진").get();
//
//
////        Then
////        찾은 Member 객체가 장원영 객체와
//    assertThat(result).isEqualTo(null);
//
//}

@Test
@DisplayName("ID로 삭제하기 테스트")
void deleteById() {
//    Given
    Member member = new Member();
    member.setName("장원영");
    member.setAddress("서울");
    repository.save(member);
//    When
    repository.deleteById(1L);

//    Then
    Member result = repository.findById(1L).orElse(null);

}
@Test
    @DisplayName("데이터 수정 확인 테스트")
    void updateById(){

}
}
