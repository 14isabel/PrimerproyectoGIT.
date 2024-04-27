
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario ingresar tres números enteros diferentes
        System.out.println("Ingrese el primer número entero:");
        int num1 = scanner.nextInt();
        
        System.out.println("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();
        
        System.out.println("Ingrese el tercer número entero:");
        int num3 = scanner.nextInt();
        
        // Calcular la suma de los dos números más pequeños
        int sumaDosMenores = sumarDosMenores(num1, num2, num3);
        System.out.println("La suma de los dos números más pequeños es: " + sumaDosMenores);
        
        // Calcular la diferencia entre los dos números más grandes
        int diferenciaDosMayores = diferenciaDosMayores(num1, num2, num3);
        System.out.println("La diferencia entre los dos números más grandes es: " + diferenciaDosMayores);
        
        // Encontrar el mayor de los tres números
        int mayor = encontrarMayor(num1, num2, num3);
        System.out.println("El número mayor es: " + mayor);
    }
    
    // Método para calcular la suma de los dos números más pequeños
    public static int sumarDosMenores(int num1, int num2, int num3) {
        int[] nums = {num1, num2, num3};
        // Ordenar los números de menor a mayor
        java.util.Arrays.sort(nums);
        return nums[0] + nums[1];
    }
    
    // Método para calcular la diferencia entre los dos números más grandes
    public static int diferenciaDosMayores(int num1, int num2, int num3) {
        int[] nums = {num1, num2, num3};
        // Ordenar los números de menor a mayor
        java.util.Arrays.sort(nums);
        return nums[2] - nums[1];
    }
    
    // Método para encontrar el mayor de los tres números
    public static int encontrarMayor(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
