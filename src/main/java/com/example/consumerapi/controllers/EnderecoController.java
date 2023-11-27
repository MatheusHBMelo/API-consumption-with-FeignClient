package com.example.consumerapi.controllers;

import com.example.consumerapi.models.EnderecoRequest;
import com.example.consumerapi.models.EnderecoResponse;
import com.example.consumerapi.services.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/endereco")
@RestController
public class EnderecoController {
    private final EnderecoService service;

    @GetMapping("/consultar")
    public ResponseEntity<EnderecoResponse> buscar(@RequestBody EnderecoRequest request){
        return ResponseEntity.status(HttpStatus.OK).body(service.execute(request));
    }
}
