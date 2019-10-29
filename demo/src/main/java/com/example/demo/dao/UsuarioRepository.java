package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.entity.UsuarioEntity;

@Repository
@Transactional
public interface UsuarioRepository extends CrudRepository<UsuarioEntity, Long> {

}
