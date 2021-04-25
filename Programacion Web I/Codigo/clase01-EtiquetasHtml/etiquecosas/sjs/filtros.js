$(document).ready(function(){
	$('input[type="radio"][name="filtro"]').change(function(){
		if ($(this).val() === 'nena') {
			$('#nena').show();
			$('#varon').hide();
		} else if ($(this).val() === 'varon') {
			$('#nena').hide();
			$('#varon').show();
		} else if ($(this).val() === 'todos') {
			$('#nena').show();
			$('#varon').show();
		}
	});
    
    /*Funcion filtro personajes*/
    $('input[type="radio"][name="filtroper"]').change(function(){
		if ($(this).val() === 'nena') {
			$('.pernena').show();
			$('.pernene').hide();
            $('.perfutbol').hide();
            $('.pernenfut').hide();
            $('.peralergia').hide();
            $('.perambos').show();
		} else if ($(this).val() === 'varon') {
			$('.pernena').hide();
            $('.pernenfut').show();
			$('.pernene').show();
            $('.perfutbol').hide();
            $('.perambos').show();
            $('.peralergia').hide();
		} else if ($(this).val() === 'futbol') {
			$('.perfutbol').show();
            $('.pernenfut').show();
            $('.pernena').hide();
			$('.pernene').hide();
            $('.perambos').hide();
            $('.peralergia').hide();
        } else if ($(this).val() === 'alergia') {
			$('.perfutbol').hide();
            $('.pernenfut').hide();
            $('.pernena').hide();
			$('.pernene').hide();
            $('.perambos').hide();
            $('.peralergia').show();
		}else if ($(this).val() === 'todos') {
			$('.pernena').show();
			$('.pernene').show();
            $('.perfutbol').show();
            $('.perambos').show();
            $('.pernenfut').show();
            $('.peralergia').show();
		}
	});
});