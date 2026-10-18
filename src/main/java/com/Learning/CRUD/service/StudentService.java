package com.Learning.CRUD.service;

import com.Learning.CRUD.dto.StudentCreateRequestDto;
import com.Learning.CRUD.dto.StudentCreateResponseDto;
import com.Learning.CRUD.dto.StudentUpdateRequestDto;
import com.Learning.CRUD.dto.StudentUpdateResponseDto;
import com.Learning.CRUD.entity.Student;
import com.Learning.CRUD.exception.DuplicateResourceException;
import com.Learning.CRUD.exception.ResourceNotFoundException;
import com.Learning.CRUD.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public StudentCreateResponseDto createStudent(
            StudentCreateRequestDto studentCreateRequestDto) {
        Student studentReq = mapFromStudentCreateRequestToStudent(studentCreateRequestDto);
        if(emailExists(studentReq)){
            throw new DuplicateResourceException("Student with email " + studentReq.getEmail() + " already exists");
        }
        Student studentResp = studentRepository.save(studentReq);
        return mapFromStudentToStudentCreateResponse(studentResp);
    }


    public List<StudentCreateResponseDto> getAllStudents() {

        List<Student> studentList =
                studentRepository.findByDeletedIsFalse();
        return studentList.stream()
                .map(this::mapFromStudentToStudentCreateResponse)
                .toList();

    }

    public StudentCreateResponseDto getStudentById(Long id){
        Student studentRes = studentRepository
                .findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Student of Id "+id+ " is not found!"));

        return mapFromStudentToStudentCreateResponse(studentRes);
    }


    public StudentUpdateResponseDto updateStudent(Long id, StudentUpdateRequestDto updatedStudentReq){

            Student existedStudent = studentRepository.findById(id).orElseThrow(
                    ()-> new ResourceNotFoundException("Student with id " + id + " is not found!!"));
            existedStudent.setName(updatedStudentReq.getName());
            existedStudent.setRollNo(updatedStudentReq.getRollNo());
            existedStudent.setAge(updatedStudentReq.getAge());
            existedStudent.setSubject(updatedStudentReq.getSubject());
            return mapFromStudentToStudentUpdateResponse(studentRepository.save(existedStudent));
    }

    public void deleteStudent(Long id){
        Student student = studentRepository
                .findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Student with id " + id + "is  not found!!"));
        studentRepository.delete(student);
    }

    public void deleteStudentSoftly(Long id){
        Student studentToDelete = studentRepository
                .findById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Student with id "+id+" does not exist!!")
                );
        studentToDelete.setDeleted(true);
        studentRepository.save(studentToDelete);
    }


    private Student mapFromStudentCreateRequestToStudent(
            StudentCreateRequestDto studentCreateRequestDto){

        Student student = new Student();

        student.setName(studentCreateRequestDto.getName());
        student.setEmail(studentCreateRequestDto.getEmail());
        student.setSubject(studentCreateRequestDto.getSubject());
        student.setRollNo(studentCreateRequestDto.getRollNo());
        student.setAge(studentCreateRequestDto.getAge());
        student.setDeleted(false);
        student.setCreatedAt(LocalDateTime.now());
        student.setUpdatedAt(LocalDateTime.now());

        return student;
    }

    private StudentCreateResponseDto
            mapFromStudentToStudentCreateResponse(Student student){
        StudentCreateResponseDto studentCreateResponseDto =
                new StudentCreateResponseDto();

        studentCreateResponseDto.setId(student.getId());
        studentCreateResponseDto.setName(student.getName());
        studentCreateResponseDto.setEmail(student.getEmail());
        studentCreateResponseDto.setSubject(student.getSubject());
        studentCreateResponseDto.setRollNo(student.getRollNo());
        studentCreateResponseDto.setAge(student.getAge());
        studentCreateResponseDto.setCreatedAt(student.getCreatedAt());

        return studentCreateResponseDto;
    }

    private StudentUpdateResponseDto
    mapFromStudentToStudentUpdateResponse(Student student){
        StudentUpdateResponseDto studentUpdateResponseDto =
                new StudentUpdateResponseDto();
        studentUpdateResponseDto.setName(student.getName());
        studentUpdateResponseDto.setRollNo(student.getRollNo());
        studentUpdateResponseDto.setAge(student.getAge());
        studentUpdateResponseDto.setSubject(student.getSubject());
        studentUpdateResponseDto.setMessage("Student Updated Successfully");
        studentUpdateResponseDto.setUpdatedAt(LocalDateTime.now());

        return studentUpdateResponseDto;
    }


    private boolean emailExists(Student student){
        // Since email is not a primary key, it takes a lot of time to search.
        // We should use indexing in DB to make it faster.
        // But for a simple project it is ok, but keep this in mind when developing a real application.
        return studentRepository.existsByEmail(student.getEmail());
    }

}
