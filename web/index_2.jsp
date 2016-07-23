<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jersey 2.x : File Upload</title>
</head>
<body>
    <center>
        <b>Jersey 2.x : JAX-RS Restful web service Learning</b>
 
<h4>Uploading files using JAX-RS Restful web service</h4>
 
 
<div style="width: 700px; border: 1px solid blue; padding: 20px; text-align: center;">
 
 
<form method="post" action="rest/gf/uploadFormDataParam" enctype="multipart/form-data">
 
<table align="center" border="1" bordercolor="black" cellpadding="0" cellspacing="0">
 
<tr>
 
<td>Select File 1 :</td>
 
 
<td><input type="file" name="uploadFile" size="100" /></td>
 
 </tr>
 
 <tr>
 
<td>first Name:</td>
 
 
<td><input type="text" name="firstName" size="30" /></td>
 
 </tr>
 <tr>
 <td>first Name:</td>
 
 
<td><input type="text" name="lastName" size="30" /></td>
 
 </tr>
 
<tr>
 
<td><input type="submit" value="Upload File" /></td>
 
 
<td><input type="reset" value="Reset" /></td>
 
                    </tr>
 
                </table>
 
            </form>
 
        </div>
 
    </center>
</body>