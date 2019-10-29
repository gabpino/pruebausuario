package com.example.demo.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.exception.NotValidUserException;
import com.example.demo.model.WsRequest;
import com.example.demo.model.WsResponse;

@Component
public interface iUsuarioService {
	public WsResponse saveUser(@RequestBody WsRequest input);
}
