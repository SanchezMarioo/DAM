let img = document.getElementById("img");
img.addEventListener("click", cambiarColor);

function cambiarColor() {
  if (img.src.endsWith("img/imagenBN.jpg")) {
    img.src = "img/imagenColor.jpg";
  } else {
    img.src = "img/imagenBN.jpg";
  }
}
