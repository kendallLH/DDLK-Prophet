<?php
	mysql_connect("fa16-cs411-20.cs.illinois.edu", "root", "cs411fa2016");
	mysql_select_db("imdb");

	$q = mysql_query("SELECT name FROM `aka_name` WHERE name like "%Depp%");
	while($e = mysql_fetch_assoc($q))
		$output[] = $e;

	print(json_encode($output));

	mysql_close();
	?>
