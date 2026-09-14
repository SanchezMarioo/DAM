let nombre = prompt("Dime el nombre: ")
let numeroAsignaturas = Number(prompt("Dime el numero de asignaturas: "))
let asignaturas = [];
let sumaAsignatura = 0;
for (let i = 1; i <= numeroAsignaturas; i++) {
  let notaAsignaturas = Number(prompt("Dime el nombre de la asignatura: " + i))
  while(isNaN(notaAsignaturas)){
    notaAsignaturas = Number(prompt("Dime el nombre de la asignatura: " + i))
  }
  sumaAsignatura+=notaAsignaturas
  asignaturas[i] = notaAsignaturas
  
}
document.writeln(sumaAsignatura / numeroAsignaturas);