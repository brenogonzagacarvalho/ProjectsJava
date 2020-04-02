import java.util.Scanner;

public class Controller {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        Agenda ag = new Agenda(" ",0);
	        System.out.print(" Agenda telefonica" );
	               
	        while (true){
	            String line = sc.nextLine();
	            String [] ui= line.split(" ");
	            if (ui[0]==" end ") {
	            	break;
	            if (ui[0]== "show") {
	            	Agenda.toString();
	            }
	            }
	        }

	}

}
