let numero1 = Number(prompt("Introduce el numero: "));
let numero2 = Number(prompt("Introduce el numero: "));
if (!isNaN(numero1) && !isNaN(numero2)) {
  document.writeln(
    "<p>" + numero1 + " + " + numero2 + " = " + (numero1 + numero2) + "</p>"
  );
  document.writeln(
    "<p>" + numero1 + " - " + numero2 + " = " + (numero1 - numero2) + "</p>"
  );
  document.write(
    "<p>" + numero1 + " * " + numero2 + " = " + numero1 * numero2 + "</p>"
  );
  document.write(
    "<p>" + numero1 + " / " + numero2 + " = " + numero1 / numero2 + "</p>"
  );
} else{
    document.writeln("<p>Esto no es un numero</p>")
}
