package by.bntu.fitr.poisit.lytkins.students.controllers;

import by.bntu.fitr.poisit.lytkins.students.bean.Student;
import by.bntu.fitr.poisit.lytkins.students.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class AllStudents extends HttpServlet {
    @GetMapping("/students")
    public String doGet(Model model) throws IOException, ServletException {

//        if(Student.total.size()==0){
//            Student.total.add(new Student(0, "Olga", "Lytkina", 20));
//        }

        model.addAttribute("studentList", StudentService.findAll());
        model.addAttribute("message", "Hello from Spring MVC");
        return "allStudents";

    }

}
