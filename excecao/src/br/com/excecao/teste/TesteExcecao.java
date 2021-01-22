package br.com.excecao.teste;

public class TesteExcecao {

	public static void main(String[] args) {

		
		/*
		 * 
		 * 
		 * 
		 */
		
		

		try
		{
			int numero = Integer.parseInt("a");
			System.out.println("Variavel: " + numero);
			
			String palavra = null;
			System.out.println("Qtde de Letras: " + palavra.length());
			
		}catch (NumberFormatException e) {

			System.out.println("Numero inválido");
			e.printStackTrace();

		}  
		catch (NullPointerException e) {

			System.out.println("Objeto nulo encontrado");
			e.printStackTrace();

		} catch (Exception e) {

			System.out.println("Deu ruim!!");
			e.printStackTrace();
	}
		finally { // vai ser executado de qualquer forma
			System.out.println("Ate logo");
		}
	}
}

