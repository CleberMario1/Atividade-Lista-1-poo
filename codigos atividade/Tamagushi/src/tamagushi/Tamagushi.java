package tamagushi;


public class Tamagushi {
    private String Nome;
    private double Fome, Tédio;
    private int Idadeb;
    
    
    
    public Tamagushi(String initNome, double initFome, double initTédio, int initIdadeb){
        this.Nome = initNome;
        this.Fome = initFome;
        this.Tédio = initTédio;
        this.Idadeb = initIdadeb;
    }
    public String getNome(){
        return this.Nome;
    }
    
    public void setNome(String NovoNome){
        Nome = NovoNome;
    }

    public void setFome(double NovoFome){
        Fome = NovoFome;
    }
    
    
     public String humor(){
         double humorodometro = (this.getFome() + this.getTédio())/2;
         if(humorodometro >70){
             return "Chateado";
             
         }else if(humorodometro >50){
             return "De boa";
         }else{
             return "Tranquilo";
         }
         
         
         
        
     }
     
     
    public void comer(){
        setFome(getFome()- 10);      
    } 
    public double getTédio(){
        return this.Tédio;
    }
    
    public void brincar(){
        setTédio(getTédio()- 10);       
    }
    
    public double getFome(){
        return this.Fome;
    } 
     
   
    public void setTédio(double NovoTédio){
        Tédio = NovoTédio;
    }
    
    public int getIdadeb(){
        return this.Idadeb;
    }
    public void setIdadeb(int novaidade){
        Idadeb = novaidade;
    }
    
    
    public static void main(String[] args) {
       Tamagushi t1 = new Tamagushi("aaa", 20, 20, 15);
       System.out.println(t1.humor());
       
        
        
    }
    
}
