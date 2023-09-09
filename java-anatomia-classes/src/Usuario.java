public class Usuario {
    public static void main(String[] args) throws Exception{
        SmartTv tv = new SmartTv();

        System.out.println("TV Ligada? " + tv.ligada);
        System.out.println("Canal Atual: " + tv.canal);
        System.out.println("Volume Atual : " + tv.volume);
        tv.ligar();
        System.out.println("Novo Status -> TV Ligada? "+ tv.ligada);
        
        tv.desligar();
        System.out.println("Novo Status -> TV Ligada? "+ tv.ligada);

        tv.aumentarVolume();

        tv.diminuirVolume();
        tv.diminuirVolume();
        tv.diminuirVolume();

        tv.aumentarCanal();
        tv.aumentarCanal();
        tv.aumentarCanal();

        tv.diminuirCanal();

        tv.mudarCanal(10);
    }
}