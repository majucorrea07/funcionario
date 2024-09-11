package funcionario;

public class PessoaJuridica implements Funcionario {


		int valorbruto = 150;
		int imposto = 5;
		@Override
		public String nome() {
		System.out.println("Lorena");
		return "a";
		}
		@Override
		public long id() {
		System.out.println(222222);
		return 0;
		}
		@Override
		public String telefone() {
		System.out.println("15976335376");
		return "a";
		}
		@Override
		public String endereco() {
		System.out.println("Atenas do Sul");
		return "a";
		}
		@Override
		public int matricula() {
		System.out.println(152689);
		return 0;
		}
		@Override
		public void calculosal() {
		System.out.println(valorbruto-imposto);
		}


	}


