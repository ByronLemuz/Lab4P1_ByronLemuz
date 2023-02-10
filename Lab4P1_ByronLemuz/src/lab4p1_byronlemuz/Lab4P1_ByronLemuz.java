/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p1_byronlemuz;

import java.util.Scanner;

/**
 *
 * @author lesly
 */
public class Lab4P1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lea = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("--------MENU DE EJERCICIOS-----------");
            System.out.println("1. Substitute ");
            System.out.println("2. Palindromas ");
            System.out.println("3. Contenida o no");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese una cadena (con el símbolo %d): ");
                    lea.nextLine();
                    String cadena = lea.nextLine();

                    int ii =0;
                    for (int i = 0; i < cadena.length(); i++) {
                        if (cadena.charAt(i) == '%' && cadena.charAt(i + 1) == 'd') {
                            ii =i;
                            break;
                        }

                    }

                    System.out.println("Ingrese cadena que hará la sustitución:  ");
                    String sustitucion = lea.nextLine();

                    String resultado = cadena.substring(0, ii) + sustitucion + cadena.substring(ii + 2);
                    System.out.println("Resultado: " + resultado);

                    break;

                case 2:

                    System.out.println("Ingrese una cadena (larga): ");
                    String larga = lea.nextLine();
                    System.out.println("Ingrese una cadena (corta): ");
                    String corta = lea.nextLine();

                    boolean estaContenida = false;

                    for (int i = 0; i <= larga.length() - corta.length(); i++) {
                        if (larga.charAt(i) == corta.charAt(0)) {
                            estaContenida = true;
                            for (int j = 0; j < corta.length(); j++) {
                                if (larga.charAt(i + j) != corta.charAt(j)) {
                                    estaContenida = false;
                                    break;
                                }
                            }
                            if (estaContenida) {
                                break;
                            }
                        }
                    }
                    if (estaContenida) {
                        System.out.println("La cadena corta está contenida en la cadena larga.");
                    } else {
                        System.out.println("La cadena corta no está contenida en la cadena larga.");
                    }

                    break;
                case 3:
                    System.out.print("Ingrese una palabra: ");
                    String palabra = lea.nextLine();

                    int izquierda = 0;
                    int derecha = palabra.length() - 1;
                    boolean Palindromo = true;

                    while (izquierda < derecha) {
                        char leftChar = palabra.charAt(izquierda);
                        char rightChar = palabra.charAt(derecha);
                        if (leftChar >= 'A' && leftChar <= 'Z') {
                            leftChar += ('a' - 'A');

                            if (rightChar >= 'A' && rightChar <= 'Z') {
                                rightChar += ('a' - 'A');
                            }

                            if (leftChar != rightChar) {
                                Palindromo = false;
                            }
                            break;
                        }
                        izquierda++;
                        derecha--;
                    }

                    if (Palindromo) {
                        System.out.println("La palabra es palíndroma.");
                    } else {
                        System.out.println("La palabra no es palíndroma.");
                    }

                    break;
                case 4:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        }
    }
}
