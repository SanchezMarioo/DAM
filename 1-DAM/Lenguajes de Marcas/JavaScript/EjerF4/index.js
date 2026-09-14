
let matriz = [
    [1,2,3],
    [4,5,6],
    [7,8,9]
]


function sumarMatriz(matriz){
    let suma = 0;
    for (let index = 0; index < matriz.length; index++) {
        for (let j = 0; j < matriz[index].length; j++) {
            suma+=matriz[index][j]
            
        }
        
    }
    return suma;
}
console.log(matriz)
console.log(sumarMatriz(matriz))