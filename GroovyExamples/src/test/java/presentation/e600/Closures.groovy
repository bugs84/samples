def toTriple = { n -> n * 3 }
assert toTriple.call(5) == 15
//nebo to same, ale kratsi zapis
assert toTriple(5) == 15

//parametr se nemusi definovat
plusOne = { it + 1 }
def list = [10, 20, 30]
assert [11, 21, 31] == list.collect(plusOne)



//priklady pripravenych funkci
assert 'abcde'.find { it > 'b' } == 'c' //first one found
assert 'abcde'.findAll { it > 'b' } == ['c', 'd', 'e'] //all found
assert 'abcde'.findIndexOf { it > 'c' } == 3 //first one found

assert 'abcde'.every { it < 'g' } //true if every member fulfill condition
assert 'abcde'.any { it > 'c' } //true if at least one member fulfill condition
assert ['a', 'b', 'c'].grep {it >= 'b'} == ['b', 'c']
assert 'abc'.collect { it * 2 } == ['aa', 'bb', 'cc']


//grep examples
assert [true] == ['test', 12, 20, true].grep(Boolean), 'Class isInstance'
assert ['Groovy'] == ['test', 'Groovy', 'Java'].grep(~/^G.*/), 'Pattern match'
assert ['b', 'c'] == ['a', 'b', 'c', 'd'].grep(['b', 'c']), 'List contains'
assert [15, 16, 12] == [1, 15, 16, 30, 12].grep(12..18), 'Range contains'
assert [42.031] == [12.300, 109.20, 42.031, 42.032].grep(42.031), 'Object equals'
assert [100, 200] == [10, 20, 30, 50, 100, 200].grep({ it > 50 }), 'Closure boolean'




//OWN CLOSURE
def closureResult = methodWithClosure("Param, ") {
    it.append("Inside closure, ")
}
assert "Param, Before closure, Inside closure, After closure." == closureResult

private String methodWithClosure(String param, Closure<StringBuilder> closure) {
    def sb = new StringBuilder()
    sb.append(param)
    sb.append("Before closure, ")
    closure.call(sb)
    sb.append("After closure.")
    sb.toString()
}