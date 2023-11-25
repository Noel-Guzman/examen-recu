/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;



import biblioteca.ControladorPerstamo.ControladorPrestamos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Biblioteca {

  
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String eleccion = "";
        while (!eleccion.equals("9")) {
            System.out.println(
                    "1. Registrar Usuario\n2. Registrar libro\n3. Registrar prestamo\n4. Ver Usuario\n5. Ver libros\n6. Ver prestamos\n7. Ver lsita negra de usuarios \n8. Cambiar localizacion de libro\n9. Salir\nElige:");
            eleccion = sc.nextLine();
            if (eleccion.equals("1")) {
                ControladorSocios.solicitarDatosParaRegistrar();
            }
            if (eleccion.equals("2")) {
                ControladorLibros.solicitarDatosParaRegistrar();
            }
            if (eleccion.equals("3")) {
                ControladorPrestamos.solicitarDatosYCrearPrestamo();
            }
            if (eleccion.equals("4")) {
                ControladorSocios.imprimirSocios(ControladorSocios.obtener());
            }
            if (eleccion.equals("5")) {
                ControladorLibros.imprimirLibros(ControladorLibros.obtener());
            }
            if (eleccion.equals("6")) {
                ControladorPrestamos.imprimirPrestamos(ControladorPrestamos.obtener());
            }
            if (eleccion.equals("7")) {
                ControladorSocios.imprimirSociosNoFiables(ControladorSocios.obtener());
            }
            if (eleccion.equals("8")) {
                ControladorLibros.solicitarDatosParaCambiarSignatura();
            }

        }
    }
}