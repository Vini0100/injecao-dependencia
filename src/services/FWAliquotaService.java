package services;

public class FWAliquotaService implements AliquotaService {

    @Override
    public double aliquota(double ant) {
        return ant * 0.9;
    }
}
