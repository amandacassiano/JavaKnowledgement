
public class TestandoCondicionais {

	public static void main(String[] args) {
		System.out.println("Testando condicionais no java");
		int idade = 20;
		int quantidadeDePessoas = 3;

		if (idade >= 18) {
		    System.out.println("Seja bem vindo!");
			System.out.println("voce tem mais de 18 anos e pode entrar");
		}else {
			if (quantidadeDePessoas >= 3) {
				System.out.println(" vc nao tem 18 mas pode entrar" + " pois está acompanhado ");
			}
		}
	}

}

