package cz.vondr

import org.junit.Test

class GroovyTest {

    @Test
    public void firstGroovy() {
        println "Groovy  Ok"


        //kotlin find
        assert [1, 2, 3, 4, 5].find { it < 3 } == 1
    }
}
