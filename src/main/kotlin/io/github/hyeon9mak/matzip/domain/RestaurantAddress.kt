package io.github.hyeon9mak.matzip.domain

@JvmInline
value class RestaurantAddress(
    val value: String,
) {
    init {
        require(value.length in 1..100) { "식당 주소는 1 ~ 20 글자 사이여야 합니다." }
    }
}
