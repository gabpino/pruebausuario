package com.example.demo.dao;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.example.demo.dao.entity.UsuarioEntity;

@Component
public class UsuarioDAO implements UsuarioRepository {
	
	@PersistenceContext
    private EntityManager em;

	@Override
	public <S extends UsuarioEntity> S save(S entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public <S extends UsuarioEntity> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<UsuarioEntity> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<UsuarioEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<UsuarioEntity> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UsuarioEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends UsuarioEntity> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
}
