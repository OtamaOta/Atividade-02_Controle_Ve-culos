class CarroEletrico extends Carro {
    private double bateriaKWh;

    public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, double bateriaKWh) {
        super(marca, modelo, ano, capacidadePassageiros, "Elétrico", "Elétrico");
        this.bateriaKWh = bateriaKWh;
    }

    @Override
    public double calcularAutonomia() {
        return bateriaKWh * 5;
    }
}
