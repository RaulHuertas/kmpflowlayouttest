package com.rhuertas.flowlayout

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform