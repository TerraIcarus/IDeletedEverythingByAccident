public class Matrica {
    int stroki;
    int stolb;
    int[][] massiv;

    public Matrica (int _stroki, int _stolb) {
        stroki = _stroki;
        stolb = _stolb;
        massiv = new int[_stroki][_stolb];
    }

        public static Matrica Plus(Matrica a, Matrica b) {
            Matrica result = new Matrica(a.stroki, a.stolb);

            for(int i = 0; i < a.stroki; ++i) {
                for(int j = 0; j < a.stolb; ++j) {
                    result.massiv[i][j] = a.massiv[i][j] + b.massiv[i][j];
                }
            }
            return result;
        }

    public static Matrica Umnozhenie(Matrica a, int mnozhitel) {
        Matrica result = new Matrica(a.stroki, a.stolb);

        for(int i = 0; i < a.stroki; ++i) {
            for(int j = 0; j < a.stolb; ++j) {
                result.massiv[i][j] = a.massiv[i][j] * mnozhitel;
            }
        }
        return result;
    }

    public static Matrica Peremnozhenie(Matrica a, Matrica b) {
        Matrica result = new Matrica(a.stroki, a.stolb);

        for(int i = 0; i < a.stroki; ++i) {
            for(int j = 0; j < a.stolb; ++j) {
                for(int k = 0; k < a.stolb; ++k) {
                    result.massiv[i][j] += a.massiv[i][k] * b.massiv[k][j];
                }
            }
        }

        return result;
    }

}
