package techlab.clases.c7;

public class Bebida extends Producto {
    private int volumenML;

    public Bebida(String nombre, double precio, int volumenML){
        super(nombre, precio);
        this.volumenML = volumenML;
    }

    // estamos sobreescribiendo el comportamiento de un metodo de la superclase
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        this.nuevoMetodo();
        System.out.println("Volumen: " + this.volumenML);
    }

    @Override
    public double calcularTotal() {
        return 0;
    }

    @Override
    public double calcularTotal(String dato) {
        return 0;
    }

    public void nuevoMetodo(){
        System.out.println("nuevo metodo");
    }


}
