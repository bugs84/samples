String createHello(String name, String surname) {
   "Hello $surname, $name"
}

def john = createHello("John", "Black")
def carl = createHello "Carl", "Brown"
def alan = createHello surname: "White", name: "Alan"

assert "Hello Black, John" == john
assert "Hello Brown, Carl" == carl
assert "Hello White, Alan" == alan
