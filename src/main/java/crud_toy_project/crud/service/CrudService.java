package crud_toy_project.crud.service;

import crud_toy_project.crud.entity.board;
import crud_toy_project.crud.repository.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrudService {
    @Autowired
    private CrudRepository crudRepository;

    public void save(board board) {
     crudRepository.save(board);
    }

    public List<board> getList() {
        return crudRepository.findAll();
    }

    public board findById(Integer Id) {
        return crudRepository.findById(Id).get();
    }

    public void update_board(Integer Id, board board) {
        board find = crudRepository.findById(Id).get();
        find.setTitle(board.getTitle());
        find.setUser_id(board.getUser_id());
        find.setContent(board.getContent());

        crudRepository.save(find);
    }

}
