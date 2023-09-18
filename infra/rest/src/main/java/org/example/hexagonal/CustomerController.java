package org.example.hexagonal;

import an.awesome.pipelinr.Pipeline;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerController {


    private final Pipeline pipeline;

    @GetMapping
    public String hello() {
        return "hello world";
    }

    @PostMapping
    public ResponseEntity<NewCustomerResponse> save(@Valid @RequestBody final NewCustomerRequest newCustomerRequest) {
        final Customer customer = pipeline.send(NewCustomerUseCase.builder().name(newCustomerRequest.getName()).build());
        return ResponseEntity.ok(NewCustomerResponse.builder().id(customer.getId()).build());
    }
}
