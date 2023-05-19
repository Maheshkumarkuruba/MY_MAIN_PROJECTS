<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login page</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
</head>

<body>
    <section class="sec1">
        <form action="validate">
            <i class="bi bi-envelope-at-fill"></i> <label for="">Email :</label>
            <input type="text" name="email" placeholder="Email"><br>
            <i class="bi bi-eye-fill" id="eye"></i> <label for="">Password :</label>
            <input id="pass" type="password" name="password" placeholder="Password"><br>
            <button type="submit">submit</button>
        </form>
    </section>
    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            display: flex;
            justify-content: center;
            align-content: center;
        }

        .sec1 {
            width: 500px;
            height: 500px;
            background-color: rgba(255, 255, 0, 0.868);
            text-transform: capitalize;
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
            font-size: 25px;
            border-radius: 10px;
            margin-top: 50px;
            /* color: white; */
        }

        .sec1 #pass {
            width: 180px;
        }

        .sec1 input {
            border: none;
            outline: none;
            border-bottom: 2px solid rgba(128, 128, 128, 0.895);
            width: 65%;
            margin: 10px 0px;
            padding-left: 20px;
            /* text-transform: capitalize; */
            height: 40px;
            border-radius: 5px;
        }

        .sec1 i {
            font-size: 20px;
        }

        .sec1 button {
            background-color: orangered;
            color: white;
            font-size: 20px;
            padding: 10px 15px;
            border-radius: 20px;
            margin: 20px 100px;
        }
    </style>

    <script>
        let eye = document.getElementById("eye");
        let pass = document.getElementById("pass")
        eye.addEventListener("click", () => {
            if (pass.type == "password") {
                pass.type = "text"

            }
            else {
                pass.type = "password"
            }
        })
    </script>
</body>

</html>