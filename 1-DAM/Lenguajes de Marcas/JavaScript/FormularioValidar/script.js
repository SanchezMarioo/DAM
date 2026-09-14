

window.onload = function () {
    let contador = 1;
    let main = document.getElementById("main");
    let form = document.getElementById("form");
    let url = document.getElementById("url");
    let textURL = document.getElementById("validarURL");
    let selectorColores = document.getElementById("colores");
    let cantidadText = document.getElementById("cantidadText");
    let cantidad = document.getElementById("cantidad");
    let btnRedirect = document.getElementById("redirect");
    let btnCambiarColor = document.getElementById("btnCambiarColor");
    console.log(btnRedirect)
    textURL.addEventListener("click", function () {
        if (!validarURL(url.value)) {
            url.classList.add("error");
        } else {
            url.classList.add("verde");
            url.classList.remove("rojo");
            url.disabled = true;
            btnRedirect.addEventListener("click", function () {
                if (validarURL(url.value)) {
                    console.log("entra")
                    redireccionURL(btnRedirect, url.value);
                }
            })
        }
    })

    cantidadText.addEventListener("click", function () {
        if (cantidad.value == -8) {
            console.log(contador)
            contador++;
        }
        if (contador == 4) {
            console.log(main)
            console.log("contador")
            main.classList.add("negro");
            form.classList.add("form")
        }
    })
    btnCambiarColor.addEventListener("click", function () {
        cambiarColor(main, selectorColores.value)
    });

}

function validarURL(url) {
    if ((url.endsWith("com") || url.endsWith("es")) && url.startsWith("www")) {
        return true;
    }
    return false;
}
function redireccionURL(btn, url) {
    btn.disabled = false;
    let urlParseada = "https://" + url;
    window.location.href = urlParseada;
}

function cambiarColor(main, color) {
    switch (color) {
        case "rojo":
            main.classList.add("rojo");
            main.classList.remove("blanco")
            main.classList.remove("azul")
            break;
        case "blanco":
            main.classList.add("blanco")
            main.classList.remove("rojo")
            main.classList.remove("azul")
            break;
        case "azul":
            main.classList.remove("blanco")
            main.classList.remove("rojo")
            main.classList.add("azul")
            break;
        default:
            break;
    }
}