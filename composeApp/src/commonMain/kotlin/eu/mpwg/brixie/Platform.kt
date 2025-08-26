package eu.mpwg.brixie

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform