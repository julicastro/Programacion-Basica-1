$(document).ready(function(){
    $('#btnEnviar').click(function(){
       $(".spinner").show();
       setTimeout(function(){ 
            $(".spinner").hide();
			toastr.success("Todo perfecto!");
            Ladda.stopAll();
		},3000);
    });
	Ladda.bind( '.ladda-button', { timeout: 30000 } );
});