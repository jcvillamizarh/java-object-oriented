================================================================================
APUNTES DE PROGRAMACIÓN ORIENTADA A OBJETOS.
================================================================================

- Clase: Es el model sobre el cual se construirá un objeto. Esta compuesta de propiedades, caracteristiscas y comportamientos

- Abstracción: Analizar objetos de forma independiente, sus propiedades, características y comportamientos, para abstraer su composición y generar un modelo.

================================================================================
MODULARIDAD
================================================================================
EN POO:
    - Requiere Abstracción
    - Incluye Encapsulamiento
    - Aplica Jerarquía
    - Incluye modularidad
    - Puede aplicar polimorfismo.

La modularidad permitirá: reutilizar código, evitar colapsos, que sea mantenible, la legibilidad y resolución de problemas.

================================================================================
Métodos static
================================================================================
Se puede usar en toda la clase
está definido por la palabra reservada static

Los métodos y variables estáticos nos ayudan a ejecutar o conseguir algún código desde clases no han sido instanciadas, ya que sus valores se guardan en la memoria de nuestro programa, no en diferentes objetos instanciados a través de una clase.

Las variables estáticas mantienen su valor durante todo el ciclo de vida de nuestro programa, por lo tanto, podemos alterar los valores de una variables estática desde una clase y consumir su valor alterado desde otra sin necesidad de conectar ambas clases.

También se puede importar los métodos estáticos de una clase para usarlos sin necesidad de escribir el nombre de la clase

import static java.lang.Math.*;

================================================================================


