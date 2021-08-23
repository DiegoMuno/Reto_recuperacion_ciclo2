package model;

public class CafeNacional extends Cafe {

    public static final Boolean TOSTAO = false;
    
    public boolean tostao;
    public int adicionNacional = 0;
    
    public CafeNacional() {
        super();
    }

    public CafeNacional(double precioBase, Integer peso) {
        super();
        this.peso = peso;
        this.precioBase = precioBase;
        this.calidadC = CALIDAD_C;
        this.tostao = TOSTAO;
    }

    public CafeNacional(double precioBase, Integer peso, char calidadC, boolean tostao) {
        super();
        this.peso = peso;
        this.precioBase = precioBase;
        this.calidadC = calidadC;
        this.tostao = tostao;
    }
    //calculando precio del cafe nacional
    public double calcularPrecio() {

        //calculando tostao
        if (tostao == true) {
            adicionNacional += 50;            
        }
                
         //<> adicion por calidad
         switch (calidadC) {
             case 'A':
                 adicionNacional += 10;
                 break;
             case 'B':
                 adicionNacional += 8;
                 break;
             case 'C':
                 adicionNacional += 6;
                 break;
             case 'D':
                 adicionNacional += 5;
                 break;
             case 'E':
                 adicionNacional += 3;
                 break;
             case 'F':
                 adicionNacional += 1;
                 break;
                    default:
              
                 break;
         } 
         //adicion por peso
         if (peso >= 0 && peso < 19) {
             adicionNacional += 10;            
         } 
         else if (peso > 19 && peso <= 49) {
             adicionNacional += 50;            
         }
         else if (peso > 49 && peso <= 80) {
             adicionNacional += 80;            
         }        
         else if (peso > 80){
             adicionNacional += 100;
         }
         //return precioBase + adicion;
         return precioBase + adicionNacional;
    
        
    }

    
}
