

    

// Função que muda cor de fundo
function mudaCor(){
    document.body.style.backgroundColor = 'blue';
    //console.log("Funciona");
  var gravarAqui = document.getElementById('conteudo');
  console.log(gravarAqui)

  gravarAqui.innerText = 'Cor alterada com sucessso';
  gravarAqui.style.color = 'red'

}
