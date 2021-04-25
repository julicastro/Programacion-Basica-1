$(document).ready(function(){
    /*selector de etiqueta*/
    $("h1").addClass("rojo");
    //$("h2").addClass("azul");
    //selector de clase
    $('.clase').addClass("azul");
    //selector de id
    $('#texto').hide();

    $("#nombre").keyup(function(){
        console.log($("#nombre").val());
    });
    $('input[name="lenguaje"]').change(function(){
        console.log($('input[name="lenguaje"]:checked').val());
    });

});