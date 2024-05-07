/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.fatec.model;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Contato {
    private String nome;
    private String email;
    private String celular;
    
    public Contato(String nome, String email, String celular){
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    };

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    

    @Override
    public String toString() {
        return "Nome: "+getNome()+"\nEmail: "+getEmail()+"\nCelular: "+getCelular()+"\n";
    }
    
}
