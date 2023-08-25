package io.github.hyeon9mak.matzip.domain

interface RestaurantRepository {

    fun save(restaurant: Restaurant): Restaurant

    fun findAll(): List<Restaurant>
}