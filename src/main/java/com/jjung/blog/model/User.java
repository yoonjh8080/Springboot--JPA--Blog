package com.jjung.blog.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;


// ORM -> Java(or 다른언어) Object -> 테이블로 매핑해주는 기술
@Entity // User 클래스가 Mysql에 테이블이 생성이 된다.
public class User {
	
	@Id //Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다 오라클이면 시퀀스 mysql이면 ai
	private int id; // 시퀀스, auto_increment
	
	@Column(nullable = false, length = 30)
	private String username; // 아이디
	
	@Column(nullable = false, length = 100) // 123456 => 해쉬 (비밀번호 암호화할것이라 넉넉하게)
	private String password;
	
	@Column(nullable = false, length = 50)
	private String email;
	
	@ColumnDefault("'user'")
	private String role; // Enum을 쓰는게 좋다 // admin, user, manager (enum을 쓰면 오타없이 domain 즉 범위를 정할 수 있음) 이번엔 String 쓸것

	@CreationTimestamp // 시간이 자동 입력
	private Timestamp createDate;

}
