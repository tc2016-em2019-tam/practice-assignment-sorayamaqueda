public class Main {

    public static void main(String[] args) {
        // write your code here
        Dog fido, firulais, falfurrias, fifi;

        fido = new Dog("Terrier");
        firulais = new Dog (5, 25.0);
        falfurrias = new Dog ("Weimaraner", 10, 40.0);
        fifi = new Dog(15, 80.0);

        fido.setName("Fido");
        firulais.setName("Firulais");
        falfurrias.setName("Falfurrias");
        fifi.setName("Fifí");

        fido.setAge(2);
        fido.setWeight(20.0);

        firulais.setBreed("CollieConDela");

        fifi.setBreed("Doberman Pinscher");

        fifi.bark();
        fido.run();
        falfurrias.sleep();
        firulais.run();
        fifi.sleep();
        firulais.bark();

    }
}
