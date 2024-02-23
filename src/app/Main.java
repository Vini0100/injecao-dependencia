package app;
import services.CalculoService;
import services.FWAliquotaService;

public class Main {
    public static void main(String[] args) {

        CalculoService calculoService = new CalculoService(new FWAliquotaService()); //Passando a classe da aliquota de FW, mas passo alterar para a ALAiquotaService direto no Main do projeto

        double iptu = calculoService.tax(1000);
        System.out.println(iptu);

    }
}