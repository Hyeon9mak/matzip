package io.github.hyeon9mak.matzip.domain

@JvmInline
value class RestaurantDistance(
    val value: Long,
) {
    init {
        require(value >= 0) { "식당까지 거리는 0 이상이어야 합니다." }
    }
}
