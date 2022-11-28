import java.util.Arrays;
import java.util.Comparator;

public class ClienteCafeteria{
 public static void main( String args[]){
    BebidaCafeinada[]bebidaCafeinada = new BebidaCafeinada[2];
    Cafe cafe = new Cafe();
    Cha cha = new Cha();
    bebidaCafeinada[0] = cha;
    bebidaCafeinada[1] = cafe;
    Arrays.sort(bebidaCafeinada,new Comparator<BebidaCafeinada>() {

        @Override
        public int compare(BebidaCafeinada o1, BebidaCafeinada o2) {
        if(o1.getPreco() < o2.getPreco()){
            return -1;
        }
            else if (o1.getPreco() > o2.getPreco()){
                return 1;
            }
        return 0;

        }
    });
    
        for(BebidaCafeinada b: bebidaCafeinada){
        System.out.print( b.getClass().getName()+ " : " );
        System.out.println( b.getPreco() );

    }
}
        
    }


    

 

        






