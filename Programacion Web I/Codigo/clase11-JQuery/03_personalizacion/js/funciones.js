$(document).ready(function(){
    $("input[name='fondo']").change(function(){
        $(".vista-previa").removeClass("fondo1 fondo2 fondo3");
        switch($(this).val()){
            case '1':
                $(".vista-previa").addClass("fondo1");
            break;
            case '2':
                $(".vista-previa").addClass("fondo2");
            break;
            case '3':
                $(".vista-previa").addClass("fondo3");
            break;
        }
    });
    $("#nombre").keyup(function(){
        $("#texto").text($(this).val());
    });
    $("input[name='color']").change(function(){
        $("#texto").removeClass("blanco negro");
        $("#texto").addClass($(this).val());
    });
    $("#tipografia").change(function(){
        $("#texto").removeClass("roboto yanone");
        $("#texto").addClass('fuente-'+$(this).val());
    });
});