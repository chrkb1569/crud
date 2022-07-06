package crud_toy_project.crud.controller;

import crud_toy_project.crud.entity.board;
import crud_toy_project.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// 해당 클래스가 Controller임을 표기
public class CrudController {
    @Autowired
    private CrudService crudService;

    @RequestMapping
    public String write_form() {
        return "writeform";
    }

    @PostMapping("/board/write")
    public String write(board board, Model model) {
        crudService.save(board);
        model.addAttribute("board", board);

        return "writeresultform";
    }

}
