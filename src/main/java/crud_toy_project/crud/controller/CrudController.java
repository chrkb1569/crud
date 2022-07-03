package crud_toy_project.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller// 해당 클래스가 Controller임을 표기
public class CrudController {

    @RequestMapping
    public String write_form() {
        return "writeform";
    }

    @PostMapping("/board/write")
    public String write() {
        return "";
    }

}
