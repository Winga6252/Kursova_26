<!DOCTYPE html>
<html>
<head>
    <title>Список товарів</title>
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
<h1>Список товарів</h1>
<table>
    <tr>
        <th>Назва</th>
        <th>Ціна</th>
        <th>Одиниця виміру</th>
        <th>Кількість</th>
        <th>Вибір</th>
    </tr>
    <#list goods as goods>
        <tr>
            <td>${goods.name}</td>
            <td>${goods.cost}</td>
            <td>${goods.unit}</td>
            <td>${goods.quantityOfGoods}</td>
            <td>
                <a href="/ui/v1/goods/${client}/save_${goods.id}">
                    <button>Вибір</button>
                </a>
            </td>
        </tr>
    </#list>
</table>
<div class="total-cost">
    Загальна вартість: ${totalCost}
</div>
<a href="/register/goods">
    <button>Новий товар</button>
</a>
<a href="/Bill_page/tray">
    <button>Завершити покупки</button>
</a>
</body>
</html>
