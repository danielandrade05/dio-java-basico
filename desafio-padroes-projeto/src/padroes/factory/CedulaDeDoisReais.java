package padroes.factory;

public class CedulaDeDoisReais implements Cedula {
  static final String DESCRICAO = "Cédula de 2 Reais.";

  @Override
  public String getDescricao() {
    return DESCRICAO;
  }
}
