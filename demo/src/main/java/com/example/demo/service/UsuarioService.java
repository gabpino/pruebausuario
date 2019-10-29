package com.example.demo.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.dao.UsuarioDAO;
import com.example.demo.dao.entity.UsuarioEntity;
import com.example.demo.exception.NotValidUserException;
import com.example.demo.model.WsRequest;
import com.example.demo.model.WsResponse;

@Service
public class UsuarioService implements iUsuarioService {

	@Autowired
	private UsuarioDAO dao;

	public UsuarioService() {
		super();
	}
	
	private UsuarioEntity convertToEntity(WsRequest input)throws NotValidUserException {
		UsuarioEntity entity = new UsuarioEntity();
		Date now = new Date();
		
		if(!input.getEmail().matches("^[\\w-+]+(\\.[\\w-]{1,62}){0,126}@[\\w-]{1,63}(\\.[\\w-]{1,62})+/[\\w-]+$")) {
			throw new NotValidUserException();
		}else {
		entity.setEmail(input.getEmail());
		}
		entity.setLastLogin(now);
		entity.setModified(now);
		entity.setName(input.getName());
		entity.setPassword(input.getPassword());
		entity.setCreated(now);
		entity.setIsactive(Boolean.TRUE);
		
		return entity;
	}

	@Override
	@Transactional(readOnly = true)
	public WsResponse saveUser(@RequestBody WsRequest input) {
		WsResponse response = new WsResponse();		
		DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
		String id = UUID.randomUUID().toString();
		try {
		UsuarioEntity entity= dao.save(convertToEntity(input));
		
		response.setCreated(sourceFormat.format(entity.getCreated()));
		response.setId(id);
		response.setIsactive("true");
		response.setModified(sourceFormat.format(entity.getModified()));
		response.setToken(id);
		response.setMensaje("SUCCESS");
		}catch(Exception e) {
			response.setMensaje("Error al guardar registro.");
			throw new NotValidUserException();
		}
		return response;
	}

}
