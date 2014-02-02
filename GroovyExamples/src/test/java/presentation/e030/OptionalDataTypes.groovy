//Nepovinne datove typy
int three = 2 + 1
def four = 2 + 2

int plus1(int a, int b) {
    return a + b
}

def plus2(a, b) {
    a + b
}

assert 3 == plus1(1, 2)
assert 3 == plus2(1, 2)