<?php 

require_once 'DbOperations.php';

$response = array(); 
if($_SERVER['REQUEST_METHOD']=='POST'){
	if(
		isset($_POST['year']) and 
			isset($_POST['month']) and 
				isset($_POST['day']) and
					isset($_POST['hour']) and
						isset($_POST['minute']) and
							isset($_POST['occupancy']) and
								isset($_POST['status'])  and
									isset($_POST['slot_id']))
		{
		//operate the data further 

		$db = new DbOperations(); 

		$result = $db->createRecord( $_POST['year'],
									$_POST['month'],
									$_POST['day'],
									$_POST['hour'],
									$_POST['minute'],
									$_POST['occupancy'],
									$_POST['status'],
									$_POST['slot_id'],
								);
		if($result == 1){
			$response['error'] = false; 
			$response['message'] = "User registered successfully";
		}elseif($result == 2){
			$response['error'] = true; 
			$response['message'] = "Some error occurred please try again";			
		}elseif($result == 0){
			$response['error'] = true; 
			$response['message'] = "It seems you are already registered, please choose a different email and username";						
		}

	}else{
		$response['error'] = true; 
		$response['message'] = "Required fields are missing";
	}
}else{
	$response['error'] = true; 
	$response['message'] = "Invalid Request";
}

echo json_encode($response);