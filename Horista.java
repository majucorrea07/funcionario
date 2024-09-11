package funcionario;

public class Horista implements Funcionario {

	int quanthora = 150;
	int valorhora = 10;
	@Override
	public String nome() {
	System.out.println("Isadora");
	return "a";
	}
	@Override
	public long id() {
	System.out.println(7593759);
	return 0;
	}
	@Override
	public String telefone() {
	System.out.println("15996832871");
	return "a";
	}
	@Override
	public String endereco() {
	System.out.println("vila arruda");
	return "a";
	}
	@Override
	public int matricula() {
	System.out.println(2382637);
	return 0;
	}
	@Override
	public void calculosal() {
	System.out.println(quanthora*valorhora);
	}

		
		
		
		
		}


