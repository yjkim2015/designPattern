package CreationalPattern.FactoryPattern;


public class TestPetFactory {
    public static void main(String[] args) {
        Pet dog = PetFactory.getPet(Anymal.DOG,"로또", 7);
        Pet cat = PetFactory.getPet(Anymal.CAT, "토토", 2);

        System.out.println("Dog : " + dog);
        System.out.println("Cat : " + cat);
    }
}
