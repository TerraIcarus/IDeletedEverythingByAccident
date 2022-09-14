public class Main {
    public Main()
    {

    }

    public static void main(String[] args) {
        Matrica a = new Matrica(7, 3);
        Matrica b = new Matrica(2, 9);
        int mnozhitel = 4;

        System.out.println("a * " + mnozhitel);
        Matrica resultUmnozhenie = Matrica.Umnozhenie(a, mnozhitel);
    }


}