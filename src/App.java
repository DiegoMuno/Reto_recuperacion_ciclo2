import model.Cafe;
import model.CafeNacional;
import model.PrecioTotal;

public class App {
    public static void main(String[] args) throws Exception {
        Cafe cafe[]=new Cafe[4];
        cafe[0]=new Cafe(250.0, 50, 'D');        
        cafe[1]=new Cafe();
        cafe[2]=new Cafe(550.0, 20, 'D');
        cafe[3]=new CafeNacional(180.0, 30);
        //cafe[3]=new Cafe(50.0, 10);
        PrecioTotal solucion1 = new PrecioTotal(cafe);
        solucion1.mostrarTotales();
    }
}
