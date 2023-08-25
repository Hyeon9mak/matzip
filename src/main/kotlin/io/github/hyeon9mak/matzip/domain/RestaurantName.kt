package io.github.hyeon9mak.matzip.domain

@JvmInline
value class RestaurantName(
    val value: String,
) {
    init {
        require(value.length in 1..20) { "식당 이름은 1 ~ 20 글자 사이여야 합니다." }
    }
}
