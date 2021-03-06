
package coletaInteligente;

public class Lixeira {
    int codigo;
    Bairro regiao;
    float latitude;
    float longitude;
    float capacidade;
    
    public Lixeira(String codigo, Bairro regiao, String latitude, String longitude, String capacidade){
        this.codigo = Integer.parseInt(codigo);
        this.regiao = regiao;
        this.latitude = Float.parseFloat(latitude);
        this.longitude = Float.parseFloat(longitude);
        this.capacidade = Float.parseFloat(capacidade);
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Bairro getRegiao() {
        return regiao;
    }

    public void setRegiao(Bairro regiao) {
        this.regiao = regiao;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return  "codigo=" + codigo + ", regiao=" + regiao + ", latitude=" + latitude + ", longitude=" + longitude + ", capacidade=" + capacidade;
    }

  
    
}
