public abstract class Veiculo { //Abstract nao sei como alguma das coisas acontecem mas todo mundo que quiser ser um veiculo precisara Ligar ter o metodo ligar ou seja as duas classes como estao estendidas elas precisam ter esse metodo ligar, é assim que o abstract funciona
    private String chassi;

    
    public String getChassi() {
        return chassi;
    }

    public void setChassi (String chassi) {
        this.chassi = chassi;
    }

    public abstract void ligar(); 

}
