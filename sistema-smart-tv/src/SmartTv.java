public class SmartTv { //Sistema da smart tv
    //criando os atributos
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar () { //metodo ligar
         ligada = true;
        
    }

    public void desligar () { //metodo desligar
        ligada = false;
       
   }

   public void aumentarVolume() { //metodo aumentarVolume
    volume++; // aumentando o volume incrementando Volume = volume +1
   }

   public void diminuirVolume() { //metodo Diminuir Volume
    volume--; // diminuindo o volume decrementando Volume = volume -1
   }

   public void aumentarCanal () { //metodo Aumentar canal
    canal++; //aumentando o canal incrementando canal = canal +1
   }

   public void diminuirCanal () { //metodo Diminuir canal
    canal--; //diminuindo o canal decrementando canal = canal -1
}
   public void mudarCanal (int novoCanal) { //mudar canal esse metodo tem um parametro entao na hora la devo colocar parametro, esse metodo mostra em qual canal vc esta
    canal = novoCanal;

   }
}
