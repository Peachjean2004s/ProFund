package Lab12;
class Person {
    String name;
    int saving;

    Person(String n, int amount) {
        name = n;
        saving = amount;
    }

    void introduce_self() {
        System.out.println("Hi, My name is " + name);
    }

    @Override
    public String toString() {
        return "I am " + name + ". Mysavings amount is " + saving;
    }

    boolean isWealthier(Person p){
        return this.saving > p.saving;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (saving != other.saving)
            return false;
        return true;
    }

    int reward(Person p, int amount){
        this.saving -= amount;
        return p.saving += amount ;

        
    }
}
