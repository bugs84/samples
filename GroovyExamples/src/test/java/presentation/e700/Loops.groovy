//tak například times
def i = 1, list = []
3.times { list << "${i++}" }
assert list.join(", ") == "1, 2, 3"


//nebo pro tenhle priklad je jeste snad hezci closure nad rosahem
def list2 = []
(1..3).each { list2 << "$it" }
assert list2.join(", ") == "1, 2, 3"