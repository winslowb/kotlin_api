package com.example.catalogapi

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/categories")
class CategoryController(private val repo: CategoryRepository) {

    @GetMapping
    fun all(): List<Category> = repo.findAll()

    @PostMapping
    fun create(@RequestBody category: Category): Category = repo.save(category)
}
