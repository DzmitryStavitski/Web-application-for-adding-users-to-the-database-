package app.model;

import app.entities.User;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {
    public static void addUserToTheDataBase(User user) {
        String SQLinsert = "INSERT INTO users(name,password) "
                + "VALUES(?,?)";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection;
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webtest", "postgres", "123");

            PreparedStatement pstmt = connection.prepareStatement(SQLinsert, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, user.getName());
            pstmt.setInt(2, Integer.parseInt(user.getPassword()));
            pstmt.executeUpdate();

            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getListOfUsersFromDataBase() {
        String SQSelect = "SELECT * FROM users";
        ArrayList<User> users = new ArrayList<>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection;
            Statement statement;
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/webtest", "postgres", "123");


            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users;");

           while(resultSet.next()) {
               String name;
               int password;

               name = resultSet.getString("name");
               password = resultSet.getInt("password");

               users.add(new User(name, Integer.toString(password)));
           }

            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return users;
    }
}
