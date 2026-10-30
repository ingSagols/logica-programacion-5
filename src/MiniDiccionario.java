import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Scanner;

public class MiniDiccionario {
    public static void main(String[] args) {
        HashMap<String, String> dicc = new HashMap<>();

        // Agregamos 20 palabras
        dicc.put("Gato", "Cat");
        dicc.put("Perro", "Dog");
        dicc.put("Casa", "House");
        dicc.put("Libro", "Book");
        dicc.put("Agua", "Water");
        dicc.put("Árbol", "Tree");
        dicc.put("Sol", "Sun");
        dicc.put("Luna", "Moon");
        dicc.put("Carro", "Car");
        dicc.put("Manzana", "Apple");
        dicc.put("Mesa", "Table");
        dicc.put("Silla", "Chair");
        dicc.put("Amigo", "Friend");
        dicc.put("Tiempo", "Time");
        dicc.put("Ciudad", "City");
        dicc.put("Comida", "Food");
        dicc.put("Escuela", "School");
        dicc.put("Niño", "Child");
        dicc.put("Familia", "Family");
        dicc.put("Dinero", "Money");

        // Agregamos palabras a un ArrayList y revolvemos
        ArrayList<String> palabras = new ArrayList<>(dicc.keySet());
        Collections.shuffle(palabras);

        // Creamos Scanner
        Scanner teclado = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        // Preguntamos la traduccion de 5 palabras
        for (int i = 0; i < 5; i++) {
            String espanol = palabras.get(i);
            System.out.print("¿Cómo se dice \"" + espanol + "\" en inglés? ");
            String respuesta = teclado.nextLine();

            // Comprobamos si la respuesta es correcta
            if (respuesta.trim().equalsIgnoreCase(dicc.get(espanol))) {
                System.out.println("¡Correcto!");
                correctas++;
            } else {
                System.out.println("Incorrecto. La respuesta es: " + dicc.get(espanol));
                incorrectas++;
            }
        }

        // Mostramos el resultado del usuario
        System.out.println("\nRespuestas correctas: " + correctas);
        System.out.println("Respuestas incorrectas: " + incorrectas);

        teclado.close();
    }
}



