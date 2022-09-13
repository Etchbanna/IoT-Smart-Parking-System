<?php 

require_once 'DbOperations.php';

$response = array(); 

if($_SERVER['REQUEST_METHOD']=='GET'){

		$db = new DbOperations(); 

			$user = $db->queryRecord();
			$response['error'] = false; 
			echo json_encode($user);
			// $response['year'] = $user['year'];
			// $response['month'] = $user['month'];
			// $response['day'] = $user['day'];
			// $response['year'] = $user['hour'];
			// $response['month'] = $user['minute'];
			// $response['day'] = $user['occupancy'];
			// $response['year'] = $user['status'];
			// $response['month'] = $user['slot_id'];




}
else{
	echo "FW";
}

echo json_encode($response);