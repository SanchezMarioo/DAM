window.onload = function () {
  let cuadradosContainer = document.getElementsByClassName("cuadrado");
  let numeros = [0, 0, 0, 0, 0, 0, 0, 0];
  let colores = ["rojo", "azul", "verde", "amarillo", "morado", "naranja"];
  for (let i = 0; i < cuadradosContainer.length; i++) {
    cuadradosContainer[i].addEventListener("click", function () {
      cambiarColor(i);
    });
  }
  function cambiarColor(i) {
    let cuadrado = document.getElementById("cuadrado" + i);
    quitarColores(cuadrado);
    cuadrado.classList.add(colores[numeros[i]]);
    numeros[i]++;
    if (numeros[i] === colores.length) {
      numeros[i] = 0;
    }
  }
  function quitarColores(cuadrado) {
    for (let k = 0; k < colores.length; k++) {
      cuadrado.classList.remove(colores[k]);
    }
  }
};
