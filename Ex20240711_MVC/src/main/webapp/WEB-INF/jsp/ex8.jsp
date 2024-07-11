<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ex8</title>
</head>
<body>
<!-- 	<form action="t9.inc" method="post"> -->
	<form action="t10.inc" method="post">
        <input type="hidden" name="c_idx" value="13"/>
        <input type="hidden" name="u_name" />
        <input type="text" name="unit"/><br/>
        <input type="checkbox" name="hobby" value="게임"><label>게임</label>
        &nbsp;
        <input type="checkbox" name="hobby" value="영화감상"><label>영화감상</label>
        &nbsp;
        <input type="checkbox" name="hobby" value="테니스"><label>테니스</label>
        &nbsp;
        <button type="button" onclick="ex8(this.form)">보내기</button>
    </form>

    <script>
        function ex8(ff){
            ff.u_name.value = "홍길동";

            ff.submit();
        }
    </script>
</body>
</html>