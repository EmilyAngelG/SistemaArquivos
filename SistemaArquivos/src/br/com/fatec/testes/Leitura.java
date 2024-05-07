/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.testes;

import br.com.fatec.persistencia.Arquivo;
import java.util.ArrayList;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Leitura {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList();
        Arquivo.ler("C:\\Users\\FATEC ZONA LESTE\\Documents\\NetBeansProjects\\SistemaArquivos\\src\\br\\com\\fatec\\persistencia\\contatosnelson.txt", lista);
    
        for(String frase: lista){
            System.out.println(frase);
        }
    }
}
