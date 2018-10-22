plugins {
    groovy
}

group = "cz.vondr.sample"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.codehaus.groovy:groovy-all:2.3.11")
    testCompile("junit", "junit", "4.12")
}

