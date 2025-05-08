package com.example.catalogapi

import jakarta.persistence.*

@Entity
data class Product(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val name: String,
    val price: Double,

    @ManyToOne @JoinColumn(name = "category_id")
    val category: Category
)
