package cz.vondr

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SamplesKotlin {

    @Test
    fun `Groovy findAll is Kotlin filter`() {
        assertThat(
                listOf(1, 2, 3, 4, 5).filter { it < 3 }
        ).isEqualTo(
                listOf(1, 2)
        )
    }

    @Test
    fun `Groovy find is Kotlin find`() {
        assertThat(
                listOf(1, 2, 3, 4, 5).find { it < 3 }
        ).isEqualTo(
                1
        )
    }

    @Test
    fun `Groovy each vs Kotlin foreach`() {
        var sum = 0
        listOf(1, 2, 3).forEach { sum += it }
        assertThat(sum).isEqualTo(6)
    }

    @Test
    fun `Groovy groupBy vs Kotlin groupBy`() {
        val groupBy: Map<Int, List<Int>> = listOf(1, 2, 3, 4, 5, 6, 7).groupBy { it % 3 }
        assertThat(groupBy).isEqualTo(
                mapOf(
                        0 to listOf(3, 6),
                        1 to listOf(1, 4, 7),
                        2 to listOf(2, 5)
                ))
    }


    @Test
    fun `Groovy eachWithIndex vs Kotlin forEachIndexed`() {
        var result = ""
        listOf("A", "B").forEachIndexed { index, entry ->
            result += "$index:$entry, "
        }
        assertThat(result).isEqualTo("0:A, 1:B, ")
    }

    @Test
    fun `Groovy collect vs Kotlin map`() {
        val result = listOf(1, 2, 3).map { "S-" + it }
        assertThat(result).isEqualTo(listOf("S-1", "S-2", "S-3"))
    }


    @Test
    fun `Groovy with vs Kotlin run`() {
        assertThat(
                "string".run {
                    length
                }
        ).isEqualTo(6)
    }

    @Test
    fun `Groovy with vs Kotlin run - scope`() {
        assertThat(
                run {
                    "AAA"
                }
        ).isEqualTo("AAA")
    }

    @Test
    fun `Groovy with vs Kotlin let`() {
        assertThat(
                "string".let {
                    it.length
                }
        ).isEqualTo(6)
    }

    @Test
    fun `Groovy with vs Kotlin apply`() {
        assertThat(
                "string".apply {
                    println(length)
                }
        ).isEqualTo("string")
    }

    @Test
    fun `Groovy with vs Kotlin also`() {
        assertThat(
                "string".also {
                    println(it.length)
                }
        ).isEqualTo("string")
    }



}