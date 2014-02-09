def file = new File("c:/tmp/file.txt")
//načtení souboru
def fileContent = file.text

fileContent = fileContent.replace("Pepa", "Karel")

//uložení souboru
file.text = fileContent