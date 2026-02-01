<!DOCTYPE html>
<html>
<head>
    <title>Add User</title>
    <script>
        function validateForm() {
            let name = document.forms["userForm"]["name"].value;
            let email = document.forms["userForm"]["email"].value;

            if (name.trim() === "" || email.trim() === "") {
                alert("All fields are required");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <h2>Add User</h2>
    <form name="userForm" action="insertUser.jsp" method="post" 
          onsubmit="return validateForm()">
        Name: <input type="text" name="name"><br>
        Email: <input type="email" name="email"><br>
        <input type="submit" value="Save">
    </form>
    <a href="listUsers.jsp">View Users</a>
</body>
</html>