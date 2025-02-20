package org.example.lesson_11

class Category(
    val id: Int,
    val nameCategory: String,
    val recipeList: List<String>,
)

class Recipe(
    val id: Int,
    val title: String,
    val description: String,
    val instructions: String,
    val ingredients: List<Ingredient>,
    var portions: Int,
)

class Ingredient(
    val id: Int,
    val name: String,
    val quantityPerServing: String,
)