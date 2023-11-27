package com.example.consumerapi.feign;

import com.example.consumerapi.models.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "viacep.com.br/ws/", name = "viacep")
public interface EnderecoFeign {
    @GetMapping("{cep}/json")
    EnderecoResponse buscarCep(@PathVariable(value = "cep") String cep);
}
