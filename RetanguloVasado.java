import java.util.Scanner;

/**
 * RetanguloVasado
 */
public class RetanguloVasado {
    public static void main(String[] args) {
        int dimLargura, dimAltura, dimMargem;
        int i, j;
        Scanner teclado = new Scanner(System.in);
        dimMargem = 0;
        dimAltura = 0;
        dimLargura = 0;

        while (dimMargem < 3) {
            System.out.println("Entre com a margem");
            dimMargem = teclado.nextInt();
        }

        while (dimAltura < 3) {
            System.out.println("Entre com a altura");
            dimAltura = teclado.nextInt();
        }

        while (dimLargura < 3) {
            System.out.println("Entre com a largura");
            dimLargura = teclado.nextInt();
        }
        // Desenho de uma única linha cheia
        i = 0;
        j = 0;

        while (i < dimMargem) {
            System.out.print(" ");
            i++;
        }
        i = 0;
        while (i < dimLargura) {
            System.out.print("a");
            i++;
        }
        System.out.println("");

        i = 0;

        while (i < dimAltura - 2) {
            j = 0;
            while (j < dimMargem) {
                System.out.print(" ");
                j++;
            }
            j = 0;
            System.out.print("a");
            while (j < dimLargura - 2) {
                System.out.print(" ");
                j++;
            }
            System.out.print("a");
            System.out.println(" ");
            i++;
        }
        j = 0;
        i = 0;
        while (i < dimMargem) {
            System.out.print(" ");

            i++;
        }
        i = 0;
        while (i < dimLargura) {
            System.out.print("a");
            i++;
        }
        System.out.println("");
    }

}
