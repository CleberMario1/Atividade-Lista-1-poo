package bombacombustivel;


public class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombustivel;
    private double abastecerPorValor;
    private double quantidadeBomba = 1000;
    
    public BombaCombustivel(String inittipoCombustivel, double initvalorLitro, double initquantidadeCombustivel){
            this.tipoCombustivel = inittipoCombustivel;
            this.valorLitro = initvalorLitro;
            this.quantidadeCombustivel = initquantidadeCombustivel;

    }
    
    public void settipoCombustivel(String novotipoCombustivel){
        tipoCombustivel = novotipoCombustivel;
    }
    public void setvalorLitro(double novovalorLitro){
        valorLitro = novovalorLitro;
    }
    public void setquantidadeCombustivel(double novaquantidadeCombustivel){
        quantidadeCombustivel = novaquantidadeCombustivel;
    }
    public String gettipoCombustivel(){
        return tipoCombustivel;
    }
    public double getvalorLitro(){
        return valorLitro;
    }
    
    
    public double getquantidadeCombustivel(){
        return quantidadeCombustivel;
    }
    
    public void setabastecerPorValor(double novaQuantidadeAPV){
        abastecerPorValor = novaQuantidadeAPV;
    }

    public double getQuantidadeBomba() {
        return quantidadeBomba;
    }

    public void setQuantidadeBomba(double quantidadeBomba) {
        this.quantidadeBomba = quantidadeBomba;
    }
    
    public double QuantidadeBomba(){
       return this.getQuantidadeBomba() - this.abastecerPorValor(valorLitro);
               
    }
    public double QuantidadeBomba2(){
        return this.getQuantidadeBomba() - this.abastecerPorLitro(valorLitro);
    }
    public double abastecerPorValor(double abastece){
        if(abastece >0){
            return this.getquantidadeCombustivel()/this.getvalorLitro();
        }
        else{
            return 0;   
        }    
    }
    
    
    public void AlterarValor(double altera){
        setvalorLitro(altera);
      
    }
    

    public void AlterarCombustivel(String altcom){
        settipoCombustivel(altcom);
    }
    
    public void AlterarQuantidadeCombustivel(double altquancom){
        setquantidadeCombustivel(altquancom);
        
    }
    
    public double abastecerPorLitro(double absl){
        if(absl >0){
            return this.getquantidadeCombustivel()*this.getvalorLitro();
        }
        else{
            return 0;
        }
            
    }
    public static void main(String[] args) {
        BombaCombustivel bomcom = new BombaCombustivel("etanol", 5, 10);
        System.out.println(bomcom.abastecerPorValor(5));
        System.out.println("resta na bomba"+ bomcom.QuantidadeBomba());
        BombaCombustivel bomcom2 = new BombaCombustivel("diesel", 10, 50);
        System.out.println(bomcom2.abastecerPorLitro(5));
        System.out.println("resta na bomba" + bomcom.QuantidadeBomba2());
        
    }        
}
