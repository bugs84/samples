package cz.vondr

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SamplesKotlin {

    @Test
    fun `groovy findAll is kotlin filter`() {
        assertThat(
                listOf(1, 2, 3, 4, 5).filter { it < 3 }
        ).isEqualTo(
                listOf(1, 2)
        )
    }

    @Test
    fun `groovy find is kotlin find`() {
        assertThat(
                listOf(1, 2, 3, 4, 5).find { it < 3 }
        ).isEqualTo(
                1
        )
    }

    @Test
    fun `groovy each vs kotlin foreach`() {
        var sum = 0
        listOf(1, 2, 3).forEach { sum += it }
        assertThat(sum).isEqualTo(6)
    }

    @Test
    fun `just for testing purpose`() {
        
    }


}