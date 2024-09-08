package MSNMessager.Herança;



public class ComputadorPedrinho {
    public static void main(String[] args) {
        // Abrindo MSG messager
    
    MsnMessager msn = new MsnMessager();
    msn.enviarMensagem();
    msn.receberMensagem();
    System.out.println("MSN");

    FacebookMessager fcb = new FacebookMessager();
    fcb.enviarMensagem();
    fcb.receberMensagem();
    System.out.println("FACEBOOK");

    Telegram tlg = new Telegram();
    tlg.enviarMensagem();
    tlg.receberMensagem();
    System.out.println("TELEGRAM");

}
}