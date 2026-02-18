package br.com.mrbf.my_year_multiplatform.utils

import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Clock
import kotlin.time.Instant

class Calculate {
    fun calculateYearBirth(age: Int): String {
        val now: Instant = Clock.System.now()
        val currentYear = now.toLocalDateTime(TimeZone.currentSystemDefault()).year
        val yearBirth = currentYear - age
        return "You were born in $yearBirth"
    }
}