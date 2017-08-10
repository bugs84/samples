package net.gmc.groovy.course.c_02

import org.junit.Test

class C11_Range {

    @Test
    void "range"() {
        (1..10).each {
            println "Ten times"
        }
        assert [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] == 1..10
    }
}
