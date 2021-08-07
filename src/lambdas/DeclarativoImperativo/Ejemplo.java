package lambdas.DeclarativoImperativo;
import java.util.ArrayList;

/**
 *
 * @author Irvn Cruz
 */
public class Ejemplo {

    public static void main(String[] args) {
        //Obtener numero de personas mayores  a 18
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Irvin", 22));
        users.add(new User("Alejandro", 21));
        users.add(new User("Lilia", 20));
        users.add(new User("Eric", 17));
        users.add(new User("Migiel", 19));

        //Imperativo
        int cont = 0;
        for (User user : users) {
            if (user.getAge() > 18) {
                cont++;
            }
        }
        System.out.println("Mayores a 18: " + cont);
        //Declarativo
        cont = (int) users.stream().filter(user -> user.getAge() > 18).count();
        System.out.println("Mayores a 18: " + cont);
    }

}
