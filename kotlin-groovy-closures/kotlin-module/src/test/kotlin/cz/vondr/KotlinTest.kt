package cz.vondr

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class KotlinTest {

    @Test
    fun firstKotlin() {
        println("OKKKK")



        //groovy find
        assertThat(
                listOf(1, 2, 3, 4, 5).find { it < 3 }
        ).isEqualTo(
                1
        )

    }
}