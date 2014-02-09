package presentation.e880

import org.codehaus.groovy.runtime.ProcessGroovyMethods

//spust commandline
def process = "cmd /c dir".execute()
// presmeruje out a err procesu do tohot procesu
ProcessGroovyMethods.consumeProcessOutput(process, System.out, System.err)
//pockej, az process dojede
process.waitFor()
