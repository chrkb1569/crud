package crud_toy_project.crud.controller;

import crud_toy_project.crud.entity.board;
import crud_toy_project.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/boards")
    public String boards(Model model) {
        List<board> boards = crudService.getList();

        model.addAttribute("boards", boards);

        return "boards";
    }

    @GetMapping("/boards/{boardId}")
    public String board_detail(@PathVariable("boardId") Integer boardId, Model model) {
        board Find_board = crudService.findById(boardId);

        model.addAttribute("board", Find_board);

        return "board_detail";
    }

    @GetMapping("/boards/edit/{boardId}")
    public String edit_form(@PathVariable Integer boardId, Model model) {
        board Find_board = crudService.findById(boardId);

        model.addAttribute("board", Find_board);

        return "edit";
    }

    @PostMapping("/boards/edit/{boardId}")
    public String edit_result(@PathVariable Integer boardId, @ModelAttribute board board, Model model) {
        crudService.update_board(boardId, board);

        return "edit_result";
    }

}
