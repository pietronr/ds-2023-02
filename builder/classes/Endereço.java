package classes;

public class Endereço {
    private String rua;
    private String setor;
    private String cep;
    private String numero;
    private String cidade;
    private String estado;
    private String bloco;
    private String quadra;

    private Endereço(Builder builder) {
        this.rua = builder.rua;
        this.setor = builder.setor;
        this.cep = builder.cep;
        this.numero = builder.numero;
        this.cidade = builder.cidade;
        this.estado = builder.estado;
        this.bloco = builder.bloco;
        this.quadra = builder.quadra;
    }

    public String getRua() {
        return rua;
    }

    public String getSetor() {
        return setor;
    }

    public String getCep() {
        return cep;
    }

    public String getNumero() {
        return numero;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getBloco() {
        return bloco;
    }

    public String getQuadra() {
        return quadra;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", setor='" + setor + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", bloco='" + bloco + '\'' +
                ", quadra='" + quadra + '\'' +
                '}';
    }

    public static class Builder {
        private String rua;
        private String setor;
        private String cep;
        private String numero;
        private String cidade;
        private String estado;
        private String bloco;
        private String quadra;

        public Builder(String rua, String setor, String cep, String numero) {
            this.rua = rua;
            this.setor = setor;
            this.cep = cep;
            this.numero = numero;
        }

        public Builder cidade(String cidade) {
            this.cidade = cidade;
            return this;
        }

        public Builder estado(String estado) {
            this.estado = estado;
            return this;
        }

        public Builder bloco(String bloco) {
            this.bloco = bloco;
            return this;
        }

        public Builder quadra(String quadra) {
            this.quadra = quadra;
            return this;
        }

        public Endereço build() {
            return new Endereço(this);
        }
    }
}
