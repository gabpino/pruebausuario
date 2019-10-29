package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.WsRequest;
import com.example.demo.model.WsResponse;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/saveuser")
public class UsuarioController {

	private UsuarioService service = new UsuarioService();

	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public WsResponse saveUser(@RequestBody WsRequest input) {
		return service.saveUser(input);
	}
}
