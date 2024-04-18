<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <!--<meta name="viewport" content="width=device-width, initial-scale=1.0"> -->
    <title>Sistema de Login - Cadastro de Usuário</title>
    <!-- CSS only, Copiar do site -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!--  JavaScripty Bundle winth Popper, copiar do site -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>
    <?php
    include("menu.php");
    include("session.php");

    if (isset($_GET["success"])) {
        echo "<br>
            <div class='alert alert-success' role='alert'>
            Usuário cadastrado com sucesso!
        </div>";
    }
    ?>
    <div class="conteiner">
    <label></label>
        <form class="form" method="POST" action="insert-usuario.php" enctype="multipart/form-data">
            <label>Nome:</label>
                <input type="text" class="from-control" name="nome" placeholder="Nome"/>
            
            <label>Foto de Perfil:</label>
                <input type="file" name="foto" class="from-control"> 
                <br>
            
            <label>E-mail:</label>
                <input type="email" class="from-control" name="email" placeholder="Email"/>
            
            <label>Senha:</label>
                <input type="password" class="from-control" name="senha" placeholder="Senha"/>

            <button type="submit" class="btn btn-primary"> Cadastrar</button>
        </form>
    </div>


</body>
</html>