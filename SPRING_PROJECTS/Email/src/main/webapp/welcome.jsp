<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>vehicle management</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
</head>
<body>
    <section class="sec1">
        <h1>vehicle managemenet system</h1>
        <i class="bi bi-truck-front-fill"></i> <label for="">add vehicles here :</label>
        <a href="addv.jsp">add</a><br>

        <i class="bi bi-truck-front-fill"></i><label for="">find vehicles here :</label>
        <a href="findv.jsp">find</a><br>

        <i class="bi bi-truck-front-fill"></i><label for="">delete vehicles here :</label>
        <a href="deletev.jsp">delete</a>
    </section>

    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            /* justify-items: center; */
            align-content: center;
        }
*{
    box-sizing: border-box;
    margin: 0;
    padding: 0;
}
        .sec1 {
            width: 500px;
            height: 500px;
            font-weight: bold;
            text-transform: capitalize;
           background-color:rgba(255, 255, 0, 0.879);
            font-size: 25px;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            margin-top: 50px;
            border-radius: 10px;
            box-shadow: 5px 5px 5px rgba(128, 128, 128, 0.886);
        
        }
        .sec1 i{
            position: relative;
            right: 130px;
            top: 27px;
            transition: .5s;
        }
        .sec1 i:hover{
            transform: rotate3d(0, 1, 0.5, 3.142rad);
            color:red;
        }
    </style>

    


</body>
</html>