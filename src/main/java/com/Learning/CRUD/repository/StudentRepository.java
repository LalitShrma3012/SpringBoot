package com.Learning.CRUD.repository;

import com.Learning.CRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByDeletedIsFalse();

    Optional<Student> findByIdAndDeletedIsFalse(Long id);

    Boolean existsByEmail(String email);
}
