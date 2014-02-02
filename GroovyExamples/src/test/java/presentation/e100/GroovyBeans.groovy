//GroovyBeans moc pekne moc prijemne :)

//mimochodem public je defaultni viditelnost - ne private!

class Customer {
    Integer id
    String name
    Date dob
    //zadne settery, gettery
}

//Pojmenovane parametry! - vse se nastavi na jednom radku a jeste vim co nastavuju
def customer = new Customer(id: 1, name: "Gromit", dob: new Date())
assert "Gromit" == customer.name




// Getter and Setters are called by default
class User {
    def name
    def priority

    def getName() {
        return "From getter $name"
    }
}

def user = new User(name: "admin", priority: 100)

assert "From getter admin" == user.name
assert "admin" == user.@name
