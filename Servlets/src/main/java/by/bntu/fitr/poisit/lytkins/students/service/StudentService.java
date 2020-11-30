package by.bntu.fitr.poisit.lytkins.students.service;

import by.bntu.fitr.poisit.lytkins.students.bean.Student;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class StudentService {
    public static List<Student> findAll(){
        return Student.total;
    }

    public static Student findById(int id){
        return Student.total.get(id);
    }

    public static void saveStudent(String name, String lastName, int age){
        Student student = new Student(Student.total.size(), name, lastName, age);
        Student.total.add(student);
    }

    public Student saveStudentApi(Student student){
        student.setId(Student.total.size());
        Student.total.add(student);
        return student;
    }
    public Student updateStudentApi(int id, Student student){
        Student.total.get(id);
        student.setId(id);
        Student.total.add(id, student);
        return student;
    }
    public Student deleteStudentApi(int id){
        Student student = Student.total.get(id);
        Student.total.remove(id);
        return student;
    }
}
