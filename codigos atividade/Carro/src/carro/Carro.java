package carro;


public class Carro {
    private double ComsuCom;
    private double QuantCom;
    
    
    public Carro(double ComsuCom){
        this.ComsuCom = ComsuCom;
        this.QuantCom = 0;
        
    }
    public void ComsuCom(double novoComsuCom){
        ComsuCom = novoComsuCom;
    }
    
    public void setQuantCom(double novoQuantCom){
        QuantCom = novoQuantCom;
    }
    
    public double getComsuCom(){
        return this.ComsuCom;
    }
    
    public double getQuantCom(){
        return this.QuantCom;
    }
    public void andar(double distancia){
        double litros = distancia / getComsuCom();
        setQuantCom(getQuantCom() - litros);
    }
    public double obterGasolina(){
        return getQuantCom();
    }
        
    public void adicionarGasolina(double adiciona){
        double aumenta = getQuantCom() + adiciona;
        setQuantCom(aumenta);
        
    }       
    
    public static void main(String[] args) {
        Carro c1 = new Carro(10);
        c1.adicionarGasolina(20);
        c1.andar(10);
        System.out.println(c1.obterGasolina());
        
    }
    
}
