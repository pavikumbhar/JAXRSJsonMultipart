<%-- 
    Document   : i
    Created on : Jul 23, 2016, 11:18:40 PM
    Author     : pavikumbhar
--%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Upload Files Test 2</title>
</head>
<body>
	<h2>Upload files</h2>
	<form action="rest/upload/files" enctype="multipart/form-data" method="post">
		Select multiple files<input type= "file" name="files" multiple /> <br/><br/>
		Select File<input type= "file" name="file2" /> <br/><br/>
		 First Name:<input name="firstName" maxlength="10"/> <br/><br/>
                 Last Name:<input name="lastName" maxlength="10"/> <br/><br/>
		<input type="submit" title="Save"/>
	</form>
</body>
</html>
