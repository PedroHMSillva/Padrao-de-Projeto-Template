public class Cafe extends BebidaCafeinada{
    public void preparar(){

    esquentarAgua();
    mistura();
    colocarEmCopo();
    addCondimentos();

}
    @Override
    public void addCondimentos() {
        System.out.println("Adicionando Açúcar e Leite");
    }

    public void colocarEmCopo() {
    }
    @Override
    public void mistura() {
        System.out.println("Moendo Café");
    }

    public void esquentarAgua() {
    }
    @Override
    public double getPreco() {
    
        return 0.75;
    }
}
    


    
