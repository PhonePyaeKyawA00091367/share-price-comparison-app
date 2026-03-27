package domain.entities;

public class User {
    private final String userId;
    private final String name;
    private final Portfolio portfolio;
    private final Watchlist watchlist;

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.portfolio = new Portfolio();
        this.watchlist = new Watchlist();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public Watchlist getWatchlist() {
        return watchlist;
    }
}
