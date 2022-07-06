package crud_toy_project.crud.service;

import crud_toy_project.crud.entity.board;
import crud_toy_project.crud.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudService {
    @Autowired
    private CrudRepository crudRepository;

    public void save(board board) {
     crudRepository.save(board);
    }

}
