public class Cha extends BebidaCafeinada {
    public void preparar(){

        esquentarAgua();
        mistura();
        colocarEmCopo();
        addCondimentos();
    }
    @Override 
    public boolean temCondimentos(){
        return false;
    }
    @Override
    public void addCondimentos() {
        System.out.println( "Adicionando algumas gotas de limão" );
    }

    public void colocarEmCopo() {
    }
    @Override
    public void mistura() {
        System.out.println( "Preparando o saquinho de chá" );
    
    }

    public void esquentarAgua() {
    }
    @Override
    public double getPreco() {
        
        return 1.25;
    }
}
