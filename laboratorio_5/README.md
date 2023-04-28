## ¿Qué diferencia existe entre navegar dentro de la aplicación utilizando Navigation Component o hacer uso de intents?
Navigation Component es para la navegación dentro de la aplicación, mientras que los intents son para la comunicación entre componentes de la aplicación y para abrir aplicaciones externas.

##  Menciona los componentes fundamentales de Navigation Component

Los componentes fundamentales de Navigation Component son:

1. Navigation Graph: Es un archivo XML que define la estructura de navegación de la aplicación, incluyendo los destinos, las acciones entre ellos y las transiciones animadas.

2. NavHost: Es un contenedor que muestra los destinos de navegación dentro de la aplicación, como fragmentos o actividades.

3. NavController: Es una clase que maneja la navegación entre los destinos definidos en el Navigation Graph. Permite navegar hacia adelante, hacia atrás y saltar a destinos específicos.

4. Destinos: Son los puntos finales de la navegación en la aplicación, como fragmentos o actividades.

5. Acciones: Son los enlaces entre destinos que definen cómo se navega de un destino a otro. Las acciones pueden tener argumentos para pasar datos entre destinos.

6. Argumentos: Son los datos que se pasan entre destinos a través de las acciones. Los argumentos se definen en el Navigation Graph y se pueden acceder en el código de la aplicación.

## Mencione algunas de las ventajas del Navigation Graph
Algunas de las ventajas del Navigation Graph en Navigation Component son:

1. Facilita la gestión de la navegación en la aplicación, permitiendo definir una estructura de navegación clara y coherente.

2. Ayuda a reducir el acoplamiento entre los componentes de la aplicación al manejar la navegación de manera centralizada.

3. Permite una transición de pantalla más suave y animada mediante la definición de transiciones y animaciones entre destinos.

4. Proporciona un mejor soporte para la navegación con una sola actividad, lo que puede mejorar el rendimiento y la experiencia del usuario.

5. Facilita el paso de argumentos entre destinos, lo que permite que los datos se pasen de manera segura y confiable entre los componentes de la aplicación.

6. Proporciona una vista visual de la estructura de navegación de la aplicación, lo que facilita la comprensión de la navegación y la depuración de problemas de navegación.
