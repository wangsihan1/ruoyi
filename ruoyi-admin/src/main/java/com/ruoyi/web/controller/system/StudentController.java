package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.system.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
@RequestMapping("/student")
public class StudentController extends BaseController {


    @GetMapping()
    public String student(){
        return "/student";
    }

    //查询所有学生返回列表页面
    @GetMapping("/students")
    public String list(Model model){

       // Collection<Student> employees = employeeDao.getAll();
       // model.addAttribute("emps",employees);
        //thymeleaf默认会拼串
        //classpath：/templates/**.html
        return "emp/list";
    }

}
