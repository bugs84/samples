//Da se pouzit ", ale i '
assert 'hello, world' == "hello, world"
//Tim se da vyhnout otravnemu escapovani :)
assert "Hello, Groovy's world" == 'Hello, Groovy\'s world'
assert 'Say "Hello" to the world' == "Say \"Hello\" to the world"



//Multiline Da se pouzit ''', """
assert '''hello,
world''' == 'hello,\nworld' //triple-quotes for multi-line strings
assert """hello,
world""" == 'hello,\nworld' //triple-quotes for multi-line strings

//backslash spoji radky uvnitr stringu
assert 'hello, \
world' == 'hello, world'
//To se krasne hodi u Multiline stringu
def twoLineText = '''\
Line one
  Line two'''
assert twoLineText == 'Line one\n  Line two'


