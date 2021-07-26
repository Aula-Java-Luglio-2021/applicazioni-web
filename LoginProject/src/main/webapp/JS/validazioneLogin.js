/**
 * 
 */
function validazione() {
    let boolMail = true;
    let boolUser = true;
    let username = document.getElementById("username").value;
    let email = document.getElementById("email").value;
    regex = /^([a-zA-Z0-9_.-])+@([a-zA-Z0-9-]{2,})+\.([a-zA-Z0-9]{2,})+$/;
    regexUser =/^([a-z0-9_.-@$%@#§~])+$/;
    if (!email.match(regex)) {
        document.getElementById("email").style.backgroundColor = "red";
        document.getElementById("smallEmail").innerHTML = "Il pattern e-mail non è stato rispettato"
        boolMail = false;
    }
    if (!username.match(regexUser)) {
        document.getElementById("username").style.backgroundColor = "red";
        document.getElementById("smallUser").innerHTML = "Il pattern username non è stato rispettato"
        boolMail = false;
    }

    if(boolMail && boolUser){
    document.getElementById("form").submit();
    }
}