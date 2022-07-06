package crud_toy_project.crud.repository;

import crud_toy_project.crud.entity.board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // JPA가 관리하는 Repository라는 것을 명시함
// Jparepository<>를 상속함으로써 Repository 구현 이때, <Entity 클래스 명, ID 필드 타입(PK)>로 상속해야함을 유의할것
public interface CrudRepository extends JpaRepository<board, Integer> {
}
