/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;

/**
 *
 * @author Pedro
 */
public class Produtos {
    private String codigoProduto;
    private Bolo bolo;
    private BoloRecheado boloRecheado;
    private Torta torta;
    private Cupcake cupcake;
    private Doce doce;
            
    public Produtos(){
        bolo = new Bolo();
        boloRecheado = new BoloRecheado();
        torta = new Torta();
        cupcake = new Cupcake();
        doce = new Doce();
    }

    public Bolo getBolo() {
        return bolo;
    }

    public void setBolo(Bolo bolo) {
        this.bolo = bolo;
    }

    public BoloRecheado getBoloRecheado() {
        return boloRecheado;
    }

    public void setBoloRecheado(BoloRecheado boloRecheado) {
        this.boloRecheado = boloRecheado;
    }

    public Torta getTorta() {
        return torta;
    }

    public void setTorta(Torta torta) {
        this.torta = torta;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProdutor) {
        this.codigoProduto = codigoProdutor;
    }

    public Cupcake getCupcake() {
        return cupcake;
    }

    public void setCupcake(Cupcake cupcake) {
        this.cupcake = cupcake;
    }

    public Doce getDoce() {
        return doce;
    }

    public void setDoce(Doce doce) {
        this.doce = doce;
    }
    
}
