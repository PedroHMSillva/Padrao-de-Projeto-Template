public abstract class BebidaCafeinada {
    public void preparar(){
        esquentarAgua();
        mistura();
        colocarEmCopo();
        if(temCondimentos()){
    }
        addCondimentos();
        
        getPreco();
}

    public abstract double getPreco();

    public abstract void addCondimentos();

    public boolean temCondimentos() {
        return true;
    
    } 
 
    public abstract void mistura();


    public void colocarEmCopo() {
        System.out.println( "Colocando no copo" );
    }

    public void esquentarAgua() {
        System.out.println("Esquentando a água");
    }
    
}
