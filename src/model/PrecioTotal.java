package model;

public class PrecioTotal {
    public double totalCafe;
    public double totalCafeNacional;
    public double totalCafeExportacion;

    private Cafe listaCafe[];

    public PrecioTotal(Cafe listaCafe[]) {
        super();
        this.totalCafe = 0;
        this.totalCafeNacional = 0;
        this.totalCafeExportacion = 0;
        this.listaCafe = listaCafe;        
    }

    public void mostrarTotales() {
        for (Cafe cafe : listaCafe) {
            if (cafe instanceof CafeNacional) {
                totalCafeNacional += cafe.calcularPrecio();
            }
            else if (cafe instanceof CafeExportacion) {
                totalCafeExportacion += cafe.calcularPrecio();
            }
            else if (cafe instanceof Cafe){
                totalCafe += cafe.calcularPrecio();                
            }
            totalCafe = totalCafe + totalCafeNacional;
        }
        System.out.println("La suma del precio del café es de " + totalCafe);
        System.out.println("La suma del precio del café tipo nacional es de " + totalCafeNacional);
        //System.out.println(Cafe.adicion);
    }
    
    
}
