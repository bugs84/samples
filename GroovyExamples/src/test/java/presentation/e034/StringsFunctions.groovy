assert "abcdefg".substring(2, 5) == "cde"
//Ted pomoci rosahu
assert "abcdefg"[2..4] == "cde"
//Ted trik od dvou dokonce
assert "abcdefg"[2..-1] == "cdefg"
//Bonus
assert 'abcdefg'[1, 3..5] == "bdef"

//funkce na zarovnavani
assert 'a'.padLeft(3, '+').padRight(8, "*-") == "++a*-*-*"
assert 'c'.center(5, '+') == "++c++"