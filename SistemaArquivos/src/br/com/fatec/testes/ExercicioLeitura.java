/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.testes;

import br.com.fatec.model.Contato;
import br.com.fatec.persistencia.Arquivo;
import java.util.ArrayList;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class ExercicioLeitura {
    public static void main(String[] args) {
        ArrayList<Contato> lista = new ArrayList();
        Arquivo.lerContatos("C:\\Users\\FATEC ZONA LESTE\\Documents\\NetBeansProjects\\SistemaArquivos\\src\\br\\com\\fatec\\persistencia\\contatos.txt", lista);
    
        for(Contato contato: lista){
            System.out.println(contato);
        }
    }
}
