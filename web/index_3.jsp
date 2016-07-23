<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pojo to Json Serialization using Jersey with Jackson for Java REST Services</title>
        
        <script src="<%=request.getContextPath() %>/js/jquery-1.11.2.min.js"></script>
        <script>
             var ctxPath = "<%=request.getContextPath() %>";
     $("form#data").submit(function(){
alert("rf");
    var formData = new FormData($(this)[0]);

    $.ajax({
        url: ctxPath+"rest/gf/uploadFormDataParam",
        type: 'POST',
        data: formData,
        async: false,
        success: function (data) {
            alert(data)
        },
        cache: false,
        contentType: false,
        processData: false
    });

    return false;
});
        </script>
                
   	</head>

	<body>
            <form id="data" method="post" enctype="multipart/form-data">
    <input type="text" name="firstName"  />
    <input type="text" name="lastName"  />
    <input name="uploadFile" type="file" />
    <button>Submit</button>
</form>
           
    </body>
    
</html>