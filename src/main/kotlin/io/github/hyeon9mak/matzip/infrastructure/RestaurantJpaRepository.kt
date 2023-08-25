package io.github.hyeon9mak.matzip.infrastructure

import io.github.hyeon9mak.matzip.domain.Restaurant
import io.github.hyeon9mak.matzip.domain.RestaurantRepository
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class RestaurantRepositoryImpl(
    private val restaurantJpaRepository: RestaurantJpaRepository
) : RestaurantRepository {
    override fun save(restaurant: Restaurant): Restaurant {
        val restaurantJpaEntity = RestaurantJpaEntity.fromRestaurant(restaurant = restaurant)
        val savedRestaurantJpaEntity = restaurantJpaRepository.save(restaurantJpaEntity)
        return savedRestaurantJpaEntity.toRestaurant()
    }

    override fun findAll(): List<Restaurant> {
        val restaurantJpaEntities = restaurantJpaRepository.findAll()
        return restaurantJpaEntities.map { it.toRestaurant() }
    }
}

interface RestaurantJpaRepository : JpaRepository<RestaurantJpaEntity, UUID> {
    fun save(restaurantJpaEntity: RestaurantJpaEntity): RestaurantJpaEntity

    override fun findAll(): List<RestaurantJpaEntity>
}