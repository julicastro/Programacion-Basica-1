function validar(){
    var error=false;
    var mensajesError="";
    $("#mensaje").empty();
    $("#nombre").removeClass();
    $("#provincia").removeClass();
    if($("#nombre").val()==""){
        error=true;
        mensajesError+="<p>El campo nombre es obligatorio</p>";
        $("#nombre").addClass("error");
    }
    if(!($("input[name='sexo']").is(':checked'))){
        mensajesError+="<p>Indicá tu sexo</p>";
        error=true;
    }
    if(!$("#condiciones").is(":checked")){
        mensajesError+="<p>Aceptá las condiciones</p>";
        error=true;
    }
    if($("#provincia").val()==0){
        mensajesError+="<p>Selecciona una provincia</p>";
        error=true;
        $("#provincia").addClass("error");
    }
    if(error){
        $("#mensaje").append(mensajesError);
        return false;
    }else{
        return true;
    }
}
$(document).ready(function(){
    $("#form").submit(function(){
        return validar();
    });
    $("#nombre").keyup(function(){
        validar();
    });
    $("#provincia").change(function(){
        validar();
    });
});