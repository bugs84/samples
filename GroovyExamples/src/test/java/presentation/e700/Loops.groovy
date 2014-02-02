def i = 1, list = []
3.times { list << "${i++}" }
assert list.join(", ") == "1, 2, 3"