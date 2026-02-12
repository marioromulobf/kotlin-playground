package org.mariofernandes.myyear

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform