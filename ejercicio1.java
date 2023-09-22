package EJ1;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		     try {   
		        System.out.print("Ingrese la velocidad en kilómetros por hora (KPH): ");
		        int kph = sc.nextInt();
		        
		        if (kph < 60) {
		            System.out.println("La velocidad debe ser mayor o igual a 60 KPH.");
		        } else {
		            //System.out.println("Tabla de conversión de KPH a MPH:");
		            System.out.println("KPH \t\t MPH");
		            //System.out.printf("%d\t\t%.1f\n" ,KPH ,MPH);
		            
		        	}if (kph % 10 != 0) {
		                System.out.println("Programa finalizado, usted debe ingresar un valor múltiplo de 10 mayor a 60KPH");
		            }
		            
		            for (int i= 60; i <= 130; i= i+10) { 
		                double mph = i * 0.621;
		                System.out.println(i+ "\t\t" + mph );
		                //System.out.printf("%d\t\t%.1f\n" ,i ,mph);
		            	}
		            }catch (Exception e) {
		                System.out.println(" ERROR, EL VALOR INGRESADO NO ES UN NUMERO");
		
		            }
		
	

		       
		     	        
	
	}
	
}	