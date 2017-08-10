package net.gmc.groovy.course.c_01

import org.junit.Ignore
import org.junit.Test

class C01_Asserts {

    @Test
    @Ignore
    void "sample of simple assert"() {
        int number = 1

        assert number == 2

//        OUTPUT:
//        Assertion failed:
//
//        assert number == 2
//               |      |
//               1      false
    }


    @Test
    @Ignore
    void "sample of complicated assert"() {
        List<Integer> numbers = [1, 2, 3, 4, 5]
        def expected = [4, 5]

        assert numbers.findAll { it >= 3 } == expected

//        OUTPUT:
//        Assertion failed:
//
//        assert numbers.findAll { it >= 3 } == expected
//               |       |                   |  |
//               |       [3, 4, 5]           |  [4, 5]
//               [1, 2, 3, 4, 5]             false
    }


    @Test
    void "comparision operator call equals"() {
        // prorovnavani  "=="   volá equals
        // díky tomu:
        String myString = "My Value"
        assert myString == "My Value" // strigy jde normalne porovnavat

        List<Integer> intList = [1, 2, 3]
        assert intList == [1, 2, 3]  // Listy jdou normalne porovnat

        // pokud je potreba porovnavat identitu, lze pouzit 'is'
        // ale to je potreba jen hooodne vyjimecne
        assert !intList.is([1, 2, 3])
    }

    @Test
    @Ignore
    void "sample of error message"() {
        List<Integer> numbers = [1, 2, 3, 4, 5]
        def expected = [4, 5]

        assert numbers.findAll { it >= 3 } == expected: "My custom error message"
//        assert numbers.findAll { it >= 3 } == expected, "My custom error message"

//      ALE POZOR PAK UZ SE NENAMALUJE TEN KRASNY STROM S TIM CO MELO JAKOU HODNOTU  !!!
//      TO UZ JE NA VAS SI VSECHNO VYPSAT V TE ERROR MESSAGE                         !!!

//        OUTPUT:
//        java.lang.AssertionError: My custom error message. Expression: (numbers.findAll({ -> ... }) == expected). Values: expected = [4, 5]
    }


}
