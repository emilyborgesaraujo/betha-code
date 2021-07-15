package Aula1007;

public class CasaMain {

    public static void main(String[] args) {
        Casa casa = new Casa("Rua ABC",2,2,80.2);

        casa.setMetragemQuadrada(90.09);

        System.out.println(casa);
    }

    public static class Casa {
        private String endereco;
        private Integer numQuartos;
        private Integer numBanheiros;
        private Double metragemQuadrada;

        public Casa(String endereco, Integer numQuartos, Integer numBanheiros, Double metragemQuadrada) {
            this.endereco = endereco;
            this.numQuartos = numQuartos;
            this.numBanheiros = numBanheiros;
            this.metragemQuadrada = metragemQuadrada;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        public Integer getNumQuartos() {
            return numQuartos;
        }

        public void setNumQuartos(Integer numQuartos) {
            this.numQuartos = numQuartos;
        }

        public Integer getNumBanheiros() {
            return numBanheiros;
        }

        public void setNumBanheiros(Integer numBanheiros) {
            this.numBanheiros = numBanheiros;
        }

        public Double getMetragemQuadrada() {
            return metragemQuadrada;
        }

        public void setMetragemQuadrada(Double metragemQuadrada) {
            this.metragemQuadrada = metragemQuadrada;
        }

        @Override
        public String toString() {
            return "Casa{" +
                    "endereco='" + endereco + '\'' +
                    ", numQuartos=" + numQuartos +
                    ", numBanheiros=" + numBanheiros +
                    ", metragemQuadrada=" + metragemQuadrada +
                    '}';
        }
    }
}
