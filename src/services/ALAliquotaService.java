package services;
public class ALAliquotaService implements AliquotaService {

    @Override
    public double aliquota(double ant) {
        return ant * 0.12;
    }
}
