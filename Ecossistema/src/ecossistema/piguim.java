package ecossistema;
public class piguim extends Ave {
    public void mergulhar(){
        System.out.println("Mergulhando");
    }

    @Override
    public void locomover() {
        System.out.println("Não voa");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo peixes");
    }
        

    @Override
    public void emitirSom() {
        System.out.println("Quá quá");
    }
       
    public void caçar(String mergulhar){
        if(mergulhar == "Pegar peixe"){
            System.out.println("Volta cheio");
        }else{
            System.out.println("Volta com fome");
        }
    }
    
    
}
