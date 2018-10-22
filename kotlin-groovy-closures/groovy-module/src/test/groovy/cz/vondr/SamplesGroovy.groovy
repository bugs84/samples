package cz.vondr

import org.junit.Test

class SamplesGroovy {

    @Test
    void "groovy findAll vs kotlin filter"() {
        assert [1, 2, 3, 4, 5].findAll { it < 3 } == [1, 2]
    }

    @Test
    void "groovy find vs kotlin find"() {
        assert [1, 2, 3, 4, 5].find { it < 3 } == 1
    }

    @Test
    void "groovy each vs kotlin foreach"() {
        def sum = 0
        [1, 2, 3].each { sum += it }
        assert sum == 6
    }


    @Test
    void "just for testing purpose"() {
        def sum = 0
        [1, 2, 3].each { sum += it }
        assert sum == 6
    }

    //Tips
//    List	dropWhile(Closure condition)
//    Returns a suffix of this List where elements are dropped from the front while the given Closure evaluates to true.
}
