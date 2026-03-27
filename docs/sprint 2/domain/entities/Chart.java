package domain.entities;

import java.util.List;

public abstract class Chart {
    private final String title;

    protected Chart(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract void render(List<Stock> stocks);
}
