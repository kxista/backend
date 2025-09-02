package viikko2.kotitehtavat.web;

import org.springframework.stereotype.Controller;
import java.util.List;
import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import viikko2.kotitehtavat.domain.Student;


@Controller
public class StudentController {
    //luo student list johon laitat opiskelijoita
    public static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student("Aku", "Ankka"));
        students.add(new Student("Iines", "Ankka"));
        students.add(new Student("Hannu", "Hanhi"));
    }

     @GetMapping("/hello2")
    public String showStudents(Model model) {
        model.addAttribute("students", students);
        return "students";
    }


}
