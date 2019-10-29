package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.entity.TelefonoEntity;

@Repository
public interface TelefonoRepository extends JpaRepository<TelefonoEntity, Long> {

}
