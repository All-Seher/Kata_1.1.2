package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        //Создание таблицы
        userService.createUsersTable();

        String[] names = new String[]{"Alex", "Boris", "Carl", "Donald"};
        String[] lastNames = new String[]{"Alekseev", "Borisov", "Carlov", "Trump"};
        byte age = 20;

        //Добавление 4-х User'ов
        for (int i = 0; i < 4; i++) {
            userService.saveUser(names[i], lastNames[i], age++);
            System.out.println("User с именем " + userService.getAllUsers().get(i).getName() + " добавлен в базу данных");
        }

        for (User us : userService.getAllUsers()) {
            System.out.println(us);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
