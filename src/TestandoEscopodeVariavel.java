
public class TestandoEscopodeVariavel {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais no java");
		int idade = 20;
		int quantidadeDePessoas = 1;
		
		//boolean acompanhado = quantidadeDePessoas >= 2;
		
		boolean acompanhado;
		
		if (quantidadeDePessoas >= 2 ) {
			acompanhado = true;
		}else {
			acompanhado = false;
		}
		System.out.println("valor de acompanhado =" + acompanhado);
		
		if (idade >= 18 && quantidadeDePessoas >= 2 && acompanhado) {
		    System.out.println("Seja bem vindo!");
		}else {
			System.out.println("vc nao tem 18 anos e não pode entrar");
		}
	}


}
