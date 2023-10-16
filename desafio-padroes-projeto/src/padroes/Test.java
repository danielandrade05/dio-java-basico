package padroes;

import padroes.singleton.*;
import padroes.strategy.*;
import padroes.facade.*;

public class Test {
  public static void main(String[] args) {
    // Singleton
    System.out.println("Testes Singleton: \n");

    SingletonLazy lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);
    lazy = SingletonLazy.getInstancia();
    System.out.println(lazy);

    SingletonEager eager = SingletonEager.getInstancia();
    System.out.println(eager);
    eager = SingletonEager.getInstancia();
    System.out.println(eager);

    SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);
    holder = SingletonLazyHolder.getInstancia();
    System.out.println(holder);

    // Strategy
    System.out.println("\nTestes Strategy: \n");

    Comportamento normal = new ComportamentoNormal();
    Comportamento defensivo = new ComportamentoDefensivo();
    Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();

    robo.setComportamento(normal);
    robo.mover();
    robo.mover();

    robo.setComportamento(defensivo);
    robo.mover();

    robo.setComportamento(agressivo);
    robo.mover();
    robo.mover();
    robo.mover();

    // Facade
    System.out.println("\nTestes Facade: \n");

    Facade facade = new Facade();
    facade.migrarCliente("Daniel", "2023000");
  }
}