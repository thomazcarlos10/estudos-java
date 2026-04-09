public class User {
    private String username;
    private Integer id;
    private UserGitHub userGitHub;

    public User(String username, Integer id) {
        this.username = username;
        this.id = id;
    }

    public User(UserGitHub userGitHub) {
        this.username = userGitHub.login();
        this.id = Integer.valueOf(userGitHub.id());
    }

    @Override
    public String toString() {
        return "Username: " + username + ", Id: " + id;
    }
}
