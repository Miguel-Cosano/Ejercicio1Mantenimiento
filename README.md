# Ejercicio1Mantenimiento

Para la realización de este ejercicio se han seguido las directrices indicadas por el profesor. Se han creado dos ramas una main y otra development. En la rama development se ha llevado a cabo el desarrollo y finalmente cuando tenía una versión testeada se ha hecho un merge del contenido de development en main.

Adjunto imagenes sobre el coverage:
![Coverage](https://user-images.githubusercontent.com/80314332/218810923-0e3f29ad-011c-43f8-bf73-de4baaa949b4.jpg)

Podemos observar que se cubre el 100% del codigo que contiene la clase Persona

Adjunto imagen del comando merge que se llevo a cabo para llevar el contenido de la rama development a la rama main:
![Merge en main de lo que habia en development](https://user-images.githubusercontent.com/80314332/218811252-88f1c382-fdb9-4245-b2a7-9bddb0a43b74.jpg)

Adjunto imagen del grafo de secuencia de commits:
![image](https://user-images.githubusercontent.com/80314332/219077524-337d81c4-21db-4b15-8ec6-0705cae7c451.png)


Aplicando lo visto en clase y en las practicas he añadido el plugin de jacoco para cercionarme de que se cumpla que cubre todo lo necesario, obteniendo el siguiente resultado:
![image](https://user-images.githubusercontent.com/80314332/219077045-977008f7-1725-4958-a982-f2cbf0796240.png)

Podemos observar que nuestros test cubren el 100% de los casos salvo en los get los cuales no necesitan ser testeados.

**Originalmente el respositorio fue iniciado de forma local en una rama llamada master , una vez subido a github el contenido de la rama master paso a la rama main y la rama master fue eliminada. Que es lo que podemos observar al princio del grafo.

