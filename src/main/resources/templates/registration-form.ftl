<!DOCTYPE html>
<html>
<head>
    <title>Форма реєстрації</title>
</head>
<body>
<h1>Форма реєстрації</h1>
<form action="/register/client" method="POST">
    <label for="lastName">Прізвище:</label>
    <input type="text" id="lastName" name="lastName" required><br><br>

    <label for="name">Ім'я:</label>
    <input type="text" id="name" name="name" required><br><br>

    <label for="address">По-Батькові:</label>
    <input type="text" id="address" name="surname" required><br><br>

    <label for="address">Адреса:</label>
    <input type="text" id="address" name="address" required><br><br>

    <label for="phone">Телефон:</label>
    <input type="tel" id="phone" name="phone" required><br><br>

    <label for="eMail">E-mail:</label>
    <input type="eMail" id="eMail" name="eMail" required><br><br>

    <button type="submit">Зареєструватися</button>
</form>
</body>
</html>
