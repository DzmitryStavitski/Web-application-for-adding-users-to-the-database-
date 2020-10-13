package app.servlets;

import app.entities.User;
import app.model.DataBase;
import app.model.Model;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lastName =  req.getParameter("lastName");
        String firstName = req.getParameter("firstName");
        String middleName = req.getParameter("middleName");
        Date birthday = Date.valueOf(req.getParameter("birthday"));
        String passportSeries = req.getParameter("passportSeries");
        String passportID = req.getParameter("passportID");
        String issuedBy = req.getParameter("issuedBy");
        Date dateOfIssue = Date.valueOf(req.getParameter("issuedDate"));
        String identificationNumber = req.getParameter("idNumber");
        String placeOfBirth = req.getParameter("placeOfBirth");
        String cityOfResidence = req.getParameter("cityOfResidence");
        String residenceAddress = req.getParameter("residenceAddress");
        String homePhone = req.getParameter("homeNumber");
        String personalPhone = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String placeOfWork = req.getParameter("workPlace");
        String position = req.getParameter("workPosition");
        String placeOfResidence = req.getParameter("placeOfResidence");
        String familyPosition = req.getParameter("familyPosition");
        String citizenship = req.getParameter("citizenship");
        String disability = req.getParameter("disability");
        boolean pensionary = Boolean.getBoolean(req.getParameter("retiredOption").equals("yes") ? "true" : "false");
        String mounthIncome = req.getParameter("income");

        User user = new User(lastName, firstName, middleName, birthday,
                passportSeries, passportID, issuedBy, dateOfIssue, identificationNumber,
                placeOfBirth, cityOfResidence, residenceAddress, homePhone,
                personalPhone, email, placeOfWork, position, placeOfResidence,
                familyPosition, citizenship, disability, pensionary, mounthIncome);


        Model model = Model.getInstance();
        model.add(user);
        DataBase.addUserToTheDataBase(user);

        req.setAttribute("userName", user.getLastName());
        doGet(req, resp);
    }
}
