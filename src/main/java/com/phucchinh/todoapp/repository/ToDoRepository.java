package com.phucchinh.todoapp.repository;

import com.phucchinh.todoapp.entity.ToDoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoEntity,Long> {
}
