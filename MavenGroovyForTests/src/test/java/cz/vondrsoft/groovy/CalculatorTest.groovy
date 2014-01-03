package cz.vondrsoft.groovy

import org.junit.Test

class CalculatorTest extends GroovyTestCase {

    def calculator = new Calculator()

    @Test
    void testAdd() {
        println "GROOVY CALCULATOR TEST IS EXECUTED"
        assert 2 == calculator.add(1, 1)
//        assert 1 == 2
    }
}
