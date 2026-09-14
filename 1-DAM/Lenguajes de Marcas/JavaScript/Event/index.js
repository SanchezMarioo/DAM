window.onload = function () {
  let btnContainer = document.getElementsByClassName("boton");
  for (let i = 0; i < btnContainer.length; i++) {
    btnContainer[i].addEventListener("click", targetBoton);
    
  }
};

function targetBoton(event) {
  let titulo = document.getElementById("titulo");
  titulo.innerHTML = "Has pulsado el boton: " + event.target.innerHTML;
  return;
}
