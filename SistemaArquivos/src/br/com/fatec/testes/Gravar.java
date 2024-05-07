/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.testes;

import br.com.fatec.persistencia.Arquivo;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Gravar {
    public static void main(String[] args) throws IOException {
        ArrayList<String> listaGravar = new ArrayList();
        listaGravar.add("fraseGravar1");
        listaGravar.add("fraseGravar2");
        listaGravar.add("fraseGravar3");
        listaGravar.add("fraseGravar4");
        listaGravar.add("fraseGravar5");
        
        Arquivo.gravar(listaGravar, "C:\\Users\\FATEC ZONA LESTE\\Documents\\NetBeansProjects\\SistemaArquivos\\src\\br\\com\\fatec\\persistencia\\contatosnelson2.txt");
    
    }
}
