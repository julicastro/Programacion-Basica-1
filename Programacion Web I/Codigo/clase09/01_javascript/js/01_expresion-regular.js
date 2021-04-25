var regexCampoNumerico=/^[0-9]+$/
var regexCampoTexto=/^[a-z][A-Z]+$/
var regexPatente=/^[A-Z]{3}[0-9]{3}$/
var regexEmail=/^[0-9a-zA-Z._.-]+\@[0-9a-zA-Z._.-]+\.[0-9a-zA-Z]+$/

function validar(){
    var error=false;
    var mensajesError="";
    if(!regexCampoNumerico.test(document.getElementById("numero").value)){
        error=true;
        mensajesError+="Tiene que ser un numero";
    }
    if(!regexEmail.test(document.getElementById("email").value)){
        error=true;
        mensajesError+="Tiene que ser un email valido";
    }

    if(error){
        /*mostrar los mensajes de error*/
        document.getElementById("mensaje").innerHTML=mensajesError;
        return false;
    }else{
        return true;
    }
}
