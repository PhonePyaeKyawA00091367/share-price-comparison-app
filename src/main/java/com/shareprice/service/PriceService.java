public class PriceService {
    private PriceRepository repository;

    public PriceService(PriceRepository repository) {
        this.repository = repository;
    }

    public void savePrice(Price price) {
        repository.save(price);
    }
}
