package crud_toy_project.crud.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Board {
    // Mysql에서 데이터를 설정해 줄 때, number값을 PK로 설정해두었으므로,
    // number변수를 PK로 사용한다는 의미에서 @Id 선언
    @Id
    // 키가 생성되는 방식을 정의함. strategy = GenerationType.AUTO의 경우에는
    // 데이터 베이스가 자동적으로 키를 생성한다는 것을 나타냄
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int number; // 게시물의 번호
    private String title; // 게시물의 제목
    private String content; // 게시물의 내용
    private String user_id; // 게시자의 ID
}