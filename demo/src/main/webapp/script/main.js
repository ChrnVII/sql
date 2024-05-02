
function preprocessPost(event) {
    event.preventDefault(); // 阻止默认的表单提交行为

    // 获取输入值
    var username = document.getElementById("username").value;
    var password = document.getElementById("password").value;

    // 对输入值进行预处理
    // 这里只是简单地打印输入值，你可以根据需求进行相应的处理
    console.log("Username: " + username);
    console.log("Password: " + password);

    // 构建新的 POST 请求
    var xhr = new XMLHttpRequest();
    xhr.open("POST", "login", true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

    // 将预处理后的数据作为请求体发送到服务器
    var requestBody = "username=" + encodeURIComponent(username) + "&password=" + encodeURIComponent(password);
    xhr.send(requestBody);
}
