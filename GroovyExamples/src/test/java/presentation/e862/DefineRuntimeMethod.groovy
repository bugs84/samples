//define own method
String.metaClass.myMethod = {-> "Zdravím " + delegate}
assert "Honzu".myMethod() == "Zdravím Honzu"

