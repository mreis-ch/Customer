package com.rsachdev.sandbox.Customer;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository pizzaRepository){
        this.customerRepository = pizzaRepository;
    }

    @GetMapping("/all")
    public List<Customer> getAll(){
        List<Customer> pizzas = this.customerRepository.findAll();

        return pizzas;
    }

    @GetMapping("/id/{id}")
    public Optional<Customer> getById(@PathVariable("id") String id){
        Optional<Customer> pizza = this.customerRepository.findById(id);
        return pizza;
    }

    @GetMapping("/name/{name}")
    public Customer getByName(@PathVariable("name") String name){
        Customer pizza = this.customerRepository.findByName(name);
        return pizza;
    }

    @PostMapping
    public void insert(@RequestBody Customer pizza){
        this.customerRepository.insert(pizza);
    }

    @PutMapping
    public void update(@RequestBody Customer pizza){
        this.customerRepository.save(pizza);
    }
}
