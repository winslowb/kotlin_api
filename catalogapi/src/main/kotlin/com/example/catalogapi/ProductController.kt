package com.example.catalogapi

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/products")
class ProductController(val repo: ProductRepository) {

    @GetMapping
    fun all(): List<Product> = repo.findAll()

    @PostMapping
    fun create(@RequestBody product: Product): Product = repo.save(product)
}
