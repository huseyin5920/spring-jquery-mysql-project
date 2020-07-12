	/**
 * 
 */

$(document).ready(function(){
	$('.table .editButton').on('click',function(event){
		    event.preventDefault();
		var href=$(this).attr('href');
		$.get(href,function(student, status){
			$('#IdEdit').val(student.id);
			$('#nameEdit').val(student.name);
			$('#surnameEdit').val(student.surname);
			$('#numberEdit').val(student.number);

		})
		
		$('#editModal').modal();
	});
	
	$('.table .deleteButton').on('click',function(event){
		event.preventDefault();
		var href=$(this).attr('href');
		$('#deleteModal #deleteId').attr('href',href)
		$('#deleteModal').modal();
	});
	
});







