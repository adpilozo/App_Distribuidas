import java.util.ArrayList;
import java.util.List;

// Clase User
class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Interfaz UserRepository
interface UserRepository {
    void addUser(User user);
    User getUser(int id);
    List<User> getAllUsers();
}

// Implementación de UserRepository
class UserRepositoryImpl implements UserRepository {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public User getUser(int id) {
        return users.stream()
                    .filter(user -> user.getId() == id)
                    .findFirst()
                    .orElse(null);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}

// Clase principal para ejecutar
public class Repository {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepositoryImpl();

        userRepository.addUser(new User(1, "Alice"));
        userRepository.addUser(new User(2, "Bob"));

        for (User user : userRepository.getAllUsers()) {
            System.out.println(user.getName());
        }

        User user = userRepository.getUser(1);
        System.out.println("Usuario encontrado: " + user.getName());
    }
}
