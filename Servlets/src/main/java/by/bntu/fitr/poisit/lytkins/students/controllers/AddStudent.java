package by.bntu.fitr.poisit.lytkins.students.controllers;

import by.bntu.fitr.poisit.lytkins.students.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Controller
public class AddStudent extends HttpServlet {
    @GetMapping("/students/add")
    public String doGet(Model model){
        model.addAttribute("message", "Hello from Spring MVC");
        return "studentForm";
    }

    @PostMapping("/students/add")
    protected String doPost(@RequestParam String name,
                          @RequestParam String lastName,
                          @RequestParam int age) throws ServletException, IOException {
        StudentService.saveStudent(name, lastName, age);
        return "redirect: /school/students";
    }
}
