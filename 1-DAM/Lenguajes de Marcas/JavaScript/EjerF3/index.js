let datos = [1,2,3,4,5];
console.log(datos[6])


function arrayList(datos,numero){
    for (let index = 0; index < datos.length; index++) {
        if(datos[posicion] === numero){
            return true;
        }
        
    }
    return false;
}
console.log(arrayList(datos,1));
console.log(arrayList(datos,2));