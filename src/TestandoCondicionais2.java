
public class TestandoCondicionais2 {

	public static void main(String[] args) {
		System.out.println("Testando condicionais no java");
		int idade = 20;
		int quantidadeDePessoas = 3;
		boolean acompanhado = quantidadeDePessoas >= 2;
        
		System.out.println("valor de acompanhado = " + acompanhado);
		
		if (idade >= 18 && quantidadeDePessoas >= 2 && acompanhado) {
		    System.out.println("Seja bem vindo!");
		}else {
			System.out.println("vc nao tem 18 anos e não pode entrar");
		}
	}

}
