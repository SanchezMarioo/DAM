let contador = 0;
let entra = false;
let numeroUsuario;
while(numeroUsuario != ""){
    numeroUsuario = Number(prompt("Dime el nombre del usuario: "));
}

if (!isNaN(numeroUsuario) && numeroUsuario % 2 === 0) {
  while (true) {
    entra = true;
    if (numeroUsuario % 2 === 0) {
      numeroUsuario /= 2;
    }
    contador++;
    if (numeroUsuario % 2 !== 0) {
      break;
    }
    if (numeroUsuario === 0) {
      break;
    }
  }
} else {
  let contraseña = Number(prompt("Introduzca una contraseña: "));
  if (contraseña === 1234) {
    document.writeln("Acceso correcto");
    console.log("Acceso correcto");
  } else {
    document.writeln("Acceso incorrecto");
    console.log("Acceso incorrecto");
  }
}
if (entra) {
  console.log(contador);
}
