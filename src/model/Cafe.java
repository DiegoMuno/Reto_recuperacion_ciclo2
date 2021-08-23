package model;

/**
 * Cafe
 */
public class Cafe {

    public static final Integer PESO_BASE = 5;
    public static final char CALIDAD_C = 'F';
    public static final double PRECIO_BASE = 100;

    public Integer peso;
    public char calidadC;
    public double precioBase;
    public int adicion = 0;

    public Cafe() {
        super();
        this.peso = PESO_BASE;
        this.calidadC = CALIDAD_C;
        this.precioBase = PRECIO_BASE;
    }

    public Cafe(double precioBase, Integer peso) {
        super();
        this.peso = peso;
        this.precioBase = precioBase;
        this.calidadC = CALIDAD_C;
    }

    public Cafe(double precioBase, Integer peso, char calidadC) {
        super();
        this.peso = peso;
        this.precioBase = precioBase;
        this.calidadC = calidadC;
    }



    ///////////Metodos///////////
    public void comprobarCalidad(char calidadC) {
        if (this.calidadC == 'F') {
            this.calidadC = CALIDAD_C;            
        } else {
            this.calidadC = calidadC;
        }     
             
        
    }
    public double calcularPrecio() {
        // <> adicion por calidad
        switch (calidadC) {
            case 'A':
                adicion = +10;
                break;
            case 'B':
                adicion = +8;
                break;
            case 'C':
                adicion = +6;
                break;
            case 'D':
                adicion = +5;
                break;
            case 'E':
                adicion = +3;
                break;
            case 'F':
                adicion = adicion + 1;
                break;
        
            default:
                
                break;
        } 
        //adicion por peso
        if (peso >= 0 && peso < 19) {
            adicion += 10;            
        } 
        else if (peso > 19 && peso <= 49) {
            adicion += 50;            
        }
        else if (peso > 49 && peso <= 80) {
            adicion += 80;            
        }        
        else if (peso > 80){
            adicion += 100;
        }
        //return precioBase + adicion;
        return precioBase + adicion;
    }

}