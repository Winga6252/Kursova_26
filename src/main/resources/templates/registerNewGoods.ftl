<!DOCTYPE html>
<html>
<head>
  <title>Форма реєстрації</title>
</head>
<body>
<h1>Форма реєстрації</h1>
<form action="/register/goods" method="POST">
  <label for="name">Назва товару:</label>
  <input type="text" id="name" name="name" required><br><br>

  <label for="cost">Вартість:</label>
  <input type="text" id="cost" name="cost" required><br><br>

  <label for="unit">Одиниця вимірювання:</label>
  <input type="text" id="unit" name="unit" required><br><br>

  <label for="quantityOfGoods">Кількість на складі:</label>
  <input type="text" id="quantityOfGoods" name="quantityOfGoods" required><br><br>

  <button type="submit">Зареєструватися</button>
</form>
</body>
</html>
