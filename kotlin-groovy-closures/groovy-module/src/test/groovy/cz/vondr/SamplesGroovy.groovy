package cz.vondr


import org.junit.Test

class SamplesGroovy {

    @Test
    void "Groovy findAll vs Kotlin filter"() {
        assert [1, 2, 3, 4, 5].findAll { it < 3 } == [1, 2]
    }

    @Test
    void "Groovy find vs Kotlin find"() {
        assert [1, 2, 3, 4, 5].find { it < 3 } == 1
    }

    @Test
    void "Groovy each vs Kotlin foreach"() {
        def sum = 0
        [1, 2, 3].each { sum += it }
        assert sum == 6
    }

    @Test
    void "Groovy groupBy vs Kotlin groupBy"() {
        Map<Integer, List<Integer>> groupBy = [1, 2, 3, 4, 5, 6, 7].groupBy { it % 3 }
        assert groupBy == [
                0: [3, 6],
                1: [1, 4, 7],
                2: [2, 5]
        ]
    }

    @Test
    void "Groovy eachWithIndex vs Kotlin forEachIndexed"() {
        def result = ""
        ["A", "B"].eachWithIndex { entry, index ->
            result += "$index:$entry, "
        }
        assert result == "0:A, 1:B, "
    }

    @Test
    void "Groovy collect vs Kotlin map"() {
        List<String> result = [1, 2, 3].collect { "S-" + it }
        assert result == ["S-1", "S-2", "S-3"]
    }

    @Test
    void "Groovy with vs Kotlin run"() {
        assert "string".with {
            length()
        } == 6
    }

    @Test
    void "Groovy with vs Kotlin run - scope"() {
        assert with {
            "AAA"
        } == "AAA"
    }

    @Test
    void "Groovy with vs Kotlin let"() {
        assert "string".with {
            it.length()
        } == 6
    }

    @Test
    void "Groovy with vs Kotlin apply"() {
        assert "string".with {
            println length()
            it //  :-/
        } == "string"
    }

    @Test
    void "Groovy with vs Kotlin also"() {
        assert "string".with {
            println it.length()
            it //  :-/
        } == "string"
    }



    //Tips
//    List	dropWhile(Closure condition)
//    Returns a suffix of this List where elements are dropped from the front while the given Closure evaluates to true.
}
