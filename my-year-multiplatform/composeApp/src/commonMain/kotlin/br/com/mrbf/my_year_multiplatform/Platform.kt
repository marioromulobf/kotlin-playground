package br.com.mrbf.my_year_multiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform