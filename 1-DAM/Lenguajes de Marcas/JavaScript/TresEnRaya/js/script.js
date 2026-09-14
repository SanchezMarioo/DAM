let tablero = document.getElementsByClassName("tresRayaTablero");
let turnoTitulo;
let turno = "X";
let posiciones = ["", "", "", "", "", "", "", "", ""];
const jugador1 = "X";
const jugador2 = "O";
window.onload = function () {
  turnoTitulo = document.getElementById("tituloTurno");
  jugar();
  let btn = document.getElementById("btn-reinciar");
  btn.addEventListener("click", limpiarTablero);
};

function jugar() {
  let turnoTitulo = document.getElementById("tituloTurno");
  turno = cambiarTurno(turno);
  turnoTitulo.textContent = "Turno de " + turno;
  for (let i = 0; i < tablero.length; i++) {
    tablero[i].addEventListener("click", function () {
      if (!comprobarGanador() && tablero[i].textContent == "") {
        turnoTitulo.textContent = "Turno de " + turno;
        turno = cambiarTurno(turno);
        tablero[i].textContent = turno;
        posiciones[i] = turno;
        comprobarEmpate();
        comprobarGanador();
      }
    });
  }
}

function cambiarTurno(turno) {
  if (turno === "X") {
    return "O";
  } else if (turno === "O") {
    return "X";
  }
}
function limpiarTablero() {
  for (let i = 0; i < tablero.length; i++) {
    // Limpiar el tablero de texto
    tablero[i].textContent = "";
    // Quitamos lo verde en  caso de haber ganado
    tablero[i].classList.remove("verde");
    // Limpiamos el array
    posiciones = ["", "", "", "", "", "", "", "", ""];
  }
}
// En caso de estar lleno el tablero se da empate
function comprobarEmpate() {
  let turnoEmpate = document.getElementById("tituloTurno");
  for (let i = 0; i < posiciones.length; i++) {
    if (posiciones[i] == "") {
      return true;
    }
  }
  turnoEmpate.textContent = "El juego ha quedado empate.";
  return false;
}
function contatenarArray(posiciones, cadena) {
  console.log(posiciones);
  for (let i = 0; i < posiciones.length; i++) {
    if (tablero[posiciones[i]].textContent !== cadena) {
      console.log("falso")
      return false;
    }
  }
  return true;
}
function comprobarGanadorHorizontal() {
  let horizontales = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
  ];
  if (contatenarArray(horizontales[0], jugador1) || contatenarArray(horizontales[0], jugador2) ) {
    esGanador(horizontales[0]);
    return true;
  } else if (contatenarArray(horizontales[1], jugador1) ||contatenarArray(horizontales[1], jugador2)) {
    esGanador(horizontales[1]);
    return true;
  } else if ((contatenarArray(horizontales[2], jugador1) ||contatenarArray(horizontales[2], jugador2))) {
    esGanador(horizontales[2]);
    return true;
  }
  return false;
}
function comprobarGanadorVertical() {
  // Verticales
  let verticales = [
    [0, 3, 6], 
    [2, 5, 8],
    [1, 4, 7]
  ];
  if ((contatenarArray(verticales[0], jugador1) || contatenarArray(verticales[0], jugador2))) {
    esGanador(verticales[0]);
    return true;
  } else if ((contatenarArray(verticales[1], jugador1) || contatenarArray(verticales[1], jugador2))) {
    esGanador(verticales[1]);
    return true;
  } else if((contatenarArray(verticales[2], jugador1) || contatenarArray(verticales[2], jugador2)))  {
    esGanador(verticales[2]);
    return true;
  }
  return false;
}
function comprobarGanadorDiagonal() {
  let diagonales = [
    [0,4,8],
    [2,4,6]
  ]
  // Diagonales
  if ((contatenarArray(diagonales[0],jugador1) || (contatenarArray(diagonales[0],jugador2)))) {
    esGanador(diagonales[0]);
    return true;
  } else if ((contatenarArray(diagonales[1],jugador1) || (contatenarArray(diagonales[1],jugador2)))) {
    esGanador(diagonales[1]);
    return true;
  }
  return false;
}
function comprobarGanador() {
  if (
    comprobarGanadorHorizontal() ||
    comprobarGanadorVertical() ||
    comprobarGanadorDiagonal()
   ) {
    return true;
  }
  console.log("entra");
  return false;
}
function esGanador(posiciones) {
  console.log(posiciones)
  for (let i = 0; i < posiciones.length; i++) {
    console.log(tablero[posiciones[i]])
    tablero[posiciones[i]].classList.add("verde");
  }
  console.log(tablero[posiciones[0]].textContent)
  turnoTitulo.textContent =
    "Ha ganado el jugador " + tablero[posiciones[0]].textContent;
}
