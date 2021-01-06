package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		// String � um tipo de referencia
		// Date � um tipo de referencia
		
		String email = "LeondsdsadasdasdasdasdasdaArDoidsadasdasdasfdfsdfstau.com.br";
		
		System.out.println("Original: " + email);
		System.out.println("Maiusculo: " + email.toUpperCase());
		System.out.println("Maiusculo: " + email.toLowerCase());
		
		System.out.println("Quantidade de Cacteres: " + email.length()); // ---  CONTAGEM DE CARACTERES ---
		System.out.println("Tem arroba? " + email.contains("@")); //Valida��o do ARROBA (TRUE OR FALSE) - BOOLEAN
		
		// indexOf() = Retorna a posi�ao do caracter ou substring
		System.out.println("Posi��o do Arroba: " + email.indexOf("@"));
		
		System.out.println("Do 2� at� o 5: " + email.substring(1,9));
				
		System.out.println("Nome do usuario: " + email.substring(0,email.indexOf("@")));
		
		
		
		System.out.println("Nome do Servidor: " + email.substring(email.indexOf("@")+1,email.length()));
		
		

	}

}
