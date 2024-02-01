package com.example.jpanext.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;


// 다른 Entity가 상속받아서 내가 가진 속성 정보를 포함시키고 싶을때
// 상속 받는 Entity 클래스 임을 나타내는 Annotation

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
