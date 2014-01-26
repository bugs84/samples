package samples

import org.codehaus.groovy.runtime.ProcessGroovyMethods
import groovy.transform.Field

import java.awt.Point




def process = "hello.bat".execute()
// presmeruje out a err procesu do tohot procesu!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
ProcessGroovyMethods.consumeProcessOutput(process, System.out, System.err)
process.waitFor()





//ANOTACE FIELD!!!! JINAK BY TO NEFUNGOVALO
@Field int viditelnyZMetody
methodName()
private void methodName() {
    println viditelnyZMetody
}


//sETOVANI FIELDU v CONSTRU|CTORU
assert 5 == new Point(x: 3, y:5).y


//PRETPOVAVANI
["A","B"] as HashSet
["A","B"] as LinkedList