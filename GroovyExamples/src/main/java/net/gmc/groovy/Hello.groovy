package net.gmc.groovy

public class Hello {
    public void sayHello() {
        //Call java from groovy
        println Main.HELLO
    }

    public static void main(String[] args) {
        new Hello().sayHello()
    }
}

