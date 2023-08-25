package io.github.hyeon9mak.matzip.infrastructure

import io.github.hyeon9mak.matzip.domain.Restaurant
import io.github.hyeon9mak.matzip.domain.RestaurantAddress
import io.github.hyeon9mak.matzip.domain.RestaurantDistance
import io.github.hyeon9mak.matzip.domain.RestaurantName
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class RestaurantJpaEntity(
    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "address", nullable = false)
    var address: String,

    @Column(name = "distance", nullable = false)
    var distance: Long,
): BaseEntity() {

    fun toRestaurant(): Restaurant = Restaurant(
        name = RestaurantName(value = name),
        address = RestaurantAddress(value = address),
        distance = RestaurantDistance(value = distance),
    )

    companion object {
        fun fromRestaurant(restaurant: Restaurant): RestaurantJpaEntity = RestaurantJpaEntity(
            name = restaurant.name.value,
            address = restaurant.address.value,
            distance = restaurant.distance.value,
        )
    }
}