
 $('document').ready(function(){

   $('table #editButton').on('click' , function(event){
	      event.preventDefault();
	      
	      var href= $(this).attr('href') ;
	      
	      $.get(href , function(client , status ){
		$('#idEdit').val(client.id);
	    $('#nomEdit').val(client.nom);
		$('#prenomEdit').val(client.prenom);
		$('#date_naissEdit').val(client.date_naiss);
		$('#adresseEdit').val(client.adresse);
		$('#mailEdit').val(client.mail);
		$('#telEdit').val(client.tel);
		$('#code_postalEdit').val(client.code_postal);
		$('#fideliteEdit').val(client.fidelite);
		$('#ref_locEdit').val(client.ref_loc);
		$('#ref_livEdit').val(client.ref_liv);
		$('#ref_repEdit').val(client.ref_rep);
		$('#ref_venteEdit').val(client.ref_vente);
		
 	});

          $('#editModal').modal();

   });
   
   
   $('table #deleteButton').on('click' , function(event){
	event.preventDefault();
	var href=$(this).attr('href');
	$('#confirmeDeleteButton').attr('href' , href);
	$('#deleteModal').modal();
	
}) ;

});