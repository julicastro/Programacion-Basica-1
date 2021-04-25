function escribir(){
    var texto = document.getElementById("titulo");
    var escribir = document.getElementById("texto").value;
    texto.innerHTML=escribir;
}

$(document).ready(function() {
    $('#celeste').click(function(){
        $('#col2').css('background-color', 'lightblue');
        $('#col2').css('color', 'white');
    });
    $('#violeta').click(function(){
        $('#col2').css('background-color', 'violet');
        $('#col2').css('color', 'white');
    }); 
    $('#naranja').click(function(){
        $('#col2').css('background-color', 'orange');
        $('#col2').css('color', 'white');
    }); 
    $('#restablecer').click(function(){
        $('#col2').css('background-color', '#FFFFFF');
        $('#col2').css('color', 'black');
    });                      
});    


