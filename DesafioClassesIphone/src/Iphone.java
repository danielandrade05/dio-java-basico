public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void tocar() {
        System.out.println("Tocando...");
    }

    public void pausar() {
        System.out.println("Pausando...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando música...");
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Atendendo...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();
        
        System.out.println("Métodos de Reprodutor Musical: ");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        System.out.println("");

        System.out.println("Métodos de Aparelho Telefônico: ");
        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        System.out.println("");

        System.out.println("Métodos de Navegador de Internet: ");
        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
