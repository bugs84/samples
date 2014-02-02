assert 1 + 1 == 2
assert 1 + 1 == 2, "This error message is written when assertion fail"
assert 1 + 1 == 2: "This error message is written when assertion fail"

def one = 1
assert 5 == Math.max(one, 66666)
//Vypise:
/*
Assertion failed:

assert 5 == Math.max(one, 66666)
         |       |   |
         false   |   1
                 66666

	at Asserts.run(Asserts.groovy:6)
*/
