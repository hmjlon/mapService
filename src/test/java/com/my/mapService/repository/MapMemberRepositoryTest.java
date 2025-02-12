package com.my.mapService.repository;

import com.my.mapService.dto.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MapMemberRepositoryTest {
    MapMemberRepository repository = new MapMemberRepository();

    @AfterEach
    public void  afterEachh                              ter
    @Test
    void save() {
        assertThat(result.getID);
//        Given
        Member member = new Member();
        member.setName("장원영");
        member.setAddress("서울");

//        When
    Member result = repository.save(member);
//        Then
      Long saveId = 1L;
//       org.junit.jupitor
        Assertions.assertEquals(member.getId(),saveId);
        assertThat(result.getId()).isEqualTo(saveId);
    }
    @Test
    void findById(){
        Member member = new Member();
        member.setName("안유진");
        member.setAddress("제주");
        repository.save(member);
        )
    }
    zxx\\z\zxx7
}