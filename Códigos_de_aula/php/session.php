<?php
include("conexao.php");

$nome = $_POST["nome"];
$email = $_POST["email"];
$senha = $_POST["senha"];
$foto = $_FILES["foto"];

$caminho_pasta = "fotoPerfil/*";

$caminho_arquivo = $caminho_pasta.$foto["name"];

move_uploaded_file($foto["tmp_name"], $caminho_arquivo);

mysqli_query($conexao, "INSERT INTO usuario (nome, email, senha, foto) VALUES ('$nome', '$email', '$senha', '$caminho_arquivo'); or die (mysql_error($conexao))");

?>