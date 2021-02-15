package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Inicio de sessión, usuario: rays, contraseña: tarea1
        String user = "rays";
        String password = "tarea1";
        String user1;
        String password1;

            Scanner scan = new Scanner(System.in);
            System.out.println("Bienvenidos a Mandados 24/7");
            System.out.println("Favor ingrese su usuario:");
            user1 = scan.next();
            System.out.println("Favor ingrese su contraseña:");
            password1 = scan.next();
            if (user1.equals(user) && password1.equals(password)) {
                System.out.println("Bienvenidos de vuelta.");
                System.out.println("Menú Principal");
                System.out.println("Seleccione una opción");
                System.out.println("1. Para cambio de contraseña");
                System.out.println("2. Para llenar información personal");
                System.out.println("3. Para hacer un pedido");
                System.out.println("4. Cerrar sessión");
                int op = scan.nextInt();

                switch (op){
                    case 1:
                        System.out.println("Cambio de contraseña");
                        System.out.println("Ingrese su contraseña nueva:");
                        password = scan.next();
                        System.out.println("Ingrese la contraseña nueva nuevamente:");
                        String newpass = scan.next();
                        if (password.equals(newpass)) {
                            System.out.println("Su contraseña se ha cambiado satisfactoriamente.");
                    }   else {
                            System.out.println("Las contraseñas no coinciden, intente nuevamente.");
                        }

                    case 2:
                        System.out.println("Actualización de información personal:");
                        System.out.println("Ingrese su dirección ");
                        String dirección = scan.next();
                        System.out.println("Ingrese su número de teléfono o celular:");
                        String número = scan.next();
                        System.out.println("Ingrese su C.I.P:");
                        String cip = scan.next();
                        System.out.println("Ingrese su nacionalidad:");
                        String nacionalidad = scan.next();
                        System.out.println("Sus datos se han guardado satisfactoriamente.");
                        System.out.println("Dirección: " + dirección);
                        System.out.println("Número de teléfono o celular: " + número);
                        System.out.println("C.I.P: " + cip);
                        System.out.println("Nacionalidad: " + nacionalidad);

                    case 3:
			System.out.println("Escriba el articulo de eleccion");
                    	System.out.println(" Ejemplo1");
                    	System.out.println(" Ejemplo2 ");
                    	System.out.println(" Ejemplo3 ");
                    	String articulo = scan.next();
                    		if (articulo.equals(articulo)) {
                        	System.out.println("Su orden fue completada con éxito");
                        	Date date=java.util.Calendar.getInstance().getTime();
                        	System.out.println(date);
                    }
                    case 4:
                    	System.out.println("Su sesion ha terminado exitosamente");
                    }


            } else  {
                System.out.println("Intente nuevamente, datos errados.");
            }



        }
    }
