<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Details</title>
</head>

<body>
    <section>
        <h1>details of vehicles</h1>
        <h1>vehicle id : ${param.vehicleid }</h1>
        <h1>vehicle price : ${param.price }</h1>
        <h1>vehicle model: ${param.vehiclemodel }</h1>
        <h1>vehicle color : ${param.vehiclecolor }</h1>
    </section>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
        }

        section {
            width: 500px;
            height: 500px;
            background-color: yellow;
            display: contents;
            justify-content: center;
            align-items: center;
            border-radius: 10px;
            box-shadow: 7px 7px 5px rgba(128, 128, 128, 0.875);
        }
    </style>
</body>

</html>