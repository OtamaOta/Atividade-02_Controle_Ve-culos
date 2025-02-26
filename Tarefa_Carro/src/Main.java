public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Sedan");
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2021, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Mercedes", "Benz", 2020, 40, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2023, 5, 75);
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "R450", 2021, 2, "Diesel", 8, -20);

        carro.exibirDetalhes();
        System.out.println("Autonomia: " + carro.calcularAutonomia() + " km");
        System.out.println();

        caminhao.exibirDetalhes();
        System.out.println("Autonomia: " + caminhao.calcularAutonomia() + " km");
        System.out.println();

        onibus.exibirDetalhes();
        System.out.println("Autonomia: " + onibus.calcularAutonomia() + " km");
        System.out.println();

        carroEletrico.exibirDetalhes();
        System.out.println("Autonomia: " + carroEletrico.calcularAutonomia() + " km");
        System.out.println();

        caminhaoRefrigerado.exibirDetalhes();
        System.out.println("Autonomia: " + caminhaoRefrigerado.calcularAutonomia() + " km");
    }
}