<?php
// Database credentials
$servername = "sql313.infinityfree.com"; // Replace with your actual host
$username = "if0_38670396"; // Replace with your actual username
$password = "9DW3zrOTvFT"; // Replace with your actual password
$database = "if0_38670396_anupama_personal"; // Replace with your actual database name

// Create connection
$conn = new mysqli($servername, $username, $password, $database);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
?>
