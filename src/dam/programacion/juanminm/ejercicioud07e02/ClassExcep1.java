package dam.programacion.juanminm.ejercicioud07e02;

/**
 *
 * @author Juan Miguel Navarro Martínez
 */
public class ClassExcep1 {
    public static void dividirEntreArray1(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(num / arr[i]);
        }
    }

    public static void dividirEntreArray2(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(num / arr[i]);
            } catch (ArithmeticException e) {
                System.out.println("Indefinido.");
            }
        }
    }

    public static void dividirEntreArray3(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.println(num / arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int num = 60;
        int[] arr = {-2, -1, 0, 1, 2};

        //dividirEntreArray1(num, arr);
        dividirEntreArray2(num, arr);
        dividirEntreArray3(num, arr);
    }
}