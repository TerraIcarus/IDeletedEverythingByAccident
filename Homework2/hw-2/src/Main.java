public class Main {
    public static void main(String[] args) {
        Animal[] animalsOnTreat = new Animal[4];

        animalsOnTreat[0] = new Cat(20, "Диван", true);
        animalsOnTreat[1] = new Dog(30, "Будка", false);
        animalsOnTreat[2] = new Horse(90, "Конюшня", true);

        for (int i = 0; i < animalsOnTreat.length; i++) {
            Veterinar.TreatAnimal(animalsOnTreat[i]);
        }
    }
}