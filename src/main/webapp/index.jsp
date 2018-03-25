<%@ page contentType="text/html; charset=utf-8"
								pageEncoding="UTF-8" %>
<html lang="ja">
<head>
<meta charset="utf-8">
 <title>テスト</title>
</head>
<body>
<h2>Hello World!</h2>
試験試験

    <%= request.getAttribute("foo") %>

    <form method="post" action="servlet/hello">
        何か入力して: <input type="text" name="param1">
        <button type="submit">送信</button>
    </form>

</body>
</html>
