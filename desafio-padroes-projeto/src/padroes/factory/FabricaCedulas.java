package padroes.factory;

public class FabricaCedulas {
  public static Cedula getCedula(String type) {
    if (type.equalsIgnoreCase("um") || type.equalsIgnoreCase("1"))
      return new CedulaDeUmReal();

    else if (type.equalsIgnoreCase("dois") || type.equalsIgnoreCase("2"))
      return new CedulaDeDoisReais();

    else if (type.equalsIgnoreCase("cinco") || type.equalsIgnoreCase("5"))
      return new CedulaDeCincoReais();

    return null;
  }
}
