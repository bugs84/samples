String createHello(String name, String surname) {
    "Hello $name $surname"
}

def john = createHello("John", "Black")
//Zavorky jdou vynechat
def carl = createHello "Carl", "Brown"

assert "Hello John Black" == john
assert "Hello Carl Brown" == carl
