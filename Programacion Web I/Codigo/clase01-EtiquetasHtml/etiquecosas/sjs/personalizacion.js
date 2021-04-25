$(document).ready(function(){
	$('#nombre').arctext({radius: 80});
	$('#apellido').arctext({radius: 80, dir:-1});
	
    
	$('input[type="radio"][name="personaje"], input[type="radio"][name="tam"]').change(function(){
		var tamanio = $('input[type="radio"][name="tam"]:checked').val();
		var idPersonaje = $('input[type="radio"][name="personaje"]:checked').val();
		
		$('#vistaprevia img').remove();
		$('#vistaprevia h3').after('<img src="img/personajes/' + tamanio + idPersonaje + '.png" />');
	});
	
	$('input[type="radio"][name="color"], input[type="radio"][name="tam"]').change(function(){
		var tamanio = $('input[type="radio"][name="tam"]:checked').val();
		var color = $('input[type="radio"][name="color"]:checked').val();
		
		$('#vistaprevia').removeClass();
		$('#vistaprevia').addClass(tamanio + color);
		$('#vistaprevia').addClass(tamanio);
		
		var campoNombre = $('#nombreInput').val();
		if (campoNombre === '') {
			campoNombre = 'Nombre';
		}
		$('#nombre').remove();
		$('#texto').prepend('<p><span id="nombre">' + campoNombre + '</span></p>');
		
		var campoApellido = $('#apellidoInput').val();
		if (campoApellido === '') {
			campoApellido = 'Apellido';
		}
		$('#apellido').remove();
		$('#texto').append('<p class="curvodos"><span id="apellido">' + campoApellido + '</span></p>');
		
		$('#nombre').removeClass('doce', 'normal');
		$('#apellido').removeClass('doce', 'normal');
		
		if (($('#nombreInput').val().length > 9) || ($('#apellidoInput').val().length > 9)) {
			$('#nombre').addClass('doce');
            $('#apellido').addClass('doce');
		} else {
			$('#nombre').addClass('normal');
            $('#apellido').addClass('normal');
		}
        $('.spot #nombre').arctext({radius: 80});
        $('.spot #apellido').arctext({radius: 80, dir: -1});
	});
	$('#nombreInput, #apellidoInput').on('keyup', function(){
		if ($(this).attr('id') === 'nombreInput') {
			var campoNombre = $(this).val();
			if (campoNombre === '') {
				campoNombre = 'Nombre';
			}
			$('#nombre').remove();
			$('#texto').prepend('<p><span id="nombre">' + campoNombre + '</span></p>');
		} else if ($(this).attr('id') === 'apellidoInput') {
			var campoApellido = $(this).val();
			if (campoApellido === '') {
				campoApellido = 'Apellido';
			}
			$('#apellido').remove();
			$('#texto').append('<p class="curvodos"><span id="apellido">' + campoApellido + '</span></p>');
		}
		
		$('#nombre').removeClass('doce', 'normal');
		$('#apellido').removeClass('doce', 'normal');
        if (($('#nombreInput').val().length > 9) || ($('#apellidoInput').val().length > 9)) {
			$('#nombre').addClass('doce');
            $('#apellido').addClass('doce');
		} else {
			$('#nombre').addClass('normal');
            $('#apellido').addClass('normal');
		}
		
		if ($('input[type="radio"][name="tam"]:checked').val() === 'spot') {
			$('#nombre').arctext({radius: 80});
			$('#apellido').arctext({radius: 80, dir: -1});
		}
	});
    
    $('.image-link').magnificPopup({type:'image'});
        $('.open-popup-link').magnificPopup({
          type:'inline',
          midClick: true,
          focus: 'input[type="radio"][name="personaje"]:checked'
    });
    $('#cerrar').click(function(){
        $.magnificPopup.close();
    });
    $('.white-popup').on('keypress', function (event) {
         if(event.which === 13){

            //Disable textbox to prevent multiple submit
            $.magnificPopup.close();

            //Do Stuff, submit, etc..
         }
   });
});