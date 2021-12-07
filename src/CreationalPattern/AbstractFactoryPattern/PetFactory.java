package CreationalPattern.AbstractFactoryPattern;

public class PetFactory {
   static Pet getPet(PetAbstractFactory factory) {
      return factory.createPet();
   }
}
