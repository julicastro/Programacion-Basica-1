$(document).ready(function(){
	actualizarTodo();
	
	/*-- Cambio de Personaje --*/
	$('input[type="radio"][name="personaje"]').change(function(){
		cambiarPersonajeEnEtiquetas();
	});
	
    /*-- Cambio de Color --*/
	$('input[type="radio"][name="color"]').change(function(){
		cambiarEstiloEtiquetas();
	});
    
	/*-- Cambio de Combo Etiquetas --*/
	$('input[type="radio"][name="tam"]').change(function(){
		cambiarCombo();
		cambiarEstiloEtiquetas();
	});
	
    /*-- Cambio de Nombre --*/
	$('#nombreInput').on('keyup', function(){
		actualizarNombre();
        cambiarTamanioLetra();
		curvarNyA();
	});
	
	/*-- Cambio de Apellido --*/
	$('#apellidoInput').on('keyup', function(){
		actualizarApellido();
        cambiarTamanioLetra();
		curvarNyA();
	});
    
    /*Pop UP*/
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

/*-- Funciones --*/
function actualizarTodo () {
	cambiarCombo();
	cambiarEstiloEtiquetas();
	actualizarNombre();
	actualizarApellido();
	cambiarTamanioLetra();
	curvarNyA();
}

function actualizarApellido () {
	var campoApellido = $('#apellidoInput').val();
			
	if (campoApellido === '') {
		campoApellido = 'Apellido';
	}

	$('#apellido').remove();
	$('#apellido1').remove();
	$('#apellido2').remove();
	$('#apellido3').remove();
	$('#spot').append('<p class="curvodos"><span id="apellido">' + campoApellido + '</span></p>');
	$('#maxi').append('<p class="curvodos"><span id="apellido1">' + campoApellido + '</span></p>');
	$('#mini').append('<p class="curvodos"><span id="apellido2">' + campoApellido + '</span></p>');
	$('#cinta').append('<p class="curvodos"><span id="apellido3">' + campoApellido + '</span></p>');
}

function actualizarNombre () {
	var campoNombre = $('#nombreInput').val();
			
	if (campoNombre === '') {
		campoNombre = 'Nombre';
	}
	
	$('#nombre').remove();
	$('#nombre1').remove();
	$('#nombre2').remove();
	$('#nombre3').remove();
	$('#spot').prepend('<p><span id="nombre">' + campoNombre + '</span></p>');
	$('#maxi').prepend('<p><span id="nombre1">' + campoNombre + '</span></p>');
	$('#mini').prepend('<p><span id="nombre2">' + campoNombre + '</span></p>');
	$('#cinta').prepend('<p><span id="nombre3">' + campoNombre + '</span></p>');
}

function cambiarCombo () {
	var rutaImagen = 'img/personajes/combo-';
	
	if ($('input[type="radio"][name="tam"]:checked').val() === 'jardin') {
		
		$('#mini').css('visibility', 'hidden');
		$('#descJardin').show();
		$('#descPrimaria').hide();
		
		var idPersonaje = $('input[type="radio"][name="personaje"]:checked').val();
		rutaImagen = rutaImagen.concat("jardin/").concat(idPersonaje).concat(".png");
		$('#vistaprevia img').attr('src', rutaImagen);
		
	} else if ($('input[type="radio"][name="tam"]:checked').val() === 'combo') {
		
		$('#mini').css('visibility', 'visible');
		$('#descJardin').hide();
		$('#descPrimaria').show();
		
		var idPersonaje = $('input[type="radio"][name="personaje"]:checked').val();
		rutaImagen = rutaImagen.concat("campamento/").concat(idPersonaje).concat(".png");
		$('#vistaprevia img').attr('src', rutaImagen);
		
	}
}

function cambiarEstiloEtiquetas () {
	var tamanioCombo = '';
	var colorEtiqueta = $('input[type="radio"][name="color"]:checked').val();
	
	if ($('input[type="radio"][name="tam"]:checked').val() === 'jardin') {
		tamanioCombo = 'jardin';
	} else if ($('input[type="radio"][name="tam"]:checked').val() === 'combo') {
		tamanioCombo = 'combo';
	} else {
		tamanioCombo = 'combo';
	}
	
	$('#vistaprevia').removeClass();
	$('#vistaprevia').addClass(tamanioCombo + colorEtiqueta);
	$('#vistaprevia').addClass(tamanioCombo);
}

function cambiarPersonajeEnEtiquetas () {
	var idPersonaje = $('input[type="radio"][name="personaje"]:checked').val();
	var tamanio = $('input[type="radio"][name="tam"]:checked').val();
	if (tamanio === 'jardin') {
		carpeta = 'combo-jardin';
	} else{
		carpeta = 'combo-campamento';
	}
	
	$('#vistaprevia img').remove();
	$('#vistaprevia h3').after('<img src="img/personajes/'+carpeta+ '/'+idPersonaje + '.png" />');
}

function cambiarTamanioLetra () {
	$('#nombre').removeClass('doce', 'normal');
	$('#apellido').removeClass('doce', 'normal');
	$('#nombre1').removeClass('doce', 'normal');
	$('#apellido1').removeClass('doce', 'normal');
	$('#nombre2').removeClass('doce', 'normal');
	$('#apellido2').removeClass('doce', 'normal');
	$('#nombre3').removeClass('doce', 'normal');
	$('#apellido3').removeClass('doce', 'normal');
	
	if ( ($('#nombreInput').val().length > 9) || ($('#apellidoInput').val().length > 9) ) {
		$('#nombre').addClass('doce');
		$('#apellido').addClass('doce');
		$('#nombre1').addClass('doce');
		$('#apellido1').addClass('doce');
		$('#nombre2').addClass('doce');
		$('#apellido2').addClass('doce');
		$('#nombre3').addClass('doce');
		$('#apellido3').addClass('doce');
	} else {
		$('#nombre').addClass('normal');
		$('#apellido').addClass('normal');
		$('#nombre1').addClass('normal');
		$('#apellido1').addClass('normal');
		$('#nombre2').addClass('normal');
		$('#apellido2').addClass('normal');
		$('#nombre3').addClass('normal');
		$('#apellido3').addClass('normal');
	}
}

function curvarNyA () {
	$('#nombre').arctext({radius: 45});
	$('#apellido').arctext({radius: 45, dir:-1});
}