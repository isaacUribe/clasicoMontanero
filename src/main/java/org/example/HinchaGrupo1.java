package org.example;

public class HinchaGrupo1 extends Hincha{

    private double valorDescuento = 0.35;
    private double costoBoleta = 40000d;
    private double valorNeto;
    private double valorDescuentoTribuna;
    private double valorDescuentoFecha;

    private double valorIva;

    @Override
    public double calcularValorNeto(Integer cantidad) {
        if(cantidad >1){
            System.out.println("Error no se puede");
        }else{
            this.valorNeto =this.costoBoleta*cantidad;
        }
        return valorNeto;

    }

    @Override
    public double calcularDescuentoTribuna() {
        this.valorDescuentoTribuna=this.valorNeto -(this.valorNeto * this.valorDescuento);
        return valorDescuentoTribuna;
    }
    public double calcularDescuentoFecha(){
        this.valorDescuentoFecha = this.valorNeto-(this.valorNeto*this.obtenerDescuentoFecha(1));
        return valorDescuentoFecha;
    }

    public double calcularIva(){
        this.valorIva = this.valorNeto +(this.valorNeto * this.getIva());
        return valorIva;
    }
    public double calcularValorTotal(){
        double total = this.valorNeto-this.valorDescuentoTribuna-this.valorDescuentoFecha+this.valorIva;
        return total;
    }


}
