package padroes.factory;

public class CedulaDeUmReal implements Cedula{
  static final String DESCRICAO = "Cédula de 1 Real.";

  @Override
  public String getDescricao(){
    return DESCRICAO;
  }
}
