package com.example.consumerapi.services;

import com.example.consumerapi.feign.EnderecoFeign;
import com.example.consumerapi.models.EnderecoRequest;
import com.example.consumerapi.models.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EnderecoService {
    private final EnderecoFeign enderecoFeign;

    public EnderecoResponse execute(EnderecoRequest request){
        return enderecoFeign.buscarCep(request.getCep());
    }
}
