def list = [1, 2, "Pepa"]
assert "[1, 2, Pepa]" == list.toString()
assert list.get(2) == "Pepa"
assert list[2] == "Pepa"


def set = [1, 2, 3] as Set
assert set.contains(2)

def linkedList = [1,2,3] as LinkedList
assert linkedList.class.name == "java.util.LinkedList"