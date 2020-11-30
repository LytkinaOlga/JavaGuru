//package by.bntu.fitr.poisit.lytkins.students.api.controllers;
//
//import by.bntu.fitr.poisit.lytkins.students.service.StudentService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import java.io.IOException;
//
//@Controller
//public class StudentCard extends HttpServlet {
//    @GetMapping("/student/{id}")
//    protected String doGet(Model model, @PathVariable int id) throws ServletException, IOException {
//
//        model.addAttribute("student", StudentService.findById(id));
//        model.addAttribute("message", "Hello from Spring MVC");
//
//        return "studentCrd";
//    }
//}
