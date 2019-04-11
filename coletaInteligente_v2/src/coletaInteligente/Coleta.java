/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coletaInteligente;
import java.util.Calendar;

/**
 *
 * @author thiagomr8
 * TESTE BRANCH 29-03/16:02
 */

public class Coleta {

    Lixeira lixeira;
    Coletor coletor;

    float nivel_Atual;
    Calendar c = Calendar.getInstance();
    int dia;
    int mes;
    int ano;
    int hora;
    int minutos;
    
    public Coleta() {
        
    }
    
    public Coleta(Lixeira lixeira, Coletor coleta, String nivel_Atual) 
    {
        this.lixeira = lixeira;
        this.coletor = coleta;
        this.nivel_Atual = Float.parseFloat(nivel_Atual);
        this.dia = c.get(Calendar.DAY_OF_MONTH);
        this.mes = c.get(Calendar.MONTH);
        this.ano = c.get(Calendar.YEAR);
        this.hora = c.get(Calendar.HOUR_OF_DAY);
        this.minutos = c.get(Calendar.MINUTE);
            
    }

//    public void setNome_Coletor(Coletor nome_Coletor) {
//        this.nome_Coletor = nome_Coletor;
//    }

    public void setNivel_Atual(float nivel_Atual) {
        this.nivel_Atual = nivel_Atual;
    }
    public float getNivel_Atual() {
        return nivel_Atual;
    }

    public int getMinutos() 
    {
        return minutos;
    }
    public int getHora() 
    {
        return hora;
    }
    public int getDia()
    {
        return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAno()
    {
        return ano;
    }
    
    //Imprimindo Informações
    public void imprimeInfo()
    {
        System.out.println("Lixeira: " + lixeira.getCodigo()+ ", " + "Coletor: " + coletor.getCodigo() + ", " + "Nível na coleta: " + getNivel_Atual() + ", " + "Horas " + getHora() + ":" + getMinutos() + " , " + getDia() + "/" + getMes() + "/" + getAno());
    }

}
