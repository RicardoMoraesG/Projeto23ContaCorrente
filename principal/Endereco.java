/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.principal;

/**
 *
 * @author aluno
 */
public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    private String cep;

    public Endereco(String rua, String numero, String cidade, String estado, String cep) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereco() {
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    /**
     * se o CEP digitado for exatamente igual ao do objeto referenciado, 
     * retorna o endereço completo cadastrado.
     * @param cep 
     */
    public void getLocalizacaoByCep(String cep) {
        if (cep.equalsIgnoreCase(this.getCep()) ) {
             System.out.print(this.rua);
            System.out.println("," +this.numero);
            System.out.print(this.cidade);
            System.out.println("-" +this.estado);
        } else {
            System.out.println("endereço não encontrado!");
        }
    }
    
}
