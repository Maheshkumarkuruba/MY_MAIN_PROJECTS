<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <section class="sec1">
        <form action="save">
            <label for="">vehicle id :</label>
                <input name="vehicleid" type="text" placeholder="enter id"><br>
                <label for="">vehicle price :</label>
                <input name="price" type="text" placeholder="enter price"><br>
                <label  for="">vehicle model :</label>
                <input name="vehiclemodel" type="text" placeholder="enter model"><br>
                <label for="">vehicle color :</label>
                <input  name="vehiclecolor" type="text" placeholder="enter color"><br>
                <button type="submit" id="btn">submit</button>
        </form>
        <label for="">go back to main page</label>
        <a href="welcome.jsp">click here</a>
    </section>
    </body>
    <style>
    *{
        box-sizing: border-box;
        margin: 0;
        padding: 0;
    }
    body{
    display: flex;
    justify-content: center;
    align-items: center;
    }
    .sec1{
        width: 500px;
        height: 500px;
        background-color: rgba(255, 255, 0, 0.848);
        text-transform: capitalize;
        font-size: 25px;
        margin-top: 50px;
        border-radius: 10px;
        box-shadow: 5px 5px 5px rgba(128, 128, 128, 0.89);
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
        
      
    }
    .sec1 input{
        border: none;
        outline: none;
        border-bottom: 2px solid rgba(128, 128, 128, 0.856);
        text-transform: capitalize;
        padding-left: 20px;
        width: 200px;
        height: 35px;
        border-radius: 5px;
        margin: 10px 0px;
        text-transform: capitalize;
        /* justify-content: center; */
    
    }
    .sec1 #btn{
        background-color: orangered;
        color: white;
        font-size: 20px;
        padding: 10px 20px;
        margin: 20px 130px;
        border-radius: 20px;
    }
    </style>
</form>
</body>
</html>