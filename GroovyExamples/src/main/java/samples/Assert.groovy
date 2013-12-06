package samples

assert 1 + 1 == 2
assert 1 + 1 == 2, "This error message is written when assertion fail"
assert 1 + 1 == 2: "This error message is written when assertion fail"

try {
    assert 1 + 1 == 3, "MY OWN ERROR MESSAGE!"
} catch (AssertionError e) {
    println "Failed as expected. Message is '${e.message}'";
}

