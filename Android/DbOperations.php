<?php
	class DbOperations{
		private $con;

		function __construct(){
			require_once dirname(__FILE__).'/DbConnect.php';

			$db = new DbConnect();

			$this->con = $db->connect();

		}

		function createRecord($year,$month,$day,$hour,$minute,$occupancy,$status,$slot_id){
			$stmt = $this->con->prepare("INSERT INTO `parkings_tracked` (`year`, `month`, `day`, `hour`, `minute`, `occupancy`, `status`, `slot_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);"
		);
			$stmt->bind_param("sss",$year,$month,$day,$hour,$minute,$occupancy,$status,$slot_id);
			if($stmt->execute()){
				return true;
			}else{
				return false;
			}
	}

		function queryRecord(){
			$stmt = $this->con->prepare('SELECT status FROM `parkings_tracked` WHERE slot_id = "A1" ORDER BY  cast(year as INT) DESC, cast(month as INT), cast(day as INT),cast(hour as INT) DESC, cast(minute as INT) DESC LIMIT 1 ');
			// $stmt->bind_param("i","2022");
			$stmt->execute();
			return $stmt->get_result()->fetch_assoc();
			// $stmt->store_result();
			// return $stmt->num_rows>0; 
		}


}