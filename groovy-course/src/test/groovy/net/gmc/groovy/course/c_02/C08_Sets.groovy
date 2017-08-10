package net.gmc.groovy.course.c_02

import org.junit.Test

class C08_Sets {

    @Test
    void "type of set"() {
        Set<Integer> set = [1, 2]
        assert set.class == LinkedHashSet

        Set<Integer> linkedHashSet = [1, 2] as HashSet  // pretypovani as
        assert linkedHashSet.class == HashSet
    }

    @Test
    void "basic"() {
        Set<Integer> mySet = [3, 1, 2, 1, 1, 2]
        assert mySet == [1, 2, 3] as Set
    }



}
