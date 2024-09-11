package funcionario;

public class Jornada implements Funcionario{

	int horatrab = 150;
	int valorhora = 10;
	@Override
	public String nome() {
	System.out.println("Pedro");
	return "a";
	}
	@Override
	public long id() {
	System.out.println(277849);
	return 0;
	}
	@Override
	public String telefone() {
	System.out.println("15998895581");
	return "a";
	}
	@Override
	public String endereco() {
	System.out.println("Vila Nova Itapetininga");
	return "a";
	}
	@Override
	public int matricula() {
	System.out.println(7883743);
	return 0;
	}
	@Override
	public void calculosal() {
	System.out.println(horatrab*valorhora);
	}
}


