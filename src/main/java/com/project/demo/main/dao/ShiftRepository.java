package com.project.demo.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.main.entity.Shift;

public interface ShiftRepository extends JpaRepository<Shift, Integer>{

}
