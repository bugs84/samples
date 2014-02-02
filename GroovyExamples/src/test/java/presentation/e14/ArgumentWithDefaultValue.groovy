//Argumenty mohou mit defaultni hodnotu
String createHello(String name = "Name", String surname = "Surname") {
    "Hello $name $surname"
}

def noParam = createHello()
def oneParam = createHello("Carl", "Brown")

assert "Hello Name Surname" == noParam
assert "Hello Carl Surname" == oneParam

