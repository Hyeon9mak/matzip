package io.github.hyeon9mak.matzip.domain

import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest

@DataJpaTest
class RestaurantRepositoryTest @Autowired constructor (
    private val restaurantRepository: RestaurantRepository,
) : FreeSpec({

    "테스트" {
        restaurantRepository.findAll() shouldBe emptyList()
    }
})
