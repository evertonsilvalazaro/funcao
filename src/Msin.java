import java.util.Scanner;

public class Msin {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int x,r1,r2,r3;
	System.out.println("Digite um valor de entrada");
	x=teclado.nextInt();
	
	r1=(2*x)+2;
	r2=3;
	r3=x*(-1);
	if(x<-2){
		System.out.println(r1);
		
	}else if(x>=-2 && x<3) {
		System.out.println(r2);
	}
	else  
	System.out.println(r3);
	
	

    
    teclado.close();

	}

}
