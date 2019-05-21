
package coletaInteligente;

import Validador.ValidadorPosicao;

import java.util.Random;

public class Lixeira {
    Random random = new Random();
    
    int codigo = random.nextInt(100);
    Bairro regiao;
    float latitude;
    float longitude;
    float capacidade;
    float nivel_atual;
    
    
    public Lixeira(){
    }
    
//    public Lixeira(Bairro regiao, String capacidade){
//        this.codigo = random.nextInt(100);
//        this.regiao = regiao;
//        this.latitude = random.nextFloat();
//        this.longitude = random.nextFloat();
//        this.capacidade = Float.parseFloat(capacidade);
//    }
//   
    
 /*NÃO ESTÁ DANDO CERTO CONSTRUTORES COM PAREMETROS POR MOTIVOS DE VALIDACAO
    public Lixeira(Bairro regiao, float capacidade) throws Exception{
        this.setLatitude( Float.toString(random.nextFloat()) );
        this.codigo = random.nextInt(100);
        this.regiao = regiao;
        this.longitude = random.nextFloat();
        this.capacidade = capacidade;
    }*/

    public int getCodigo() {
        return codigo;
    }

    /*public void setCodigo() {     
        this.codigo = codigo;
    }*/

    public int getCodRegiao() {
        return regiao.getCodigo();
    }
    
    public String getNomeBairro() {
        return regiao.getNome();
    }

    public void setRegiao(Bairro regiao) {
        this.regiao = regiao;
    }

    public float getLatitude() {
        return latitude;
    }
    
    public void setNivelAtual(float nivel) {
        this.nivel_atual = nivel;
    }
    
    public float getNivelAtual() {
        return nivel_atual;
    }

    public void setLatitude(String latitude) throws Exception {
        ValidadorPosicao valPosicao = new ValidadorPosicao();
        valPosicao.latitude(latitude);
        this.latitude = Float.parseFloat(latitude);
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude() {
        this.longitude = random.nextInt(100);
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return  getCodigo()+", "+getCodRegiao()+", "+getCapacidade()+", "+getLatitude()+", "+getLongitude();
    }

}