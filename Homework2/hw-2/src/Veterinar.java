public class Veterinar {
    public static void TreatAnimal(Animal animal)
    {
        System.out.printf("Статус: еда = %d местоположение: %s %n", animal.getFood(), animal.getLocation(), animal.isSleep());
    }
}
