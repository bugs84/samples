package net.gmc.groovy.course.c_01

import org.junit.Test

class C04_Strings {

    @Test
    void "basic String"() {
        String firstName = 'John'
        String lastName = "Doe"

        assert firstName + lastName == "JohnDoe"
    }

    @Test
    void "basic GString"() {
        String firstName = 'John'
        String lastName = "Doe"

        //GString je kdyz je obaleny do " a v nem jdou pouzit promenne ${variable}

        assert "Name is: ${firstName} $lastName" == "Name is: John Doe"
    }

    @Test
    void "single quote and double quote"() {
        String stringWithSingleQuote = " value = 'A' "
        String stringWithDoubleQuote = ' value = "A" '
        
        assert stringWithDoubleQuote == stringWithSingleQuote.replace("'", '"')
    }

    @Test
    void "multi line strings"() {
        String bmv = "BMW"

        String jsonJavaStyle ="{\n" +
                "\"name\":\"John\",\n" +
                "\"age\":30,\n" +
                "\"cars\":[ \"Ford\", \"BMW\", \"Fiat\" ]\n" +
                "}"


        // Triple double quote
        // backslash na konci radku znamena, ze se tam nevlozi enter
        String jsonTriple = """\
{
"name":"John",
"age":30,
"cars":[ "Ford", "$bmv", "Fiat" ]
}"""

        // Triple single quote
        String jsonTriple2 = '''\
{
"name":"John",
"age":30,
"cars":[ "Ford", "BMW", "Fiat" ]
}'''

        
        assert jsonJavaStyle == jsonTriple
        assert jsonJavaStyle == jsonTriple2


        //bonus:  Idea umi prevest string na multiline:
        //        Oznacis string. Zmacknes Alt+Enter  a daš  "Convert to Multiline"


    }

}
