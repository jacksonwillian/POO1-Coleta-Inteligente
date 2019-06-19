/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validador;

/**
 *
 * @author Lavinia
 */
public class ValidadorColetor {
    
    public void codigo(String codigo) throws Exception {
        if(codigo.equalsIgnoreCase(""))
            throw new Exception("O campo codigo deve ser preenchido");
        if (!codigo.matches("[0-9]*"))
            throw new Exception ("O campo codigo só deve ter numeros sem sinal");
    }    
        
    public void placa(String placa) throws Exception{
        if (placa.equalsIgnoreCase(""))
            throw new Exception ("Campo placa não pode ser vazio");
        
        if (placa.length() != 7)
            throw new Exception ("Tamanho da placa deve ser de 7 caracteres");
        
        if (placa.contains("-"))
            throw new Exception ("O caracter - nao deve ser inserido na placa");

        if (!placa.substring(0, 3).matches("[A-Z]*"))
            throw new Exception ("Tres primeiros caracteres da placa devem ser letras maiusculas");
        
        if (!placa.substring(3).matches("[0-9]*"))
            throw new Exception ("Quatro ultimos caracteres da placa devem ser numeros");
    }
    
    public void marca (String marca) throws Exception{
        if (marca.equalsIgnoreCase(""))
            throw new Exception("Campo marca não pode ser vazio");
        
        if (marca.length() > 16)
            throw new Exception ("Marca deve ter tamanho maximo de 16 caracteres");
        
        if ((marca.matches("[\\W]*") && !marca.matches("[a-zA-Z]*")) || (marca.matches("[0-9]*") && !marca.matches("[a-zA-Z]*")) )  
            throw new Exception("Marca deve conter letras!");
    }
    
    public void modelo (String modelo) throws Exception{
        if (modelo.equalsIgnoreCase(""))
            throw new Exception("Modelo não pode ser vazio");
        
        if (modelo.length() > 16)
            throw new Exception ("Modelo deve ter tamanho maximo de 16 caracteres");
        
        if ((modelo.matches("[\\W]*") && !modelo.matches("[a-zA-Z]*")) || (modelo.matches("[0-9]*") && !modelo.matches("[a-zA-Z]*")) )  
            throw new Exception("Modelo deve conter letras!");
    }
    
    public void ano (String ano) throws Exception{
        if (ano.equalsIgnoreCase(""))
            throw new Exception("Campo ano não pode ser vazio");
        
        if (!ano.matches("[0-9]*"))
            throw new Exception ("O ano deve conter apenas numeros");
        
        /*considera que o ano nao deve ser maior que o atual, e o ano minimo deve ser 1950*/
        int a = Integer.parseInt(ano);
        if (a > 2019 || a < 1950)
            throw new Exception ("O ano deve conter 4 numeros e estar situado entre 1950 e 2020");
    }
    
    public void capacidade(String capacidade) throws Exception{
        if (capacidade.equalsIgnoreCase(""))
            throw new Exception("Campo capacidade não pode ser vazio");

        if (!capacidade.matches("[0-9.]*"))
            throw new Exception ("A capacidade deve conter apenas numeros");
        
        float cap = Float.parseFloat(capacidade);
        if (cap == 0)
            throw new Exception ("A capacidade não pode ser 0");
    }
    
}
