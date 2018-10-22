package net.gmc.groovy.course.c_03

import org.junit.Test

class C12_Closures_find_findAll {

    @Test
    void "find"() {
        List<String> names = ["Aja", "Majda", "Jaja"]

        assert "Jaja" == names.find({ it.startsWith("J") })

        assert "Jaja" == names.find() { it.startsWith("J") }
        // pokud je posledni parametr funkce Closure, muze se dat az za zavorky

        assert "Jaja" == names.find { it.startsWith("J") } // a kdyz funkce nema jine parametry, tak i bez zavorek
    }

    @Test
    void "findAll"() {
        List<String> names = ["Aja", "Majda", "Jaja"]

        assert ["Aja", "Jaja"] == names.findAll { it.length() <= 4 }

        assert ["Aja", "Jaja"] == names.findAll { name ->
            name.length() <= 4
        }
    }
}
