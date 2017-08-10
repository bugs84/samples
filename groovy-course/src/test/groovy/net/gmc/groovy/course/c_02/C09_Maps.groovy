package net.gmc.groovy.course.c_02

import org.junit.Test

class C09_Maps {

    @Test
    void "empty map"() {
        Map emptyMap = [:]
        assert emptyMap.size() == 0
        println emptyMap.getClass() == LinkedHashMap
    }

    @Test
    void "basics"() {
        Map<String, Integer> map = ["Pepa": 52, "Lenka": 35, "Petr": 11]
        assert map["Petr"] == 11
        
        map["Petr"] = 12
        assert map == ["Petr": 12, "Pepa": 52, "Lenka": 35]
    }


}
