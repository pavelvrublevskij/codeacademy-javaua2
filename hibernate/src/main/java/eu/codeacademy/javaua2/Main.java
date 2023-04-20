package eu.codeacademy.javaua2;

import eu.codeacademy.javaua2.service.StudentService;
import eu.codeacademy.javaua2.service.TeamService;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        TeamService teamService = new TeamService();


//        studentService.findAllStudents();
//        teamService.findAllTeams();
//        teamService.findAllTeamsByName("Zalg");
//        studentService.findAllStudentsByCourse(3);
//        teamService.findAllTeamsByName("Zalgiris");
//        studentService.createStudent(20, "Naujas", "Studentas", 2, 8.64);
        studentService.updateStudentCourse(2, 3);

    }
}