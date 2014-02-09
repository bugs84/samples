def obj1 = new Integer(88)
def obj2 = new Integer(88)

//V Groovy == znamena equals()
assert obj1 == obj2

//Kdyz chci identitu, tak je zde funkce is()
assert !obj1.is(obj2)
