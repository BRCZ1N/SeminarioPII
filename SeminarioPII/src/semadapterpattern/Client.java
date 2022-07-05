package semadapterpattern;

import java.util.Scanner;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import org.apache.commons.validator.routines.EmailValidator;

public class Client {

	public static void main(String[] args) {

		Boolean resposta = null;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o email:");
		String email = teclado.next();
		System.out.println("Digite qual opção deseja utilizar para validar o email:");
		System.out.println("1 para InternetAddress");
		System.out.println("2 para EmailValidator");
		String escolha = teclado.next(); 
		
		if(escolha.equals("1")) {
			
			try {

				InternetAddress emailAddr = new InternetAddress(email);
				emailAddr.validate();
				resposta = true;

			} catch (AddressException e1) {

				resposta = false;

			}
			
		}else if(escolha.equals("2")){
			
			EmailValidator emailVal = EmailValidator.getInstance();
			resposta = emailVal.isValid(email);	
			
		}else {
			
			System.out.println("Opção inválida");
			
		}
		
		System.out.println(resposta);
		
		
	}

}
