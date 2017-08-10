package net.gmc.groovy.course.c_02

import org.junit.Ignore
import org.junit.Test

class C07_Lists {

    @Test
    void "create getter setter"() {
        List<Integer> list = [5, 6, 7]

        //get
        assert list[0] == 5

        //set
        list[0] = 8
        assert list == [8, 6, 7]

        assert list instanceof ArrayList
    }

    @Test
    void "empty list"() {
        List emptyList = []
        assert emptyList.size() == 0
        assert emptyList.isEmpty()
    }

    @Test
    @Ignore
    void "assert of complicated structures"() {
        List l1 = [1, 2, ["A", "B"]]
        List l2 = [1, 2, ["A", "C"]]
        assert l1 == l2

        //OUTPUT:
//        Assertion failed:
//
//        assert l1 == l2
//               |  |  |
//               |  |  [1, 2, [A, C]]
//               |  false
//               [1, 2, [A, B]]
//               [1, 2, [A, B]]
    }

    @Test
    void "conversions"() {
        String[] array = ["A", "B", "C"]
        List<String> list = ["A", "B", "C"]

        assert array.toList() == list

        //ALE stejně jako v Javě POLE NEPOUZIVEJTE!  - Všude List
    }

}
