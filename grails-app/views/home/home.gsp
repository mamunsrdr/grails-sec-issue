<!doctype html>
<html lang="en">
<head>
    <meta name="layout" content="main"/>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Grails security issue</title>
</head>

<body>
    <div class="container">
        <h1><a href="/logout">Logout</a></h1>
        <h1>Congratulation, you've landed on a secure page</h1>

        <br>
        <span>This ajax url load should return 403 access denied, instead it redirects to ajaxSuccess</span>
        <h2><a href="javascript:void(0)" id="loadAction">Load /home/adminHome</a></h2>

        <br>
        <span>This ajax url load should return 404 not found, instead it redirects to ajaxSuccess</span>
        <h2><a href="javascript:void(0)" id="loadAction2">Load /unknownUrl404</a></h2>

        <br>
        <span>This ajax url load redirects to ajaxSuccess for remember me user after server restart because of successHandler.defaultTargetUrl in application.groovy</span>
        <h2><a href="javascript:void(0)" id="loadAction3">Load /home/userInfo</a></h2>

        <pre id="ajaxContent">Ajax content will load here</pre>
    </div>
</body>
</html>