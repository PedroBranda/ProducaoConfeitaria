/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pers;

import Vo.Bolo;
import Vo.BoloRecheado;
import Vo.Cupcake;
import Vo.Doce;
import Vo.Produtos;
import Vo.Torta;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class CadastroProduto {
    private ArrayList<Vo.Produtos> arrayProdutos = new ArrayList<>();
    private Scanner s1 = new Scanner(System.in);
    private ArrayList<Vo.Bolo> arrayBolo = new ArrayList<>();
    private ArrayList<Vo.BoloRecheado> arrayBoloRecheado = new ArrayList<>();
    private ArrayList<Vo.Torta> arrayTorta = new ArrayList<>();
    private ArrayList<Vo.Cupcake> arrayCupcake = new ArrayList<>();
    private ArrayList<Vo.Doce> arrayDoce = new ArrayList<>();
    
    public CadastroProduto(){
        arrayProdutos = new ArrayList<>();
        arrayBolo = new ArrayList<>();
        arrayBoloRecheado = new ArrayList<>();
        arrayTorta = new ArrayList<>();
        arrayCupcake = new ArrayList<>();
        arrayDoce = new ArrayList<>();
        s1 = new Scanner(System.in).useDelimiter("\n");
    }
    
    private void Menu(){
        int opcao;
        
        System.out.println("\nMENU");
        System.out.println("Informe a opção desejada: ");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Ver produtos cadastrados");
        System.out.println("3 - Sair\n");
        opcao = s1.nextInt();
        
        do{
            switch(opcao){
                case 1:{
                    System.out.println("\nVoce deseja cadastrar qual produto?");
                    System.out.println("1 - Bolo");
                    System.out.println("2 - Bolo Recheado");
                    System.out.println("3 - Torta");
                    System.out.println("4 - Cupcake");
                    System.out.println("5 - Doces");
                    System.out.println("6 - Voltar ao menu principal\n");
                    int opcao2;
                    opcao2 = s1.nextInt();
                    System.out.println("");
                    switch(opcao2){
                        case 1:{
                            arrayBolo.add(captarBolo());
                        }this.Menu();
                        case 2:{
                            arrayBoloRecheado.add(captarBoloRecheado());
                        }this.Menu();
                        case 3:{
                            arrayTorta.add(captarTorta());
                        }this.Menu();
                        case 4:{
                            arrayCupcake.add(captarCupcake());
                        }this.Menu();
                        case 5:{
                            arrayDoce.add(captarDoce());
                        }this.Menu();
                        case 6:{
                            this.Menu();
                        }
                        default:{
                            System.out.println("Opção invalida !!!\n");
                            this.Menu();
                        }
                    }
                }this.Menu();
                case 2:{
                    System.out.println("\nVoce deseja ver qual produto cadastrado?");
                    System.out.println("1 - Bolo");
                    System.out.println("2 - Bolo Recheado");
                    System.out.println("3 - Torta");
                    System.out.println("4 - Cupcake");
                    System.out.println("5 - Doces");
                    System.out.println("6 - Voltar ao menu principal\n");
                    int opcao3;
                    opcao3 = s1.nextInt();
                    System.out.println("");
                    switch(opcao3){
                        case 1:{
                            imprimirBolo();
                        }this.Menu();
                        case 2:{
                            imprimirBoloRecheado();
                        }this.Menu();
                        case 3:{
                            imprimirTorta();
                        }this.Menu();
                        case 4:{
                            imprimirCupcake();
                        }this.Menu();
                        case 5:{
                            imprimirDoce();
                        }this.Menu();
                        case 6:{
                            this.Menu();
                        }this.Menu();
                        default:{
                            System.out.println("Opção invalida !!!\n");
                            this.Menu();
                        }
                    }
                }this.Menu();
                case 3:{
                    System.exit(0);
                }break;
                default:{
                    this.Menu();
                }
            }
        }while(opcao!=0);
    }
    
    private Produtos captarProdutos(){
        
        Bolo bolo = new Bolo();
        System.out.println("Informe a quantidadede bolo produzida: ");
        bolo.setQntd(s1.nextInt());
        System.out.println("Informe o sabor da massa bolo: ");
        bolo.setSabor(s1.next());
        
        BoloRecheado boloRecheado = new BoloRecheado();
        System.out.println("Informe a quantidade de bolo recheado produzida: ");
        boloRecheado.setQntd(s1.nextInt());
        System.out.println("Informe o sabor da massa do bolo recheado: ");
        boloRecheado.setSabor(s1.next());
        System.out.println("Informe o sabor do recheio do bolo recheado: ");
        boloRecheado.setRecheio(s1.next());
        
        Torta torta = new Torta();
        System.out.println("Informe a quantidade produzida de torta: ");
        torta.setQntd(s1.nextInt());
        System.out.println("Informe o sabor da torta: ");
        torta.setSabor(s1.next());
        
        Produtos prod = new Produtos();
        prod.setBolo(bolo);
        prod.setBoloRecheado(boloRecheado);
        prod.setTorta(torta);
        
        System.out.println("Informe o codigo do local em que o produto foi produzido: ");
        prod.setCodigoProduto(s1.next());
        
        return prod;
    }
    
    private Bolo captarBolo(){
        Bolo bolo = new Bolo();
        
        System.out.println("Informe a quantidadede bolo produzida: ");
        bolo.setQntd(s1.nextInt());
        System.out.println("Informe o sabor da massa bolo: ");
        bolo.setSabor(s1.next());
        System.out.println("Informe a data de fabricação: ");
        bolo.setData(s1.next());
        
        return bolo;
    }
    
    private BoloRecheado captarBoloRecheado(){
        BoloRecheado boloRecheado = new BoloRecheado();
        
        System.out.println("Informe a quantidade de bolo recheado produzida: ");
        boloRecheado.setQntd(s1.nextInt());
        System.out.println("Informe o sabor da massa do bolo recheado: ");
        boloRecheado.setSabor(s1.next());
        System.out.println("Informe o sabor do recheio do bolo recheado: ");
        boloRecheado.setRecheio(s1.next());
        System.out.println("Informe a data de fabricação: ");
        boloRecheado.setData(s1.next());
        
        return boloRecheado;
    }
    
    private Torta captarTorta(){
        Torta torta = new Torta();
        
        System.out.println("Informe a quantidade produzida de torta: ");
        torta.setQntd(s1.nextInt());
        System.out.println("Informe o sabor da torta: ");
        torta.setSabor(s1.next());
        System.out.println("Informe a data de fabricação: ");
        torta.setData(s1.next());
        
        return torta;
    }
    
    private Cupcake captarCupcake(){
        Cupcake cupcake = new Cupcake();
        
        System.out.println("Informe a quantidade produzida de cupcake: ");
        cupcake.setQntd(s1.nextInt());
        System.out.println("Informe o sabor da massa do cupcake: ");
        cupcake.setSabor(s1.next());
        System.out.println("Informe o sabor da cobertura do cupcake: ");
        cupcake.setCobertura(s1.next());
        System.out.println("Informe a data de fabricação: ");
        cupcake.setData(s1.next());
        
        return cupcake;
    }
    
    private Doce captarDoce(){
        Doce doce = new Doce();
        
        System.out.println("Informe a quantidade de doce produzida: ");
        doce.setQntd(s1.nextInt());
        System.out.println("Informe o nome do doce produzido: ");
        doce.setNome(s1.next());
        System.out.println("Informe a data de fabricação: ");
        doce.setData(s1.next());
        
        return doce;
    }
    
    private void imprimirBolo(){
        for(int i=0; i < arrayBolo.size(); i++){
            System.out.println("Sabor do bolo: "+arrayBolo.get(i).getSabor());
            System.out.println("Quantidade de bolos: "+arrayBolo.get(i).getQntd());
            System.out.println("Data de fabricação: "+arrayBolo.get(i).getData());
        }
    }
    
    private void imprimirBoloRecheado(){
        for(int i=0; i < arrayBoloRecheado.size(); i++){
            System.out.println("Sabor da massa do bolo recheado: "+arrayBoloRecheado.get(i).getSabor());
            System.out.println("Sabor do recheio: "+arrayBoloRecheado.get(i).getRecheio());
            System.out.println("Quantidade de bolos rechados: "+arrayBoloRecheado.get(i).getQntd());
            System.out.println("Data de fabricação: "+arrayBoloRecheado.get(i).getData());
        }
    }
    
    private void imprimirTorta(){
        for(int i=0; i < arrayTorta.size(); i++){
            System.out.println("Sabor da torta: "+arrayTorta.get(i).getSabor());
            System.out.println("Quantidade de tortas produzidas: "+arrayTorta.get(i).getQntd());
            System.out.println("Data de fabricação: "+arrayTorta.get(i).getData());
        }
    }
    
    private void imprimirCupcake(){
        for(int i=0; i < arrayCupcake.size(); i++){
            System.out.println("Sabor da massa do cupcake: "+arrayCupcake.get(i).getSabor());
            System.out.println("Sabor da cobertura do cupcake: "+arrayCupcake.get(i).getCobertura());
            System.out.println("Quantidade de cupcake produzido: "+arrayCupcake.get(i).getQntd());
            System.out.println("Data de fabricação: "+arrayCupcake.get(i).getData());
        }
    }
    
    private void imprimirDoce(){
        for(int i=0; i < arrayDoce.size(); i++){
            System.out.println("Nome do doce produzido: "+arrayDoce.get(i).getNome());
            System.out.println("Quantidade de doce produzido: "+arrayDoce.get(i).getQntd());
            System.out.println("Data de fabricação: "+arrayDoce.get(i).getData());
        }
    }
    
    public void menuApp(){
        Menu();
    }
}
