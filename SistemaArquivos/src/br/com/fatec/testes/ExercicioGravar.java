/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.testes;

import br.com.fatec.model.Contato;
import br.com.fatec.persistencia.Arquivo;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExercicioGravar {
    public static void main(String[] args) throws IOException {
        ArrayList<Contato> listaGravar = new ArrayList();
        
        listaGravar.add(new Contato("Julio Cesar", "julio@email.com", "(11)99999-8888"));
        listaGravar.add(new Contato("Robson Guedes", "robson@email.com", "(11)99999-8888"));
        listaGravar.add(new Contato("Paulo Abreu", "paulo@email.com", "(11)99999-8888"));
        listaGravar.add(new Contato("Amanda Braga", "amanda@email.com", "(11)99999-8888"));
        listaGravar.add(new Contato("Jorge Michael", "jorge@email.com", "(11)99999-8888"));
        
        Arquivo.gravarContato(listaGravar, "C:\\Users\\FATEC ZONA LESTE\\Documents\\NetBeansProjects\\SistemaArquivos\\src\\br\\com\\fatec\\persistencia\\contatosGravados.txt");
    
    }
}
