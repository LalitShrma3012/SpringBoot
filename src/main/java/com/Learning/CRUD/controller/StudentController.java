package com.Learning.CRUD.controller;

import com.Learning.CRUD.dto.StudentCreateRequestDto;
import com.Learning.CRUD.dto.StudentCreateResponseDto;
import com.Learning.CRUD.dto.StudentUpdateRequestDto;
import com.Learning.CRUD.dto.StudentUpdateResponseDto;
import com.Learning.CRUD.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//--> spring-boot-starter-validation

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<StudentCreateResponseDto> createStudent(@Valid @RequestBody StudentCreateRequestDto studentReq){
        StudentCreateResponseDto studentRes = studentService.createStudent(studentReq);
        return ResponseEntity.status(HttpStatus.CREATED).body(studentRes);
    }

    @GetMapping
    public ResponseEntity<List<StudentCreateResponseDto>> getAllStudents(){
        List<StudentCreateResponseDto> list = studentService.getAllStudents();
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentCreateResponseDto> getStudentById(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }


    @PutMapping("/{id}")
    public ResponseEntity<StudentUpdateResponseDto> updateStudent(@PathVariable Long id,
                                                                  @Valid @RequestBody StudentUpdateRequestDto studentReq){
        return ResponseEntity.ok(studentService.updateStudent(id, studentReq));
    }


//    Hard Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }


//    Soft Delete
    @PatchMapping("/delete-soft")
    public ResponseEntity<String> deleteStudentSoftly(@RequestParam Long id){
        studentService.deleteStudentSoftly(id);
        return ResponseEntity.noContent().build();
    }

}
