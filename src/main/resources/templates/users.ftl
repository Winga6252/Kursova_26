<!DOCTYPE html>
<html>
<head>
    <title>Список користувачів</title>
    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            margin-bottom: 20px;
        }

        th, td {
            border: 1px solid black;
            border-bottom: 1px solid #ddd;
            padding: 6px;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }

        button {
            background-color: #1a190d; /* Green */
            border: none;
            color: white;
            padding: 16px 32px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
            margin: 4px 2px;
            webkit-transition-duration: 0.4s; /* Safari */
            transition-duration: 0.4s;
            cursor: pointer;
        }

        button1 {
            background-color: white;
            color: black;
            border: 2px solid #000000;
        }

        button:hover {
            color: black;
            border: 1px solid #000000;
            background-color: #ffffff;
        }
    </style>
</head>
<body>
<h1>Список користувачів</h1>
<table>
    <tr>
        <th>Прізвище</th>
        <th>Ім'я</th>
        <th>По батькові</th>
        <th>Номер телефону</th>
        <th>Вибір користувача</th>
    </tr>
    <#list client as client>
        <tr>
            <td>${client.lastName}</td>
            <td>${client.name}</td>
            <td>${client.surname}</td>
            <td>${client.phone}</td>
            <td><a href="/ui/v1/goods/${client.id}"><button>Вибір</button></a></td>
        </tr>
    </#list>
</table>
<a href="/register">
<button>Зареєструватися</button>
    </a>
</body>
</html>
