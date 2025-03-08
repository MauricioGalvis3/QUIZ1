# 08 **Conversor de tiempo a formato texto**

**Instrucción:** Desarrolla un programa en Java que convierta una hora ingresada en formato numérico (HH:MM) a su representación textual en español. El programa debe:

1. Solicitar al usuario una hora en formato HH:MM (24 horas)
2. Validar que la entrada sea correcta (horas entre 00-23, minutos entre 00-59)
3. Convertir la hora a su representación textual según las siguientes reglas:
    - Para las horas en punto: "Son las [hora] en punto"
    - Para los cuartos: "Son las [hora] y cuarto" o "Son las [hora] menos cuarto"
    - Para las medias: "Son las [hora] y media"
    - Para el resto: "Son las [hora] y [minutos]" o "Son las [hora+1] menos [60-minutos]"
4. Manejar casos especiales como las 1:00 ("Es la una en punto") y 13:00 ("Es la una de la tarde en punto")

El programa debe utilizar condicionales para determinar la forma más natural de expresar la hora en español, eligiendo entre formato "y minutos" o "menos minutos" según lo que suene más natural.

Ejemplo:

- Si el usuario ingresa "14:15", el programa debe mostrar: "Son las dos y cuarto de la tarde"
- Si el usuario ingresa "23:50", el programa debe mostrar: "Son las doce menos diez de la noche"
- Si el usuario ingresa "09:30", el programa debe mostrar: "Son las nueve y media de la mañana"

1.Lo primero que hacemos es importar la libreria scanner la cual nos permite obtener entrada por teclado.
2.declaramos dos variables una para hora y otra para minutos, estas las nombramos "hora","minutos" , asi mismo ralizamos la comparacion de que estas cumplan con la condicion horaria 24h, para esta aplicamos un if con la condicion (hora<=23 && hora >=0 && minutos <=60 && minutos>=0 ) agregamos un switch case para asignar las horas en punto con cada horario de esta manera obtendriamos si la hora es mañana y tarde solo comparando en un formato 12 horas 