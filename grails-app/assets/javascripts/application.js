$(document).ready(function () {
    $('#loadAction').click(function () {
        $('#ajaxContent').load('/home/adminHome');
    });
    $('#loadAction2').click(function () {
        $('#ajaxContent').load('/unknownUrl404');
    });
    $('#loadAction3').click(function () {
        $('#ajaxContent').load('/home/userInfo');
    });
});