<%--
  Created by IntelliJ IDEA.
  User: Xiaomi
  Date: 25.09.2020
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body class="w3-light-grey">

<div class="w3-container w3-blue-grey w3-opacity w3-right-align">
    <h1>ADD NEW USER</h1>
</div>

<div class="w3-container w3-padding">
    <%
        if(request.getAttribute("userName") != null) {
            out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
        }
    %>
   <div class="w3-card-4">
       <div class="w3-container w3-center w3-green">
           <h2>Add User</h2>
       </div>
       <form method="post" class="w3-selection w3-light-grey w3-padding">
           <label>Last Name:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="lastName"><br />
           </label>

           <label>First Name:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="firstName"><br />
           </label>

           <label>Middle Name:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="middleName"><br />
           </label>

           <label>Birthday Date:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="date" name="birthday"><br />
           </label>

           <label>Passport Series:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="passportSeries"><br />
           </label>

           <label>Passport ID:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="password" name="passportID"><br />
           </label>

           <label>Issued by:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="password" name="issuedBy"><br />
           </label>

           <label>Date of Issue:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="date" name="issuedDate"><br />
           </label>

           <label>Identification Number:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="password" name="idNumber"><br />
           </label>

           <label>Place of Birth:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="placeOfBirth"><br />
           </label>

           <label> City of Residence
               <select class="w3-select" name="cityOfResidence">
                   <option value="" disabled selected>Choose your option</option>
                   <option value="Minsk">Minsk</option>
                   <option value="Moscow">Moscow</option>
                   <option value="Pinsk">Pinsk</option>
                   <option value="St.Petesburg">St.Petesburg</option>
                   <option value="New-York">New-York</option>
               </select> <br />
           </label>

           <label>Residence Address:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="residenceAddress"><br />
           </label>

           <label>Home Number:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="homeNumber"><br />
           </label>

           <label>Phone Number:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="phoneNumber"><br />
           </label>

           <label>E-mail:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="email"><br />
           </label>

           <label>Place of Work:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="workPlace"><br />
           </label>

           <label>Position:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="workPosition"><br />
           </label>

           <label>Place of Residence:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="placeOfResidence"><br />
           </label>

           <label> Family position:
               <select class="w3-select" name="familyPosition">
                   <option value="" disabled selected>Choose your option</option>
                   <option value="Married">Married</option>
                   <option value="Not Married">Not Married</option>
                   <option value="Divorced">Divorced</option>
               </select> <br />
           </label>

           <label> Citizenship:
               <select class="w3-select" name="citizenship">
                   <option value="" disabled selected>Choose your option</option>
                   <option value="YES">YES</option>
                   <option value="NO">NO</option>
                   <option value="PROCESS">IN PROCESS</option>
               </select> <br />
           </label>

           <label> Disability:
               <select class="w3-select" name="disability">
                   <option value="" disabled selected>Choose your option</option>
                   <option value="NO">NO</option>
                   <option value="Group 1">Group 1</option>
                   <option value="Group 2">Group 2</option>
               </select> <br />
           </label>

           <label>Are you retired?:
               <input class="w3-radio" type="radio" name="retiredOption" value="yes" checked>
               <label>YES</label>

               <input class="w3-radio" type="radio" name="retiredOption" value="no">
               <label>NO</label>

               <input class="w3-radio" type="radio" name="retiredOption" value="" disabled>
               <label>Don't know (Disabled)</label>
           </label> <br />

           <label>Month Income:
               <input class="w3-input w3-animate-input w3-border w3-round-large" type="text" name="income"><br />
           </label>

           <button type="submit" class="w3-btn w3-green w3-round-large w3-margin-bottom">Submit</button>
       </form>
   </div>
</div>

<div class="w3-container w3-grey w3-opacity w3-right-align w3-padding">
    <button class="w3-btn w3-round-large" onclick="location.href='/'">Back to main</button>
</div>

</body>
</html>
