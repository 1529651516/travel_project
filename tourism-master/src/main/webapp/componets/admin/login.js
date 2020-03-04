/*
$(function () {
    function login() {
        debugger;
        var username=$("#username").val();
        var password=$("#password").val();
        $.ajax(
            {
                url:"http://localhost:8089/tourism/admin/logincheck",
                type:"post",
                dataType: "json",
                async: false,
                data : {
                    username : username,
                    password:password
                },
                success: function (result) {
                    debugger;
                    if(result!=null ){
                        if(result!="成功"){
                            alert(result.msg);
                        }
                    }else{
                        window.location.href="../admin/index";
                    }
                },
                error: function () {
                    console.log("error!");
                }
            }
        )
    }
})*/
