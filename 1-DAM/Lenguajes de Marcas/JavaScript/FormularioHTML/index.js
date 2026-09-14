let esCorrecto;
let registro = document.getElementById("registro");

registro.addEventListener("click", error);
function error() {
  let email = document.getElementById("email");
  let nombre = document.getElementById("nombre");
  let contrasena = document.getElementById("password");
  let container = document.getElementById("form-container");
  let char = "@";
  let punto = ".";
  esCorrecto = true;

  if (nombre.value.length < 4) {
    esCorrecto = false;
    nombre.classList.add("error");
  }
  if (!email.value.includes(char) || !email.value.includes(punto)) {
    email.classList.add("error");
    esCorrecto = false;
  }
  if (contrasena.value !== "1234") {
    contrasena.classList.add("error");
    esCorrecto = false;
  }
  if (esCorrecto) {
    container.style.display = "none";
  }
}
