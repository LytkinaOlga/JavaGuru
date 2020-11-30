package by.bntu.fitr.poisit.lytkins.students.api.controllers;

import by.bntu.fitr.poisit.lytkins.students.bean.Student;
import by.bntu.fitr.poisit.lytkins.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.awt.*;
import java.io.IOException;
import java.util.List;

@RestController
public class StudentsController extends HttpServlet {
    @Autowired
    StudentService studentService;

    @GetMapping(value = "/api/students", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Student> getStudents() {
        return StudentService.findAll();
    }
    @PostMapping(value = "/api/students", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Student addStudent(@RequestBody Student student){
        return studentService.saveStudentApi(student);
    }
    @GetMapping(value = "/api/student/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Student getStudentById(@PathVariable int id){
        return StudentService.findById(id);
    }
    @PutMapping(value = "/api/student/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Student getStudentById(@PathVariable int id, @RequestBody Student student){
        return studentService.updateStudentApi(id, student);
    }
    @DeleteMapping(value = "/api/student/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Student deleteStudentById(@PathVariable int id){
        return studentService.deleteStudentApi(id);
    }


}
