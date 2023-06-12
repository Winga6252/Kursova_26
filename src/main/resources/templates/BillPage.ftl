<!DOCTYPE html>
<html>
<head>
    <title>Список продажів</title>
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
    </style>
</head>
<body>
<h1>Список продажів</h1>
<table>
    <tr>
        <th>Ім'я клієнта</th>
        <th>Назва товару</th>
        <th>Ціна товару</th>
        <th>Адреса клієнта</th>
        <th>Номер телефону клієнта</th>
        <th>Дата замовлення</th>
        <th>Очікувана дата доставки</th>
    </tr>
    <#list sale as s>
        <tr>
            <td>${s.clientId.lastName} ${s.clientId.name}</td>
            <td>${s.goodsId.name}</td>
            <td>${s.price}</td>
            <td>${s.clientId.address}</td>
            <td>${s.clientId.phone}</td>
            <td>${s.dateOfSale}</td>
            <td>${s.dateOfDelivery}</td>
            <td> <a href="/Bill_page/tray/${s.id}">
                    <button>Замовлення виконано</button>
                </a></td>
        </tr>
    </#list>
</table>
</body>
</html>
