//Argumenty mohou mit defaultni hodnotu
String createHello(String name = "Name", String surname = "Surname") {
    "Hello $name $surname"
}

def noParam = createHello()
def oneParam = createHello("Carl")
def bothParams = createHello("Franta", "Podlaha")

assert "Hello Name Surname" == noParam
assert "Hello Carl Surname" == oneParam
assert "Hello Franta Podlaha" == bothParams

