package app.model;

import app.entities.User;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {
    public static void addUserToTheDataBase(User user) {
        String SQLinsert = "INSERT INTO clients(last_name, first_name, middle_name, birthday," +
                " passport_series, pasport_id, issued_by, date_of_issue, identification_number," +
                " place_of_birth, city_of_residence, residence_address, home_phone," +
                " personal_phone, email, place_of_work, position, place_of_residence," +
                " family_position, citizenship, disability, pensionary, mounth_income) "
                + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection;
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clients", "postgres", "123");

            PreparedStatement pstmt = connection.prepareStatement(SQLinsert, Statement.RETURN_GENERATED_KEYS);
            pstmt.setString(1, user.getLastName());
            pstmt.setString(2, user.getFirstName());
            pstmt.setString(3, user.getMiddleName());
            pstmt.setDate(4, (Date) user.getBirthday());
            pstmt.setString(5, user.getPassportSeries());
            pstmt.setString(6, user.getPassportID());
            pstmt.setString(7, user.getIssuedBy());
            pstmt.setDate(8, (Date) user.getDateOfIssue());
            pstmt.setString(9, user.getIdentificationNumber());
            pstmt.setString(10, user.getPlaceOfBirth());
            pstmt.setString(11, user.getCityOfResidence());
            pstmt.setString(12, user.getResidenceAddress());
            pstmt.setString(13, user.getHomeNumber());
            pstmt.setString(14, user.getPersonalPhone());
            pstmt.setString(15, user.getEmail());
            pstmt.setString(16, user.getPlaceOfWork());
            pstmt.setString(17, user.getPosition());
            pstmt.setString(18, user.getPlaceOfResidence());
            pstmt.setString(19, user.getFamilyPosition());
            pstmt.setString(20, user.getCitizenship());
            pstmt.setString(21, user.getDisability());
            pstmt.setInt(22, user.isPensionary() ? 1 : 0);
            pstmt.setString(23, user.getMountIncome());

            pstmt.executeUpdate();
            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<User> getListOfUsersFromDataBase() {
        ArrayList<User> users = new ArrayList<>();

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection;
            Statement statement;
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/clients", "postgres", "123");


            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM clients;");

           while(resultSet.next()) {

               String lastName = resultSet.getString("last_name");
               String firstName = resultSet.getString("first_name");
               String middleName = resultSet.getString("middle_name");
               Date birthday = resultSet.getDate("birthday");
               String passportSeries = resultSet.getString("passport_series");
               String passportID = resultSet.getString("pasport_id");
               String issuedBy = resultSet.getString("issued_by");
               Date dateOfIssue = resultSet.getDate("date_of_issue");
               String identificationNumber = resultSet.getString("identification_number");
               String placeOfBirth = resultSet.getString("place_of_birth");
               String cityOfResidence = resultSet.getString("city_of_residence");
               String residenceAddress = resultSet.getString("residence_address");
               String homePhone = resultSet.getString("home_phone");
               String personalPhone = resultSet.getString("personal_phone");
               String email = resultSet.getString("email");
               String placeOfWork = resultSet.getString("place_of_work");
               String position = resultSet.getString("position");
               String placeOfResidence = resultSet.getString("place_of_residence");
               String familyPosition = resultSet.getString("family_position");
               String citizenship = resultSet.getString("citizenship");
               String disability = resultSet.getString("disability");
               boolean pensionary = Boolean.getBoolean(resultSet.getInt("pensionary") == 1 ? "true" : "false");
               String mounthIncome = Double.toString(resultSet.getDouble("mounth_income"));

               users.add(new User(lastName, firstName, middleName, birthday,
                       passportSeries, passportID, issuedBy, dateOfIssue, identificationNumber,
                       placeOfBirth, cityOfResidence, residenceAddress, homePhone,
                       personalPhone, email, placeOfWork, position, placeOfResidence,
                       familyPosition, citizenship, disability, pensionary, mounthIncome));
           }

            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return users;
    }
}
