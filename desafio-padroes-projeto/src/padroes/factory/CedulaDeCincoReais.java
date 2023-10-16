package padroes.factory;

public class CedulaDeCincoReais implements Cedula {
  static final String DESCRICAO = "Cédula de 5 Reais.";

  @Override
  public String getDescricao() {
    return DESCRICAO;
  }
}
