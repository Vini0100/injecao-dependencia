package services;

public class CalculoService {
    private AliquotaService aliquotaService;

    public CalculoService(AliquotaService aliquotaService){ //Injeção de dependência
        this.aliquotaService = aliquotaService;
    }

    public double tax(double ant){//Função do cálculo
        ant = ant + aliquotaService.aliquota(ant);
        return ant;
    }

}
